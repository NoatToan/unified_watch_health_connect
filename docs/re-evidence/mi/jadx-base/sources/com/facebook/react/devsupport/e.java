package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.react.common.JavascriptException;
import defpackage.cm8;
import defpackage.sk1;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes4.dex */
public class e extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebSocket f7334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpClient f7335b;
    public a c;
    public final AtomicInteger d = new AtomicInteger();
    public final ConcurrentHashMap<Integer, a> e = new ConcurrentHashMap<>();

    public interface a {
        void onFailure(Throwable th);

        void onSuccess(String str);
    }

    private void a(String str, Throwable th) {
        cm8.j("JSDebuggerWebSocketClient", "Error occurred, shutting down websocket connection: " + str, th);
        b();
        a aVar = this.c;
        if (aVar != null) {
            aVar.onFailure(th);
            this.c = null;
        }
        Iterator<a> it = this.e.values().iterator();
        while (it.hasNext()) {
            it.next().onFailure(th);
        }
        this.e.clear();
    }

    public void b() {
        WebSocket webSocket = this.f7334a;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f7334a = null;
        }
    }

    public void c(String str, a aVar) {
        if (this.f7335b != null) {
            throw new IllegalStateException("JSDebuggerWebSocketClient is already initialized.");
        }
        this.c = aVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7335b = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        this.f7335b.newWebSocket(new Request.Builder().url(str).build(), this);
    }

    public void d(String str, String str2, a aVar) {
        int andIncrement = this.d.getAndIncrement();
        this.e.put(Integer.valueOf(andIncrement), aVar);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value(andIncrement).name("method").value(str);
            stringWriter.append((CharSequence) ",\"arguments\":").append((CharSequence) str2);
            jsonWriter.endObject().close();
            g(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            h(andIncrement, e);
        }
    }

    public void e(String str, HashMap<String, String> map, a aVar) {
        int andIncrement = this.d.getAndIncrement();
        this.e.put(Integer.valueOf(andIncrement), aVar);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriterBeginObject = new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name("method").value("executeApplicationScript").name("url").value(str).name("inject").beginObject();
            for (String str2 : map.keySet()) {
                jsonWriterBeginObject.name(str2).value(map.get(str2));
            }
            jsonWriterBeginObject.endObject().endObject().close();
            g(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            h(andIncrement, e);
        }
    }

    public void f(a aVar) {
        int andIncrement = this.d.getAndIncrement();
        this.e.put(Integer.valueOf(andIncrement), aVar);
        try {
            StringWriter stringWriter = new StringWriter();
            new JsonWriter(stringWriter).beginObject().name("id").value(andIncrement).name("method").value("prepareJSRuntime").endObject().close();
            g(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            h(andIncrement, e);
        }
    }

    public final void g(int i, String str) {
        WebSocket webSocket = this.f7334a;
        if (webSocket == null) {
            h(i, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            h(i, e);
        }
    }

    public final void h(int i, Throwable th) {
        a aVar = this.e.get(Integer.valueOf(i));
        if (aVar != null) {
            this.e.remove(Integer.valueOf(i));
            aVar.onFailure(th);
        }
    }

    public final void i(int i, String str) {
        a aVar = this.e.get(Integer.valueOf(i));
        if (aVar != null) {
            this.e.remove(Integer.valueOf(i));
            aVar.onSuccess(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        this.f7334a = null;
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        a("Websocket exception", th);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Integer numValueOf = null;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            String strNextString = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (JsonToken.NULL == jsonReader.peek()) {
                    jsonReader.skipValue();
                } else if ("replyID".equals(strNextName)) {
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                } else if ("result".equals(strNextName)) {
                    strNextString = jsonReader.nextString();
                } else if ("error".equals(strNextName)) {
                    String strNextString2 = jsonReader.nextString();
                    a(strNextString2, new JavascriptException(strNextString2));
                }
            }
            if (numValueOf != null) {
                i(numValueOf.intValue(), strNextString);
            }
        } catch (IOException e) {
            if (numValueOf != null) {
                h(numValueOf.intValue(), e);
            } else {
                a("Parsing response message from websocket failed", e);
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        this.f7334a = webSocket;
        ((a) sk1.c(this.c)).onSuccess(null);
        this.c = null;
    }
}
