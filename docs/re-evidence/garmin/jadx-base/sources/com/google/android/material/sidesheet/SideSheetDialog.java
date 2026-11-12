package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R.style.Theme_Material3_Light_SideSheetDialog;

    public SideSheetDialog(Context context, int i14) {
        super(context, i14, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
        sheet.addCallback(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onSlide(View view2, float f14) {
            }

            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onStateChanged(View view2, int i14) {
                if (i14 == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public SideSheetBehavior<? extends View> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        h.z("The view is not associated with SideSheetBehavior");
        return null;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public Sheet<SideSheetCallback> getBehaviorFromSheet(FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getDialogId() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getLayoutResId() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z14) {
        super.setCancelable(z14);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z14) {
        super.setCanceledOnTouchOutside(z14);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, i.l, b.i, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i14) {
        super.setContentView(i14);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z14) {
        super.setDismissWithSheetAnimationEnabled(z14);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(int i14) {
        super.setSheetEdge(i14);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, i.l, b.i, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view2) {
        super.setContentView(view2);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, i.l, b.i, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view2, layoutParams);
    }

    public SideSheetDialog(Context context) {
        this(context, 0);
    }
}
