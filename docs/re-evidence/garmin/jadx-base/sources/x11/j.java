package x11;

import b11.v;
import b63.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;
import r53.p2;
import v01.m1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionConfirmationViewModel$logFood$1", f = "ImageRecognitionConfirmationViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f188427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f188428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f188429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f188429c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f188429c, dVar);
        jVar.f188428b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        Object value2;
        b11.b bVar;
        Object value3;
        f fVar;
        b11.l lVar;
        b0 b0Var = (b0) this.f188428b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188427a;
        g gVar = this.f188429c;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = gVar.f188419g;
            p2 p2Var2 = gVar.f188419g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, null, null, null, true, null, false, 239)));
            i53.c<v> cVar = ((f) p2Var2.getValue()).f188408d;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            for (v vVar : cVar) {
                b63.v vVar2 = ((f) p2Var2.getValue()).f188405a;
                b11.l lVar2 = ((f) p2Var2.getValue()).f188406b;
                arrayList.add(v.N3(vVar, vVar2, lVar2 != null ? new Long(lVar2.f14331a) : null, i01.e.ADD, i01.i.IMAGE_RECOGNITION, null, 48));
            }
            n1 n1Var = gVar.f188417e;
            o oVarB = gVar.f188413a.b();
            this.f188428b = b0Var;
            this.f188427a = 1;
            objE0 = ge1.b.e0(n1Var.f174480c, new m1(arrayList, oVarB, n1Var, j0.f134944a, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ImageRecognitionConfirmationViewModel", "logFood: food successfully logged");
            i53.c<v> cVar2 = ((f) gVar.f188420h.f150540a.getValue()).f188408d;
            if (cVar2 != null && cVar2.isEmpty()) {
                bVar = b11.b.RECIPE;
                break;
            }
            Iterator<v> it = cVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = b11.b.RECIPE;
                    break;
                }
                if (!(it.next() instanceof b11.a.c)) {
                    bVar = b11.b.FOOD;
                    break;
                }
            }
            b11.b bVar2 = bVar;
            p2 p2Var3 = gVar.f188419g;
            do {
                value3 = p2Var3.getValue();
                fVar = (f) value3;
                lVar = ((f) gVar.f188420h.f150540a.getValue()).f188406b;
            } while (!p2Var3.b(value3, f.a(fVar, null, null, null, false, new v11.a(lVar != null ? new Long(lVar.f14331a) : null, bVar2), false, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "ImageRecognitionConfirmationViewModel", "logFood: failed to log food");
            p2 p2Var4 = gVar.f188419g;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, f.a((f) value2, null, null, null, false, null, true, 175)));
        }
        return Unit.INSTANCE;
    }
}
