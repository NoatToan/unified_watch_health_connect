package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment;

import android.os.Bundle;
import android.view.View;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.emh;
import defpackage.eqt;
import defpackage.etl;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipRadioButtonSettingFragment extends RopeSkipSettingBaseFragment {
    private int mSelectType;
    private int mSelectValue;
    private int mTempoValue;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mSelectType = arguments.getInt(RopeSkipSettingBaseFragment.ROPE_RADIO_SELECT_TYPE);
            this.mSelectValue = arguments.getInt(RopeSkipSettingBaseFragment.ROPE_RADIO_SELECT_TYPE_VALUE);
            this.mTempoValue = arguments.getInt(RopeSkipSettingBaseFragment.ROPE_TEMPO_VALUE);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initData() {
        setMarginTop();
        super.initData();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    /* JADX INFO: renamed from: setItemClickListener */
    public void m1074x1c99b493(View view, int i, etl etlVar) {
        if (etlVar == null) {
            return;
        }
        int i2 = this.mSelectType;
        if (i2 == 0) {
            sendRopeDeviceSetting(2, etlVar.c());
        } else if (i2 == 1) {
            sendRopeDeviceSetting(3, etlVar.c());
        } else if (i2 == 2) {
            sendRopeDeviceSetting(8, etlVar.c());
        } else if (i2 == 3) {
            emh.b().b(2, 4, new int[]{etlVar.c(), this.mTempoValue});
        } else if (i2 == 4) {
            sendRopeDeviceSetting(10, etlVar.c());
        } else if (i2 == 5) {
            eqt.c().b(emh.b().d(), etlVar.c());
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "setItemClickListener default");
        }
        popupFragment(RopeSkipSettingFragment.class);
    }

    private void sendRopeDeviceSetting(int i, int i2) {
        emh.b().b(2, i, new int[]{i2});
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initSettingsData() {
        LogUtil.a("RopeSkipSettingBaseFragment", "initSettingsData radio select type is ", Integer.valueOf(this.mSelectType));
        int i = this.mSelectType;
        if (i == 0) {
            setTitle(getString(R.string.IDS_rope_voice_coaching));
            setVoiceCoaching();
            return;
        }
        if (i == 1) {
            setTitle(getString(R.string.IDS_rope_voice_cv));
            setVoiceCv();
            return;
        }
        if (i == 2) {
            setTitle(getString(R.string.IDS_rope_voice_broadcast_frequency));
            setBroadcastFrequency();
            return;
        }
        if (i == 3) {
            setTitle(getString(R.string.IDS_rope_tempo_type));
            setTempoType();
        } else if (i == 4) {
            setTitle(getString(R.string.IDS_rope_music_skip_mode));
            setMusicJumpMode();
        } else if (i == 5) {
            setTitle(getString(R.string.IDS_rope_connect_mode));
            setConnectMode();
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "initSettingsData default");
        }
    }

    private void setConnectMode() {
        etl itemBean = getItemBean(3, R.string.IDS_rope_connect_mode_personal, getConnectModeDetail(3), R.drawable.list_item_background_top_normal);
        itemBean.e(1);
        itemBean.e(this.mSelectValue == 1);
        this.mSettingsItemBeanArrayList.add(itemBean);
        etl itemBean2 = getItemBean(3, R.string.IDS_rope_connect_mode_sharing, getConnectModeDetail(4), R.drawable.list_item_background_bottom_normal);
        itemBean2.e(2);
        itemBean2.e(this.mSelectValue == 2);
        this.mSettingsItemBeanArrayList.add(itemBean2);
    }

    private void setVoiceCoaching() {
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getVoiceCoachDetail(2), 2, R.drawable.list_item_background_top_normal, this.mSelectValue == 2));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getVoiceCoachDetail(1), 1, R.drawable.list_item_background_bottom_normal, this.mSelectValue == 1));
    }

    private void setVoiceCv() {
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getVoiceCvDetail(1), 1, R.drawable.list_item_background_top_normal, this.mSelectValue == 1));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getVoiceCvDetail(2), 2, R.color.emui_card_panel_bg, this.mSelectValue == 2));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getVoiceCvDetail(3), 3, R.drawable.list_item_background_bottom_normal, this.mSelectValue == 3));
    }

    private void setBroadcastFrequency() {
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getJumpsTimeString(50), 50, R.drawable.list_item_background_top_normal, this.mSelectValue == 50));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getJumpsTimeString(100), 100, R.color.emui_card_panel_bg, this.mSelectValue == 100));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getJumpsTimeString(150), 150, R.color.emui_card_panel_bg, this.mSelectValue == 150));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getJumpsTimeString(200), 200, R.drawable.list_item_background_bottom_normal, this.mSelectValue == 200));
    }

    private void setTempoType() {
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getTempoDetail(4), 4, R.drawable.list_item_background_top_normal, this.mSelectValue == 4));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getTempoDetail(3), 3, R.color.emui_card_panel_bg, this.mSelectValue == 3));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getTempoDetail(2), 2, R.drawable.list_item_background_bottom_normal, this.mSelectValue == 2));
    }

    private void setMusicJumpMode() {
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getMusicJumpDetail(2), 2, R.drawable.list_item_background_top_normal, this.mSelectValue == 2));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getMusicJumpDetail(1), 1, R.color.emui_card_panel_bg, this.mSelectValue == 1));
        this.mSettingsItemBeanArrayList.add(getItemBean(5, getMusicJumpDetail(3), 3, R.drawable.list_item_background_bottom_normal, this.mSelectValue == 3));
    }

    private String getJumpsTimeString(int i) {
        return getQuantityStr(R.plurals.IDS_rope_jumps_time, i);
    }
}
