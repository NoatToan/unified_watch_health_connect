package com.xiaomi.fitness.nfc.utils;

import android.text.TextUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.fmg;
import defpackage.o0j;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/NfcExtention;", "", "<init>", "()V", "onErrorShowToast", "", "throwable", "", "getErrorMsg", "", "msg", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcExtention {

    @NotNull
    public static final NfcExtention INSTANCE = new NfcExtention();

    private NfcExtention() {
    }

    @JvmStatic
    @NotNull
    public static final String getErrorMsg(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return INSTANCE.getErrorMsg(throwable.getMessage());
    }

    @JvmStatic
    public static final void onErrorShowToast(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ToastUtil.showLongToast(INSTANCE.getErrorMsg(throwable.getMessage()));
    }

    private final String getErrorMsg(String msg) {
        if (TextUtils.isEmpty(msg)) {
            String string = AppUtil.getApp().getResources().getString(o0j.t2);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String strA = fmg.a(msg);
        Intrinsics.checkNotNull(strA);
        return strA;
    }
}
