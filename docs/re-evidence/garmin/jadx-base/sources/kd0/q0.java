package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CoursesDelegateImpl", f = "CoursesDelegateImpl.kt", l = {192, 197}, m = "isTrailsAvailableInArea", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f104297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f104298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f104300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f104300d = s0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104299c = obj;
        this.f104301e |= Integer.MIN_VALUE;
        return this.f104300d.f(0.0d, 0.0d, this);
    }
}
