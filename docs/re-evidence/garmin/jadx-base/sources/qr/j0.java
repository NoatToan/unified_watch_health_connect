package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Li53/c;", "Lpe0/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityDogs$1", f = "ActivityDetailsViewModel.kt", l = {4259, 4258}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<r53.j<? super i53.c<? extends pe0.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f146260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ps.r f146262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t tVar, ps.r rVar, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f146261d = tVar;
        this.f146262e = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f146261d, this.f146262e, dVar);
        j0Var.f146260c = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super i53.c<? extends pe0.a>> jVar, t13.d<? super Unit> dVar) {
        return ((j0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Long> listS;
        r53.j jVar = (r53.j) this.f146260c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146259b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f146258a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        ne0.j jVar2 = this.f146261d.f146566w;
        ps.r rVar = this.f146262e;
        ps.a1 metadataDTO = rVar.getMetadataDTO();
        if (metadataDTO == null || (listS = metadataDTO.s()) == null) {
            listS = p13.j0.f134944a;
        }
        boolean zJ = oe2.f.J(rVar);
        this.f146260c = null;
        this.f146258a = jVar;
        this.f146259b = 1;
        jVar2.getClass();
        x53.c cVar = o53.s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new ne0.i(listS, zJ, jVar2, null), this);
        if (obj != aVar) {
        }
        return aVar;
        this.f146260c = null;
        this.f146258a = null;
        this.f146259b = 2;
    }
}
