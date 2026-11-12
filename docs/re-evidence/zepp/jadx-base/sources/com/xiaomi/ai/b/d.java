package com.xiaomi.ai.b;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xiaomi.ai.log.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes18.dex */
public final class d {
    public static String a(final String str, int i) {
        String string;
        StringBuilder sb;
        String str2;
        Future futureSubmit = c.a.submit(new Callable<String>() { // from class: com.xiaomi.ai.b.d.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() throws UnknownHostException {
                for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
                    if (d.a(inetAddress.getHostAddress())) {
                        return inetAddress.getHostAddress();
                    }
                }
                return null;
            }
        });
        try {
            return (String) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "interrupted:";
            sb.append(str2);
            sb.append(Logger.throwableToString(e));
            string = sb.toString();
            Logger.d("NetworkUtils", string);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "execution:";
            sb.append(str2);
            sb.append(Logger.throwableToString(e));
            string = sb.toString();
            Logger.d("NetworkUtils", string);
            return null;
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            string = "timeout:" + Logger.throwableToString(e3);
            Logger.d("NetworkUtils", string);
            return null;
        }
    }

    public static String a(String str, Map<String, String> map) throws IOException {
        InputStreamReader inputStreamReader;
        StringBuffer stringBuffer = new StringBuffer();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (map != null) {
            for (String str2 : map.keySet()) {
                httpURLConnection.setRequestProperty(str2, map.get(str2));
                Logger.b("NetworkUtils", "header:" + str2 + "," + map.get(str2));
            }
        }
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() != 200) {
            inputStreamReader = new InputStreamReader(httpURLConnection.getErrorStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line + "\n");
            }
        } else {
            inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 == null) {
                    break;
                }
                stringBuffer.append(line2 + "\n");
            }
        }
        inputStreamReader.close();
        return stringBuffer.toString();
    }

    public static boolean a(String str) {
        return str.matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");
    }
}
