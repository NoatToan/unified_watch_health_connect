package dq1;

import java.util.List;
import p005kotlin.Metadata;
import q92.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshUseCase", f = "GraduationConsentRefreshUseCase.kt", l = {50}, m = "isChildAccountGraduated", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f60774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f60776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f60776c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60775b = obj;
        this.f60777d |= Integer.MIN_VALUE;
        List<x> list = l.f60769b;
        return this.f60776c.b(null, this);
    }
}
