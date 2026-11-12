package com.xiaomi.fitness.userinfo.medicalid.util;

import android.util.Pair;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.ehi;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/BloodTypeConverter;", "", "<init>", "()V", "SUM_NORMAL_TYPE", "", "getUniversalBloodType", "normal", "rh", "getPairBloodType", "Landroid/util/Pair;", "bloodType", "convertBloodTypeToDisplayString", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodTypeConverter {

    @NotNull
    public static final BloodTypeConverter INSTANCE = new BloodTypeConverter();
    private static final int SUM_NORMAL_TYPE = 4;

    private BloodTypeConverter() {
    }

    @Nullable
    public final String convertBloodTypeToDisplayString(int bloodType) {
        String[] stringArray = AppUtil.getApp().getResources().getStringArray(ehi.f16649b);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return bloodType == 0 ? ResourceExtKt.getString(o1j.G) : ResourceExtKt.getString(o1j.v, stringArray[bloodType - 1]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final Pair<Integer, Integer> getPairBloodType(int bloodType) {
        int i = 3;
        int i2 = 0;
        switch (bloodType) {
            case 0:
            default:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 1;
                i2 = i;
                break;
            case 6:
                i = 1;
                i2 = 2;
                break;
            case 7:
                i2 = 1;
                i = 2;
                break;
            case 8:
                i = 2;
                i2 = i;
                break;
            case 9:
                i2 = 1;
                break;
            case 10:
                i2 = 2;
                break;
            case 11:
                i = 4;
                i2 = 1;
                break;
            case 12:
                i = 4;
                i2 = 2;
                break;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final int getUniversalBloodType(int normal, int rh) {
        if (normal == 0 && rh == 0) {
            return 0;
        }
        return rh == 0 ? normal : ((normal - 1) * 2) + 4 + rh;
    }
}
