package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.moving.ui.view.PaceNotiSeekBar;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentExerciseSettingBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListTile audioPlaySwitcher;

    @NonNull
    public final LinearLayout autoPausePaceSeekBarContainer;

    @NonNull
    public final TextView autoPausePaceUnit;

    @NonNull
    public final TypefaceTextView autoPausePaceValue;

    @NonNull
    public final PaceNotiSeekBar autoPauseSeekBarPace;

    @NonNull
    public final ListTile autoPauseSwitcher;

    @NonNull
    public final HeartRateSeekBar beatBar;

    @NonNull
    public final LinearLayout beatBarContainer;

    @NonNull
    public final TextView beatSection;

    @NonNull
    public final ListTile beatSwitcher;

    @NonNull
    public final TypefaceTextView beatValue;

    @NonNull
    public final LinearLayout beatValueContainer;

    @NonNull
    public final ImageView commonTitleLeftButton;

    @NonNull
    public final TextView commonTitleText;

    @NonNull
    public final ListTile createTestPointSwitcher;

    @NonNull
    public final ListTile drawGpsLineSwitcher;

    @NonNull
    public final TextView hrSection;

    @NonNull
    public final TextView hrSectionTitle;

    @NonNull
    public final LinearLayout hrSeekBarContainer;

    @NonNull
    public final TypefaceTextView hrValue;

    @NonNull
    public final LinearLayout hrValueContainer;

    @NonNull
    public final ListTile maxHrNotifySwitcher;

    @NonNull
    public final ListTile paceNotifySwitcher;

    @NonNull
    public final LinearLayout paceSeekBarContainer;

    @NonNull
    public final TextView paceUnit;

    @NonNull
    public final TypefaceTextView paceValue;

    @NonNull
    public final ListTile screenOnSwitcher;

    @NonNull
    public final ListTile securityCenter;

    @NonNull
    public final HeartRateSeekBar seekBarMaxHr;

    @NonNull
    public final PaceNotiSeekBar seekBarPace;

    @NonNull
    public final RelativeLayout settingTitleLayout;

    @NonNull
    public final ViewGapBinding spaceBelowAutoPauseSeekBar;

    @NonNull
    public final ViewGapBinding spaceBelowBeat;

    @NonNull
    public final ViewGapBinding spaceBelowChooseMap;

    @NonNull
    public final ViewGapBinding spaceBelowPaceNotiBar;

    @NonNull
    public final ViewGapBinding spaceBelowSeekBar;

    @NonNull
    public final LinearLayout sportInternalSetLayout;

    @NonNull
    public final ListTile superHideMode;

    @NonNull
    public final ListTile treadmillSoundState;

    private FragmentExerciseSettingBinding(@NonNull RelativeLayout rootView, @NonNull ListTile audioPlaySwitcher, @NonNull LinearLayout autoPausePaceSeekBarContainer, @NonNull TextView autoPausePaceUnit, @NonNull TypefaceTextView autoPausePaceValue, @NonNull PaceNotiSeekBar autoPauseSeekBarPace, @NonNull ListTile autoPauseSwitcher, @NonNull HeartRateSeekBar beatBar, @NonNull LinearLayout beatBarContainer, @NonNull TextView beatSection, @NonNull ListTile beatSwitcher, @NonNull TypefaceTextView beatValue, @NonNull LinearLayout beatValueContainer, @NonNull ImageView commonTitleLeftButton, @NonNull TextView commonTitleText, @NonNull ListTile createTestPointSwitcher, @NonNull ListTile drawGpsLineSwitcher, @NonNull TextView hrSection, @NonNull TextView hrSectionTitle, @NonNull LinearLayout hrSeekBarContainer, @NonNull TypefaceTextView hrValue, @NonNull LinearLayout hrValueContainer, @NonNull ListTile maxHrNotifySwitcher, @NonNull ListTile paceNotifySwitcher, @NonNull LinearLayout paceSeekBarContainer, @NonNull TextView paceUnit, @NonNull TypefaceTextView paceValue, @NonNull ListTile screenOnSwitcher, @NonNull ListTile securityCenter, @NonNull HeartRateSeekBar seekBarMaxHr, @NonNull PaceNotiSeekBar seekBarPace, @NonNull RelativeLayout settingTitleLayout, @NonNull ViewGapBinding spaceBelowAutoPauseSeekBar, @NonNull ViewGapBinding spaceBelowBeat, @NonNull ViewGapBinding spaceBelowChooseMap, @NonNull ViewGapBinding spaceBelowPaceNotiBar, @NonNull ViewGapBinding spaceBelowSeekBar, @NonNull LinearLayout sportInternalSetLayout, @NonNull ListTile superHideMode, @NonNull ListTile treadmillSoundState) {
        this.a = rootView;
        this.audioPlaySwitcher = audioPlaySwitcher;
        this.autoPausePaceSeekBarContainer = autoPausePaceSeekBarContainer;
        this.autoPausePaceUnit = autoPausePaceUnit;
        this.autoPausePaceValue = autoPausePaceValue;
        this.autoPauseSeekBarPace = autoPauseSeekBarPace;
        this.autoPauseSwitcher = autoPauseSwitcher;
        this.beatBar = beatBar;
        this.beatBarContainer = beatBarContainer;
        this.beatSection = beatSection;
        this.beatSwitcher = beatSwitcher;
        this.beatValue = beatValue;
        this.beatValueContainer = beatValueContainer;
        this.commonTitleLeftButton = commonTitleLeftButton;
        this.commonTitleText = commonTitleText;
        this.createTestPointSwitcher = createTestPointSwitcher;
        this.drawGpsLineSwitcher = drawGpsLineSwitcher;
        this.hrSection = hrSection;
        this.hrSectionTitle = hrSectionTitle;
        this.hrSeekBarContainer = hrSeekBarContainer;
        this.hrValue = hrValue;
        this.hrValueContainer = hrValueContainer;
        this.maxHrNotifySwitcher = maxHrNotifySwitcher;
        this.paceNotifySwitcher = paceNotifySwitcher;
        this.paceSeekBarContainer = paceSeekBarContainer;
        this.paceUnit = paceUnit;
        this.paceValue = paceValue;
        this.screenOnSwitcher = screenOnSwitcher;
        this.securityCenter = securityCenter;
        this.seekBarMaxHr = seekBarMaxHr;
        this.seekBarPace = seekBarPace;
        this.settingTitleLayout = settingTitleLayout;
        this.spaceBelowAutoPauseSeekBar = spaceBelowAutoPauseSeekBar;
        this.spaceBelowBeat = spaceBelowBeat;
        this.spaceBelowChooseMap = spaceBelowChooseMap;
        this.spaceBelowPaceNotiBar = spaceBelowPaceNotiBar;
        this.spaceBelowSeekBar = spaceBelowSeekBar;
        this.sportInternalSetLayout = sportInternalSetLayout;
        this.superHideMode = superHideMode;
        this.treadmillSoundState = treadmillSoundState;
    }

    @NonNull
    public static FragmentExerciseSettingBinding bind(@NonNull View rootView) {
        int i = R.id.audio_play_switcher;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.audio_play_switcher);
        if (listTile != null) {
            i = R.id.auto_pause_pace_seek_bar_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.auto_pause_pace_seek_bar_container);
            if (linearLayout != null) {
                i = R.id.auto_pause_pace_unit;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.auto_pause_pace_unit);
                if (textView != null) {
                    i = R.id.auto_pause_pace_value;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.auto_pause_pace_value);
                    if (typefaceTextView != null) {
                        i = R.id.auto_pause_seek_bar_pace;
                        PaceNotiSeekBar paceNotiSeekBar = (PaceNotiSeekBar) ViewBindings.findChildViewById(rootView, R.id.auto_pause_seek_bar_pace);
                        if (paceNotiSeekBar != null) {
                            i = R.id.auto_pause_switcher;
                            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.auto_pause_switcher);
                            if (listTile2 != null) {
                                i = R.id.beat_bar;
                                HeartRateSeekBar heartRateSeekBar = (HeartRateSeekBar) ViewBindings.findChildViewById(rootView, R.id.beat_bar);
                                if (heartRateSeekBar != null) {
                                    i = R.id.beat_bar_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.beat_bar_container);
                                    if (linearLayout2 != null) {
                                        i = R.id.beat_section;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.beat_section);
                                        if (textView2 != null) {
                                            i = R.id.beat_switcher;
                                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.beat_switcher);
                                            if (listTile3 != null) {
                                                i = R.id.beat_value;
                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.beat_value);
                                                if (typefaceTextView2 != null) {
                                                    i = R.id.beat_value_container;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.beat_value_container);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.common_title_left_button;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.common_title_left_button);
                                                        if (imageView != null) {
                                                            i = R.id.common_title_text;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.common_title_text);
                                                            if (textView3 != null) {
                                                                i = R.id.create_test_point_switcher;
                                                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.create_test_point_switcher);
                                                                if (listTile4 != null) {
                                                                    i = R.id.draw_gps_line_switcher;
                                                                    ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.draw_gps_line_switcher);
                                                                    if (listTile5 != null) {
                                                                        i = R.id.hr_section;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hr_section);
                                                                        if (textView4 != null) {
                                                                            i = R.id.hr_section_title;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hr_section_title);
                                                                            if (textView5 != null) {
                                                                                i = R.id.hr_seek_bar_container;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_seek_bar_container);
                                                                                if (linearLayout4 != null) {
                                                                                    i = R.id.hr_value;
                                                                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.hr_value);
                                                                                    if (typefaceTextView3 != null) {
                                                                                        i = R.id.hr_value_container;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_value_container);
                                                                                        if (linearLayout5 != null) {
                                                                                            i = R.id.max_hr_notify_switcher;
                                                                                            ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.max_hr_notify_switcher);
                                                                                            if (listTile6 != null) {
                                                                                                i = R.id.pace_notify_switcher;
                                                                                                ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.pace_notify_switcher);
                                                                                                if (listTile7 != null) {
                                                                                                    i = R.id.pace_seek_bar_container;
                                                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_seek_bar_container);
                                                                                                    if (linearLayout6 != null) {
                                                                                                        i = R.id.pace_unit;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.pace_unit);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.pace_value;
                                                                                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.pace_value);
                                                                                                            if (typefaceTextView4 != null) {
                                                                                                                i = R.id.screen_on_switcher;
                                                                                                                ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.screen_on_switcher);
                                                                                                                if (listTile8 != null) {
                                                                                                                    i = R.id.security_center;
                                                                                                                    ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.security_center);
                                                                                                                    if (listTile9 != null) {
                                                                                                                        i = R.id.seek_bar_max_hr;
                                                                                                                        HeartRateSeekBar heartRateSeekBar2 = (HeartRateSeekBar) ViewBindings.findChildViewById(rootView, R.id.seek_bar_max_hr);
                                                                                                                        if (heartRateSeekBar2 != null) {
                                                                                                                            i = R.id.seek_bar_pace;
                                                                                                                            PaceNotiSeekBar paceNotiSeekBar2 = (PaceNotiSeekBar) ViewBindings.findChildViewById(rootView, R.id.seek_bar_pace);
                                                                                                                            if (paceNotiSeekBar2 != null) {
                                                                                                                                i = R.id.setting_title_layout;
                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.setting_title_layout);
                                                                                                                                if (relativeLayout != null) {
                                                                                                                                    i = R.id.space_below_auto_pause_seek_bar;
                                                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.space_below_auto_pause_seek_bar);
                                                                                                                                    if (viewFindChildViewById != null) {
                                                                                                                                        ViewGapBinding viewGapBindingBind = ViewGapBinding.bind(viewFindChildViewById);
                                                                                                                                        i = R.id.space_below_beat;
                                                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.space_below_beat);
                                                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                                                            ViewGapBinding viewGapBindingBind2 = ViewGapBinding.bind(viewFindChildViewById2);
                                                                                                                                            i = R.id.space_below_choose_map;
                                                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.space_below_choose_map);
                                                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                                                ViewGapBinding viewGapBindingBind3 = ViewGapBinding.bind(viewFindChildViewById3);
                                                                                                                                                i = R.id.space_below_pace_noti_bar;
                                                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.space_below_pace_noti_bar);
                                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                                    ViewGapBinding viewGapBindingBind4 = ViewGapBinding.bind(viewFindChildViewById4);
                                                                                                                                                    i = R.id.space_below_seek_bar;
                                                                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.space_below_seek_bar);
                                                                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                                                                        ViewGapBinding viewGapBindingBind5 = ViewGapBinding.bind(viewFindChildViewById5);
                                                                                                                                                        i = R.id.sport_internal_set_layout;
                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sport_internal_set_layout);
                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                            i = R.id.super_hide_mode;
                                                                                                                                                            ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.super_hide_mode);
                                                                                                                                                            if (listTile10 != null) {
                                                                                                                                                                i = R.id.treadmill_sound_state;
                                                                                                                                                                ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.treadmill_sound_state);
                                                                                                                                                                if (listTile11 != null) {
                                                                                                                                                                    return new FragmentExerciseSettingBinding((RelativeLayout) rootView, listTile, linearLayout, textView, typefaceTextView, paceNotiSeekBar, listTile2, heartRateSeekBar, linearLayout2, textView2, listTile3, typefaceTextView2, linearLayout3, imageView, textView3, listTile4, listTile5, textView4, textView5, linearLayout4, typefaceTextView3, linearLayout5, listTile6, listTile7, linearLayout6, textView6, typefaceTextView4, listTile8, listTile9, heartRateSeekBar2, paceNotiSeekBar2, relativeLayout, viewGapBindingBind, viewGapBindingBind2, viewGapBindingBind3, viewGapBindingBind4, viewGapBindingBind5, linearLayout7, listTile10, listTile11);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentExerciseSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentExerciseSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_exercise_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
