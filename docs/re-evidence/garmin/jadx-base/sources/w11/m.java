package w11;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<v11.b.e, Unit> f181234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v11.b f181235b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(e23.l<? super v11.b.e, Unit> lVar, v11.b bVar) {
        this.f181234a = lVar;
        this.f181235b = bVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f181234a.invoke((v11.b.e) this.f181235b);
        return Unit.INSTANCE;
    }
}
