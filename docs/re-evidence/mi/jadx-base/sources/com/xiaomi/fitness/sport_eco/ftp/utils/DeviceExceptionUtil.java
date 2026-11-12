package com.xiaomi.fitness.sport_eco.ftp.utils;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.e1j;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/utils/DeviceExceptionUtil;", "", "<init>", "()V", "getExceptionTitleByCode", "", "code", "", "getExceptionDesByCode", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceExceptionUtil {

    @NotNull
    public static final DeviceExceptionUtil INSTANCE = new DeviceExceptionUtil();

    private DeviceExceptionUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String getExceptionDesByCode(int code) {
        if (code == 1) {
            return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.K0));
        }
        switch (code) {
            case 4:
                return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.L0));
            case 5:
                return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.M0));
            case 6:
                return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.N0));
            case 7:
                return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.O0));
            case 8:
                return ResourceExtKt.getString(e1j.Q0, ResourceExtKt.getString(e1j.P0));
            default:
                return ResourceExtKt.getString(e1j.v1);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getExceptionTitleByCode(int code) {
        if (code == 1) {
            return ResourceExtKt.getString(e1j.R0);
        }
        switch (code) {
            case 4:
                return ResourceExtKt.getString(e1j.S0);
            case 5:
                return ResourceExtKt.getString(e1j.T0);
            case 6:
                return ResourceExtKt.getString(e1j.U0);
            case 7:
                return ResourceExtKt.getString(e1j.V0);
            case 8:
                return ResourceExtKt.getString(e1j.W0);
            default:
                return ResourceExtKt.getString(e1j.w1);
        }
    }
}
