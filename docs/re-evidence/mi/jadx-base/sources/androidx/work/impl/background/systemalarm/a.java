package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import defpackage.g41;
import defpackage.h14;
import defpackage.ppe;
import defpackage.tf8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements tf8 {
    public static final String f = ppe.i("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<WorkGenerationalId, c> f3205b = new HashMap();
    public final Object c = new Object();
    public final h14 d;
    public final StartStopTokens e;

    public a(Context context, h14 h14Var, StartStopTokens startStopTokens) {
        this.f3204a = context;
        this.d = h14Var;
        this.e = startStopTokens;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, workGenerationalId);
    }

    public static Intent d(Context context, WorkGenerationalId workGenerationalId, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return q(intent, workGenerationalId);
    }

    public static Intent e(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, workGenerationalId);
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, workGenerationalId);
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static WorkGenerationalId p(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static Intent q(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    @Override // defpackage.tf8
    public void c(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.c) {
            try {
                c cVarRemove = this.f3205b.remove(workGenerationalId);
                this.e.remove(workGenerationalId);
                if (cVarRemove != null) {
                    cVarRemove.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i, d dVar) {
        ppe.e().a(f, "Handling constraints changed " + intent);
        new b(this.f3204a, this.d, i, dVar).a();
    }

    public final void h(Intent intent, int i, d dVar) {
        synchronized (this.c) {
            try {
                WorkGenerationalId workGenerationalIdP = p(intent);
                ppe ppeVarE = ppe.e();
                String str = f;
                ppeVarE.a(str, "Handing delay met for " + workGenerationalIdP);
                if (this.f3205b.containsKey(workGenerationalIdP)) {
                    ppe.e().a(str, "WorkSpec " + workGenerationalIdP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    c cVar = new c(this.f3204a, i, dVar, this.e.tokenFor(workGenerationalIdP));
                    this.f3205b.put(workGenerationalIdP, cVar);
                    cVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i) {
        WorkGenerationalId workGenerationalIdP = p(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        ppe.e().a(f, "Handling onExecutionCompleted " + intent + ", " + i);
        c(workGenerationalIdP, z);
    }

    public final void j(Intent intent, int i, d dVar) {
        ppe.e().a(f, "Handling reschedule " + intent + ", " + i);
        dVar.g().o();
    }

    public final void k(Intent intent, int i, d dVar) {
        WorkGenerationalId workGenerationalIdP = p(intent);
        ppe ppeVarE = ppe.e();
        String str = f;
        ppeVarE.a(str, "Handling schedule work for " + workGenerationalIdP);
        WorkDatabase workDatabaseJ = dVar.g().j();
        workDatabaseJ.beginTransaction();
        try {
            WorkSpec workSpec = workDatabaseJ.workSpecDao().getWorkSpec(workGenerationalIdP.getWorkSpecId());
            if (workSpec == null) {
                ppe.e().k(str, "Skipping scheduling " + workGenerationalIdP + " because it's no longer in the DB");
                return;
            }
            if (workSpec.state.isFinished()) {
                ppe.e().k(str, "Skipping scheduling " + workGenerationalIdP + "because it is finished.");
                return;
            }
            long jCalculateNextRunTime = workSpec.calculateNextRunTime();
            if (workSpec.hasConstraints()) {
                ppe.e().a(str, "Opportunistically setting an alarm for " + workGenerationalIdP + "at " + jCalculateNextRunTime);
                g41.c(this.f3204a, workDatabaseJ, workGenerationalIdP, jCalculateNextRunTime);
                dVar.f().c().execute(new d.b(dVar, a(this.f3204a), i));
            } else {
                ppe.e().a(str, "Setting up Alarms for " + workGenerationalIdP + "at " + jCalculateNextRunTime);
                g41.c(this.f3204a, workDatabaseJ, workGenerationalIdP, jCalculateNextRunTime);
            }
            workDatabaseJ.setTransactionSuccessful();
        } finally {
            workDatabaseJ.endTransaction();
        }
    }

    public final void l(Intent intent, d dVar) {
        List<StartStopToken> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            listRemove = new ArrayList<>(1);
            StartStopToken startStopTokenRemove = this.e.remove(new WorkGenerationalId(string, i));
            if (startStopTokenRemove != null) {
                listRemove.add(startStopTokenRemove);
            }
        } else {
            listRemove = this.e.remove(string);
        }
        for (StartStopToken startStopToken : listRemove) {
            ppe.e().a(f, "Handing stopWork work for " + string);
            dVar.i().stopWork(startStopToken);
            g41.a(this.f3204a, dVar.g().j(), startStopToken.getId());
            dVar.c(startStopToken.getId(), false);
        }
    }

    public boolean n() {
        boolean z;
        synchronized (this.c) {
            z = !this.f3205b.isEmpty();
        }
        return z;
    }

    public void o(Intent intent, int i, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            ppe.e().c(f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i);
            return;
        }
        ppe.e().k(f, "Ignoring intent " + intent);
    }
}
