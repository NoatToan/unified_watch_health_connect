package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.earbud.view.PlayLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentEarbudModePlayBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView musicOperBtnOne;

    @NonNull
    public final TextView musicOperBtnTwo;

    @NonNull
    public final TextView playInfoName;

    @NonNull
    public final TextView playInfoTime;

    @NonNull
    public final PlayLoadingView playLoading;

    private FragmentEarbudModePlayBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull PlayLoadingView playLoadingView) {
        this.a = linearLayout;
        this.musicOperBtnOne = textView;
        this.musicOperBtnTwo = textView2;
        this.playInfoName = textView3;
        this.playInfoTime = textView4;
        this.playLoading = playLoadingView;
    }

    @NonNull
    public static FragmentEarbudModePlayBinding bind(@NonNull View view) {
        int i = R.id.music_oper_btn_one;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.music_oper_btn_two;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.play_info_name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.play_info_time;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.play_loading;
                        PlayLoadingView playLoadingView = (PlayLoadingView) ViewBindings.findChildViewById(view, i);
                        if (playLoadingView != null) {
                            return new FragmentEarbudModePlayBinding((LinearLayout) view, textView, textView2, textView3, textView4, playLoadingView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEarbudModePlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEarbudModePlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_earbud_mode_play, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
