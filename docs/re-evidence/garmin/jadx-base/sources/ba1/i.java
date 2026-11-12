package ba1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$handlePersonalRecordCandidateDeclined$1", f = "PersonalRecordsViewModel.kt", l = {327}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f17037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q91.d f17038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f17040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q91.d f17041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, q91.d dVar2, t13.d<? super i> dVar3) {
        super(2, dVar3);
        this.f17040d = dVar;
        this.f17041e = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f17040d, this.f17041e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        q91.d dVar2;
        Object next;
        q91.d dVar3;
        List<n91.a> value;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f17039c;
        if (i14 == 0) {
            r.b(obj);
            dVar = this.f17040d;
            Iterator<T> it = dVar.f16989o.getValue().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                dVar2 = this.f17041e;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                n91.a aVar2 = (n91.a) next;
                if (aVar2.r() && aVar2.getTypeId() == dVar2.f143579a) {
                    break;
                }
            }
            n91.a aVar3 = (n91.a) next;
            if (aVar3 != null) {
                d.z4(dVar, dVar2, true);
                Long l14 = aVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (l14 != null) {
                    o91.a aVar4 = dVar.f16976b;
                    long jLongValue = l14.longValue();
                    this.f17037a = dVar;
                    this.f17038b = dVar2;
                    this.f17039c = 1;
                    obj = aVar4.c(jLongValue, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    dVar3 = dVar2;
                }
                d.z4(dVar, dVar2, false);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dVar3 = this.f17038b;
        dVar = this.f17037a;
        r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            z1<List<n91.a>> z1Var = dVar.f16989o;
            do {
                value = z1Var.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : value) {
                    n91.a aVar5 = (n91.a) obj2;
                    if (!aVar5.r() || aVar5.getTypeId() != dVar3.f143579a) {
                        arrayList.add(obj2);
                    }
                }
            } while (!z1Var.b(value, arrayList));
            dVar.L4();
            dVar.D = true;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar6 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            String str = "Error while declining personal record: " + ((v2.a) v2Var).f47383a;
            aVar6.getClass();
            i2.a.e(a2Var, str);
            dVar.f16983i.a();
        }
        dVar2 = dVar3;
        d.z4(dVar, dVar2, false);
        return Unit.INSTANCE;
    }
}
