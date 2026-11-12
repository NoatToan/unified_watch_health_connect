package l4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/c;", "", "invoke", "(Lq4/c;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class e extends p005kotlin.jvm.internal.w implements e23.l<q4.c, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<q4.f, Unit> f109844a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(e23.l<? super q4.f, Unit> lVar) {
        super(1);
        this.f109844a = lVar;
    }

    @Override // e23.l
    public final Unit invoke(q4.c cVar) {
        q4.c cVar2 = cVar;
        this.f109844a.invoke(cVar2);
        cVar2.m1();
        return Unit.INSTANCE;
    }
}
