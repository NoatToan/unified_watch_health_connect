package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import defpackage.emh;
import defpackage.emr;
import defpackage.eqt;
import defpackage.era;
import defpackage.erh;
import defpackage.etl;
import defpackage.lmf;
import defpackage.qrs;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipSettingFragment extends RopeSkipSettingBaseFragment {
    private static final int BIRTH_DATE_MONTH_DAY_LENGTH = 4;
    private static final int BPM_HUNDRED_FIFTY = 150;
    private static final int BPM_HUNDRED_TWENTY = 120;
    private static final int BPM_MAX = 180;
    private static final int BPM_MIN = 60;
    private static final String CONNECT_MODE_TYPE = "connect_mode_type";
    private static final int HALF_VOLUME = 50;
    private static final int HEART_RATE_TOP_TIP_DEFAULT_AGE = 18;
    private static final int HEART_RATE_TOP_TIP_MAX = 220;
    private static final float HEART_RATE_TOP_TIP_MAX_RATIO = 1.15f;
    private static final float HEART_RATE_TOP_TIP_MIN_RATIO = 0.85f;
    private static final String HEART_RATE_TOP_TYPE = "heart_rate_top_type";
    private static final String METRONOME_VOICE_TEMPO_TYPE = "metronome_voice_tempo_type";
    private static final String MUSIC_JUMP_TYPE = "music_jump_type";
    private static final int MUTE_VOLUME = 0;
    private static final int MUTE_VOLUME_THUMBOFFSET = 1;
    private static final int OP_BIT_RESERVE_HEART_RATE = 1;
    private static final int OP_BIT_SWITCH_ENQUIRE = 1;
    private static final int ROTATION_ANGLE = 180;
    private static final int SEEKBAR_THUMBOFFSET = 0;
    private static final int SETTING_ENQUIRE_VALUE = 703;
    private static final String SWITCH_BAR_HEART_RATE_REMIND_TYPE = "switch_bar_heart_rate_remind_type";
    private static final String SWITCH_BAR_METRONOME_TYPE = "switch_bar_metronome_type";
    private static final String SWITCH_BAR_VIBRATE_TYPE = "switch_bar_vibrate_type";
    private static final String SWITCH_BAR_VOLUME_ASSISTANT_TYPE = "switch_bar_volume_assistant_type";
    private static final int TEMPO_TYPE_ELEMENTS_HIGH_SIZE = 2;
    private static final String TEMPO_VOICE_TYPE = "tempo_voice_type";
    private static final String VOICE_COACHING_TYPE = "voice_coaching_type";
    private static final String VOICE_CV_TYPE = "voice_cv_type";
    private static final String VOICE_FREQUENCY_TYPE = "voice_frequency_type";
    private static final int VOLUME_ASSISTANT_TYPE_ELEMENTS_HIGH_SIZE = 3;
    private int[] mBpmArray;
    private HealthSeekBar mHealthSeekBar;
    private int mHeartRateRemindMaxValue;
    private int mHeartRateRemindMinValue;
    private int mHeartRateRemindValue;
    private boolean mIsHeartRateRemindEnable;
    private boolean mIsMetronomeEnable;
    private boolean mIsSilentModeEnable;
    private boolean mIsVibrateEnable;
    private boolean mIsVolumeAssistantEnable;
    private int mMetronomeTempoValue;
    private int mSeekBarProgress;
    private HealthSwitchButton mSilentModeSwitchButton;
    private int mSwitchValue;
    private int mVolumeRemindFrequencyValue;
    private int mVolumeValue;
    private static final int[] BPM_ARRAY = {60, 120, 150, 180};
    private static final int[] BPM_PRO_ARRAY = {60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, a.C};
    private int mVolumeCoachingValue = 1;
    private int mVolumeCvValue = 1;
    private int mTempoTypeValue = 4;
    private int mMusicJumpValue = 2;
    private int mConnectMode = 2;

    private int getHeartRateMax(int i) {
        if (i == 0) {
            i = 18;
        }
        int i2 = (int) ((220 - i) * HEART_RATE_TOP_TIP_MAX_RATIO);
        if (i2 > 220) {
            return 220;
        }
        return i2;
    }

    private int getHeartRateMin(int i) {
        if (i == 0) {
            i = 18;
        }
        return (int) ((220 - i) * HEART_RATE_TOP_TIP_MIN_RATIO);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    protected void createChildView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.child = layoutInflater.inflate(R.layout.fragment_rope_settings_scrollview, viewGroup, false);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initView(View view) {
        super.initView(view);
        this.mSilentModeSwitchButton = (HealthSwitchButton) view.findViewById(R.id.voice_settings_switch);
        HealthSeekBar healthSeekBar = (HealthSeekBar) view.findViewById(R.id.voice_settings_seekbar);
        this.mHealthSeekBar = healthSeekBar;
        healthSeekBar.setTouchable(true);
        if (era.l(Constants.URDU_LANG)) {
            this.mHealthSeekBar.setRotation(180.0f);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initData() {
        setTitle(getString(R.string.IDS_indoor_skipper_skipping_setting));
        this.mLayoutManager = new HealthLinearLayoutManager(this.mainActivity) { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        this.mHealthSeekBar.setOnSeekBarChangeListener(new HealthSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment.2
            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
                if (z) {
                    RopeSkipSettingFragment.this.setSeekBarView(i);
                    RopeSkipSettingFragment.this.mSeekBarProgress = i;
                }
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
                LogUtil.a("RopeSkipSettingBaseFragment", "onStartTrackingTouch");
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
                LogUtil.a("RopeSkipSettingBaseFragment", "onStopTrackingTouch mSeekBarProgress = ", Integer.valueOf(RopeSkipSettingFragment.this.mSeekBarProgress));
                RopeSkipSettingFragment ropeSkipSettingFragment = RopeSkipSettingFragment.this;
                ropeSkipSettingFragment.ropeVolumeSetting(ropeSkipSettingFragment.mSeekBarProgress);
            }
        });
        this.mSilentModeSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1075x8dda3a2(view);
            }
        });
        super.initData();
    }

    /* JADX INFO: renamed from: lambda$initData$0$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipSettingFragment, reason: not valid java name */
    /* synthetic */ void m1075x8dda3a2(View view) {
        LogUtil.a("RopeSkipSettingBaseFragment", "setOnClickListener mSilentModeSwitchButton click");
        this.mIsSilentModeEnable = this.mSilentModeSwitchButton.isChecked();
        this.mSwitchValue ^= 1;
        ropeSwitchSetting();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LogUtil.a("RopeSkipSettingBaseFragment", "onHiddenChanged hidden = ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        int iE = eqt.c().e(emh.b().d());
        LogUtil.a("RopeSkipSettingBaseFragment", "onHiddenChanged connectMode = ", Integer.valueOf(iE));
        if (iE != this.mConnectMode) {
            this.mConnectMode = iE;
            sendEmptyHandleMessage(101);
        }
        eqt.c().d(emh.b().i(), emh.b().d());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        setBiAnalytics();
        return super.onBackPressed();
    }

    private void setBiAnalytics() {
        LogUtil.a("RopeSkipSettingBaseFragment", "setBiAnalytics");
        String strB = era.b(emh.b().i());
        String strD = erh.d(emh.b().d());
        HashMap map = new HashMap(10);
        map.put("prodId", strB);
        map.put("macAddress", strD);
        map.put("silentMode", Boolean.valueOf(this.mIsSilentModeEnable));
        map.put("volumeAssistant", Boolean.valueOf(this.mIsVolumeAssistantEnable));
        map.put("soundCadence", Boolean.valueOf(this.mIsMetronomeEnable));
        map.put("soundMotor", Boolean.valueOf(this.mIsVibrateEnable));
        map.put("heartRateRemind", Boolean.valueOf(this.mIsHeartRateRemindEnable));
        lmf.d().c(this.mainActivity, AnalyticsValue.HEALTH_SKIPPING_SETTING_SWITCH.value(), map, 0);
        HashMap map2 = new HashMap(10);
        map2.put("prodId", strB);
        map2.put("macAddress", strD);
        map2.put("volume", Integer.valueOf(this.mVolumeValue));
        map2.put("voiceRemindFrequency", Integer.valueOf(this.mVolumeRemindFrequencyValue));
        map2.put("soundCadenceValue", Integer.valueOf(this.mMetronomeTempoValue));
        map2.put("heartRateRemindValue", Integer.valueOf(this.mHeartRateRemindValue));
        lmf.d().c(this.mainActivity, AnalyticsValue.HEALTH_SKIPPING_SETTING_VALUE.value(), map2, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    /* JADX INFO: renamed from: setItemClickListener */
    public void m1074x1c99b493(View view, int i, etl etlVar) {
        if (etlVar == null || etlVar.a() == 1) {
            return;
        }
        String strD = etlVar.d();
        strD.hashCode();
        switch (strD) {
            case "switch_bar_volume_assistant_type":
            case "switch_bar_metronome_type":
            case "switch_bar_heart_rate_remind_type":
            case "switch_bar_vibrate_type":
                clickSwitchBarRefreshPage(view, etlVar);
                break;
            case "metronome_voice_tempo_type":
                showMetronomeVoiceTypeSetting(i, METRONOME_VOICE_TEMPO_TYPE);
                break;
            case "voice_cv_type":
                switchToRadioSelectFragment(1, this.mVolumeCvValue);
                break;
            case "voice_frequency_type":
                switchToRadioSelectFragment(2, this.mVolumeRemindFrequencyValue);
                break;
            case "music_jump_type":
                switchToRadioSelectFragment(4, this.mMusicJumpValue);
                break;
            case "voice_coaching_type":
                switchToRadioSelectFragment(0, this.mVolumeCoachingValue);
                break;
            case "connect_mode_type":
                switchToRadioSelectFragment(5, this.mConnectMode);
                break;
            case "tempo_voice_type":
                switchToRadioSelectFragment(3, this.mTempoTypeValue);
                break;
            case "heart_rate_top_type":
                showHeartRateTopSetting(i, HEART_RATE_TOP_TYPE);
                break;
            default:
                LogUtil.a("RopeSkipSettingBaseFragment", "settingType is no equals");
                break;
        }
    }

    private void switchToRadioSelectFragment(int i, int i2) {
        if (qrs.r()) {
            LogUtil.j("RopeSkipSettingBaseFragment", "switchToRadioSelectFragment click too fast");
            return;
        }
        RopeSkipRadioButtonSettingFragment ropeSkipRadioButtonSettingFragment = new RopeSkipRadioButtonSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(RopeSkipSettingBaseFragment.ROPE_RADIO_SELECT_TYPE, i);
        bundle.putInt(RopeSkipSettingBaseFragment.ROPE_RADIO_SELECT_TYPE_VALUE, i2);
        bundle.putInt(RopeSkipSettingBaseFragment.ROPE_TEMPO_VALUE, this.mMetronomeTempoValue);
        ropeSkipRadioButtonSettingFragment.setArguments(bundle);
        addFragment(ropeSkipRadioButtonSettingFragment);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    private void clickSwitchBarRefreshPage(View view, etl etlVar) {
        byte b2;
        if (view instanceof HealthSwitchButton) {
            HealthSwitchButton healthSwitchButton = (HealthSwitchButton) view;
            LogUtil.a("RopeSkipSettingBaseFragment", "clickSwitchBarRefreshPage settingType is ", etlVar.d());
            String strD = etlVar.d();
            strD.hashCode();
            switch (strD) {
                case "switch_bar_volume_assistant_type":
                    b2 = 0;
                    break;
                case "switch_bar_metronome_type":
                    b2 = 1;
                    break;
                case "switch_bar_heart_rate_remind_type":
                    b2 = 2;
                    break;
                case "switch_bar_vibrate_type":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.mIsVolumeAssistantEnable = healthSwitchButton.isChecked();
                this.mSwitchValue ^= 2;
            } else if (b2 == 1) {
                this.mIsMetronomeEnable = healthSwitchButton.isChecked();
                this.mSwitchValue ^= 4;
            } else if (b2 == 2) {
                this.mIsHeartRateRemindEnable = healthSwitchButton.isChecked();
                this.mSwitchValue ^= 16;
            } else if (b2 == 3) {
                this.mIsVibrateEnable = healthSwitchButton.isChecked();
                this.mSwitchValue ^= 8;
            } else {
                LogUtil.a("RopeSkipSettingBaseFragment", "switchbar type is no equals");
            }
            ropeSwitchSetting();
        }
    }

    private void ropeSwitchSetting() {
        emh.b().b(1, 1, new int[]{this.mSwitchValue});
        setData();
        setAdapterData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ropeVolumeSetting(int i) {
        LogUtil.d("RopeSkipSettingBaseFragment", "volume is ", Integer.valueOf(i));
        if (this.mIsSilentModeEnable) {
            LogUtil.a("RopeSkipSettingBaseFragment", "ropeVolumeSetting mIsSilentModeEnable is true");
            this.mSilentModeSwitchButton.setChecked(false);
            this.mIsSilentModeEnable = false;
            this.mSwitchValue ^= 1;
            emh.b().b(1, 1, new int[]{this.mSwitchValue});
        }
        this.mVolumeValue = i;
        emh.b().b(2, 1, new int[]{this.mVolumeValue});
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initSettingsData() {
        emr.d().c(getActivity(), new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i, Object obj) {
                this.f$0.m1076x15666b1e(i, (HiUserInfo) obj);
            }
        });
        setData();
        emh.b().b("RopeSkipSettingBaseFragment", (MessageOrStateCallback) this, false);
        emh.b().b(1, 0, new int[]{1});
        emh.b().b(2, 0, new int[]{SETTING_ENQUIRE_VALUE});
    }

    /* JADX INFO: renamed from: lambda$initSettingsData$1$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipSettingFragment, reason: not valid java name */
    /* synthetic */ void m1076x15666b1e(int i, HiUserInfo hiUserInfo) {
        int userAge = getUserAge(hiUserInfo);
        this.mHeartRateRemindMinValue = getHeartRateMin(userAge);
        this.mHeartRateRemindMaxValue = getHeartRateMax(userAge);
    }

    private int getUserAge(HiUserInfo hiUserInfo) {
        if (hiUserInfo != null) {
            String strValueOf = String.valueOf(hiUserInfo.getBirthday());
            if (strValueOf.length() <= 4) {
                LogUtil.j("RopeSkipSettingBaseFragment", "getUserAge birthDate is empty or length is illegal");
                return 0;
            }
            String strValueOf2 = String.valueOf(HiDateUtil.d(System.currentTimeMillis()));
            if (strValueOf2.length() <= 4) {
                LogUtil.j("RopeSkipSettingBaseFragment", "getUserAge currentDateStr length is illegal");
                return 0;
            }
            try {
                return Integer.parseInt(strValueOf2.substring(strValueOf2.length() - 4)) < Integer.parseInt(strValueOf.substring(strValueOf.length() - 4)) ? hiUserInfo.getAge() - 1 : hiUserInfo.getAge();
            } catch (NumberFormatException unused) {
                LogUtil.e("RopeSkipSettingBaseFragment", "getUserAge NumberFormatException");
            }
        }
        return 0;
    }

    private void setData() {
        this.mSettingsItemBeanArrayList.clear();
        this.mSwitchValue = 0;
        boolean z = this.mIsSilentModeEnable;
        if (z) {
            this.mSwitchValue = 1;
        }
        this.mSilentModeSwitchButton.setChecked(z);
        this.mHealthSeekBar.setProgress(this.mVolumeValue);
        setSeekBarView(this.mVolumeValue);
        this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_rope_vibrate, "", -1));
        this.mSettingsItemBeanArrayList.add(getSwitchBarItemBean(R.string.IDS_rope_vibrate, "", this.mIsVibrateEnable, SWITCH_BAR_VIBRATE_TYPE));
        if (this.mIsVibrateEnable) {
            this.mSwitchValue ^= 8;
        }
        this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_rope_voice_assistant, "", -1));
        this.mSettingsItemBeanArrayList.add(getSwitchBarItemBean(R.string.IDS_rope_voice_switch, "", this.mIsVolumeAssistantEnable, SWITCH_BAR_VOLUME_ASSISTANT_TYPE));
        if (this.mIsVolumeAssistantEnable) {
            this.mSwitchValue ^= 2;
            setVolumeEnableItem();
        }
        this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_rope_metronome, "", -1));
        this.mSettingsItemBeanArrayList.add(getSwitchBarItemBean(R.string.IDS_rope_metronome, "", this.mIsMetronomeEnable, SWITCH_BAR_METRONOME_TYPE));
        if (this.mIsMetronomeEnable) {
            this.mSwitchValue ^= 4;
            setMetronomeEnableItem();
        }
        setMusicJumpItem();
        this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_hwh_motiontrack_sport_heart_rate_alert, "", -1));
        this.mSettingsItemBeanArrayList.add(getSwitchBarItemBean(R.string.IDS_heart_rate_warning_limit_title, getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_limit_warning, Integer.valueOf(this.mHeartRateRemindValue)), this.mIsHeartRateRemindEnable, SWITCH_BAR_HEART_RATE_REMIND_TYPE));
        if (this.mIsHeartRateRemindEnable) {
            this.mSwitchValue ^= 16;
            setHeartRateRemindItem();
        }
        if (era.j(emh.b().i())) {
            setConnectModeItem();
        }
        setRecycleViewHeight();
    }

    private void setMusicJumpItem() {
        if (era.j(emh.b().i())) {
            this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_rope_music_skip, "", -1));
            etl itemBean = getItemBean(2, R.string.IDS_rope_music_skip_mode, getMusicJumpDetail(this.mMusicJumpValue), R.drawable.list_item_background_single_normal);
            itemBean.e(MUSIC_JUMP_TYPE);
            this.mSettingsItemBeanArrayList.add(itemBean);
        }
    }

    private void setConnectModeItem() {
        this.mSettingsItemBeanArrayList.add(getItemBean(1, R.string.IDS_rope_connect, "", -1));
        this.mConnectMode = eqt.c().e(emh.b().d());
        etl itemBean = getItemBean(2, R.string.IDS_rope_connect_mode, getConnectModeDetail(this.mConnectMode), R.drawable.list_item_background_single_normal);
        itemBean.e(CONNECT_MODE_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean);
    }

    private void setRecycleViewHeight() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_68dp);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.health_common_104dp);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.health_common_125dp);
        int assistantEnableHeight = this.mIsVolumeAssistantEnable ? getAssistantEnableHeight(dimensionPixelOffset2, dimensionPixelOffset) : dimensionPixelOffset2;
        int tempoEnableHeight = this.mIsMetronomeEnable ? getTempoEnableHeight(dimensionPixelOffset2, dimensionPixelOffset) : dimensionPixelOffset2;
        if (this.mIsHeartRateRemindEnable) {
            dimensionPixelOffset2 += dimensionPixelOffset;
        }
        int dimensionPixelOffset4 = dimensionPixelOffset3 + assistantEnableHeight + tempoEnableHeight + dimensionPixelOffset2;
        if (era.j(emh.b().i())) {
            dimensionPixelOffset4 = dimensionPixelOffset4 + getResources().getDimensionPixelOffset(R.dimen.health_common_130dp) + getResources().getDimensionPixelOffset(R.dimen.health_common_125dp);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dimensionPixelOffset4);
        int dimensionPixelOffset5 = getResources().getDimensionPixelOffset(R.dimen.health_common_12dp);
        layoutParams.setMarginStart(dimensionPixelOffset5);
        layoutParams.setMarginEnd(dimensionPixelOffset5);
        this.mHealthRecycleView.setLayoutParams(layoutParams);
    }

    private int getAssistantEnableHeight(int i, int i2) {
        if (era.j(emh.b().i())) {
            i2 *= 3;
        }
        return i + i2;
    }

    private int getTempoEnableHeight(int i, int i2) {
        if (era.j(emh.b().i())) {
            i2 *= 2;
        }
        return i + i2;
    }

    private etl getSwitchBarItemBean(int i, String str, boolean z, String str2) {
        etl itemBean = getItemBean(4, i, str, (SWITCH_BAR_VIBRATE_TYPE.equals(str2) || !z) ? R.drawable.list_item_background_single_normal : R.drawable.list_item_background_top_normal);
        itemBean.e(z);
        itemBean.e(str2);
        return itemBean;
    }

    private void setHeartRateRemindItem() {
        etl itemBean = getItemBean(2, R.string.IDS_rate_max_limit, getQuantityStr(R.plurals.IDS_rope_times_minute, this.mHeartRateRemindValue), R.drawable.list_item_background_bottom_normal);
        itemBean.e(HEART_RATE_TOP_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean);
    }

    private void setMetronomeEnableItem() {
        if (era.j(emh.b().i())) {
            etl itemBean = getItemBean(2, R.string.IDS_rope_tempo_type, getTempoDetail(this.mTempoTypeValue), R.color.emui_card_panel_bg);
            itemBean.e(TEMPO_VOICE_TYPE);
            this.mSettingsItemBeanArrayList.add(itemBean);
        }
        etl itemBean2 = getItemBean(2, R.string.IDS_rope_beat_sound_rhythm, getQuantityStr(R.plurals.IDS_rope_voice_bpm, this.mMetronomeTempoValue), R.drawable.list_item_background_bottom_normal);
        itemBean2.e(METRONOME_VOICE_TEMPO_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean2);
    }

    private void setVolumeEnableItem() {
        if (era.j(emh.b().i())) {
            etl itemBean = getItemBean(2, R.string.IDS_rope_voice_coaching, getVoiceCoachDetail(this.mVolumeCoachingValue), R.color.emui_card_panel_bg);
            itemBean.e(VOICE_COACHING_TYPE);
            this.mSettingsItemBeanArrayList.add(itemBean);
            etl itemBean2 = getItemBean(2, R.string.IDS_rope_voice_cv, getVoiceCvDetail(this.mVolumeCvValue), R.color.emui_card_panel_bg);
            itemBean2.e(VOICE_CV_TYPE);
            this.mSettingsItemBeanArrayList.add(itemBean2);
        }
        etl itemBean3 = getItemBean(2, R.string.IDS_rope_voice_broadcast_frequency, getQuantityStr(R.plurals.IDS_rope_jumps_time, this.mVolumeRemindFrequencyValue), R.drawable.list_item_background_bottom_normal);
        itemBean3.e(VOICE_FREQUENCY_TYPE);
        this.mSettingsItemBeanArrayList.add(itemBean3);
    }

    private void showHeartRateTopSetting(int i, String str) {
        View viewInflate = getLayoutInflater().inflate(R.layout.health_picker_setting_dialog, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.pause_trackline_type_picker);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = this.mHeartRateRemindMinValue; i3 <= this.mHeartRateRemindMaxValue; i3++) {
            arrayList.add(getResources().getQuantityString(R.plurals.IDS_rope_times_minute, i3, Integer.valueOf(i3)));
            if (this.mHeartRateRemindValue == i3) {
                i2 = i3 - this.mHeartRateRemindMinValue;
            }
        }
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[arrayList.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        healthNumberPicker.setValue(i2);
        showCustomViewDialog(R.string.IDS_rate_max_limit, viewInflate, healthNumberPicker, i, str);
    }

    private void showMetronomeVoiceTypeSetting(int i, String str) {
        ArrayList arrayList = new ArrayList();
        this.mBpmArray = era.j(emh.b().i()) ? BPM_PRO_ARRAY : BPM_ARRAY;
        int i2 = 0;
        for (int i3 = 0; i3 < this.mBpmArray.length; i3++) {
            Resources resources = getResources();
            int i4 = R.plurals.IDS_rope_voice_bpm;
            int i5 = this.mBpmArray[i3];
            arrayList.add(resources.getQuantityString(i4, i5, Integer.valueOf(i5)));
            if (this.mMetronomeTempoValue == this.mBpmArray[i3]) {
                i2 = i3;
            }
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.health_picker_setting_dialog, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.pause_trackline_type_picker);
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[arrayList.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        healthNumberPicker.setValue(i2);
        showCustomViewDialog(R.string.IDS_rope_beat_sound_rhythm, viewInflate, healthNumberPicker, i, str);
    }

    private void showCustomViewDialog(int i, View view, final HealthNumberPicker healthNumberPicker, final int i2, final String str) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mainActivity);
        builder.a(getString(i)).d(view).d(R.string.IDS_dialog_checkbox_confirm, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m1078xaea919df(healthNumberPicker, str, i2, view2);
            }
        }).c(R.string.IDS_dialog_checkbox_cancel, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a("RopeSkipSettingBaseFragment", "showCustomViewDialog cancel");
            }
        });
        builder.d().show();
    }

    /* JADX INFO: renamed from: lambda$showCustomViewDialog$2$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipSettingFragment, reason: not valid java name */
    /* synthetic */ void m1078xaea919df(HealthNumberPicker healthNumberPicker, String str, int i, View view) {
        LogUtil.a("RopeSkipSettingBaseFragment", "showCustomViewDialog confirm position", Integer.valueOf(healthNumberPicker.getValue()));
        if (METRONOME_VOICE_TEMPO_TYPE.equals(str)) {
            int[] iArr = this.mBpmArray;
            if (iArr == null || iArr.length < healthNumberPicker.getValue()) {
                return;
            }
            this.mMetronomeTempoValue = this.mBpmArray[healthNumberPicker.getValue()];
            setDetailPosition(i, getQuantityStr(R.plurals.IDS_rope_voice_bpm, this.mMetronomeTempoValue));
            emh.b().b(2, 4, new int[]{this.mTempoTypeValue, this.mMetronomeTempoValue});
            emh.b().d(this.mTempoTypeValue, this.mMetronomeTempoValue);
        } else if (HEART_RATE_TOP_TYPE.equals(str)) {
            this.mHeartRateRemindValue = healthNumberPicker.getValue() + this.mHeartRateRemindMinValue;
            setDetailPosition(i, getQuantityStr(R.plurals.IDS_rope_times_minute, this.mHeartRateRemindValue));
            setDetailPosition(i - 1, getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_limit_warning, Integer.valueOf(this.mHeartRateRemindValue)));
            emh.b().b(2, 5, new int[]{this.mHeartRateRemindValue});
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "showCustomViewDialog type no equals");
        }
        setAdapterData();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    protected void onReceiveMessage(int i, final HashMap<Integer, Object> map) {
        if (i == 25) {
            this.mIsSilentModeEnable = getBooleanValue(map, 40017).booleanValue();
            this.mIsVolumeAssistantEnable = getBooleanValue(map, 40018).booleanValue();
            this.mIsMetronomeEnable = getBooleanValue(map, 40019).booleanValue();
            this.mIsVibrateEnable = getBooleanValue(map, 40020).booleanValue();
            this.mIsHeartRateRemindEnable = getBooleanValue(map, 40021).booleanValue();
            LogUtil.a("RopeSkipSettingBaseFragment", "onReceiveMessage fitnessData mIsSilentModeEnable is ", Boolean.valueOf(this.mIsSilentModeEnable), ", mIsVolumeAssistantEnable is ", Boolean.valueOf(this.mIsVolumeAssistantEnable));
            sendEmptyHandleMessage(101);
            return;
        }
        if (i != 26) {
            return;
        }
        this.mVolumeValue = getIntValue(map, 40024).intValue();
        if (era.j(emh.b().i())) {
            this.mVolumeCoachingValue = getIntValue(map, 40025).intValue();
            this.mVolumeCvValue = getIntValue(map, 40026).intValue();
            this.mTempoTypeValue = getIntValue(map, 40027).intValue();
            int iIntValue = getIntValue(map, 40069).intValue();
            this.mMusicJumpValue = iIntValue;
            LogUtil.a("RopeSkipSettingBaseFragment", "onReceiveMessage fitnessData mVolumeCoachingValue is ", Integer.valueOf(this.mVolumeCoachingValue), ", mVolumeCvValue is ", Integer.valueOf(this.mVolumeCvValue), ", mMusicJumpValue is ", Integer.valueOf(iIntValue));
        }
        this.mVolumeRemindFrequencyValue = getIntValue(map, 40041).intValue();
        this.mMetronomeTempoValue = getIntValue(map, 40028).intValue();
        this.mHeartRateRemindValue = getIntValue(map, 40029).intValue();
        LogUtil.a("RopeSkipSettingBaseFragment", "onReceiveMessage fitnessData mVolumeValue is ", Integer.valueOf(this.mVolumeValue), ", mVolumeRemindFrequencyValue is ", Integer.valueOf(this.mVolumeRemindFrequencyValue));
        sendEmptyHandleMessage(101);
        emr.d().a(new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1077x845b20f5(map, i2, (HeartRateZoneMgr) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onReceiveMessage$4$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-RopeSkipSettingFragment, reason: not valid java name */
    /* synthetic */ void m1077x845b20f5(HashMap map, int i, HeartRateZoneMgr heartRateZoneMgr) {
        if (heartRateZoneMgr == null) {
            LogUtil.j("RopeSkipSettingBaseFragment", "getHeartRateZoneMgr null");
        } else {
            setHeartRateZoneToRope(map, heartRateZoneMgr);
        }
    }

    private void setHeartRateZoneToRope(HashMap<Integer, Object> map, HeartRateZoneMgr heartRateZoneMgr) {
        HeartRateThresholdConfig postureType = heartRateZoneMgr.getPostureType(4);
        if (postureType == null) {
            LogUtil.a("RopeSkipSettingBaseFragment", "setHeartRateZoneToRope otherHeart is null");
            return;
        }
        LogUtil.a("RopeSkipSettingBaseFragment", "setHeartRateZoneToRope");
        int[] iArr = {1, postureType.getAerobicBaseThreshold(), postureType.getAerobicAdvanceThreshold(), postureType.getLacticAcidThreshold(), postureType.getAnaerobicBaseThreshold(), postureType.getAnaerobicAdvanceThreshold(), postureType.getMaxThreshold()};
        if (Arrays.equals(new int[]{getIntValue(map, 40030).intValue(), getIntValue(map, 40031).intValue(), getIntValue(map, 40032).intValue(), getIntValue(map, 40033).intValue(), getIntValue(map, 40034).intValue(), getIntValue(map, 40035).intValue(), getIntValue(map, 40036).intValue()}, iArr)) {
            return;
        }
        LogUtil.a("RopeSkipSettingBaseFragment", "setHeartRateZoneToRope setFitnessRopeConfig");
        emh.b().b(2, 6, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeekBarView(int i) {
        if (i == 0) {
            this.mHealthSeekBar.setThumb(getResources().getDrawable(R.drawable.white_dot));
            this.mHealthSeekBar.setThumbOffset(1);
        } else if (i > 0 && this.mHealthSeekBar.getThumbOffset() != 0) {
            setThumb();
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "setSeekBarView else");
        }
        if (i > 0 && i < 50) {
            this.mHealthSeekBar.setProgressDrawable(getResources().getDrawable(R.drawable.volume_seekbar_no_right_radius_bg));
        } else {
            this.mHealthSeekBar.setProgressDrawable(getResources().getDrawable(R.drawable.volume_seekbar_bg));
        }
    }

    private void setThumb() {
        if (LanguageUtil.ba(this.mainActivity) && !era.l(Constants.URDU_LANG)) {
            this.mHealthSeekBar.setThumb(getResources().getDrawable(R.drawable.white_center_dot_rtl));
        } else {
            this.mHealthSeekBar.setThumb(getResources().getDrawable(R.drawable.white_center_dot));
        }
        this.mHealthSeekBar.setThumbOffset(0);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    protected void refreshPage() {
        super.refreshPage();
        if (this.mainActivity == null) {
            LogUtil.j("RopeSkipSettingBaseFragment", "refreshPage mainActivity is null");
        } else {
            setData();
            setAdapterData();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        emh.b().a("RopeSkipSettingBaseFragment", false);
    }
}
