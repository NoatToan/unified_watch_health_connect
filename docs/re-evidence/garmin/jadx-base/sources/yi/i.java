package yi;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f197305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f197306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f197307c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f197308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityManager f197309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f197310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f197311d;

        public a(Context context) {
            this.f197311d = 1;
            this.f197308a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f197309b = activityManager;
            this.f197310c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f197311d = 0.0f;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f197312a;

        public b(DisplayMetrics displayMetrics) {
            this.f197312a = displayMetrics;
        }
    }

    public i(a aVar) {
        Context context = aVar.f197308a;
        float f14 = aVar.f197311d;
        ActivityManager activityManager = aVar.f197309b;
        int i14 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f197307c = i14;
        int iRound = Math.round(activityManager.getMemoryClass() * ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f197310c.f197312a;
        float f15 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f15 * f14);
        int iRound3 = Math.round(f15 * 2.0f);
        int i15 = iRound - i14;
        if (iRound3 + iRound2 <= i15) {
            this.f197306b = iRound3;
            this.f197305a = iRound2;
        } else {
            float f16 = i15 / (f14 + 2.0f);
            this.f197306b = Math.round(2.0f * f16);
            this.f197305a = Math.round(f16 * f14);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f197306b);
            Formatter.formatFileSize(context, this.f197305a);
            Formatter.formatFileSize(context, i14);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
