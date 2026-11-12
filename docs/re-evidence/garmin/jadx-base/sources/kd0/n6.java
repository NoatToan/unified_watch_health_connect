package kd0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl", f = "TrainingPlanDelegateImpl.kt", l = {374}, m = "getIntensityMinutesSummary", v = 2)
public final class n6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f104249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f104250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f104252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i6 f104253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(i6 i6Var, t13.d<? super n6> dVar) {
        super(dVar);
        this.f104253e = i6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104252d = obj;
        this.f104254f |= Integer.MIN_VALUE;
        return this.f104253e.o(null, null, false, this);
    }
}
