package com.amazon.alexa.avs.http;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.alexa.avs.AVSRequest;
import com.amazon.alexa.avs.RequestListener;
import com.amazon.alexa.avs.ResultListener;
import com.amazon.alexa.avs.exception.AVSException;
import com.amazon.alexa.avs.exception.AlexaSystemException;
import com.amazon.alexa.avs.exception.AlexaSystemExceptionCode;
import com.amazon.alexa.avs.http.AVSClient;
import com.amazon.alexa.avs.http.okhttp.ConnectionListener;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import com.amazon.alexa.avs.message.Message;
import com.amazon.alexa.avs.message.request.context.AlertsStatePayload;
import com.amazon.alexa.avs.message.request.context.NotificationsStatePayload;
import com.amazon.alexa.avs.message.response.AlexaExceptionResponse;
import com.amazon.alexa.avs.util.NetworkUtil;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.huami.tools.log.HMLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AVSClient implements ConnectionListener {
    public static final String AUDIO_NAME = "audio";
    private static final String DIRECTIVES_ENDPOINT = "/v20160207/directives";
    private static final String EVENTS_ENDPOINT = "/v20160207/events";
    public static final String METADATA_NAME = "metadata";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private static final int REQUEST_ATTEMPTS = 1;
    private static final long REQUEST_RETRY_DELAY_MS = 100000;
    private static final int REQUEST_TIMEOUT_IN_S = 15;
    private MultipartParser downchannelParser;
    private DownchannelRequestThread downchannelThread;
    private URL host;
    private OkHttpClient httpClient;
    private Context mContext;
    private ParsingFailedHandler parsingFailedHandler;
    private final BlockingQueue<AVSRequest> requestQueue;
    private MultipartParser requestResponseParser;
    private RequestThread requestThread;
    private ResultListener resultListener;
    public static final String TAG = LogHelper.makeLogTag(AVSClient.class);
    private static final Logger log = LoggerFactory.getLogger(AVSClient.class);
    private static final Pattern PATTERN = Pattern.compile("boundary=(.*?);");
    private static String accessToken = null;

    /* JADX INFO: renamed from: com.amazon.alexa.avs.http.AVSClient$1, reason: invalid class name */
    public class AnonymousClass1 implements Callable<Void> {
        public final /* synthetic */ AVSRequest val$avsRequest;

        public AnonymousClass1(AVSRequest aVSRequest) {
            this.val$avsRequest = aVSRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$call$0() {
            return "task call";
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            HMLog.info("speech", new Function0() { // from class: com.amazon.alexa.avs.http.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AVSClient.AnonymousClass1.lambda$call$0();
                }
            });
            AVSClient.this.doRequestActual(this.val$avsRequest.getTagId(), this.val$avsRequest.getDataType(), AVSClient.this.createRequestBuilder(this.val$avsRequest.getResource(), this.val$avsRequest.getContentProvider()), this.val$avsRequest.getRequestListener(), this.val$avsRequest.getMultipartParser());
            return null;
        }
    }

    public class DownchannelRequestThread extends Thread {
        private boolean running = true;

        public DownchannelRequestThread() {
            setName(getClass().getSimpleName());
        }

        private AlertsStatePayload getAlertState() {
            return new AlertsStatePayload(null, null);
        }

        private NotificationsStatePayload getNotificationState() {
            return new NotificationsStatePayload(false, false);
        }

        private void openConnection() {
            while (this.running) {
                AVSClient.log.info("Establishing downchannel");
                String strGenerateTagId = AVSClient.this.generateTagId();
                String str = AVSClient.TAG;
                LogHelper.d(str, "Establishing downchannel with tagid " + strGenerateTagId);
                HMLog.i(str, "start establishing down channel", new Object[0]);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                AVSClient.this.doRequest(new AVSRequest(strGenerateTagId, 0, Resource.DIRECTIVES, null, new ExponentialRetryPolicy(100000L, 1), AVSClient.this.downchannelParser, new RequestListener() { // from class: com.amazon.alexa.avs.http.AVSClient.DownchannelRequestThread.1
                    private boolean shouldExceptionCauseShutdown(Throwable th) {
                        return (th instanceof AlexaSystemException) && AlexaSystemExceptionCode.UNAUTHORIZED_REQUEST_EXCEPTION == ((AlexaSystemException) th).getExceptionCode();
                    }

                    @Override // com.amazon.alexa.avs.RequestListener
                    public void onRequestError(Throwable th) {
                        if (shouldExceptionCauseShutdown(th)) {
                            DownchannelRequestThread.this.shutdownGracefully();
                        }
                        String str2 = AVSClient.TAG;
                        LogHelper.d(str2, "Establishing onRequestError");
                        AVSClient.this.resultListener.onFailure();
                        HMLog.i(str2, "down channel establish fail", new Object[0]);
                    }

                    @Override // com.amazon.alexa.avs.RequestListener
                    public void onRequestSuccess() {
                        String str2 = AVSClient.TAG;
                        LogHelper.d(str2, "Establishing onRequestSuccess");
                        AVSClient.this.resultListener.onSuccess();
                        HMLog.i(str2, "down channel establish success.Speed time:" + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                    }
                }));
                try {
                    Thread.sleep(30000L);
                } catch (InterruptedException e) {
                    AVSClient.log.info("Finishing downchannel" + e.toString());
                }
                AVSClient.log.info("Finishing downchannel");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            openConnection();
        }

        public void shutdownGracefully() {
            AVSClient.this.downchannelParser.shutdownGracefully();
            this.running = false;
        }
    }

    public static class MalformedResponseException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public MalformedResponseException(String str, Throwable th) {
            super(str, th);
        }

        public MalformedResponseException(String str) {
            super(str);
        }

        public MalformedResponseException(Throwable th) {
            super(th);
        }
    }

    public static class RequestException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public RequestException(Throwable th) {
            super(th);
        }
    }

    public class RequestThread extends Thread {
        private BlockingQueue<AVSRequest> queue;

        public RequestThread(BlockingQueue<AVSRequest> blockingQueue) {
            this.queue = blockingQueue;
            setName(getClass().getSimpleName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0(AVSRequest aVSRequest) {
            return "queue taks request:" + aVSRequest.toString();
        }

        /* JADX INFO: Infinite loop detected, blocks: 12, insns: 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    final AVSRequest aVSRequestTake = this.queue.take();
                    HMLog.info("speech", new Function0() { // from class: com.amazon.alexa.avs.http.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AVSClient.RequestThread.lambda$run$0(aVSRequestTake);
                        }
                    });
                    AVSClient.this.doRequest(aVSRequestTake);
                    if (aVSRequestTake.getRequestListener() != null) {
                        aVSRequestTake.getRequestListener().onRequestFinished();
                    }
                } catch (InterruptedException e) {
                    AVSClient.log.error("Exception in the request thread", e);
                }
            }
        }
    }

    public enum Resource {
        EVENTS(AVSClient.EVENTS_ENDPOINT, "POST"),
        DIRECTIVES(AVSClient.DIRECTIVES_ENDPOINT, "GET");

        private final String method;
        private final String path;

        Resource(String str, String str2) {
            this.path = str;
            this.method = str2;
        }

        public String getMethod() {
            return this.method;
        }

        public String getPath() {
            return this.path;
        }
    }

    public AVSClient(Context context, URL url, MultipartParser.MultipartParserConsumer multipartParserConsumer, ParsingFailedHandler parsingFailedHandler, ResultListener resultListener) throws Exception {
        this.host = url;
        this.mContext = context;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.requestQueue = linkedBlockingDeque;
        this.requestResponseParser = new MultipartParser(multipartParserConsumer, "response parser");
        this.downchannelParser = new MultipartParser(multipartParserConsumer, "download parser");
        this.parsingFailedHandler = parsingFailedHandler;
        this.resultListener = resultListener;
        createNewHttpClient();
        this.requestThread = new RequestThread(linkedBlockingDeque);
        if (TextUtils.isEmpty(accessToken)) {
            return;
        }
        startRequestThread();
        startDownchannelThread();
    }

    private void createNewHttpClient() throws Exception {
        releaseHttpClient();
        this.httpClient = HttpClientUtil.createNewHttpClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request.Builder createRequestBuilder(Resource resource, RequestBody requestBody) {
        Request.Builder builderUrl = new Request.Builder().url(this.host.toString() + resource.getPath());
        return "POST".equalsIgnoreCase(resource.method) ? builderUrl.post(requestBody) : builderUrl.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(AVSRequest aVSRequest) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVSRequest);
        try {
            try {
                if (NetworkUtil.isOnline(this.mContext)) {
                    HMLog.info("speech", new Function0() { // from class: k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AVSClient.lambda$doRequest$0();
                        }
                    });
                    aVSRequest.getRetryPolicy().tryCall(anonymousClass1, RequestException.class);
                } else {
                    this.parsingFailedHandler.onParsingFailed(3, "Network disconnect");
                    HMLog.info("speech", new Function0() { // from class: h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AVSClient.lambda$doRequest$1();
                        }
                    });
                }
            } catch (Exception e) {
                HMLog.info("speech", new Function0() { // from class: j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AVSClient.lambda$doRequest$2();
                    }
                });
                LogHelper.e(TAG, e.toString() + "There was a problem with the request.");
                if (aVSRequest.getRequestListener() != null) {
                    aVSRequest.getRequestListener().onRequestError(e);
                }
            }
        } finally {
            aVSRequest.closeInputStream();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequestActual(String str, int i, Request.Builder builder, RequestListener requestListener, MultipartParser multipartParser) throws IOException, AVSException {
        String str2;
        Response responseExecute;
        HMLog.info("speech", new Function0() { // from class: l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AVSClient.lambda$doRequestActual$3();
            }
        });
        Logger logger = log;
        logger.debug("==================doRequestActual   " + multipartParser.getTag() + "   START========================");
        StringBuilder sb = new StringBuilder();
        sb.append("Bearer ");
        sb.append(accessToken);
        builder.header("Authorization", sb.toString());
        Request requestBuild = builder.build();
        try {
            synchronized (this) {
                str2 = TAG;
                LogHelper.d(str2, str + "'s request utc timestamp : " + System.currentTimeMillis());
                responseExecute = FirebasePerfOkHttpClient.execute(this.httpClient.newCall(requestBuild));
            }
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            int iCode = responseExecute.code();
            LogHelper.v(str2, "Response code: ", Integer.valueOf(iCode));
            LogHelper.v(str2, "Response headers: ", responseExecute.headers(), responseExecute.networkResponse().headers() + "\n\n");
            if (iCode == 200 && requestListener != null) {
                requestListener.onRequestSuccess();
            }
            if (iCode == 204) {
                if (requestListener != null) {
                    requestListener.onRequestSuccess();
                }
                if (i == 1) {
                    this.parsingFailedHandler.onParsingFailed(4, "error: no audio content statusCode: " + iCode);
                }
                logger.info("This response successfully had no content.");
                logger.debug("==================doRequestActual   " + multipartParser.getTag() + "   END========================\n\n");
                return;
            }
            if (iCode == 403) {
                this.parsingFailedHandler.onParsingFailed(1, "error: " + responseExecute.message() + " statusCode: " + iCode);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("==================doRequestActual   ");
                sb2.append(multipartParser.getTag());
                sb2.append("   END========================\n\n");
                logger.debug(sb2.toString());
                return;
            }
            responseExecute.header("content-type");
            LogHelper.d(str2, "response : " + responseExecute.toString());
            String boundary = getBoundary(responseExecute);
            try {
                try {
                    if (TextUtils.isEmpty(boundary)) {
                        parseException(inputStreamByteStream);
                        throw new MultipartStream.MalformedStreamException("A boundary is missing from the response headers. Unable to parse multipart stream.");
                    }
                    multipartParser.parseStream(inputStreamByteStream, boundary);
                    logger.debug("==================doRequestActual   " + multipartParser.getTag() + "   END========================\n\n");
                    IOUtils.closeQuietly(inputStreamByteStream);
                } catch (JsonParseException e) {
                    this.parsingFailedHandler.onParsingFailed(5, e.toString());
                    log.debug("==================doRequestActual   " + multipartParser.getTag() + "   END========================\n\n");
                }
            } catch (Throwable th) {
                log.debug("==================doRequestActual   " + multipartParser.getTag() + "   END========================\n\n");
                IOUtils.closeQuietly(inputStreamByteStream);
                throw th;
            }
        } catch (Exception e2) {
            IOUtils.closeQuietly((InputStream) null);
            throw new RequestException(e2);
        }
    }

    private void enqueueRequest(AVSRequest aVSRequest) {
        if (this.requestQueue.offer(aVSRequest)) {
            HMLog.info("speech", new Function0() { // from class: i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AVSClient.lambda$enqueueRequest$5();
                }
            });
            return;
        }
        HMLog.info("speech", new Function0() { // from class: m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AVSClient.lambda$enqueueRequest$4();
            }
        });
        log.error("Failed to enqueue request: " + aVSRequest.getTagId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String generateTagId() {
        return new String("Event_id_" + System.currentTimeMillis());
    }

    private static String getBoundary(Response response) throws IOException {
        String str = response.headers().get("content-type");
        if (str != null) {
            Matcher matcher = PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return "";
    }

    private static String getHeaderParameter(String str, String str2) {
        if (str != null && str2 != null) {
            for (String str3 : str.split(";")) {
                String strTrim = str3.trim();
                if (strTrim.startsWith(str2)) {
                    return strTrim.substring(str2.length() + 1).replaceAll("(^\")|(\"$)", "").trim();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$doRequest$0() {
        return "try call";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$doRequest$1() {
        return "has no network";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$doRequest$2() {
        return "try call ,but exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$doRequestActual$3() {
        return "doRequestActual";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$enqueueRequest$4() {
        return "request task enqueue failed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$enqueueRequest$5() {
        return "request task enqueue success";
    }

    private void releaseHttpClient() throws Exception {
        OkHttpClient okHttpClient = this.httpClient;
        if (okHttpClient != null) {
            okHttpClient.dispatcher().executorService().shutdown();
            this.httpClient.connectionPool().evictAll();
            this.httpClient.cache().close();
            this.httpClient = null;
        }
    }

    private static void setAccessTokenValue(String str) {
        accessToken = str;
    }

    public void closeDownchannel() {
        DownchannelRequestThread downchannelRequestThread = this.downchannelThread;
        if (downchannelRequestThread != null) {
            downchannelRequestThread.shutdownGracefully();
        }
    }

    public URL getHost() {
        return this.host;
    }

    @Override // com.amazon.alexa.avs.http.okhttp.ConnectionListener
    public void onConnected() {
        this.downchannelParser.onConnected();
    }

    @Override // com.amazon.alexa.avs.http.okhttp.ConnectionListener
    public void onDisconnected() {
        this.downchannelParser.onDisconnected();
    }

    public void parseException(InputStream inputStream) throws IOException, AlexaSystemException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, byteArrayOutputStream);
        String str = new String(byteArrayOutputStream.toByteArray(), Util.UTF_8);
        LogHelper.d(TAG, "parseException content: ", str);
        Message.MessageWrapper messageWrapper = (Message.MessageWrapper) Message.MessageWrapper.getMessageBuilder().create().fromJson(str, Message.MessageWrapper.class);
        if (messageWrapper.getMessage() instanceof AlexaExceptionResponse) {
            ((AlexaExceptionResponse) messageWrapper.getMessage()).throwException();
        }
    }

    public void revokeAccessToken() {
        setAccessTokenValue("");
        stopDownchannelThread();
    }

    public void sendEvent(com.amazon.alexa.avs.message.request.RequestBody requestBody) throws IOException {
        sendEvent(requestBody, (RequestListener) null);
    }

    public void setAccessToken(String str) {
        log.debug("setAccessToken = " + str);
        setAccessTokenValue(str);
        if (TextUtils.isEmpty(str)) {
            stopDownchannelThread();
        } else {
            startRequestThread();
            startDownchannelThread();
        }
    }

    public void setNewHost(URL url) {
        if (this.host.equals(url)) {
            return;
        }
        this.host = url;
        startDownchannelThread();
    }

    public void shutdown() {
        try {
            this.downchannelThread.shutdownGracefully();
            releaseHttpClient();
        } catch (Exception unused) {
        }
    }

    public void startDownchannelThread() {
        stopDownchannelThread();
        DownchannelRequestThread downchannelRequestThread = new DownchannelRequestThread();
        this.downchannelThread = downchannelRequestThread;
        downchannelRequestThread.start();
    }

    public void startRequestThread() {
        if (this.requestThread.isAlive()) {
            return;
        }
        this.requestThread.start();
    }

    public void stopDownchannelThread() {
        DownchannelRequestThread downchannelRequestThread = this.downchannelThread;
        if (downchannelRequestThread != null) {
            downchannelRequestThread.interrupt();
            this.downchannelThread.shutdownGracefully();
        }
    }

    public void sendEvent(com.amazon.alexa.avs.message.request.RequestBody requestBody, RequestListener requestListener) {
        sendEvent(new Gson().toJson(requestBody), requestListener);
    }

    public void sendEvent(String str) {
        sendEvent(str, (RequestListener) null);
    }

    public void sendEvent(String str, RequestListener requestListener) {
        String strGenerateTagId = generateTagId();
        LogHelper.d(TAG, "sendEvent " + strGenerateTagId + "'s body: ", str);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        type.addFormDataPart("meta", "meta", RequestBody.create(MediaType.parse(ContentTypes.JSON_UTF8), str));
        enqueueRequest(new AVSRequest(strGenerateTagId, 0, Resource.EVENTS, type.build(), new LinearRetryPolicy(100000L, 1), this.requestResponseParser, requestListener));
    }

    public void sendEvent(com.amazon.alexa.avs.message.request.RequestBody requestBody, InputStream inputStream, RequestListener requestListener) {
        String strGenerateTagId = generateTagId();
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        String json = new Gson().toJson(requestBody);
        LogHelper.d(TAG, "sendEvent " + strGenerateTagId + "'s data body: " + json + "with input stream audio  ");
        type.addFormDataPart("meta", "meta", RequestBody.create(MediaType.parse(ContentTypes.JSON_UTF8), json));
        type.addFormDataPart("audio", "speech.wav", new AudioStreamRequestBody(inputStream));
        enqueueRequest(new AVSRequest(strGenerateTagId, 1, Resource.EVENTS, type.build(), new LinearRetryPolicy(100000L, 1), this.requestResponseParser, requestListener));
    }

    public void sendEvent(com.amazon.alexa.avs.message.request.RequestBody requestBody, byte[] bArr, RequestListener requestListener) {
        sendEvent(new Gson().toJson(requestBody), bArr, requestListener);
    }

    public void sendEvent(String str, byte[] bArr, RequestListener requestListener) {
        String strGenerateTagId = generateTagId();
        LogHelper.d(TAG, "sendEvent " + strGenerateTagId + "'s " + str + "  with array audio data: " + bArr);
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        type.addFormDataPart("meta", "meta", RequestBody.create(MediaType.parse(ContentTypes.JSON_UTF8), str));
        type.addFormDataPart("audio", "speech.wav", RequestBody.create(MediaType.parse("application/octet-stream"), bArr));
        enqueueRequest(new AVSRequest(strGenerateTagId, 1, Resource.EVENTS, type.build(), new LinearRetryPolicy(100000L, 1), this.requestResponseParser, requestListener));
    }

    public void sendEvent(String str, InputStream inputStream, RequestListener requestListener) {
        String strGenerateTagId = generateTagId();
        LogHelper.d(TAG, "sendEvent" + strGenerateTagId + "'s body :" + str + " with input stream audio data body");
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        type.addFormDataPart("meta", "meta", RequestBody.create(MediaType.parse(ContentTypes.JSON_UTF8), str));
        type.addFormDataPart("audio", "speech.wav", new AudioStreamRequestBody(inputStream));
        enqueueRequest(new AVSRequest(strGenerateTagId, 1, Resource.EVENTS, type.build(), new LinearRetryPolicy(100000L, 1), this.requestResponseParser, requestListener, inputStream));
    }
}
