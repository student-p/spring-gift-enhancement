package gift.dto;

public class UserLogin {

    public static class Request {

        private String email;
        private String password;

        public Request(){}

        public Request(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPassword() {
            return this.password;
        }

    }

    public static class Response {

        private String accessToken;

        public Response(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

    }

    public static class BadResponse {
        private String message;

        public BadResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

    }
}