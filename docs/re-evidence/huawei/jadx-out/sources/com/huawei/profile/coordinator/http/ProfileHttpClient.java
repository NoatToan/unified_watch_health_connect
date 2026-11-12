package com.huawei.profile.coordinator.http;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.coordinator.exception.ProfileRequestException;
import com.huawei.profile.coordinator.exception.ProfileRequestExceptionType;
import com.huawei.profile.utils.AnonymousUtil;
import com.huawei.profile.utils.ClassUtil;
import com.huawei.profile.utils.SensitiveUtil;
import com.huawei.profile.utils.file.FileUtils;
import com.huawei.profile.utils.logger.DsLog;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes15.dex */
public class ProfileHttpClient {
    private static final int BUFFER_SIZE = 1024;
    private static final int CONNECT_TIME_OUT = 10000;
    private static final String CR = "\r";
    private static final int END_OF_STREAM = -1;
    private static final String LF = "\n";
    private static final int MAX_DATA_TRAFFIC_SIZE = 1000000;
    private static final int READ_TIME_OUT = 10000;
    private static final String TAG = "ProfileHttpClient";
    private ProfileResponseCallback callback;
    private String requestBody;
    private String requestMethod;
    private String urlStr;
    private int successCode = 200;
    private Map<String, String> headerMap = new HashMap();

    public int getConnectTimeout() {
        return 10000;
    }

    public int getReadTimeout() {
        return 10000;
    }

    public ProfileHttpClient(Context context) {
    }

    public ProfileHttpClient setUrl(String str) {
        this.urlStr = str;
        return this;
    }

    public ProfileHttpClient setRequestBody(String str) {
        this.requestBody = str;
        return this;
    }

    public ProfileHttpClient addItemToHeaderMap(String str, String str2) {
        if (!TextUtils.isEmpty(checkHeader(str)) && !TextUtils.isEmpty(checkHeader(str2))) {
            this.headerMap.put(str, str2);
        }
        return this;
    }

    public ProfileHttpClient setRequestMethod(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.requestMethod = str;
        }
        return this;
    }

    public ProfileHttpClient setSuccessCode(int i) {
        this.successCode = i;
        return this;
    }

    public ProfileHttpClient setRequestBodyCallback(ProfileResponseCallback profileResponseCallback) {
        this.callback = profileResponseCallback;
        return this;
    }

    public ProfileHttpClient requestForResponseBody() throws ProfileRequestException {
        ProfileHttpResponse profileHttpResponseConnectCloud = connectCloud(initConnection());
        if (this.callback == null) {
            throw new ProfileRequestException(ProfileRequestExceptionType.INPUT_PARAM_INVALID, "ProfileResponseCallback is null");
        }
        if (this.successCode == profileHttpResponseConnectCloud.getResponseCode()) {
            this.callback.onSuccess(profileHttpResponseConnectCloud.getResponseBody());
            return this;
        }
        this.callback.onFailure(profileHttpResponseConnectCloud.getResponseCode(), profileHttpResponseConnectCloud);
        return this;
    }

    private HttpsURLConnection initConnection() throws Throwable {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ClassUtil.cast(generateUrlConnection(), HttpsURLConnection.class);
        if (httpsURLConnection == null) {
            throw new ProfileRequestException(ProfileRequestExceptionType.INPUT_PARAM_INVALID, "connection is null");
        }
        httpsURLConnection.setSSLSocketFactory(ProfileSslSocketFactory.getSocketFactory());
        try {
            httpsURLConnection.setRequestMethod(this.requestMethod);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            for (Map.Entry<String, String> entry : this.headerMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                DsLog.dt(TAG, "header key = " + key + " value = " + AnonymousUtil.anonymousContent(value), new Object[0]);
                httpsURLConnection.setRequestProperty(checkHeader(key), checkHeader(value));
            }
            String str = this.requestMethod;
            if (str == null) {
                throw new ProfileRequestException(ProfileRequestExceptionType.INPUT_PARAM_INVALID, "requestMethod is null");
            }
            if (!str.equals("POST") && !this.requestMethod.equals(ProfileRequestConstants.PUT_TYPE)) {
                return httpsURLConnection;
            }
            addPostRequestBody(httpsURLConnection);
            return httpsURLConnection;
        } catch (ProtocolException e) {
            throw new ProfileRequestException(ProfileRequestExceptionType.IO_EXCEPTION, e.getMessage());
        }
    }

    private ProfileHttpResponse connectCloud(HttpURLConnection httpURLConnection) throws ProfileRequestException {
        ProfileHttpResponse profileHttpResponse = new ProfileHttpResponse();
        try {
            try {
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    throw new ProfileRequestException(ProfileRequestExceptionType.UNEXPECTED_NULL_POINTER, "response message is empty");
                }
                int responseCode = httpURLConnection.getResponseCode();
                InputStream responseStream = getResponseStream(responseCode, httpURLConnection);
                if (responseStream == null) {
                    throw new ProfileRequestException(ProfileRequestExceptionType.UNEXPECTED_NULL_POINTER, "inputStream is empty");
                }
                if (!isContentLengthValid(httpURLConnection.getHeaderFields())) {
                    throw new ProfileRequestException(ProfileRequestExceptionType.CONTENT_LENGTH_INVALID, "content length might be too long");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int i = responseStream.read(bArr);
                    if (i == -1) {
                        profileHttpResponse.setDownloadLength(j);
                        String string = byteArrayOutputStream.toString("UTF-8");
                        profileHttpResponse.setResponseCode(responseCode);
                        profileHttpResponse.setResponseMessage(responseMessage);
                        profileHttpResponse.setResponseBody(string);
                        FileUtils.closeCloseable(responseStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return profileHttpResponse;
                    }
                    j += (long) i;
                    if (j > 1000000) {
                        throw new ProfileRequestException(ProfileRequestExceptionType.DATA_TRAFFIC_OVERSIZE, "max length = 1000000 actual length = " + j);
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                throw ioExceptionFilter(e);
            }
        } catch (Throwable th) {
            FileUtils.closeCloseable(null);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private InputStream getResponseStream(int i, HttpURLConnection httpURLConnection) throws IOException {
        if (i != this.successCode) {
            return httpURLConnection.getErrorStream();
        }
        return httpURLConnection.getInputStream();
    }

    private boolean isContentLengthValid(Map<String, List<String>> map) throws ProfileRequestException {
        List<String> list = map.get("Content-Length");
        if (list == null || list.size() == 0) {
            return true;
        }
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            long j = Long.parseLong(str);
            if (j <= 1000000) {
                return true;
            }
            DsLog.et(TAG, "contentLength: " + j, new Object[0]);
            return false;
        } catch (NumberFormatException e) {
            throw new ProfileRequestException(ProfileRequestExceptionType.NUMBER_FORMAT_EXCEPTION, "content-length: " + str + " error: " + e.getMessage());
        }
    }

    private URLConnection generateUrlConnection() throws ProfileRequestException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.urlStr).openConnection();
            if (uRLConnectionOpenConnection != null) {
                return uRLConnectionOpenConnection;
            }
            throw new ProfileRequestException(ProfileRequestExceptionType.UNEXPECTED_NULL_POINTER, "url connection is null");
        } catch (IOException e) {
            throw ioExceptionFilter(e);
        }
    }

    private void addPostRequestBody(HttpsURLConnection httpsURLConnection) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        if (TextUtils.isEmpty(this.requestBody)) {
            DsLog.dt(TAG, "request body is empty, check if this request needs it.", new Object[0]);
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStream2 = httpsURLConnection.getOutputStream();
            try {
                if (outputStream2 == null) {
                    throw new ProfileRequestException(ProfileRequestExceptionType.UNEXPECTED_NULL_POINTER, " connection's output stream is null, unable to set request body.");
                }
                bufferedOutputStream = new BufferedOutputStream(outputStream2);
                try {
                    String str = this.requestBody;
                    if (str == null) {
                        throw new ProfileRequestException(ProfileRequestExceptionType.INPUT_PARAM_INVALID, "requestBody is null.");
                    }
                    bufferedOutputStream.write(str.getBytes("utf-8"));
                    bufferedOutputStream.flush();
                    FileUtils.closeCloseable(outputStream2);
                    FileUtils.closeCloseable(bufferedOutputStream);
                } catch (IOException e) {
                    outputStream = outputStream2;
                    e = e;
                    try {
                        throw ioExceptionFilter(e);
                    } catch (Throwable th3) {
                        OutputStream outputStream3 = outputStream;
                        th2 = th3;
                        outputStream2 = outputStream3;
                        Throwable th4 = th2;
                        outputStream = outputStream2;
                        th = th4;
                        FileUtils.closeCloseable(outputStream);
                        FileUtils.closeCloseable(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    Throwable th6 = th2;
                    outputStream = outputStream2;
                    th = th6;
                    FileUtils.closeCloseable(outputStream);
                    FileUtils.closeCloseable(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                outputStream = outputStream2;
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th7) {
                outputStream = outputStream2;
                th = th7;
                bufferedOutputStream = null;
                FileUtils.closeCloseable(outputStream);
                FileUtils.closeCloseable(bufferedOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th8) {
            th = th8;
            bufferedOutputStream = null;
        }
    }

    private ProfileRequestException ioExceptionFilter(IOException iOException) {
        if (TextUtils.isEmpty(iOException.getMessage())) {
            return new ProfileRequestException(ProfileRequestExceptionType.IO_EXCEPTION, "IOException, msg is empty.");
        }
        if (iOException.getMessage().contains("Unable to resolve host")) {
            return new ProfileRequestException(ProfileRequestExceptionType.NETWORK_ERROR, "network error: Unable to resolve host.");
        }
        if (iOException.getMessage().contains("failed to connect to") || iOException.getMessage().contains("Failed to connect to")) {
            return new ProfileRequestException(ProfileRequestExceptionType.NETWORK_ERROR, "failed to connect to cloud.");
        }
        if (iOException.getMessage().startsWith("timeout")) {
            return new ProfileRequestException(ProfileRequestExceptionType.NETWORK_ERROR, "timeout.");
        }
        return new ProfileRequestException(ProfileRequestExceptionType.IO_EXCEPTION, SensitiveUtil.getMessage(iOException));
    }

    private String checkHeader(String str) {
        return !TextUtils.isEmpty(str) ? str.replace("\n", "").replace(CR, "") : "";
    }

    public String getUrlStr() {
        return this.urlStr;
    }

    public Map<String, String> getHeaderMap() {
        return this.headerMap;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public String getRequestBody() {
        return this.requestBody;
    }
}
