package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import defpackage.h14;
import defpackage.ppe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {
    public static final String f = ppe.i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h14 f3207b;
    public final int c;
    public final d d;
    public final WorkConstraintsTracker e;

    public b(Context context, h14 h14Var, int i, d dVar) {
        this.f3206a = context;
        this.f3207b = h14Var;
        this.c = i;
        this.d = dVar;
        this.e = new WorkConstraintsTracker(dVar.g().i());
    }

    public void a() {
        List<WorkSpec> scheduledWork = this.d.g().j().workSpecDao().getScheduledWork();
        ConstraintProxy.a(this.f3206a, scheduledWork);
        ArrayList<WorkSpec> arrayList = new ArrayList(scheduledWork.size());
        long jCurrentTimeMillis = this.f3207b.currentTimeMillis();
        for (WorkSpec workSpec : scheduledWork) {
            if (jCurrentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || this.e.areAllConstraintsMet(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.id;
            Intent intentB = a.b(this.f3206a, WorkSpecKt.generationalId(workSpec2));
            ppe.e().a(f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.d.f().c().execute(new d.b(this.d, intentB, this.c));
        }
    }
}
