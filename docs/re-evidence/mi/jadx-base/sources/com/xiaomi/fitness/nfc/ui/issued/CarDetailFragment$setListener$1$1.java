package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CarDetailFragment$setListener$1$1;
import defpackage.av6;
import defpackage.o0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/nfc/ui/issued/CarDetailFragment$setListener$1$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CarDetailFragment$setListener$1$1 extends av6 {
    final /* synthetic */ CarDetailFragment this$0;

    public CarDetailFragment$setListener$1$1(CarDetailFragment carDetailFragment) {
        this.this$0 = carDetailFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(CarDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deleteSuccess();
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$1(CarDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showLongToast(msg);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        if (which == -2) {
            if (dialog != null) {
                dialog.dismiss();
            }
        } else {
            if (which != -1) {
                return;
            }
            if (dialog != null) {
                dialog.dismiss();
            }
            this.this$0.showLoading(o0j.Z2, false);
            CarCardViewModel carCardViewModelAccess$getMViewModel = CarDetailFragment.access$getMViewModel(this.this$0);
            CardWrapper cardWrapper = this.this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            final CarDetailFragment carDetailFragment = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: ol3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CarDetailFragment$setListener$1$1.onDialogClick$lambda$0(carDetailFragment);
                }
            };
            final CarDetailFragment carDetailFragment2 = this.this$0;
            carCardViewModelAccess$getMViewModel.removeCard(cardWrapper, function0, new Function1() { // from class: pl3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CarDetailFragment$setListener$1$1.onDialogClick$lambda$1(carDetailFragment2, (String) obj);
                }
            });
        }
    }
}
