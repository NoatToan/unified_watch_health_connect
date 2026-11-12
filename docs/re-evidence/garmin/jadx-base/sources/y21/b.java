package y21;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import m01.g;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.voicelogging.viewmodel.VoiceDictationViewModel$onDictationFinalized$2", f = "VoiceDictationViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f194232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f194232b = cVar;
        this.f194233c = str;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f194232b, this.f194233c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194231a;
        c cVar = this.f194232b;
        if (i14 == 0) {
            r.b(obj);
            g gVar = cVar.f194234a;
            String str = cVar.f194236c;
            String str2 = cVar.f194237d;
            this.f194231a = 1;
            obj = gVar.V(this.f194233c, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            p2 p2Var = cVar.f194238e;
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 404) {
                do {
                    value4 = p2Var.getValue();
                } while (!p2Var.b(value4, a.a((a) value4, false, null, false, true, false, null, false, 67)));
            } else {
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, a.a((a) value3, false, null, false, false, true, null, false, 67)));
            }
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            cVar.getClass();
            Iterable iterable = ((g01.b0) ((v2.b) v2Var).f47386a).f74102a;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b11.a.C0202a c0202aA = ((g01.r) it.next()).a();
                if (c0202aA != null) {
                    arrayList.add(c0202aA);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            p2 p2Var2 = cVar.f194238e;
            if (zIsEmpty) {
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, a.a((a) value2, false, null, false, true, false, null, false, 67)));
            } else {
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, a.a((a) value, false, null, false, false, false, arrayList, false, 67)));
            }
        }
        return Unit.INSTANCE;
    }
}
