package mk0;

import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.domain.ResolveDefaultGearConflictsUseCase", f = "ResolveDefaultGearConflictsUseCase.kt", l = {49, 56}, m = "resolveCollectionConflict", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f119132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f119134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f119134c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119133b = obj;
        this.f119135d |= Integer.MIN_VALUE;
        return l.a(this.f119134c, null, null, this);
    }
}
