package com.xiaomi.fitness.userinfo.medicalid.util;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.user.info.export.medicalid.DonorType;
import defpackage.o1j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/DonorTypeConverter;", "", "<init>", "()V", "convertDonorTypeToDisplayString", "", "donorType", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DonorTypeConverter {

    @NotNull
    public static final DonorTypeConverter INSTANCE = new DonorTypeConverter();

    private DonorTypeConverter() {
    }

    @NotNull
    public final String convertDonorTypeToDisplayString(@DonorType @Nullable Integer donorType) {
        if (donorType != null && donorType.intValue() == 0) {
            return ResourceExtKt.getString(o1j.G);
        }
        if (donorType != null && donorType.intValue() == 1) {
            return ResourceExtKt.getString(o1j.w1);
        }
        return (donorType != null && donorType.intValue() == 2) ? ResourceExtKt.getString(o1j.u0) : ResourceExtKt.getString(o1j.G);
    }
}
