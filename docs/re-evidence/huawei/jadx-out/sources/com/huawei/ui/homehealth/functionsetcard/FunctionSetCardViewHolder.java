package com.huawei.ui.homehealth.functionsetcard;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.functionsetcard.FunctionSetViewAdapter;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.ICardChangedCallback;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.marketing.datatype.templates.FunctionCardTemplate;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver;
import com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.ewm;
import defpackage.fac;
import defpackage.fad;
import defpackage.fua;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qdm;
import defpackage.qre;
import defpackage.qrs;
import defpackage.sio;
import defpackage.sis;
import defpackage.skg;
import defpackage.sox;
import defpackage.tfb;
import defpackage.tfc;
import defpackage.tfi;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardViewHolder extends CardViewHolder implements FunctionSetCardObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sio f25421c;
    private ICardChangedCallback d;
    private HealthTextView e;
    private BroadcastReceiver f;
    private RelativeLayout g;
    private HealthColumnSystem h;
    private Handler i;
    private skg j;
    private List<FunctionSetSubCardData> k;
    private long l;
    private LinearLayout m;
    private long n;
    private boolean o;
    private Observer p;
    private HealthRecycleView q;
    private NoTitleCustomAlertDialog r;
    private HealthButton s;
    private BroadcastReceiver t;
    private WrapperStaggeredGridLayoutManager v;
    private View.OnClickListener x;
    private volatile FunctionSetViewAdapter y;

    /* JADX INFO: loaded from: classes43.dex */
    public interface IRequestCallback {
        void onSuccess(FunctionCardTemplate functionCardTemplate);
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardOrderChanged(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("FunctionSetCardViewHolder", "go to Card Management activity");
        if (getContext() != null) {
            try {
                getContext().startActivity(new Intent(getContext(), (Class<?>) FunctionSetCardManagementActivity.class));
            } catch (ActivityNotFoundException e) {
                LogUtil.e("FunctionSetCardViewHolder", "ActivityNotFoundException", e.getMessage());
            }
        }
        this.y.d(false);
    }

    FunctionSetCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.f25419a = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_130dp);
        this.f25420b = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_200dp);
        this.l = 0L;
        this.k = new CopyOnWriteArrayList();
        this.i = new Handler(Looper.getMainLooper());
        this.f = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    return;
                }
                int intExtra = intent.getIntExtra("refresh_type", -1);
                boolean zIsRunningForeground = BaseApplication.isRunningForeground();
                if (intExtra == 0) {
                    sis.e().b();
                    FunctionSetCardViewHolder.this.b(zIsRunningForeground);
                }
                if (intExtra == 9) {
                    for (FunctionSetSubCardData functionSetSubCardData : FunctionSetCardViewHolder.this.k) {
                        if (functionSetSubCardData instanceof skg) {
                            if (!zIsRunningForeground) {
                                functionSetSubCardData.setDataChangeOnBg(true);
                            } else {
                                functionSetSubCardData.readCardData();
                            }
                        }
                    }
                }
            }
        };
        this.x = new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                FunctionSetCardViewHolder.this.h();
                HashMap map = new HashMap(1);
                map.put("click", 1);
                map.put("from", 0);
                map.put("smartRecommend", Boolean.valueOf(FunctionSetCardViewHolder.this.f25421c.i()));
                lmf.d().c(FunctionSetCardViewHolder.this.getContext().getApplicationContext(), AnalyticsValue.HEALTH_HOME_MANAGERMENT_CARD_2010032.value(), map, 0);
            }
        };
        ReleaseLogUtil.e("R_FunctionSetCardViewHolder", "FunctionSetCardViewHolder called");
        this.o = qrs.af(BaseApplication.getActivity());
        this.d = new d(this);
        o();
        m();
    }

    private void m() {
        List<String> listB = sio.c().b();
        ReleaseLogUtil.d("R_FunctionSetCardViewHolder", "initSummary cardList ", listB);
        if (njy.e(listB)) {
            return;
        }
        List<String> listA = a(listB);
        qdm.a(listA, listB.size());
        ReleaseLogUtil.d("R_FunctionSetCardViewHolder", "initSummary list ", listA, " mLastRequestSummaryTime ", Long.valueOf(this.n));
        this.n = System.currentTimeMillis();
    }

    private List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList(3);
        if (list.contains(CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName())) {
            arrayList.add("activityRings");
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.BLOODPRESSURE_CARD.getName())) {
            arrayList.add(MessageConstant.BLOOD_PRESSURE_TYPE);
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.STRESS_CARD.getName())) {
            arrayList.add("emotionalHealth");
        }
        if (list.contains(CardFlowInteractors.CardNameConstants.HEARTRATE_CARD.getName())) {
            arrayList.add("heartHealth");
        }
        return arrayList;
    }

    public void j() {
        HealthColumnSystem healthColumnSystem = this.h;
        if (healthColumnSystem != null) {
            healthColumnSystem.b(getContext());
            WrapperStaggeredGridLayoutManager wrapperStaggeredGridLayoutManager = this.v;
            if (wrapperStaggeredGridLayoutManager != null) {
                wrapperStaggeredGridLayoutManager.setSpanCount(f());
            }
            boolean zAf = qrs.af(BaseApplication.getActivity());
            if (zAf != this.o && !fua.b(getContext())) {
                LogUtil.a("FunctionSetCardViewHolder", "Screen changed, notify all card, isWidescreen:", Boolean.valueOf(zAf));
                this.y.notifyDataSetChanged();
            }
            this.o = zAf;
        }
    }

    private void o() {
        sio sioVarC = sio.c();
        this.f25421c = sioVarC;
        sioVarC.a((FunctionSetCardObserver) this);
        this.h = new HealthColumnSystem(getContext(), 1);
        this.v = new WrapperStaggeredGridLayoutManager(f(), 1);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.itemView.findViewById(R.id.function_set_view);
        this.q = healthRecycleView;
        healthRecycleView.setFocusableInTouchMode(false);
        this.q.setIsScroll(false);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q.getLayoutParams();
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int iA = fac.a(getContext());
        int iD = fac.d(getContext());
        int iC = fac.c(getContext()) / 2;
        layoutParams.setMarginStart((iA - iC) + ((Integer) safeRegionWidth.first).intValue());
        layoutParams.setMarginEnd((iD - iC) + ((Integer) safeRegionWidth.first).intValue());
        g();
        this.y = new FunctionSetViewAdapter(this.k, getContext());
        this.y.setHasStableIds(true);
        ewm.d().d(this.y);
        this.q.setLayoutManager(this.v);
        this.q.setItemAnimator(null);
        this.q.setAdapter(this.y);
        this.g = (RelativeLayout) this.itemView.findViewById(R.id.function_set_no_card);
        this.m = (LinearLayout) this.itemView.findViewById(R.id.modify_cards_layout);
        this.e = (HealthTextView) this.itemView.findViewById(R.id.add_card);
        this.s = (HealthButton) this.itemView.findViewById(R.id.btn_modify_cards);
        if (!fua.s()) {
            this.e.setText(getContext().getString(R.string.IDS_hw_show_main_home_page_add_card));
            this.s.setText(getContext().getString(R.string.IDS_hw_health_home_edit_card));
            lrd.c(this.s, 1);
            lrd.b(this.s, getContext().getString(R.string.IDS_hw_health_home_edit_card));
        }
        lrd.c(this.s, 1);
        lrd.b(this.s, getContext().getString(R.string.IDS_custom_card));
        this.s.setOnClickListener(this.x);
        i();
        l();
        k();
        q();
        a();
        n();
        e(this.g);
        e(this.m);
    }

    private void e(View view) {
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int iB = qre.b(R.dimen.defaultPaddingStart);
        int iB2 = qre.b(R.dimen.defaultPaddingEnd);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(iB + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(iB2 + ((Integer) safeRegionWidth.second).intValue());
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private int f() {
        int iJ = this.h.j() / 2;
        LogUtil.a("FunctionSetCardViewHolder", "getCardColumNum CARD_WIDTH_MIN:", Integer.valueOf(this.f25419a), ", CARD_WIDTH_MAX", Integer.valueOf(this.f25420b), ", columNum", Integer.valueOf(iJ), ", SingleColumnWidth:", Float.valueOf(this.h.f()), ", getGutter:", Integer.valueOf(this.h.b()));
        if (this.h.a()) {
            if (this.f25420b < (this.h.f() * 2.0f) + this.h.b()) {
                return iJ + 1;
            }
            LogUtil.a("FunctionSetCardViewHolder", "getCardColumNum isPhoneScreen columNum:", Integer.valueOf(iJ));
            return iJ;
        }
        if (this.f25419a > (this.h.f() * 2.0f) + this.h.b()) {
            return iJ - 1;
        }
        LogUtil.a("FunctionSetCardViewHolder", "getCardColumNum is not PhoneScreen columNum:", Integer.valueOf(iJ));
        return iJ;
    }

    private void i() {
        HealthTextView healthTextView = (HealthTextView) this.itemView.findViewById(R.id.empty_card_prompt_text);
        healthTextView.setText(getContext().getString(R.string.IDS_hw_show_main_home_page_no_card_tips));
        if (LanguageUtil.p(getContext().getApplicationContext())) {
            healthTextView.setTextSize(1, 9.0f);
        } else {
            healthTextView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.textSizeBody2));
        }
    }

    public static class d implements ICardChangedCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<FunctionSetCardViewHolder> f25445b;

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardDelete(FunctionSetSubCardData functionSetSubCardData) {
        }

        d(FunctionSetCardViewHolder functionSetCardViewHolder) {
            this.f25445b = new WeakReference<>(functionSetCardViewHolder);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardChanged(final FunctionSetSubCardData functionSetSubCardData) {
            if (!HandlerExecutor.d()) {
                HandlerExecutor.c(new Runnable() { // from class: siq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(functionSetSubCardData);
                    }
                });
            } else {
                b(functionSetSubCardData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(FunctionSetSubCardData functionSetSubCardData) {
            FunctionSetCardViewHolder functionSetCardViewHolder = this.f25445b.get();
            if (functionSetCardViewHolder != null) {
                functionSetCardViewHolder.b(functionSetSubCardData);
            } else {
                LogUtil.j("FunctionSetCardViewHolder", "CardChangedCallback holder is null");
            }
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardScrolled(FunctionSetSubCardData functionSetSubCardData) {
            FunctionSetCardViewHolder functionSetCardViewHolder = this.f25445b.get();
            if (functionSetCardViewHolder != null) {
                if (functionSetCardViewHolder.y != null) {
                    int iA = functionSetCardViewHolder.y.a(functionSetSubCardData);
                    if (functionSetCardViewHolder.y.c(functionSetCardViewHolder.k, iA)) {
                        functionSetCardViewHolder.y.d(iA);
                        return;
                    }
                    LogUtil.a("FunctionSetCardViewHolder", "out of bounds: " + iA + ", mList size: " + functionSetCardViewHolder.k.size());
                    return;
                }
                LogUtil.a("FunctionSetCardViewHolder", "mViewAdapter is null");
                return;
            }
            LogUtil.j("FunctionSetCardViewHolder", "CardChangedCallback holder is null");
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public View loadMarketingView(String str, int i) {
            FunctionSetCardViewHolder functionSetCardViewHolder = this.f25445b.get();
            if (functionSetCardViewHolder != null) {
                return functionSetCardViewHolder.f25421c.c(str, functionSetCardViewHolder.y.c(i));
            }
            LogUtil.a("FunctionSetCardViewHolder", "CardChangedCallback holder is null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FunctionSetSubCardData functionSetSubCardData) {
        LogUtil.a("FunctionSetCardViewHolder", "notify recevied");
        if (this.y == null) {
            LogUtil.a("FunctionSetCardViewHolder", "mViewAdapter is null");
            return;
        }
        int iA = this.y.a(functionSetSubCardData);
        LogUtil.a("FunctionSetCardViewHolder", "data changed, position: " + iA);
        if (!this.y.c(this.k, iA)) {
            LogUtil.a("FunctionSetCardViewHolder", "out of bounds: " + iA + ", mList size: " + this.k.size());
            return;
        }
        if (this.l == 0 || SystemClock.elapsedRealtime() - this.l > 2000) {
            if (functionSetSubCardData.hasCardData() && !functionSetSubCardData.hasCardDataLastTime()) {
                tfb.b(functionSetSubCardData, 1, this.f25421c.i());
            }
            this.l = SystemClock.elapsedRealtime();
        }
        c(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        HealthRecycleView healthRecycleView = this.q;
        if (healthRecycleView == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyItemChanged mRecyclerView is null");
        } else if (healthRecycleView.isComputingLayout()) {
            LogUtil.a("FunctionSetCardViewHolder", "mRecyclerView isComputingLayout");
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.14
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.c(i);
                }
            }, 50L);
        } else {
            LogUtil.a("FunctionSetCardViewHolder", "mViewAdapter notifyItemChanged");
            this.y.notifyItemChanged(i);
        }
    }

    private void g() {
        List<CardConstructor> listA = this.f25421c.a();
        if (njy.e(listA)) {
            LogUtil.j("FunctionSetCardViewHolder", "initCard mViewAdapter or cardConstructors is null");
        } else {
            this.k.clear();
            this.k.addAll(tfc.a(getContext(), listA, this.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (njy.e(this.k)) {
            this.g.setVisibility(0);
            this.g.setOnClickListener(this.x);
            this.m.setVisibility(8);
        } else {
            this.g.setVisibility(8);
            this.m.setVisibility(0);
            if (fua.s()) {
                return;
            }
            this.s.setText(getContext().getString(R.string.IDS_hw_health_home_edit_card));
        }
    }

    private void k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        LocalBroadcastManager.getInstance().registerReceiver(this.f, intentFilter);
        LogUtil.a("FunctionSetCardViewHolder", "mHiBroadcastReceiver register success", this);
    }

    private void w() {
        if (this.f != null) {
            try {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.f);
                LogUtil.a("FunctionSetCardViewHolder", "mHiBroadcastReceiver unregister", this);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("FunctionSetCardViewHolder", "IllegalArgumentException mHiBroadcastReceiver unregister");
            }
        }
    }

    private void q() {
        if (this.t != null) {
            LogUtil.j("FunctionSetCardViewHolder", "registerProcessRestart mProcessReceiver has registered");
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.15
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("processName");
                boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
                LogUtil.a("FunctionSetCardViewHolder", "processName: ", stringExtra, " isRunning: ", Boolean.valueOf(booleanExtra), " time: ", Long.valueOf(intent.getLongExtra("time", 0L)));
                if (XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra) && booleanExtra) {
                    ReleaseLogUtil.d("FunctionSetCardViewHolder", "DaemonService restart, subscribe again");
                    FunctionSetCardViewHolder.this.t();
                    WheelChairStateManager.a().i();
                    WheelChairStateManager.a().j();
                }
            }
        };
        this.t = broadcastReceiver;
        BroadcastManager.a(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtil.a("FunctionSetCardViewHolder", "resubscribeAllCard");
        for (FunctionSetSubCardData functionSetSubCardData : this.k) {
            LogUtil.a("FunctionSetCardViewHolder", "resubscribeAllCard, reader: ", functionSetSubCardData);
            if (functionSetSubCardData != null) {
                functionSetSubCardData.unsubscribeDataChange();
                functionSetSubCardData.subscribeDataChange();
            }
        }
    }

    private void s() {
        BroadcastReceiver broadcastReceiver = this.t;
        if (broadcastReceiver != null) {
            BroadcastManager.m(broadcastReceiver);
            this.t = null;
        }
    }

    public void d() {
        ReleaseLogUtil.d("R_FunctionSetCardViewHolder", "onResume mLastRequestSummaryTime ", Long.valueOf(this.n));
        if (Math.abs(System.currentTimeMillis() - this.n) > 600000 || !lsl.aa(this.n)) {
            m();
        }
        for (FunctionSetSubCardData functionSetSubCardData : this.k) {
            LogUtil.a("FunctionSetCardViewHolder", "reader: ", functionSetSubCardData);
            if (functionSetSubCardData != null) {
                functionSetSubCardData.onResume();
            }
        }
        this.f25421c.o();
    }

    public void e() {
        tfb.c(getContext(), this.k, this.f25421c.i());
        for (FunctionSetSubCardData functionSetSubCardData : this.k) {
            if (functionSetSubCardData != null) {
                functionSetSubCardData.onDestroy();
            }
        }
        this.f25421c.d(this);
        w();
        s();
        b();
        ObserverManagerUtil.a(this.p, "PRESS_HODLE_DELETE_CARD");
    }

    public void c() {
        w();
        this.f25421c.d(this);
    }

    public void b() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HealthRecycleView healthRecycleView = this.q;
        if (healthRecycleView != null) {
            healthRecycleView.setOnScrollListener(null);
            this.q = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        if (this.y != null) {
            this.y.c();
        }
        List<FunctionSetSubCardData> list = this.k;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtil.a("FunctionSetCardViewHolder", "refreshAllCard");
        for (FunctionSetSubCardData functionSetSubCardData : this.k) {
            LogUtil.a("FunctionSetCardViewHolder", "refreshAllCard, reader: ", functionSetSubCardData);
            if (functionSetSubCardData != null) {
                if (functionSetSubCardData instanceof FunctionSetBeanReader) {
                    ((FunctionSetBeanReader) functionSetSubCardData).setRefreshReason(0);
                }
                if (!z) {
                    functionSetSubCardData.setDataChangeOnBg(true);
                } else {
                    functionSetSubCardData.readCardData();
                }
            }
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyAllCardChanged() {
        if (this.i == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyAllCardChanged mHandler is null");
            return;
        }
        LogUtil.a("FunctionSetCardViewHolder", "notifyAllCardChanged");
        final List<CardConstructor> listA = this.f25421c.a();
        this.i.post(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.13
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetCardViewHolder.this.c((List<CardConstructor>) listA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<CardConstructor> list) {
        this.y.a(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.12
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(10);
                if (njy.b(FunctionSetCardViewHolder.this.k)) {
                    arrayList.addAll(FunctionSetCardViewHolder.this.k);
                }
                FunctionSetCardViewHolder.this.k.clear();
                FunctionSetCardViewHolder.this.k.addAll(tfc.d(FunctionSetCardViewHolder.this.getContext(), arrayList, list, FunctionSetCardViewHolder.this.d));
                FunctionSetCardViewHolder.this.y.notifyDataSetChanged();
                FunctionSetCardViewHolder.this.l();
                FunctionSetCardViewHolder.this.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.11
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetCardViewHolder.this.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        CardConfig cardConfig;
        for (FunctionSetSubCardData functionSetSubCardData : this.k) {
            if (functionSetSubCardData != null && (cardConfig = functionSetSubCardData.getCardConfig()) != null && "PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
                SharedPreferenceManager.e(getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", "true", new StorageParams());
                return;
            }
        }
        SharedPreferenceManager.e(getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", "false", new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, boolean z) {
        if ("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str)) {
            SharedPreferenceManager.e(getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY", z ? "true" : "false", new StorageParams());
        }
    }

    private void n() {
        HandlerExecutor.c(new b(this), 10000L);
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<FunctionSetCardViewHolder> f25443a;

        b(FunctionSetCardViewHolder functionSetCardViewHolder) {
            this.f25443a = new WeakReference<>(functionSetCardViewHolder);
        }

        @Override // java.lang.Runnable
        public void run() {
            FunctionSetCardViewHolder functionSetCardViewHolder = this.f25443a.get();
            if (functionSetCardViewHolder == null) {
                LogUtil.a("FunctionSetCardViewHolder", "holder ref is null");
                return;
            }
            String strE = SharedPreferenceManager.e(functionSetCardViewHolder.getContext(), Integer.toString(10100), "PHYSIOLOGICAL_SHOW_STATE_KEY");
            LogUtil.a("FunctionSetCardViewHolder", "initPhyscialCycleShowStatusSp value: ", strE);
            if (TextUtils.isEmpty(strE)) {
                functionSetCardViewHolder.r();
            }
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(final String str, final boolean z) {
        LogUtil.a("FunctionSetCardViewHolder", "notifyCardShowStatusChanged cardId");
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyCardShowStatusChanged mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.20
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.a(str, z, false);
                    FunctionSetCardViewHolder.this.e(str, z);
                    FunctionSetCardViewHolder.this.l();
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardShowStatusChanged(final List<String> list, final boolean z) {
        LogUtil.a("FunctionSetCardViewHolder", "notifyCardShowStatusChanged cardIds");
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyCardShowStatusChanged mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.16
                @Override // java.lang.Runnable
                public void run() {
                    for (String str : list) {
                        FunctionSetCardViewHolder.this.a(str, z, false);
                        FunctionSetCardViewHolder.this.e(str, z);
                    }
                    FunctionSetCardViewHolder.this.l();
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardInsert(final String str) {
        LogUtil.a("FunctionSetCardViewHolder", "notifyCardInsert cardId: ", str);
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyCardShowStatusChanged mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.c(str, -1);
                    FunctionSetCardViewHolder.this.l();
                }
            });
        }
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.FunctionSetCardObserver
    public void notifyCardReplace(final String str, final String str2) {
        LogUtil.a("FunctionSetCardViewHolder", "notifyCardReplace hideCardId: ", str, " showCardId", str2);
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.j("FunctionSetCardViewHolder", "notifyCardReplace mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.5
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.b(str, str2);
                    FunctionSetCardViewHolder.this.l();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, boolean z2) {
        LogUtil.a("FunctionSetCardViewHolder", "changeCardShowStatus cardId = ", str, " isShow = ", Boolean.valueOf(z));
        if (StringUtils.g(str) || this.y == null) {
            LogUtil.j("FunctionSetCardViewHolder", "changeCardShowStatus cardId or mViewAdapter is null");
            return;
        }
        if (!z2 && "PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str) && this.f25421c.g()) {
            LogUtil.a("FunctionSetCardViewHolder", "IsUpdateBuUser, PHYSIOLOGICAL no changed by gender");
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.k.size()) {
                i = -1;
                break;
            } else if (str.equals(this.k.get(i).getCardId())) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            LogUtil.a("FunctionSetCardViewHolder", "changeCardShowStatus add card,  position = ", Integer.valueOf(i));
            c(str, i);
            return;
        }
        if (i >= 0) {
            LogUtil.a("FunctionSetCardViewHolder", "changeCardShowStatus remove card,  position = ", Integer.valueOf(i));
            FunctionSetSubCardData functionSetSubCardData = this.k.get(i);
            this.k.remove(i);
            this.y.notifyItemRemoved(i);
            if (i != this.k.size()) {
                this.y.notifyItemRangeChanged(i, this.k.size() - i);
            }
            if (functionSetSubCardData != null) {
                functionSetSubCardData.onDestroy();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        LogUtil.a("FunctionSetCardViewHolder", "replaceCard showCardId = ", str2, " hideCardId = ", str);
        if (StringUtils.g(str2) || this.y == null || StringUtils.g(str)) {
            LogUtil.j("FunctionSetCardViewHolder", "changeCardShowStatus cardId or mViewAdapter is null");
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.k.size()) {
                i = -1;
                break;
            } else if (str.equals(this.k.get(i).getCardId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            LogUtil.a("FunctionSetCardViewHolder", "changeCardShowStatus remove card,  position = ", Integer.valueOf(i));
            FunctionSetSubCardData functionSetSubCardData = this.k.get(i);
            this.k.remove(i);
            this.y.notifyItemRemoved(this.y.a(i));
            if (functionSetSubCardData != null) {
                functionSetSubCardData.onDestroy();
            }
        }
        b(str2, -1);
    }

    private void b(String str, int i) {
        List<CardConstructor> listA = this.f25421c.a();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            CardConstructor cardConstructor = listA.get(i2);
            if (str.equals(cardConstructor.getCardId())) {
                LogUtil.a("FunctionSetCardViewHolder", "insertNewCardByCardId fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
                tfb.e(getContext(), e(cardConstructor, i, i2), this.f25421c.i(), 2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        List<CardConstructor> listA = this.f25421c.a();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            CardConstructor cardConstructor = listA.get(i2);
            if (str.equals(cardConstructor.getCardId())) {
                if (i != i2) {
                    LogUtil.a("FunctionSetCardViewHolder", "addNewCardByCardId fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
                    tfb.e(getContext(), e(cardConstructor, i, i2), this.f25421c.i(), 2);
                    return;
                }
                return;
            }
        }
    }

    private FunctionSetSubCardData e(CardConstructor cardConstructor, int i, int i2) {
        if (i2 >= this.k.size()) {
            if (i < 0) {
                FunctionSetSubCardData functionSetSubCardDataCreateCardReader = cardConstructor.createCardReader(getContext());
                functionSetSubCardDataCreateCardReader.setNotifyCardChangedCallback(this.d);
                functionSetSubCardDataCreateCardReader.setCardConstructor(cardConstructor);
                this.k.add(functionSetSubCardDataCreateCardReader);
                this.y.notifyItemInserted(this.k.size() - 1);
                LogUtil.a("FunctionSetCardViewHolder", "add new card to end");
                return functionSetSubCardDataCreateCardReader;
            }
            LogUtil.j("FunctionSetCardViewHolder", "swap card fromPosition = ", Integer.valueOf(i));
            return null;
        }
        if (i >= 0) {
            Collections.swap(this.k, i, i2);
            this.y.notifyItemMoved(i, i2);
            LogUtil.a("FunctionSetCardViewHolder", "swap card, fromPosition = ", Integer.valueOf(i), " toPosition = ", Integer.valueOf(i2));
            return null;
        }
        LogUtil.j("FunctionSetCardViewHolder", "add new card to position, toPosition = ", Integer.valueOf(i2));
        FunctionSetSubCardData functionSetSubCardDataCreateCardReader2 = cardConstructor.createCardReader(getContext());
        functionSetSubCardDataCreateCardReader2.setNotifyCardChangedCallback(this.d);
        functionSetSubCardDataCreateCardReader2.setCardConstructor(cardConstructor);
        this.k.add(i2, functionSetSubCardDataCreateCardReader2);
        this.y.notifyDataSetChanged();
        return functionSetSubCardDataCreateCardReader2;
    }

    static class WrapperStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public WrapperStaggeredGridLayoutManager(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                ReleaseLogUtil.a("R_FunctionSetCardViewHolder", "functionSetCardViewHolder RecyclerView onLayoutChildren exception. message = ", e.getMessage());
            }
        }
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FunctionSetCardViewHolder> f25444c;

        c(FunctionSetCardViewHolder functionSetCardViewHolder) {
            this.f25444c = new WeakReference<>(functionSetCardViewHolder);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (objArr == null) {
                LogUtil.j("FunctionSetCardViewHolder", "args is null");
                return;
            }
            if (objArr.length >= 2 && (objArr[1] instanceof String)) {
                FunctionSetCardViewHolder functionSetCardViewHolder = this.f25444c.get();
                if (functionSetCardViewHolder != null) {
                    functionSetCardViewHolder.e((String) objArr[1], (FunctionSetSubCardData) objArr[0]);
                } else {
                    LogUtil.j("FunctionSetCardViewHolder", "DeleteCardObserver holder is null");
                }
            }
        }
    }

    public void a() {
        c cVar = new c(this);
        this.p = cVar;
        ObserverManagerUtil.d(cVar, "PRESS_HODLE_DELETE_CARD");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, FunctionSetSubCardData functionSetSubCardData) {
        CardConfig cardConfig;
        if ("1".equals(str)) {
            if (functionSetSubCardData == null || (cardConfig = functionSetSubCardData.getCardConfig()) == null) {
                return;
            }
            d(cardConfig, functionSetSubCardData);
            return;
        }
        if ("2".equals(str)) {
            h();
            tfb.e(getContext(), this.f25421c.i(), 2);
            tfb.c(getContext(), this.f25421c.i(), 1, functionSetSubCardData);
        } else if ("3".equals(str)) {
            tfb.c(getContext(), functionSetSubCardData);
            fad.d(functionSetSubCardData.getCardId());
        } else if ("4".equals(str)) {
            tfb.e(getContext(), this.f25421c.i(), 0);
        } else if ("5".equals(str)) {
            tfb.e(getContext(), this.f25421c.i(), 3);
        } else if ("6".equals(str)) {
            tfb.d(getContext(), functionSetSubCardData);
        }
    }

    private void d(CardConfig cardConfig, FunctionSetSubCardData functionSetSubCardData) {
        if ("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
            a(cardConfig, functionSetSubCardData);
        } else {
            e(cardConfig, functionSetSubCardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.4
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.e(cardConfig, functionSetSubCardData);
                }
            });
            return;
        }
        e(cardConfig.getCardId(), false);
        tfb.e(getContext(), 0, functionSetSubCardData, this.k, this.f25421c.i(), 0);
        a(cardConfig.getCardId(), false, true);
        this.f25421c.b(cardConfig);
        LogUtil.a("FunctionSetCardViewHolder", "hide card cardId: " + cardConfig.getCardId());
        tfb.e(getContext(), this.f25421c.i(), 1);
        tfb.b(functionSetSubCardData, 3, sio.c().i());
    }

    private void a(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData) {
        LogUtil.a("FunctionSetCardViewHolder", "processPhysiologicalCycleCardDelete");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.1
            @Override // java.lang.Runnable
            public void run() {
                String strJ = tfi.j(FunctionSetCardViewHolder.this.getContext());
                if (strJ == null) {
                    LogUtil.e("FunctionSetCardViewHolder", "getMenstrualSwitch is null.");
                    FunctionSetCardViewHolder.this.e(cardConfig, functionSetSubCardData);
                } else {
                    if ("".equals(strJ)) {
                        FunctionSetCardViewHolder.this.d(cardConfig, functionSetSubCardData, strJ);
                        return;
                    }
                    try {
                        if (new JSONObject(strJ).getInt("masterSwitch") == 1) {
                            FunctionSetCardViewHolder.this.d(cardConfig, functionSetSubCardData, strJ);
                            return;
                        }
                    } catch (JSONException unused) {
                        LogUtil.e("FunctionSetCardViewHolder", "setPhysicalCycleSwitch JSONException.");
                    }
                    FunctionSetCardViewHolder.this.e(cardConfig, functionSetSubCardData);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final CardConfig cardConfig, final FunctionSetSubCardData functionSetSubCardData, final String str) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.8
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardViewHolder.this.d(cardConfig, functionSetSubCardData, str);
                }
            });
            return;
        }
        if (this.r == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getContext());
            builder.a(getContext().getResources().getString(R.string.IDS_physiological_cycle_hide_card_dialog_content)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FunctionSetCardViewHolder.this.d(str);
                    FunctionSetCardViewHolder.this.p();
                    FunctionSetCardViewHolder.this.e(cardConfig, functionSetSubCardData);
                }
            });
            this.r = builder.c();
        }
        if (this.r.isShowing()) {
            return;
        }
        this.r.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.FunctionSetCardViewHolder.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ArrayList arrayList = new ArrayList(5);
                    arrayList.add("masterSwitch");
                    arrayList.add("menstrualStartSwitch");
                    arrayList.add("menstrualEndSwitch");
                    arrayList.add("easyPregnancyStartSwitch");
                    arrayList.add("easyPregnancyEndSwitch");
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONObject.put((String) it.next(), 0);
                    }
                    HiUserPreference userPreference = HiHealthManager.d(FunctionSetCardViewHolder.this.getContext()).getUserPreference("com.huawei.health.mc");
                    if (userPreference == null) {
                        ReleaseLogUtil.e("FunctionSetCardViewHolder", "setPhysicalCycleSwitch userPreference is null");
                        return;
                    }
                    userPreference.setValue(jSONObject.toString());
                    userPreference.setSyncStatus(0);
                    HiHealthManager.d(FunctionSetCardViewHolder.this.getContext()).setUserPreference(userPreference);
                } catch (JSONException unused) {
                    LogUtil.e("FunctionSetCardViewHolder", "setPhysicalCycleSwitch JSONException.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
        menstrualSwitchStatus.setMasterSwitch(0);
        menstrualSwitchStatus.setMenstruationStartRemindSwitch(0);
        menstrualSwitchStatus.setMenstruationEndRemindSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyStartSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyEndSwitch(0);
        sox.d().a(menstrualSwitchStatus);
    }
}
