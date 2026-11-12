package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.hearratecontrol.callback.ConfigCallBack;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ehx;
import defpackage.eru;
import defpackage.iov;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RateControlCourseDetailFragment extends BaseFragment implements Handler.Callback {
    public static final String COURSE_ID = "course_id";
    private static final String INDOOR_EQUIP_CONNECTED_ACTIVITY = "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity";
    private static final String KEY_PROTOCOL = "PROTOCOL_FROM_QRCODE";
    private static final String KEY_SOURCE = "START_SPORT_SOURCE";
    private static final String PROTOCOL_FTMP = "2";
    private static final int QUERY_TIMEOUT_MSG = 1;
    private static final long QUERY_TIMEOUT_TIME = 2000;
    private static final String SCAN_BTN_APP = "ScanBtnAPP";
    private static final String TAG = "RateControlCourseDetailFragment";
    private static final float WIDTH_HEIGHT_PROPORTIONS = 0.56f;
    private RateControlStageListAdapter mActionsListAdapter;
    private HealthImageView mBannerImage;
    private String mCourseId;
    private FitWorkout mFitWorkout;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), this);
    private volatile boolean mIsTimeout = false;
    private HealthRecycleView mRvStage;
    private int mType;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mType = arguments.getInt("deviceType");
            this.mCourseId = arguments.getString("course_id");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = viewOnCreateView instanceof ViewGroup ? (ViewGroup) viewOnCreateView : null;
        this.child = layoutInflater.inflate(R.layout.fragment_rate_control_course_detail, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
            initData();
            return viewGroup2;
        }
        return this.child;
    }

    private void initView(View view) {
        this.mBannerImage = (HealthImageView) view.findViewById(R.id.iv_actions_banner);
        this.mRvStage = (HealthRecycleView) view.findViewById(R.id.rv_actions_list);
        view.findViewById(R.id.action_start_training).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlCourseDetailFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m1105xad0af52e(view2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$1$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlCourseDetailFragment, reason: not valid java name */
    /* synthetic */ void m1105xad0af52e(View view) {
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
            return;
        }
        if (!((IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class)).isDeviceBtConnected()) {
            LogUtil.d(TAG, "Device disconnect");
            qpx.e(this.mainActivity, R.string.IDS_bolt_bluetooth_disconnected);
        } else {
            this.mIsTimeout = false;
            this.mHandler.sendEmptyMessageDelayed(1, 2000L);
            eru.c((ResponseCallback<Boolean>) new ResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlCourseDetailFragment$$ExternalSyntheticLambda2
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1104x8e50bd6d(i, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlCourseDetailFragment, reason: not valid java name */
    /* synthetic */ void m1104x8e50bd6d(int i, Boolean bool) {
        String str = TAG;
        LogUtil.a(str, "checkWearStatus: status = ", Integer.valueOf(i), ", data = ", bool);
        this.mHandler.removeMessages(1);
        if (this.mIsTimeout) {
            LogUtil.a(str, "checkWearStatus: query was already timeout, abandon the outdated result");
            return;
        }
        if (i == -2) {
            eru.c(this.mainActivity, this.mType);
            return;
        }
        if (i == -3) {
            eru.b(this.mainActivity, this.mType);
            return;
        }
        if (i == 1) {
            startIndoorEquipActivity();
            return;
        }
        if (i == 2) {
            eru.b(this.mainActivity);
        } else if (i == -4) {
            eru.f(this.mainActivity);
        } else {
            startIndoorEquipActivity();
        }
    }

    private void initData() {
        this.mCustomTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.mRvStage.setLayoutManager(new LinearLayoutManager(this.mainActivity));
        RateControlStageListAdapter rateControlStageListAdapter = new RateControlStageListAdapter(this.mainActivity, this.mType);
        this.mActionsListAdapter = rateControlStageListAdapter;
        this.mRvStage.setAdapter(rateControlStageListAdapter);
        ehx.a(this.mType, this.mCourseId, new ConfigCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlCourseDetailFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj) {
                this.f$0.m1103xddd6db74((FitWorkout) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initData$2$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlCourseDetailFragment, reason: not valid java name */
    /* synthetic */ void m1103xddd6db74(FitWorkout fitWorkout) {
        if (fitWorkout == null || this.mainActivity == null) {
            LogUtil.d(TAG, "fitWorkout or mainActivity is null");
            return;
        }
        this.mFitWorkout = fitWorkout;
        setTitle(fitWorkout.acquireName());
        Glide.with(this.mainActivity).load(this.mFitWorkout.acquireMidPicture()).transform(new RoundedCorners(getResources().getDimensionPixelOffset(R.dimen.health_common_10dp))).into(this.mBannerImage);
        List<ChoreographedMultiActions> courseActions = fitWorkout.getCourseActions();
        if (njy.e(courseActions)) {
            return;
        }
        this.mActionsListAdapter.setData(courseActions.get(0).getActionList());
    }

    private void startIndoorEquipActivity() {
        Bundle arguments = getArguments();
        if (arguments == null || this.mFitWorkout == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(KEY_PROTOCOL, "2");
        String string = arguments.getString("uniqueId");
        if (!TextUtils.isEmpty(string)) {
            intent.putExtra("BLE_FROM_QRCODE", string.replace(":", ""));
        }
        intent.putExtra("DEVICE_TYPE_INDEX", this.mType == 265 ? BleConstants.SPORT_TYPE_BIKE : "31");
        intent.putExtra("BLENAME_FROM_QRCODE", arguments.getString("name"));
        intent.putExtra(KEY_SOURCE, SCAN_BTN_APP);
        intent.putExtra("courseId", this.mCourseId);
        intent.putExtra(WorkoutRecord.Extend.COURSE_TARGET_VALUE, this.mFitWorkout.acquireDuration() + 1);
        intent.putExtra("sn", arguments.getString("sn"));
        intent.putExtra(ProfileRequestConstants.MANU, arguments.getString(ProfileRequestConstants.MANU));
        intent.putExtra("model", arguments.getString("model"));
        intent.putExtra("productId", arguments.getString("productId"));
        intent.setClassName(BaseApplication.getAppPackage(), INDOOR_EQUIP_CONNECTED_ACTIVITY);
        iov.d(this.mainActivity, intent);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        LogUtil.a(TAG, "handleMessage: msg.what = ", Integer.valueOf(i));
        if (i == 1) {
            this.mIsTimeout = true;
            eru.g(this.mainActivity);
        }
        return true;
    }
}
