package oo;

import am.x0;
import am.z0;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import lc.u0;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Ljava/util/ArrayList;", "Lfg0/k;", "Lkotlin/collections/ArrayList;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$getEventsList$1", f = "ActivitiesEditViewModel.kt", l = {118, 137, 157}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<t0<g3<? extends ArrayList<fg0.k>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f133073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f133074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f133075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, boolean z14, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f133073c = bVar;
        this.f133074d = str;
        this.f133075e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f133073c, this.f133074d, this.f133075e, dVar);
        dVar2.f133072b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends ArrayList<fg0.k>>> t0Var, t13.d<? super Unit> dVar) {
        return ((d) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r11 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L51;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        t0 t0Var = (t0) this.f133072b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133071a;
        b bVar = this.f133073c;
        if (i14 == 0) {
            r.b(obj);
            g3.f35298f.getClass();
            g3 g3VarB = g3.a.b(null);
            this.f133072b = t0Var;
            this.f133071a = 1;
            if (t0Var.emit(g3VarB, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                x0 x0Var = bVar.f133056f;
                ArrayList<fg0.k> arrayList = bVar.f133054d;
                if (x0Var != x0.C || this.f133075e) {
                    arrayList.addAll((Collection) ((v2.b) v2Var).f47386a);
                } else {
                    Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (((fg0.k) obj2).getEventType() == gg0.f.f77137m) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String string = ((v2.a) v2Var).f47383a.toString();
                y.f136664a.getClass();
                y.a.c("ActivitiesEditViewModel", string);
            }
            g3.a aVar2 = g3.f35298f;
            ArrayList<fg0.k> arrayList3 = bVar.f133054d;
            aVar2.getClass();
            g3 g3VarD = g3.a.d(arrayList3);
            this.f133072b = null;
            this.f133071a = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        if (bVar.f133054d.isEmpty()) {
            String str2 = this.f133074d;
            LocalDate localDateMinusDays = LocalDate.parse(str2).minusDays(2);
            LocalDate localDatePlusDays = LocalDate.parse(str2).plusDays(2);
            x0 x0VarH = z0.h(bVar.f133056f);
            if (x0VarH == x0.f4354z) {
                str = x0.A.f4358a;
            } else if (x0VarH == x0.f4304m) {
                x0 x0Var2 = bVar.f133056f;
                str = x0Var2 != null ? x0Var2.f4358a : null;
            } else {
                str = x0VarH.f4358a;
            }
            zf0.d dVar = (zf0.d) bVar.f133052b.getValue();
            String string2 = localDateMinusDays.toString();
            string2.getClass();
            String string3 = localDatePlusDays.toString();
            string3.getClass();
            this.f133072b = t0Var;
            this.f133071a = 2;
            obj = dVar.g(string2, string3, str, this);
        } else {
            g3.a aVar3 = g3.f35298f;
            ArrayList<fg0.k> arrayList4 = bVar.f133054d;
            aVar3.getClass();
            g3 g3VarD2 = g3.a.d(arrayList4);
            this.f133072b = null;
            this.f133071a = 3;
        }
        return aVar;
    }
}
