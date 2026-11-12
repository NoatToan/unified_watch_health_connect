package com.huawei.health.manager.util;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qgm;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class GoalValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Semaphore f8141a = new Semaphore(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8142c;
    private int e;

    public GoalValue(Context context) {
        this.e = 10000;
        this.f8142c = null;
        this.f8142c = context;
        if (context != null) {
            this.e = SharedPerferenceUtils.q(context);
        }
    }

    public void a() {
        LogUtil.a("Step_GoalValue", "fetch lock");
        try {
            this.f8141a.acquire();
        } catch (InterruptedException unused) {
            LogUtil.e("Step_GoalValue", "fetch lock get failed");
        }
        if (this.f8142c == null) {
            LogUtil.a("Step_GoalValue", "refreshGoal mContext is null");
        } else {
            qgm.c("900200006", new IBaseResponseCallback() { // from class: com.huawei.health.manager.util.GoalValue.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof Integer)) {
                        GoalValue goalValue = GoalValue.this;
                        goalValue.e = SharedPerferenceUtils.q(goalValue.f8142c);
                        LogUtil.j("Step_GoalValue", "data not inatnceOf integer");
                        GoalValue.this.f8141a.release();
                        return;
                    }
                    GoalValue.this.e = ((Integer) obj).intValue();
                    SharedPerferenceUtils.d(GoalValue.this.f8142c, GoalValue.this.e);
                    GoalValue.this.f8141a.release();
                    LogUtil.a("Step_GoalValue", "fetch unlock");
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0046: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:19:0x0046 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public int d() throws Throwable {
        boolean zTryAcquire;
        boolean z;
        int i;
        ?? r0 = "Step_GoalValue";
        boolean z2 = false;
        try {
            try {
                zTryAcquire = this.f8141a.tryAcquire(2000L, TimeUnit.MILLISECONDS);
                try {
                    if (zTryAcquire) {
                        i = this.e;
                    } else {
                        int iQ = SharedPerferenceUtils.q(this.f8142c);
                        ReleaseLogUtil.b("Step_GoalValue", "getGoalValue over time");
                        r0 = iQ;
                    }
                    if (zTryAcquire) {
                        r0 = i;
                        this.f8141a.release();
                    }
                    r0 = i;
                    return r0;
                } catch (InterruptedException unused) {
                    int iQ2 = SharedPerferenceUtils.q(this.f8142c);
                    LogUtil.e((String) r0, "getGoalValue InterruptedException");
                    if (zTryAcquire) {
                        this.f8141a.release();
                    }
                    return iQ2;
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    this.f8141a.release();
                }
                throw th;
            }
        } catch (InterruptedException unused2) {
            zTryAcquire = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                this.f8141a.release();
            }
            throw th;
        }
    }
}
