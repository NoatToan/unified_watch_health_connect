package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import defpackage.my5;
import defpackage.ny5;
import defpackage.onr;
import defpackage.ppe;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c implements OnConstraintsStateChangedListener, onr.a {
    public static final String o = ppe.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3209b;
    public final WorkGenerationalId c;
    public final d d;
    public final WorkConstraintsTracker e;
    public final Object f;
    public int g;
    public final Executor h;
    public final Executor i;
    public PowerManager.WakeLock j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3210k;
    public final StartStopToken l;
    public final CoroutineDispatcher m;
    public volatile Job n;

    public c(Context context, int i, d dVar, StartStopToken startStopToken) {
        this.f3208a = context;
        this.f3209b = i;
        this.d = dVar;
        this.c = startStopToken.getId();
        this.l = startStopToken;
        Trackers trackersI = dVar.g().i();
        this.h = dVar.f().d();
        this.i = dVar.f().c();
        this.m = dVar.f().a();
        this.e = new WorkConstraintsTracker(trackersI);
        this.f3210k = false;
        this.g = 0;
        this.f = new Object();
    }

    @Override // onr.a
    public void a(WorkGenerationalId workGenerationalId) {
        ppe.e().a(o, "Exceeded time limits on execution for " + workGenerationalId);
        this.h.execute(new my5(this));
    }

    public final void d() {
        synchronized (this.f) {
            try {
                if (this.n != null) {
                    this.n.cancel((CancellationException) null);
                }
                this.d.h().b(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    ppe.e().a(o, "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        String workSpecId = this.c.getWorkSpecId();
        this.j = WakeLocks.newWakeLock(this.f3208a, workSpecId + " (" + this.f3209b + ")");
        ppe ppeVarE = ppe.e();
        String str = o;
        ppeVarE.a(str, "Acquiring wakelock " + this.j + "for WorkSpec " + workSpecId);
        this.j.acquire();
        WorkSpec workSpec = this.d.g().j().workSpecDao().getWorkSpec(workSpecId);
        if (workSpec == null) {
            this.h.execute(new my5(this));
            return;
        }
        boolean zHasConstraints = workSpec.hasConstraints();
        this.f3210k = zHasConstraints;
        if (zHasConstraints) {
            this.n = WorkConstraintsTrackerKt.listen(this.e, workSpec, this.m, this);
            return;
        }
        ppe.e().a(str, "No constraints for " + workSpecId);
        this.h.execute(new ny5(this));
    }

    public void f(boolean z) {
        ppe.e().a(o, "onExecuted " + this.c + ", " + z);
        d();
        if (z) {
            this.i.execute(new d.b(this.d, a.e(this.f3208a, this.c), this.f3209b));
        }
        if (this.f3210k) {
            this.i.execute(new d.b(this.d, a.a(this.f3208a), this.f3209b));
        }
    }

    public final void g() {
        if (this.g != 0) {
            ppe.e().a(o, "Already started work for " + this.c);
            return;
        }
        this.g = 1;
        ppe.e().a(o, "onAllConstraintsMet for " + this.c);
        if (this.d.e().r(this.l)) {
            this.d.h().a(this.c, 600000L, this);
        } else {
            d();
        }
    }

    public final void h() {
        String workSpecId = this.c.getWorkSpecId();
        if (this.g >= 2) {
            ppe.e().a(o, "Already stopped work for " + workSpecId);
            return;
        }
        this.g = 2;
        ppe ppeVarE = ppe.e();
        String str = o;
        ppeVarE.a(str, "Stopping work for WorkSpec " + workSpecId);
        this.i.execute(new d.b(this.d, a.f(this.f3208a, this.c), this.f3209b));
        if (!this.d.e().k(this.c.getWorkSpecId())) {
            ppe.e().a(str, "Processor does not have WorkSpec " + workSpecId + ". No need to reschedule");
            return;
        }
        ppe.e().a(str, "WorkSpec " + workSpecId + " needs to be rescheduled");
        this.i.execute(new d.b(this.d, a.e(this.f3208a, this.c), this.f3209b));
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            this.h.execute(new ny5(this));
        } else {
            this.h.execute(new my5(this));
        }
    }
}
