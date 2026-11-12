package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import defpackage.enr;
import defpackage.m1p;
import defpackage.ppe;
import defpackage.q0a;
import defpackage.tf8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements OnConstraintsStateChangedListener, tf8 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3223k = ppe.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public enr f3225b;
    public final m1p c;
    public final Object d = new Object();
    public WorkGenerationalId e;
    public final Map<WorkGenerationalId, q0a> f;
    public final Map<WorkGenerationalId, WorkSpec> g;
    public final Map<WorkGenerationalId, Job> h;
    public final WorkConstraintsTracker i;
    public b j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0088a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3226a;

        public RunnableC0088a(String str) {
            this.f3226a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec workSpecG = a.this.f3225b.g().g(this.f3226a);
            if (workSpecG == null || !workSpecG.hasConstraints()) {
                return;
            }
            synchronized (a.this.d) {
                a.this.g.put(WorkSpecKt.generationalId(workSpecG), workSpecG);
                a aVar = a.this;
                a.this.h.put(WorkSpecKt.generationalId(workSpecG), WorkConstraintsTrackerKt.listen(aVar.i, workSpecG, aVar.c.a(), a.this));
            }
        }
    }

    public interface b {
        void a(int i, Notification notification);

        void c(int i, int i2, Notification notification);

        void d(int i);

        void stop();
    }

    public a(Context context) {
        this.f3224a = context;
        enr enrVarE = enr.e(context);
        this.f3225b = enrVarE;
        this.c = enrVarE.l();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new WorkConstraintsTracker(this.f3225b.i());
        this.f3225b.g().e(this);
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, WorkGenerationalId workGenerationalId, q0a q0aVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", q0aVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q0aVar.a());
        intent.putExtra("KEY_NOTIFICATION", q0aVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, q0a q0aVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", q0aVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q0aVar.a());
        intent.putExtra("KEY_NOTIFICATION", q0aVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.tf8
    public void c(WorkGenerationalId workGenerationalId, boolean z) {
        Map.Entry<WorkGenerationalId, q0a> entry;
        synchronized (this.d) {
            try {
                Job jobRemove = this.g.remove(workGenerationalId) != null ? this.h.remove(workGenerationalId) : null;
                if (jobRemove != null) {
                    jobRemove.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        q0a q0aVarRemove = this.f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, q0a>> it = this.f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, q0a> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.e = entry.getKey();
                if (this.j != null) {
                    q0a value = entry.getValue();
                    this.j.c(value.c(), value.a(), value.b());
                    this.j.d(value.c());
                }
            } else {
                this.e = null;
            }
        }
        b bVar = this.j;
        if (q0aVarRemove == null || bVar == null) {
            return;
        }
        ppe.e().a(f3223k, "Removing Notification (id: " + q0aVarRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + q0aVarRemove.a());
        bVar.d(q0aVarRemove.c());
    }

    public final void h(Intent intent) {
        ppe.e().f(f3223k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3225b.cancelWorkById(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        if (this.j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ppe.e().a(f3223k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        q0a q0aVar = new q0a(intExtra, notification, intExtra2);
        this.f.put(workGenerationalId, q0aVar);
        q0a q0aVar2 = this.f.get(this.e);
        if (q0aVar2 == null) {
            this.e = workGenerationalId;
        } else {
            this.j.a(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, q0a>> it = this.f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                q0aVar = new q0a(q0aVar2.c(), q0aVar2.b(), iA);
            } else {
                q0aVar = q0aVar2;
            }
        }
        this.j.c(q0aVar.c(), q0aVar.a(), q0aVar.b());
    }

    public final void j(Intent intent) {
        ppe.e().f(f3223k, "Started foreground service " + intent);
        this.c.b(new RunnableC0088a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent) {
        ppe.e().f(f3223k, "Stopping foreground service");
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void l() {
        this.j = null;
        synchronized (this.d) {
            try {
                Iterator<Job> it = this.h.values().iterator();
                while (it.hasNext()) {
                    it.next().cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3225b.g().p(this);
    }

    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    public void n(int i, int i2) {
        ppe.e().f(f3223k, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry<WorkGenerationalId, q0a> entry : this.f.entrySet()) {
            if (entry.getValue().a() == i2) {
                this.f3225b.q(entry.getKey(), WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
            }
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void o(b bVar) {
        if (this.j != null) {
            ppe.e().c(f3223k, "A callback already exists.");
        } else {
            this.j = bVar;
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.id;
            ppe.e().a(f3223k, "Constraints unmet for WorkSpec " + str);
            this.f3225b.q(WorkSpecKt.generationalId(workSpec), ((ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }
}
