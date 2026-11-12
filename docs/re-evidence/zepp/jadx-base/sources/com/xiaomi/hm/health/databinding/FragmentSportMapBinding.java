package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.sportfitness.view.SportDeviceView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentSportMapBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayout amazfitTreadmillTitle;

    @NonNull
    public final ImageView sportMapBg;

    @NonNull
    public final CardView sportMapCard;

    @NonNull
    public final ImageView sportMapContent;

    @NonNull
    public final SportDeviceView sportMapDevice;

    @NonNull
    public final RadioGroup sportMapRadio;

    @NonNull
    public final RadioButton sportMapRadioIndoorRunBtn;

    @NonNull
    public final RadioButton sportMapRadioOutdoorRunBtn;

    @NonNull
    public final RadioButton sportMapRadioTreadmillBtn;

    @NonNull
    public final ImageView sportMapSettings;

    @NonNull
    public final ImageView sportMapStart;

    private FragmentSportMapBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout amazfitTreadmillTitle, @NonNull ImageView sportMapBg, @NonNull CardView sportMapCard, @NonNull ImageView sportMapContent, @NonNull SportDeviceView sportMapDevice, @NonNull RadioGroup sportMapRadio, @NonNull RadioButton sportMapRadioIndoorRunBtn, @NonNull RadioButton sportMapRadioOutdoorRunBtn, @NonNull RadioButton sportMapRadioTreadmillBtn, @NonNull ImageView sportMapSettings, @NonNull ImageView sportMapStart) {
        this.a = rootView;
        this.amazfitTreadmillTitle = amazfitTreadmillTitle;
        this.sportMapBg = sportMapBg;
        this.sportMapCard = sportMapCard;
        this.sportMapContent = sportMapContent;
        this.sportMapDevice = sportMapDevice;
        this.sportMapRadio = sportMapRadio;
        this.sportMapRadioIndoorRunBtn = sportMapRadioIndoorRunBtn;
        this.sportMapRadioOutdoorRunBtn = sportMapRadioOutdoorRunBtn;
        this.sportMapRadioTreadmillBtn = sportMapRadioTreadmillBtn;
        this.sportMapSettings = sportMapSettings;
        this.sportMapStart = sportMapStart;
    }

    @NonNull
    public static FragmentSportMapBinding bind(@NonNull View rootView) {
        int i = R.id.amazfit_treadmill_title;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.amazfit_treadmill_title);
        if (linearLayout != null) {
            i = R.id.sport_map_bg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_map_bg);
            if (imageView != null) {
                i = R.id.sport_map_card;
                CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.sport_map_card);
                if (cardView != null) {
                    i = R.id.sport_map_content;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_map_content);
                    if (imageView2 != null) {
                        i = R.id.sport_map_device;
                        SportDeviceView sportDeviceView = (SportDeviceView) ViewBindings.findChildViewById(rootView, R.id.sport_map_device);
                        if (sportDeviceView != null) {
                            i = R.id.sport_map_radio;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.sport_map_radio);
                            if (radioGroup != null) {
                                i = R.id.sport_map_radio_indoor_run_btn;
                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_map_radio_indoor_run_btn);
                                if (radioButton != null) {
                                    i = R.id.sport_map_radio_outdoor_run_btn;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_map_radio_outdoor_run_btn);
                                    if (radioButton2 != null) {
                                        i = R.id.sport_map_radio_treadmill_btn;
                                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.sport_map_radio_treadmill_btn);
                                        if (radioButton3 != null) {
                                            i = R.id.sport_map_settings;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_map_settings);
                                            if (imageView3 != null) {
                                                i = R.id.sport_map_start;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.sport_map_start);
                                                if (imageView4 != null) {
                                                    return new FragmentSportMapBinding((FrameLayout) rootView, linearLayout, imageView, cardView, imageView2, sportDeviceView, radioGroup, radioButton, radioButton2, radioButton3, imageView3, imageView4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_map, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
