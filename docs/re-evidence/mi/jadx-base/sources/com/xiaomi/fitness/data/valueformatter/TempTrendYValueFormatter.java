package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.c0j;
import defpackage.onq;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/TempTrendYValueFormatter;", "Lonq;", "", "value", "", "getFormattedValue", "(F)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TempTrendYValueFormatter extends onq {
    @Override // defpackage.onq
    @NotNull
    public String getFormattedValue(float value) {
        Logger.d("TempTrendYValueFormatter", "value: " + value);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string = AppUtil.getApp().getString(c0j.hn);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (value == 0.0f) {
            String string2 = ApplicationExtKt.getApplication().getString(c0j.rn);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (value <= 0.0f) {
            return str + string;
        }
        return Marker.ANY_NON_NULL_MARKER + str + string;
    }
}
