package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.graphics.Color;
import com.xiaomi.fitness.electronic.scale.WeightResultParamsExtKt;
import com.xiaomi.fitness.health.export.WeightExtKt;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"WEIGHT_RESULT_PARAM_VALUE_LOW", "", "WEIGHT_RESULT_PARAM_VALUE_NORMAL", "WEIGHT_RESULT_PARAM_VALUE_HIGH", "COLOR_ALPHA_DARK", "COLOR_ALPHA_LIGHT", "getIntColor", "", "context", "Landroid/content/Context;", ColorSchemeHelper.SCHEME_DARK, "", "addAlpha", "intColor", "electronic-scale_chinaProductRelease", "colorLow", "colorNormal", "colorHigh"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WeightResultParamsExtKt {
    public static final int COLOR_ALPHA_DARK = 102;
    public static final int COLOR_ALPHA_LIGHT = 26;
    public static final int WEIGHT_RESULT_PARAM_VALUE_HIGH = 1;
    public static final int WEIGHT_RESULT_PARAM_VALUE_LOW = -1;
    public static final int WEIGHT_RESULT_PARAM_VALUE_NORMAL = 0;

    private static final int addAlpha(int i, boolean z) {
        return z ? Color.argb(102, Color.red(i), Color.green(i), Color.blue(i)) : Color.argb(26, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int getIntColor(short s, @NotNull final Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hgr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(WeightResultParamsExtKt.getIntColor$lambda$0(context));
            }
        });
        Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: igr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(WeightResultParamsExtKt.getIntColor$lambda$2(context));
            }
        });
        Lazy lazy3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jgr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(WeightResultParamsExtKt.getIntColor$lambda$4(context));
            }
        });
        if (s == -1) {
            return addAlpha(getIntColor$lambda$1(lazy), z);
        }
        if (s == 0) {
            return addAlpha(getIntColor$lambda$3(lazy2), z);
        }
        return s == 1 ? addAlpha(getIntColor$lambda$5(lazy3), z) : getIntColor$lambda$1(lazy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntColor$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return context.getColor(WeightExtKt.getColorLow());
    }

    private static final int getIntColor$lambda$1(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntColor$lambda$2(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return context.getColor(WeightExtKt.getColorNormal());
    }

    private static final int getIntColor$lambda$3(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntColor$lambda$4(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return context.getColor(WeightExtKt.getColorHigh());
    }

    private static final int getIntColor$lambda$5(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }
}
