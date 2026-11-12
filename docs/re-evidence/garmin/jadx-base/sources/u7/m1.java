package u7;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu7/m1;", "T", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lt13/d;", "consumeMessage", "<init>", "(Lo53/b0;Le23/l;Le23/p;Le23/p;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f169231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<T, t13.d<? super Unit>, Object> f169232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q53.b f169233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f169234d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "ex", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Throwable, Unit> f169235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1<T> f169236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<T, Throwable, Unit> f169237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Throwable, Unit> lVar, m1<T> m1Var, e23.p<? super T, ? super Throwable, Unit> pVar) {
            super(1);
            this.f169235a = lVar;
            this.f169236b = m1Var;
            this.f169237c = pVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            Unit unit;
            Throwable th4 = th3;
            this.f169235a.invoke(th4);
            m1<T> m1Var = this.f169236b;
            m1Var.f169233c.n(th4, false);
            do {
                Object objB = q53.m.b(m1Var.f169233c.k());
                if (objB != null) {
                    this.f169237c.invoke((T) objB, th4);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } while (unit != null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1(o53.b0 b0Var, e23.l<? super Throwable, Unit> lVar, e23.p<? super T, ? super Throwable, Unit> pVar, e23.p<? super T, ? super t13.d<? super Unit>, ? extends Object> pVar2) {
        b0Var.getClass();
        lVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        this.f169231a = b0Var;
        this.f169232b = pVar2;
        this.f169233c = q53.l.a(Integer.MAX_VALUE, 6, null);
        this.f169234d = new b(0);
        o53.l1 l1Var = (o53.l1) b0Var.getF195311f().get(o53.l1.f129368i0);
        if (l1Var != null) {
            l1Var.J(new a(lVar, this, pVar));
        }
    }
}
