package com.huami.snore.ui.base;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.snore.core.R;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDialogFragment extends AppCompatDialogFragment {
    private static final String d = "BaseDialogFragment";
    private int a = 80;
    private DialogInterface.OnDismissListener b;
    private DialogInterface.OnCancelListener c;

    private ViewGroup b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (hasBackground()) {
            frameLayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.snore_dialog_bg));
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

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.snore_dialog_panel, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
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
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        View viewInitView = initView();
        if (viewInitView == null) {
            return;
        }
        if (!hasPadding()) {
            view.setPadding(0, 0, 0, 0);
            ((ViewGroup) view).addView(viewInitView);
        } else {
            ViewGroup viewGroupB = b();
            viewGroupB.addView(viewInitView);
            ((ViewGroup) view).addView(viewGroupB);
        }
    }

    public void setGravity(int gravity) {
        this.a = gravity;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.c = listener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.b = listener;
    }

    public void show(FragmentManager manager) {
        show(manager, d);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        try {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.i(d, "BaseDialogFragment show Exception : " + e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }
}
