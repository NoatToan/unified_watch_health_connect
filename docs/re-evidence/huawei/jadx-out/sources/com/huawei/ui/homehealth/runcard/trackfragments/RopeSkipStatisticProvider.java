package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.RopeBackgroundTemplate;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider;
import com.huawei.ui.homehealth.runcard.utils.SportMusicUtils;
import defpackage.buh;
import defpackage.dex;
import defpackage.dmg;
import defpackage.drw;
import defpackage.dsy;
import defpackage.elh;
import defpackage.elo;
import defpackage.emh;
import defpackage.etj;
import defpackage.etn;
import defpackage.ify;
import defpackage.iov;
import defpackage.ive;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pqj;
import defpackage.pqq;
import defpackage.qre;
import defpackage.qrs;
import defpackage.roq;
import defpackage.tfi;
import defpackage.wkb;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class RopeSkipStatisticProvider extends BaseKnitDataProvider<HiHealthData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25880c;
    private boolean i;
    private HashMap<String, Object> m;
    private RopeSkippingTargetDialog n;
    private int p;
    private SportMusicUtils q;
    private SectionBean r;
    private int t;
    private jaq v;
    private f s = new f(this);
    private b h = new b(this);
    private a g = new a(this);
    private List<Integer> o = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f25879b = null;
    private int d = 7;
    private HiHealthData f = new HiHealthData();
    private Handler l = new c(Looper.getMainLooper(), this);
    private String j = "";
    private Handler k = new Handler() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "mCustomTargetValueHandler msg is null");
                return;
            }
            super.handleMessage(message);
            RopeSkipStatisticProvider.this.p = message.arg1;
            if (message.obj instanceof Float) {
                RopeSkipStatisticProvider.this.t = (int) ((Float) message.obj).floatValue();
            }
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "mRopeJumpRefreshHandler, msg.what=", Integer.valueOf(message.what), " mTargetType:", Integer.valueOf(RopeSkipStatisticProvider.this.p), "mTargetValue:", Integer.valueOf(RopeSkipStatisticProvider.this.t));
            boolean z = message.arg2 != 2;
            RopeSkipStatisticProvider ropeSkipStatisticProvider = RopeSkipStatisticProvider.this;
            ropeSkipStatisticProvider.a(ropeSkipStatisticProvider.p, RopeSkipStatisticProvider.this.t, true, z);
            if (RopeSkipStatisticProvider.this.r != null) {
                RopeSkipStatisticProvider.this.r.c(RopeSkipStatisticProvider.this.f);
            }
        }
    };
    private String e = buh.e("rope_background_image_url");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25878a = buh.e("rope_background_image_url_tahiti");

    public static /* synthetic */ void c(int i, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return 283;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    public RopeSkipStatisticProvider() {
        n();
        this.q = new SportMusicUtils(BaseApplication.getContext());
    }

    private void n() {
        this.v = new jaq(BaseApplication.getContext(), new StorageParams(1), Integer.toString(20002));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        if (this.f != null) {
            String strB = dex.b(String.valueOf(283));
            double dA = !TextUtils.isEmpty(strB) ? CommonUtils.a(strB) : 0.0d;
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "loadDefaultData() cachedSumCountStr: ", strB, " cachedRopeJumpSumCount: ", Double.valueOf(dA));
            this.f.putDouble("TrackRepoJumpSum", dA);
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(4, new d(this));
        sectionBean.c(this.f);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.r = sectionBean;
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "requestTrackStatDistance sportType = ", Integer.valueOf(d()), " timeUnit = ", 7);
        if (!this.i) {
            e();
        }
        k();
        q();
        emh.b().e(this.g);
    }

    private void q() {
        if (this.v.h(283) != 1 || this.v.d(283) == null) {
            if (this.f25879b != null) {
                this.f25879b = null;
                LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "has bitmap before");
                this.r.c(this.f);
                return;
            }
            return;
        }
        this.q.b(this.v, 283, new e(this));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        y();
    }

    private void y() {
        if (njy.b(this.o)) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "unRopeSkipSubscribeListener");
            HiHealthNativeApi.a(this.f25880c).unSubscribeHiHealthData(this.o, new HiUnSubscribeListener() { // from class: sxt
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "unRopeSkipSubscribeListener isSuccess = ", Boolean.valueOf(z));
                }
            });
        } else {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "rope skip data listener has unregister.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(0L);
        hiSportStatDataAggregateOption.setEndTime(System.currentTimeMillis());
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setGroupUnitType(7);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"TrackRepoJumpSum"});
        hiSportStatDataAggregateOption.setType(new int[]{12});
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{283});
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, this.h);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        this.f25880c = context == null ? BaseApplication.getContext() : context;
        if (this.n == null) {
            this.n = new RopeSkippingTargetDialog(this.f25880c);
        }
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "parseParams");
        e(context, map, hiHealthData);
        this.m = map;
    }

    private void e(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        if (map == null || hiHealthData == null) {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "setData viewMap or data is null");
            return;
        }
        map.put("SECTION_STYLE", BaseSection.ROPE_SKIPPING_STYLE);
        if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f25878a)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.e);
            arrayList.add(this.f25878a);
            map.put("BACKGROUND", arrayList);
            this.i = true;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(Integer.valueOf(R.drawable.ic_track_rope_skip_bg));
            arrayList2.add(Integer.valueOf(R.drawable.ic_track_rope_skip_bg_bigcd));
            map.put("BACKGROUND", arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add(Integer.valueOf(R.drawable.track_sport_entrance_begin_normal));
        arrayList3.add(Integer.valueOf(R.drawable.track_sport_entrance_begin_normal));
        map.put("MIDDLE_IMAGEVIEW", arrayList3);
        map.put("MIDDLE_IMAGEVIEW_DESC", qre.f(R.string.IDS_indoor_start_skipping));
        a(map, hiHealthData);
        c(context, map);
        if (m()) {
            if (ive.c().m()) {
                map.put("RIGHT_TOP_IMAGE", Integer.valueOf(R.drawable.ic_rope_decice_connected));
            } else {
                map.put("RIGHT_TOP_IMAGE", Integer.valueOf(R.drawable.ic_rope_decice_unconnected));
            }
            map.put("RIGHT_TOP_IMAGE_DESC", this.f25880c.getResources().getString(R.string.IDS_device_pair_connect));
        }
        b(map);
        if (Utils.j()) {
            map.put("LEFT_IMAGEVIEW", f());
        }
        b(context, map);
    }

    private List<Integer> f() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_warmup));
        arrayList.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_warm_up));
        return arrayList;
    }

    private void b(Map<String, Object> map) {
        if (!CommonUtil.bh() || !jaa.f(this.f25880c)) {
            map.put("RIGHT_LAYOUT_VISIBLE", 8);
            return;
        }
        map.put("RIGHT_LAYOUT_VISIBLE", 0);
        String strD = this.v.d(283);
        if (this.v.h(283) != 1 || strD == null) {
            map.put("RIGHT_IMAGEVIEW", i());
            return;
        }
        Bitmap bitmap = this.f25879b;
        if (bitmap != null) {
            map.put("RIGHT_IMAGEVIEW", Collections.singletonList(bitmap));
        } else {
            map.put("RIGHT_IMAGEVIEW", i());
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<RopeSkipStatisticProvider> f25885c;

        e(RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            this.f25885c = new WeakReference<>(ropeSkipStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "loadMusicCallback errorCode is ", Integer.valueOf(i));
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.f25885c.get();
            if (ropeSkipStatisticProvider != null) {
                if (i != 100000 || obj == null) {
                    ropeSkipStatisticProvider.f25879b = null;
                } else if (obj instanceof Bitmap) {
                    ropeSkipStatisticProvider.f25879b = (Bitmap) obj;
                } else {
                    LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "loadMusicCallback objData is error!");
                    ropeSkipStatisticProvider.f25879b = null;
                }
                if (ropeSkipStatisticProvider.r != null) {
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "refresh icon");
                    ropeSkipStatisticProvider.r.c(ropeSkipStatisticProvider.f);
                    return;
                }
                return;
            }
            LogUtil.e("Track_Provider_Track_RopeSkipStatisticProvider", "loadMusicCallback error, ropeProvider is null.");
        }
    }

    private List<Integer> i() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_warmup_music_bg));
        arrayList.add(Integer.valueOf(R.drawable.ic_sport_entrance_music));
        arrayList.add(Integer.valueOf(R.string.IDS_hwh_motiontrack_music));
        return arrayList;
    }

    private void a(HashMap<String, Object> map, HiHealthData hiHealthData) {
        BigDecimal bigDecimal = new BigDecimal(0);
        Object obj = hiHealthData.get("TrackRepoJumpSum");
        if (obj != null) {
            bigDecimal = new BigDecimal(((Double) obj).doubleValue());
        }
        LogUtil.d("Track_Provider_Track_RopeSkipStatisticProvider", "TrackRepoJumpSum = ", Integer.valueOf(bigDecimal.intValue()));
        map.put("ACCUMULATED_DURATION", Integer.valueOf(bigDecimal.intValue()));
        map.put("ACCUMULATED_DURATION_TEXT", BaseApplication.getContext().getResources().getString(R.string.IDS_track_total_jumps));
    }

    private void c(Context context, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            this.p = tfi.e(this.f25880c, 283);
            int iD = (int) tfi.d(this.f25880c, 283);
            this.t = iD;
            int i = this.p;
            String strB = "";
            if (i == 5) {
                strB = UnitUtil.e(this.t, 1, 0) + this.f25880c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, this.t, "");
            } else if (i == 0) {
                strB = UnitUtil.b(iD);
            }
            String strC = RopeSkippingTargetDialog.c(this.p);
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "setTargetStyleAndValue() targetTypeStr = ", strC, ", targetValueStr = ", strB);
            if (!TextUtils.isEmpty(strB)) {
                if (LanguageUtil.c(BaseApplication.getContext())) {
                    strC = strC + ": " + strB;
                } else {
                    strC = strC + " " + strB;
                }
            }
            map.put("IS_GOAL_BUTTON_SHOW", true);
            map.put("GOAL_BUTTON", strC);
            return;
        }
        map.put("IS_GOAL_BUTTON_SHOW", false);
    }

    private void b(final Context context, HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.5
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (qrs.c(500)) {
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onClick isFastClick");
                    return;
                }
                if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                    RopeSkipStatisticProvider.this.a(context);
                    return;
                }
                if ("LEFT_IMAGEVIEW".equals(str)) {
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "LEFT_IMAGEVIEW on click");
                    ify.a(RopeSkipStatisticProvider.this.f25880c, 283, RopeSkipStatisticProvider.this.p, RopeSkipStatisticProvider.this.t);
                    return;
                }
                if ("RIGHT_IMAGEVIEW".equals(str)) {
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "RIGHT_IMAGEVIEW on click");
                    RopeSkipStatisticProvider.this.j();
                    return;
                }
                if ("MIDDLE_IMAGEVIEW".equals(str)) {
                    LogUtil.d("Track_Provider_Track_RopeSkipStatisticProvider", "MIDDLE_IMAGEVIEW on click");
                    RopeSkipStatisticProvider.this.h();
                } else if ("GOAL_BUTTON".equals(str)) {
                    LogUtil.d("Track_Provider_Track_RopeSkipStatisticProvider", "GOAL_BUTTON on click");
                    RopeSkipStatisticProvider.this.n.b(RopeSkipStatisticProvider.this.d(), RopeSkipStatisticProvider.this.k);
                } else if ("RIGHT_TOP_IMAGE".equals(str)) {
                    RopeSkipStatisticProvider.this.l();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: syc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    RopeSkipStatisticProvider.c(i, obj);
                }
            }, "");
            return;
        }
        FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
        if (sessionActivityActionD == null) {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "FitnessSessionManager getSessionForActivityAction null");
        } else {
            sessionActivityActionD.startSportHistoryActivity(context, 283, d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LoginInit.getInstance(this.f25880c).browsingToLogin(new IBaseResponseCallback() { // from class: sya
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48797c.d(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            g();
        } else {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "errorCode is not success", Integer.valueOf(i));
        }
    }

    private void g() {
        if (wkb.d()) {
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(BaseApplication.getContext());
                return;
            }
            return;
        }
        ArrayList<ContentValues> arrayListE = drw.e().e(HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING);
        if (njy.e(arrayListE)) {
            if (this.f25880c == null) {
                LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "handleDeviceNotConnected: context is null");
                return;
            }
            SectionBean sectionBean = this.r;
            if (sectionBean != null) {
                etj.a(sectionBean.e(), true);
                return;
            }
            return;
        }
        if (arrayListE.size() > 1) {
            a(arrayListE);
        } else {
            e(arrayListE.get(0));
        }
    }

    private void e(ContentValues contentValues) {
        if (dmg.a().isRopeDeviceBtConnected()) {
            c(contentValues);
            return;
        }
        String asString = contentValues.getAsString("productId");
        String asString2 = contentValues.getAsString("uniqueId");
        elh elhVarD = ResourceManager.c().d(asString);
        if (elhVarD == null) {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "handleDeviceNotConnected: productInfo is null");
            return;
        }
        elh.a aVarN = elhVarD.n();
        if (aVarN == null) {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "handleDeviceNotConnected: introduction is null");
            return;
        }
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(aVarN.b())) {
            Intent intentB = etn.b(elhVarD, asString, asString2);
            if (intentB != null) {
                iov.d(this.f25880c, intentB);
                return;
            }
            return;
        }
        dsy.e().e(this.f25880c, asString, asString2);
    }

    private void a(ArrayList<ContentValues> arrayList) {
        if (dmg.a().isRopeDeviceBtConnected()) {
            String currentMacAddress = dmg.a().getCurrentMacAddress();
            for (ContentValues contentValues : arrayList) {
                if (TextUtils.equals(contentValues.getAsString("uniqueId"), currentMacAddress)) {
                    c(contentValues);
                    return;
                }
            }
            return;
        }
        dsy.e().a(this.f25880c, arrayList);
    }

    private void c(ContentValues contentValues) {
        if (contentValues == null) {
            LogUtil.e("Track_Provider_Track_RopeSkipStatisticProvider", "jumpToDeviceManager deviceInfo is null.");
            return;
        }
        String asString = contentValues.getAsString("productId");
        String asString2 = contentValues.getAsString("uniqueId");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("SWITCH_PLUGINDEVICE");
        bundle.putString("arg1", "DeviceInfoList");
        bundle.putString("productId", asString);
        bundle.putString("uniqueId", asString2);
        intent.setPackage(roq.f47547c);
        intent.setClassName(roq.f47547c, "com.huawei.health.device.ui.DeviceMainActivity");
        bundle.putParcelable("commonDeviceInfo", contentValues);
        intent.putExtras(bundle);
        iov.d(this.f25880c, intent);
    }

    private boolean m() {
        return Utils.c() == 1;
    }

    private void b() {
        AudioResProviderInterface audioResProviderInterface = (AudioResProviderInterface) AppRouter.e(AudioResProviderInterface.ROUTER_PATH_AUDIO_RES_DOWNLOAD, AudioResProviderInterface.class);
        boolean zB = pqj.b().b(this.f25880c);
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "service = ", Boolean.valueOf(audioResProviderInterface != null), "isEnableCurLang = ", Boolean.valueOf(zB));
        if (audioResProviderInterface != null && zB) {
            audioResProviderInterface.queryOrDownAudioResource(BaseApplication.getActivity(), pqq.b(this.f25880c, "Sport"), this.f25880c.getResources().getString(com.huawei.ui.commonui.R.string.IDS_hwh_base_model_multilingualaudio), new AudioResDownloadListener() { // from class: syb
                @Override // com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener
                public final void onResult(int i) {
                    this.f48798a.d(i);
                }
            });
        } else {
            this.l.sendEmptyMessage(101);
        }
    }

    public /* synthetic */ void d(int i) {
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "result = ", Integer.valueOf(i));
        this.l.sendEmptyMessage(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!m()) {
            this.d = 7;
            c();
        } else if (ive.c().m()) {
            this.d = 5;
            c();
        } else if (SportSupportUtil.i()) {
            this.d = 7;
            c();
        } else {
            p();
        }
    }

    private void p() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f25880c);
        builder.a(R.string.IDS_rope_connect_dialog_title).b(R.string.IDS_rope_connect_dialog_content).a(com.huawei.plugindevice.R.string.IDS_rope_connect_dialog_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RopeSkipStatisticProvider.this.l();
            }
        }).e(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LoginInit.getInstance(this.f25880c).browsingToLogin(new IBaseResponseCallback() { // from class: sxz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48794b.b(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            a();
        } else {
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "errorCode is not success", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        lmf.d().c(this.f25880c, AnalyticsValue.MOTION_TRACK_1040014.value(), this.q.a(new HashMap(5), 283), 0);
    }

    private void a() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).checkUserInfo(this.f25880c, new IBaseResponseCallback() { // from class: sxy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48793b.a(i, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i != 0) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, boolean z, boolean z2) {
        if (z) {
            tfi.b(this.f25880c, 283, i);
            float f2 = i2;
            tfi.a(this.f25880c, f2, 283);
            tfi.a(this.f25880c, 283, z2);
            if (z2) {
                tfi.b(this.f25880c, 283, i, f2);
            } else {
                tfi.b(this.f25880c, 283, i, -1.0f);
            }
        }
    }

    private void c() {
        StorageParams storageParams = new StorageParams();
        String string = Integer.toString(20002);
        String strE = SharedPreferenceManager.e(this.f25880c, string, "map_tracking_sport_type_sportting");
        ReleaseLogUtil.d("Track_Provider_Track_RopeSkipStatisticProvider", "checkAndStartSport() typeStr = ", strE);
        if (!TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.f25880c, string, "map_tracking_sport_type_sportting", String.valueOf(283), storageParams);
        }
        if (this.d == 5) {
            r();
        }
        boolean zEquals = "true".equals(buh.e("ROPE_DISPLAY_PROCESS"));
        if (this.d == 5 && !zEquals) {
            ive.c().e(283, this.p, this.t);
        } else {
            ive.c().c(this.f25880c, 283, this.p, this.t);
        }
    }

    private void r() {
        String productId = dmg.a().getProductId();
        elh elhVarD = ResourceManager.c().d(productId);
        if (elhVarD == null) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "saveDeviceName productInfo is null");
            return;
        }
        String strA = elo.a(productId, elhVarD.l().d());
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("device_name", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_name_key", strA);
            editorEdit.apply();
        }
    }

    static class f implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<RopeSkipStatisticProvider> f25886c;

        f(RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            this.f25886c = new WeakReference<>(ropeSkipStatisticProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.f25886c.get();
            if (ropeSkipStatisticProvider == null) {
                return;
            }
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onResponse ", obj);
            HiHealthData hiHealthData = new HiHealthData();
            if (njy.b(obj, HiHealthData.class)) {
                List list = (List) obj;
                if (list.size() > 0) {
                    hiHealthData = (HiHealthData) list.get(0);
                } else {
                    LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "data size =", Integer.valueOf(list.size()));
                }
            } else {
                LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "class type is wrong");
            }
            ropeSkipStatisticProvider.v();
            ropeSkipStatisticProvider.b(hiHealthData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        c(this.f25880c, LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() ? new HashMap<>() : this.m);
        SectionBean sectionBean = this.r;
        if (sectionBean != null) {
            sectionBean.c(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HiHealthData hiHealthData) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            this.f = new HiHealthData();
        } else if (hiHealthData != null) {
            this.f = hiHealthData.copyData();
        }
        if (s()) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "update ui");
            this.r.c(this.f);
        }
    }

    private boolean s() {
        if (this.f == null) {
            return false;
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        Object obj = this.f.get("TrackRepoJumpSum");
        if (obj != null) {
            bigDecimal = new BigDecimal(((Double) obj).doubleValue());
        }
        String strB = dex.b(String.valueOf(283));
        if ((!TextUtils.isEmpty(strB) ? CommonUtils.a(strB) : 0.0d) == bigDecimal.doubleValue()) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "same rope cache");
            return false;
        }
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "refresh rope cache");
        dex.a(String.valueOf(283), String.valueOf(bigDecimal.doubleValue()));
        return true;
    }

    static class c extends BaseHandler<RopeSkipStatisticProvider> {
        c(Looper looper, RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            super(looper, ropeSkipStatisticProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(RopeSkipStatisticProvider ropeSkipStatisticProvider, Message message) {
            if (message.what != 101) {
                return;
            }
            ropeSkipStatisticProvider.o();
        }
    }

    private void e() {
        String strE = buh.e("rope_background_image_save_time");
        if (TextUtils.isEmpty(strE)) {
            t();
            return;
        }
        if (System.currentTimeMillis() - CommonUtils.i(strE) < 3600000) {
            this.e = buh.e("rope_background_image_url");
            this.f25878a = buh.e("rope_background_image_url_tahiti");
            if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f25878a)) {
                t();
                return;
            }
            return;
        }
        t();
    }

    private void t() {
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "requestBackgroundImage()");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(4019).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    if (mapFilterMarketingRules == null) {
                        LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "requestBackgroundImage() filterResult is null");
                        return;
                    }
                    LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "on success");
                    ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(4019);
                    if (resourceResultInfo == null) {
                        LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "requestBackgroundImage() resultInfo is null");
                    } else {
                        RopeSkipStatisticProvider.this.b(resourceResultInfo.getResources());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<ResourceBriefInfo> list) {
        if (njy.b(list)) {
            Collections.sort(list, new Comparator<ResourceBriefInfo>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.RopeSkipStatisticProvider.6
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                    if (resourceBriefInfo == null || resourceBriefInfo2 == null) {
                        return -1;
                    }
                    return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
                }
            });
            for (ResourceBriefInfo resourceBriefInfo : list) {
                if (resourceBriefInfo.getContentType() == 31) {
                    RopeBackgroundTemplate ropeBackgroundTemplate = (RopeBackgroundTemplate) HiJsonUtil.d(resourceBriefInfo.getContent().getContent(), RopeBackgroundTemplate.class);
                    if (ropeBackgroundTemplate == null) {
                        LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "requestBackgroundImage() backgroundTemplate is null");
                    } else {
                        a(ropeBackgroundTemplate.getPicture(), ropeBackgroundTemplate.getTahitiPicture());
                        return;
                    }
                }
            }
            ReleaseLogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "requestBackgroundImage() cannot find background image");
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f25878a)) {
            if (this.e.equals(str) && this.f25878a.equals(str2)) {
                buh.d("rope_background_image_save_time", String.valueOf(System.currentTimeMillis()));
                return;
            } else {
                e(str, str2);
                return;
            }
        }
        e(str, str2);
    }

    private void e(String str, String str2) {
        this.e = str;
        this.f25878a = str2;
        LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "saveImageDataAndUpdateUi() mBackgroundImageUrl: ", str, ", mBackgroundImageUrlTahiti: ", str2);
        buh.d("rope_background_image_url", this.e);
        buh.d("rope_background_image_url_tahiti", this.f25878a);
        buh.d("rope_background_image_save_time", String.valueOf(System.currentTimeMillis()));
        SectionBean sectionBean = this.r;
        if (sectionBean != null) {
            sectionBean.c(this.f);
        }
    }

    static class b implements HiAggregateListener {
        WeakReference<RopeSkipStatisticProvider> d;

        b(RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            this.d = new WeakReference<>(ropeSkipStatisticProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.d.get();
            if (ropeSkipStatisticProvider != null) {
                f fVar = ropeSkipStatisticProvider.s;
                if (fVar == null) {
                    LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "requestTrackStatData callback is null");
                    return;
                } else {
                    fVar.a(i, list);
                    return;
                }
            }
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "onResult: ropeSkipStatisticProvider is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onResultIntent");
        }
    }

    static class a implements MessageOrStateCallback {
        WeakReference<RopeSkipStatisticProvider> e;

        a(RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            this.e = new WeakReference<>(ropeSkipStatisticProvider);
        }

        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onNewMessage(int i, Bundle bundle) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onNewMessage");
        }

        @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
        public void onStateChange(String str) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onStateChange: ", str);
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.e.get();
            if (ropeSkipStatisticProvider != null) {
                if (ropeSkipStatisticProvider.r == null || ropeSkipStatisticProvider.f == null) {
                    return;
                }
                ropeSkipStatisticProvider.r.c(ropeSkipStatisticProvider.f);
                return;
            }
            LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "onStateChange: ropeSkipStatisticProvider is null");
        }
    }

    static class d implements HiSubscribeListener {
        WeakReference<RopeSkipStatisticProvider> e;

        d(RopeSkipStatisticProvider ropeSkipStatisticProvider) {
            this.e = new WeakReference<>(ropeSkipStatisticProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.e.get();
            if (ropeSkipStatisticProvider == null) {
                LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "onResult: ropeSkipStatisticProvider is null");
            } else if (njy.b(list)) {
                LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "registerReportDataListener success");
                ropeSkipStatisticProvider.o = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("Track_Provider_Track_RopeSkipStatisticProvider", "onChange", Integer.valueOf(i));
            RopeSkipStatisticProvider ropeSkipStatisticProvider = this.e.get();
            if (ropeSkipStatisticProvider != null) {
                ropeSkipStatisticProvider.k();
            } else {
                LogUtil.j("Track_Provider_Track_RopeSkipStatisticProvider", "onChange: ropeSkipStatisticProvider is null");
            }
        }
    }
}
