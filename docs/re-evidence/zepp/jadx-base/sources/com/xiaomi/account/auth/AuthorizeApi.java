package com.xiaomi.account.auth;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class AuthorizeApi {
    private static final int CONNECTION_TIMEOUT = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_TIMEOUT = 15000;
    private static final String UTF8 = "UTF-8";
    private static final String HOST = XiaomiOAuthConstants.OAUTH2_API_HOST;
    private static final String OAUTH_URL_BASE = XiaomiOAuthConstants.OAUTH2_API_URL_BASE;

    private static void closeQuietly(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static String doHttpGet(Context context, String str, long j, String str2) throws XMAuthericationException {
        return doHttpGet(str, j, str2, null, null);
    }

    private static HashMap<String, String> makeHeaders(String str, String str2, String str3, String str4, Map<String, String> map) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        if (str3 == null && str4 == null) {
            return null;
        }
        String strGenerateNonce = AuthorizeHelper.generateNonce();
        return AuthorizeHelper.buildMacRequestHead(str2, strGenerateNonce, AuthorizeHelper.getMacAccessTokenSignatureString(strGenerateNonce, "GET", HOST, str, map, str3, str4));
    }

    public static String doHttpGet(String str, long j, String str2) throws XMAuthericationException {
        return doHttpGet(str, j, str2, null, null);
    }

    @Deprecated
    public static String doHttpGet(Context context, String str, long j, String str2, String str3, String str4) throws XMAuthericationException {
        return doHttpGet(str, j, str2, str3, str4);
    }

    public static String doHttpGet(String str, long j, String str2, String str3, String str4) throws Throwable {
        InputStream errorStream;
        HashMap map = new HashMap();
        map.put("clientId", String.valueOf(j));
        map.put("token", str2);
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    URL url = new URL(AuthorizeHelper.generateUrl(OAUTH_URL_BASE + str, map));
                    HttpURLConnection.setFollowRedirects(true);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(15000);
                    HashMap<String, String> mapMakeHeaders = makeHeaders(str, str2, str3, str4, map);
                    if (mapMakeHeaders != null) {
                        for (String str5 : mapMakeHeaders.keySet()) {
                            httpURLConnection.setRequestProperty(str5, mapMakeHeaders.get(str5));
                        }
                    }
                    httpURLConnection.connect();
                    try {
                        errorStream = httpURLConnection.getInputStream();
                    } catch (IOException unused) {
                        errorStream = httpURLConnection.getErrorStream();
                    }
                    if (errorStream != null) {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream), 1024);
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader2.readLine();
                                if (line != null) {
                                    sb.append(line);
                                } else {
                                    String string = sb.toString();
                                    closeQuietly(bufferedReader2);
                                    return string;
                                }
                            }
                        } catch (UnsupportedEncodingException e) {
                            e = e;
                            throw new XMAuthericationException(e);
                        } catch (IOException e2) {
                            e = e2;
                            throw new XMAuthericationException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new XMAuthericationException(e);
                        } catch (NoSuchAlgorithmException e4) {
                            e = e4;
                            throw new XMAuthericationException(e);
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            closeQuietly(bufferedReader);
                            throw th;
                        }
                    } else {
                        throw new XMAuthericationException(new IOException());
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (UnsupportedEncodingException e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (InvalidKeyException e7) {
            e = e7;
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
        }
    }
}
