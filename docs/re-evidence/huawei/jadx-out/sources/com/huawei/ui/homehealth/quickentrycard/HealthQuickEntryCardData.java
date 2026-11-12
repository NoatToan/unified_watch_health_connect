package com.huawei.ui.homehealth.quickentrycard;

import android.content.Context;
import android.content.res.Configuration;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter;
import com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardData;
import defpackage.ezg;
import defpackage.gdy;
import defpackage.njy;
import defpackage.qrs;
import defpackage.smp;
import defpackage.sus;
import defpackage.suy;
import defpackage.suz;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes17.dex */
public class HealthQuickEntryCardData extends AbstractBaseCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25711a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f25712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f25713c;
    private final WeakReference<Context> d;
    private final QuickEntryFlowManager e;
    private MediaStatusSubscriber f;
    private List<Integer> g;
    private HealthQuickEntryCardViewHolder h;
    private final Observer i;
    private boolean j;

    public static /* synthetic */ void b(String str, Object[] objArr) {
        LogUtil.a("HealthQuickEntryCardData", "login status changed label = ", str, ", args = ", objArr);
        if (str != null && "com.huawei.plugin.account.logout".equals(str)) {
            smp.b().j(2);
            smp.b().c();
            smp.b().aa();
        }
    }

    public HealthQuickEntryCardData(Context context) {
        Observer observer = new Observer() { // from class: sug
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                HandlerExecutor.b(new Runnable() { // from class: suc
                    @Override // java.lang.Runnable
                    public final void run() {
                        HealthQuickEntryCardData.b(str, objArr);
                    }
                });
            }
        };
        this.i = observer;
        this.mPositionTag = 50;
        LogUtil.a("HealthQuickEntryCardData", "HealthQuickEntryCardData create");
        this.j = true;
        this.d = new WeakReference<>(context == null ? BaseApplication.getContext() : context);
        this.e = QuickEntryFlowManager.d();
        HiHealthManager.d(BaseApplication.getContext()).subscribeHiHealthData(103, new AnonymousClass4());
        smp smpVarB = smp.b();
        a aVar = new a(this, null);
        this.f = aVar;
        smpVarB.e(aVar);
        ObserverManagerUtil.d(observer, "com.huawei.plugin.account.logout");
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardData$4, reason: invalid class name */
    public class AnonymousClass4 implements HiSubscribeListener {
        AnonymousClass4() {
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            HealthQuickEntryCardData.this.g = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("HealthQuickEntryCardData", "subscribeHiHealthData onChange changeKey:", str, " type:", Integer.valueOf(i));
            if (i == 103 && "900100021".equals(str)) {
                QuickEntryDictionaryManager.a().a(new QuickEntryDictionaryManager.OnDictionaryCallback() { // from class: sum
                    @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager.OnDictionaryCallback
                    public final void onDictionaryResult(List list) {
                        this.d.e(list);
                    }
                });
            }
        }

        public /* synthetic */ void e(List list) {
            HealthQuickEntryCardData.this.g(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(List<String> list) {
        if (!suy.b().d()) {
            suy.b().e(!list.isEmpty());
        }
        if (Objects.equals(suy.b().e(), list)) {
            LogUtil.a("HealthQuickEntryCardData", "onDictionaryChange entryId is same");
        } else {
            this.f25712b = true;
            this.e.b(list);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LogUtil.a("HealthQuickEntryCardData", "getCardViewHolder");
        this.h = new HealthQuickEntryCardViewHolder(layoutInflater.inflate(R.layout.home_item_layout_quick_entry, viewGroup, false), c(), false);
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(c(), 1);
        this.f25713c = healthColumnSystem;
        this.f25711a = healthColumnSystem.j();
        d();
        return this.h;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "HealthQuickEntryCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        LogUtil.a("HealthQuickEntryCardData", "refreshCardData");
        this.e.e();
    }

    public void a() {
        LogUtil.a("HealthQuickEntryCardData", "clearCache");
        this.e.b();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        LogUtil.a("HealthQuickEntryCardData", BaseDialog.LIFE_CYCLE_ON_RESUME);
        b();
    }

    private void b() {
        if (LoginInit.getInstance(c()).isBrowseMode()) {
            this.h.b((List<ezg>) null);
            return;
        }
        boolean z = false;
        if (this.f25712b) {
            LogUtil.a("HealthQuickEntryCardData", "mIsDictionaryChange is true");
            this.f25712b = false;
            return;
        }
        final List<ezg> listC = QuickEntryFlowManager.d().c();
        if (listC == null) {
            LogUtil.a("HealthQuickEntryCardData", "quickEntryBeanList is null");
            return;
        }
        if (listC.size() == 2 && listC.stream().anyMatch(new Predicate() { // from class: sul
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return "entryHealthHeadline".equals(((ezg) obj).d());
            }
        })) {
            z = true;
        }
        if (listC.size() != 1 && !z) {
            LogUtil.a("HealthQuickEntryCardData", "quickEntryBeanList not equal one and isHasHealthHeadline false");
        } else {
            suz.d(listC, (ResponseCallback<ezg>) new ResponseCallback() { // from class: sui
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f48705a.c(listC, i, (ezg) obj);
                }
            });
        }
    }

    public /* synthetic */ void c(final List list, int i, ezg ezgVar) {
        HandlerExecutor.b(new Runnable() { // from class: suk
            @Override // java.lang.Runnable
            public final void run() {
                this.f48708b.b(list);
            }
        });
    }

    public /* synthetic */ void b(List list) {
        HealthQuickEntryCardViewHolder healthQuickEntryCardViewHolder = this.h;
        if (healthQuickEntryCardViewHolder != null) {
            healthQuickEntryCardViewHolder.b((List<ezg>) list);
        }
        if (njy.e(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezg ezgVar = (ezg) it.next();
            sb.append(ezgVar.d());
            sb.append(ezgVar.i());
            sb.append(ezgVar.j());
        }
        LogUtil.a("HealthQuickEntryCardData", "quickEntryBeanList:", sb.toString());
    }

    private void d() {
        LogUtil.a("HealthQuickEntryCardData", "initData");
        this.e.a(new QuickEntryFlowManager.QuickEntryDisplayCallback() { // from class: suo
            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryFlowManager.QuickEntryDisplayCallback
            public final void onDisplayEntries(List list) {
                this.f48709b.c(list);
            }
        });
        this.e.e();
    }

    public /* synthetic */ void c(final List list) {
        LogUtil.a("HealthQuickEntryCardData", "onDisplayEntries size:", Integer.valueOf(list != null ? list.size() : 0));
        HandlerExecutor.b(new Runnable() { // from class: suh
            @Override // java.lang.Runnable
            public final void run() {
                this.f48704a.d(list);
            }
        });
        suz.d((List<ezg>) list, (ResponseCallback<ezg>) new ResponseCallback() { // from class: suj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.b(list, i, (ezg) obj);
            }
        });
        e((List<ezg>) list);
    }

    public /* synthetic */ void d(List list) {
        HealthQuickEntryCardViewHolder healthQuickEntryCardViewHolder = this.h;
        if (healthQuickEntryCardViewHolder != null) {
            healthQuickEntryCardViewHolder.b((List<ezg>) list);
        }
    }

    public /* synthetic */ void b(final List list, int i, ezg ezgVar) {
        HandlerExecutor.b(new Runnable() { // from class: sud
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(list);
            }
        });
    }

    public /* synthetic */ void a(List list) {
        HealthQuickEntryCardViewHolder healthQuickEntryCardViewHolder = this.h;
        if (healthQuickEntryCardViewHolder != null) {
            healthQuickEntryCardViewHolder.b((List<ezg>) list);
        }
    }

    private void e(List<ezg> list) {
        LogUtil.a("HealthQuickEntryCardData", "doQuickEntryBi mIsFirst:", Boolean.valueOf(this.j));
        if (this.j) {
            this.j = false;
            if (njy.e(list)) {
                LogUtil.a("HealthQuickEntryCardData", "doQuickEntryBi entryBeans empty");
                sus.e(0, "not_set", null);
            } else {
                Iterator<ezg> it = list.iterator();
                while (it.hasNext()) {
                    sus.e(0, "valid_set", it.next());
                }
            }
        }
    }

    static class a extends MediaStatusSubscriberAdapter {
        private WeakReference<HealthQuickEntryCardData> d;

        /* synthetic */ a(HealthQuickEntryCardData healthQuickEntryCardData, AnonymousClass4 anonymousClass4) {
            this(healthQuickEntryCardData);
        }

        private a(HealthQuickEntryCardData healthQuickEntryCardData) {
            this.d = new WeakReference<>(healthQuickEntryCardData);
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            Bundle extras = playbackState.getExtras();
            if (extras == null || !"headLine".equals(extras.getString("category"))) {
                LogUtil.j("HealthQuickEntryCardData", "onPlaybackStateChanged headLine media false");
                return;
            }
            HealthQuickEntryCardData healthQuickEntryCardData = this.d.get();
            if (healthQuickEntryCardData != null) {
                healthQuickEntryCardData.i();
                LogUtil.a("HealthQuickEntryCardData", "onPlaybackStateChanged");
            } else {
                LogUtil.e("HealthQuickEntryCardData", "onPlaybackStateChanged cardData ref is null");
            }
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onMediaChanged(gdy gdyVar, int i) {
            LogUtil.a("HealthQuickEntryCardData", "onMediaChanged audioItem:", gdyVar, ",itemIndex:", Integer.valueOf(i));
            if (gdyVar == null || !"headLine".equals(gdyVar.c())) {
                LogUtil.j("HealthQuickEntryCardData", "onMediaChanged headLine media false");
                return;
            }
            HealthQuickEntryCardData healthQuickEntryCardData = this.d.get();
            if (healthQuickEntryCardData != null) {
                healthQuickEntryCardData.i();
            } else {
                LogUtil.e("HealthQuickEntryCardData", "onPlaybackStateChanged cardData ref is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!e()) {
            LogUtil.j("HealthQuickEntryCardData", "refreshHealthLineData isResumed false");
            return;
        }
        List<ezg> listC = QuickEntryFlowManager.d().c();
        if (njy.e(listC)) {
            LogUtil.j("HealthQuickEntryCardData", "refreshHealthLineData quickEntryBeanList is empty");
            return;
        }
        if (qrs.r()) {
            LogUtil.e("HealthQuickEntryCardData", " isFastClick");
        } else if (listC.size() > 2 || !listC.stream().anyMatch(new Predicate() { // from class: suf
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return "entryHealthHeadline".equals(((ezg) obj).d());
            }
        })) {
            LogUtil.j("HealthQuickEntryCardData", "refreshHealthLineData isHasHealthHeadline false");
        } else {
            b();
        }
    }

    private boolean e() {
        Context contextC = c();
        if (contextC instanceof ComponentActivity) {
            return ((ComponentActivity) contextC).getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
        }
        return false;
    }

    private Context c() {
        Context context = this.d.get();
        return context != null ? context : BaseApplication.getContext();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        ReleaseLogUtil.d("R_HealthQuickEntryCardData", "onDestroy");
        QuickEntryFlowManager quickEntryFlowManager = this.e;
        if (quickEntryFlowManager != null) {
            quickEntryFlowManager.a((QuickEntryFlowManager.QuickEntryDisplayCallback) null);
        }
        smp.b().c(new gdy());
        smp.b().c();
        HealthQuickEntryCardViewHolder healthQuickEntryCardViewHolder = this.h;
        if (healthQuickEntryCardViewHolder != null) {
            healthQuickEntryCardViewHolder.d();
            this.h = null;
        }
        if (!njy.e(this.g)) {
            HiHealthManager.d(BaseApplication.getContext()).unSubscribeHiHealthData(this.g, new HiUnSubscribeListener() { // from class: sue
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("HealthQuickEntryCardData", "unregisterSubscribeListener isSuccess:", Boolean.valueOf(z));
                }
            });
        }
        if (this.f != null) {
            smp.b().b(this.f);
        }
        ObserverManagerUtil.a(this.i, "com.huawei.plugin.account.logout");
        super.onDestroy();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f25713c.b(c());
        if (this.f25711a == this.f25713c.j()) {
            return;
        }
        this.f25711a = this.f25713c.j();
        HealthQuickEntryCardViewHolder healthQuickEntryCardViewHolder = this.h;
        if (healthQuickEntryCardViewHolder != null) {
            healthQuickEntryCardViewHolder.a();
        }
    }
}
