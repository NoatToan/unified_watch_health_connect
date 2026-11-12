package oo;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$unlinkEvent$4", f = "ActivitiesEditViewModel.kt", l = {277}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f133097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f133098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f133097c = bVar;
        this.f133098d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f133097c, this.f133098d, dVar);
        iVar.f133096b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f133096b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133095a;
        long j8 = this.f133098d;
        b bVar = this.f133097c;
        if (i14 == 0) {
            r.b(obj);
            new ps.d(null, null, 3, null);
            ps.d dVarA = ps.d.a();
            this.f133096b = b0Var;
            this.f133095a = 1;
            obj = b.y4(bVar, j8, dVarA, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int i15 = b.f133050p;
            y0 y0Var = (y0) bVar.f133062l.getValue();
            g3.a aVar2 = g3.f35298f;
            Boolean bool = Boolean.TRUE;
            aVar2.getClass();
            y0Var.j(g3.a.d(bool));
        } else {
            String strE = org.apache.commons.lang3.e.e(j8, "unlinkEvent: Error occurred while unlinking event associated with activity ");
            y.f136664a.getClass();
            y.a.c("ActivitiesEditViewModel", strE);
            int i16 = b.f133050p;
            ((y0) bVar.f133062l.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
