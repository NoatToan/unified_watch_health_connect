package com.garmin.android.apps.connectmobile;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dialog f28722b;

    public /* synthetic */ a0(Dialog dialog, int i14) {
        this.f28721a = i14;
        this.f28722b = dialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i14 = this.f28721a;
        Dialog dialog = this.f28722b;
        switch (i14) {
            case 0:
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
                bottomSheetDialog.getBehavior().setState(3);
                bottomSheetDialog.getBehavior().setSkipCollapsed(true);
                break;
            default:
                uj1.l.a aVar = uj1.l.f171535g;
                BottomSheetDialog bottomSheetDialog2 = (BottomSheetDialog) dialog;
                bottomSheetDialog2.getBehavior().setHideable(false);
                bottomSheetDialog2.getBehavior().setDraggable(false);
                bottomSheetDialog2.getBehavior().setState(3);
                break;
        }
    }
}
