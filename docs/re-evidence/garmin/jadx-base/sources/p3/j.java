package p3;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
public final class j extends v13.h implements e23.p<c53.l<? super String>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f135118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f135119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f135120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f135121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f135121f = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f135121f, dVar);
        jVar.f135120e = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(c53.l<? super String> lVar, t13.d<? super Unit> dVar) {
        return ((j) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        c53.l lVar;
        int i15;
        int i16;
        String strF;
        int i17;
        int i18;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = this.f135119d;
        if (i19 == 0) {
            o13.r.b(obj);
            i14 = 0;
            lVar = (c53.l) this.f135120e;
            i15 = 0;
            i16 = 0;
        } else {
            if (i19 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i24 = this.f135118c;
            int i25 = this.f135117b;
            int i26 = this.f135116a;
            lVar = (c53.l) this.f135120e;
            o13.r.b(obj);
            i15 = i25;
            i16 = i24;
            i14 = i26;
        }
        while (true) {
            k kVar = this.f135121f;
            int i27 = kVar.f135135d;
            p1.a1<Object> a1Var = kVar.f135132a;
            p1.l lVar2 = kVar.f135134c;
            if (i14 >= Math.min(i27 + 10, lVar2.f134763b)) {
                return Unit.INSTANCE;
            }
            int i28 = i14 + 1;
            int iA = lVar2.a(i14);
            switch (iA) {
                case 0:
                    strF = "up";
                    break;
                case 1:
                    strF = e5.f(a1Var.b(i15), "down ");
                    i15++;
                    break;
                case 2:
                    strF = "remove " + lVar2.a(i28) + ' ' + lVar2.a(i14 + 2);
                    i28 = i14 + 3;
                    break;
                case 3:
                    strF = "move " + lVar2.a(i28) + ' ' + lVar2.a(i14 + 2) + ' ' + lVar2.a(i14 + 3);
                    i28 = i14 + 4;
                    break;
                case 4:
                    strF = "clear";
                    break;
                case 5:
                    i17 = i14 + 2;
                    int iA2 = lVar2.a(i28);
                    i18 = i15 + 1;
                    str = "insertBottomUp " + iA2 + ' ' + a1Var.b(i15);
                    i28 = i17;
                    strF = str;
                    i15 = i18;
                    break;
                case 6:
                    i17 = i14 + 2;
                    int iA3 = lVar2.a(i28);
                    i18 = i15 + 1;
                    str = "insertTopDown " + iA3 + ' ' + a1Var.b(i15);
                    i28 = i17;
                    strF = str;
                    i15 = i18;
                    break;
                case 7:
                    Object objB = a1Var.b(i15);
                    objB.getClass();
                    p005kotlin.jvm.internal.y0.e(2, objB);
                    i15 += 2;
                    strF = "apply " + ((e23.p) objB);
                    break;
                case 8:
                    strF = "reuse " + kVar.f135133b.b(i16);
                    i16++;
                    break;
                case 9:
                    strF = "recompose pending";
                    break;
                default:
                    strF = am.j.h(iA, "unknown op: ");
                    break;
            }
            String strD = org.apache.commons.lang3.e.d(i14, ": ", strF);
            this.f135120e = lVar;
            this.f135116a = i28;
            this.f135117b = i15;
            this.f135118c = i16;
            this.f135119d = 1;
            if (lVar.a(strD, this) == aVar) {
                return aVar;
            }
            i14 = i28;
        }
    }
}
