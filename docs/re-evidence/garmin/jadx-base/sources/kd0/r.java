package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.BloodPressureDelegateImpl", f = "BloodPressureDelegateImpl.kt", l = {36}, m = "loadConfigFromCache", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f104319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f104319b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104318a = obj;
        this.f104320c |= Integer.MIN_VALUE;
        return this.f104319b.c(this);
    }
}
