package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public final class sis {

    public static class a implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33688a;

        public a(String str) {
            this.f33688a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws UnknownHostException {
            for (InetAddress inetAddress : InetAddress.getAllByName(this.f33688a)) {
                if (sis.c(inetAddress.getHostAddress())) {
                    return inetAddress.getHostAddress();
                }
            }
            return null;
        }
    }

    public static String a(String str, int i) {
        String string;
        StringBuilder sb;
        String str2;
        Future futureSubmit = ues.f35695a.submit(new a(str));
        try {
            return (String) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "interrupted:";
            sb.append(str2);
            sb.append(wpe.o(e));
            string = sb.toString();
            wpe.e("NetworkUtils", string);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "execution:";
            sb.append(str2);
            sb.append(wpe.o(e));
            string = sb.toString();
            wpe.e("NetworkUtils", string);
            return null;
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            string = "timeout:" + wpe.o(e3);
            wpe.e("NetworkUtils", string);
            return null;
        }
    }

    public static String b(String str, Map<String, String> map) throws IOException {
        InputStreamReader inputStreamReader;
        StringBuffer stringBuffer = new StringBuffer();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (map != null) {
            for (String str2 : map.keySet()) {
                httpURLConnection.setRequestProperty(str2, map.get(str2));
                wpe.h("NetworkUtils", "header:" + str2 + "," + map.get(str2));
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

    public static boolean c(String str) {
        return str.matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$");
    }
}
