package com.xiaomi.fitness.health.sleep.ui.setting.util;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.c0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/util/RemindTextConverter;", "", "<init>", "()V", "TAG", "", "getRemindTextWithAudioRecordPermCheckIfNeed", "enable", "", "needPermissionCheck", "refreshRunInBgNoRestrictionDisplayTextVew", "", "level", "", "textView", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemindTextConverter {

    @NotNull
    public static final RemindTextConverter INSTANCE = new RemindTextConverter();

    @NotNull
    public static final String TAG = "RemindTextConverter";

    private RemindTextConverter() {
    }

    @NotNull
    public final String getRemindTextWithAudioRecordPermCheckIfNeed(boolean enable, boolean needPermissionCheck) {
        if (needPermissionCheck) {
            return (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.RECORD_AUDIO") && enable) ? ResourceExtKt.getString(c0j.ck) : ResourceExtKt.getString(c0j.bk);
        }
        return enable ? ResourceExtKt.getString(c0j.ck) : ResourceExtKt.getString(c0j.bk);
    }

    public final void refreshRunInBgNoRestrictionDisplayTextVew(int level, @NotNull RightArrowTwoLineTextView textView) {
        int i;
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (level == 0) {
            i = c0j.Bh;
        } else if (level == 1) {
            i = c0j.mk;
        } else if (level != 2) {
            i = level != 3 ? c0j.Ch : c0j.Qj;
        } else {
            i = c0j.dk;
        }
        String string = ResourceExtKt.getString(i);
        Logger.i(TAG, "refreshRunInBgNoRestrictionDisplayTextVew " + string);
        textView.setRemindText(string);
    }
}
