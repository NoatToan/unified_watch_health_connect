package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.WorkInfo;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class s3b implements jfl, OnConstraintsStateChangedListener, tf8 {
    public static final String o = ppe.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33235a;
    public oy5 c;
    public boolean d;
    public final androidx.work.impl.a g;
    public final WorkLauncher h;
    public final Configuration i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f33237k;
    public final WorkConstraintsTracker l;
    public final m1p m;
    public final TimeLimiter n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<WorkGenerationalId, Job> f33236b = new HashMap();
    public final Object e = new Object();
    public final StartStopTokens f = StartStopTokens.create();
    public final Map<WorkGenerationalId, b> j = new HashMap();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f33239b;

        public b(int i, long j) {
            this.f33238a = i;
            this.f33239b = j;
        }
    }

    public s3b(Context context, Configuration configuration, Trackers trackers, androidx.work.impl.a aVar, WorkLauncher workLauncher, m1p m1pVar) {
        this.f33235a = context;
        h1l runnableScheduler = configuration.getRunnableScheduler();
        this.c = new oy5(this, runnableScheduler, configuration.getClock());
        this.n = new TimeLimiter(runnableScheduler, workLauncher);
        this.m = m1pVar;
        this.l = new WorkConstraintsTracker(trackers);
        this.i = configuration;
        this.g = aVar;
        this.h = workLauncher;
    }

    @Override // defpackage.jfl
    public boolean a() {
        return false;
    }

    @Override // defpackage.jfl
    public void b(WorkSpec... workSpecArr) {
        if (this.f33237k == null) {
            d();
        }
        if (!this.f33237k.booleanValue()) {
            ppe.e().f(o, "Ignoring schedule request in a secondary process");
            return;
        }
        e();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f.contains(WorkSpecKt.generationalId(workSpec))) {
                long jMax = Math.max(workSpec.calculateNextRunTime(), g(workSpec));
                long jCurrentTimeMillis = this.i.getClock().currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        oy5 oy5Var = this.c;
                        if (oy5Var != null) {
                            oy5Var.a(workSpec, jMax);
                        }
                    } else if (workSpec.hasConstraints()) {
                        Constraints constraints = workSpec.constraints;
                        if (constraints.getRequiresDeviceIdle()) {
                            ppe.e().a(o, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (constraints.hasContentUriTriggers()) {
                            ppe.e().a(o, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.f.contains(WorkSpecKt.generationalId(workSpec))) {
                        ppe.e().a(o, "Starting work for " + workSpec.id);
                        StartStopToken startStopToken = this.f.tokenFor(workSpec);
                        this.n.track(startStopToken);
                        this.h.startWork(startStopToken);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    ppe.e().a(o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (WorkSpec workSpec2 : hashSet) {
                        WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec2);
                        if (!this.f33236b.containsKey(workGenerationalIdGenerationalId)) {
                            this.f33236b.put(workGenerationalIdGenerationalId, WorkConstraintsTrackerKt.listen(this.l, workSpec2, this.m.a(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tf8
    public void c(WorkGenerationalId workGenerationalId, boolean z) {
        StartStopToken startStopTokenRemove = this.f.remove(workGenerationalId);
        if (startStopTokenRemove != null) {
            this.n.cancel(startStopTokenRemove);
        }
        f(workGenerationalId);
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(workGenerationalId);
        }
    }

    @Override // defpackage.jfl
    public void cancel(String str) {
        if (this.f33237k == null) {
            d();
        }
        if (!this.f33237k.booleanValue()) {
            ppe.e().f(o, "Ignoring schedule request in non-main process");
            return;
        }
        e();
        ppe.e().a(o, "Cancelling work ID " + str);
        oy5 oy5Var = this.c;
        if (oy5Var != null) {
            oy5Var.b(str);
        }
        for (StartStopToken startStopToken : this.f.remove(str)) {
            this.n.cancel(startStopToken);
            this.h.stopWork(startStopToken);
        }
    }

    public final void d() {
        this.f33237k = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.f33235a, this.i));
    }

    public final void e() {
        if (this.d) {
            return;
        }
        this.g.e(this);
        this.d = true;
    }

    public final void f(WorkGenerationalId workGenerationalId) {
        Job jobRemove;
        synchronized (this.e) {
            jobRemove = this.f33236b.remove(workGenerationalId);
        }
        if (jobRemove != null) {
            ppe.e().a(o, "Stopping tracking for " + workGenerationalId);
            jobRemove.cancel((CancellationException) null);
        }
    }

    public final long g(WorkSpec workSpec) {
        long jMax;
        synchronized (this.e) {
            try {
                WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
                b bVar = this.j.get(workGenerationalIdGenerationalId);
                if (bVar == null) {
                    bVar = new b(workSpec.runAttemptCount, this.i.getClock().currentTimeMillis());
                    this.j.put(workGenerationalIdGenerationalId, bVar);
                }
                jMax = bVar.f33239b + (((long) Math.max((workSpec.runAttemptCount - bVar.f33238a) - 5, 0)) * 30000);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        WorkGenerationalId workGenerationalIdGenerationalId = WorkSpecKt.generationalId(workSpec);
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            if (this.f.contains(workGenerationalIdGenerationalId)) {
                return;
            }
            ppe.e().a(o, "Constraints met: Scheduling work ID " + workGenerationalIdGenerationalId);
            StartStopToken startStopToken = this.f.tokenFor(workGenerationalIdGenerationalId);
            this.n.track(startStopToken);
            this.h.startWork(startStopToken);
            return;
        }
        ppe.e().a(o, "Constraints not met: Cancelling work ID " + workGenerationalIdGenerationalId);
        StartStopToken startStopTokenRemove = this.f.remove(workGenerationalIdGenerationalId);
        if (startStopTokenRemove != null) {
            this.n.cancel(startStopTokenRemove);
            this.h.stopWorkWithReason(startStopTokenRemove, ((ConstraintsState.ConstraintsNotMet) constraintsState).getReason());
        }
    }
}
