package k11;

import i3.fe;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.screen.MealDetailsScreenKt$MealDetailsScreen$2$1", f = "MealDetailsScreen.kt", l = {102, 110}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l11.n.b f102268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<b63.u, b11.a, Unit> f102269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Long, Boolean, Unit> f102270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f102271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f102272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fe f102273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f102274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f102275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l11.n f102276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(l11.n.b bVar, e23.p<? super b63.u, ? super b11.a, Unit> pVar, e23.p<? super Long, ? super Boolean, Unit> pVar2, String str, String str2, fe feVar, e23.a<Unit> aVar, String str3, l11.n nVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f102268b = bVar;
        this.f102269c = pVar;
        this.f102270d = pVar2;
        this.f102271e = str;
        this.f102272f = str2;
        this.f102273g = feVar;
        this.f102274h = aVar;
        this.f102275i = str3;
        this.f102276j = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f102268b, this.f102269c, this.f102270d, this.f102271e, this.f102272f, this.f102273g, this.f102274h, this.f102275i, this.f102276j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (i3.fe.b(r10.f102273g, r5, null, null, r10, 14) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (i3.fe.b(r5.f102273g, r5.f102275i, null, null, r5, 14) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w wVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102267a;
        if (i14 == 0) {
            o13.r.b(obj);
            l11.n.b bVar = this.f102268b;
            if (bVar instanceof l11.n.b.g) {
                l11.n.b.g gVar = (l11.n.b.g) bVar;
                this.f102269c.invoke(gVar.f108209a, gVar.f108210b);
                Unit unit = Unit.INSTANCE;
            } else if (bVar instanceof l11.n.b.h) {
                l11.n.b.h hVar = (l11.n.b.h) bVar;
                boolean z14 = hVar.f108212b;
                this.f102270d.invoke(new Long(hVar.f108211a), Boolean.valueOf(z14));
                String str = z14 ? this.f102271e : this.f102272f;
                this.f102267a = 1;
            } else {
                wVar = this;
                if (bVar instanceof l11.n.b.a) {
                    wVar.f102274h.invoke();
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    if (bVar instanceof l11.n.b.c) {
                        wVar.f102267a = 2;
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        } else if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            wVar = this;
            wVar.f102276j.f108201l.setValue(l11.n.b.e.f108207a);
            Unit unit4 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
