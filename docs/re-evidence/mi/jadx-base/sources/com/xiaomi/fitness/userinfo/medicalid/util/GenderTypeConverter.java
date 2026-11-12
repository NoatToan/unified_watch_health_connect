package com.xiaomi.fitness.userinfo.medicalid.util;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/GenderTypeConverter;", "", "<init>", "()V", "convertGenderTypeToDisplayString", "", "genderType", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "sex", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenderTypeConverter {

    @NotNull
    public static final GenderTypeConverter INSTANCE = new GenderTypeConverter();

    private GenderTypeConverter() {
    }

    @NotNull
    public final String convertGenderTypeToDisplayString(@Nullable Integer genderType) {
        if (genderType != null && genderType.intValue() == 0) {
            return ResourceExtKt.getString(o1j.G);
        }
        if (genderType != null && genderType.intValue() == 1) {
            return ResourceExtKt.getString(o1j.d0);
        }
        return (genderType != null && genderType.intValue() == 2) ? ResourceExtKt.getString(o1j.c0) : ResourceExtKt.getString(o1j.e0);
    }

    @NotNull
    public final String convertGenderTypeToDisplayString(@Nullable String sex) {
        if (sex != null && sex.length() != 0) {
            if (Intrinsics.areEqual(sex, "male")) {
                return ResourceExtKt.getString(o1j.d0);
            }
            if (Intrinsics.areEqual(sex, "female")) {
                return ResourceExtKt.getString(o1j.c0);
            }
            return Intrinsics.areEqual(sex, "male") ? ResourceExtKt.getString(o1j.d0) : ResourceExtKt.getString(o1j.e0);
        }
        return ResourceExtKt.getString(o1j.G);
    }
}
