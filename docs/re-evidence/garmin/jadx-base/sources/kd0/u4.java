package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NutritionDelegateImpl", f = "NutritionDelegateImpl.kt", l = {24}, m = "getDailyCalories", v = 2)
public final class u4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v4 f104387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(v4 v4Var, t13.d<? super u4> dVar) {
        super(dVar);
        this.f104387b = v4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104386a = obj;
        this.f104388c |= Integer.MIN_VALUE;
        return this.f104387b.a(null, null, this);
    }
}
