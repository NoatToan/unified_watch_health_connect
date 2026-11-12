package com.xiaomi.wearable.wear.utils;

import android.os.Build;
import com.xiaomi.fitness.device.manager.bean.Product;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"isSupportLargeMtu", "", "model", "", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceExtKt {
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public static final boolean isSupportLargeMtu(@Nullable String str) {
        String DEVICE;
        boolean z;
        if (str == null || (DEVICE = Build.DEVICE) == null) {
            return true;
        }
        if (Intrinsics.areEqual(str, Product.ZILONG_MODEL) || Intrinsics.areEqual(str, Product.MULAN_MODEL)) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = DEVICE.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "hennessy")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return !z;
    }
}
