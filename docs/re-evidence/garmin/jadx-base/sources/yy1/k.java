package yy1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<vo0.e, Unit> f200157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<vo0.e> f200158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f200159c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.l<? super vo0.e, Unit> lVar, List<vo0.e> list, int i14) {
        this.f200157a = lVar;
        this.f200158b = list;
        this.f200159c = i14;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f200157a.invoke(this.f200158b.get(this.f200159c));
        return Unit.INSTANCE;
    }
}
