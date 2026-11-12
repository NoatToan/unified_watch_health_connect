package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.kit.hwwsp.hagrid.bean.MiniUserDataInfo;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dnj;
import defpackage.doq;
import defpackage.dow;
import defpackage.drw;
import defpackage.dti;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyc;
import defpackage.dyq;
import defpackage.ean;
import defpackage.eaq;
import defpackage.ecj;
import defpackage.qlo;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiBodyFatScaleDataManagerFragment extends BaseFragment implements View.OnClickListener {
    private static final int COLLECTION_DEFAULT_SIZE = 16;
    private static final String DEFAULT_IMAGE_PATH_IDENTIFIER = "default";
    private static final String DEVICE_MAIN_ID = "0";
    private static final int GET_USER_MAX_LEN = 31;
    private static final int MSG_INIT_ADAPTER = 1;
    private static final int MSG_ONRESUME_ADAPTER = 2;
    private static final String TAG = "WiFiBodyFatScaleDataManagerFragment";
    private static final float USERINFO_CLEAR_BUTTON = 0.3f;
    private static final int USER_TYPE = -1;
    private static final int USER_WEIGHT_DIVISOR_VALUE = 10;
    private static final double WEIGHT_VALUE_MAX = 250.0d;
    private static final double WEIGHT_VALUE_MIN = 0.0d;
    private ScaleManagerAdapter mAdapter;
    private HealthTextView mClearUserWeightDataTipMsg;
    private Context mContext;
    private HealthDevice mDevice;
    private String mDeviceId;
    private ContentValues mDeviceInfo;
    private boolean mIsHasDeviceData;
    private ListView mListView;
    private MyHandler mMyHandler;
    private String mProductId;
    private String mUniqueId;
    private MiniUserDataInfo mUserDataInfo;
    private ArrayList<MiniUserDataInfo> mUserDataInfoList;
    private HealthButton mUserInfoClearBtn;
    private List<eaq> mUserList;
    private boolean mIsRefreshUserData = false;
    private EventBus.ICallback mCallback = new EventBus.ICallback() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiBodyFatScaleDataManagerFragment.1
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar != null && "device_user_success".equals(dVar.e())) {
                WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment = WiFiBodyFatScaleDataManagerFragment.this;
                wiFiBodyFatScaleDataManagerFragment.mUserList = wiFiBodyFatScaleDataManagerFragment.getUserClearBean();
                WiFiBodyFatScaleDataManagerFragment.this.mMyHandler.sendEmptyMessage(1);
                return;
            }
            if (dVar == null || !"get_user_data_result".equals(dVar.e())) {
                LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "callback onEvent error");
                return;
            }
            Bundle bundleB = dVar.b();
            if (bundleB == null) {
                LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "callback onEvent bundle is null");
                return;
            }
            WiFiBodyFatScaleDataManagerFragment.this.mUserDataInfo = (MiniUserDataInfo) bundleB.getParcelable("userData");
            if (WiFiBodyFatScaleDataManagerFragment.this.mUserDataInfo != null && WiFiBodyFatScaleDataManagerFragment.this.mUserDataInfo.getIsOver() == 1) {
                LogUtil.d(WiFiBodyFatScaleDataManagerFragment.TAG, "get userDataInfo from device by Ble, mUserDataInfo huid : ", WiFiBodyFatScaleDataManagerFragment.this.mUserDataInfo.getHuid(), "user weight : ", Double.valueOf(WiFiBodyFatScaleDataManagerFragment.this.mUserDataInfo.getWeight()));
                EventBus.a(new EventBus.d("get_user_data_next"));
            }
            WiFiBodyFatScaleDataManagerFragment.this.mIsRefreshUserData = true;
            WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment2 = WiFiBodyFatScaleDataManagerFragment.this;
            wiFiBodyFatScaleDataManagerFragment2.mUserList = wiFiBodyFatScaleDataManagerFragment2.getUserClearBean();
            WiFiBodyFatScaleDataManagerFragment.this.mMyHandler.sendEmptyMessage(1);
        }
    };

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "onCreate");
        this.mMyHandler = new MyHandler(this);
        this.mUserDataInfoList = new ArrayList<>(10);
        this.mContext = dxw.d();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mDeviceId = arguments.getString("deviceId");
            this.mProductId = arguments.getString("productId");
            ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mUniqueId = contentValues.getAsString("uniqueId");
                this.mProductId = this.mDeviceInfo.getAsString("productId");
            }
        }
        if (dxm.c(this.mProductId, this.mUniqueId)) {
            ean.d();
        } else if (dti.d(this.mainActivity, this.mProductId, this.mUniqueId).c()) {
            sendGetUserDataDirectives();
        } else {
            LogUtil.j(TAG, "onCreate haiger device get user data fail");
        }
        EventBus.b(this.mCallback, 2, "device_user_success", "get_user_data_result");
    }

    private void sendGetUserDataDirectives() {
        byte[] bArr = new byte[31];
        byte[] bArrC = new dow().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        Bundle bundle = new Bundle();
        bundle.putByteArray(JsbMapKeyNames.H5_USER_ID, bArr);
        bundle.putInt("userType", -15);
        bundle.putInt("type", -1);
        doq.e().prepare(dmp.d().b(this.mUniqueId, false), null, bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.child = layoutInflater.inflate(R.layout.wifi_device_scale_manager_layout, viewGroup, false);
        initView();
        initData();
        if (viewOnCreateView instanceof ViewGroup) {
            ((ViewGroup) viewOnCreateView).addView(this.child);
        }
        return viewOnCreateView;
    }

    private void initData() {
        this.mUserList = new ArrayList(16);
        HealthDevice healthDeviceC = drw.e().c(this.mDeviceId);
        this.mDevice = healthDeviceC;
        if (healthDeviceC != null) {
            this.mClearUserWeightDataTipMsg.setVisibility(0);
        } else {
            this.mClearUserWeightDataTipMsg.setVisibility(8);
        }
        initWeightUser();
    }

    private void initWeightUser() {
        MultiUsersManager.INSTANCE.getOtherUserData(new IBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiBodyFatScaleDataManagerFragment.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment = WiFiBodyFatScaleDataManagerFragment.this;
                wiFiBodyFatScaleDataManagerFragment.mUserList = wiFiBodyFatScaleDataManagerFragment.getUserClearBean();
                WiFiBodyFatScaleDataManagerFragment.this.mMyHandler.sendEmptyMessage(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAdapter() {
        ScaleManagerAdapter scaleManagerAdapter = new ScaleManagerAdapter(this.mUserList);
        this.mAdapter = scaleManagerAdapter;
        this.mListView.setAdapter((ListAdapter) scaleManagerAdapter);
        LogUtil.a(TAG, "initAdapter mDevice is null :", Boolean.valueOf(this.mDevice == null), ",isNetworkConnected :", Boolean.valueOf(CommonUtil.ab(this.mainActivity)), ",mIsHasDeviceData :", Boolean.valueOf(this.mIsHasDeviceData));
        if ((this.mDevice != null && !CommonUtil.ab(this.mainActivity)) || !this.mIsHasDeviceData) {
            this.mUserInfoClearBtn.setEnabled(false);
            this.mUserInfoClearBtn.setAlpha(USERINFO_CLEAR_BUTTON);
        } else {
            this.mUserInfoClearBtn.setEnabled(true);
            this.mUserInfoClearBtn.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<eaq> getUserClearBean() {
        ArrayList<eaq> arrayList = new ArrayList<>(16);
        List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        this.mIsHasDeviceData = false;
        for (dnj dnjVar : allUser) {
            eaq eaqVar = new eaq();
            String strI = dnjVar.i();
            LogUtil.d(TAG, "getUserClearBean, user:", dnjVar.toString(), "weight:", Float.valueOf(dnjVar.r()), "uuid:", strI);
            if (!dxm.ax(this.mProductId)) {
                eaqVar = setUserDataFromBluetooth(dnjVar, strI, accountInfo);
                arrayList.add(eaqVar);
            } else {
                setUserData(accountInfo, dnjVar, eaqVar, strI);
                arrayList.add(eaqVar);
            }
            LogUtil.d(TAG, "UserClearBean user:", eaqVar.c(), "weight:", Double.valueOf(eaqVar.e()));
        }
        return arrayList;
    }

    private eaq setUserDataFromBluetooth(dnj dnjVar, String str, String str2) {
        eaq eaqVar = new eaq();
        eaqVar.c(dnjVar);
        if (this.mIsRefreshUserData) {
            setUserDataList(str2, eaqVar, str);
            return eaqVar;
        }
        eaqVar.e(0.0d);
        return eaqVar;
    }

    private void setUserData(String str, dnj dnjVar, eaq eaqVar, String str2) {
        String strB;
        if (ecj.d(str2, str)) {
            strB = ean.b(this.mDeviceId, String.valueOf(0));
        } else {
            strB = ean.b(this.mDeviceId, str2);
        }
        String strJ = ean.j(strB);
        eaqVar.c(dnjVar);
        if (!TextUtils.isEmpty(strJ) && !"0".equals(strJ)) {
            try {
                eaqVar.e(Double.parseDouble(strJ) / ((double) (dxm.ag(this.mProductId) ? 100 : 10)));
                this.mIsHasDeviceData = true;
                return;
            } catch (NumberFormatException e) {
                LogUtil.e(TAG, "setUserWeight error:" + e.getMessage());
                return;
            }
        }
        eaqVar.e(0.0d);
        LogUtil.e(TAG, "userWeight is Empty or 0:");
    }

    private void setUserDataList(String str, eaq eaqVar, String str2) {
        String strSubstring;
        if (this.mUserDataInfo == null) {
            LogUtil.j(TAG, "setUserDataList mUserDataInfo is null.");
            return;
        }
        if (this.mUserDataInfoList == null) {
            LogUtil.j(TAG, "setUserDataList mUserDataInfoList is null.");
            this.mUserDataInfoList = new ArrayList<>(10);
        }
        this.mUserDataInfoList.add(this.mUserDataInfo);
        for (int i = 0; i < this.mUserDataInfoList.size(); i++) {
            MiniUserDataInfo miniUserDataInfo = this.mUserDataInfoList.get(i);
            if (miniUserDataInfo == null) {
                LogUtil.j(TAG, "setUserDataList userDataInfo is null.");
            } else {
                String huid = miniUserDataInfo.getHuid();
                if (huid == null) {
                    LogUtil.j(TAG, "setUserDataList huid is null.");
                    return;
                }
                if (!"0".equals(huid) && !ecj.d(str2, str)) {
                    strSubstring = huid.substring(0, str2.length());
                    LogUtil.e(TAG, "getUserClearBean uid");
                } else {
                    strSubstring = "";
                }
                double weight = miniUserDataInfo.getWeight();
                if ((ecj.d(str2, str) && "0".equals(huid)) || str2.equals(strSubstring)) {
                    if (weight > 0.0d) {
                        this.mIsHasDeviceData = true;
                        eaqVar.e(weight);
                        return;
                    } else {
                        eaqVar.e(0.0d);
                        return;
                    }
                }
                LogUtil.j(TAG, "setUserDataList User not found next data");
            }
        }
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_wifi_scale_manager));
        this.mListView = (ListView) qsp.a(this.child, R.id.scale_manager_list_view);
        this.mUserInfoClearBtn = (HealthButton) qsp.a(this.child, R.id.id_btn_clear_user_info);
        this.mClearUserWeightDataTipMsg = (HealthTextView) qsp.a(this.child, R.id.tv_user_clear_must_online_tag);
        if (dxm.ai(this.mProductId)) {
            this.mClearUserWeightDataTipMsg.setVisibility(8);
        }
        this.mUserInfoClearBtn.setOnClickListener(this);
        this.mUserInfoClearBtn.setEnabled(false);
    }

    class ScaleManagerAdapter extends BaseAdapter {
        private final LayoutInflater mInflater;
        private List<eaq> mList = new ArrayList(16);

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        ScaleManagerAdapter(List<eaq> list) {
            this.mInflater = LayoutInflater.from(WiFiBodyFatScaleDataManagerFragment.this.mContext);
            setData(list);
        }

        private void setData(List<eaq> list) {
            this.mList.clear();
            this.mList.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<eaq> list = this.mList;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public eaq getItem(int i) {
            if (i < 0) {
                LogUtil.j(WiFiBodyFatScaleDataManagerFragment.TAG, "position is out of bounds one");
            }
            List<eaq> list = this.mList;
            if (list == null) {
                return null;
            }
            if (list.size() <= i) {
                LogUtil.j(WiFiBodyFatScaleDataManagerFragment.TAG, "position is out of bounds two");
                return null;
            }
            return this.mList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate;
            ViewHolder viewHolder;
            if (view == null) {
                viewHolder = new ViewHolder();
                viewInflate = this.mInflater.inflate(R.layout.item_wifi_scales_manager, (ViewGroup) null);
                viewHolder.userPhoto = (ImageView) qsp.a(viewInflate, R.id.item_scale_manager_user_photo);
                viewHolder.userName = (HealthTextView) qsp.a(viewInflate, R.id.item_scale_manager_title_text);
                viewHolder.userWeight = (HealthTextView) qsp.a(viewInflate, R.id.hw_scale_manage_user_weight);
                viewHolder.line = (HealthDivider) qsp.a(viewInflate, R.id.user_manager_line);
                viewInflate.setTag(viewHolder);
            } else if (view.getTag() instanceof ViewHolder) {
                viewHolder = (ViewHolder) view.getTag();
                viewInflate = view;
            } else {
                viewInflate = view;
                viewHolder = null;
            }
            if (viewHolder == null) {
                LogUtil.j(WiFiBodyFatScaleDataManagerFragment.TAG, "holder is null");
                return view;
            }
            List<eaq> list = this.mList;
            if (list == null || list.size() != i + 1) {
                viewHolder.line.setVisibility(0);
            } else {
                viewHolder.line.setVisibility(4);
            }
            eaq item = getItem(i);
            if (item == null) {
                LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "userBean is null");
                return null;
            }
            WiFiBodyFatScaleDataManagerFragment.setUserNameAndPhoto(WiFiBodyFatScaleDataManagerFragment.this.mContext, item.d(), viewHolder.userName, viewHolder.userPhoto);
            double dE = item.e();
            int iB = dyq.b(dE, WiFiBodyFatScaleDataManagerFragment.this.mProductId);
            LogUtil.d(WiFiBodyFatScaleDataManagerFragment.TAG, "userWeight=", Double.valueOf(dE), ", fractionDigit=", Integer.valueOf(iB));
            if (dE <= 0.0d || dE > WiFiBodyFatScaleDataManagerFragment.WEIGHT_VALUE_MAX) {
                viewHolder.userWeight.setText(WiFiBodyFatScaleDataManagerFragment.this.mainActivity.getResources().getString(R.string.IDS_device_wifi_no_record));
                return viewInflate;
            }
            viewHolder.userWeight.setText(dyc.b(dE, iB));
            return viewInflate;
        }

        class ViewHolder {
            private HealthDivider line;
            private HealthTextView userName;
            private ImageView userPhoto;
            private HealthTextView userWeight;

            ViewHolder() {
            }
        }
    }

    static class MyHandler extends StaticHandler<WiFiBodyFatScaleDataManagerFragment> {
        MyHandler(WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment) {
            super(wiFiBodyFatScaleDataManagerFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiBodyFatScaleDataManagerFragment wiFiBodyFatScaleDataManagerFragment, Message message) {
            if (wiFiBodyFatScaleDataManagerFragment != null) {
                if (wiFiBodyFatScaleDataManagerFragment.isDestroy()) {
                    LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler activity is exist");
                    return;
                }
                if (!wiFiBodyFatScaleDataManagerFragment.isAdded()) {
                    LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler mFragment is not add");
                    return;
                }
                if (message == null) {
                    LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler msg is null");
                    return;
                }
                LogUtil.a(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler what:", Integer.valueOf(message.what));
                if (message.what == 1) {
                    wiFiBodyFatScaleDataManagerFragment.initAdapter();
                    return;
                } else {
                    LogUtil.j(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler what is other");
                    return;
                }
            }
            LogUtil.e(WiFiBodyFatScaleDataManagerFragment.TAG, "MyHandler object is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j(TAG, "onClick view is null");
        } else if (view.getId() == R.id.id_btn_clear_user_info) {
            gotoClearUserFragment();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.a(this.mCallback, "device_user_success", "get_user_data_result");
        List<eaq> list = this.mUserList;
        if (list != null) {
            list.clear();
            this.mUserList = null;
        }
        ArrayList<MiniUserDataInfo> arrayList = this.mUserDataInfoList;
        if (arrayList != null) {
            arrayList.clear();
            this.mUserDataInfoList = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e(TAG, "DeviceMainActivity is null");
            return true;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        LogUtil.e(TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    public static void setUserNameAndPhoto(Context context, dnj dnjVar, HealthTextView healthTextView, ImageView imageView) {
        if (dnjVar == null) {
            LogUtil.e(TAG, "setUserNameAndPhoto user is null");
            return;
        }
        if (healthTextView == null || imageView == null) {
            LogUtil.e(TAG, "setUserNameAndPhoto userNameTv or userPhotoImg is null");
            return;
        }
        healthTextView.setText(dnjVar.h());
        imageView.setImageBitmap(null);
        imageView.setImageResource(0);
        Drawable drawableB = qlo.b(context.getResources(), new qlo.e(null, dnjVar.i(), true));
        if (dnjVar.m() == -1) {
            imageView.setImageDrawable(drawableB);
            return;
        }
        if (!TextUtils.isEmpty(dnjVar.b())) {
            setUserPhoto(dnjVar.b(), imageView, drawableB);
        } else if (dnjVar.k() == null) {
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageBitmap(qqf.a(dnjVar.k()));
        }
    }

    private static void setUserPhoto(String str, ImageView imageView, Drawable drawable) {
        if (imageView == null || drawable == null) {
            LogUtil.e(TAG, "setUserPhoto: userPhotoIv or defaultUserPhoto is null");
            return;
        }
        if (!"default".equals(str)) {
            Bitmap bitmapA = qqf.a(BaseApplication.getContext(), str);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    private void gotoClearUserFragment() {
        Context context = BaseApplication.getContext();
        if (!ecj.b(context)) {
            qpx.e(context, R.string.IDS_device_wifi_not_network);
            return;
        }
        LogUtil.a(TAG, "gotoClearUserFragment");
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", this.mDeviceId);
        bundle.putString("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        bundle.putParcelableArrayList("userData", this.mUserDataInfoList);
        WiFiUserClearFragment wiFiUserClearFragment = new WiFiUserClearFragment();
        wiFiUserClearFragment.setArguments(bundle);
        switchFragment(wiFiUserClearFragment);
    }
}
