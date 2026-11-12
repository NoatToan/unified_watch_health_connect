package com.xiaomi.fitness.sport.route.detail;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.xiaomi.fitness.sport.route.detail.RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import defpackage.av6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport/route/detail/RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1 extends av6 {
    final /* synthetic */ RouteDetailActivity this$0;

    public RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1(RouteDetailActivity routeDetailActivity) {
        this.this$0 = routeDetailActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(RouteDetailActivity this$0, int i, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 1) {
            RouteDetailActivity.access$getMBinding(this$0).O.getRoot().setVisibility(0);
        } else if (i == 2) {
            ProgressBar progressBar = RouteDetailActivity.access$getMBinding(this$0).O.A;
            Intrinsics.checkNotNull(num);
            progressBar.setProgress(num.intValue());
            RouteDetailActivity.access$getMBinding(this$0).O.B.setText(num + "%");
        } else if (i == 3 || i == 4) {
            RouteDetailActivity.access$getMBinding(this$0).O.getRoot().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    @SuppressLint({"SetTextI18n"})
    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
        super.onDialogClick(dialogName, dialog, which);
        if (which == -2) {
            if (dialog != null) {
                dialog.dismiss();
            }
        } else {
            if (which != -1) {
                return;
            }
            RunningRouteDetailViewModel runningRouteDetailViewModelAccess$getMViewModel = RouteDetailActivity.access$getMViewModel(this.this$0);
            RouteDetailActivity routeDetailActivity = this.this$0;
            Bitmap bitmapBuildBitmap = routeDetailActivity.buildBitmap(routeDetailActivity.trackList);
            final RouteDetailActivity routeDetailActivity2 = this.this$0;
            runningRouteDetailViewModelAccess$getMViewModel.sendToDevice(bitmapBuildBitmap, new Function2() { // from class: ryk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1.onDialogClick$lambda$0(routeDetailActivity2, ((Integer) obj).intValue(), (Integer) obj2);
                }
            });
        }
    }
}
