package ky0;

import android.app.Activity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f107420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f107421c;

    public /* synthetic */ m0(Activity activity, w0 w0Var, int i14) {
        this.f107419a = i14;
        this.f107420b = activity;
        this.f107421c = w0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f107419a) {
            case 0:
                Activity activity = this.f107420b;
                if (activity != null) {
                    this.f107421c.L4(activity);
                }
                break;
            case 1:
                Activity activity2 = this.f107420b;
                if (activity2 != null) {
                    w0 w0Var = this.f107421c;
                    w0Var.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) w0Var.f107623x1.getValue();
                    if (eVar != null) {
                        w0Var.f107581c.b(activity2, eVar);
                    }
                }
                break;
            case 2:
                Activity activity3 = this.f107420b;
                if (activity3 != null) {
                    this.f107421c.L4(activity3);
                }
                break;
            default:
                Activity activity4 = this.f107420b;
                if (activity4 != null) {
                    w0 w0Var2 = this.f107421c;
                    w0Var2.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) w0Var2.f107623x1.getValue();
                    if (eVar2 != null) {
                        w0Var2.f107581c.b(activity4, eVar2);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
