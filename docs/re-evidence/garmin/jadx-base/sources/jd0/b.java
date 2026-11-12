package jd0;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements e23.a<ok0.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.g f98334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qualifier f98335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f98336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f98337d;

    public b(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
        this.f98334a = gVar;
        this.f98335b = qualifier;
        this.f98336c = aVar;
        this.f98337d = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ok0.g] */
    @Override // e23.a
    public final ok0.g invoke() {
        CreationExtras defaultViewModelCreationExtras;
        b.g gVar = this.f98334a;
        y1 f189591b = gVar.getF189591b();
        e23.a aVar = this.f98336c;
        if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
            defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
        }
        return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ok0.g.class), f189591b, null, defaultViewModelCreationExtras, this.f98335b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f98337d, 4, null);
    }
}
