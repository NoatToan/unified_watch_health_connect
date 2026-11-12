package com.huawei.ui.homehealth.runcard.trackfragments;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.loader.app.LoaderManager;
import androidx.media3.common.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.association.AssociationDialog;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.knit.AdvancedSportFragment;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicInteratorService;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LoginResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.NewMedalTabDataBean;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.floatview.DragFloatActionButton;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.subtab.HealthSubTabPagerAdapter;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.view.RedPointImageView;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity;
import com.huawei.ui.homehealth.runcard.trackfragments.viewmodel.SportViewModel;
import com.huawei.ui.homewear21.aw70.Aw70ModeSelectActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.buh;
import defpackage.etv;
import defpackage.ezi;
import defpackage.fhz;
import defpackage.fxl;
import defpackage.gvi;
import defpackage.ien;
import defpackage.ifm;
import defpackage.iov;
import defpackage.ive;
import defpackage.iws;
import defpackage.iyd;
import defpackage.izs;
import defpackage.jwz;
import defpackage.lmf;
import defpackage.mgi;
import defpackage.njy;
import defpackage.ozc;
import defpackage.ppt;
import defpackage.qkz;
import defpackage.qle;
import defpackage.qpm;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qso;
import defpackage.qsp;
import defpackage.rdp;
import defpackage.swg;
import defpackage.szj;
import defpackage.szl;
import defpackage.tfg;
import defpackage.tfi;
import defpackage.ucq;
import defpackage.ucr;
import defpackage.vqt;
import defpackage.xfz;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HEXUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class SportEntranceFragment extends BaseFragment {
    private HealthSubHeader ab;
    private boolean ae;
    private boolean am;
    private KnitFragment ao;
    private KnitFragment ap;
    private KnitFragment aq;
    private KnitFragment ar;
    private View au;
    private RedPointImageView av;
    private KnitFragment aw;
    private HealthFlowLayout ax;
    private LinearLayout ay;
    private HealthTextView az;
    private Activity bc;
    private qpm bf;
    private KnitFragment bh;
    private String bi;
    private View bj;
    private KnitFragment bl;
    private ImageView bm;
    private int bn;
    private HealthSearchView bp;
    private Map<String, ArrayList<MedalInfoDesc>> bq;
    private String bt;
    private LinearLayout bu;
    private String bv;
    private LinearLayout bw;
    private View bx;
    private HealthNativeViewPager by;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f25909c;
    private SportViewModel ca;
    private HealthSubTabPagerAdapter cd;
    private ViewStub ce;
    private View cf;
    private HealthSubTabWidget cg;
    private RelativeLayout ch;
    private UserLabelServiceApi ci;
    private ViewStub cj;
    private String ck;
    private View cl;
    private ViewGroup cm;
    private KnitFragment cp;
    private KnitFragment cq;
    private AssociationDialog d;
    private String e;
    private ViewStub i;
    private HealthColumnSystem k;
    private HealthTextView l;
    private HealthTextView n;
    private ImageView o;
    private LinearLayout q;
    private HealthTextView r;
    private InputBoxTemplate s;
    private Context t;
    private ucr u;
    private szj v;
    private DragFloatActionButton x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25908b = false;
    private int h = 1;
    private int p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25907a = "";
    private a ad = new a(Looper.getMainLooper(), this);
    private int bs = 500001;
    private boolean ah = true;
    private boolean ac = false;
    private boolean z = false;
    private int br = -1;
    private ArrayList<qpm> w = new ArrayList<>();
    private List<qpm> j = new ArrayList();
    private boolean an = false;
    private boolean as = false;
    private boolean aj = false;
    private boolean aa = false;
    private String at = Integer.toString(20002);
    private StorageParams cb = new StorageParams();
    private boolean ak = true;
    private boolean ag = true;
    private boolean af = true;
    private int m = 0;
    private boolean ai = false;
    private SparseBooleanArray bk = new SparseBooleanArray();
    private PermissionsResultAction be = null;
    private boolean al = false;
    private Map<Integer, String> bo = new HashMap();
    private SparseArray<Integer> bz = new SparseArray<>();
    private ArrayList<String> g = new ArrayList<>(16);
    private UiCallback y = new UiCallback<String>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.2
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                String strE = buh.e("coachGenderConfig");
                if (!TextUtils.isEmpty(strE)) {
                    if (CommonUtil.j(str) != CommonUtil.j(strE)) {
                        SportEntranceFragment.this.j();
                    }
                }
                LogUtil.b("Track_SportEntranceFragment", "coach UiCallback onSuccess");
                buh.d("coachGenderConfig", str);
                return;
            }
            LogUtil.e("Track_SportEntranceFragment", "coach UiCallback some error");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            SportEntranceFragment.this.l();
        }
    };
    private final BroadcastReceiver bb = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.13
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || "com.huawei.bone.action.DEVICE_THIRD_DELETE".equals(intent.getAction())) {
                LogUtil.b("Track_SportEntranceFragment", "ACTION_CONNECTION_STATE_CHANGED or ACTION_DEVICE_THIRD_DELETE");
                if (SportEntranceFragment.this.ad != null) {
                    SportEntranceFragment.this.ad.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.13.2
                        @Override // java.lang.Runnable
                        public void run() {
                            SportEntranceFragment.this.az();
                        }
                    }, 2000L);
                } else {
                    LogUtil.e("Track_SportEntranceFragment", "onReceive: handler is null");
                }
            }
        }
    };
    private Observer<ArrayList<qpm>> cc = new Observer<ArrayList<qpm>>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.21
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ArrayList<qpm> arrayList) {
            SportEntranceFragment.this.b(arrayList);
        }
    };
    private ViewPager.OnPageChangeListener ba = new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.22
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            ReleaseLogUtil.c("Track_SportEntranceFragment", "sport page been selected, position: ", Integer.valueOf(i));
            HashMap map = new HashMap(10);
            SportEntranceFragment.this.d("onPageSelected");
            SportEntranceFragment sportEntranceFragment = SportEntranceFragment.this;
            sportEntranceFragment.c(sportEntranceFragment.w, i, map);
            if (njy.c(SportEntranceFragment.this.w, i) && ((qpm) SportEntranceFragment.this.w.get(i)).c() != SportEntranceFragment.this.br) {
                SportEntranceFragment.this.c();
                SportEntranceFragment sportEntranceFragment2 = SportEntranceFragment.this;
                sportEntranceFragment2.br = ((qpm) sportEntranceFragment2.w.get(i)).c();
            }
            SportEntranceFragment.this.bc();
            SportEntranceFragment.this.b(map);
            if (SportEntranceFragment.this.bs != 10001 || !SportEntranceFragment.this.as) {
                ucq.d(SportEntranceFragment.this.u, 8);
            } else {
                ucq.d(SportEntranceFragment.this.u, 0);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                LogUtil.b("Track_SportEntranceFragment", "ViewPager Scroll state idle");
            } else {
                if (i != 1) {
                    return;
                }
                LogUtil.b("Track_SportEntranceFragment", "ViewPager Scroll state dragging");
            }
        }
    };
    private final com.huawei.haf.design.pattern.Observer bd = new com.huawei.haf.design.pattern.Observer() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.23
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            int iIntValue;
            if (SportEntranceFragment.this.am && "PLAN_FRAGMENT_SCROLL".equals(str) && objArr != null && objArr.length >= 4 && (objArr[0] instanceof ViewGroup) && (objArr[1] instanceof ViewGroup) && (objArr[2] instanceof RecyclerView)) {
                Object obj = objArr[3];
                if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) != 0) {
                    if (iIntValue <= 0 || !SportEntranceFragment.this.al) {
                        if (iIntValue >= 0 || SportEntranceFragment.this.al) {
                            ViewGroup viewGroup = (ViewGroup) objArr[0];
                            ViewGroup viewGroup2 = (ViewGroup) objArr[1];
                            RecyclerView recyclerView = (RecyclerView) objArr[2];
                            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                            SportEntranceFragment.this.ap();
                            if (SportEntranceFragment.this.bn > 0 && iComputeVerticalScrollOffset >= SportEntranceFragment.this.bn && !SportEntranceFragment.this.al && ezi.b(iComputeVerticalScrollOffset, recyclerView.getHeight(), ezi.b(recyclerView))) {
                                SportEntranceFragment.this.u();
                            }
                            if (iComputeVerticalScrollOffset > 0 || !SportEntranceFragment.this.al) {
                                return;
                            }
                            ezi.c(SportEntranceFragment.this.bj);
                            ViewGroup[] viewGroupArr = {SportEntranceFragment.this.cm, viewGroup, viewGroup2};
                            LayoutTransition[] layoutTransitionArrB = ezi.b(viewGroupArr);
                            ezi.d(SportEntranceFragment.this.bp);
                            ezi.a(SportEntranceFragment.this.bm, 8);
                            ezi.c(SportEntranceFragment.this.ad, viewGroupArr, layoutTransitionArrB);
                            SportEntranceFragment.this.al = false;
                        }
                    }
                }
            }
        }
    };
    private final Observer<qpm> f = new Observer() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment$$ExternalSyntheticLambda4
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.e.c((qpm) obj);
        }
    };
    private final Observer<qpm> bg = new Observer() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment$$ExternalSyntheticLambda5
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f25910b.d((qpm) obj);
        }
    };

    /* JADX INFO: loaded from: classes3.dex */
    public interface SportEntranceCallback {
        void onSportEntranceCallback();
    }

    public boolean d(int i) {
        return i == 300 || i == 400 || i == 100;
    }

    public void c() {
        if (SportSupportUtil.g(this.bs)) {
            Integer num = this.bz.get(this.bs, -1);
            int iIntValue = num.intValue();
            if (njy.e(this.w, iIntValue)) {
                LogUtil.d("Track_SportEntranceFragment", "onSelfPageSelected failed, cause mSportType = ", Integer.valueOf(this.bs), " not found in tabs!");
                return;
            }
            LogUtil.b("Track_SportEntranceFragment", "onSelfPageSelected mSportType = ", Integer.valueOf(this.bs), ", pos = ", num);
            Fragment fragmentD = this.w.get(iIntValue).d();
            KnitFragment knitFragment = fragmentD instanceof KnitFragment ? (KnitFragment) fragmentD : null;
            if (knitFragment != null) {
                knitFragment.onSelfShow();
            }
        }
    }

    private void bh() {
        ReleaseLogUtil.c("Track_SportEntranceFragment", "enter showAssociationDialog");
        if (ah()) {
            ReleaseLogUtil.c("Track_SportEntranceFragment", "AssociationDialog is already showing");
            return;
        }
        List<SportEventAssociator.c> listB = SportEventAssociator.b(HwExerciseConstants.MATCHED_COMPETITION);
        if (njy.e(listB) || !ai()) {
            return;
        }
        AssociationDialog associationDialog = new AssociationDialog(this.t, listB);
        this.d = associationDialog;
        associationDialog.show();
    }

    private boolean ah() {
        AssociationDialog associationDialog = this.d;
        return associationDialog != null && associationDialog.isShowing();
    }

    private boolean ai() {
        Activity activity = this.bc;
        return (activity == null || activity.isFinishing() || this.bc.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ArrayList<qpm> arrayList) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final List<qpm> listE = e(arrayList);
        if (njy.e(listE)) {
            g(arrayList);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sye
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48800a.d(listE, arrayList, jElapsedRealtime);
                }
            });
        }
    }

    public /* synthetic */ void d(List list, ArrayList arrayList, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                qpm qpmVar = (qpm) it.next();
                String strF = qpmVar.f();
                String strI = qpmVar.i();
                qpmVar.c(qqf.b(BaseApplication.getContext(), strF));
                qpmVar.d(qqf.b(BaseApplication.getContext(), strI));
                countDownLatch.countDown();
            } catch (Throwable th) {
                LogUtil.d("Track_SportEntranceFragment", "load tab img async failed, time is out!");
                throw th;
            }
        }
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.d("Track_SportEntranceFragment", "load tab img async failed, time is out!");
            }
        } catch (InterruptedException unused) {
            LogUtil.d("Track_SportEntranceFragment", "load tab img async is interrupted!");
            LogUtil.d("Track_SportEntranceFragment", "load tab img async failed, time is out!");
        }
        g((ArrayList<qpm>) arrayList);
        ReleaseLogUtil.c("Track_SportEntranceFragment", "loadTabImgAsync finished, time cost: " + (SystemClock.elapsedRealtime() - j));
    }

    private void g(final ArrayList<qpm> arrayList) {
        a aVar = this.ad;
        if (aVar == null) {
            LogUtil.d("Track_SportEntranceFragment", "SportEntranceFragment has been destroyed!");
        } else {
            aVar.post(new Runnable() { // from class: syf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48803c.d(arrayList);
                }
            });
        }
    }

    public /* synthetic */ void d(ArrayList arrayList) {
        c((ArrayList<qpm>) arrayList);
    }

    private List<qpm> e(ArrayList<qpm> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(arrayList)) {
            ReleaseLogUtil.d("Track_SportEntranceFragment", "extractImgSubTabPagerBeans fragmentSubTabPagerBeans isEmpty");
            return arrayList2;
        }
        for (qpm qpmVar : arrayList) {
            String strF = qpmVar.f();
            String strI = qpmVar.i();
            if (!TextUtils.isEmpty(strF) || !TextUtils.isEmpty(strI)) {
                arrayList2.add(qpmVar);
            }
        }
        return arrayList2;
    }

    private void c(ArrayList<qpm> arrayList) {
        int iIntValue;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.b("Track_SportEntranceFragment", "onChanged fragmentSubTabPagerBeans size: ", Integer.valueOf(arrayList == null ? -1 : arrayList.size()));
        if (this.cd == null) {
            LogUtil.e("Track_SportEntranceFragment", "mSubTabAdapter is null");
            return;
        }
        if (j(arrayList)) {
            LogUtil.b("Track_SportEntranceFragment", "restoreAllFragments success");
            return;
        }
        this.bf = null;
        boolean zE = njy.e(this.w);
        b((List<qpm>) arrayList);
        bq();
        if (this.af) {
            Integer num = this.bz.get(this.bs);
            if (num == null) {
                LogUtil.e("Track_SportEntranceFragment", "no index for mSportType = ", Integer.valueOf(this.bs));
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            this.cd.a(this.w, iIntValue);
        }
        v();
        this.by.setOffscreenPageLimit(this.w.size() - 1);
        d(this.w, zE);
        ba();
        this.af = false;
        ReleaseLogUtil.c("Track_SportEntranceFragment", "handleTabObserver finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private HashSet<Integer> d(List<qpm> list) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (qpm qpmVar : list) {
            if (qpmVar != null) {
                hashSet.add(Integer.valueOf(qpmVar.c()));
            }
        }
        return hashSet;
    }

    public SportEntranceFragment() {
        FitnessSessionManager.b().d(swg.d().a());
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        SportViewModel sportViewModel = (SportViewModel) new ViewModelProvider(this).get(SportViewModel.class);
        this.ca = sportViewModel;
        sportViewModel.d(this, this.f);
        this.ca.e(this, this.bg);
        this.ca.c(getContext());
        szj szjVarB = szj.b();
        this.v = szjVarB;
        szjVarB.e();
        UserLabelServiceApi userLabelServiceApi = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        this.ci = userLabelServiceApi;
        userLabelServiceApi.registerCallback(2);
        iws.e();
        if (fhz.d() != null) {
            ReleaseLogUtil.c("Track_SportEntranceFragment", "getInstance of Mediator success");
        }
        ReleaseLogUtil.c("Track_SportEntranceFragment", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ba() {
        qpm qpmVar;
        if (njy.b(this.w) && (qpmVar = this.w.get(0)) != null && this.bs == qpmVar.c()) {
            HashMap map = new HashMap(2);
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.bs));
            b(map);
        }
    }

    public void b() {
        LogUtil.b("Track_SportEntranceFragment", "updateMap");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (layoutInflater == null) {
            LogUtil.b("Track_SportEntranceFragment", "onCreateView return, inflater is null");
            return null;
        }
        this.t = getContext();
        this.bc = getActivity();
        if (CommonUtil.ck()) {
            ar();
        }
        as();
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.t, 1);
        this.k = healthColumnSystem;
        this.m = healthColumnSystem.j();
        this.bj = layoutInflater.inflate(R.layout.layout_frag_track_entrance_sport, viewGroup, false);
        ive.c().init(BaseApplication.getContext());
        if (this.ah && this.aa) {
            w();
        }
        this.ca.h();
        ReleaseLogUtil.c("Track_SportEntranceFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return this.bj;
    }

    private void w() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f();
        if (this.ad == null) {
            this.ad = new a(Looper.getMainLooper(), this);
        }
        y();
        d(this.bj);
        if (!Utils.i()) {
            new tfg().e(this.bc);
        }
        this.ah = false;
        this.aj = false;
        ReleaseLogUtil.c("Track_SportEntranceFragment", "initAll finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ar() {
        LogUtil.b("Track_SportEntranceFragment", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_THIRD_DELETE");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.bb, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void bm() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.bb);
        } catch (IllegalArgumentException e2) {
            LogUtil.d("Track_SportEntranceFragment", "unRegisterNonLocalBroadcastReceiver Exception: ", e2.getMessage());
        }
    }

    static class b extends BroadcastReceiver {
        private WeakReference<SportEntranceFragment> d;

        b(SportEntranceFragment sportEntranceFragment) {
            this.d = new WeakReference<>(sportEntranceFragment);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.b("Track_SportEntranceFragment", "receive account broadcast");
            if (context == null || intent == null) {
                ReleaseLogUtil.d("Track_SportEntranceFragment", "AccountBroadcastReceiver context == null || intent == null");
                return;
            }
            SportEntranceFragment sportEntranceFragment = this.d.get();
            if (sportEntranceFragment == null) {
                LogUtil.e("Track_SportEntranceFragment", "sportEntranceFragment null");
            } else if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                ReleaseLogUtil.c("Track_SportEntranceFragment", "AccountBroadcastReceiver receive account broadcast");
                if (sportEntranceFragment.ad != null) {
                    sportEntranceFragment.ad.sendEmptyMessage(100);
                }
                sportEntranceFragment.bj();
            }
        }
    }

    private void as() {
        if (VersionControlUtil.isSupportOperationAccount()) {
            return;
        }
        this.f25909c = new b(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.f25909c, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        if (this.f25909c != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f25909c);
            this.f25909c = null;
        }
    }

    private void bf() {
        boolean zL = LanguageUtil.l(this.t);
        boolean zO = Utils.o();
        LogUtil.b("Track_SportEntranceFragment", "Utils.isOversea()", Boolean.valueOf(zO), "  isChineseSimplifiedLocal", Boolean.valueOf(zL));
        if (zO || !zL) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10005), "health_time_first_in");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        boolean zE = tfi.e(strE);
        boolean zO2 = tfi.o(this.t);
        LogUtil.b("Track_SportEntranceFragment", "showPlanTip = ", Boolean.valueOf(zO2), "  isDiffDate", Boolean.valueOf(zE));
        if (zO2 || !zE) {
            return;
        }
        View viewInflate = View.inflate(this.t, R.layout.sport_entrance_tips, null);
        viewInflate.measure(0, 0);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        Context context = this.t;
        if (!(context instanceof Activity)) {
            LogUtil.b("Track_SportEntranceFragment", "showPlanTip mContext is not instanceof Activity");
        } else {
            if (((Activity) context).isDestroyed() || ((Activity) this.t).isFinishing()) {
                return;
            }
            LogUtil.b("Track_SportEntranceFragment", "PopupWindow = show");
            popupWindow.showAtLocation(this.bj, 0, qrs.d(this.t, 50.0f), qrs.d(this.t, 66.0f));
            tfi.b(this.t, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final qpm qpmVar) {
        a aVar = this.ad;
        if (aVar == null) {
            return;
        }
        aVar.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.28
            @Override // java.lang.Runnable
            public void run() {
                if (qpmVar != null && SportEntranceFragment.this.cd != null) {
                    if (SportEntranceFragment.this.bz.get(qpmVar.c()) == null) {
                        SportEntranceFragment.this.w.add(qpmVar);
                        SportEntranceFragment.this.bq();
                        boolean z = SportEntranceFragment.this.bs == qpmVar.c();
                        String strG = qpmVar.g();
                        if (SportEntranceFragment.this.cg != null) {
                            SportEntranceFragment.this.cd.c(SportEntranceFragment.this.cg.b(strG), qpmVar, z);
                        }
                        LogUtil.b("Track_SportEntranceFragment", "addTab");
                        return;
                    }
                    LogUtil.b("Track_SportEntranceFragment", "already add current bean");
                    return;
                }
                LogUtil.b("Track_SportEntranceFragment", "no need to addTab");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final qpm qpmVar) {
        a aVar = this.ad;
        if (aVar == null) {
            return;
        }
        aVar.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.30
            @Override // java.lang.Runnable
            public void run() {
                if (qpmVar == null || SportEntranceFragment.this.cd == null) {
                    LogUtil.b("Track_SportEntranceFragment", "no need to removeTab");
                    return;
                }
                int iC = qpmVar.c();
                if (SportEntranceFragment.this.bz.get(iC) != null) {
                    for (int i = 0; i < SportEntranceFragment.this.w.size(); i++) {
                        qpm qpmVar2 = (qpm) SportEntranceFragment.this.w.get(i);
                        if (qpmVar2 != null && iC == qpmVar2.c()) {
                            SportEntranceFragment.this.w.remove(i);
                            SportEntranceFragment.this.bq();
                            SportEntranceFragment.this.cd.e(iC);
                            LogUtil.b("Track_SportEntranceFragment", "removeTab: ", Integer.valueOf(iC));
                            return;
                        }
                    }
                    return;
                }
                LogUtil.b("Track_SportEntranceFragment", "already remove current bean");
            }
        });
    }

    private void y() {
        d("initData");
        int iF = tfi.f(this.t);
        this.bs = iF;
        if (iF == 0) {
            this.bs = Utils.o() ? 258 : 500001;
        }
    }

    private void d(View view) {
        if (view == null) {
            LogUtil.e("Track_SportEntranceFragment", "initView mRootView null");
            return;
        }
        LogUtil.b("Track_SportEntranceFragment", "initView");
        View viewFindViewById = view.findViewById(R.id.more_and_red_point);
        if (this.u == null) {
            this.u = ucq.c(getActivity(), viewFindViewById, 0);
        }
        this.k.b(getContext());
        this.m = this.k.j();
        this.bx = view.findViewById(R.id.statusbar_panel_view);
        this.ay = (LinearLayout) view.findViewById(R.id.more_sport_window);
        this.ab = (HealthSubHeader) view.findViewById(R.id.all_sport_type);
        this.o = (ImageView) view.findViewById(R.id.more_sport_close);
        this.ax = (HealthFlowLayout) view.findViewById(R.id.more_sport_flow_layout);
        this.az = (HealthTextView) view.findViewById(R.id.more_sport_tips);
        this.ab.setSubHeaderBackgroundColor(this.t.getResources().getColor(R.color.colorSubBackground));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sport_help_layout);
        this.bw = linearLayout;
        linearLayout.setVisibility(8);
        HealthSearchView healthSearchView = (HealthSearchView) this.bj.findViewById(R.id.sport_global_search_view);
        this.bp = healthSearchView;
        qrs.f(healthSearchView);
        this.bm = (ImageView) this.bj.findViewById(R.id.sport_search_icon);
        a(view);
        b(view);
        be();
        e(view);
        this.cm = (ViewGroup) view.findViewById(R.id.sport_viewPager_container);
        HealthNativeViewPager healthNativeViewPager = (HealthNativeViewPager) view.findViewById(R.id.viewPager_sport);
        this.by = healthNativeViewPager;
        healthNativeViewPager.clearOnPageChangeListeners();
        this.by.addOnPageChangeListener(this.ba);
        HealthSubTabPagerAdapter healthSubTabPagerAdapter = this.cd;
        if (healthSubTabPagerAdapter != null) {
            healthSubTabPagerAdapter.a();
        }
        if (this.cg != null) {
            this.cd = new HealthSubTabPagerAdapter(getChildFragmentManager(), this.by, this.cg);
        }
        ak();
        if (this.bs == 264) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.29
                @Override // java.lang.Runnable
                public void run() {
                    tfi.h(SportEntranceFragment.this.t, SportEntranceFragment.this.bs);
                }
            });
        }
        if (LanguageUtil.ba(getContext())) {
            this.by.setRotationY(180.0f);
        }
        this.ca.a();
        this.ca.c(this, this.cc);
        this.ca.i();
        b(this.ca.e());
        if (ezi.d()) {
            ab();
        } else {
            this.am = false;
            qsp.c((View) this.bp, 8);
        }
    }

    public void a(LinearLayout linearLayout) {
        this.q = linearLayout;
    }

    private void ab() {
        HealthSearchView healthSearchView = this.bp;
        if (healthSearchView == null) {
            return;
        }
        qsp.c((View) healthSearchView, 0);
        ao();
        aa();
        this.bp.setInputType(0);
        this.bp.setIconifiedByDefault(false);
        this.am = true;
        ezi.c(this.bp);
        ezi.a(this.bp, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int iQ = SportEntranceFragment.this.q();
                gvi.a(SportEntranceFragment.this.t, iQ, 2, SportEntranceFragment.this.s);
                ezi.d(SportEntranceFragment.this.t, SportEntranceFragment.this.s, iQ);
            }
        });
        if (ezi.a()) {
            return;
        }
        ezi.c(this.ad, q());
    }

    private void aa() {
        ImageView imageView = this.bm;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int iQ = SportEntranceFragment.this.q();
                gvi.a(SportEntranceFragment.this.t, iQ, 2, SportEntranceFragment.this.s);
                ezi.d(SportEntranceFragment.this.t, SportEntranceFragment.this.s, iQ);
            }
        });
    }

    private ScrollViewListener c(KnitFragment knitFragment) {
        return new e(this, knitFragment);
    }

    private void ao() {
        if (this.ag) {
            try {
                ObserverManagerUtil.d(this.bd, "PLAN_FRAGMENT_SCROLL");
            } catch (IllegalStateException e2) {
                LogUtil.d("Track_SportEntranceFragment", "register plan fragment observer exception: ", e2);
            }
            this.ag = false;
        }
    }

    private void bi() {
        try {
            ObserverManagerUtil.a(this.bd, "PLAN_FRAGMENT_SCROLL");
        } catch (IllegalStateException e2) {
            LogUtil.d("Track_SportEntranceFragment", "unregister plan fragment observer exception: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ap() {
        HealthSearchView healthSearchView;
        if (this.bn > 0 || (healthSearchView = this.bp) == null) {
            return;
        }
        this.bn = healthSearchView.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ezi.c(this.bj);
        ezi.a(this.bm, 0);
        ezi.e(this.bp);
        this.al = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        HealthSearchView healthSearchView = this.bp;
        if (healthSearchView == null || healthSearchView.getVisibility() != 0) {
            LogUtil.b("Track_SportEntranceFragment", "mSearchView is null");
            return;
        }
        int i = this.bs;
        int iQ = q();
        LogUtil.b("Track_SportEntranceFragment", "setSearchViewHint positionId:", Integer.valueOf(iQ));
        InputBoxTemplate inputBoxTemplateB = ezi.b(iQ);
        this.s = inputBoxTemplateB;
        if (inputBoxTemplateB != null) {
            LogUtil.b("Track_SportEntranceFragment", "setSearchViewHint theme:", inputBoxTemplateB.getTheme());
            this.bp.setQueryHint(this.s.getTheme());
            if (this.as) {
                a(i, iQ, this.s.getTheme());
            }
            ezi.a(this.s.getTheme());
        } else {
            this.bp.setQueryHint("");
            LogUtil.b("Track_SportEntranceFragment", "setSearchViewHint empty");
        }
        this.bp.setSearchBarContentDescription();
    }

    private void a(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.bo.containsKey(Integer.valueOf(i)) && TextUtils.equals(this.bo.get(Integer.valueOf(i)), str)) {
            return;
        }
        this.bo.put(Integer.valueOf(i), str);
        gvi.a(this.t, i2, 1, this.s);
    }

    private void e(View view) {
        if (this.i == null) {
            this.i = (ViewStub) view.findViewById(R.id.viewstub_aw70_connect_tips);
        }
        if (this.i.getParent() != null) {
            this.au = this.i.inflate();
        } else {
            this.au = view.findViewById(R.id.rv_aw70_connect_tips);
        }
        View view2 = this.au;
        if (view2 == null) {
            return;
        }
        BaseActivity.setViewSafeRegion(true, view2);
        this.n = (HealthTextView) this.au.findViewById(R.id.tv_show_tips_close);
        this.l = (HealthTextView) this.au.findViewById(R.id.tv_show_tips_go);
        this.r = (HealthTextView) this.au.findViewById(R.id.tv_connect_tips);
        bl();
    }

    private void a(View view) {
        this.be = new CustomPermissionAction(this.t) { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.b("Track_SportEntranceFragment", "initSportTitleBar() mQrCodeAction onGranted");
                SportEntranceFragment.this.s();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.b("Track_SportEntranceFragment", "initSportTitleBar() mQrCodeAction onDenied");
                SportEntranceFragment.this.s();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.b("Track_SportEntranceFragment", "initSportTitleBar() mQrCodeAction onForeverDenied");
                SportEntranceFragment.this.s();
            }
        };
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.tab_layout);
        this.ch = relativeLayout;
        qsp.b((ViewGroup) relativeLayout, false);
        this.bu = (LinearLayout) view.findViewById(R.id.sport_tab_titlebar);
        BaseActivity.setViewSafeRegion(false, this.ch);
        z();
        c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.t == null) {
            LogUtil.e("Track_SportEntranceFragment", "gotoScan is null");
        } else {
            iov.d(this.t, new Intent(this.t, (Class<?>) QrCodeScanningActivity.class));
        }
    }

    private void z() {
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.t);
        View view = this.bx;
        if (view == null || layoutParamsU == null) {
            return;
        }
        view.setLayoutParams(layoutParamsU);
    }

    private void c(View view) {
        this.av = (RedPointImageView) view.findViewById(R.id.more_and_red_point);
        ay();
        this.av.e(true);
        this.av.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LoginInit.getInstance(SportEntranceFragment.this.t).browsingToLogin(new LoginResultCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.5.4
                    @Override // com.huawei.hwbasemgr.LoginResultCallback
                    public boolean isNeedWait() {
                        return true;
                    }

                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            SportEntranceFragment.this.an();
                        } else {
                            LogUtil.e("Track_SportEntranceFragment", "errorCode is not success", Integer.valueOf(i));
                        }
                    }
                }, "");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        if (isDetached() || this.t == null) {
            LogUtil.e("Track_SportEntranceFragment", "moreAndRedPointClickAction fragment is destroyed");
            return;
        }
        this.g.clear();
        this.bi = getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add);
        this.e = getResources().getString(R.string.IDS_hw_device_manager_add_device);
        this.bt = getResources().getString(R.string.IDS_hwh_motiontrack_sport_setting);
        this.ck = getResources().getString(R.string.IDS_sport_type_sort);
        if (!EnvironmentInfo.m()) {
            this.g.add(this.bi);
            this.g.add(this.e);
        }
        this.g.add(this.bt);
        this.g.add(this.ck);
        int i = this.bs;
        if (i == 2 || i == 500001) {
            this.g.remove(this.bt);
        }
        f(this.g);
        if (this.bs == 10001 && ucq.b()) {
            String string = getResources().getString(R.string.IDS_fa_card_setting_title);
            this.bv = string;
            this.g.add(string);
            i(this.g);
        }
        int i2 = this.bs;
        LogUtil.b("Track_SportEntranceFragment", "moreAndRedPointClickAction() mSportType: ", Integer.valueOf(i2), ", mArrayList: ", this.g);
        if (this.w != null) {
            for (int i3 = 0; i3 < this.w.size(); i3++) {
                qpm qpmVar = this.w.get(i3);
                if (this.bs == qpmVar.c()) {
                    Fragment fragmentD = qpmVar.d();
                    if (fragmentD == null || !(fragmentD instanceof AdvancedSportFragment)) {
                        LogUtil.b("Track_SportEntranceFragment", "fragment = null or not instanceof AdvancedSportFragment: ", fragmentD);
                        break;
                    }
                    AdvancedSportFragment.d popViewController = ((AdvancedSportFragment) fragmentD).getPopViewController();
                    if (popViewController == null || !popViewController.d()) {
                        LogUtil.b("Track_SportEntranceFragment", "controller = null or disabled: ", popViewController);
                        break;
                    } else {
                        LogUtil.b("Track_SportEntranceFragment", "IntelligencePlanFragment controller.getItemList(): ", popViewController.c());
                        new PopViewList(this.t, this.bu, popViewController.c()).b(popViewController.b());
                        return;
                    }
                }
            }
        }
        aj();
    }

    private void aj() {
        new PopViewList(this.t, this.bu, this.g).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.3
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                if (SportEntranceFragment.this.isDetached() || SportEntranceFragment.this.t == null) {
                    return;
                }
                String str = (String) SportEntranceFragment.this.g.get(i);
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(SportEntranceFragment.this.bi)) {
                        LoginInit.getInstance(SportEntranceFragment.this.t).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.3.1
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                if (i2 == 0) {
                                    PermissionUtil.d(SportEntranceFragment.this.t, PermissionUtil.PermissionType.CAMERA, SportEntranceFragment.this.be);
                                }
                            }
                        }, "");
                        return;
                    }
                    if (str.equals(SportEntranceFragment.this.e)) {
                        SportEntranceFragment.this.a();
                        return;
                    }
                    if (str.equals(SportEntranceFragment.this.bt)) {
                        SportEntranceFragment.this.al();
                        return;
                    }
                    if (str.equals(SportEntranceFragment.this.ck)) {
                        SportEntranceFragment.this.am();
                        return;
                    } else if (str.equals(SportEntranceFragment.this.bv)) {
                        ucq.c(SportEntranceFragment.this.u);
                        ucq.c(SportEntranceFragment.this.u, 400);
                        return;
                    } else {
                        LogUtil.e("Track_SportEntranceFragment", "popViewList setOnClick other");
                        return;
                    }
                }
                LogUtil.e("Track_SportEntranceFragment", "clickType is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        int i = this.bs;
        if (i == 2 || i == 500001) {
            am();
        } else {
            k();
        }
    }

    private void ay() {
        RedPointImageView redPointImageView = this.av;
        if (redPointImageView == null) {
            LogUtil.e("Track_SportEntranceFragment", "setRedPointShowOrDismiss mMoreAndRedPoint == null");
        } else {
            redPointImageView.a(false);
        }
    }

    private void i(ArrayList<String> arrayList) {
        if (arrayList == null) {
            LogUtil.e("Track_SportEntranceFragment", "setFaServiceCardRedPoint arrayList is null");
        } else {
            if (ucq.d(this.u)) {
                return;
            }
            arrayList.add(File.separator);
            arrayList.add(getResources().getString(R.string.IDS_fa_card_setting_title));
        }
    }

    private void f(ArrayList<String> arrayList) {
        if (arrayList == null) {
            LogUtil.e("Track_SportEntranceFragment", "setSportSettingRedPoint arrayList is null");
            return;
        }
        int i = this.bs;
        if ((i == 258 || i == 264) && !SharedPreferenceManager.b(Integer.toString(20002), "metronome_page_show", false) && jwz.c()) {
            p();
            arrayList.add(File.separator);
            arrayList.add(getResources().getString(R.string.IDS_hwh_motiontrack_sport_setting));
        }
    }

    private void p() {
        RedPointImageView redPointImageView = this.av;
        if (redPointImageView != null) {
            redPointImageView.a(false);
        } else {
            LogUtil.e("Track_SportEntranceFragment", "hideMoreButtonRedPoint mMoreAndRedPoint is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        RelativeLayout relativeLayout = this.ch;
        if (relativeLayout == null) {
            LogUtil.e("Track_SportEntranceFragment", "initMoreLayoutParams mMoreAndRedPoint or mTitleLayout null");
        } else {
            relativeLayout.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    if (SportEntranceFragment.this.t != null) {
                        if (SportEntranceFragment.this.av != null) {
                            SportEntranceFragment.this.av.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    LogUtil.d("Track_SportEntranceFragment", "[initMoreLayoutParams] mContext is null");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        lmf.d().c(this.t, AnalyticsValue.HEALTH_HEALTH_MY_DEVICE_2030030.value(), new HashMap(), 0);
        rdp.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    public void c(ArrayList<qpm> arrayList, int i, Map<String, Object> map) {
        if (njy.c(arrayList, i)) {
            int iC = arrayList.get(i).c();
            LogUtil.b("Track_SportEntranceFragment", "setOtherFragments original type: ", Integer.valueOf(iC), " position: ", Integer.valueOf(i));
            if (iC == 2) {
                j(map);
            } else if (iC == 137) {
                d(map, iC);
            } else if (iC == 264) {
                e(map);
            } else if (iC == 286) {
                d(map, iC);
            } else if (iC == 10001) {
                a(map);
            } else if (iC == 500001) {
                d(map, iC);
            } else if (iC == 282) {
                g(map);
            } else if (iC != 283) {
                switch (iC) {
                    case 257:
                        i(map);
                        break;
                    case 258:
                        h(map);
                        break;
                    case 259:
                        d(map);
                        break;
                    case 260:
                        c(map);
                        break;
                    default:
                        LogUtil.e("Track_SportEntranceFragment", "setOtherFragments default");
                        this.bs = iC;
                        break;
                }
            } else {
                d(map, iC);
            }
            bd();
        } else {
            LogUtil.e("Track_SportEntranceFragment", "setOtherFragments out of beans bounds");
        }
        ay();
        ReleaseLogUtil.c("Track_SportEntranceFragment", "setOtherFragments mSportType = ", Integer.valueOf(this.bs));
        tfi.h(this.t, this.bs);
        this.v.d(this.bs);
    }

    private void j(Map<String, Object> map) {
        this.bs = 2;
        map.put(BleConstants.SPORT_TYPE, 2);
        tfi.h(this.t, this.bs);
    }

    private void g(Map<String, Object> map) {
        this.bs = 282;
        map.put(BleConstants.SPORT_TYPE, 282);
        tfi.h(this.t, this.bs);
    }

    private void c(Map<String, Object> map) {
        this.bs = 260;
        map.put(BleConstants.SPORT_TYPE, 260);
        tfi.h(this.t, this.bs);
    }

    private void b(View view) {
        if (!this.k.a()) {
            if (this.cj == null) {
                this.cj = (ViewStub) view.findViewById(R.id.viewstub_tahiti_tablayout);
            }
            if (this.cj.getParent() != null) {
                this.cl = this.cj.inflate();
            } else {
                this.cl = view.findViewById(R.id.layout_tahiti_tablayout);
            }
            View view2 = this.cf;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.cl;
            if (view3 != null) {
                view3.setVisibility(0);
                this.cg = (HealthSubTabWidget) this.cl.findViewById(R.id.track_sport_tahiti_tab);
            }
        } else {
            if (this.ce == null) {
                this.ce = (ViewStub) view.findViewById(R.id.viewstub_tablayout);
            }
            if (this.ce.getParent() != null) {
                this.cf = this.ce.inflate();
            } else {
                this.cf = view.findViewById(R.id.layout_tablayout);
            }
            View view4 = this.cl;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = this.cf;
            if (view5 != null) {
                view5.setVisibility(0);
                this.cg = (HealthSubTabWidget) this.cf.findViewById(R.id.track_sport_tab);
            }
        }
        if (this.cg != null) {
            qso.d().a((View) this.cg, true);
            this.cg.d();
            this.cg.getSubTabViewContainer().setFadingMargin(0);
        } else {
            ReleaseLogUtil.c("Track_SportEntranceFragment", "mSubTabWidget == null ");
        }
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view6) {
                SportEntranceFragment.this.e(false);
            }
        });
        this.bw.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view6) {
                if (SportEntranceFragment.this.ay.getVisibility() == 0) {
                    SportEntranceFragment.this.e(false);
                }
            }
        });
        ae();
    }

    private void ae() {
        this.ay.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.8
            @Override // java.lang.Runnable
            public void run() {
                int iS = qrs.s(SportEntranceFragment.this.t);
                ViewGroup.LayoutParams layoutParams = SportEntranceFragment.this.ay.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = iS;
                    SportEntranceFragment.this.ay.setLayoutParams(layoutParams2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        boolean z;
        LogUtil.b("Track_SportEntranceFragment", "onClick more sport type");
        buh.d("sportTypeSortRedClick", "true");
        ArrayList<qle> arrayList = new ArrayList<>();
        ArrayList<qpm> arrayList2 = this.w;
        if (arrayList2 != null) {
            for (qpm qpmVar : arrayList2) {
                if (qpmVar != null && qpmVar.c() != 1) {
                    int iC = qpmVar.c();
                    String strG = qpmVar.g();
                    if (!TextUtils.isEmpty(strG)) {
                        arrayList.add(new qle(iC, strG, 0));
                    }
                }
            }
        }
        if (Utils.k() || LoginInit.getInstance(this.t).isBrowseMode()) {
            this.az.setVisibility(8);
            z = false;
        } else {
            this.az.setVisibility(0);
            z = true;
        }
        this.ax.d(arrayList, z);
        for (int i = 0; i < arrayList.size(); i++) {
            c(this.ax.getChildAt(i), arrayList.get(i));
        }
        this.ay.setVisibility(0);
        this.bw.setVisibility(0);
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(this.t, AnalyticsValue.SPORT_SORT_CLICKED_2040106.value(), map, 0);
    }

    private void c(View view, final qle qleVar) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iF = qleVar.f();
                boolean z = SportEntranceFragment.this.bs != iF;
                SportEntranceFragment.this.bs = iF;
                SportEntranceFragment.this.e(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.ay.setVisibility(8);
        this.bw.setVisibility(8);
        LogUtil.b("Track_SportEntranceFragment", "mCloseMoreSport window misss");
        ArrayList<qpm> arrayListC = this.ca.c(this.ax.getTagInfos());
        HealthSubTabPagerAdapter healthSubTabPagerAdapter = this.cd;
        if (healthSubTabPagerAdapter == null) {
            return;
        }
        qpm.b(healthSubTabPagerAdapter.b(), arrayListC, false);
        b((List<qpm>) arrayListC);
        if (z || njy.b(arrayListC)) {
            c(this.w, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map) {
        map.put("click", 1);
        LogUtil.b("Track_SportEntranceFragment", "setBiEvent for sport type selected: ", map);
        lmf.d().c(this.t, AnalyticsValue.BI_TRACK_SPORT_TYPE_ACTION_KEY.value(), map, 0);
    }

    private void be() {
        if (this.cg == null || LanguageUtil.o(this.t)) {
            return;
        }
        try {
            Field declaredField = this.cg.getClass().getSuperclass().getDeclaredField("mSubTabItemMargin");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set(this.cg, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.hwsubtab_item_margin)));
            }
        } catch (IllegalAccessException e2) {
            LogUtil.d("Track_SportEntranceFragment", e2.getMessage());
        } catch (NoSuchFieldException e3) {
            LogUtil.d("Track_SportEntranceFragment", "can't get mSubTabItemMargin field for subtab", e3);
        }
    }

    private void v() {
        aq();
    }

    private void b(qpm qpmVar, KnitFragment knitFragment) {
        int resPosId = knitFragment.getResPosId();
        if (resPosId == 4019) {
            KnitFragment knitFragment2 = this.bl;
            if (knitFragment2 == null) {
                this.bl = knitFragment;
            } else {
                qpmVar.b(knitFragment2);
            }
        } else if (resPosId == 4020) {
            KnitFragment knitFragment3 = this.cq;
            if (knitFragment3 == null) {
                this.cq = knitFragment;
            } else {
                qpmVar.b(knitFragment3);
            }
        } else if (resPosId == 4022) {
            KnitFragment knitFragment4 = this.ao;
            if (knitFragment4 == null) {
                this.ao = knitFragment;
                this.bk.put(260, true);
            } else {
                qpmVar.b(knitFragment4);
            }
        } else if (resPosId == 4023) {
            KnitFragment knitFragment5 = this.ap;
            if (knitFragment5 == null) {
                this.ap = knitFragment;
                this.bk.put(282, true);
            } else {
                qpmVar.b(knitFragment5);
            }
        } else if (resPosId == 4015) {
            KnitFragment knitFragment6 = this.cp;
            if (knitFragment6 == null) {
                this.cp = knitFragment;
            } else {
                qpmVar.b(knitFragment6);
            }
        } else if (resPosId == 4016) {
            KnitFragment knitFragment7 = this.aq;
            if (knitFragment7 == null) {
                this.aq = knitFragment;
            } else {
                qpmVar.b(knitFragment7);
            }
        } else if (resPosId == 4056) {
            KnitFragment knitFragment8 = this.ar;
            if (knitFragment8 == null) {
                this.ar = knitFragment;
            } else {
                qpmVar.b(knitFragment8);
            }
        } else if (resPosId == 4040) {
            KnitFragment knitFragment9 = this.bh;
            if (knitFragment9 == null) {
                this.bh = knitFragment;
            } else {
                qpmVar.b(knitFragment9);
            }
        } else if (resPosId == 4013) {
            KnitFragment knitFragment10 = this.aw;
            if (knitFragment10 == null) {
                this.aw = knitFragment;
            } else {
                qpmVar.b(knitFragment10);
            }
        } else {
            LogUtil.e("Track_SportEntranceFragment", "processSuperUiFragments cause resPosId: ", Integer.valueOf(resPosId), " is unknown");
        }
        knitFragment.setScrollViewListener(c(knitFragment));
    }

    private void aq() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        aw();
        for (qpm qpmVar : this.w) {
            Fragment fragmentD = qpmVar.d();
            if (fragmentD instanceof KnitFragment) {
                b(qpmVar, (KnitFragment) fragmentD);
            }
        }
        ReleaseLogUtil.c("Track_SportEntranceFragment", "processTabFragments finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void a(Map<String, Object> map) {
        this.bs = 10001;
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        tfi.h(this.t, this.bs);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.bs));
        tfi.b(this.t, true);
    }

    private void h(Map<String, Object> map) {
        this.bs = 258;
        map.put(BleConstants.SPORT_TYPE, 258);
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        tfi.h(this.t, this.bs);
        ObserverManagerUtil.e("RUN_PLAN_UPDATE_HELLO_TIME", "");
        LogUtil.b("Track_SportEntranceFragment", "boot page cost: ", Long.valueOf(SystemClock.elapsedRealtime()));
    }

    private void e(Map<String, Object> map) {
        this.bs = 264;
        map.put(BleConstants.SPORT_TYPE, 264);
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        tfi.h(this.t, this.bs);
        ObserverManagerUtil.e("RUN_PLAN_UPDATE_HELLO_TIME", "");
    }

    private void i(Map<String, Object> map) {
        this.bs = 257;
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.bs));
        tfi.h(this.t, this.bs);
    }

    private void d(Map<String, Object> map) {
        this.bs = 259;
        map.put(BleConstants.SPORT_TYPE, 259);
        tfi.h(this.t, this.bs);
        az();
    }

    private void d(Map<String, Object> map, int i) {
        this.bs = i;
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        tfi.h(this.t, this.bs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        DeviceInfo deviceInfoC = mgi.c("Track_SportEntranceFragment");
        if (this.au == null || this.r == null || this.l == null) {
            return;
        }
        LogUtil.b("Track_SportEntranceFragment", "mAutoSelect:", Integer.valueOf(this.h));
        if (deviceInfoC == null) {
            this.f25908b = false;
            LogUtil.d("Track_SportEntranceFragment", "deviceInfo is null");
            bd();
            return;
        }
        int iN = n();
        this.p = iN;
        if (iN == 0) {
            this.f25908b = false;
        } else if (this.h == 0) {
            this.f25908b = true;
            this.r.setText(String.format(this.t.getResources().getString(R.string.IDS_HWH_device_aw70_wear_tips), deviceInfoC.getDeviceName()));
            this.l.setText(this.t.getResources().getString(R.string.IDS_resting_heart_rate_redirect_setting_string));
        } else if (iN == 2) {
            if (deviceInfoC.getAutoDetectSwitchStatus() == 1) {
                this.f25908b = false;
            } else {
                this.f25908b = true;
                String str = String.format(this.t.getResources().getString(R.string.IDS_hwh_device_aw70_pair_tips), deviceInfoC.getDeviceName());
                this.l.setText(this.t.getResources().getString(R.string.IDS_user_permission_know));
                this.r.setText(str);
            }
        } else if (iN == 3) {
            String str2 = String.format(this.t.getResources().getString(R.string.IDS_hwh_device_aw70_connect_tips), deviceInfoC.getDeviceName());
            this.l.setText(this.t.getResources().getString(R.string.IDS_tips_connect_go));
            this.f25908b = true;
            this.r.setText(str2);
        } else {
            this.f25908b = false;
        }
        bd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        View view = this.au;
        if (view == null || this.n == null) {
            return;
        }
        if (this.f25908b && this.bs == 259) {
            view.setVisibility(0);
            if (this.p == 2 && this.h != 0) {
                this.n.setVisibility(8);
                return;
            } else {
                this.n.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    private void bl() {
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SportEntranceFragment.this.h == 0) {
                    SportEntranceFragment.this.bk();
                    return;
                }
                if (SportEntranceFragment.this.p != 3) {
                    SportEntranceFragment.this.f25908b = false;
                    SportEntranceFragment.this.bd();
                } else if (SportEntranceFragment.this.getActivity() instanceof SportEntranceCallback) {
                    ((SportEntranceCallback) SportEntranceFragment.this.getActivity()).onSportEntranceCallback();
                }
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportEntranceFragment.this.f25908b = false;
                SportEntranceFragment.this.bd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        a aVar = this.ad;
        if (aVar == null) {
            return;
        }
        aVar.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.14
            @Override // java.lang.Runnable
            public void run() {
                SportEntranceFragment.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        a aVar = this.ad;
        if (aVar == null) {
            return;
        }
        aVar.post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.12
            @Override // java.lang.Runnable
            public void run() {
                SportEntranceFragment.this.az();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.r == null || this.l == null) {
            LogUtil.d("Track_SportEntranceFragment", "autoOffView mConnectTips or mConnectAw70Text is null");
            return;
        }
        this.f25908b = true;
        this.r.setText(String.format(this.t.getResources().getString(R.string.IDS_HWH_device_aw70_wear_tips), this.f25907a));
        this.l.setText(this.t.getResources().getString(R.string.IDS_resting_heart_rate_redirect_setting_string));
        bd();
    }

    private void t() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: syh
            @Override // java.lang.Runnable
            public final void run() {
                this.f48804c.e();
            }
        });
    }

    public /* synthetic */ void e() {
        ReleaseLogUtil.c(getTag(), "getAutoModeDetectStatus");
        final DeviceInfo deviceInfoC = mgi.c("Track_SportEntranceFragment");
        if (deviceInfoC == null) {
            LogUtil.e("Track_SportEntranceFragment", "deviceInfo  is null");
        } else if (izs.b(deviceInfoC)) {
            DeviceSettingsInteractors.e(this.t).a(deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.19
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj instanceof byte[]) {
                        String strA = HEXUtils.a((byte[]) obj);
                        LogUtil.b("Track_SportEntranceFragment", "getSwitch berfore onResponse objectData is ", strA);
                        try {
                            int i2 = Integer.parseInt(strA.substring(strA.length() - 2, strA.length()));
                            ReleaseLogUtil.c(SportEntranceFragment.this.getTag(), "getWearPositionSetting value is ", Integer.valueOf(i2));
                            if (i2 == 0) {
                                SportEntranceFragment.this.h = 0;
                                LogUtil.b("Track_SportEntranceFragment", "onResponse mAutoSelect:", Integer.valueOf(SportEntranceFragment.this.h));
                                SportEntranceFragment.this.f25907a = deviceInfoC.getDeviceName();
                                SportEntranceFragment.this.ax();
                                return;
                            }
                            if (i2 == 1) {
                                SportEntranceFragment.this.h = 1;
                                SportEntranceFragment.this.av();
                                LogUtil.b("Track_SportEntranceFragment", "onResponse mAutoSelect：", Integer.valueOf(SportEntranceFragment.this.h));
                                return;
                            }
                            LogUtil.e("Track_SportEntranceFragment", "onResponse other value is wrong");
                        } catch (NumberFormatException e2) {
                            LogUtil.d("Track_SportEntranceFragment", "onResponse() e ", e2.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk() {
        DeviceInfo deviceInfoC = mgi.c("Track_SportEntranceFragment");
        Intent intent = new Intent(this.t, (Class<?>) Aw70ModeSelectActivity.class);
        if (deviceInfoC != null) {
            intent.putExtra("device_id", deviceInfoC.getDeviceIdentify());
        }
        startActivityForResult(intent, 36);
    }

    private int n() {
        DeviceInfo deviceInfoC = mgi.c("Track_SportEntranceFragment");
        if (!izs.b(deviceInfoC)) {
            return 0;
        }
        LogUtil.b("Track_SportEntranceFragment", "mConnectState:", Integer.valueOf(deviceInfoC.getDeviceConnectState()));
        return deviceInfoC.getDeviceConnectState();
    }

    private void d(List<qpm> list, boolean z) {
        xfz xfzVarB;
        LogUtil.b("Track_SportEntranceFragment", "mergeFragmentSubTabPagers, list: ", list, " isFirstTimeSelected: ", Boolean.valueOf(z));
        if (this.cd == null || this.cg == null) {
            return;
        }
        HashSet<Integer> hashSetD = d(list);
        HashSet<Integer> hashSetD2 = d(this.cd.b());
        LogUtil.b("Track_SportEntranceFragment", "mergeFragmentSubTabPagers sportTypes, ", hashSetD, " currentSportTypes: ", hashSetD2);
        qpm.b(this.cd.b(), list, false);
        for (qpm qpmVar : list) {
            if (qpmVar != null && !hashSetD2.contains(Integer.valueOf(qpmVar.c()))) {
                Drawable drawableE = qpmVar.e();
                Drawable drawableA = qpmVar.a();
                String strG = qpmVar.g();
                if (drawableE == null && drawableA == null) {
                    xfzVarB = this.cg.b(strG);
                } else {
                    xfzVarB = this.cg.b(strG, drawableE, drawableE, drawableA);
                }
                this.cd.c(xfzVarB, qpmVar, false);
            }
        }
        c(list, z);
    }

    private void b(List<qpm> list) {
        if (njy.e(list)) {
            return;
        }
        this.w.clear();
        qpm.e(list, this.w);
        qpm.b(list, this.w);
        at();
    }

    private void c(List<qpm> list, boolean z) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        xfz xfzVarB;
        if (list == null || this.cg == null || this.cd == null) {
            return;
        }
        bq();
        this.cg.h();
        this.by.removeOnPageChangeListener(this.ba);
        this.cg.getSubTabViewContainer().setFadingMargin(0);
        for (int i = 0; i < list.size(); i++) {
            qpm qpmVar = list.get(i);
            Drawable drawableE = qpmVar.e();
            Drawable drawableA = qpmVar.a();
            if (drawableE == null && drawableA == null) {
                xfzVarB = this.cg.b(qpmVar.g());
            } else {
                xfzVarB = this.cg.b(qpmVar.g(), drawableE, drawableE, drawableA);
            }
            xfzVarB.e(qpmVar);
            this.cg.b(xfzVarB, this.bs == qpmVar.c());
        }
        this.cd.c();
        this.cd.d(list);
        this.cd.c(list);
        this.by.addOnPageChangeListener(this.ba);
        final int iIntValue = this.bz.get(this.bs, 0).intValue();
        d(this.as);
        if (z && (onPageChangeListener = this.ba) != null) {
            onPageChangeListener.onPageSelected(iIntValue);
        }
        this.cg.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.17
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (SportEntranceFragment.this.cg != null) {
                    SportEntranceFragment.this.cg.d(iIntValue);
                    SportEntranceFragment.this.cg.setIsViewPagerScroll(false);
                    SportEntranceFragment.this.cg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ReleaseLogUtil.c("Track_SportEntranceFragment", "onPause ", this);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (getUserVisibleHint()) {
            bc();
            o();
        }
        t();
        if (!this.ah && this.as && (i = this.bs) != 10001) {
            this.v.d(i);
        }
        ad();
        if (this.ae) {
            this.ca.b();
            this.ae = false;
        }
        SportSupportUtil.c("custom.UserPreference_coach_gender_Flag", (UiCallback<String>) this.y);
        ReleaseLogUtil.c("Track_SportEntranceFragment", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.e("Track_SportEntranceFragment", "dealUserGenderForCoach : userProfileMgrApi is null.");
        } else {
            userProfileMgrApi.getUserInfo(new c(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public int c(UserInfomation userInfomation) {
        int iJ;
        if (userInfomation == null) {
            iJ = 1;
        } else if (userInfomation.isGenderValid()) {
            iJ = userInfomation.getGender();
        } else {
            String strE = buh.e("coachGenderConfig");
            LogUtil.b("Track_SportEntranceFragment", "get failed, local:", strE);
            if (TextUtils.isEmpty(strE)) {
                iJ = 1;
            } else {
                iJ = CommonUtil.j(strE);
            }
        }
        if (iJ == 2) {
            return 1;
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        final CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Track_SportEntranceFragment", "confirmClearCache courseApi == null");
        } else {
            courseApi.delCourseUseCache(new UiCallback<Boolean>() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.20
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Track_SportEntranceFragment", "cleanMediaFiles delUseCache onFailure errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    LogUtil.b("Track_SportEntranceFragment", "cleanMediaFiles onSuccess");
                    courseApi.updateCourseDataState();
                    ien.a();
                    if (SportEntranceFragment.this.ad != null) {
                        SportEntranceFragment.this.ad.sendEmptyMessage(101);
                    } else {
                        LogUtil.e("Track_SportEntranceFragment", "cleanMediaFiles mHandler is null");
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.b("Track_SportEntranceFragment", "onStart ", this);
        ag();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LogUtil.b("Track_SportEntranceFragment", "onStop ", this);
        g(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LogUtil.b("Track_SportEntranceFragment", "onSaveInstanceState");
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z();
        if (this.as) {
            m();
            this.aj = false;
        } else {
            this.aj = true;
        }
    }

    private void m() {
        Context context = getContext();
        if (context != null) {
            this.k.b(context);
            if (this.m != this.k.j()) {
                this.m = this.k.j();
                w();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        HealthNativeViewPager healthNativeViewPager = this.by;
        if (healthNativeViewPager != null) {
            healthNativeViewPager.setOnPageChangeListener(null);
            this.by.clearOnPageChangeListeners();
        }
        super.onDestroy();
        LogUtil.b("Track_SportEntranceFragment", "onDestroy ", this);
        d("onDestroy");
        if (this.an) {
            e("action_stop_play_sport_music");
            this.an = false;
        }
        this.v.d();
        this.ci.unRegisterCallback(2);
        ThreadPoolManager.c().c("Track_SportEntranceFragment", null);
        if (CommonUtil.ck()) {
            bm();
        }
        if (!this.ag) {
            bi();
            this.ag = true;
        }
        bb();
        a aVar = this.ad;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.ad = null;
        }
        ucq.e(this.u);
        bj();
    }

    private void bb() {
        aw();
        this.cg = null;
        this.bj = null;
        this.t = null;
        this.bc = null;
        this.by = null;
        this.cd = null;
        this.v = null;
        this.cb = null;
        ArrayList<qpm> arrayList = this.w;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.bf = null;
    }

    private void aw() {
        this.bl = null;
        this.cq = null;
        this.ap = null;
        this.ao = null;
        this.cp = null;
        this.aq = null;
        this.ar = null;
        this.bh = null;
        this.aw = null;
    }

    private void k() {
        LogUtil.b("Track_SportEntranceFragment", "showSportExtrasSettingView");
        d("onClick");
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) SportAssistSettingsActivity.class);
        intent.putExtra("currentSportType", this.bs);
        iov.d(this.t, intent);
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 1);
        lmf.d().c(this.t, AnalyticsValue.MOTION_TRACK_1040021.value(), map, 0);
    }

    public static class a extends BaseHandler<SportEntranceFragment> {
        a(Looper looper, SportEntranceFragment sportEntranceFragment) {
            super(looper, sportEntranceFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SportEntranceFragment sportEntranceFragment, Message message) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = message.what;
            if (i != 2) {
                if (i == 42) {
                    sportEntranceFragment.bc();
                } else {
                    switch (i) {
                        case 100:
                            LogUtil.b("Track_SportEntranceFragment", "unloadFragmentResources, MSG_FRAGMENT_HIDE");
                            sportEntranceFragment.g(false);
                            break;
                        case 101:
                            if (sportEntranceFragment.v != null) {
                                sportEntranceFragment.v.d(sportEntranceFragment.bs);
                            }
                            break;
                        case 102:
                            if (sportEntranceFragment.getUserVisibleHint()) {
                                sportEntranceFragment.x();
                            }
                            break;
                        case 103:
                            Object obj = message.obj;
                            if (obj instanceof List) {
                                c(sportEntranceFragment, (List) obj);
                            }
                            break;
                    }
                }
            } else if (message.obj instanceof NewMedalTabDataBean) {
                sportEntranceFragment.a((NewMedalTabDataBean) message.obj);
            }
            ReleaseLogUtil.c("Track_SportEntranceFragment", "msg:" + message.what + " finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }

        private void c(final SportEntranceFragment sportEntranceFragment, List<vqt> list) {
            Iterator<vqt> it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().m() == 258) {
                    i++;
                } else {
                    i2++;
                }
            }
            szl.a(sportEntranceFragment.bc, i, i2, list.size());
            if (!sportEntranceFragment.z) {
                szl.d(sportEntranceFragment.bc, list, new IBaseResponseCallback() { // from class: syi
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i3, Object obj) {
                        sportEntranceFragment.ac = false;
                    }
                });
                sportEntranceFragment.z = true;
            } else {
                ReleaseLogUtil.d("Track_SportEntranceFragment", "mIsAutoDetectDialog is Showing");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        LogUtil.b("Track_SportEntranceFragment", "setUserVisibleHint ", Boolean.valueOf(z));
        this.as = z;
        ObserverManagerUtil.e("SPORT_ENTRANCE_IS_VISIBLE_TO_USER", Boolean.valueOf(z));
        a(z);
        b(z);
        if (z) {
            new ifm().b();
        }
        if (this.bj == null) {
            LogUtil.e("Track_SportEntranceFragment", "setUserVisibleHint mRootView is null");
            if (this.as) {
                this.aa = true;
                ObserverManagerUtil.e("ALLOW_VISIBLE_HINT_LOAD", true);
                return;
            }
            return;
        }
        SharedPreferenceManager.e(this.t, this.at, "EXIT_APP_AT_SPORT_TAB", Boolean.toString(z), this.cb);
        if (z) {
            ObserverManagerUtil.e("ALLOW_VISIBLE_HINT_LOAD", true);
            this.ca.h();
            o();
            if (this.ah) {
                w();
                LogUtil.b("Track_SportEntranceFragment", "initAll in setUserVisibleHint");
            } else {
                ag();
                int i = this.bs;
                if (i != 10001) {
                    this.v.d(i);
                }
            }
            if (this.aj) {
                m();
                this.aj = false;
            }
            this.aa = true;
            bf();
            x();
            bc();
            if (this.bs == 10001) {
                ucq.d(this.u, 0);
            }
        } else {
            if (this.an) {
                e("action_stop_play_sport_music");
                this.an = false;
            }
            au();
            ucq.d(this.u, 8);
        }
        if (getView() != null) {
            int iR = r();
            if (iR == 0) {
                LogUtil.b("Track_SportEntranceFragment", "current tab type positionId not exist");
                qkz.a(iR);
                return;
            }
            fxl.c(getActivity().getWindow().getDecorView(), z, iR, "SportPage");
        }
        if (z) {
            bh();
        }
        LogUtil.b("Track_SportEntranceFragment", "setUserVisibleHint end");
    }

    private void b(boolean z) {
        if (njy.e(this.w)) {
            LogUtil.e("Track_SportEntranceFragment", "setAllTabUserVisibleHint: mFragmentSubTabPagerBeans is empty.");
            return;
        }
        for (qpm qpmVar : this.w) {
            if (qpmVar != null) {
                Fragment fragmentD = qpmVar.d();
                if (fragmentD instanceof KnitFragment) {
                    c((KnitFragment) fragmentD, z);
                }
            }
        }
    }

    private void c(KnitFragment knitFragment, boolean z) {
        if (knitFragment == null) {
            LogUtil.b("Track_SportEntranceFragment", "fragment is null");
        } else if (z) {
            knitFragment.setUserVisibleHint(knitFragment.getIsSetUserVisibleLastTime());
        } else {
            knitFragment.setIsSetUserVisibleLastTime(knitFragment.getIsVisibleToUser());
            knitFragment.setUserVisibleHint(false);
        }
    }

    private void a(boolean z) {
        if (z) {
            int i = this.bs;
            if (i == 258 || i == 259 || i == 264) {
                BoltCustomDialog.c().d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NewMedalTabDataBean newMedalTabDataBean) {
        if (newMedalTabDataBean == null || newMedalTabDataBean.getSecondTabRelationshipForSport() == null || !this.as) {
            return;
        }
        Map<String, ArrayList<MedalInfoDesc>> secondTabRelationshipForSport = newMedalTabDataBean.getSecondTabRelationshipForSport();
        this.bq = secondTabRelationshipForSport;
        if (ozc.c(secondTabRelationshipForSport, this.bs)) {
            DragFloatActionButton dragFloatActionButton = this.x;
            if (dragFloatActionButton != null) {
                dragFloatActionButton.j();
                return;
            } else {
                ac();
                return;
            }
        }
        DragFloatActionButton dragFloatActionButton2 = this.x;
        if (dragFloatActionButton2 != null) {
            dragFloatActionButton2.b();
        }
    }

    private void ac() {
        this.x = new DragFloatActionButton(this.t);
        Drawable drawable = ContextCompat.getDrawable(this.t, R.drawable.ic_sport_tab_medal);
        if (drawable == null) {
            return;
        }
        this.x.setIconImage(drawable, ozc.a(this.t), ozc.c(this.t));
        this.x.c(true);
        this.x.setlistener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ozc.e(SportEntranceFragment.this.t, SportEntranceFragment.this.bq, SportEntranceFragment.this.bs, 0);
            }
        });
        this.x.b(ozc.d(this.t));
        if (this.as && ozc.a()) {
            ozc.e(this.t, this.bq, this.bs, 1);
        }
    }

    private int r() {
        LogUtil.b("Track_SportEntranceFragment", "mSportType: ", Integer.valueOf(this.bs));
        int i = this.bs;
        if (i == 137) {
            return 3024;
        }
        if (i == 264) {
            return 3017;
        }
        if (i == 286) {
            return 3043;
        }
        if (i == 10001) {
            return 3018;
        }
        if (i == 500001) {
            return 3042;
        }
        if (i == 282) {
            return 3027;
        }
        if (i == 283) {
            return 3023;
        }
        switch (i) {
            case 257:
                return 3019;
            case 258:
                return 3016;
            case 259:
                return 3020;
            case 260:
                return 3026;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q() {
        int i = this.bs;
        if (i == 2) {
            return 4048;
        }
        if (i == 137) {
            return 4020;
        }
        if (i == 257) {
            return 4015;
        }
        if (i == 264) {
            return 4013;
        }
        if (i == 286) {
            return 4056;
        }
        if (i == 10001) {
            return 4014;
        }
        if (i == 500001) {
            return 4040;
        }
        if (i == 259) {
            return 4016;
        }
        if (i == 260) {
            return 4022;
        }
        if (i != 282) {
            return i != 283 ? 4012 : 4019;
        }
        return 4023;
    }

    private void c(MarketingApi marketingApi, MarketingOption.Builder builder) {
        builder.setTypeId(51);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        builder.setTypeId(52);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            MarketingOption.Builder builder = new MarketingOption.Builder();
            builder.setContext(getContext());
            builder.setPageId(401);
            marketingApi.requestMarketingResource(builder.build());
            HashMap map = new HashMap();
            map.put("open_specific_page", "SportPage");
            builder.setTriggerEventParams(map);
            builder.setTypeId(49);
            marketingApi.triggerMarketingResourceEvent(builder.build());
            c(marketingApi, builder);
        }
    }

    private void o() {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.t, AnalyticsValue.BI_TRACK_ENTER_SPORT_TAB_1040043.value(), map, 0);
        qrs.c(this.t, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.b("Track_SportEntranceFragment", "showSportTip onActivityResult", Integer.valueOf(i), "resultCode: ", Integer.valueOf(i2));
        FaCardAgdsApi faCardAgdsApiB = etv.b();
        if (faCardAgdsApiB != null && i == 400) {
            ucq.a(0, i, intent);
            faCardAgdsApiB.close();
            return;
        }
        if (i == 102) {
            rdp.c(this.t);
            return;
        }
        if (i == 100) {
            if (i2 == faCardAgdsApiB.getResultcodeAgreeProtocol()) {
                ucq.c(this.u);
                ucq.c(this.u, 400);
            } else if (i2 == faCardAgdsApiB.getResultcodeNotAgreeProtocol()) {
                ReleaseLogUtil.c("Track_SportEntranceFragment", "openFaCardAgds NotAgreeProtocol");
            }
        }
    }

    public boolean d() {
        return this.ak;
    }

    private void ak() {
        if (qrs.ah(this.t)) {
            LogUtil.b("Track_SportEntranceFragment", "isPad not loadMap");
        }
        if (isAdded()) {
            this.bj.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.16
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (SportEntranceFragment.this.bj != null) {
                        SportEntranceFragment.this.bj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        SportEntranceFragment.this.ad();
                        if (qrs.ah(SportEntranceFragment.this.t)) {
                            LogUtil.b("Track_SportEntranceFragment", "isPad not loadMap");
                            return;
                        }
                        return;
                    }
                    LogUtil.e("Track_SportEntranceFragment", "loadMap mRootView is null");
                }
            });
        }
    }

    private void h() {
        for (qpm qpmVar : this.w) {
            qpm qpmVar2 = new qpm(null, qpmVar.g(), qpmVar.c());
            qpmVar2.c(qpmVar.e());
            qpmVar2.d(qpmVar.a());
            this.j.add(qpmVar2);
        }
    }

    private void a(ArrayList<qpm> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (qpm qpmVar : arrayList) {
            if (qpmVar != this.bf && qpmVar != null) {
                qpmVar.b(null);
            }
        }
    }

    private void i() {
        this.bf = null;
        h();
        Integer num = this.bz.get(this.bs);
        if (num != null && njy.c(this.w, num.intValue())) {
            qpm qpmVar = this.w.get(num.intValue());
            this.bf = qpmVar;
            if (qpmVar != null && qpmVar.c() != this.bs) {
                LogUtil.e("Track_SportEntranceFragment", "mRetainFragmentSubTabPagerBean's sportType is not equal to mSportType,", " bean's sportType: ", Integer.valueOf(this.bf.c()), " mSportType: ", Integer.valueOf(this.bs));
                this.bf = null;
                return;
            }
        }
        ArrayList<qpm> arrayList = new ArrayList<>(this.w);
        this.w.clear();
        if (this.cd != null) {
            qpm qpmVar2 = this.bf;
            if (qpmVar2 != null) {
                LogUtil.b("Track_SportEntranceFragment", "save retain fragment sportType=", Integer.valueOf(this.bs), ", fragment=", qpmVar2.d());
            }
            if (!this.cd.e(this.bf)) {
                LogUtil.d("Track_SportEntranceFragment", "detachedAllFragment failed");
                this.bf = null;
            }
        }
        SportViewModel sportViewModel = this.ca;
        if (sportViewModel != null) {
            sportViewModel.j();
            this.ae = true;
        }
        aw();
        a(arrayList);
    }

    private boolean j(ArrayList<qpm> arrayList) {
        if (this.bf == null || arrayList == null) {
            return false;
        }
        ArrayList<qpm> arrayList2 = new ArrayList<>(arrayList);
        if (this.bf.c() != this.bs) {
            LogUtil.e("Track_SportEntranceFragment", "mRetainFragmentSubTabPagerBean's sportType is not equal to mSportType,", " bean's sportType: ", Integer.valueOf(this.bf.c()), " mSportType: ", Integer.valueOf(this.bs));
            return false;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i = -1;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            qpm qpmVar = arrayList2.get(i2);
            if (qpmVar != null && qpmVar.d() != null) {
                if (!Integer.valueOf(i2).equals(this.bz.get(qpmVar.c()))) {
                    LogUtil.b("Track_SportEntranceFragment", "fragment pos change, sportType:", Integer.valueOf(qpmVar.c()));
                    return false;
                }
                if (qpmVar.c() == this.bf.c()) {
                    i = i2;
                }
                arrayList3.add(qpmVar.d());
            }
        }
        if ((this.cg != null && arrayList3.size() != this.cg.getSubTabCount()) || i == -1) {
            LogUtil.b("Track_SportEntranceFragment", "fragment num change, or retain fragment type not exist, sportType:", Integer.valueOf(this.bs));
            return false;
        }
        arrayList2.set(i, this.bf);
        List<qpm> listE = qpm.e(arrayList2);
        if (listE.size() < arrayList2.size()) {
            LogUtil.d("Track_SportEntranceFragment", "found duplicated beans in the list: ", Integer.valueOf(arrayList2.size()), " ", Integer.valueOf(listE.size()));
            return false;
        }
        return b(arrayList2, this.bf);
    }

    private void at() {
        for (qpm qpmVar : this.j) {
            for (qpm qpmVar2 : this.w) {
                if (qpmVar2.c() == qpmVar.c()) {
                    qpmVar2.d(qpmVar);
                }
            }
        }
    }

    private boolean b(ArrayList<qpm> arrayList, qpm qpmVar) {
        this.w = new ArrayList<>(arrayList);
        LogUtil.b("Track_SportEntranceFragment", "restore retain fragment sportType=", Integer.valueOf(this.bs), ", retainFragBean =", qpmVar);
        HealthSubTabPagerAdapter healthSubTabPagerAdapter = this.cd;
        if (healthSubTabPagerAdapter != null && !healthSubTabPagerAdapter.a(this.w, qpmVar)) {
            return false;
        }
        if (qpmVar != null) {
            int iC = qpmVar.c();
            LogUtil.b("Track_SportEntranceFragment", "retain sport type: ", Integer.valueOf(iC));
            Integer num = this.bz.get(iC);
            b(qpmVar, iC);
            if (num != null) {
                this.by.setCurrentItem(num.intValue(), false);
            }
        }
        this.by.setOffscreenPageLimit(this.w.size() - 1);
        this.bf = null;
        v();
        return true;
    }

    private void b(qpm qpmVar, int i) {
        if (i == 10001 || i == 137 || i == 258 || i == 264) {
            Fragment fragmentD = qpmVar.d();
            if (fragmentD instanceof KnitFragment) {
                ((KnitFragment) fragmentD).setUserVisibleHint(true);
                LogUtil.c("Track_SportEntranceFragment", "setUserVisibleHint for fitness fragment ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        boolean zAf = af();
        LogUtil.b("Track_SportEntranceFragment", "unloadFragmentResources, isUserVisible=", Boolean.valueOf(this.as), ", isDelayed=", Boolean.valueOf(z), ", needClean=", Boolean.valueOf(zAf));
        f();
        if (this.ah || !zAf) {
            return;
        }
        if (z) {
            au();
            return;
        }
        c(false);
        i();
        c(true);
        DfxMonitorCenter.c();
    }

    private void c(boolean z) {
        HealthSubTabPagerAdapter healthSubTabPagerAdapter = this.cd;
        if (healthSubTabPagerAdapter == null) {
            return;
        }
        int count = healthSubTabPagerAdapter.getCount();
        LogUtil.b("Track_SportEntranceFragment", "setAllPageResTriggerIsEnabled, isEnabled: ", Boolean.valueOf(z), " count: ", Integer.valueOf(count));
        for (int i = 0; i < count; i++) {
            Fragment item = this.cd.getItem(i);
            if (item instanceof KnitFragment) {
                ((KnitFragment) item).setPageResTriggerEnabled(z);
            }
        }
    }

    private void ag() {
        boolean zAf = af();
        LogUtil.b("Track_SportEntranceFragment", "loadFragmentResources, isUserVisible=", Boolean.valueOf(this.as), ", needRestore=", Boolean.valueOf(!zAf));
        f();
        if (this.ah || !this.as || zAf) {
            return;
        }
        this.ca.d();
    }

    private boolean af() {
        ArrayList<qpm> arrayList = this.w;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    private void au() {
        a aVar = this.ad;
        if (aVar != null) {
            aVar.sendEmptyMessageDelayed(100, 60000L);
        }
    }

    private void f() {
        a aVar = this.ad;
        if (aVar != null) {
            aVar.removeMessages(100);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LoaderManager getLoaderManager() {
        return super.getLoaderManager();
    }

    public void c(Context context, boolean z, int i, int i2) {
        LogUtil.b("Track_SportEntranceFragment", "resolveOutterParams launchSource ", Integer.valueOf(i2), " sportType ", Integer.valueOf(i), " isSelected ", Boolean.valueOf(z));
        if (i2 == 1) {
            this.an = z;
            if (z) {
                SportMusicInteratorService.d();
                return;
            }
            return;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            a(context, i);
            return;
        }
        if (i2 == 9) {
            a(context, i);
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", 1);
            lmf.d().c(this.t, AnalyticsValue.REMIND_NOTIFICATION_CLICK_COUNT.value(), map, 0);
            return;
        }
        if (i2 == 10) {
            HashMap map2 = new HashMap(2);
            map2.put("click", 1);
            map2.put("type", 2);
            lmf.d().c(this.t, AnalyticsValue.REMIND_NOTIFICATION_CLICK_COUNT.value(), map2, 0);
            return;
        }
        if (i2 == 11) {
            LogUtil.b("Track_SportEntranceFragment", "goto jump rope fragment");
            a(context, i);
        } else if (i == 2) {
            LogUtil.b("Track_SportEntranceFragment", "goto plan fragment");
            a(context, 2);
        } else {
            LogUtil.e("Track_SportEntranceFragment", "resolveOutterParams do nothing from error launchSource");
        }
    }

    private void a(Context context, final int i) {
        LogUtil.b("Track_SportEntranceFragment", "gotoExactTabFromHealthModel sportType = ", Integer.valueOf(i));
        if (this.ah) {
            LogUtil.b("Track_SportEntranceFragment", "gotoExactTabFromHealthModel need goto ", Integer.valueOf(i));
            Context context2 = this.t;
            if (context2 != null) {
                context = context2;
            }
            this.t = context;
            tfi.h(context, i);
            return;
        }
        LogUtil.b("Track_SportEntranceFragment", "gotoExactTabFromHealthModel is not first in sport fragment");
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.25
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("Track_SportEntranceFragment", "jump to target tab in postUiThread");
                if (SportEntranceFragment.this.by == null || SportEntranceFragment.this.cd == null) {
                    return;
                }
                SportEntranceFragment.this.bs = i;
                tfi.h(SportEntranceFragment.this.t, SportEntranceFragment.this.bs);
                if (i == 2) {
                    SportEntranceFragment.this.by.setCurrentItem(((Integer) SportEntranceFragment.this.bz.get(i, 0)).intValue(), false);
                } else {
                    SportEntranceFragment.this.by.setCurrentItem(((Integer) SportEntranceFragment.this.bz.get(i, 0)).intValue());
                }
            }
        });
    }

    private void e(String str) {
        if (!this.an || str == null) {
            return;
        }
        LogUtil.b("Track_SportEntranceFragment", str.substring(0, 20));
        Intent intent = new Intent(str);
        d("sendActionToMusicService");
        BroadcastManagerUtil.a(this.t, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.t == null && isAdded()) {
            Context context = getContext();
            this.t = context;
            LogUtil.e("Track_SportEntranceFragment", str, " mContext is null, get it again ", context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bq() {
        this.bz.clear();
        for (int i = 0; i < this.w.size(); i++) {
            qpm qpmVar = this.w.get(i);
            if (qpmVar != null) {
                this.bz.put(qpmVar.c(), Integer.valueOf(i));
            }
        }
    }

    public static class e implements ScrollViewListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<KnitFragment> f25931c;
        private final WeakReference<SportEntranceFragment> e;

        public e(SportEntranceFragment sportEntranceFragment, KnitFragment knitFragment) {
            this.f25931c = new WeakReference<>(knitFragment);
            this.e = new WeakReference<>(sportEntranceFragment);
        }

        @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
        public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
            SportEntranceFragment sportEntranceFragment = this.e.get();
            KnitFragment knitFragment = this.f25931c.get();
            if (knitFragment != null && sportEntranceFragment != null) {
                if (sportEntranceFragment.am) {
                    sportEntranceFragment.ap();
                    if (sportEntranceFragment.bn > 0 && i2 >= sportEntranceFragment.bn && !sportEntranceFragment.al && ezi.b(i2, knitFragment.getScrollViewHeight(), knitFragment.getScrollViewRange())) {
                        sportEntranceFragment.u();
                    }
                    if (i2 > 0 || !sportEntranceFragment.al) {
                        return;
                    }
                    ezi.c(sportEntranceFragment.bj);
                    ViewGroup viewGroup = (knitFragment == null || !(knitFragment.getContentView() instanceof ViewGroup)) ? null : (ViewGroup) knitFragment.getContentView();
                    ViewGroup[] viewGroupArr = {sportEntranceFragment.cm, viewGroup};
                    LayoutTransition[] layoutTransitionArrB = viewGroup != null ? ezi.b(viewGroupArr) : null;
                    ezi.d(sportEntranceFragment.bp);
                    ezi.a(sportEntranceFragment.bm, 8);
                    if (viewGroup != null) {
                        ezi.c(sportEntranceFragment.ad, viewGroupArr, layoutTransitionArrB);
                    }
                    sportEntranceFragment.al = false;
                    return;
                }
                return;
            }
            LogUtil.d("Track_SportEntranceFragment", "sportEntranceFragment is null");
        }
    }

    static class c implements BaseResponseCallback<UserInfomation> {
        WeakReference<SportEntranceFragment> e;

        c(SportEntranceFragment sportEntranceFragment) {
            this.e = new WeakReference<>(sportEntranceFragment);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, UserInfomation userInfomation) {
            SportEntranceFragment sportEntranceFragment = this.e.get();
            if (sportEntranceFragment != null) {
                int iC = sportEntranceFragment.c(userInfomation);
                String strE = buh.e("coachGenderConfig");
                LogUtil.b("Track_SportEntranceFragment", "UserGenderCallback onResponse localGender = ", strE);
                int iJ = CommonUtil.j(strE);
                if ((TextUtils.isEmpty(strE) && iC == 0) || (iC != iJ && !TextUtils.isEmpty(strE))) {
                    LogUtil.b("Track_SportEntranceFragment", "UserGenderCallback onResponse localGender = ", strE, ", localGenderInt = ", Integer.valueOf(iJ), ", user = ", Integer.valueOf(iC));
                    sportEntranceFragment.j();
                }
                buh.d("coachGenderConfig", String.valueOf(iC));
                return;
            }
            LogUtil.e("Track_SportEntranceFragment", "fragment is null");
        }
    }

    private void d(boolean z) {
        Activity activity = this.bc;
        if (activity == null || !z) {
            LogUtil.e("Track_SportEntranceFragment", "showAutoIdentifyRecordDialog mParentActivity is null or user is not visible");
            return;
        }
        if (LoginInit.getInstance(activity).isBrowseMode()) {
            LogUtil.b("Track_SportEntranceFragment", "browse mode, not show auto identify record data");
            return;
        }
        if (Utils.o()) {
            LogUtil.b("Track_SportEntranceFragment", "isShowAutoRecordsGuideDialog the version is oversea");
        } else if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
            LogUtil.b("Track_SportEntranceFragment", "sync is not over");
        } else {
            bg();
        }
    }

    private void bg() {
        String str;
        boolean z;
        iyd iydVarD = ive.c().d(this.bc);
        if (!iydVarD.f() && ppt.b()) {
            str = "auto_identify_record_guide_cancel_for_walk";
            z = true;
        } else {
            str = "auto_identify_record_guide_cancel";
            z = false;
        }
        String strE = SharedPreferenceManager.e(this.bc, Integer.toString(10005), str);
        if ((!TextUtils.isEmpty(strE) && Boolean.parseBoolean(strE)) || iydVarD.e() || !szl.a(this.bc, iydVarD)) {
            e(this.bc);
        } else if (this.z) {
            LogUtil.b("Track_SportEntranceFragment", "auto detect dialog is showing");
        } else {
            szl.b(this.bc, iydVarD, z, new IBaseResponseCallback() { // from class: syd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f48799c.b(i, obj);
                }
            });
            this.z = true;
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (!(obj instanceof Boolean)) {
            LogUtil.e("Track_SportEntranceFragment", "showAutoRecordsGuideDialog objData is not instanceof Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            e(this.bc);
            this.z = false;
        } else {
            LogUtil.e("Track_SportEntranceFragment", "showAutoRecordsGuideDialog objData is false");
        }
    }

    private void e(final Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(10005), "auto_identify_record_history_cancel");
        if (!TextUtils.isEmpty(strE) && Boolean.parseBoolean(strE)) {
            LogUtil.b("Track_SportEntranceFragment", "clicked auto records history dialog cancel");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.24
                @Override // java.lang.Runnable
                public void run() {
                    szl.c(context, new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.24.4
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            Message messageObtain = Message.obtain();
                            messageObtain.obj = obj;
                            messageObtain.what = 103;
                            SportEntranceFragment.this.ad.sendMessage(messageObtain);
                        }
                    });
                }
            });
        }
    }
}
