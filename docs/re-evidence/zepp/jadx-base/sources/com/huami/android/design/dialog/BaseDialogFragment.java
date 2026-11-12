package com.huami.android.design.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDialogFragment extends AppCompatDialogFragment {
    private static final String d = "BaseDialogFragment";
    private int a = 80;
    private DialogInterface.OnDismissListener b;
    private DialogInterface.OnCancelListener c;

    @NonNull
    private ViewGroup b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (hasBackground()) {
            frameLayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.abcd_dialog_bg));
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!isAdded() || isDetached() || getDialog() == null || !getDialog().isShowing()) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!isAdded() || isDetached() || getDialog() == null || !getDialog().isShowing()) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    public void dismissAnyway() {
        super.dismissAllowingStateLoss();
    }

    public int dpToPxInt(int i) {
        return (int) ViewUtils.dp2px(getContext(), i);
    }

    public int getCustomHorizontalPadding() {
        return 0;
    }

    public int getCustomVerticalPadding() {
        return 0;
    }

    public boolean hasBackground() {
        return true;
    }

    public abstract boolean hasPadding();

    public abstract View initView();

    public boolean isFullScreen() {
        return false;
    }

    public boolean isShowing() {
        return getDialog() != null && getDialog().isShowing();
    }

    public boolean isWidePadding() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.abcd_dialog_panel, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.a;
            attributes.width = -1;
            if (isFullScreen()) {
                attributes.height = -1;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        View viewInitView = initView();
        if (viewInitView == null) {
            return;
        }
        if (!hasPadding()) {
            view.setPadding(0, 0, 0, 0);
            ((ViewGroup) view).addView(viewInitView);
            return;
        }
        if (this.a == 17) {
            view.setPadding(dpToPxInt(30), 0, dpToPxInt(30), 0);
        }
        if (isWidePadding()) {
            int iDpToPxInt = dpToPxInt(16);
            view.setPadding(iDpToPxInt, 0, iDpToPxInt, iDpToPxInt);
        } else if (getCustomHorizontalPadding() > 0 || getCustomVerticalPadding() > 0) {
            int customHorizontalPadding = getCustomHorizontalPadding();
            int customVerticalPadding = getCustomVerticalPadding();
            view.setPadding(dpToPxInt(customHorizontalPadding), dpToPxInt(customVerticalPadding), dpToPxInt(customHorizontalPadding), dpToPxInt(customVerticalPadding));
        }
        ViewGroup viewGroupB = b();
        viewGroupB.addView(viewInitView);
        ((ViewGroup) view).addView(viewGroupB);
    }

    public void setGravity(int i) {
        this.a = i;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.c = onCancelListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.b = onDismissListener;
    }

    public void show(FragmentManager fragmentManager) {
        show(fragmentManager, d);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        try {
            if (fragmentManager.isDestroyed()) {
                return;
            }
            fragmentManager.beginTransaction().remove(this).commit();
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
