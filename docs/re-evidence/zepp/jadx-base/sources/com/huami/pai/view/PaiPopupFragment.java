package com.huami.pai.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.lib.R;
import com.huami.pai.view.PaiPopupFragment;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001c\u001a\u00020\u0002H\u0004R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/huami/pai/view/PaiPopupFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "", "hasBackground", "onStart", "dismiss", "dismissAllowingStateLoss", "Landroidx/fragment/app/FragmentManager;", "manager", "show", "", "tag", "Lcom/huami/pai/view/PaiPopupFragment$OnCheckedListener;", "onCheckedListener", "setCheckedListener", "initView", "", "a", LogUtil.I, "paiTotal", "b", "paiDaily", "c", "Lcom/huami/pai/view/PaiPopupFragment$OnCheckedListener;", "e", "()Landroid/view/ViewGroup;", "contentLayout", "<init>", "()V", "Companion", "OnCheckedListener", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiPopupFragment extends DialogFragment {

    @NotNull
    public static final String ARG_PAI_DAILY = "ARG_PAI_DAILY";

    @NotNull
    public static final String ARG_PAI_TOTAL = "ARG_PAI_TOTAL";

    @NotNull
    private static final String d = "PaiPopupFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int paiTotal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int paiDaily;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnCheckedListener onCheckedListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/pai/view/PaiPopupFragment$OnCheckedListener;", "", "", "isChecked", "", "onChecked", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface OnCheckedListener {
        void onChecked(boolean isChecked);
    }

    private final ViewGroup e() {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        if (hasBackground()) {
            frameLayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.pai_bg_popup_dialog));
        }
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PaiPopupFragment paiPopupFragment, View view) {
        paiPopupFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PaiPopupFragment paiPopupFragment, View view) {
        paiPopupFragment.dismiss();
    }

    private final void h(View view) {
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.pai_pop_title);
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) view.findViewById(R.id.pai_circle_text);
        TypefaceTextView typefaceTextView3 = (TypefaceTextView) view.findViewById(R.id.pai_circle_text_sub);
        ImageView imageView = (ImageView) view.findViewById(R.id.pai_pop_circle_img);
        TypefaceTextView typefaceTextView4 = (TypefaceTextView) view.findViewById(R.id.pai_circle_msg);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pai_pop_progress);
        TypefaceTextView typefaceTextView5 = (TypefaceTextView) view.findViewById(R.id.pai_low_text);
        TypefaceTextView typefaceTextView6 = (TypefaceTextView) view.findViewById(R.id.pai_med_text);
        TypefaceTextView typefaceTextView7 = (TypefaceTextView) view.findViewById(R.id.pai_high_text);
        final CheckBox checkBox = (CheckBox) view.findViewById(R.id.pai_pop_check);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tr5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PaiPopupFragment.i(this.a, compoundButton, z);
            }
        });
        int i = this.paiTotal;
        final int i2 = 100;
        if (i >= 30 && i < 50) {
            typefaceTextView.setText(R.string.pai_v2_pop_perpect_title);
            typefaceTextView2.setText(String.valueOf(30));
            typefaceTextView4.setText(getString(R.string.pai_v2_pop_perpect_msg));
            typefaceTextView5.setText(String.valueOf(30));
            typefaceTextView6.setText(String.valueOf(50));
            typefaceTextView7.setText(String.valueOf(100));
            progressBar.setProgress(this.paiTotal - 30);
            typefaceTextView5.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.pai_text_bg_round_deep));
            typefaceTextView5.setTextColor(ContextCompat.getColor(requireContext(), R.color.pai_pop_text_color));
            i2 = 30;
        } else if (i < 50 || i >= 100) {
            view.setBackgroundResource(R.drawable.pai_pop_bg_round_100);
            typefaceTextView.setText(R.string.pai_v2_pop_reach_goal_title);
            typefaceTextView2.setText(String.valueOf(100));
            Context contextRequireContext = requireContext();
            int i3 = R.color.pai_pop_text_color_max;
            typefaceTextView2.setTextColor(ContextCompat.getColor(contextRequireContext, i3));
            typefaceTextView3.setTextColor(ContextCompat.getColor(requireContext(), i3));
            imageView.setImageResource(R.drawable.pai_max_circle_bg);
            typefaceTextView4.setText(getString(R.string.pai_v2_pop_reach_goal_msg));
            typefaceTextView5.setText(String.valueOf(30));
            typefaceTextView6.setText(String.valueOf(50));
            typefaceTextView7.setText(String.valueOf(100));
            progressBar.setProgress(70);
            typefaceTextView7.setTextColor(ContextCompat.getColor(requireContext(), i3));
            Context contextRequireContext2 = requireContext();
            int i4 = R.drawable.pai_text_bg_round_deep;
            typefaceTextView7.setBackground(ContextCompat.getDrawable(contextRequireContext2, i4));
            typefaceTextView6.setBackground(ContextCompat.getDrawable(requireContext(), i4));
            typefaceTextView6.setTextColor(ContextCompat.getColor(requireContext(), i3));
            typefaceTextView5.setBackground(ContextCompat.getDrawable(requireContext(), i4));
            typefaceTextView5.setTextColor(ContextCompat.getColor(requireContext(), i3));
        } else {
            typefaceTextView.setText(R.string.pai_v2_pop_keep_title);
            typefaceTextView2.setText(String.valueOf(50));
            typefaceTextView4.setText(getString(R.string.pai_v2_pop_keep_msg));
            typefaceTextView5.setText(String.valueOf(30));
            typefaceTextView6.setText(String.valueOf(50));
            typefaceTextView7.setText(String.valueOf(100));
            progressBar.setProgress((this.paiTotal - 50) + 35);
            Context contextRequireContext3 = requireContext();
            int i5 = R.drawable.pai_text_bg_round_deep;
            typefaceTextView6.setBackground(ContextCompat.getDrawable(contextRequireContext3, i5));
            typefaceTextView5.setBackground(ContextCompat.getDrawable(requireContext(), i5));
            Context contextRequireContext4 = requireContext();
            int i6 = R.color.pai_pop_text_color;
            typefaceTextView5.setTextColor(ContextCompat.getColor(contextRequireContext4, i6));
            typefaceTextView6.setTextColor(ContextCompat.getColor(requireContext(), i6));
            i2 = 50;
        }
        view.findViewById(R.id.pai_pop_close).setOnClickListener(new View.OnClickListener() { // from class: sr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PaiPopupFragment.j(this.a, i2, checkBox, view2);
            }
        });
        Analytics.recordEvent(new CountEventBuilder("SPORT_PAI_V").addExtra("tp", "week_window").addExtra("value", String.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PaiPopupFragment paiPopupFragment, CompoundButton compoundButton, boolean z) {
        OnCheckedListener onCheckedListener = paiPopupFragment.onCheckedListener;
        if (onCheckedListener != null) {
            onCheckedListener.onChecked(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PaiPopupFragment paiPopupFragment, int i, CheckBox checkBox, View view) {
        paiPopupFragment.dismiss();
        Analytics.recordEvent(new CountEventBuilder("SPORT_PAI_CLOSE_C").addExtra("tp", "week_window").addExtra("value", String.valueOf(i)).addExtra("choice", checkBox.isChecked() ? "yes" : "no"));
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

    public final boolean hasBackground() {
        return false;
    }

    @NotNull
    public final View initView() {
        int i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i2 = this.paiDaily;
        if (i2 == -100) {
            i = R.layout.pai_pop_science;
        } else {
            i = i2 == 75 ? R.layout.pai_pop_daily_goal : R.layout.pai_pop_total;
        }
        View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) null);
        int i3 = this.paiDaily;
        if (i3 == -100) {
            viewInflate.findViewById(R.id.pai_pop_close).setOnClickListener(new View.OnClickListener() { // from class: qr5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaiPopupFragment.f(this.a, view);
                }
            });
            return viewInflate;
        }
        if (i3 != 75) {
            h(viewInflate);
            return viewInflate;
        }
        viewInflate.findViewById(R.id.pai_pop_close).setOnClickListener(new View.OnClickListener() { // from class: rr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaiPopupFragment.g(this.a, view);
            }
        });
        TypefaceTextView typefaceTextView = (TypefaceTextView) viewInflate.findViewById(R.id.pai_pop_title_sub);
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) viewInflate.findViewById(R.id.pai_circle_msg);
        typefaceTextView.setText(getString(R.string.pai_v2_pop_proud_sub_title, 75));
        typefaceTextView2.setText(getString(R.string.pai_v2_pop_proud_msg, 75));
        Analytics.recordEvent(new CountEventBuilder("SPORT_PAI_V").addExtra("tp", "day_window"));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.paiTotal = arguments.getInt(ARG_PAI_TOTAL, 0);
            this.paiDaily = arguments.getInt(ARG_PAI_DAILY, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pai_popup, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = (int) ViewExKt.dip2px(260, requireContext());
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View viewInitView = initView();
        if (viewInitView == null) {
            return;
        }
        ViewGroup viewGroupE = e();
        viewGroupE.addView(viewInitView);
        ((ViewGroup) view).addView(viewGroupE);
    }

    public final void setCheckedListener(@Nullable OnCheckedListener onCheckedListener) {
        this.onCheckedListener = onCheckedListener;
    }

    public final void show(@NotNull FragmentManager manager) {
        show(manager, d);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
