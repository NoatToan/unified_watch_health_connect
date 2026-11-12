package net.openid.appauth;

import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface ClientAuthentication {
    Map<String, String> getRequestHeaders(String str);

    Map<String, String> getRequestParameters(String str);

    public static class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43045b;

        public c(String str) {
            super("Unsupported client authentication method: " + str);
            this.f43045b = str;
        }
    }
}
