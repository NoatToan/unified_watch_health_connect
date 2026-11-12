package health.compact.a;

import android.os.Looper;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class StrLogImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f36658b = BuildConfigProperties.a("IS_OUTPUT_LOG", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f36659c = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "D", "I", "W", ExifInterface.LONGITUDE_EAST, ExifInterface.LATITUDE_SOUTH, AudioConstant.WOMAN};
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuffer f36660a;
    private final ArrayDeque<StrLogBuilder> e;
    private StrLogFileHandler g;
    private AtomicBoolean h = new AtomicBoolean(true);

    public StrLogImpl() {
        Looper looperC = ThreadManager.c();
        if (looperC == null) {
            Log.w("LogUtil_LogImpl", "ThreadManager.getMainLooper null");
        } else {
            this.g = new StrLogFileHandler(looperC, this);
        }
        this.f36660a = new StringBuffer(8192);
        this.e = new ArrayDeque<>(3);
    }

    public void c() {
        synchronized (this) {
            this.f36660a.delete(0, this.f36660a.toString().length());
            this.g.e();
        }
    }

    public void e(boolean z) {
        synchronized (d) {
            this.h.set(z);
        }
    }

    public void c(int i, String str, String str2, Object[] objArr, boolean z) {
        StrLogBuilder strLogBuilderE;
        boolean zB = LogAllowListConfig.b(str, d);
        if ((zB || f36658b) && (strLogBuilderE = e(str)) != null) {
            int iC = strLogBuilderE.c(str2, f36659c[i], objArr);
            int i2 = 0;
            boolean z2 = iC > 1000;
            int i3 = iC - 2000;
            String strC = null;
            int i4 = 0;
            while (iC > 0) {
                int iMin = Math.min(iC, 1000);
                if (zB || z2) {
                    strC = strLogBuilderE.c(i4, i4 + iMin);
                }
                if (zB && i2 < 2) {
                    if (!BuildTypeConfig.c()) {
                        i2++;
                    }
                    if (i2 == 2 && i3 > 0) {
                        b(i, str, strC + ("... message length overlay 2000, " + i3 + " characters dropped"));
                    } else {
                        b(i, str, strC);
                    }
                }
                if (f36658b) {
                    e(strLogBuilderE, strC, z);
                }
                i4 += iMin;
                iC -= iMin;
            }
            e(strLogBuilderE);
        }
    }

    private StrLogBuilder e(String str) {
        StrLogBuilder strLogBuilderPollLast;
        if (str == null) {
            return null;
        }
        synchronized (this.e) {
            strLogBuilderPollLast = this.e.pollLast();
        }
        if (strLogBuilderPollLast == null) {
            strLogBuilderPollLast = new StrLogBuilder(f36658b);
        }
        strLogBuilderPollLast.b(str);
        return strLogBuilderPollLast;
    }

    private void e(StrLogBuilder strLogBuilder) {
        if (strLogBuilder == null) {
            return;
        }
        synchronized (this.e) {
            if (this.e.size() >= 3) {
                return;
            }
            this.e.addLast(strLogBuilder);
        }
    }

    private void b(int i, String str, String str2) {
        if (i == 0) {
            Log.v(str, str2);
            return;
        }
        if (i == 1) {
            Log.d(str, str2);
            return;
        }
        if (i == 2) {
            Log.i(str, str2);
            return;
        }
        if (i == 3) {
            Log.w(str, str2);
        } else if (i == 4) {
            Log.e(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    private void e(StrLogBuilder strLogBuilder, String str, boolean z) {
        strLogBuilder.e(this.f36660a, str);
        if (z) {
            a();
        } else if (this.f36660a.length() >= 31744) {
            synchronized (this) {
                if (this.f36660a.length() >= 31744 && this.h.get()) {
                    a();
                }
            }
        }
    }

    private void a() {
        synchronized (this) {
            String string = this.f36660a.toString();
            this.f36660a.delete(0, string.length());
            this.g.d(string);
        }
    }

    public void d() {
        StringBuffer stringBuffer = this.f36660a;
        if (stringBuffer == null) {
            Log.e("LogUtil_LogImpl", "mLogFileBuffer null");
            return;
        }
        if (stringBuffer.length() == 0) {
            return;
        }
        synchronized (this) {
            if (this.f36660a.length() != 0) {
                String string = this.f36660a.toString();
                this.f36660a.delete(0, string.length());
                if (this.h.get()) {
                    this.g.d(string);
                }
            }
        }
    }
}
