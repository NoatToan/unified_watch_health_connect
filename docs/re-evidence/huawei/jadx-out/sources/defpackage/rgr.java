package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.vippage.PromotionPolicyActivity;
import com.huawei.health.huaweihealth.HuaweiHealthApi;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.BenefitMessage;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.health.vip.datatypes.PromotionPolicyCacheInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.PromotionPolicyInfo;
import com.huawei.ui.commonui.dialog.QueueDialog;
import com.huawei.ui.commonui.dialog.VibrantLifeDialog;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.HomeFragment;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class rgr {
    private static long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f47304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47305b;
    private WeakReference<HomeFragment> e;
    private VibrantLifeDialog g;
    private int f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47306c = 0;

    public rgr(HomeFragment homeFragment, Context context) {
        this.e = new WeakReference<>(homeFragment);
        this.f47304a = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HomeFragment h() {
        WeakReference<HomeFragment> weakReference = this.e;
        if (weakReference == null) {
            LogUtil.e("HomeFragmentDialogMgr", "mRef is null");
            return null;
        }
        HomeFragment homeFragment = weakReference.get();
        if (homeFragment != null) {
            return homeFragment;
        }
        LogUtil.e("HomeFragmentDialogMgr", "fragment is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context g() {
        Context context = this.f47304a.get();
        if (context == null) {
            return null;
        }
        return context;
    }

    public void f() {
        HomeFragment homeFragmentH = h();
        if (homeFragmentH == null) {
            LogUtil.e("HomeFragmentDialogMgr", "fragment is null");
            return;
        }
        Context contextG = g();
        if (contextG == null) {
            LogUtil.j("HomeFragmentDialogMgr", "updateTodoFloatView context is null");
            return;
        }
        ((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).hideOrShowTodoFloatView(homeFragmentH.getActivity(), (LoginInit.getInstance(contextG).isBrowseMode() || homeFragmentH.o || !homeFragmentH.n || homeFragmentH.g || !((HuaweiHealthApi) Services.b("HuaweiHealth", HuaweiHealthApi.class)).isPrivacyStatementAgreed()) ? false : true);
        LogUtil.a("HomeFragmentDialogMgr", "updateTodoFloatView end");
        LogUtil.a("HomeFragmentDialogMgr", "updateShowAd, ", Boolean.valueOf(homeFragmentH.g));
        LogUtil.a("HomeFragmentDialogMgr", "mFragmentVisible, ", Boolean.valueOf(homeFragmentH.f25111b));
        if (homeFragmentH.g || !homeFragmentH.f25111b || !homeFragmentH.j || LoginInit.getInstance(contextG).isBrowseMode()) {
            return;
        }
        homeFragmentH.j = false;
        if (!qrg.e("FRAGMENT_SHOW_DIALOG")) {
            d = qrg.d("FRAGMENT_START_TIME");
            this.f = qrg.b("FRAGMENT_SHOW_DIALOG_COUNT");
        }
        LogUtil.a("HomeFragmentDialogMgr", "queryingShowDialogCondition, ", this);
        l();
        ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "shouldLoadDialog,", Boolean.valueOf(e()));
        if (!e() && this.g == null) {
            b();
        }
        j();
        if (homeFragmentH.o || TimeUtil.d(this.f47306c, System.currentTimeMillis()) || !VersionControlUtil.isSupportOperationAccount()) {
            return;
        }
        HandlerCenter.a().d(new Runnable() { // from class: rhb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void l() {
        List<DeviceBenefitQueryParam> listD = qhu.d("HomeFragmentDialogMgr", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL);
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi != null) {
            payApi.getAllDeviceBenefits(listD, new b());
        }
    }

    class b implements IBaseResponseCallback {
        private b() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (rgr.this.h() != null) {
                Context contextG = rgr.this.g();
                if (contextG == null) {
                    LogUtil.a("HomeFragmentDialogMgr", "context is null");
                    return;
                }
                ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "HomeEquityDialogCallBack== ", Integer.valueOf(i));
                if (i == 0) {
                    vct.b(obj, contextG, 1, rgr.d, rgr.this.f);
                    return;
                }
                return;
            }
            LogUtil.a("HomeFragmentDialogMgr", "homeFragment== ", null);
        }
    }

    public static boolean e() {
        if (CommonUtil.ca()) {
            return false;
        }
        String strC = qrg.c();
        LogUtil.a("HomeFragmentDialogMgr", "needNova = ", strC);
        return "needNova".equals(strC);
    }

    public void b() {
        if (CommonUtil.bg()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rgr.3
                @Override // java.lang.Runnable
                public void run() {
                    rgr.this.f47305b = qhu.c(BaseApplication.getContext());
                    LogUtil.a("HomeFragmentDialogMgr", "getDeviceSn end is deviceSn empty", Boolean.valueOf(TextUtils.isEmpty(rgr.this.f47305b)));
                    if (TextUtils.isEmpty(rgr.this.f47305b)) {
                        return;
                    }
                    rgr.this.n();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        DeviceBenefitQueryParam deviceBenefitQueryParamBuild = new DeviceBenefitQueryParam.Builder().setDeviceType(PhoneInfoUtils.getDeviceModel()).setBenefitType(DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_PERF_PURCHASE).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_PHONE.getCategory()).setDeviceSnType(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_UDID.getSnType()).setDeviceSn(this.f47305b).setNeedProductInfo(true).build();
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        LogUtil.a("HomeFragmentDialogMgr", "deviceModel", PhoneInfoUtils.getDeviceModel());
        if (payApi != null) {
            payApi.getDeviceBenefits(deviceBenefitQueryParamBuild, new a());
        }
    }

    class a implements IBaseResponseCallback {
        private a() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 0) {
                LogUtil.j("HomeFragmentDialogMgr", "HomeMemberCallBack errorCode", Integer.valueOf(i));
                return;
            }
            if (obj == null) {
                LogUtil.j("HomeFragmentDialogMgr", "HomeMemberCallBack objData is null");
                return;
            }
            DeviceBenefits deviceBenefits = (DeviceBenefits) obj;
            List<DevicePerfPurchaseInfo> perfPurchaseInfos = deviceBenefits.getPerfPurchaseInfos();
            if (njy.e(perfPurchaseInfos) || njy.e(perfPurchaseInfos, 0)) {
                LogUtil.a("HomeFragmentDialogMgr", "HomeFragment perfPurchaseInfos == null");
                return;
            }
            String deviceSn = deviceBenefits.getDeviceSn();
            long jC = irz.c(false, deviceSn);
            LogUtil.a("HomeFragmentDialogMgr", "getDeviceBenefitsListAndShowDialog ", " lastShowDialogTime:", Long.valueOf(jC));
            if (wig.a(jC, System.currentTimeMillis())) {
                DevicePerfPurchaseInfo devicePerfPurchaseInfo = perfPurchaseInfos.get(0);
                LogUtil.a("HomeFragmentDialogMgr", "devicePerfPurchaseInfo ==" + devicePerfPurchaseInfo);
                rgr.this.e(devicePerfPurchaseInfo, deviceSn);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final DevicePerfPurchaseInfo devicePerfPurchaseInfo, final String str) {
        long effectiveStartTime = devicePerfPurchaseInfo.getEffectiveStartTime();
        long effectiveEndTime = devicePerfPurchaseInfo.getEffectiveEndTime();
        int activeStatus = devicePerfPurchaseInfo.getActiveStatus();
        if (!vct.a(effectiveStartTime, effectiveEndTime) || activeStatus != 1) {
            LogUtil.j("HomeFragmentDialogMgr", "devicePerfPurchase is expired or active");
            return;
        }
        HomeFragment homeFragmentH = h();
        if (homeFragmentH == null) {
            return;
        }
        if (homeFragmentH.getActivity() == null) {
            LogUtil.j("HomeFragmentDialogMgr", "activity is null");
            return;
        }
        String backgroundUrl = devicePerfPurchaseInfo.getBackgroundUrl();
        if (TextUtils.isEmpty(backgroundUrl)) {
            LogUtil.j("HomeFragmentDialogMgr", "backgroundUrl is empty");
            return;
        }
        final String deviceName = devicePerfPurchaseInfo.getDeviceName();
        devicePerfPurchaseInfo.setDeviceSn(str);
        final Drawable drawableB = qqf.b(BaseApplication.getContext(), backgroundUrl);
        HandlerExecutor.b(new Runnable() { // from class: rgz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(devicePerfPurchaseInfo, deviceName, drawableB, str);
            }
        });
        e(devicePerfPurchaseInfo);
    }

    /* synthetic */ void b(DevicePerfPurchaseInfo devicePerfPurchaseInfo, String str, Drawable drawable, String str2) {
        c(devicePerfPurchaseInfo, str, drawable, str2);
        irz.a(false, str2);
        qrg.h("NotNeedNova");
    }

    private void c(final DevicePerfPurchaseInfo devicePerfPurchaseInfo, String str, Drawable drawable, String str2) {
        String strD = irz.d(irx.d(devicePerfPurchaseInfo), irz.b(devicePerfPurchaseInfo));
        if (h() == null) {
            LogUtil.e("HomeFragmentDialogMgr", "getFragment is null");
            return;
        }
        FragmentActivity activity = h().getActivity();
        if (activity == null) {
            LogUtil.j("HomeFragmentDialogMgr", "activity is null");
            return;
        }
        this.g = new VibrantLifeDialog(activity);
        if (drawable == null) {
            LogUtil.j("HomeFragmentDialogMgr", "drawable is null");
        }
        this.g.a(drawable);
        try {
            String str3 = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_equity_first), str);
            String str4 = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_user_member_content), strD);
            this.g.a(str3);
            this.g.d(str4);
        } catch (IllegalFormatConversionException e2) {
            LogUtil.a("HomeFragmentDialogMgr", "IllegalFormatConversionException : format exception" + LogAnonymous.b(e2));
        }
        HandlerExecutor.c(new Runnable() { // from class: rgw
            @Override // java.lang.Runnable
            public final void run() {
                this.f47318b.b(devicePerfPurchaseInfo);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        if (h() != null) {
            h().e = false;
        }
        this.g.d(new View.OnClickListener() { // from class: rha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(devicePerfPurchaseInfo, view);
            }
        });
        QueueDialog queueDialog = this.g;
        queueDialog.enqueueShowing(queueDialog);
        ObserverManagerUtil.e("EQUITY_AND_VIBRANT", new Object[0]);
    }

    /* synthetic */ void d(DevicePerfPurchaseInfo devicePerfPurchaseInfo, View view) {
        HomeFragment homeFragmentH = h();
        if (homeFragmentH == null) {
            LogUtil.a("HomeFragmentDialogMgr", "homeFragment is null");
        } else {
            irz.e(homeFragmentH.getActivity(), devicePerfPurchaseInfo, 6, (List<DeviceBenefitInfo>) null);
            this.g.dismiss();
        }
    }

    private void e(final DevicePerfPurchaseInfo devicePerfPurchaseInfo) {
        LogUtil.a("HomeFragmentDialogMgr", "generateBenefitMessage enter");
        if (devicePerfPurchaseInfo == null) {
            LogUtil.j("HomeFragmentDialogMgr", "devicePerfPurchaseInfo = null");
            return;
        }
        final String deviceName = devicePerfPurchaseInfo.getDeviceName();
        final String strD = irz.d(irx.d(devicePerfPurchaseInfo), irz.b(devicePerfPurchaseInfo));
        ThreadPoolManager.c().execute(new Runnable() { // from class: rgr.5
            @Override // java.lang.Runnable
            public void run() {
                MessageObject messageObject = new MessageObject();
                messageObject.setMsgType(2);
                messageObject.setPosition(3);
                messageObject.setMsgPosition(11);
                messageObject.setReceiveTime(System.currentTimeMillis());
                messageObject.setModule(String.valueOf(70));
                messageObject.setType(MessageConstant.MEMBER_TYPE);
                messageObject.setReadFlag(0);
                messageObject.setMsgId("20211113");
                BenefitMessage benefitMessage = new BenefitMessage();
                benefitMessage.setBenefitType(MessageConstant.BENEFIT_PURCHASE_TYPE);
                benefitMessage.setBenefitData(qqt.b(devicePerfPurchaseInfo));
                messageObject.setDetailUriExt(qqt.b(benefitMessage));
                messageObject.setDetailUri("messagecenter://benefit?type=" + devicePerfPurchaseInfo.getLinkType() + "&key=" + ifp.b(devicePerfPurchaseInfo.getLinkValue()));
                messageObject.setMsgTitle(String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_benifits), deviceName));
                messageObject.setMsgContent(String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_benifits_content), deviceName, strD, devicePerfPurchaseInfo.getPerfPurchaseName()));
                ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).insertMessage(messageObject);
            }
        });
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: rgr.1
            @Override // java.lang.Runnable
            public void run() {
                rgr.this.c(qhu.d("HomeFragmentDialogMgr", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<DeviceBenefitQueryParam> list) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi != null) {
            payApi.getAllDeviceBenefits(list, new e());
        }
    }

    class e implements IBaseResponseCallback {
        private e() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (rgr.this.h() == null) {
                LogUtil.a("HomeFragmentDialogMgr", "homeFragment is null");
                return;
            }
            ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "HomeEquityVibrantLifeDialogCallBack ", Integer.valueOf(i));
            if (i == 0) {
                Context contextG = rgr.this.g();
                if (contextG == null) {
                    LogUtil.a("HomeFragmentDialogMgr", "HomeEquityVibrantLifeDialogCallBack context is null");
                } else {
                    vdm.e(obj, contextG);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void d() {
        if (i()) {
            if (!fca.f()) {
                LogUtil.j("HomeFragmentDialogMgr", "queryingPromotionAndShowDialog has showed this month");
            } else {
                this.f47306c = System.currentTimeMillis();
                ThreadPoolManager.c().execute(new Runnable() { // from class: rgx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.a();
                    }
                });
            }
        }
    }

    /* synthetic */ void a() {
        ((PayApi) Services.b("TradeService", PayApi.class)).getPromotionPolicy(new IBaseResponseCallback() { // from class: rgy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f47319a.b(i, obj);
            }
        }, "3");
    }

    /* synthetic */ void b(int i, Object obj) {
        if (obj instanceof PromotionPolicyInfo) {
            PromotionPolicyInfo promotionPolicyInfo = (PromotionPolicyInfo) obj;
            if (!promotionPolicyInfo.isDialogFlag()) {
                LogUtil.j("HomeFragmentDialogMgr", "queryingPromotionAndShowDialog need not to show promotion dialog");
                return;
            }
            PromotionPolicyCacheInfo promotionPolicyCacheInfoD = fca.d();
            if (TextUtils.equals(promotionPolicyInfo.getPromotionPolicyId(), promotionPolicyCacheInfoD.getPolicyId()) && promotionPolicyCacheInfoD.getLastPolicyShowCount() >= 3) {
                LogUtil.j("HomeFragmentDialogMgr", "same promotion dialog has showed for 3 times, return");
                return;
            } else {
                a(promotionPolicyInfo);
                return;
            }
        }
        LogUtil.j("HomeFragmentDialogMgr", "failed !! getPromotionPolicy errorCode = " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        long jD = qrg.d("FRAGMENT_START_TIME");
        long jD2 = irz.d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "et sw tm:", Long.valueOf(jD), " vi sw tm:", Long.valueOf(jD2));
        if (!TimeUtil.d(jD, jCurrentTimeMillis) && !TimeUtil.d(jD2, jCurrentTimeMillis)) {
            return true;
        }
        LogUtil.j("HomeFragmentDialogMgr", "queryingPromotionAndShowDialog has showed equity dialog today, return");
        return false;
    }

    private void a(final PromotionPolicyInfo promotionPolicyInfo) {
        String dialogPicUrl;
        if (promotionPolicyInfo == null) {
            LogUtil.j("HomeFragmentDialogMgr", "preloadImage() error, promotionInfo is null");
            return;
        }
        if (qrs.af(BaseApplication.getActivity())) {
            dialogPicUrl = promotionPolicyInfo.getTahitiDialogPicUrl();
        } else {
            dialogPicUrl = promotionPolicyInfo.getDialogPicUrl();
        }
        if (TextUtils.isEmpty(dialogPicUrl)) {
            LogUtil.j("HomeFragmentDialogMgr", "preloadImage() error, imageUrl is null or empty");
            return;
        }
        ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "start preloadImage");
        qqf.c(BaseApplication.getContext(), dialogPicUrl, new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.DATA), new RequestListener<Drawable>() { // from class: rgr.4
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "preloadImage failed");
                rgr.this.f47306c = 0L;
                return true;
            }

            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                ReleaseLogUtil.d("R_HomeFragmentDialogMgr", "preloadImage success");
                Context contextG = rgr.this.g();
                HomeFragment homeFragmentH = rgr.this.h();
                if (contextG == null || homeFragmentH == null) {
                    rgr.this.f47306c = 0L;
                    LogUtil.j("HomeFragmentDialogMgr", "preloadImage context or homeFragment is null");
                    return true;
                }
                if (!homeFragmentH.isResumed() || !rgr.this.i()) {
                    rgr.this.f47306c = 0L;
                    LogUtil.j("HomeFragmentDialogMgr", "homeFragment is not resumed");
                    return true;
                }
                Intent intent = new Intent(contextG, (Class<?>) PromotionPolicyActivity.class);
                intent.putExtra("promotionPolicyInfo", qqt.b(promotionPolicyInfo));
                intent.putExtra("showPage", "today_page");
                rgr.this.g().startActivity(intent);
                return true;
            }
        });
    }
}
