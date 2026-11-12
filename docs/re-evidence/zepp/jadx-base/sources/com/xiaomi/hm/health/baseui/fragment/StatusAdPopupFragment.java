package com.xiaomi.hm.health.baseui.fragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes19.dex */
public class StatusAdPopupFragment extends DialogFragment {
    public static final String ARG_AD_TAR_MODE = "ad_tar_mode";
    public static final String ARG_AD_TRAGETS = "ad_targets";
    private static final String h = "StatusAdPopupFragment";
    private String a;
    private int b;
    private Bitmap c;
    private AdClickedListener d;
    private AdClosedListener e;
    private DialogInterface.OnDismissListener f;
    private DialogInterface.OnCancelListener g;

    public interface AdClickedListener {
        void onAdClicked(int adTarMode, String adTargets);
    }

    public interface AdClosedListener {
        void onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        dismissAllowingStateLoss();
        AdClosedListener adClosedListener = this.e;
        if (adClosedListener != null) {
            adClosedListener.onAdClosed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        AdClickedListener adClickedListener = this.d;
        if (adClickedListener != null) {
            adClickedListener.onAdClicked(this.b, this.a);
            dismissAllowingStateLoss();
        }
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

    public void initView(Dialog view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.sport_ad_close);
        ImageView imageView = (ImageView) view.findViewById(R.id.sport_ad_image);
        if (this.c != null) {
            imageButton.setVisibility(0);
            imageView.setImageBitmap(this.c);
        }
        view.findViewById(R.id.sport_ad_close).setOnClickListener(new View.OnClickListener() { // from class: tf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.c(view2);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: uf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.d(view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getString("ad_targets");
            this.b = arguments.getInt("ad_tar_mode");
        }
        setStyle(0, R.style.Theme_Img_Ad);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getContext());
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().requestFeature(1);
        }
        dialog.setContentView(R.layout.view_status_popup);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    public void setAdClickedListener(AdClickedListener mAdClickedListener) {
        this.d = mAdClickedListener;
    }

    public void setAdClosedListener(AdClosedListener mAdClosedListener) {
        this.e = mAdClosedListener;
    }

    public void setAdImage(Bitmap img) {
        this.c = img;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.g = listener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.f = listener;
    }

    @Override // androidx.fragment.app.DialogFragment
    @SuppressLint({"RestrictedApi"})
    public void setupDialog(@NonNull Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        initView(dialog);
    }

    public void show(FragmentManager manager) {
        show(manager, h);
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
            HMLog.i(h, "BaseDialogFragment show Exception : " + e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }
}
