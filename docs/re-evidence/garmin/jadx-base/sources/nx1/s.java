package nx1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.WorkoutStepsScreensUseCase", f = "WorkoutStepsScreensUseCase.kt", l = {130, 131}, m = "initGetFitScreen", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f128253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f128255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c0 c0Var, t13.d<? super s> dVar) {
        super(dVar);
        this.f128255c = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128254b = obj;
        this.f128256d |= Integer.MIN_VALUE;
        return this.f128255c.a(this);
    }
}
