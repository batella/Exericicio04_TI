
    class exercicio4_TI
    {
        
        private const string ApiKey = "ea15dbd705f14c51a581b79c9e7d978e";

        
        private const string ServiceEndpoint = "https://exercicioti2-caiobatella.cognitiveservices.azure.com/"; 

        static void Main(string[] args)
        {



            // Initialize Personalizer client.
            PersonalizerClient client = InitializePersonalizerClient(ServiceEndpoint);


            Simulator sim = new Simulator(client);
            sim.SimulateEvents(100);
 


        }

        /// <summary>
        /// Initializes the personalizer client.
        /// </summary>
        /// <param name="url">Azure endpoint</param>
        /// <returns>Personalizer client instance</returns>
        static PersonalizerClient InitializePersonalizerClient(string url)
        {
            PersonalizerClient client = new PersonalizerClient(
                new ApiKeyServiceClientCredentials(ApiKey))
            { Endpoint = url };

            return client;
        }


    }
}