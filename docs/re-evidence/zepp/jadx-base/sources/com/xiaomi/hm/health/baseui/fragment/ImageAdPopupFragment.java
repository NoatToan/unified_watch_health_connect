package com.xiaomi.hm.health.baseui.fragment;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseui.RoundedCornersImageView;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes19.dex */
public class ImageAdPopupFragment extends DialogFragment {
    public static final String ARG_AD_DESC = "ad_desc";
    public static final String ARG_AD_TAR_MODE = "ad_tar_mode";
    public static final String ARG_AD_TITLE = "ad_title";
    public static final String ARG_AD_TRAGETS = "ad_targets";
    private static final String h = "ImageAdPopupFragment";
    private static final String i = "com.xiaomi.hm.health";
    private static final String j = "com.huami.web.container.WebActivity";
    private static final String k = "com.xiaomi.hm.health.action.WEB_URL";
    private String a;
    private String b;
    private String c;
    private int d;
    private Bitmap e;
    private AdClickedListener f;
    private DialogInterface.OnDismissListener g;

    public interface AdClickedListener {
        void onAdClicked();
    }

    private ViewGroup c() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (hasBackground()) {
            frameLayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ad_popup_dialog));
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        if (this.d != 1) {
            return;
        }
        AdClickedListener adClickedListener = this.f;
        if (adClickedListener != null) {
            adClickedListener.onAdClicked();
        }
        f();
    }

    private void f() {
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        ComponentName componentName = new ComponentName("com.xiaomi.hm.health", j);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setComponent(componentName);
        intent.putExtra(k, this.c);
        getContext().startActivity(intent);
        dismissAllowingStateLoss();
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
        return false;
    }

    public boolean hasPadding() {
        return false;
    }

    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(TextUtils.isEmpty(this.a) ? R.layout.view_status_popup : R.layout.view_ad_popup, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.sport_ad_layout);
        int i2 = R.id.sport_ad_close;
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(i2);
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) viewInflate.findViewById(R.id.sport_ad_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.sport_ad_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.sport_ad_text);
        if (this.e != null) {
            viewFindViewById.setVisibility(0);
            imageButton.setVisibility(0);
            roundedCornersImageView.setSrcBitmap(this.e);
        }
        if (!TextUtils.isEmpty(this.b)) {
            textView.setText(this.b);
        }
        if (!TextUtils.isEmpty(this.a)) {
            textView2.setText(this.a);
        }
        viewInflate.findViewById(i2).setOnClickListener(new View.OnClickListener() { // from class: tc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: sc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getString(ARG_AD_DESC);
            this.b = arguments.getString(ARG_AD_TITLE);
            this.c = arguments.getString("ad_targets");
            this.d = arguments.getInt("ad_tar_mode");
        }
        setStyle(0, R.style.Theme_Img_Ad);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_ad_popup, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.g;
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
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        View viewInitView = initView();
        if (viewInitView == null) {
            return;
        }
        if (!hasPadding()) {
            view.setPadding(0, 0, 0, 0);
            ((ViewGroup) view).addView(viewInitView);
        } else {
            ViewGroup viewGroupC = c();
            viewGroupC.addView(viewInitView);
            ((ViewGroup) view).addView(viewGroupC);
        }
    }

    public void setAdClickedListener(AdClickedListener adClickedListener) {
        this.f = adClickedListener;
    }

    public void setAdImage(Bitmap bitmap) {
        this.e = bitmap;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.g = onDismissListener;
    }

    public void show(FragmentManager fragmentManager) {
        show(fragmentManager, h);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        try {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, str);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.i(h, "BaseDialogFragment show Exception : " + e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }
}
