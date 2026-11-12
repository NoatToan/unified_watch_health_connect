package mk0;

import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.ResolveDefaultGearConflictsUseCase", f = "ResolveDefaultGearConflictsUseCase.kt", l = {69, 76}, m = "resolveIndividualGearConflict", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f119136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f119138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f119138c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119137b = obj;
        this.f119139d |= Integer.MIN_VALUE;
        return l.b(this.f119138c, null, null, this);
    }
}
