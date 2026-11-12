package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.SetEpicActivityDailyNotesUseCase", f = "SetEpicActivityDailyNotesUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f80223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f80223b = s1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80222a = obj;
        this.f80224c |= Integer.MIN_VALUE;
        return this.f80223b.a(null, null, this);
    }
}
