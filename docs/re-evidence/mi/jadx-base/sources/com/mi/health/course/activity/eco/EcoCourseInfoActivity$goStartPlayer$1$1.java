package com.mi.health.course.activity.eco;

import android.content.DialogInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mi.health.course.activity.eco.EcoCourseInfoActivity$goStartPlayer$1$1;
import defpackage.av6;
import defpackage.czi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/mi/health/course/activity/eco/EcoCourseInfoActivity$goStartPlayer$1$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoCourseInfoActivity$goStartPlayer$1$1 extends av6 {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ EcoCourseInfoActivity this$0;

    public EcoCourseInfoActivity$goStartPlayer$1$1(EcoCourseInfoActivity ecoCourseInfoActivity, Function0<Unit> function0) {
        this.this$0 = ecoCourseInfoActivity;
        this.$callback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(EcoCourseInfoActivity this$0, Function0 callback, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new EcoCourseInfoActivity$goStartPlayer$1$1$onDialogClick$1$1(callback, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        if (dialog != null) {
            dialog.dismiss();
        }
        if (which == -1) {
            this.this$0.dismissDialogForce();
            this.this$0.showLoading(czi.d, false);
            EcoCourseInfoVM ecoCourseInfoVMAccess$getMViewModel = EcoCourseInfoActivity.access$getMViewModel(this.this$0);
            int switch_on = EcoCourseInfoActivity.access$getMViewModel(this.this$0).getSWITCH_ON();
            final EcoCourseInfoActivity ecoCourseInfoActivity = this.this$0;
            final Function0<Unit> function0 = this.$callback;
            ecoCourseInfoVMAccess$getMViewModel.setEcoSettingItem(5, switch_on, new Function1() { // from class: gn7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseInfoActivity$goStartPlayer$1$1.onDialogClick$lambda$0(ecoCourseInfoActivity, function0, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
