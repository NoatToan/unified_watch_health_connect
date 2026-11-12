package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentBaseEarbudModeNormalBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout contentView;

    @NonNull
    public final ImageView icPlay;

    @NonNull
    public final TextView leftBattery;

    @NonNull
    public final ImageView musicControl;

    @NonNull
    public final TextView musicName;

    @NonNull
    public final TextView rightBattery;

    @NonNull
    public final ImageView setBtn;

    @NonNull
    public final RelativeLayout titleContent;

    @NonNull
    public final ImageView updateRedDot;

    @NonNull
    public final TextView volumePercent;

    @NonNull
    public final SeekBar volumeSeek;

    private FragmentBaseEarbudModeNormalBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView4, @NonNull TextView textView4, @NonNull SeekBar seekBar) {
        this.a = linearLayout;
        this.contentView = frameLayout;
        this.icPlay = imageView;
        this.leftBattery = textView;
        this.musicControl = imageView2;
        this.musicName = textView2;
        this.rightBattery = textView3;
        this.setBtn = imageView3;
        this.titleContent = relativeLayout;
        this.updateRedDot = imageView4;
        this.volumePercent = textView4;
        this.volumeSeek = seekBar;
    }

    @NonNull
    public static FragmentBaseEarbudModeNormalBinding bind(@NonNull View view) {
        int i = R.id.content_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ic_play;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.left_battery;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.music_control;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.music_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.right_battery;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.set_btn;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.title_content;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.update_red_dot;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView4 != null) {
                                            i = R.id.volume_percent;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.volume_seek;
                                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                                                if (seekBar != null) {
                                                    return new FragmentBaseEarbudModeNormalBinding((LinearLayout) view, frameLayout, imageView, textView, imageView2, textView2, textView3, imageView3, relativeLayout, imageView4, textView4, seekBar);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBaseEarbudModeNormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBaseEarbudModeNormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_base_earbud_mode_normal, viewGroup, false);
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
