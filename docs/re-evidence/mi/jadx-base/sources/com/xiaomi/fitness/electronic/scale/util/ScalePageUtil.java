package com.xiaomi.fitness.electronic.scale.util;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivityKt;
import defpackage.kb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ScalePageUtil;", "", "<init>", "()V", "WEIGHT_ACTIVITY_IS_START", "", "getWEIGHT_ACTIVITY_IS_START", "()Z", "setWEIGHT_ACTIVITY_IS_START", "(Z)V", "goVmData", "", Column.ACCOUNT_ID, "", "showNoBodyFatErrorDialog", "isSelectedTop", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScalePageUtil {

    @NotNull
    public static final ScalePageUtil INSTANCE = new ScalePageUtil();
    private static boolean WEIGHT_ACTIVITY_IS_START;

    private ScalePageUtil() {
    }

    public static /* synthetic */ void goVmData$default(ScalePageUtil scalePageUtil, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        scalePageUtil.goVmData(j, z, z2);
    }

    public final boolean getWEIGHT_ACTIVITY_IS_START() {
        return WEIGHT_ACTIVITY_IS_START;
    }

    public final void goVmData(long accountId, boolean showNoBodyFatErrorDialog, boolean isSelectedTop) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        kb.c().a("/electronic/activity/VirtualMemberData").withSerializable("local_date", localDateNow).withLong("account_id", accountId).withBoolean("showNoBodyFatErrorDialog", showNoBodyFatErrorDialog).withBoolean(VirtualMemberDataActivityKt.BUNDLE_PARAMS_SELECT_TOP, isSelectedTop).navigation();
    }

    public final void setWEIGHT_ACTIVITY_IS_START(boolean z) {
        WEIGHT_ACTIVITY_IS_START = z;
    }
}
