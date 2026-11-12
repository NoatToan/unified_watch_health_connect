package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.adapter.RopeDeviceSettingsAdapter;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.emh;
import defpackage.era;
import defpackage.erh;
import defpackage.etl;
import defpackage.hai;
import defpackage.lmf;
import defpackage.njy;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipSettingBaseFragment extends BaseFragment implements MessageOrStateCallback {
    private static final String BUNDLE_KEY_SPORT_LAUNCH_PARAS = "bundle_key_sport_launch_paras";
    public static final int CONNECT_MODE_TYPE = 5;
    private static final String INDOOR_EQUIP_DISPLAY_ACTIVITY = "com.huawei.indoorequip.activity.IndoorEquipDisplayActivity";
    protected static final int MESSAGE_REFRESH_PAGE = 101;
    public static final int MUSIC_JUMP_TYPE = 4;
    protected static final int NULL_IMAGE_RESOURCE = -1;
    public static final int PARAMS_BOY = 1;
    public static final int PARAMS_CHILDREN = 3;
    public static final int PARAMS_CLAVES = 2;
    public static final int PARAMS_COMPANION = 1;
    public static final int PARAMS_GIRL = 2;
    public static final int PARAMS_LIST_LOOP = 2;
    public static final int PARAMS_MECHANICAL = 3;
    public static final int PARAMS_PERSONAL_DETAIL_MODE = 3;
    public static final int PARAMS_PERSONAL_MODE = 1;
    public static final int PARAMS_RANDOM_PLAY = 3;
    public static final int PARAMS_SHARING_DETAIL_MODE = 4;
    public static final int PARAMS_SHARING_MODE = 2;
    public static final int PARAMS_SIMPLIFIED = 2;
    public static final int PARAMS_SINGLE_CYCLE = 1;
    public static final int PARAMS_VOICE_BROADCAST_FREQUENCY_FIFTY_PCS = 50;
    public static final int PARAMS_VOICE_BROADCAST_FREQUENCY_HUNDRED_FIFTY_PCS = 150;
    public static final int PARAMS_VOICE_BROADCAST_FREQUENCY_ONE_HUNDRED_PCS = 100;
    public static final int PARAMS_VOICE_BROADCAST_FREQUENCY_TWO_HUNDRED_PCS = 200;
    public static final int PARAMS_WOODEN_FISH = 4;
    public static final String ROPE_RADIO_SELECT_TYPE = "rope_radio_select_type";
    public static final String ROPE_RADIO_SELECT_TYPE_VALUE = "rope_radio_select_type_value";
    public static final String ROPE_TEMPO_VALUE = "rope_tempo_value";
    protected static final String TAG = "RopeSkipSettingBaseFragment";
    public static final int TEMPO_TYPE = 3;
    public static final int VOICE_BROADCAST_FREQUENCY = 2;
    public static final int VOICE_COACHING = 0;
    public static final int VOICE_CV = 1;
    protected HealthRecycleView mHealthRecycleView;
    protected HealthLinearLayoutManager mLayoutManager;
    protected RopeDeviceSettingsAdapter.OnItemClickListener mOnItemClickListener;
    protected RopeDeviceSettingsAdapter mRecyclerViewAdapter;
    protected ArrayList<etl> mSettingsItemBeanArrayList = new ArrayList<>(10);
    protected RopeSettingHandler mRopeSettingHandler = new RopeSettingHandler();

    public void initSettingsData() {
    }

    protected void onReceiveMessage(int i, HashMap<Integer, Object> map) {
    }

    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onStateChange(String str) {
    }

    protected void refreshPage() {
    }

    /* JADX INFO: renamed from: setItemClickListener, reason: merged with bridge method [inline-methods] */
    public void m1074x1c99b493(View view, int i, etl etlVar) {
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (layoutInflater == null) {
            LogUtil.a(TAG, "BloodPressureResultFragment onCreateView inflater is null");
            return viewGroup2;
        }
        createChildView(layoutInflater, viewGroup);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
            initData();
        }
        return viewGroup2;
    }

    protected void createChildView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.child = layoutInflater.inflate(R.layout.fragment_rope_settings, viewGroup, false);
    }

    protected void setMarginTop() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_12dp);
        layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.mHealthRecycleView.setLayoutParams(layoutParams);
    }

    public void initView(View view) {
        this.mHealthRecycleView = (HealthRecycleView) view.findViewById(R.id.voice_settings_recycleview);
        this.mLayoutManager = new HealthLinearLayoutManager(this.mainActivity);
    }

    public void initData() {
        this.mCustomTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.mHealthRecycleView.setLayoutManager(this.mLayoutManager);
        this.mOnItemClickListener = new RopeDeviceSettingsAdapter.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.RopeDeviceSettingsAdapter.OnItemClickListener
            public final void onItemClick(View view, int i, etl etlVar) {
                this.f$0.m1074x1c99b493(view, i, etlVar);
            }
        };
        RopeDeviceSettingsAdapter ropeDeviceSettingsAdapter = new RopeDeviceSettingsAdapter(this.mainActivity, this.mOnItemClickListener);
        this.mRecyclerViewAdapter = ropeDeviceSettingsAdapter;
        this.mHealthRecycleView.setAdapter(ropeDeviceSettingsAdapter);
        this.mSettingsItemBeanArrayList.clear();
        initSettingsData();
        setAdapterData();
    }

    protected void setAdapterData() {
        this.mRecyclerViewAdapter.e(this.mSettingsItemBeanArrayList);
    }

    private etl getItemBean(int i, String str, String str2, int i2) {
        etl etlVar = new etl();
        etlVar.d(i);
        etlVar.b(str);
        etlVar.c(str2);
        if (i2 != -1) {
            etlVar.c(i2);
        }
        return etlVar;
    }

    protected etl getItemBean(int i, int i2, String str, int i3) {
        return getItemBean(i, getString(i2), str, i3);
    }

    protected etl getItemBean(int i, String str, int i2, int i3) {
        etl itemBean = getItemBean(i, str, "", i3);
        itemBean.e(i2);
        return itemBean;
    }

    protected etl getItemBean(int i, int i2, int i3, int i4) {
        return getItemBean(i, getString(i2), i3, i4);
    }

    protected etl getItemBean(int i, int i2, String str, int i3, String str2) {
        etl itemBean = getItemBean(i, i2, str, i3);
        itemBean.e(str2);
        return itemBean;
    }

    protected etl getItemBean(int i, String str, int i2, int i3, boolean z) {
        etl itemBean = getItemBean(i, str, "", i3);
        itemBean.e(i2);
        itemBean.e(z);
        return itemBean;
    }

    protected etl getDividerItemBean() {
        etl etlVar = new etl();
        etlVar.d(1);
        return etlVar;
    }

    protected String getQuantityStr(int i, int i2) {
        return getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    protected String getQuantityStr(int i, int i2, String str) {
        return getResources().getQuantityString(i, i2, str);
    }

    protected void setDetailPosition(int i, String str) {
        if (njy.c(this.mSettingsItemBeanArrayList, i)) {
            this.mSettingsItemBeanArrayList.get(i).c(str);
        }
    }

    protected void jumpToDisplayActivity(int i, int i2, int i3, int i4, int i5) {
        String strI = emh.b().i();
        String strD = emh.b().d();
        HashMap map = new HashMap(10);
        map.put("prodId", era.b(strI));
        map.put("macAddress", erh.d(strD));
        map.put("intermittentJumpMode", Integer.valueOf(i));
        map.put("intermittentJumpExerciseTime", Integer.valueOf(i2));
        map.put("intermittentJumpExerciseNum", Integer.valueOf(i3));
        map.put("intermittentJumpBreakTime", Integer.valueOf(i4));
        map.put("intermittentJumpGroups", Integer.valueOf(i5));
        lmf.d().c(this.mainActivity, AnalyticsValue.HEALTH_SKIPPING_2170016.value(), map, 0);
        emh.b().b(3, 5, new int[]{i2, i3, i4, i5});
        IntermitentJumpData intermitentJumpData = new IntermitentJumpData();
        intermitentJumpData.setIntermittentJumpMode(i);
        intermitentJumpData.setIntermittentJumpExerciseTime(i2);
        intermitentJumpData.setIntermittentJumpExerciseNum(i3);
        intermitentJumpData.setIntermittentJumpBreakTime(i4);
        intermitentJumpData.setIntermittentJumpGroups(i5);
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setSportType(283);
        sportLaunchParams.setSportTarget(8);
        sportLaunchParams.addExtra("productId", strI);
        sportLaunchParams.addExtra("type_intermittent_jump_mode_data", intermitentJumpData);
        Intent intent = new Intent();
        intent.putExtra(BUNDLE_KEY_SPORT_LAUNCH_PARAS, sportLaunchParams);
        intent.setClassName(BaseApplication.getAppPackage(), INDOOR_EQUIP_DISPLAY_ACTIVITY);
        hai.d(this.mainActivity, intent);
    }

    protected Boolean getBooleanValue(HashMap<Integer, Object> map, int i) {
        return Boolean.valueOf((map.get(Integer.valueOf(i)) == null || !(map.get(Integer.valueOf(i)) instanceof Boolean)) ? false : ((Boolean) map.get(Integer.valueOf(i))).booleanValue());
    }

    protected Integer getIntValue(HashMap<Integer, Object> map, int i) {
        return Integer.valueOf((map.get(Integer.valueOf(i)) == null || !(map.get(Integer.valueOf(i)) instanceof Integer)) ? 0 : ((Integer) map.get(Integer.valueOf(i))).intValue());
    }

    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onNewMessage(int i, Bundle bundle) {
        HashMap<Integer, Object> map;
        if (i != 902 || bundle == null) {
            return;
        }
        int i2 = bundle.getInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE");
        LogUtil.a(TAG, "code is ", Integer.valueOf(i), " dataType is ", Integer.valueOf(i2));
        Serializable serializable = bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA");
        if ((serializable instanceof HashMap) && (map = (HashMap) serializable) != null) {
            LogUtil.a(TAG, "onReceiveMessage fitnessData");
            onReceiveMessage(i2, map);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        removeHandleMessage();
        LogUtil.a(TAG, "onDestroyView");
    }

    protected String getVoiceCoachDetail(int i) {
        if (i == 1) {
            return getString(R.string.IDS_rope_companion_edition);
        }
        if (i == 2) {
            return getString(R.string.IDS_rope_simplified_edition);
        }
        LogUtil.d(TAG, "getVoiceCoachDetail else");
        return "";
    }

    protected String getVoiceCvDetail(int i) {
        if (i == 1) {
            return getString(R.string.IDS_rope_cv_boy);
        }
        if (i == 2) {
            return getString(R.string.IDS_rope_cv_girl);
        }
        if (i == 3) {
            return getString(R.string.IDS_rope_cv_children);
        }
        LogUtil.d(TAG, "getVoiceCvDetail default");
        return "";
    }

    protected String getTempoDetail(int i) {
        if (i == 2) {
            return getString(R.string.IDS_rope_tempo_type_claves);
        }
        if (i == 3) {
            return getString(R.string.IDS_rope_tempo_type_mechanical);
        }
        if (i == 4) {
            return getString(R.string.IDS_rope_tempo_type_wooden_fish);
        }
        LogUtil.d(TAG, "getTempoDetail default");
        return "";
    }

    protected String getMusicJumpDetail(int i) {
        if (i == 1) {
            return getString(R.string.IDS_rope_music_skip_single_loop);
        }
        if (i == 2) {
            return getString(R.string.IDS_rope_music_skip_list_loop);
        }
        if (i == 3) {
            return getString(R.string.IDS_rope_music_skip_random_play);
        }
        LogUtil.d(TAG, "getMusicJumpDetail default");
        return "";
    }

    protected String getConnectModeDetail(int i) {
        if (i == 1) {
            return getString(R.string.IDS_rope_connect_mode_personal);
        }
        if (i == 2) {
            return getString(R.string.IDS_rope_connect_mode_sharing);
        }
        if (i == 3) {
            return getString(R.string.IDS_rope_connect_mode_personal_detail);
        }
        if (i == 4) {
            return getString(R.string.IDS_rope_connect_mode_sharing_detail);
        }
        LogUtil.d(TAG, "getConnectModeDetail default");
        return "";
    }

    protected void sendEmptyHandleMessage(int i) {
        RopeSettingHandler ropeSettingHandler = this.mRopeSettingHandler;
        if (ropeSettingHandler != null) {
            ropeSettingHandler.sendEmptyMessage(i);
        }
    }

    protected void removeHandleMessage() {
        RopeSettingHandler ropeSettingHandler = this.mRopeSettingHandler;
        if (ropeSettingHandler != null) {
            ropeSettingHandler.removeCallbacksAndMessages(null);
            this.mRopeSettingHandler = null;
        }
    }

    protected static class RopeSettingHandler extends Handler {
        private WeakReference<RopeSkipSettingBaseFragment> mWeakReference;

        private RopeSettingHandler(RopeSkipSettingBaseFragment ropeSkipSettingBaseFragment) {
            this.mWeakReference = new WeakReference<>(ropeSkipSettingBaseFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            RopeSkipSettingBaseFragment ropeSkipSettingBaseFragment = this.mWeakReference.get();
            if (ropeSkipSettingBaseFragment == null || !ropeSkipSettingBaseFragment.isAdded() || ropeSkipSettingBaseFragment.isRemoving() || ropeSkipSettingBaseFragment.isDetached()) {
                LogUtil.d(RopeSkipSettingBaseFragment.TAG, "fragment isAdded");
            } else if (message.what != 101) {
                LogUtil.j(RopeSkipSettingBaseFragment.TAG, "not have this case");
            } else {
                ropeSkipSettingBaseFragment.refreshPage();
            }
        }
    }
}
