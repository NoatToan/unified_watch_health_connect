package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.ui.widget.HeartRateSeekBar;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetSportListBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final LinearLayout hrSeekBarContainer;

    @NonNull
    public final TypefaceTextView hrValue;

    @NonNull
    public final LinearLayout hrValueContainer;

    @NonNull
    public final ListTile itemHeadsetSettingsBeatEnhancement;

    @NonNull
    public final ListTile itemHeadsetSettingsHighHrReminder;

    @NonNull
    public final ListTile itemHeadsetSettingsHrBroadcast;

    @NonNull
    public final ListTile itemHeadsetSettingsPercussion;

    @NonNull
    public final ListTile itemHeadsetSettingsRunningRecognition;

    @NonNull
    public final HeartRateSeekBar seekBarMaxHr;

    @NonNull
    public final CardView viewGroupHeadsetSportSettings;

    private LayoutHeadsetSportListBinding(@NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull LinearLayout linearLayout2, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull HeartRateSeekBar heartRateSeekBar, @NonNull CardView cardView2) {
        this.a = cardView;
        this.hrSeekBarContainer = linearLayout;
        this.hrValue = typefaceTextView;
        this.hrValueContainer = linearLayout2;
        this.itemHeadsetSettingsBeatEnhancement = listTile;
        this.itemHeadsetSettingsHighHrReminder = listTile2;
        this.itemHeadsetSettingsHrBroadcast = listTile3;
        this.itemHeadsetSettingsPercussion = listTile4;
        this.itemHeadsetSettingsRunningRecognition = listTile5;
        this.seekBarMaxHr = heartRateSeekBar;
        this.viewGroupHeadsetSportSettings = cardView2;
    }

    @NonNull
    public static LayoutHeadsetSportListBinding bind(@NonNull View view) {
        int i = R.id.hr_seek_bar_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.hr_value;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.hr_value_container;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.item_headset_settings_beat_enhancement;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile != null) {
                        i = R.id.item_headset_settings_high_hr_reminder;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile2 != null) {
                            i = R.id.item_headset_settings_hr_broadcast;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile3 != null) {
                                i = R.id.item_headset_settings_percussion;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile4 != null) {
                                    i = R.id.item_headset_settings_running_recognition;
                                    ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile5 != null) {
                                        i = R.id.seek_bar_max_hr;
                                        HeartRateSeekBar heartRateSeekBar = (HeartRateSeekBar) ViewBindings.findChildViewById(view, i);
                                        if (heartRateSeekBar != null) {
                                            CardView cardView = (CardView) view;
                                            return new LayoutHeadsetSportListBinding(cardView, linearLayout, typefaceTextView, linearLayout2, listTile, listTile2, listTile3, listTile4, listTile5, heartRateSeekBar, cardView);
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
    public static LayoutHeadsetSportListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetSportListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_sport_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
