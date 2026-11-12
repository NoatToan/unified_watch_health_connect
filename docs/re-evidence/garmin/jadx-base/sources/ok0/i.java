package ok0;

import c80.u;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentViewModel$getConnectionActivityGearList$1", f = "ActivityDetailsGearFragmentViewModel.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c80.b f132485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f132486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f132487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f132488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c80.b bVar, g gVar, long j8, String str, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f132485c = bVar;
        this.f132486d = gVar;
        this.f132487e = j8;
        this.f132488f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f132485c, this.f132486d, this.f132487e, this.f132488f, dVar);
        iVar.f132484b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer value;
        Integer value2;
        b0 b0Var = (b0) this.f132484b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132483a;
        g gVar = this.f132486d;
        c80.b bVar = this.f132485c;
        if (i14 == 0) {
            o13.r.b(obj);
            z1<Integer> z1Var = bVar.f25298d;
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, new Integer(value.intValue() + 1)));
            kk0.b bVar2 = gVar.f132471a;
            this.f132484b = b0Var;
            this.f132483a = 1;
            obj = bVar2.l(this.f132487e, this.f132488f, this);
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
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching connection activity gear: ", ((v2.a) v2Var).f47385c);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "ActivityDetailsGearFragmentViewModel", strN);
            gVar.f132473c.setValue(j53.l.b());
            bVar.f25296b.setValue(j53.l.b());
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            Iterable<jk0.m> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (jk0.m mVar : iterable) {
                mVar.getClass();
                u uVar = mVar.f99289a;
                String str = mVar.f99290b;
                String str2 = mVar.f99291c;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new uk0.d("", uVar, str, str2, mVar.f99292d));
            }
            gVar.f132473c.setValue(i53.a.e(arrayList));
            z1<i53.c<c80.a>> z1Var2 = bVar.f25296b;
            ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
            for (jk0.m mVar2 : iterable) {
                mVar2.getClass();
                arrayList2.add(new c80.a(null, mVar2.f99289a.toString(), mVar2.f99290b, mVar2.f99291c, mVar2.f99292d));
            }
            z1Var2.setValue(i53.a.e(arrayList2));
        }
        z1<Integer> z1Var3 = bVar.f25298d;
        do {
            value2 = z1Var3.getValue();
        } while (!z1Var3.b(value2, new Integer(value2.intValue() - 1)));
        return Unit.INSTANCE;
    }
}
