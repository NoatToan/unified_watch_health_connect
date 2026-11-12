package of0;

import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f131677c;

    public /* synthetic */ f(FirstTimeUseFragment firstTimeUseFragment, o0 o0Var, int i14) {
        this.f131675a = i14;
        this.f131676b = firstTimeUseFragment;
        this.f131677c = o0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f131675a;
        o0 o0Var = this.f131677c;
        FirstTimeUseFragment firstTimeUseFragment = this.f131676b;
        switch (i14) {
            case 0:
                int i15 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                o0Var.show(firstTimeUseFragment.getChildFragmentManager(), (String) null);
                break;
            case 1:
                int i16 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                o0Var.show(firstTimeUseFragment.getChildFragmentManager(), (String) null);
                break;
            default:
                int i17 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                o0Var.show(firstTimeUseFragment.getChildFragmentManager(), (String) null);
                break;
        }
        return Unit.INSTANCE;
    }
}
