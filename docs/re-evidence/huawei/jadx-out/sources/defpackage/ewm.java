package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Message;
import android.view.ViewGroup;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.functionsetcard.FunctionSetViewAdapter;
import com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetDataCallback;
import com.huawei.health.functionsetcard.dailymoment.operation.TimeTickReceiver;
import com.huawei.health.marketing.datatype.CycleRuleBase;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ewm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ewm f33556a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DailyMomentCardAdapter f33558c;
    private ResourceBriefInfo d;
    private List<SingleDailyMomentContent> e;
    private volatile boolean f;
    private ewq h;
    private TimeTickReceiver j;
    private int k;
    private FunctionSetViewAdapter m;
    private exc n;
    private d i = new d(this);
    private boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33557b = BaseApplication.b();

    public static ewm d() {
        ewm ewmVar;
        synchronized (ewm.class) {
            if (f33556a == null) {
                f33556a = new ewm();
            }
            ewmVar = f33556a;
        }
        return ewmVar;
    }

    private ewm() {
        this.f = true;
        boolean zN = n();
        LogUtil.a("DailyMomentManager", "showStatus: ", Boolean.valueOf(zN));
        if (zN) {
            d(true);
            m();
            if (this.g || !j()) {
                return;
            }
            l();
            return;
        }
        this.f = false;
        LogUtil.a("DailyMomentManager", "cached show status is false");
    }

    public DailyMomentCardAdapter.DailyMomentViewHolder a(ViewGroup viewGroup) {
        DailyMomentCardAdapter dailyMomentCardAdapter = this.f33558c;
        if (dailyMomentCardAdapter != null) {
            return dailyMomentCardAdapter.c(viewGroup);
        }
        return null;
    }

    public DailyMomentCardAdapter a() {
        return this.f33558c;
    }

    public final boolean j() {
        exc excVar;
        List<SingleDailyMomentContent> list;
        return (!this.f || (excVar = this.n) == null || !excVar.e() || (list = this.e) == null || list.isEmpty()) ? false : true;
    }

    public void f() {
        this.f = false;
        FunctionSetViewAdapter functionSetViewAdapter = this.m;
        if (functionSetViewAdapter != null) {
            functionSetViewAdapter.notifyDataSetChanged();
        }
        exc excVar = this.n;
        if (excVar != null) {
            excVar.b();
        }
        o();
    }

    private void o() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ewp
            @Override // java.lang.Runnable
            public final void run() {
                this.f33572b.g();
            }
        });
    }

    /* synthetic */ void g() {
        ResourceBriefInfo resourceBriefInfo = this.d;
        if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null) {
            LogUtil.j("DailyMomentManager", "mDailyMomentResBriefInfo is null or no rule");
            return;
        }
        CycleRuleBase triggerCycle = this.d.getMarketingRule().getTriggerCycle();
        if (triggerCycle == null || triggerCycle.getCycleType() != 1) {
            return;
        }
        LogUtil.a("DailyMomentManager", "ResourceName:", this.d.getResourceName(), " cycleRuleBase CYCLE_TYPE_SINGLE");
        fxl.b(5001, 1, this.d);
    }

    public void i() {
        LogUtil.a("DailyMomentManager", "refreshByAnotherDay");
        DailyMomentCardAdapter dailyMomentCardAdapter = this.f33558c;
        if (dailyMomentCardAdapter != null && dailyMomentCardAdapter.c()) {
            LogUtil.a("DailyMomentManager", "music is playing, delay refreshByAnotherDay");
            return;
        }
        if (this.f33557b == null) {
            return;
        }
        if (n()) {
            d(true);
            m();
            if (this.g || !j()) {
                return;
            }
            l();
            return;
        }
        this.f = false;
        LogUtil.a("DailyMomentManager", "cached show status is false");
    }

    public void k() {
        LogUtil.a("DailyMomentManager", "refreshByAnotherHour");
        DailyMomentCardAdapter dailyMomentCardAdapter = this.f33558c;
        if (dailyMomentCardAdapter != null && dailyMomentCardAdapter.c()) {
            LogUtil.a("DailyMomentManager", "music is playing, delay refreshByAnotherHour");
        } else {
            if (this.f33557b == null) {
                return;
            }
            d(false);
        }
    }

    public List<SingleDailyMomentContent> b() {
        return new ArrayList(this.e);
    }

    public void d(FunctionSetViewAdapter functionSetViewAdapter) {
        this.m = functionSetViewAdapter;
    }

    public ResourceBriefInfo h() {
        return this.d;
    }

    public void c() {
        s();
        this.j = null;
        DailyMomentCardAdapter dailyMomentCardAdapter = this.f33558c;
        if (dailyMomentCardAdapter != null) {
            dailyMomentCardAdapter.d();
            this.f33558c = null;
        }
        List<SingleDailyMomentContent> list = this.e;
        if (list != null) {
            list.clear();
            this.e = null;
        }
        exc.c();
        this.n = null;
        ewq.d();
        this.h = null;
    }

    public static void e() {
        LogUtil.a("DailyMomentManager", "release DailyMomentManager instance");
        synchronized (ewm.class) {
            ewm ewmVar = f33556a;
            if (ewmVar != null) {
                ewmVar.c();
                f33556a = null;
            }
        }
    }

    private boolean n() {
        exc excVarD = exc.d();
        this.n = excVarD;
        excVarD.a();
        return this.n.e();
    }

    private void d(boolean z) {
        LogUtil.a("DailyMomentManager", "initDailyMomentData");
        this.h = ewq.a();
        this.h.a(z, new IGetDataCallback() { // from class: ewm.2
            @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetDataCallback
            public void onComplete(List<SingleDailyMomentContent> list, ResourceBriefInfo resourceBriefInfo) {
                if (list != null && !list.isEmpty()) {
                    if (ewm.this.e != null) {
                        ewm.this.e.clear();
                    }
                    ewm.this.k = list.size();
                    ewm.this.e = new ArrayList(ewm.this.k);
                    ewm.this.e.addAll(list);
                    ewm.this.d = resourceBriefInfo;
                    if (!ewm.this.g && ewm.this.j()) {
                        ewm.this.l();
                    }
                    Iterator it = ewm.this.e.iterator();
                    while (it.hasNext()) {
                        LogUtil.a("DailyMomentManager", ((SingleDailyMomentContent) it.next()).toString());
                    }
                    ewm.this.d(201);
                    return;
                }
                LogUtil.e("DailyMomentManager", "request daily moment data failed");
                if (ewm.this.e != null) {
                    ewm.this.e.clear();
                    ewm.this.d(202);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.i.sendMessage(this.i.obtainMessage(i));
    }

    private void m() {
        if (this.f33558c == null) {
            this.f33558c = new DailyMomentCardAdapter(this.f33557b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("DailyMomentManager", "registerRefreshListener");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        TimeTickReceiver timeTickReceiver = new TimeTickReceiver(this);
        this.j = timeTickReceiver;
        Context context = this.f33557b;
        if (context != null) {
            context.registerReceiver(timeTickReceiver, intentFilter);
            this.g = true;
        }
    }

    private void s() {
        TimeTickReceiver timeTickReceiver;
        Context context = this.f33557b;
        if (context != null && (timeTickReceiver = this.j) != null && this.g) {
            context.unregisterReceiver(timeTickReceiver);
        }
        this.g = false;
    }

    static class d extends BaseHandler<ewm> {
        d(ewm ewmVar) {
            super(ewmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ewm ewmVar, Message message) {
            if (ewmVar != null && message != null) {
                switch (message.what) {
                    case 200:
                        if (ewmVar.f33558c != null) {
                            ewmVar.f33558c.b();
                        }
                        break;
                    case 201:
                        if (ewmVar.m != null) {
                            ewmVar.m.notifyItemInserted(1);
                        }
                        break;
                    case 202:
                        if (ewmVar.m != null) {
                            ewmVar.m.notifyItemRemoved(1);
                        }
                        break;
                }
                return;
            }
            LogUtil.a("DailyMomentManager", "obj or message is null");
        }
    }
}
