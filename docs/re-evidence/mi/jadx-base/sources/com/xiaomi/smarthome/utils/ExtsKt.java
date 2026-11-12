package com.xiaomi.smarthome.utils;

import android.graphics.Color;
import android.util.TypedValue;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a>\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u000f*\u0006\u0012\u0002\b\u00030\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015H\u0086\b¢\u0006\u0002\u0010\u0017\u001a6\u0010\u0018\u001a\u00020\u000e\"\f\b\u0000\u0010\u000f*\u0006\u0012\u0002\b\u00030\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015H\u0086\b¢\u0006\u0002\u0010\u0019\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"dp", "", "", "getDp", "(F)I", "string", "", "", "getString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "colorAlpha", SleepAnalyzerAlpha.NAME_ALPHA, "", "observe", "", "L", "Landroidx/lifecycle/LiveData;", "", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "", "([Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "observeForever", "([Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Observer;)V", "base-utils_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ExtsKt {
    public static final int colorAlpha(int i, double d) {
        return Color.argb((int) (((double) Color.alpha(i)) * d), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int getDp(float f) {
        return MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, f, MiJiaEnvironment.getAppContext().getResources().getDisplayMetrics()));
    }

    @NotNull
    public static final String getString(@Nullable Throwable th) {
        if (th == null) {
            th = new Exception("throwable=null");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }

    public static final <L extends LiveData<?>> void observe(@NotNull L[] lArr, @NotNull LifecycleOwner lifecycle, @NotNull Observer<? super Object> observer) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(observer, "observer");
        int length = lArr.length;
        int i = 0;
        while (i < length) {
            L l = lArr[i];
            i++;
            l.observe(lifecycle, observer);
        }
    }

    public static final <L extends LiveData<?>> void observeForever(@NotNull L[] lArr, @NotNull Observer<? super Object> observe) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        Intrinsics.checkNotNullParameter(observe, "observe");
        int length = lArr.length;
        int i = 0;
        while (i < length) {
            L l = lArr[i];
            i++;
            l.observeForever(observe);
        }
    }
}
