package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class MemorySizeCalculator {
    private static final String e = "MemorySizeCalculator";

    @VisibleForTesting
    public static final int f = 4;
    private static final int g = 2;
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    public static final class Builder {

        @VisibleForTesting
        public static final int i = 2;
        public static final int j;
        public static final float k = 0.4f;
        public static final float l = 0.33f;
        public static final int m = 4194304;
        public final Context a;
        public ActivityManager b;
        public b c;
        public float e;
        public float d = 2.0f;
        public float f = 0.4f;
        public float g = 0.33f;
        public int h = 4194304;

        static {
            j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public Builder(Context context) {
            this.e = j;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new a(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !MemorySizeCalculator.b(this.b)) {
                return;
            }
            this.e = 0.0f;
        }

        @VisibleForTesting
        public Builder a(ActivityManager activityManager) {
            this.b = activityManager;
            return this;
        }

        @VisibleForTesting
        public Builder b(b bVar) {
            this.c = bVar;
            return this;
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setArrayPoolSize(int i2) {
            this.h = i2;
            return this;
        }

        public Builder setBitmapPoolScreens(float f) {
            Preconditions.checkArgument(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.e = f;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f) {
            Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.g = f;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f) {
            Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }

        public Builder setMemoryCacheScreens(float f) {
            Preconditions.checkArgument(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.d = f;
            return this;
        }
    }

    public static final class a implements b {
        private final DisplayMetrics a;

        public a(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.b
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.b
        public int b() {
            return this.a.widthPixels;
        }
    }

    public interface b {
        int a();

        int b();
    }

    public MemorySizeCalculator(Builder builder) {
        this.c = builder.a;
        int i = b(builder.b) ? builder.h / 2 : builder.h;
        this.d = i;
        int iA = a(builder.b, builder.f, builder.g);
        float fB = builder.c.b() * builder.c.a() * 4;
        int iRound = Math.round(builder.e * fB);
        int iRound2 = Math.round(fB * builder.d);
        int i2 = iA - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.b = iRound2;
            this.a = iRound;
        } else {
            float f2 = i2;
            float f3 = builder.e;
            float f4 = builder.d;
            float f5 = f2 / (f3 + f4);
            this.b = Math.round(f4 * f5);
            this.a = Math.round(f5 * builder.e);
        }
        if (Log.isLoggable(e, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(c(this.b));
            sb.append(", pool size: ");
            sb.append(c(this.a));
            sb.append(", byte array size: ");
            sb.append(c(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iA);
            sb.append(", max size: ");
            sb.append(c(iA));
            sb.append(", memoryClass: ");
            sb.append(builder.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(b(builder.b));
            Log.d(e, sb.toString());
        }
    }

    private static int a(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (b(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    @TargetApi(19)
    public static boolean b(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String c(int i) {
        return Formatter.formatFileSize(this.c, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.d;
    }

    public int getBitmapPoolSize() {
        return this.a;
    }

    public int getMemoryCacheSize() {
        return this.b;
    }
}
