package y22;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f194317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194318b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(e23.l<? super Integer, Unit> lVar, int i14) {
        this.f194317a = lVar;
        this.f194318b = i14;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f194317a.invoke(Integer.valueOf(this.f194318b));
        return Unit.INSTANCE;
    }
}
