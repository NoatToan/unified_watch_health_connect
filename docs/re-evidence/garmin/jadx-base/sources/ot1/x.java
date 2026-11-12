package ot1;

import android.app.Activity;
import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f133843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f133844c;

    public /* synthetic */ x(m0 m0Var, Activity activity) {
        this.f133842a = 0;
        this.f133844c = m0Var;
        this.f133843b = activity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f133842a;
        m0 m0Var = this.f133844c;
        Activity activity = this.f133843b;
        switch (i14) {
            case 0:
                y yVar = y.f133845a;
                if (!m0Var.n() && activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                }
                if (m0Var.f() != null) {
                    m0Var.n();
                }
                break;
            case 2:
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                }
                if (m0Var.f() != null) {
                    m0Var.n();
                }
                break;
            default:
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                }
                if (m0Var.f() != null) {
                    m0Var.n();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(Activity activity, m0 m0Var, int i14) {
        this.f133842a = i14;
        this.f133843b = activity;
        this.f133844c = m0Var;
    }
}
