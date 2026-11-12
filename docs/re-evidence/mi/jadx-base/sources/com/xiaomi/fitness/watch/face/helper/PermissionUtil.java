package com.xiaomi.fitness.watch.face.helper;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.av6;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/PermissionUtil;", "", "<init>", "()V", "showPrivacyStorageDialog", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "callback", "Lcom/xiaomi/fitness/watch/face/helper/PermissionUtil$OnDialogItemClickListener;", "OnDialogItemClickListener", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionUtil {

    @NotNull
    public static final PermissionUtil INSTANCE = new PermissionUtil();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/PermissionUtil$OnDialogItemClickListener;", "", "onPositiveClick", "", "onNegativeClick", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDialogItemClickListener {
        void onNegativeClick();

        void onPositiveClick();
    }

    private PermissionUtil() {
    }

    public final void showPrivacyStorageDialog(@NotNull FragmentActivity activity, @NotNull final OnDialogItemClickListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CommonDialog commonDialogCreate = new CommonDialog.c("face_privacy_storage").setDialogTitle(p1j.y0).setDialogDescription(p1j.x0).setPositiveText(p1j.common_allow).setNegativeText(p1j.common_reject).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.helper.PermissionUtil.showPrivacyStorageDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    callback.onNegativeClick();
                } else {
                    if (which != -1) {
                        return;
                    }
                    callback.onPositiveClick();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }
}
