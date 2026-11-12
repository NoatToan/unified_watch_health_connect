package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.adapter.WatchSkinSectionMultiAdapter;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.ReLoadEvent;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import com.xiaomi.hm.health.device.watchskinstore.ui.SkinManagerFragment;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class SkinManagerFragment extends BaseWatchSkinFragment {
    public static final String TAG = "SkinManagerFragment";
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    private final Lazy<DeviceManagerApi> d = KoinJavaComponent.inject(DeviceManagerApi.class);
    private AppCompatImageView e;
    private AppCompatTextView f;
    private AppCompatTextView g;

    public class a extends Subscriber<WatchResult<List<WatchSkinBean>>> {
        public final /* synthetic */ boolean f;

        public a(boolean z) {
            this.f = z;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(WatchResult<List<WatchSkinBean>> watchResult) {
            SkinManagerFragment.this.hideLoadingDialog();
            HMLog.d(SkinManagerFragment.TAG, "loadData:" + watchResult, new Object[0]);
            if (watchResult.isSuccessful()) {
                SkinManagerFragment.this.setData(this.f, watchResult.isMoreEnd(), watchResult.getData());
            } else {
                SkinManagerFragment.this.setErrorView(this.f);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            SkinManagerFragment.this.hideLoadingDialog();
            SkinManagerFragment.this.setErrorView(this.f);
            th.printStackTrace();
            HMLog.e(SkinManagerFragment.TAG, "loadData:onError!!!" + th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WatchResult A(ArrayList arrayList) {
        WatchResult watchResult = new WatchResult();
        boolean zIsSuccessful = false;
        if (arrayList == null || arrayList.size() == 0) {
            watchResult.setSuccessful(false);
            return watchResult;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WatchResult watchResult2 = (WatchResult) it2.next();
            zIsSuccessful |= watchResult2.isSuccessful();
            List list = (List) watchResult2.getData();
            if (list != null && list.size() != 0) {
                arrayList2.addAll(list);
            }
        }
        watchResult.setSuccessful(zIsSuccessful);
        watchResult.setData(arrayList2);
        return watchResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(boolean z) {
        if (z) {
            showLoadingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        p();
    }

    private void D() {
        E(0);
    }

    private void E(int i2) {
        this.g.setClickable(false);
        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (i2 == 1) {
            this.g.setText(R.string.device_connecting);
            return;
        }
        if (i2 == 2) {
            this.g.setText(R.string.device_tip_ble_not_open);
            showOpenBLE();
        } else if (i2 == 3) {
            this.g.setText(R.string.connect_failed);
            showOpenBLE();
        } else if (i2 != 4) {
            G();
        } else {
            this.g.setText(this.mDeviceSource.getType() == HMDeviceType.MILI ? R.string.miband_disconnected : R.string.watch_disconnected);
        }
    }

    private void F(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.d(TAG, "syncDataEvent:" + hMDeviceSyncDataEvent, new Object[0]);
        if (hMDeviceSyncDataEvent.isStart() || hMDeviceSyncDataEvent.isProgress()) {
            HMLog.d(TAG, "正在同步数据中...", new Object[0]);
            return;
        }
        boolean result = hMDeviceSyncDataEvent.getResult();
        StringBuilder sb = new StringBuilder();
        sb.append("同步数据结束...");
        sb.append(result ? "成功" : "失败");
        HMLog.d(TAG, sb.toString(), new Object[0]);
    }

    private void G() {
        HMBaseDevice device;
        BatteryInfo batteryInfo;
        if (this.mDeviceSource == null || (device = this.d.getValue().getDevice(this.mDeviceSource.getType())) == null || !device.isConnected() || (batteryInfo = device.getBatteryInfo()) == null) {
            return;
        }
        if (batteryInfo.isCharging()) {
            this.g.setText(R.string.mili_setting_charging);
        } else {
            this.g.setText(batteryInfo.getLevel() == -1 ? "" : getString(R.string.battery_level, String.valueOf(batteryInfo.getLevel())));
        }
    }

    public static SkinManagerFragment newInstance(HMDeviceSource hMDeviceSource) {
        return newInstance(hMDeviceSource, null);
    }

    private boolean p() {
        if (!this.d.getValue().isBluetoothSupportAndDisable()) {
            return true;
        }
        getActivity().startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        return false;
    }

    private View q() {
        return getLayoutInflater().inflate(R.layout.watch_skin_manager_footer, (ViewGroup) this.mRecyclerView.getParent(), false);
    }

    private void r() {
        this.mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: wv6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                this.a.w(baseQuickAdapter, view, i2);
            }
        });
        this.mAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: vv6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                this.a.x(baseQuickAdapter, view, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult s() throws Exception {
        return WatchSkinApi.loadCollectWatchSkin(String.valueOf(this.mDeviceSource.getValue()), this.mPage, 3);
    }

    private void showOpenBLE() {
        this.g.setClickable(true);
        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(this.mContext, R.drawable.default_end_arrow), (Drawable) null);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: tv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult t(WatchResult watchResult) {
        WatchResult watchResult2 = new WatchResult();
        WatchSkinPage watchSkinPage = (WatchSkinPage) watchResult.getData();
        if (watchResult.isSuccessful() && watchSkinPage != null) {
            List<WatchSkinBean> data = watchSkinPage.getData();
            if (data == null) {
                data = new ArrayList<>();
            }
            boolean z = data.size() == 0;
            if (z) {
                WatchSkinBean watchSkinBean = new WatchSkinBean(3);
                watchSkinBean.setName(this.mContext.getString(R.string.watch_skin_collect_empty));
                data.add(watchSkinBean);
            }
            WatchSkinBean watchSkinBean2 = new WatchSkinBean(true, this.mContext.getString(R.string.watch_skin_collect), !z);
            watchSkinBean2.setId(-1);
            data.add(0, watchSkinBean2);
            watchResult2.setData(data);
        }
        watchResult2.setSuccessful(watchResult.isSuccessful());
        watchResult2.setMError(watchResult.getMError());
        HMLog.d(TAG, "collectObservable:" + watchResult2, new Object[0]);
        return watchResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult u() throws Exception {
        return WatchSkinHelper.loadAllLocalWatchSkin(this.mContext, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WatchResult v(WatchResult watchResult) {
        List arrayList = (List) watchResult.getData();
        if (watchResult.isSuccessful()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            boolean z = arrayList.size() == 0;
            if (z) {
                WatchSkinBean watchSkinBean = new WatchSkinBean(3);
                watchSkinBean.setName(this.mContext.getString(R.string.watch_skin_local_empty));
                arrayList.add(watchSkinBean);
            }
            WatchSkinBean watchSkinBean2 = new WatchSkinBean(true, this.mContext.getString(R.string.watch_skin_local_record), !z);
            watchSkinBean2.setId(-2);
            arrayList.add(0, watchSkinBean2);
        }
        HMLog.d(TAG, "downloadObservable:" + watchResult, new Object[0]);
        return watchResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        Object item = baseQuickAdapter.getItem(i2);
        if (item instanceof WatchSkinBean) {
            WatchSkinBean watchSkinBean = (WatchSkinBean) item;
            StringBuilder sb = new StringBuilder();
            sb.append("setOnItemClickListener: ");
            sb.append(view.getId() == R.id.skin_tv_head_more ? "是更多" : "不是更多");
            HMLog.d(TAG, sb.toString(), new Object[0]);
            if (watchSkinBean.getIsHeader() || watchSkinBean.getItemType() == 3) {
                return;
            }
            boolean isLocal = watchSkinBean.getIsLocal();
            WatchSkinDetailActivity.launchDetailActivity((Activity) this.mContext, this.mDeviceSource, isLocal ? watchSkinBean.getDownloadUrl() : String.valueOf(watchSkinBean.getId()), watchSkinBean.getName(), isLocal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        if (view.getId() != R.id.skin_tv_head_more) {
            return;
        }
        Object item = baseQuickAdapter.getItem(i2);
        if (item instanceof WatchSkinBean) {
            WatchSkinBean watchSkinBean = (WatchSkinBean) item;
            if (watchSkinBean.getIsHeader()) {
                WatchSkinListActivity.launchListActivity((Activity) this.mContext, this.mDeviceSource, watchSkinBean.getId(), watchSkinBean.getHeader());
                HashMap map = new HashMap();
                map.put("Type", watchSkinBean.getHeader());
                WatchSkinHelper.analyticCount("WF_More_Click", this.mDeviceSource.getValue(), map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ArrayList y() {
        return new ArrayList();
    }

    public Observable<WatchResult<List<WatchSkinBean>>> collectObservable() {
        return Observable.fromCallable(new Callable() { // from class: yv6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s();
            }
        }).map(new Func1() { // from class: dw6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.t((WatchResult) obj);
            }
        }).subscribeOn(Schedulers.io());
    }

    public void connectEvent(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        HMLog.d(TAG, "HMDeviceConnectionEvent :" + hMDeviceConnectionEvent, new Object[0]);
        if (hMDeviceConnectionEvent.isConnected()) {
            D();
        } else if (this.d.getValue().isBluetoothEnable()) {
            E(hMDeviceConnectionEvent.isConnectingTimeout() ? 3 : 1);
        } else {
            E(2);
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public int createLayout() {
        return R.layout.fragment_skin_store;
    }

    public Observable<WatchResult<List<WatchSkinBean>>> downloadObservable() {
        return Observable.fromCallable(new Callable() { // from class: xv6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.u();
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: cw6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.v((WatchResult) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void initData() {
        loadData(true);
    }

    public View initHeaderView() {
        View viewInflate = getLayoutInflater().inflate(R.layout.watch_skin_connect_header, (ViewGroup) this.mRecyclerView.getParent(), false);
        this.e = (AppCompatImageView) viewInflate.findViewById(R.id.iv_device_icon);
        this.f = (AppCompatTextView) viewInflate.findViewById(R.id.tv_device_name);
        this.g = (AppCompatTextView) viewInflate.findViewById(R.id.tv_device_status);
        if (HMDeviceType.WATCH.equals(this.mDeviceSource.getType())) {
            this.e.setBackgroundResource(R.drawable.icon_everset_skin_header);
        } else {
            this.e.setBackgroundResource(R.drawable.icon_cinco_watch_skin_header);
        }
        this.f.setText(ConfigHelperKt.getDeviceShortDesc(this.mContext, this.mDeviceSource));
        return viewInflate;
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void initRecycleView() {
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
        WatchSkinSectionMultiAdapter watchSkinSectionMultiAdapter = new WatchSkinSectionMultiAdapter(this.mContext, R.layout.watch_skin_grid_header, R.layout.watch_skin_grid_item, null);
        this.mAdapter = watchSkinSectionMultiAdapter;
        watchSkinSectionMultiAdapter.addHeaderView(initHeaderView());
        this.mAdapter.addFooterView(q());
        this.mRecyclerView.setAdapter(this.mAdapter);
        r();
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void initView(View view) {
        super.initView(view);
        if (!this.d.getValue().isBluetoothEnable()) {
            E(2);
            return;
        }
        if (this.d.getValue().isConnected(this.mDeviceSource.getType())) {
            E(0);
        } else {
            E(4);
        }
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment
    public void loadData(final boolean z) {
        if (z) {
            this.mPage = 1;
        } else {
            this.mPage++;
        }
        downloadObservable().concatWith(collectObservable()).observeOn(Schedulers.io()).collect(new Func0() { // from class: bw6
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                return SkinManagerFragment.y();
            }
        }, new Action2() { // from class: aw6
            @Override // rx.functions.Action2
            public final void call(Object obj, Object obj2) {
                ((ArrayList) obj).add((WatchResult) obj2);
            }
        }).map(new Func1() { // from class: uv6
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return SkinManagerFragment.A((ArrayList) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: zv6
            @Override // rx.functions.Action0
            public final void call() {
                this.a.B(z);
            }
        }).subscribe((Subscriber) new a(z));
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WatchSkinHelper.analyticCount("WF_Manage_ViewNum", this.mDeviceSource.getValue());
    }

    @Override // com.xiaomi.hm.health.device.watchskinstore.ui.BaseWatchSkinFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(ReLoadEvent reLoadEvent) {
        loadData(reLoadEvent.isRefresh());
    }

    public static SkinManagerFragment newInstance(HMDeviceSource hMDeviceSource, String str) {
        SkinManagerFragment skinManagerFragment = new SkinManagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(BaseWatchSkinFragment.ARG_PARAM1, hMDeviceSource);
        bundle.putString(BaseWatchSkinFragment.ARG_PARAM2, str);
        skinManagerFragment.setArguments(bundle);
        return skinManagerFragment;
    }

    public void onEventMainThread(HMDeviceEvent hMDeviceEvent) {
        if (this.mDeviceSource == null || hMDeviceEvent.getDeviceType() != this.mDeviceSource.getType()) {
            HMLog.d(TAG, "event is not current device" + hMDeviceEvent, new Object[0]);
            return;
        }
        if (!(hMDeviceEvent instanceof HMDeviceFwUpgradeEvent)) {
            if (hMDeviceEvent instanceof HMDeviceConnectionEvent) {
                connectEvent((HMDeviceConnectionEvent) hMDeviceEvent);
                return;
            } else if (hMDeviceEvent instanceof HMDeviceSyncDataEvent) {
                F((HMDeviceSyncDataEvent) hMDeviceEvent);
                return;
            } else {
                if (hMDeviceEvent instanceof HMDeviceBatteryEvent) {
                    G();
                    return;
                }
                return;
            }
        }
        HMLog.d(TAG, "HMDeviceFwUpgradeEvent:" + hMDeviceEvent, new Object[0]);
        HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent = (HMDeviceFwUpgradeEvent) hMDeviceEvent;
        if (hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) {
            if (hMDeviceFwUpgradeEvent.isStart() || hMDeviceFwUpgradeEvent.isProgress()) {
                HMLog.d(TAG, "agps升级中...", new Object[0]);
                return;
            }
            boolean result = hMDeviceFwUpgradeEvent.getResult();
            StringBuilder sb = new StringBuilder();
            sb.append("agps升级结束...");
            sb.append(result ? "成功" : "失败");
            HMLog.d(TAG, sb.toString(), new Object[0]);
        }
    }

    public void onEventMainThread(EventBluetooth eventBluetooth) {
        HMLog.d(TAG, "EventBluetooth :" + eventBluetooth, new Object[0]);
        if (eventBluetooth.isOn) {
            return;
        }
        E(2);
    }
}
