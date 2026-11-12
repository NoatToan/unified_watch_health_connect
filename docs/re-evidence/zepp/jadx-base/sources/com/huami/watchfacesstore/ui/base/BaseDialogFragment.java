package com.huami.watchfacesstore.ui.base;

import android.annotation.SuppressLint;
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
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ui.base.BaseDialogFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseDialogFragment extends AppCompatDialogFragment {
    private static final String d = "BaseDialogFragment";
    private int a = 80;
    private DialogInterface.OnDismissListener b;
    private DialogInterface.OnCancelListener c;

    private ViewGroup h() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (hasBackground()) {
            frameLayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.wf_dialog_bg));
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i() {
        return "onCreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "onCreateView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "onStart";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "onViewCreated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "show";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(Exception exc) {
        return "BaseDialogFragment show Exception : " + exc.getMessage();
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
        HMLog.debug(d, new Function0() { // from class: jq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDialogFragment.i();
            }
        });
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    @SuppressLint({"InflateParams"})
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.debug(d, new Function0() { // from class: lq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDialogFragment.j();
            }
        });
        return inflater.inflate(R.layout.wf_dialog_panel, (ViewGroup) null);
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
        HMLog.debug(d, new Function0() { // from class: mq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDialogFragment.k();
            }
        });
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
        HMLog.debug(d, new Function0() { // from class: kq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDialogFragment.l();
            }
        });
        View viewInitView = initView();
        if (viewInitView == null) {
            return;
        }
        if (!hasPadding()) {
            view.setPadding(0, 0, 0, 0);
            ((ViewGroup) view).addView(viewInitView);
        } else {
            ViewGroup viewGroupH = h();
            viewGroupH.addView(viewInitView);
            ((ViewGroup) view).addView(viewGroupH);
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
        HMLog.debug(d, new Function0() { // from class: iq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseDialogFragment.m();
            }
        });
        try {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.info(d, new Function0() { // from class: hq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseDialogFragment.n(e);
                }
            });
            e.printStackTrace();
        }
    }
}
