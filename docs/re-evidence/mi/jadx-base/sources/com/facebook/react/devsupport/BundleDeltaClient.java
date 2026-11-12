package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.Pair;
import com.facebook.react.bridge.NativeDeltaClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeMap;
import okhttp3.Headers;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BundleDeltaClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7222a;

    public enum ClientType {
        NONE,
        DEV_SUPPORT,
        NATIVE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7223a;

        static {
            int[] iArr = new int[ClientType.values().length];
            f7223a = iArr;
            try {
                iArr[ClientType.DEV_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7223a[ClientType.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static BundleDeltaClient b(ClientType clientType) {
        int i = a.f7223a[clientType.ordinal()];
        a aVar = null;
        if (i == 1) {
            return new b(aVar);
        }
        if (i != 2) {
            return null;
        }
        return new c(aVar);
    }

    public static boolean d(String str) {
        return str.indexOf(".delta?") != -1;
    }

    public abstract boolean a(ClientType clientType);

    public final synchronized String c(String str) {
        if (this.f7222a != null) {
            str = str + "&revisionId=" + this.f7222a;
        }
        return str;
    }

    public synchronized Pair<Boolean, NativeDeltaClient> e(Headers headers, BufferedSource bufferedSource, File file) throws IOException {
        this.f7222a = headers.get("X-Metro-Delta-ID");
        return f(bufferedSource, file);
    }

    public abstract Pair<Boolean, NativeDeltaClient> f(BufferedSource bufferedSource, File file) throws IOException;

    public static class b extends BundleDeltaClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f7224b;
        public byte[] c;
        public final TreeMap<Number, byte[]> d;

        public b() {
            this.d = new TreeMap<>();
        }

        public static int g(JsonReader jsonReader, TreeMap<Number, byte[]> treeMap) throws IOException {
            jsonReader.beginArray();
            int i = 0;
            while (jsonReader.hasNext()) {
                treeMap.remove(Integer.valueOf(jsonReader.nextInt()));
                i++;
            }
            jsonReader.endArray();
            return i;
        }

        public static int h(JsonReader jsonReader, TreeMap<Number, byte[]> treeMap) throws IOException {
            jsonReader.beginArray();
            int i = 0;
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                treeMap.put(Integer.valueOf(jsonReader.nextInt()), jsonReader.nextString().getBytes());
                jsonReader.endArray();
                i++;
            }
            jsonReader.endArray();
            return i;
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public boolean a(ClientType clientType) {
            return clientType == ClientType.DEV_SUPPORT;
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public synchronized Pair<Boolean, NativeDeltaClient> f(BufferedSource bufferedSource, File file) throws IOException {
            int iH;
            try {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(bufferedSource.inputStream()));
                jsonReader.beginObject();
                int i = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals("pre")) {
                        this.f7224b = jsonReader.nextString().getBytes();
                    } else if (strNextName.equals("post")) {
                        this.c = jsonReader.nextString().getBytes();
                    } else {
                        if (strNextName.equals("modules")) {
                            iH = h(jsonReader, this.d);
                        } else if (strNextName.equals("added")) {
                            iH = h(jsonReader, this.d);
                        } else if (strNextName.equals("modified")) {
                            iH = h(jsonReader, this.d);
                        } else if (strNextName.equals("deleted")) {
                            iH = g(jsonReader, this.d);
                        } else {
                            jsonReader.skipValue();
                        }
                        i += iH;
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                if (i == 0) {
                    return Pair.create(Boolean.FALSE, null);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(this.f7224b);
                    fileOutputStream.write(10);
                    Iterator<byte[]> it = this.d.values().iterator();
                    while (it.hasNext()) {
                        fileOutputStream.write(it.next());
                        fileOutputStream.write(10);
                    }
                    fileOutputStream.write(this.c);
                    fileOutputStream.write(10);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return Pair.create(Boolean.TRUE, null);
                } catch (Throwable th) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static class c extends BundleDeltaClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NativeDeltaClient f7225b;

        public c() {
            this.f7225b = new NativeDeltaClient();
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public boolean a(ClientType clientType) {
            return clientType == ClientType.NATIVE;
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public Pair<Boolean, NativeDeltaClient> f(BufferedSource bufferedSource, File file) throws IOException {
            this.f7225b.processDelta(bufferedSource);
            return Pair.create(Boolean.FALSE, this.f7225b);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
