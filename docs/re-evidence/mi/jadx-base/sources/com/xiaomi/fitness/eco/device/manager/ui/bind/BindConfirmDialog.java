package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.fui;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindConfirmDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "num", "", "<init>", "(Ljava/lang/String;)V", "getNum", "()Ljava/lang/String;", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindConfirmDialog extends CommonDialog<DialogParams> {

    @NotNull
    private final String num;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindConfirmDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "num", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {

        @NotNull
        private final String num;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:17:0x003f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 int, still in use, count: 2, list:
          (r0v2 int) from 0x0019: IF  (r0v2 int) != (-1798122615 int)  -> B:4:0x001b A[HIDDEN]
          (r0v2 int) from 0x001e: IF  (r0v2 int) != (-1454035281 int)  -> B:6:0x0020 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        public Builder(@NotNull String num) {
            int i;
            super("eco_bind_device_confirm_button");
            Intrinsics.checkNotNullParameter(num, "num");
            this.num = num;
            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            if (iHashCode != -1798122615) {
                if (iHashCode != -1454035281) {
                    switch (key_gym_local_sport_type) {
                        case "yunmai.jmprope.sr803":
                        case "yunmai.jmprope.sr804":
                        case "yunmai.jmprope.sr805":
                            i = fui.c;
                            break;
                        default:
                            i = fui.f18252a;
                            break;
                    }
                } else if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                    i = fui.f18252a;
                } else {
                    i = fui.f18252a;
                }
            } else if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                i = fui.f18253b;
            } else {
                i = fui.f18252a;
            }
            setCustomLayoutId(i);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new BindConfirmDialog(this.num);
        }
    }

    @JvmOverloads
    public BindConfirmDialog(@NotNull String num) {
        Intrinsics.checkNotNullParameter(num, "num");
        this.num = num;
    }

    @NotNull
    public final String getNum() {
        return this.num;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
    }
}
