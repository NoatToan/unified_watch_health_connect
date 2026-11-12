package defpackage;

import android.os.Looper;
import android.util.Log;
import health.compact.a.BuildConfigProperties;
import health.compact.a.ThreadManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class npv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f43427b = BuildConfigProperties.a("IS_OUTPUT_LOG", false);
    private static final Object e = new Object();
    private npy d;
    private String f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f43429c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Byte> f43428a = new ArrayList();

    public npv(String str) {
        this.f = null;
        this.f = str;
        Looper looperC = ThreadManager.c();
        if (looperC == null) {
            Log.w("LogUtil_BytesLogImpl", "ThreadManager.getMainLooper null");
        } else {
            this.d = new npy(looperC);
        }
    }

    public void b() {
        synchronized (this) {
            this.f43428a.clear();
        }
        this.d.d();
    }

    public void d(boolean z) {
        synchronized (e) {
            this.f43429c.set(z);
        }
    }

    public void d(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        b(this.f, bArr);
        if (f43427b) {
            a(bArr, z);
        }
    }

    private void b(String str, byte[] bArr) {
        Log.i(str, e(bArr));
    }

    private void a(byte[] bArr, boolean z) {
        boolean z2;
        if (bArr == null || bArr.length == 0) {
            Log.e("LogUtil_BytesLogImpl", "saveToFile byte[] left null");
            return;
        }
        synchronized (this) {
            for (byte b2 : bArr) {
                this.f43428a.add(Byte.valueOf(b2));
            }
        }
        if (z) {
            a();
            return;
        }
        synchronized (this) {
            z2 = this.f43428a.size() >= 8192;
        }
        if (z2) {
            synchronized (this) {
                if (this.f43428a.size() >= 8192 && this.f43429c.get()) {
                    a();
                }
            }
        }
    }

    private void a() {
        synchronized (this) {
            int size = this.f43428a.size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f43428a.get(i).byteValue();
            }
            this.f43428a.clear();
            this.d.e(bArr, "sensor");
        }
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b2 & 255)));
        }
        return stringBuffer.toString();
    }

    public void d() {
        synchronized (this) {
            List<Byte> list = this.f43428a;
            if (list == null) {
                Log.e("LogUtil_BytesLogImpl", "mLogFileBuffer null");
            } else {
                if (list.size() == 0) {
                    return;
                }
                synchronized (this) {
                    if (this.f43428a.size() != 0 && this.f43429c.get()) {
                        a();
                    }
                }
            }
        }
    }
}
