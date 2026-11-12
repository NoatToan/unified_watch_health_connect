package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class tnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f34881a = new ArrayMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HandlerThread f34882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34883b = 1;

        public a(String str) {
            HandlerThread handlerThread = new HandlerThread(str);
            this.f34882a = handlerThread;
            handlerThread.start();
        }
    }

    public static synchronized Looper a(String str) {
        a aVar;
        try {
            Map<String, a> map = f34881a;
            aVar = map.get(str);
            if (aVar == null) {
                aVar = new a(str);
                map.put(str, aVar);
            } else {
                aVar.f34883b++;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.f34882a.getLooper();
    }

    public static synchronized void b(String str) {
        Map<String, a> map = f34881a;
        a aVar = map.get(str);
        if (aVar != null) {
            int i = aVar.f34883b - 1;
            aVar.f34883b = i;
            if (i == 0) {
                map.remove(str);
                aVar.f34882a.quitSafely();
            }
        }
    }
}
