package x91;

import androidx.lifecycle.v1;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.composables.screen.BestEffortsScreenKt$BestEffortsScreen$5$4$1", f = "BestEffortsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b63.o f189612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.e f189613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aa1.a f189614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f189615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<String> f189616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f189617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ba1.d f189618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b63.o oVar, pi0.e eVar, aa1.a aVar, n1 n1Var, p1<String> p1Var, p1<Boolean> p1Var2, ba1.d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f189612a = oVar;
        this.f189613b = eVar;
        this.f189614c = aVar;
        this.f189615d = n1Var;
        this.f189616e = p1Var;
        this.f189617f = p1Var2;
        this.f189618g = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f189612a, this.f189613b, this.f189614c, this.f189615d, this.f189616e, this.f189617f, this.f189618g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o13.p pVar;
        o13.p pVar2;
        b63.o oVar;
        b63.o oVar2;
        String strK;
        boolean z14;
        q91.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        n1 n1Var = this.f189615d;
        int intValue = n1Var.getIntValue();
        b63.o oVar3 = this.f189612a;
        if (intValue == 0) {
            o82.f fVar = o82.g.f130854g.f130862a;
            b63.i.INSTANCE.getClass();
            pVar = new o13.p(fVar.f(b63.q.c(oVar3, 12, b63.i.f16191e), oVar3), oVar3);
        } else {
            if (intValue != 1) {
                if (intValue != 2) {
                    pVar2 = new o13.p(null, null);
                } else {
                    o82.f fVar2 = o82.g.f130856i.f130862a;
                    b63.i.INSTANCE.getClass();
                    pVar = new o13.p(fVar2.f(b63.q.c(oVar3, 52, b63.i.f16191e), oVar3), oVar3);
                }
                oVar = (b63.o) pVar2.f128594a;
                oVar2 = (b63.o) pVar2.f128595b;
                if (oVar != null || oVar2 == null) {
                    strK = null;
                } else {
                    pi0.e eVar = this.f189613b;
                    eVar.getClass();
                    LocalDate localDateH = g22.l.h(oVar);
                    LocalDate localDateH2 = g22.l.h(oVar2);
                    strK = localDateH.equals(localDateH2) ? eVar.k(localDateH, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY) : eVar.m(localDateH, localDateH2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                }
                this.f189616e.setValue(strK);
                if (n1Var.getIntValue() == 3) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f189617f.setValue(Boolean.valueOf(z14));
                dVar = this.f189614c.f2220c;
                if (dVar != null && ((n1Var.getIntValue() == 0 || n1Var.getIntValue() == 1 || n1Var.getIntValue() == 2) && oVar != null && oVar2 != null)) {
                    ba1.d dVar2 = this.f189618g;
                    dVar2.getClass();
                    ge1.b.T(v1.a(dVar2), null, null, new ba1.e(dVar2, oVar, oVar2, dVar, null), 3);
                }
                return Unit.INSTANCE;
            }
            o82.f fVar3 = o82.g.f130855h.f130862a;
            b63.i.INSTANCE.getClass();
            pVar = new o13.p(fVar3.f(b63.q.c(oVar3, 26, b63.i.f16191e), oVar3), oVar3);
        }
        pVar2 = pVar;
        oVar = (b63.o) pVar2.f128594a;
        oVar2 = (b63.o) pVar2.f128595b;
        if (oVar != null) {
            strK = null;
        } else {
            strK = null;
        }
        this.f189616e.setValue(strK);
        if (n1Var.getIntValue() == 3) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f189617f.setValue(Boolean.valueOf(z14));
        dVar = this.f189614c.f2220c;
        if (dVar != null) {
            ba1.d dVar3 = this.f189618g;
            dVar3.getClass();
            ge1.b.T(v1.a(dVar3), null, null, new ba1.e(dVar3, oVar, oVar2, dVar, null), 3);
        }
        return Unit.INSTANCE;
    }
}
