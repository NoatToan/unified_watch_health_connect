package com.huawei.ui.homehealth.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C;
import com.huawei.common.Constant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.security.SecurityChecker;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.NewDeviceFragment;
import com.huawei.ui.homehealth.device.util.DeviceFloatMenuUtils;
import com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceListViewModel;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel;
import com.huawei.ui.homehealth.operation.ResourceCallback;
import com.huawei.ui.homehealth.operation.vmall.bean.VmallResource;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import defpackage.coq;
import defpackage.dmp;
import defpackage.ecu;
import defpackage.efl;
import defpackage.ezi;
import defpackage.gvi;
import defpackage.lmf;
import defpackage.lss;
import defpackage.lut;
import defpackage.lvb;
import defpackage.lvl;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qum;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.rod;
import defpackage.rom;
import defpackage.rtk;
import defpackage.rts;
import defpackage.rve;
import defpackage.rvr;
import defpackage.ssc;
import defpackage.tfi;
import defpackage.tpe;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class NewDeviceFragment extends DeviceMainFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentActivity f25218a;
    private VMallFragment aa;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CompatibilityInteractor f25220c;
    public DeviceSettingsInteractors d;
    private boolean g;
    private DeviceProtectViewModel.DeviceListUpdateCallback h;
    private boolean i;
    private ArkuiDeviceFragment k;
    private rve m;
    private Activity n;
    private DownloadCloudDeviceManager p;
    private DeviceProtectViewModel q;
    private DeviceListViewModel r;
    private GuideInteractors s;
    private CustomTitleBar t;
    private View v;
    private rom w;
    private RelativeLayout x;
    private ViewGroup y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ExecutorService f25219b = Executors.newCachedThreadPool();
    private boolean u = false;
    private HealthViewPager ac = null;
    private int l = 0;
    private int z = 1;
    private int o = 0;
    private DownloadCloudDeviceResource j = new DownloadCloudDeviceResource();
    private boolean f = true;
    private BroadcastReceiver e = new AnonymousClass5();

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.NewDeviceFragment$5, reason: invalid class name */
    public class AnonymousClass5 extends BroadcastReceiver {
        AnonymousClass5() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) throws Throwable {
            String action = intent.getAction();
            LogUtil.a("NewDeviceFragment", "loginStatusReceiver onReceive action:", action);
            if ("com.huawei.plugin.account.login".equals(action)) {
                rts.b(NewDeviceFragment.this.f25218a, NewDeviceFragment.this.u, (BaseResponseCallback<Boolean>) new BaseResponseCallback() { // from class: rnw
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f47513c.b(intent, i, (Boolean) obj);
                    }
                });
                return;
            }
            if ("com.huawei.plugin.account.logout".equals(action)) {
                LogUtil.a("NewDeviceFragment", "loginStatusReceiver ACTION_LOGOUT_SUCCESSFUL");
                return;
            }
            if ("com.huawei.bone.action.DEVICE_THIRD_DELETE".equals(action)) {
                LogUtil.a("NewDeviceFragment", "broadcastReceiver onReceiver ACTION_DEVICE_THIRD_DELETE");
                if (BaseApplication.j() == NewDeviceFragment.this.f25218a && NewDeviceFragment.this.u) {
                    NewDeviceFragment.this.k.d();
                }
            }
        }

        public /* synthetic */ void b(Intent intent, int i, Boolean bool) {
            ReleaseLogUtil.d("R_NewDeviceFragment", "loginStatusReceiver checkUserChanger isChanger:", bool);
            if (bool.booleanValue()) {
                NewDeviceFragment.this.i = false;
                return;
            }
            NewDeviceFragment.this.k.d();
            if (!intent.getBooleanExtra(Constant.KEY_IS_REBOOT, false)) {
                NewDeviceFragment.this.l();
            } else {
                LogUtil.j("NewDeviceFragment", "login sendAccount app reBoot");
            }
        }
    }

    public NewDeviceFragment(Activity activity, HealthBottomView healthBottomView) throws Throwable {
        rts.b(activity, this.u, new BaseResponseCallback<Boolean>() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.7
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, Boolean bool) {
                NewDeviceFragment.this.ad();
                ReleaseLogUtil.d("R_NewDeviceFragment", "new NewDeviceFragment haveDevice：", Boolean.valueOf(lut.a().f()), " isChanger:", bool);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity = getActivity();
        this.f25218a = activity;
        this.n = activity;
        this.d = DeviceSettingsInteractors.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        this.s = new GuideInteractors(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        this.r = (DeviceListViewModel) new ViewModelProvider(this.f25218a).get(DeviceListViewModel.class);
        this.q = (DeviceProtectViewModel) new ViewModelProvider(this.f25218a).get(DeviceProtectViewModel.class);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_new, viewGroup, false);
        this.v = viewInflate;
        this.t = (CustomTitleBar) viewInflate.findViewById(R.id.device_tab_titlebar);
        this.x = (RelativeLayout) this.v.findViewById(R.id.pop_guide_tip);
        this.m = new rve(this.f25218a, this.v);
        ViewGroup viewGroup2 = (ViewGroup) this.v.findViewById(R.id.switch_device_layout);
        this.y = viewGroup2;
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.y.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: rnq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47507c.a(view);
                }
            });
        }
        HealthViewPager healthViewPager = (HealthViewPager) this.v.findViewById(R.id.hw_device_viewpager);
        this.ac = healthViewPager;
        healthViewPager.setIsScroll(false);
        this.ac.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.6
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                LogUtil.a("NewDeviceFragment", "mViewPager onPageSelected:", Integer.valueOf(i2));
                if (NewDeviceFragment.this.y == null) {
                    return;
                }
                NewDeviceFragment.this.c(i2);
                NewDeviceFragment.this.d(i2);
                lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010001.value(), NewDeviceFragment.this.e(i2), 0);
                if (i2 == 0) {
                    NewDeviceFragment.this.o();
                }
            }
        });
        y();
        c(0);
        q();
        l();
        tpe.b().a();
        rod.e().b(getActivity());
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> e(int i) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "Device_0001");
        map.put(FunctionSetBeanReader.BI_ELEMENT, i == this.l ? "device_tab" : "vmall_tab");
        map.put("moduleName", "device_window");
        map.put("event", 1);
        map.put("entrance", "e1");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int childCount = this.y.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.y.getChildAt(i2);
            childAt.setSelected(i2 == i);
            childAt.setElevation(i2 == i ? qrs.d((Context) this.n, 3.0f) : 0.0f);
            i2++;
        }
        this.o = i;
    }

    private void c(View view) {
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.device_tab_titlebar);
        this.t = customTitleBar;
        customTitleBar.setLeftButtonVisibility(8);
        this.t.setTitleText(view.getContext().getString(R.string.IDS_device_title_use));
        if (qqv.a(this.n)) {
            this.t.setTitleSize(this.n.getResources().getDimension(R.dimen.emui_master_title_2));
        } else {
            this.t.setTitleSize(this.n.getResources().getDimension(R.dimen.textSizeHeadline8));
        }
        if (qrs.ac()) {
            this.t.setTitleSize(view.getContext().getResources().getDimension(R.dimen.health_common_42dp));
        }
        this.t.setTitleBarBackgroundColor(this.n.getResources().getColor(R.color.colorSubBackground));
        this.t.setTitleTextColor(this.n.getResources().getColor(R.color.textColorPrimary));
        this.t.setRightButtonVisibility(0);
        this.t.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
        this.t.setRightButtonOnClickListener(new View.OnClickListener() { // from class: rnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.b(view2);
            }
        });
        d(this.t, true);
    }

    public /* synthetic */ void b(View view) {
        u();
    }

    public void d(CustomTitleBar customTitleBar, boolean z) {
        if (!ezi.d()) {
            LogUtil.a("NewDeviceFragment", "hide SearchIcon");
            return;
        }
        if (customTitleBar == null) {
            return;
        }
        LogUtil.a("NewDeviceFragment", "showSearchIcon");
        v();
        (z ? customTitleBar.getRightSoftKey() : customTitleBar.getRightThirdKey()).animate().cancel();
        if (z) {
            customTitleBar.setRightSoftkeyVisibility(0);
        } else {
            customTitleBar.setRightThirdKeyVisibility(0);
        }
    }

    private void v() {
        CustomTitleBar customTitleBar = this.t;
        if (customTitleBar == null) {
            LogUtil.j("NewDeviceFragment", "mDeviceTitleBar is null");
            return;
        }
        customTitleBar.setRightSoftkeyVisibility(8);
        qsp.c(this.t.getRightSoftKey(), 1.0f);
        this.t.setRightSoftkeyBackground(ContextCompat.getDrawable(this.n, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
        this.t.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: rnv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47511c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        gvi.a(this.n, 4002, 2, null);
        ezi.d(this.n, null, 4002);
    }

    private void u() {
        LogUtil.a("NewDeviceFragment", "enter showMoreItemPop mCurrentIndex：", Integer.valueOf(this.o));
        final LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0, getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add));
        linkedHashMap.put(1, getResources().getString(R.string.IDS_hw_device_manager_add_device));
        DeviceInfo deviceInfoD = lut.a().d();
        if (this.o == this.l && deviceInfoD != null && deviceInfoD.getProductType() != 275) {
            linkedHashMap.put(3, getResources().getString(R.string.IDS_device_wear_home_delete_device));
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.9
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("NewDeviceFragment", "enter showMoreItemPop run ui");
                    NewDeviceFragment.this.d((LinkedHashMap<Integer, String>) linkedHashMap);
                }
            });
        } else {
            d(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(LinkedHashMap<Integer, String> linkedHashMap) {
        LogUtil.a("NewDeviceFragment", "enter showPopView arrayMap.size:", Integer.valueOf(linkedHashMap.size()));
        if (!isAdded()) {
            LogUtil.j("NewDeviceFragment", "showPopView fragment is not Added");
            return;
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        new PopViewList(this.n, this.t, new ArrayList(linkedHashMap.values())).b(new PopViewList.PopViewClickListener() { // from class: rnt
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f47509b.d(arrayList, i);
            }
        });
    }

    public /* synthetic */ void d(ArrayList arrayList, int i) {
        int iIntValue = ((Integer) arrayList.get(i)).intValue();
        if (iIntValue == 0) {
            k();
            return;
        }
        if (iIntValue == 1) {
            rdp.b(this);
        } else {
            if (iIntValue != 3) {
                return;
            }
            rdt.e(1);
            this.k.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        t();
        c(this.v);
        if (this.n != null) {
            ThreadPoolManager.c().a("startEcologyDeviceNps", new Runnable() { // from class: rnj
                @Override // java.lang.Runnable
                public final void run() {
                    NewDeviceFragment.a();
                }
            });
        }
        new ssc().requestResource(new ResourceCallback() { // from class: rnu
            @Override // com.huawei.ui.homehealth.operation.ResourceCallback
            public final void obtainResource(sru sruVar) {
                this.f47510c.c((VmallResource) sruVar);
            }
        });
    }

    public static /* synthetic */ void a() {
        LogUtil.a("NewDeviceFragment", "startEcologyDeviceNps");
        HwNpsManager.getInstance().startEcologyDeviceNps();
    }

    public /* synthetic */ void c(VmallResource vmallResource) {
        if (vmallResource == null || !vmallResource.d()) {
            return;
        }
        if (rvr.e()) {
            if (this.w.getCount() < 2) {
                VMallFragment vMallFragment = new VMallFragment();
                this.aa = vMallFragment;
                this.w.c(vMallFragment);
                this.y.setVisibility(0);
                LogUtil.a("NewDeviceFragment", "requestResource initFloatButton");
                t();
                if (this.u) {
                    i();
                    return;
                }
                return;
            }
            return;
        }
        d(0);
        this.y.setVisibility(8);
    }

    public void h() {
        RelativeLayout relativeLayout = this.x;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        LogUtil.a("NewDeviceFragment", "enter showPopGuide");
        if (this.o == 0) {
            i();
            return;
        }
        h();
        this.x.findViewById(R.id.iv_step_close).setOnClickListener(new View.OnClickListener() { // from class: rni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47503b.e(view);
            }
        });
        this.x.setVisibility(0);
    }

    public /* synthetic */ void e(View view) {
        View childAt = this.y.getChildAt(0);
        if (childAt != null) {
            childAt.callOnClick();
        }
        this.o = 0;
        o();
    }

    private boolean p() {
        LogUtil.a("NewDeviceFragment", "enter hasDevice");
        if (!lut.a().f() && coq.d(lvl.d())) {
            return !coq.d(rtk.c());
        }
        return true;
    }

    public int f() {
        String sharedPreference = lvb.e().getSharedPreference("KEY_LAST_DEVICE_TAB");
        if (TextUtils.isEmpty(sharedPreference)) {
            if (!p()) {
                return 1;
            }
            LogUtil.a("NewDeviceFragment", "getTabFromCache hasDevice");
            return 0;
        }
        try {
            return Integer.parseInt(sharedPreference);
        } catch (NumberFormatException unused) {
            LogUtil.j("NewDeviceFragment", "getTabFromCache err");
            return 0;
        }
    }

    public void d(int i) {
        lvb.e().setSharedPreference("KEY_LAST_DEVICE_TAB", String.valueOf(i), null);
    }

    private void y() {
        this.k = new ArkuiDeviceFragment();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.k);
        this.y.setVisibility(8);
        this.ac.setPageTransformer(false, new HealthViewPager.PageTransformer() { // from class: rnk
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.PageTransformer
            public final void transformPage(View view, float f) {
                NewDeviceFragment.a(view, f);
            }
        });
        rom romVar = new rom(getChildFragmentManager(), arrayList);
        this.w = romVar;
        this.ac.setAdapter(romVar);
    }

    public static /* synthetic */ void a(View view, float f) {
        int width = view.getWidth();
        if (f <= -1.0f) {
            view.setAlpha(0.0f);
            view.setTranslationX(0.0f);
        } else if (f <= 0.0f) {
            view.setAlpha(1.0f + f);
            view.setTranslationX(width * (-f));
        } else if (f < 1.0f) {
            view.setAlpha(1.0f - f);
            view.setTranslationX(width * (-f));
        } else {
            view.setAlpha(0.0f);
            view.setTranslationX(0.0f);
        }
    }

    private void t() {
        if (this.v == null) {
            return;
        }
        int iF = f();
        ViewGroup viewGroup = this.y;
        this.l = viewGroup.indexOfChild(viewGroup.findViewById(R.id.switch_device));
        rom romVar = this.w;
        if (romVar == null || iF >= romVar.getCount()) {
            return;
        }
        this.o = iF;
        LogUtil.a("NewDeviceFragment", "initFloatButton mCurrentIndex:", Integer.valueOf(iF));
        this.ac.setCurrentItem(this.o, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        RelativeLayout relativeLayout = this.x;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        h();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        int iIndexOfChild = this.y.indexOfChild(view);
        if (iIndexOfChild == this.ac.getCurrentItem()) {
            return;
        }
        this.ac.setCurrentItem(iIndexOfChild, true);
        this.o = iIndexOfChild;
    }

    public void i() {
        if (this.m.e()) {
            LogUtil.j("NewDeviceFragment", "checkShowNewPageGuide isShowingGuideView");
            return;
        }
        RelativeLayout relativeLayout = this.x;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            LogUtil.j("NewDeviceFragment", "checkShowNewPageGuide mPopWindow.isShowing");
            return;
        }
        if (!this.u) {
            LogUtil.j("NewDeviceFragment", "checkShowNewPageGuide mIsUserVisible false");
        } else if (this.o == this.l) {
            a(0);
        } else {
            b(1);
        }
    }

    private void b(int i) {
        if (this.m.a(i)) {
            ArrayList arrayList = new ArrayList();
            View viewA = a(R.layout.page_device_guide_1, 1);
            viewA.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("NewDeviceFragment", "guide_1 click agree");
                    NewDeviceFragment.this.m.c();
                    rve rveVar = NewDeviceFragment.this.m;
                    rve unused = NewDeviceFragment.this.m;
                    rveVar.a("VMALL_GUIDE_VIEW_FLAG");
                    boolean zIsMinorAccount = LoginInit.getInstance(NewDeviceFragment.this.n).isMinorAccount();
                    LogUtil.a("NewDeviceFragment", "isMinorAccount = ", Boolean.valueOf(zIsMinorAccount));
                    if (zIsMinorAccount) {
                        return;
                    }
                    NewDeviceFragment.this.ab();
                }
            });
            arrayList.add(viewA);
            this.m.c(arrayList, i);
        }
    }

    public void a(int i) {
        if (this.m.a(i)) {
            DeviceInfo deviceInfoD = lut.a().d();
            ArrayList arrayList = new ArrayList();
            if (deviceInfoD != null) {
                if (deviceInfoD instanceof CloudDeviceInfo) {
                    if (this.r.d()) {
                        View viewA = a(R.layout.page_device_guide_5, 5);
                        ((HealthButton) viewA.findViewById(R.id.button)).setText(R.string.IDS_device_guide_btn2);
                        arrayList.add(viewA);
                    }
                } else {
                    arrayList.add(a(R.layout.page_device_guide_4, 4));
                    arrayList.add(a(R.layout.page_device_guide_5, 5));
                    arrayList.add(a(R.layout.page_device_guide_6, 6));
                    arrayList.add(a(R.layout.page_device_guide_7, 7));
                }
            } else if (this.r.d()) {
                arrayList.add(a(R.layout.page_device_guide_3, 3));
            }
            if (coq.d(arrayList)) {
                return;
            }
            ((View) arrayList.get(arrayList.size() - 1)).findViewById(R.id.button).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    rve rveVar = NewDeviceFragment.this.m;
                    rve unused = NewDeviceFragment.this.m;
                    rveVar.a("DEVICE_GUIDE_VIEW_FLAG");
                    rve rveVar2 = NewDeviceFragment.this.m;
                    rve unused2 = NewDeviceFragment.this.m;
                    rveVar2.a("VMALL_GUIDE_VIEW_FLAG");
                    NewDeviceFragment.this.m.c();
                }
            });
            this.m.c(arrayList, i);
        }
    }

    public View a(int i, int i2) {
        View viewInflate = LayoutInflater.from(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).inflate(i, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
        if (Utils.o()) {
            if (i2 == 1) {
                imageView.setImageResource(R.drawable.device_guide_en_1);
            }
            if (i2 == 3) {
                imageView.setImageResource(R.drawable.device_guide_en_3);
            }
            if (i2 == 4) {
                imageView.setImageResource(R.drawable.device_guide_en_4);
            }
            if (i2 == 5) {
                imageView.setImageResource(R.drawable.device_guide_en_5);
            }
            if (i2 == 6) {
                imageView.setImageResource(R.drawable.device_guide_en_6);
            }
            if (i2 == 7) {
                imageView.setImageResource(R.drawable.device_guide_en_7);
            }
        } else {
            if (i2 == 1) {
                imageView.setImageResource(R.drawable.device_guide_cn_1);
            }
            if (i2 == 3) {
                imageView.setImageResource(R.drawable.device_guide_cn_3);
            }
            if (i2 == 4) {
                imageView.setImageResource(R.drawable.device_guide_cn_4);
            }
            if (i2 == 5) {
                imageView.setImageResource(R.drawable.device_guide_cn_5);
            }
            if (i2 == 6) {
                imageView.setImageResource(R.drawable.device_guide_cn_6);
            }
            if (i2 == 7) {
                imageView.setImageResource(R.drawable.device_guide_cn_7);
            }
        }
        viewInflate.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NewDeviceFragment.this.m.d();
            }
        });
        return viewInflate;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        ArkuiDeviceFragment arkuiDeviceFragment = this.k;
        if (arkuiDeviceFragment != null) {
            arkuiDeviceFragment.setUserVisibleHint(z);
        }
        VMallFragment vMallFragment = this.aa;
        if (vMallFragment != null) {
            vMallFragment.setUserVisibleHint(z && this.o == this.z);
        }
        this.u = z;
        if (z) {
            ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", 8);
            ad();
            n();
            qrs.c((Context) getActivity(), 3);
            if (this.f) {
                HandlerCenter.a().d(new Runnable() { // from class: rns
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewDeviceFragment.e();
                    }
                }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                this.f = false;
            }
        }
        if (rvr.e()) {
            e(z);
        }
        if (!z && DeviceFloatMenuUtils.f25334c) {
            DeviceFloatMenuUtils.b(this.f25218a);
        }
        t();
        LogUtil.a("NewDeviceFragment", "setUserVisibleHint mIsUserVisible:", Boolean.valueOf(this.u), " mCurrentIndex:", Integer.valueOf(this.o));
        if (!z || this.f25218a == null) {
            return;
        }
        if (this.o == this.l) {
            x();
        } else {
            i();
        }
    }

    public static /* synthetic */ void e() {
        if (SecurityChecker.e()) {
            ReleaseLogUtil.a("NewDeviceFragment", "App is error");
            System.exit(0);
        }
    }

    private void x() {
        if (this.m.a(0)) {
            DeviceInfo deviceInfoD = lut.a().d();
            if ((deviceInfoD != null && !(deviceInfoD instanceof CloudDeviceInfo)) || this.r.d()) {
                LogUtil.a("NewDeviceFragment", "onVisibleCheckDeviceGuide checkShowNewPageGuide");
                i();
                DeviceProtectViewModel.DeviceListUpdateCallback deviceListUpdateCallback = this.h;
                if (deviceListUpdateCallback != null) {
                    this.q.d(deviceListUpdateCallback);
                    return;
                }
                return;
            }
            if (this.h == null) {
                this.h = new DeviceProtectViewModel.DeviceListUpdateCallback() { // from class: rnp
                    @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.DeviceListUpdateCallback
                    public final void onDeviceListUpdate(List list) {
                        this.f47506b.b(list);
                    }
                };
            }
            LogUtil.a("NewDeviceFragment", "onVisibleCheckDeviceGuide registerDeviceListUpdate");
            this.q.e(this.h);
        }
    }

    public /* synthetic */ void b(List list) {
        this.q.d(this.h);
        this.f25218a.runOnUiThread(new Runnable() { // from class: rnr
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m();
            }
        });
    }

    public /* synthetic */ void m() {
        LogUtil.a("NewDeviceFragment", "onVisibleCheckDeviceGuide mIsUserVisible:", Boolean.valueOf(this.u), " mCurrentIndex:", Integer.valueOf(this.o));
        if (this.o == this.l && BaseApplication.j() == this.f25218a && this.u) {
            i();
        }
    }

    private void n() {
        LogUtil.a("NewDeviceFragment", "getCloudDeviceData");
        if (this.p != null && !efl.c()) {
            LogUtil.j("NewDeviceFragment", "getCloudDeviceData not need update");
            return;
        }
        dmp.d().e();
        if (this.p == null) {
            this.p = new DownloadCloudDeviceManager();
        }
        this.p.b(new DownloadCloudDeviceManager.DeviceDataCallback() { // from class: rnl
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.DeviceDataCallback
            public final void deviceResourceCallbackResult(boolean z) {
                NewDeviceFragment.b(z);
            }
        });
    }

    public static /* synthetic */ void b(boolean z) {
        LogUtil.a("NewDeviceFragment", "syncDeviceInfoFromProfileCloud CallbackResult isSuccess = ", Boolean.valueOf(z));
        if (z) {
            lut.a().o();
        }
    }

    private void e(boolean z) {
        rom romVar;
        if (this.y == null || (romVar = this.w) == null || romVar.getCount() <= 1) {
            return;
        }
        this.y.setVisibility(z ? 0 : 4);
    }

    private void k() {
        SimpleChain.b("dealScanEntrance").e(new SimpleChain.INext() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.2
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public void onNext(final SimpleChain.Emitter emitter, Object... objArr) {
                LoginInit.getInstance(NewDeviceFragment.this.n).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.2.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            emitter.onSuccess(new Object[0]);
                            return;
                        }
                        emitter.onError("browsingToLogin errorCode:" + i);
                    }
                }, "");
            }
        }).e(new SimpleChain.INext() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.13
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public void onNext(final SimpleChain.Emitter emitter, Object... objArr) {
                PermissionUtil.d(NewDeviceFragment.this.n, PermissionUtil.PermissionType.CAMERA, new CustomPermissionAction(NewDeviceFragment.this.n) { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.13.3
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("NewDeviceFragment", "initQrCodeAction() mQrCodeAction onGranted");
                        emitter.onSuccess(new Object[0]);
                    }

                    @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                        super.onForeverDenied(permissionType);
                        LogUtil.a("NewDeviceFragment", "initQrCodeAction() mQrCodeAction onForeverDenied");
                        emitter.onError("doActionWithPermissions CAMERA onForeverDenied");
                    }
                });
            }
        }).d(new SimpleChain.Emitter() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.14
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onSuccess(Object... objArr) {
                rtk.d(NewDeviceFragment.this.n, new Intent(NewDeviceFragment.this.n, (Class<?>) QrCodeScanningActivity.class), "QrCodeScanningActivity");
            }
        }, new Object[0]);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (f() != this.o) {
            t();
        }
        if (this.u && this.s.h()) {
            this.ac.setCurrentItem(this.l, false);
        }
        rtk.c(true);
        ad();
        r();
        LogUtil.a("NewDeviceFragment", "onResume mIsUserVisible:", Boolean.valueOf(this.u), " mCurrentIndex:", Integer.valueOf(this.o));
        if (this.u) {
            n();
            if (this.o == this.l) {
                DeviceInfo deviceInfoD = lut.a().d();
                if (deviceInfoD != null && deviceInfoD.getDeviceConnectState() == 2) {
                    i();
                } else {
                    w();
                }
            }
            qrs.c((Context) getActivity(), 3);
        }
    }

    private void w() {
        if (this.m.a(0)) {
            ThreadPoolManager.c().a("checkShowNewDeviceGuide", new Runnable() { // from class: rno
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47505b.j();
                }
            });
        }
    }

    public /* synthetic */ void j() {
        if (coq.d(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "NewDeviceFragment"))) {
            LogUtil.j("NewDeviceFragment", "onResumeShowNewDeviceGuide getWearDevices deviceInfos isEmpty");
        } else {
            this.f25218a.runOnUiThread(new Runnable() { // from class: rnn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47504b.g();
                }
            });
        }
    }

    public /* synthetic */ void g() {
        LogUtil.a("NewDeviceFragment", "onResumeShowNewDeviceGuide mIsUserVisible:", Boolean.valueOf(this.u), " mCurrentIndex:", Integer.valueOf(this.o));
        if (this.o == this.l && BaseApplication.j() == this.f25218a && this.u) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (!this.g) {
            this.g = this.j.e();
        }
        if (this.i) {
            return;
        }
        final WeakReference weakReference = new WeakReference(this);
        this.j.e(new BaseResponseCallback() { // from class: rny
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                NewDeviceFragment.c(weakReference, i, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void c(WeakReference weakReference, int i, Boolean bool) {
        ReleaseLogUtil.d("R_NewDeviceFragment", "syncCloudDevice deviceResourceCallback:", bool);
        if (bool.booleanValue()) {
            lss.a((NewDeviceFragment) weakReference.get(), new Consumer() { // from class: rnm
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((NewDeviceFragment) obj).s();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.i = true;
        lut.a().o();
        SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        rtk.c(false);
    }

    private void r() {
        ExecutorService executorService = this.f25219b;
        if (executorService == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.1
            @Override // java.lang.Runnable
            public void run() {
                if (CommonUtil.ck() && tfi.h(NewDeviceFragment.this.n) && rtk.h() && tfi.l(NewDeviceFragment.this.n)) {
                    NewDeviceFragment.this.b();
                }
                if (CloudUtils.a()) {
                    NewDeviceFragment.ac();
                }
            }
        });
    }

    protected void b() {
        LogUtil.a("NewDeviceFragment", "autoScanDevice");
        if (this.f25220c == null) {
            this.f25220c = new CompatibilityInteractor();
        }
        this.f25220c.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("NewDeviceFragment", "start auto scan begin:", Integer.valueOf(i), " objectData:", obj);
                if (i == 0 && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    LogUtil.a("NewDeviceFragment", "start auto scan device");
                    NewDeviceFragment.this.aa();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        ThreadPoolManager.c().a("NewDeviceFragment", new Runnable() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.3
            @Override // java.lang.Runnable
            public void run() {
                qum.b().d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac() {
        LogUtil.a("NewDeviceFragment", "syncSampleConfig enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        z();
    }

    private void q() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        BroadcastManagerUtil.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.e, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.NewDeviceFragment.8
            @Override // java.lang.Runnable
            public void run() {
                boolean zHasLoginAccount;
                if (!CommonUtil.z(NewDeviceFragment.this.f25218a)) {
                    zHasLoginAccount = HuaweiLoginManager.hasLoginAccount(NewDeviceFragment.this.f25218a);
                } else {
                    String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
                    LogUtil.a("NewDeviceFragment", "registerLoginStatusReceiver logoutFlag ", logoutFlag);
                    zHasLoginAccount = "false".equals(logoutFlag);
                }
                LogUtil.a("NewDeviceFragment", "registerLoginStatusReceiver isLogin ", Boolean.valueOf(zHasLoginAccount));
                if (zHasLoginAccount) {
                    rtk.e(lut.a().j());
                }
            }
        });
    }

    private void z() {
        BroadcastManagerUtil.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.e);
        tpe.b().c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        health.compact.a.LogUtil.b("NewDeviceFragment", "Enter onActivityResult requestcode:", Integer.valueOf(i), ";resultcode:", Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        this.k.onActivityResult(i, i2, intent);
    }
}
