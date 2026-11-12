package com.xiaomi.fitness.nfc.issuer;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.o0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"getSelectWay", "", "type", "nfc_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardActiveWayKt {
    @NotNull
    public static final String getSelectWay(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, CardActiveWay.VISA_SMS.getType()) || Intrinsics.areEqual(type, CardActiveWay.MASTERCARD_SMS.getType())) {
            String string = ApplicationExtKt.getApplication().getString(o0j.I5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (Intrinsics.areEqual(type, CardActiveWay.VISA_EMAIL.getType()) || Intrinsics.areEqual(type, CardActiveWay.MASTERCARD_EMAIL.getType())) {
            String string2 = ApplicationExtKt.getApplication().getString(o0j.h3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER2.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER3.getType())) {
            String string3 = ApplicationExtKt.getApplication().getString(o0j.f2);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (!Intrinsics.areEqual(type, CardActiveWay.MASTER_APP_TO_APPLICATION.getType()) && !Intrinsics.areEqual(type, CardActiveWay.VISA_APP_TO_APPLICATION2.getType())) {
            return "";
        }
        String string4 = ApplicationExtKt.getApplication().getString(o0j.e2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }
}
