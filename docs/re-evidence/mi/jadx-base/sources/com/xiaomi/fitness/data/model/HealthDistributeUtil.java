package com.xiaomi.fitness.data.model;

import android.content.Context;
import defpackage.c0j;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/data/model/HealthDistributeUtil;", "", "<init>", "()V", "getTypeName", "", "context", "Landroid/content/Context;", "type", "", "getImageTypeResourceId", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthDistributeUtil {

    @NotNull
    public static final HealthDistributeUtil INSTANCE = new HealthDistributeUtil();

    private HealthDistributeUtil() {
    }

    @JvmStatic
    public static final int getImageTypeResourceId(int type) {
        switch (type) {
            case 0:
                return pni.z3;
            case 1:
            case 5:
            case 8:
            default:
                return -1;
            case 2:
                return pni.l;
            case 3:
                return pni.y3;
            case 4:
                return pni.k2;
            case 6:
                return pni.b2;
            case 7:
                return pni.I1;
            case 9:
                return pni.d0;
            case 10:
                return pni.J;
            case 11:
                return pni.J;
        }
    }

    @JvmStatic
    @Nullable
    public static final String getTypeName(@NotNull Context context, int type) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        switch (type) {
            case 3:
                i = c0j.T6;
                break;
            case 4:
                i = c0j.xl;
                break;
            case 5:
            case 8:
            default:
                i = -1;
                break;
            case 6:
                i = c0j.Zj;
                break;
            case 7:
                i = c0j.D1;
                break;
            case 9:
                i = c0j.to;
                break;
            case 10:
                i = c0j.h0;
                break;
            case 11:
                i = c0j.s0;
                break;
        }
        return context.getString(i);
    }
}
