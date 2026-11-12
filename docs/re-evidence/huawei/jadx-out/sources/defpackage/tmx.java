package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceApiImpl;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.WatchFaceDeviceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.InstalledWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeMyWatchHolder;
import com.huawei.watchface.WatchFaceApi;
import com.huawei.watchface.WatchFaceType;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class tmx extends WearHomeBaseCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f49366a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<Integer> f49367c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f49368b;
    private View h;
    private WearHomeMyWatchHolder g = null;
    private List<InstalledWatchFace> d = new ArrayList();
    private View.OnClickListener e = new View.OnClickListener() { // from class: tna
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f49378a.b(view);
        }
    };
    private View.OnClickListener i = new View.OnClickListener() { // from class: tmz
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f49376a.d(view);
        }
    };

    static {
        HashMap map = new HashMap();
        f49366a = map;
        map.put(94, 94);
        map.put(86, 95);
        map.put(87, 95);
        map.put(100, 95);
        map.put(102, 95);
        map.put(112, 95);
        map.put(Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON), 95);
        map.put(108, 60);
        map.put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), 60);
        map.put(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE), 95);
        map.put(115, 95);
        map.put(Integer.valueOf(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 95);
        f49367c = Collections.unmodifiableSet(new HashSet<Integer>() { // from class: tmx.5
            private static final long serialVersionUID = -4145748043555378968L;

            {
                add(Integer.valueOf(WatchFaceType.VIDEO.value()));
                add(Integer.valueOf(WatchFaceType.ALBUM.value()));
                add(Integer.valueOf(WatchFaceType.KALEIDOSCOPE.value()));
                add(Integer.valueOf(WatchFaceType.WEAR.value()));
                add(Integer.valueOf(WatchFaceType.STICKER.value()));
            }
        });
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("WearHomeMyWatchCard", "Enter mMyWatchClick Listener");
        if (this.mCurrentDeviceInfo != null && ((this.mCurrentDeviceInfo.getDeviceConnectState() == 2 || this.mCurrentDeviceInfo.getDeviceConnectState() == 1) && maq.b().c(this.mDeviceMac) == 6)) {
            LogUtil.a("WearHomeMyWatchCard", "Enter watchFaceClick Listener ，wear device is OTAing");
            h();
            return;
        }
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getDeviceConnectState() != 2) {
            if (!mig.d(lut.a().d(), this.mCurrentDeviceInfo)) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                LogUtil.j("WearHomeMyWatchCard", "mWatchFaceClick mCurrentDeviceInfo not DEVICE_CONNECTED and not isTop:");
                return;
            } else if (!mig.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "DEVMGR_WearHomeMyWatchCard"), this.mCurrentDeviceInfo)) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                LogUtil.j("WearHomeMyWatchCard", "mMyWatchClick mCurrentDeviceInfo not DEVICE_CONNECTED and not isTop:");
                return;
            }
        }
        j();
    }

    /* synthetic */ void d(View view) {
        if (this.mCurrentDeviceInfo != null && ((this.mCurrentDeviceInfo.getDeviceConnectState() == 2 || this.mCurrentDeviceInfo.getDeviceConnectState() == 1) && maq.b().c(this.mDeviceMac) == 6)) {
            LogUtil.a("WearHomeMyWatchCard", "Enter mMyWatchFacePositionClick Listener ，wear device is OTAing");
            h();
            return;
        }
        Integer num = (Integer) view.getTag();
        int iIntValue = num.intValue();
        LogUtil.a("WearHomeMyWatchCard", "position = ", num);
        if (this.d.size() <= iIntValue) {
            LogUtil.j("WearHomeMyWatchCard", "installedMyWatchFaceList size error.");
            return;
        }
        InstalledWatchFace installedWatchFace = this.d.get(iIntValue);
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getDeviceConnectState() != 2) {
            if (!mig.d(lut.a().d(), this.mCurrentDeviceInfo)) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                LogUtil.j("WearHomeMyWatchCard", "mWatchFacePositionClick mCurrentDeviceInfo not DEVICE_CONNECTED and not isTop:");
                return;
            } else if (installedWatchFace != null && f49367c.contains(Integer.valueOf(installedWatchFace.getWatchFaceType()))) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                LogUtil.j("WearHomeMyWatchCard", "mWatchFacePositionClick mCurrentDeviceInfo not DEVICE_CONNECTED and not support open diy watchface");
                return;
            } else if (!mig.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "DEVMGR_WearHomeMyWatchCard"), this.mCurrentDeviceInfo)) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                LogUtil.j("WearHomeMyWatchCard", "mWatchFacePositionClick mCurrentDeviceInfo not DEVICE_CONNECTED and not isTop:");
                return;
            }
        }
        e(installedWatchFace);
    }

    private void h() {
        if (this.f49368b == null) {
            LogUtil.j("WearHomeMyWatchCard", "showTipDialog mActivity is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f49368b).a(this.f49368b.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: tnb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeMyWatchCard", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private static void j() {
        LogUtil.a("WearHomeMyWatchCard", "openMyWatchFace");
        WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
        LogUtil.a("WearHomeMyWatchCard", "watchFaceApi = ", watchFaceApi);
        if (watchFaceApi == null) {
            return;
        }
        watchFaceApi.openMyWatchFace(new IBaseResponseCallback() { // from class: tnh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                tmx.e(i, obj);
            }
        });
    }

    static /* synthetic */ void e(int i, Object obj) {
        LogUtil.a("WearHomeMyWatchCard", "errorCode = ", Integer.valueOf(i), "objectData = ", obj);
        if (i == -2) {
            HandlerExecutor.c(new Runnable() { // from class: tnc
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                }
            });
        } else if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
            H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
            mgu.a("e1");
        }
    }

    private static void e(InstalledWatchFace installedWatchFace) {
        if (installedWatchFace == null) {
            LogUtil.j("WearHomeMyWatchCard", "installedWatchFace is null.");
            return;
        }
        String watchFaceId = installedWatchFace.getWatchFaceId();
        String watchFaceVersion = installedWatchFace.getWatchFaceVersion();
        String jumpUrl = installedWatchFace.getJumpUrl();
        if (jumpUrl == null) {
            LogUtil.a("WearHomeMyWatchCard", "openMyWatchDetailFace watchFaceId : ", watchFaceId, "watchFaceVersion : ", watchFaceVersion);
            WatchFaceApi watchFaceApi = (WatchFaceApi) Services.d("WatchFaceApiManager", WatchFaceApi.class);
            LogUtil.a("WearHomeMyWatchCard", "watchFaceApi = ", watchFaceApi);
            if (watchFaceApi == null) {
                return;
            }
            watchFaceApi.openWatchFaceDetail(watchFaceId, watchFaceVersion, new IBaseResponseCallback() { // from class: tnd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    tmx.d(i, obj);
                }
            });
            return;
        }
        WatchFaceManager.getInstance().startDeepLinkActivity(jumpUrl);
    }

    static /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("WearHomeMyWatchCard", "errorCode = ", Integer.valueOf(i), "objectData = ", obj);
        if (i == -2) {
            HandlerExecutor.c(new Runnable() { // from class: tne
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
                }
            });
        } else if (i == 0 && (obj instanceof H5ProLaunchOption.Builder)) {
            H5ProClient.startH5MiniProgram(WatchFaceApiImpl.getStartMyWatchFaceContext(), "com.huawei.health.h5.watchface", ((H5ProLaunchOption.Builder) obj).build());
            mgu.a("e4");
        }
    }

    public tmx(Activity activity) {
        LogUtil.a("WearHomeMyWatchCard", "new WearHomeMyWatchCard construct");
        this.f49368b = activity;
        this.mContext = activity;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.h = layoutInflater.inflate(R.layout.my_watch_layout, viewGroup, false);
        g();
        return this.g;
    }

    public View b(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.h = layoutInflater.inflate(R.layout.my_watch_layout, viewGroup, false);
        g();
        return this.h;
    }

    private void g() {
        WearHomeMyWatchHolder wearHomeMyWatchHolder = new WearHomeMyWatchHolder(this.h);
        this.g = wearHomeMyWatchHolder;
        wearHomeMyWatchHolder.a().setOnClickListener(qji.d(new View.OnClickListener() { // from class: tmy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        }, this.f49368b, true, ""));
        a();
    }

    /* synthetic */ void e(View view) {
        this.e.onClick(view);
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null || (deviceInfo instanceof CloudDeviceInfo)) {
            if (this.g == null) {
                LogUtil.j("WearHomeMyWatchCard", "updateDevice fail mWearHomeMyWatchHolder is null");
                return;
            }
            LogUtil.j("WearHomeMyWatchCard", "updateDevice fail deviceInfo is null");
            this.g.b().setVisibility(8);
            this.mDeviceMac = null;
            this.mCurrentDeviceInfo = null;
            this.mDeviceCapability = null;
            return;
        }
        if (!mig.d(this.mCurrentDeviceInfo, deviceInfo)) {
            LogUtil.a("WearHomeMyWatchCard", "new deviceInfo name:", deviceInfo.getDeviceName());
            WatchFaceDeviceService.getInstance().unregisterMyWatchFaceCardCallback();
            d(0);
        }
        this.mDeviceMac = deviceInfo.getDeviceIdentify();
        this.mCurrentDeviceInfo = deviceInfo;
        this.mDeviceCapability = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceMac);
        a();
    }

    private void d(int i) {
        for (int i2 = 0; i2 < 6; i2++) {
            RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this.h, BaseApplication.getContext().getResources().getIdentifier("rl_mywatch" + i2, "id", BaseApplication.getContext().getPackageName()));
            if (relativeLayout != null) {
                LogUtil.a("WearHomeMyWatchCard", "relativeLayout index:", Integer.valueOf(i2));
                if (qrs.af(this.mContext)) {
                    if (i2 >= i) {
                        relativeLayout.setVisibility(4);
                        relativeLayout.setClickable(false);
                        relativeLayout.setOnClickListener(null);
                    }
                } else if (i2 >= Math.min(3, i)) {
                    if (i2 < 3) {
                        relativeLayout.setVisibility(4);
                        relativeLayout.setClickable(false);
                        relativeLayout.setOnClickListener(null);
                    } else {
                        relativeLayout.setVisibility(8);
                    }
                }
            }
        }
        if (i == 0) {
            this.g.d().setVisibility(8);
        }
    }

    private void a() {
        WearHomeMyWatchHolder wearHomeMyWatchHolder;
        if (this.f49368b == null || (wearHomeMyWatchHolder = this.g) == null) {
            LogUtil.j("WearHomeMyWatchCard", "initView fail");
            return;
        }
        wearHomeMyWatchHolder.e().setText(this.mContext.getResources().getString(R.string.IDS_bloodpressure_all_data));
        this.g.c().setText(this.mContext.getResources().getString(R.string.IDS_my_watchface));
        this.g.c().setTypeface(Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, 700, false) : Typeface.create(Typeface.DEFAULT, 1));
        this.mDeviceCapability = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceMac);
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getPowerSaveModel() == 1 && tqp.e(this.mCurrentDeviceInfo.getProductType())) {
            LogUtil.j("WearHomeMyWatchCard", "getPowerSaveModel is power state");
            this.g.b().setVisibility(8);
            return;
        }
        this.mCurrentDeviceInfo = a(this.mDeviceMac);
        LogUtil.a("WearHomeMyWatchCard", "mCurrentDeviceInfo = ", this.mCurrentDeviceInfo);
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeMyWatchCard", "initView mCurrentDeviceInfo == null");
            return;
        }
        LogUtil.a("WearHomeMyWatchCard", "mCurrentDeviceInfo.getDeviceConnectState()", Integer.valueOf(this.mCurrentDeviceInfo.getDeviceConnectState()));
        if (!WatchFaceUtil.isSupportMyWatch(this.mCurrentDeviceInfo)) {
            this.g.b().setVisibility(8);
        } else if ((this.mCurrentDeviceInfo.getPowerSaveModel() != 1 || !tqp.e(this.mCurrentDeviceInfo.getProductType())) && f()) {
            i();
        } else {
            this.g.b().setVisibility(8);
        }
    }

    private DeviceInfo a(String str) {
        DeviceInfo deviceInfoB = lut.a().b(str);
        if (deviceInfoB instanceof CloudDeviceInfo) {
            return null;
        }
        return deviceInfoB;
    }

    private void i() {
        LogUtil.a("WearHomeMyWatchCard", "showMyWatchShow()");
        if (f()) {
            LogUtil.a("WearHomeMyWatchCard", "initGeneralList HwMyWatchFaceManager init");
            d();
            this.g.b().setVisibility(0);
            return;
        }
        this.g.b().setVisibility(8);
    }

    private void d() {
        LogUtil.a("WearHomeMyWatchCard", "getDeviceWatchFace()");
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeMyWatchCard", "mCurrentDeviceInfo is null.");
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", this.mDeviceMac);
        } catch (JSONException unused) {
            LogUtil.j("WearHomeMyWatchCard", "getDeviceWatchFace JSONException.");
        }
        ThreadPoolManager.c().a("WearHomeMyWatchCard", new Runnable() { // from class: tmx.1
            @Override // java.lang.Runnable
            public void run() {
                WatchFaceManager.getInstance().obtainDeviceWatchFace(jSONObject.toString(), true, new ResultCallback<List<InstalledWatchFace>>() { // from class: tmx.1.4
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<InstalledWatchFace> list) {
                        if (list == null || list.isEmpty()) {
                            LogUtil.a("WearHomeMyWatchCard", "obtainDeviceWatchFace data is empty.");
                            return;
                        }
                        LogUtil.a("WearHomeMyWatchCard", "data = ", Integer.valueOf(list.size()));
                        tmx.this.c((List<InstalledWatchFace>) tmx.this.b(list));
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.j("WearHomeMyWatchCard", "obtainDeviceWatchFace fail", ExceptionUtils.c(th));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<InstalledWatchFace> list) {
        DeviceInfo deviceInfo = this.mCurrentDeviceInfo;
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_WearHomeMyWatchCard", "setMyWatchView deviceInfo == null");
        } else {
            WatchFaceManager.getInstance().queryWatchFaceInfo(deviceInfo.getDeviceIdentify(), new AnonymousClass3(list));
        }
    }

    /* JADX INFO: renamed from: tmx$3, reason: invalid class name */
    class AnonymousClass3 implements ResponseCallback<WatchFaceParamsResult> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f49372c;

        AnonymousClass3(List list) {
            this.f49372c = list;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final WatchFaceParamsResult watchFaceParamsResult) {
            if (tmx.this.f49368b != null && i == 0 && watchFaceParamsResult != null) {
                Activity activity = tmx.this.f49368b;
                final List list = this.f49372c;
                activity.runOnUiThread(new Runnable() { // from class: tng
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(list, watchFaceParamsResult);
                    }
                });
                return;
            }
            LogUtil.j("WearHomeMyWatchCard", "setMyWatchView queryWatchFaceInfo status is: ", Integer.valueOf(i));
        }

        /* synthetic */ void c(List list, WatchFaceParamsResult watchFaceParamsResult) {
            tmx.this.e((List<InstalledWatchFace>) list, watchFaceParamsResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<InstalledWatchFace> list, WatchFaceParamsResult watchFaceParamsResult) {
        this.d = list;
        if (njy.e(list)) {
            LogUtil.a("WearHomeMyWatchCard", "setMyWatchView installedWatchFaceList is empty.");
            return;
        }
        this.g.b().setVisibility(0);
        this.g.d().setVisibility(0);
        int size = this.d.size();
        LogUtil.a("WearHomeMyWatchCard", "installedWatchFaceList = ", Integer.valueOf(size));
        d(size);
        for (int i = 0; i < size; i++) {
            e(i, list.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<InstalledWatchFace> b(List<InstalledWatchFace> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.a("WearHomeMyWatchCard", "data is empty.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InstalledWatchFace> it = list.iterator();
        while (it.hasNext()) {
            InstalledWatchFace next = it.next();
            if (TextUtils.isEmpty(next.getIconPicture())) {
                it.remove();
            } else if (f49367c.contains(Integer.valueOf(next.getWatchFaceType())) && !next.isCurrent()) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        list.addAll(arrayList);
        return list;
    }

    private void e(int i, InstalledWatchFace installedWatchFace) {
        LogUtil.a("WearHomeMyWatchCard", "updateMyWatchFaceItem installedWatchFace:", Integer.valueOf(installedWatchFace.getWatchFaceType()), Boolean.valueOf(installedWatchFace.isCurrent()));
        int i2 = qrs.af(this.mContext) ? 6 : 3;
        LogUtil.a("WearHomeMyWatchCard", "recommendCount : ", Integer.valueOf(i2));
        if (i >= i2) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.h.findViewById(BaseApplication.getContext().getResources().getIdentifier("rl_mywatch" + i, "id", BaseApplication.getContext().getPackageName()));
        if (relativeLayout == null) {
            LogUtil.j("WearHomeMyWatchCard", "updateWatchFaceItem relativeLayout == null.");
            return;
        }
        relativeLayout.setTag(Integer.valueOf(i));
        relativeLayout.setVisibility(0);
        relativeLayout.setClickable(true);
        relativeLayout.setOnClickListener(this.i);
        ImageView imageView = (ImageView) this.h.findViewById(BaseApplication.getContext().getResources().getIdentifier("im_mywatch" + i, "id", BaseApplication.getContext().getPackageName()));
        Object tag = imageView.getTag();
        Objects.isNull(tag);
        if (tag == null) {
            imageView.setLayoutParams(tqp.d(imageView.getLayoutParams(), 80, 80));
            imageView.setTag("tag_im_watchface" + i);
        }
        d(installedWatchFace.getIconPicture(), imageView, relativeLayout);
        HealthTextView healthTextView = (HealthTextView) this.h.findViewById(BaseApplication.getContext().getResources().getIdentifier("tv_mywatch" + i, "id", BaseApplication.getContext().getPackageName()));
        String watchFaceName = installedWatchFace.getWatchFaceName();
        LogUtil.a("WearHomeMyWatchCard", "update My Watch item title is:", watchFaceName);
        healthTextView.setText(watchFaceName);
    }

    private void d(final String str, final ImageView imageView, final RelativeLayout relativeLayout) {
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeMyWatchCard", "loadPicture failed for mCurrentDeviceInfo is null");
        } else {
            WatchFaceManager.getInstance().queryWatchFaceInfo(this.mCurrentDeviceInfo.getDeviceIdentify(), new ResponseCallback<WatchFaceParamsResult>() { // from class: tmx.4
                @Override // com.huawei.hwbasemgr.ResponseCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, final WatchFaceParamsResult watchFaceParamsResult) {
                    int i2;
                    if (i != 0 || watchFaceParamsResult == null) {
                        LogUtil.j("WearHomeMyWatchCard", "loadPicture status is: ", Integer.valueOf(i));
                        return;
                    }
                    final boolean z = watchFaceParamsResult.getScreenWidth() == watchFaceParamsResult.getScreenHeight();
                    if (z) {
                        i2 = R.mipmap.ic_watchface_default;
                    } else {
                        i2 = R.mipmap.pic_setup_band;
                    }
                    LogUtil.a("WearHomeMyWatchCard", "loadPicture mContext : ", tmx.this.mContext);
                    if (tmx.this.mContext == null || tmx.this.e()) {
                        return;
                    }
                    qqf.a(str, new RequestOptions().placeholder(i2), new CustomTarget<Drawable>() { // from class: tmx.4.5
                        @Override // com.bumptech.glide.request.target.Target
                        public void onLoadCleared(Drawable drawable) {
                        }

                        @Override // com.bumptech.glide.request.target.Target
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                            try {
                                tmx.this.e(imageView, drawable, relativeLayout, z, watchFaceParamsResult.getScreenWidth(), watchFaceParamsResult.getScreenHeight());
                            } catch (OutOfMemoryError unused) {
                                LogUtil.e("WearHomeMyWatchCard", "loadPicture() OutOfMemoryError");
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ImageView imageView, Drawable drawable, RelativeLayout relativeLayout, boolean z, int i, int i2) {
        Bitmap bitmapA;
        LogUtil.a("WearHomeMyWatchCard", "setImageToMyWatchFaceItem() imageView :", imageView);
        if (drawable == null || imageView == null) {
            LogUtil.j("WearHomeMyWatchCard", "setImageToMyWatchFaceItem(), drawable or imageView is null.");
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapA = ((BitmapDrawable) drawable).getBitmap();
            LogUtil.a("WearHomeMyWatchCard", "setImageToMyWatchFaceItem() drawable instanceof BitmapDrawable");
        } else {
            bitmapA = qqf.a(drawable);
            LogUtil.a("WearHomeMyWatchCard", "setImageToMyWatchFaceItem() else");
        }
        if (bitmapA == null) {
            LogUtil.j("WearHomeMyWatchCard", "setImageToMyWatchFaceItem, bitmap is null");
            return;
        }
        if (z) {
            LogUtil.a("WearHomeMyWatchCard", "setImageToMyWatchFaceItem(), set circle image.");
            int iMin = Math.min(bitmapA.getHeight(), bitmapA.getWidth());
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = qrs.d(this.mContext, 80.0f);
            layoutParams.height = qrs.d(this.mContext, 80.0f);
            imageView.setLayoutParams(layoutParams);
            imageView.setAdjustViewBounds(true);
            imageView.setImageBitmap(qqf.e(bitmapA, iMin / 2));
            LogUtil.a("WearHomeMyWatchCard", "bitmap.", bitmapA);
        } else {
            b(imageView, bitmapA, i, i2);
        }
        relativeLayout.setVisibility(0);
    }

    public void e(DeviceInfo deviceInfo) {
        WearHomeMyWatchHolder wearHomeMyWatchHolder;
        List<InstalledWatchFace> list;
        if (!WatchFaceUtil.isSupportMyWatch(deviceInfo) || (wearHomeMyWatchHolder = this.g) == null || wearHomeMyWatchHolder.d() == null || this.g.d().getVisibility() != 0 || (list = this.d) == null) {
            return;
        }
        c(list);
    }

    private void b(ImageView imageView, Bitmap bitmap, int i, int i2) {
        Integer numValueOf;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 1, 0, bitmap.getWidth() - 2, bitmap.getHeight());
        if (bitmapCreateBitmap.getWidth() > i || bitmapCreateBitmap.getHeight() > i2) {
            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i2, true);
        }
        float fD = qrs.d(this.mContext, 64.0f) / bitmapCreateBitmap.getWidth();
        LogUtil.a("WearHomeMyWatchCard", "scaleWidth is,", Float.valueOf(fD));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = qrs.d(this.mContext, 64.0f);
        float f = i;
        layoutParams.height = (int) (qrs.d(this.mContext, 64.0f) * ((i2 * 1.0f) / f));
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        LogUtil.a("WearHomeMyWatchCard", "setNoCircleMyWatchFace(), set image.");
        Bitmap bitmapD = qqf.d(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), qrs.d(this.mContext, 8.0f / fD));
        LogUtil.a("WearHomeMyWatchCard", "mCurrentDeviceInfo = ", this.mCurrentDeviceInfo);
        if (this.mCurrentDeviceInfo != null && (numValueOf = f49366a.get(Integer.valueOf(this.mCurrentDeviceInfo.getProductType()))) != null) {
            if ((this.mCurrentDeviceInfo.getProductType() == 108 || this.mCurrentDeviceInfo.getProductType() == 109) && bitmapCreateBitmap.getWidth() < i) {
                numValueOf = Integer.valueOf((int) ((bitmapCreateBitmap.getWidth() * 60.0f) / f));
            }
            bitmapD = qqf.d(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), numValueOf.intValue());
        }
        LogUtil.a("WearHomeMyWatchCard", "roundBitmap == ", bitmapD);
        LogUtil.a("WearHomeMyWatchCard", "imageView == ", imageView);
        if (bitmapD != null) {
            imageView.setImageBitmap(bitmapD);
        } else {
            LogUtil.j("WearHomeMyWatchCard", "setNoCircleMyWatchFace, roundBitmap is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Activity activity = this.f49368b;
        if (activity != null && !activity.isFinishing() && !this.f49368b.isDestroyed()) {
            return false;
        }
        LogUtil.a("WearHomeMyWatchCard", "mActivity is destroyed");
        return true;
    }

    private boolean f() {
        if (this.mDeviceCapability == null || !this.mDeviceCapability.isSupportWatchFace()) {
            return this.mCurrentDeviceInfo != null && tqp.e(this.mCurrentDeviceInfo.getProductType(), this.mDeviceMac);
        }
        return true;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        a();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        a();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        WatchFaceDeviceService.getInstance().unregisterMyWatchFaceCardCallback();
    }
}
