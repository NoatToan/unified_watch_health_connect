package com.huami.watch.companion.ui.activity;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bumptech.glide.signature.ObjectKey;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.AppManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.findphone.SettingsTransporterModules;
import com.huami.watch.companion.ui.bean.AppInfo;
import com.huami.watch.companion.watchface.WatchFace;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.companion.watchface.WatchFaceModule;
import com.huami.watch.companion.watchface.XiHuWatchFaceManagerActivity;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.watchface.manager.WatchFaceCloudManager;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.companion.watchface.utils.WatchFaceUtils;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.imageload.GlideApp;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class XiHuDeviceStatusActivity extends BaseDeviceStatusActivity implements View.OnClickListener {
    private static final String o = "XiHuDeviceStatusActivity";
    private static final int p = 2;
    private static final int q = 0;
    private static final int r = 1;
    private TextView f;
    private View g;
    private View h;
    private TextView i;
    private ImageView j;
    private DialogFragment k;
    private int l;
    private Transporter m;
    public Transporter.ChannelListener mDataChannelListener = new a();
    private Transporter n;

    public class a implements Transporter.ChannelListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (z) {
                XiHuDeviceStatusActivity.this.m.send(SettingsTransporterModules.ACTION_PACKAGE_QUERY_ALL);
                XiHuDeviceStatusActivity.this.n.send(WatchFaceModule.ACTION_QUERY_CURRENT_WATCHFACE);
            }
        }
    }

    public class b implements Comparator<AppInfo> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppInfo appInfo, AppInfo appInfo2) {
            return appInfo2.getStatus() - appInfo.getStatus();
        }
    }

    private void loadData() {
        this.f.setText(getString(R.string.xihu_load_app_data));
        this.h.setVisibility(0);
        this.g.setVisibility(0);
        this.f.setVisibility(0);
        this.m.send(SettingsTransporterModules.ACTION_PACKAGE_QUERY_ALL);
        this.n.send(WatchFaceModule.ACTION_QUERY_CURRENT_WATCHFACE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(int i, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(WatchFaceApi.getWatchFaceList(this, i + "", true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(WatchFaceCloud watchFaceCloud, WatchFaceCloudResult watchFaceCloudResult) throws Exception {
        if (watchFaceCloudResult.isSuccessful()) {
            List list = (List) watchFaceCloudResult.getData();
            if (list.size() > 0) {
                x0(watchFaceCloud, (WatchFaceCloud) list.get(0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(AppInfo appInfo, DialogInterface dialogInterface, int i) {
        if (this.isConnect) {
            z0(1, appInfo);
        } else {
            Toast.makeText(this, R.string.xihu_install_app_failed, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(AppInfo appInfo, DialogInterface dialogInterface, int i) {
        if (this.isConnect) {
            z0(0, appInfo);
        } else {
            Toast.makeText(this, R.string.xihu_delete_app_failed, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        this.f.setVisibility(8);
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(AppInfo appInfo, int i, String str) {
        dismissLoadDialog();
        appInfo.setStatus(i);
        Toast.makeText(this, str, 0).show();
        Collections.sort(this.mAppList, new b());
        updateEditStatus(false);
    }

    private void w0() {
        final int localSelectWatchFaceId = WatchFaceHelper.getLocalSelectWatchFaceId(this.mDevice.getCpuId());
        final WatchFaceCloud watchFace = WatchFaceCloudManager.getManager().getWatchFace(localSelectWatchFaceId);
        Rx.io(new ObservableOnSubscribe() { // from class: lx8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.q0(localSelectWatchFaceId, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: mx8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.r0(watchFace, (WatchFaceCloudResult) obj);
            }
        });
    }

    private void x0(WatchFaceCloud watchFaceCloud, WatchFaceCloud watchFaceCloud2) {
        if (watchFaceCloud2 == null) {
            return;
        }
        if (watchFaceCloud == null || TextUtils.isEmpty(watchFaceCloud.getImage()) || !new File(watchFaceCloud.getImage()).exists()) {
            y0(watchFaceCloud2.getImage(), this.mWatchFaceView);
        } else {
            y0(watchFaceCloud.getImage(), this.mWatchFaceView);
        }
        WatchFaceCloud.WatchMeta metas = watchFaceCloud2.getMetas();
        if (metas == null || metas.getTransparent_background() == null) {
            return;
        }
        this.j.setVisibility(0);
        y0(metas.getTransparent_background(), this.j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private void y0(String str, ImageView imageView) {
        GlideApp.with((FragmentActivity) this).load(str).signature(new ObjectKey(str)).skipMemoryCache(false).optionalCircleCrop().into(imageView);
    }

    private void z0(int i, final AppInfo appInfo) {
        String string;
        final String string2;
        String str;
        final int i2 = 1;
        if (i == 1) {
            string = getString(R.string.xihu_install_app_loading);
            string2 = getString(R.string.xihu_install_app_success);
            str = SettingsTransporterModules.ACTION_PACKAGE_ADD;
        } else {
            string = getString(R.string.xihu_delete_app_loading);
            string2 = getString(R.string.xihu_delete_app_success);
            str = SettingsTransporterModules.ACTION_PACKAGE_REMOVED;
            i2 = 0;
        }
        showLoadDialog(string);
        try {
            DataBundle dataBundle = new DataBundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("pkgname", appInfo.getPkgname());
            jSONArray.put(jSONObject);
            Log.d(o, "SendDataAndRefresh：" + jSONArray.toString(), new Object[0]);
            dataBundle.putString("data", jSONArray.toString());
            this.m.send(str, dataBundle);
            Rx.delayMainThread(new Runnable() { // from class: px8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.v0(appInfo, i2, string2);
                }
            }, 3000L, TimeUnit.MILLISECONDS);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e(o, "SendDataAndRefresh:json异常" + e.getMessage(), new Object[0]);
        }
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void O(TransportDataItem transportDataItem) {
        String action = transportDataItem.getAction();
        String string = transportDataItem.getData().getString("data");
        if (!SettingsTransporterModules.ACTION_PACKAGE_QUERY_RESPONSE.equals(action)) {
            if (WatchFaceModule.ACTION_REPORT_CURRENT_WATCHFACE.equals(action)) {
                ImageView imageView = this.j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                Log.d(o, "report_current_watch_face : onReceiveData : " + string, new Object[0]);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("pkgNmae");
                    String strOptString2 = jSONObject.optString("srvName");
                    String strOptString3 = jSONObject.optString("dialName");
                    this.l = jSONObject.optInt("type");
                    WatchFaceHelper.saveSelectWatchFace(this.mDevice.getCpuId(), jSONObject.optInt("cloudId"));
                    int iOptInt = jSONObject.optInt("system");
                    WatchFace watchFace = new WatchFace(strOptString, strOptString2, strOptString3);
                    watchFace.setWatchFaceType(iOptInt);
                    watchFace.setDeviceId(this.mDevice.getCpuId());
                    WatchFaceManager manager = WatchFaceManager.getManager();
                    manager.add(watchFace);
                    manager.setSelectedWatchFace(this, strOptString, strOptString2, this.mDevice.getCpuId());
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e(o, "report_current_watch_face: error: " + e, new Object[0]);
                    return;
                }
            }
            return;
        }
        Log.d(o, "QueryAll : onReceiveData : " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            Rx.mainThread(new Runnable() { // from class: nx8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.showEmptyView();
                }
            });
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() <= 0) {
                Rx.mainThread(new Runnable() { // from class: nx8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.showEmptyView();
                    }
                });
                return;
            }
            this.mAppList.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                AppInfo appInfo = this.mAppMap.get(jSONObject2.optString("pkgname"));
                if (appInfo != null) {
                    appInfo.setTitle(jSONObject2.optString("title"));
                    appInfo.setCore(jSONObject2.optInt("core"));
                    appInfo.setStatus(jSONObject2.optInt("status"));
                    if (1 == appInfo.getType() || appInfo.getCore() == 0) {
                        this.mAppList.add(appInfo);
                    }
                }
            }
            Collections.sort(this.mAppList, new b());
            Rx.mainThread(new Runnable() { // from class: ox8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.u0();
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
            Log.e(o, "OnReceiveData:josn解析失败" + e2.getMessage(), new Object[0]);
        }
    }

    public void dismissLoadDialog() {
        DialogFragment dialogFragment = this.k;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    public void findMyWatch(View view) {
        if (this.isConnect) {
            toFindWatch();
        }
    }

    public void onClickEdit(View view) {
        updateEditStatus(!this.mAdapter.isEdit());
    }

    public void onClickFileManager(View view) {
        toFileManager();
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void onConnected(String str) {
        super.onConnected(str);
        loadData();
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Transporter transporter = this.m;
        if (transporter != null) {
            transporter.removeChannelListener(this.mDataChannelListener);
            this.m.removeDataListener(this.mDataListener);
        }
        Transporter transporter2 = this.n;
        if (transporter2 != null) {
            transporter2.removeChannelListener(this.mDataChannelListener);
            this.n.removeDataListener(this.mDataListener);
        }
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void onDisconnected(String str) {
        super.onDisconnected(str);
        this.mAppList.clear();
        this.mAdapter.notifyDataSetChanged();
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity, com.huami.watch.companion.ui.adapter.AppSettingAdapter.OnItemClickListener
    public void onItemClick(int i, final AppInfo appInfo) {
        if (appInfo.getStatus() == 0) {
            AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.xihu_install_app_dialog_message)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: kx8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.s0(appInfo, dialogInterface, i2);
                }
            }).show(getFragmentManager(), "install");
            return;
        }
        if (!this.mAdapter.isEdit()) {
            super.onItemClick(i, appInfo);
        } else if (1 == appInfo.getCore()) {
            Toast.makeText(this, R.string.xihu_setting_app_core_message, 0).show();
        } else {
            onItemDelete(i, appInfo);
        }
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity, com.huami.watch.companion.ui.adapter.AppSettingAdapter.OnItemClickListener
    public void onItemDelete(int i, final AppInfo appInfo) {
        super.onItemDelete(i, appInfo);
        AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.xihu_delete_app_dialog_message)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: jx8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.t0(appInfo, dialogInterface, i2);
            }
        }).show(getFragmentManager(), "delete");
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.mAdapter.isEdit()) {
            updateEditStatus(false);
        }
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void onWatchFaceArrived(WatchFaceArrivingEvent watchFaceArrivingEvent) {
        Transporter transporter;
        super.onWatchFaceArrived(watchFaceArrivingEvent);
        if (!"setCurrentWatchFace".equals(watchFaceArrivingEvent.getCmd()) || (transporter = this.n) == null) {
            return;
        }
        transporter.send(WatchFaceModule.ACTION_QUERY_CURRENT_WATCHFACE);
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void setNotFindCloudWatchFaceImage() {
        if (this.l == 2) {
            w0();
            return;
        }
        WatchFace selectedWatchFace = WatchFaceManager.getManager().getSelectedWatchFace(this, true, this.mDevice.getCpuId());
        this.mWatchFaceView.setImageResource(WatchFaceUtils.getWatchFaceBg(new WatchFaceBean(selectedWatchFace.packageName, selectedWatchFace.serviceName)));
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void setWatchFacePreviewImage(boolean z) {
        if (z) {
            setDefaultWatchFaceImage();
        } else {
            getWatchFaceImage();
        }
    }

    public void showEmptyView() {
        this.f.setVisibility(0);
        int i = R.string.xihu_app_data_empty;
        Toast.makeText(this, i, 0).show();
        this.f.setText(i);
    }

    public void showLoadDialog(String str) {
        DialogFragment dialogFragment = this.k;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
            this.k = null;
        }
        this.k = LoadingDialog.setMessage(str).setCancelable(false).show(getFragmentManager(), PointCategory.LOAD);
    }

    public void toWatchFaceManager(View view) {
        startActivity(new Intent(this, (Class<?>) XiHuWatchFaceManagerActivity.class));
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void u() {
        this.i = (TextView) findViewById(R.id.tv_edit);
        this.f = (TextView) findViewById(R.id.tv_load);
        this.g = findViewById(R.id.layout_recycle);
        this.h = findViewById(R.id.layout_widget_setting);
        this.j = (ImageView) findViewById(R.id.watch_face_transparent);
        findViewById(R.id.find_watch).setVisibility(DeviceUtil.isSupportFindWatch(this.mDevice) ? 0 : 8);
    }

    public void updateEditStatus(boolean z) {
        this.mAdapter.setEdit(z);
        this.i.setText(this.mAdapter.isEdit() ? R.string.done : R.string.edit);
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public int w() {
        return R.layout.activity_device_status_xihu;
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void z() {
        this.mAppMap = AppManager.getAllAppList(this);
        if (!DeviceUtil.isSupportSettingHealth(this.mDevice)) {
            this.mAppMap.remove(AppManager.HEALTH_PACKAGE_NEW);
        }
        this.mWidgetSetting.setTitleText(getString(R.string.widget_only_title));
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        updateEditStatus(false);
        Transporter transporter = Transporter.get(getApplicationContext(), SettingsTransporterModules.MODULE_WATCH_SETTINGS);
        this.m = transporter;
        transporter.addChannelListener(this.mDataChannelListener);
        this.m.addDataListener(this.mDataListener);
        Transporter transporter2 = Transporter.get(getApplicationContext(), "com.huami.watchface");
        this.n = transporter2;
        transporter2.addChannelListener(this.mDataChannelListener);
        this.n.addDataListener(this.mDataListener);
    }
}
