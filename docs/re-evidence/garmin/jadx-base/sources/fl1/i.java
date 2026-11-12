package fl1;

import e23.p;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "Lzf2/d;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetFavoriteRecordableActivitiesUseCase$invoke$2", f = "GetFavoriteRecordableActivitiesUseCase.kt", l = {24, 28, 32}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super q<? extends List<? extends zf2.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f72011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f72012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f72011b = gVar;
        this.f72012c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f72011b, this.f72012c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super q<? extends List<? extends zf2.d>>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r9 == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Throwable thB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72010a;
        long j8 = this.f72012c;
        g gVar = this.f72011b;
        if (i14 == 0) {
            r.b(obj);
            List<String> listD = gVar.f72003a.d(j8);
            if (!listD.isEmpty()) {
                int i15 = q.f128596b;
                this.f72010a = 1;
                obj = g.a(gVar, j8, listD, this);
            } else if (gVar.f72003a.j(j8)) {
                int i16 = q.f128596b;
                obj = j0.f134944a;
            } else {
                ws.a aVar2 = gVar.f72005c;
                this.f72010a = 2;
                objI = aVar2.i(j8, this);
                if (objI != aVar) {
                    thB = q.b(objI);
                    if (thB == null) {
                        List<String> list = (List) objI;
                        gVar.f72003a.e(j8, list);
                        gVar.f72003a.h(j8);
                        this.f72010a = 3;
                        obj = g.a(gVar, j8, list, this);
                    } else {
                        obj = new q.b(thB);
                    }
                }
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                r.b(obj);
                objI = ((q) obj).f128597a;
                thB = q.b(objI);
                if (thB == null) {
                    List<String> list2 = (List) objI;
                    gVar.f72003a.e(j8, list2);
                    gVar.f72003a.h(j8);
                    this.f72010a = 3;
                    obj = g.a(gVar, j8, list2, this);
                } else {
                    obj = new q.b(thB);
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            int i17 = q.f128596b;
        } else {
            r.b(obj);
            int i18 = q.f128596b;
        }
        return q.a(obj);
    }
}
