package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes4.dex */
public final class qpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31716b;
    public final Context c;
    public final int d;

    public static final class a {
        public static final int i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f31717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActivityManager f31718b;
        public c c;
        public float e;
        public float d = 2.0f;
        public float f = 0.4f;
        public float g = 0.33f;
        public int h = 4194304;

        public a(Context context) {
            this.e = i;
            this.f31717a = context;
            this.f31718b = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            this.c = new b(context.getResources().getDisplayMetrics());
            if (qpf.e(this.f31718b)) {
                this.e = 0.0f;
            }
        }

        public qpf a() {
            return new qpf(this);
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f31719a;

        public b(DisplayMetrics displayMetrics) {
            this.f31719a = displayMetrics;
        }

        @Override // qpf.c
        public int a() {
            return this.f31719a.heightPixels;
        }

        @Override // qpf.c
        public int b() {
            return this.f31719a.widthPixels;
        }
    }

    public interface c {
        int a();

        int b();
    }

    public qpf(a aVar) {
        this.c = aVar.f31717a;
        int i = e(aVar.f31718b) ? aVar.h / 2 : aVar.h;
        this.d = i;
        int iC = c(aVar.f31718b, aVar.f, aVar.g);
        float fB = aVar.c.b() * aVar.c.a() * 4;
        int iRound = Math.round(aVar.e * fB);
        int iRound2 = Math.round(fB * aVar.d);
        int i2 = iC - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.f31716b = iRound2;
            this.f31715a = iRound;
        } else {
            float f = i2;
            float f2 = aVar.e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            this.f31716b = Math.round(f3 * f4);
            this.f31715a = Math.round(f4 * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f31716b));
            sb.append(", pool size: ");
            sb.append(f(this.f31715a));
            sb.append(", byte array size: ");
            sb.append(f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iC);
            sb.append(", max size: ");
            sb.append(f(iC));
            sb.append(", memoryClass: ");
            sb.append(aVar.f31718b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f31718b));
        }
    }

    public static int c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * EventRecurrence.TH;
        if (e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f31715a;
    }

    public int d() {
        return this.f31716b;
    }

    public final String f(int i) {
        return Formatter.formatFileSize(this.c, i);
    }
}
