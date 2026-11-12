package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment$showPopupMenu$1$3;
import defpackage.av6;
import defpackage.c0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailFragment$showPopupMenu$1$3", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmDetailFragment$showPopupMenu$1$3 extends av6 {
    final /* synthetic */ SleepRhythmDetailFragment this$0;

    public SleepRhythmDetailFragment$showPopupMenu$1$3(SleepRhythmDetailFragment sleepRhythmDetailFragment) {
        this.this$0 = sleepRhythmDetailFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$1$lambda$0(SleepRhythmDetailFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.hideLoading();
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, c0j.ui);
            }
            this$0.finish();
        } else {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        SleepRhythmReport sleepRhythmReport;
        super.onDialogClick(dialogName, dialog, which);
        if (which == -2) {
            if (dialog != null) {
                dialog.dismiss();
            }
        } else if (which == -1 && (sleepRhythmReport = this.this$0.sleepRhythmReport) != null) {
            final SleepRhythmDetailFragment sleepRhythmDetailFragment = this.this$0;
            SleepRhythmDetailFragment.access$getMViewModel(sleepRhythmDetailFragment).deleteSleepRhythmReport(sleepRhythmReport);
            SleepRhythmDetailFragment.access$getMViewModel(sleepRhythmDetailFragment).getDeleteDataSuccess().observe(sleepRhythmDetailFragment.getViewLifecycleOwner(), new SleepRhythmDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: otm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepRhythmDetailFragment$showPopupMenu$1$3.onDialogClick$lambda$1$lambda$0(sleepRhythmDetailFragment, (Boolean) obj);
                }
            }));
        }
    }
}
