package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    public static Object getContent(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e4) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e4;
        }
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new InstrHttpsURLConnection((HttpsURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance()));
        }
        return obj instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance())) : obj;
    }

    public static InputStream openStream(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        if (!TransportManager.getInstance().isInitialized()) {
            return uRLWrapper.openConnection().getInputStream();
        }
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getInputStream();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getInputStream() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e4) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e4;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return getContent(new URLWrapper(url), clsArr, TransportManager.getInstance(), new Timer());
    }

    @Keep
    public static Object getContent(URL url) {
        return getContent(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }

    public static Object getContent(URLWrapper uRLWrapper, Class[] clsArr, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e4) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e4;
        }
    }

    @Keep
    public static InputStream openStream(URL url) {
        return openStream(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }
}
