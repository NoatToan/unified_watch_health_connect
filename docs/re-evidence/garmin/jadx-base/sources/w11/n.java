package w11;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<v11.b.e, Boolean, Unit> f181236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v11.b f181237b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.p<? super v11.b.e, ? super Boolean, Unit> pVar, v11.b bVar) {
        this.f181236a = pVar;
        this.f181237b = bVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f181236a.invoke((v11.b.e) this.f181237b, bool2);
        return Unit.INSTANCE;
    }
}
