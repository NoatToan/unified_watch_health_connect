package com.ximalaya.ting.android.sdkdownloader.http.app;

import com.ximalaya.ting.android.sdkdownloader.exception.HttpException;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.HashSet;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class HttpRetryHandler {
    public static HashSet<Class<?>> blackList;
    public int maxRetryCount = 2;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        blackList = hashSet;
        hashSet.add(HttpException.class);
        blackList.add(Callback.CancelledException.class);
        blackList.add(MalformedURLException.class);
        blackList.add(URISyntaxException.class);
        blackList.add(NoRouteToHostException.class);
        blackList.add(PortUnreachableException.class);
        blackList.add(ProtocolException.class);
        blackList.add(NullPointerException.class);
        blackList.add(FileNotFoundException.class);
        blackList.add(JSONException.class);
        blackList.add(UnknownHostException.class);
        blackList.add(IllegalArgumentException.class);
    }

    public boolean canRetry(UriRequest uriRequest, Throwable th, int i) {
        return i <= this.maxRetryCount && !blackList.contains(th.getClass());
    }

    public void setMaxRetryCount(int i) {
        this.maxRetryCount = i;
    }
}
