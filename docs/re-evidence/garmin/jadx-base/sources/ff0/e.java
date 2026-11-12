package ff0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lff0/g;", "<anonymous>", "(Lo53/b0;)Lff0/g;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgDataSource$getFirstPageWithData$3", f = "EcgDataSource.kt", l = {179}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f71065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<String> f71066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, r0<String> r0Var, int i14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f71065b = cVar;
        this.f71066c = r0Var;
        this.f71067d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f71065b, this.f71066c, this.f71067d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71064a;
        if (i14 == 0) {
            o13.r.b(obj);
            c cVar = this.f71065b;
            rf0.a aVar2 = cVar.f71035e;
            rf0.a aVar3 = cVar.f71035e;
            o13.p pVarZ = og.a.z(aVar2);
            LocalDate localDate = (LocalDate) pVarZ.f128594a;
            LocalDate localDate2 = (LocalDate) pVarZ.f128595b;
            l lVar = cVar.f71037g;
            String string = localDate != null ? localDate.toString("yyyy-MM-dd") : null;
            String string2 = localDate2 != null ? localDate2.toString("yyyy-MM-dd") : null;
            ArrayList arrayListM = og.a.M(aVar3);
            ArrayList arrayListL = og.a.L(aVar3);
            String str = this.f71066c.f105810a;
            Integer num = new Integer(this.f71067d);
            this.f71064a = 1;
            obj = lVar.c(string, string2, arrayListM, arrayListL, str, num, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            return (g) ((v2.b) v2Var).f47386a;
        }
        return null;
    }
}
