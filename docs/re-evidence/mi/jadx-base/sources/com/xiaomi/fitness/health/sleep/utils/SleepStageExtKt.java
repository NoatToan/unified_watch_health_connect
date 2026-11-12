package com.xiaomi.fitness.health.sleep.utils;

import android.graphics.drawable.Drawable;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.n9f;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "type", "Landroid/graphics/drawable/Drawable;", "getItemDrawableByType", "(I)Landroid/graphics/drawable/Drawable;", "getColorResIdByType", "(I)I", "", "getNameByType", "(I)Ljava/lang/String;", "", "hasRemData", "Ln9f;", "getNormaValueByType", "(IZ)Ln9f;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class SleepStageExtKt {
    public static final int getColorResIdByType(int i) {
        if (i == 0) {
            return iji.j3;
        }
        if (i == 1) {
            return iji.g3;
        }
        if (i != 2) {
            return i != 3 ? iji.A3 : iji.e3;
        }
        return iji.i3;
    }

    @Nullable
    public static final Drawable getItemDrawableByType(int i) {
        if (i == 0) {
            return AppUtil.getApp().getDrawable(pni.t3);
        }
        if (i == 1) {
            return AppUtil.getApp().getDrawable(pni.p3);
        }
        if (i != 2) {
            return i != 3 ? AppUtil.getApp().getDrawable(pni.t3) : AppUtil.getApp().getDrawable(pni.n3);
        }
        return AppUtil.getApp().getDrawable(pni.r3);
    }

    @NotNull
    public static final String getNameByType(int i) {
        if (i == 0) {
            String string = ApplicationExtKt.getApplication().getString(c0j.Dk);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i == 1) {
            String string2 = ApplicationExtKt.getApplication().getString(c0j.Nf);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = ApplicationExtKt.getApplication().getString(c0j.lk);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 3) {
            return "";
        }
        String string4 = ApplicationExtKt.getApplication().getString(c0j.cf);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    @NotNull
    public static final n9f getNormaValueByType(int i, boolean z) {
        if (i == 0) {
            return new n9f(2.0f, 0.0f);
        }
        if (i == 1) {
            return new n9f(30.0f, 10.0f);
        }
        if (i != 2) {
            return i != 3 ? new n9f(0.0f, 0.0f) : new n9f(40.0f, 20.0f);
        }
        return z ? new n9f(60.0f, 20.0f) : new n9f(80.0f, 60.0f);
    }
}
