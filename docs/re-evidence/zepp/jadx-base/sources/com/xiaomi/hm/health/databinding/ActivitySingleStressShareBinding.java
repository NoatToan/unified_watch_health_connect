package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySingleStressShareBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button backButton;

    @NonNull
    public final ConstraintLayout contentLayout;

    @NonNull
    public final TypefaceTextView dateTv;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final TypefaceTextView levelStr;

    @NonNull
    public final FrameLayout sharePanelContainer;

    @NonNull
    public final LinearLayout stressDetail;

    @NonNull
    public final TypefaceTextView stressValue;

    @NonNull
    public final FrameLayout titleBar;

    @NonNull
    public final CircleImageView userAvatar;

    @NonNull
    public final TypefaceTextView userName;

    private ActivitySingleStressShareBinding(@NonNull ConstraintLayout rootView, @NonNull Button backButton, @NonNull ConstraintLayout contentLayout, @NonNull TypefaceTextView dateTv, @NonNull ConstraintLayout head, @NonNull TypefaceTextView levelStr, @NonNull FrameLayout sharePanelContainer, @NonNull LinearLayout stressDetail, @NonNull TypefaceTextView stressValue, @NonNull FrameLayout titleBar, @NonNull CircleImageView userAvatar, @NonNull TypefaceTextView userName) {
        this.a = rootView;
        this.backButton = backButton;
        this.contentLayout = contentLayout;
        this.dateTv = dateTv;
        this.head = head;
        this.levelStr = levelStr;
        this.sharePanelContainer = sharePanelContainer;
        this.stressDetail = stressDetail;
        this.stressValue = stressValue;
        this.titleBar = titleBar;
        this.userAvatar = userAvatar;
        this.userName = userName;
    }

    @NonNull
    public static ActivitySingleStressShareBinding bind(@NonNull View rootView) {
        int i = R.id.back_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.back_button);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.date_tv;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.date_tv);
            if (typefaceTextView != null) {
                i = R.id.head;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                if (constraintLayout2 != null) {
                    i = R.id.level_str;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.level_str);
                    if (typefaceTextView2 != null) {
                        i = R.id.share_panel_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.share_panel_container);
                        if (frameLayout != null) {
                            i = R.id.stress_detail;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stress_detail);
                            if (linearLayout != null) {
                                i = R.id.stress_value;
                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stress_value);
                                if (typefaceTextView3 != null) {
                                    i = R.id.title_bar;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                    if (frameLayout2 != null) {
                                        i = R.id.user_avatar;
                                        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.user_avatar);
                                        if (circleImageView != null) {
                                            i = R.id.user_name;
                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.user_name);
                                            if (typefaceTextView4 != null) {
                                                return new ActivitySingleStressShareBinding(constraintLayout, button, constraintLayout, typefaceTextView, constraintLayout2, typefaceTextView2, frameLayout, linearLayout, typefaceTextView3, frameLayout2, circleImageView, typefaceTextView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySingleStressShareBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySingleStressShareBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_single_stress_share, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
