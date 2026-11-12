package bf;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import cf.m;
import cf.t;
import df.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o53.l1;
import ue.u;
import vb.h;
import ve.e;
import ve.p;
import ve.t0;
import ye.g;
import ye.j;

/* JADX INFO: loaded from: classes7.dex */
public class c implements g, e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f17780j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f17781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef.b f17782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f17784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f17785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f17786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f17787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f17788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SystemForegroundService f17789i;

    static {
        u.b("SystemFgDispatcher");
    }

    public c(Context context) {
        this.f17783c = new Object();
        t0 t0VarG = t0.g(context);
        this.f17781a = t0VarG;
        this.f17782b = t0VarG.f177607e;
        this.f17784d = null;
        this.f17785e = new LinkedHashMap();
        this.f17787g = new HashMap();
        this.f17786f = new HashMap();
        this.f17788h = new j(t0VarG.f177613k);
        t0VarG.f177609g.a(this);
    }

    public static Intent a(Context context, m mVar, ue.m mVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.f26929a);
        intent.putExtra("KEY_GENERATION", mVar.f26930b);
        intent.putExtra("KEY_NOTIFICATION_ID", mVar2.f170111a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar2.f170112b);
        intent.putExtra("KEY_NOTIFICATION", mVar2.f170113c);
        return intent;
    }

    @Override // ve.e
    public final void b(m mVar, boolean z14) {
        Map.Entry entry;
        synchronized (this.f17783c) {
            try {
                l1 l1Var = ((t) this.f17786f.remove(mVar)) != null ? (l1) this.f17787g.remove(mVar) : null;
                if (l1Var != null) {
                    l1Var.c(null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ue.m mVar2 = (ue.m) this.f17785e.remove(mVar);
        if (mVar.equals(this.f17784d)) {
            if (this.f17785e.size() > 0) {
                Iterator it = this.f17785e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f17784d = (m) entry.getKey();
                if (this.f17789i != null) {
                    ue.m mVar3 = (ue.m) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f17789i;
                    int i14 = mVar3.f170111a;
                    int i15 = mVar3.f170112b;
                    Notification notification = mVar3.f170113c;
                    systemForegroundService.getClass();
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 31) {
                        SystemForegroundService.b.a(systemForegroundService, i14, notification, i15);
                    } else if (i16 >= 29) {
                        SystemForegroundService.a.a(systemForegroundService, i14, notification, i15);
                    } else {
                        systemForegroundService.startForeground(i14, notification);
                    }
                    this.f17789i.f11492d.cancel(mVar3.f170111a);
                }
            } else {
                this.f17784d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f17789i;
        if (mVar2 == null || systemForegroundService2 == null) {
            return;
        }
        u uVarA = u.a();
        mVar.toString();
        uVarA.getClass();
        systemForegroundService2.f11492d.cancel(mVar2.f170111a);
    }

    public final void c(Intent intent) {
        if (this.f17789i == null) {
            h.z("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i14 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        m mVar = new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        u.a().getClass();
        if (notification == null) {
            h.s("Notification passed in the intent was null.");
            return;
        }
        ue.m mVar2 = new ue.m(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f17785e;
        linkedHashMap.put(mVar, mVar2);
        ue.m mVar3 = (ue.m) linkedHashMap.get(this.f17784d);
        if (mVar3 == null) {
            this.f17784d = mVar;
        } else {
            this.f17789i.f11492d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i14 |= ((ue.m) ((Map.Entry) it.next()).getValue()).f170112b;
                }
                mVar2 = new ue.m(mVar3.f170111a, mVar3.f170113c, i14);
            } else {
                mVar2 = mVar3;
            }
        }
        SystemForegroundService systemForegroundService = this.f17789i;
        int i15 = mVar2.f170111a;
        int i16 = mVar2.f170112b;
        Notification notification2 = mVar2.f170113c;
        systemForegroundService.getClass();
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i15, notification2, i16);
        } else if (i17 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i15, notification2, i16);
        } else {
            systemForegroundService.startForeground(i15, notification2);
        }
    }

    @Override // ye.g
    public final void d(t tVar, ye.b bVar) {
        if (bVar instanceof ye.b.C3684b) {
            String str = tVar.f26941a;
            u.a().getClass();
            m mVarW = jg.b.w(tVar);
            int i14 = ((ye.b.C3684b) bVar).f196779a;
            t0 t0Var = this.f17781a;
            t0Var.f177607e.b(new s(t0Var.f177609g, new ve.u(mVarW), true, i14));
        }
    }

    public final void e() {
        this.f17789i = null;
        synchronized (this.f17783c) {
            try {
                Iterator it = this.f17787g.values().iterator();
                while (it.hasNext()) {
                    ((l1) it.next()).c(null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        p pVar = this.f17781a.f177609g;
        synchronized (pVar.f177591k) {
            pVar.f177590j.remove(this);
        }
    }

    public final void f(int i14, int i15) {
        u.a().getClass();
        for (Map.Entry entry : this.f17785e.entrySet()) {
            if (((ue.m) entry.getValue()).f170112b == i15) {
                m mVar = (m) entry.getKey();
                t0 t0Var = this.f17781a;
                t0Var.f177607e.b(new s(t0Var.f177609g, new ve.u(mVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f17789i;
        if (systemForegroundService != null) {
            systemForegroundService.f11490b = true;
            u.a().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i14);
        }
    }

    public c(Context context, t0 t0Var, j jVar) {
        this.f17783c = new Object();
        this.f17781a = t0Var;
        this.f17782b = t0Var.f177607e;
        this.f17784d = null;
        this.f17785e = new LinkedHashMap();
        this.f17787g = new HashMap();
        this.f17786f = new HashMap();
        this.f17788h = jVar;
        t0Var.f177609g.a(this);
    }
}
