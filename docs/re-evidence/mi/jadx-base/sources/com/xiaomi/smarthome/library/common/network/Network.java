package com.xiaomi.smarthome.library.common.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class Network {
    public static final String CMWAP_GATEWAY = "10.0.0.172";
    public static final String CMWAP_HEADER_HOST_KEY = "X-Online-Host";
    public static final int CMWAP_PORT = 80;
    public static final int CONNECTION_TIMEOUT = 10000;
    private static final String LogTag = "common.Network";
    public static final String NETWORK_TYPE_3GNET = "3gnet";
    public static final String NETWORK_TYPE_3GWAP = "3gwap";
    public static final String NETWORK_TYPE_CHINATELECOM = "#777";
    public static final String NETWORK_TYPE_WIFI = "wifi";
    public static final int READ_TIMEOUT = 15000;
    public static final String RESPONSE_BODY = "RESPONSE_BODY";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String USER_AGENT = "User-Agent";
    public static final String UserAgent_PC_Chrome = "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.464.0 Safari/534.3";
    public static final String UserAgent_PC_Chrome_6_0_464_0 = "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US) AppleWebKit/534.3 (KHTML, like Gecko) Chrome/6.0.464.0 Safari/534.3";
    public static final Pattern ContentTypePattern_MimeType = Pattern.compile("([^\\s;]+)(.*)");
    public static final Pattern ContentTypePattern_Charset = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);
    public static final Pattern ContentTypePattern_XmlEncoding = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static final class DoneHandlerInputStream extends FilterInputStream {
        private boolean done;

        public DoneHandlerInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            if (!this.done && (i3 = super.read(bArr, i, i2)) != -1) {
                return i3;
            }
            this.done = true;
            return -1;
        }
    }

    public static class HttpHeaderInfo {
        public Map<String, String> AllHeaders;
        public String ContentType;
        public int ResponseCode;
        public String UserAgent;
        public String realUrl;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.ResponseCode), this.AllHeaders.toString());
        }
    }

    public static boolean downloadFile(String str, OutputStream outputStream) {
        return downloadFile(str, outputStream, false, null);
    }

    public static int getActiveNetworkType(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static String getCMWapUrl(URL url) {
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append(CMWAP_GATEWAY);
        sb.append(url.getPath());
        if (!TextUtils.isEmpty(url.getQuery())) {
            sb.append("?");
            sb.append(url.getQuery());
        }
        return sb.toString();
    }

    public static HttpURLConnection getHttpUrlConnection(Context context, URL url) throws IOException {
        if (isCtwap(context)) {
            return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80)));
        }
        if (!isCmwap(context)) {
            return (HttpURLConnection) url.openConnection();
        }
        String host = url.getHost();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(getCMWapUrl(url)).openConnection();
        httpURLConnection.addRequestProperty(CMWAP_HEADER_HOST_KEY, host);
        return httpURLConnection;
    }

    public static boolean hasNetwork(Context context) {
        return getActiveNetworkType(context) >= 0;
    }

    public static boolean is4G(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType() == 13;
    }

    public static boolean is5G(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType() == 20;
    }

    public static boolean isCmwap(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (!ServerConstants.NEW_CN_COUNTRY_CODE.equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso()) || (connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && !extraInfo.contains("ctwap") && extraInfo.regionMatches(true, extraInfo.length() + (-3), "wap", 0, 3);
    }

    public static boolean isCtwap(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (!ServerConstants.NEW_CN_COUNTRY_CODE.equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso()) || (connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && extraInfo.contains("ctwap");
    }

    public static boolean isWifi(Context context) {
        return getActiveNetworkType(context) == 1;
    }

    public static boolean downloadFile(String str, OutputStream outputStream, boolean z, Context context) {
        boolean z2 = false;
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(15000);
                HttpURLConnection.setFollowRedirects(true);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    if (z && context != null && !isWifi(context)) {
                        z2 = true;
                        break;
                    }
                }
                boolean z3 = !z2;
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return z3;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error while download file");
                sb.append(e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                }
            }
            if (outputStream == null) {
                throw th;
            }
            try {
                outputStream.close();
                throw th;
            } catch (IOException unused6) {
                throw th;
            }
        }
    }

    public static boolean downloadFile(String str, OutputStream outputStream, Context context) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str);
            if (isCmwap(context)) {
                HttpURLConnection.setFollowRedirects(false);
                String cMWapUrl = getCMWapUrl(url);
                String host = url.getHost();
                httpURLConnection = (HttpURLConnection) new URL(cMWapUrl).openConnection();
                httpURLConnection.setRequestProperty(CMWAP_HEADER_HOST_KEY, host);
                int responseCode = httpURLConnection.getResponseCode();
                while (responseCode >= 300 && responseCode < 400) {
                    String headerField = httpURLConnection.getHeaderField("location");
                    if (TextUtils.isEmpty(headerField)) {
                        break;
                    }
                    URL url2 = new URL(headerField);
                    String cMWapUrl2 = getCMWapUrl(url2);
                    String host2 = url2.getHost();
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(cMWapUrl2).openConnection();
                    httpURLConnection2.setRequestProperty(CMWAP_HEADER_HOST_KEY, host2);
                    responseCode = httpURLConnection2.getResponseCode();
                    httpURLConnection = httpURLConnection2;
                }
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                HttpURLConnection.setFollowRedirects(true);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    outputStream.write(bArr, 0, i);
                } else {
                    inputStream.close();
                    outputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error while download file");
            sb.append(e);
            return false;
        }
    }
}
