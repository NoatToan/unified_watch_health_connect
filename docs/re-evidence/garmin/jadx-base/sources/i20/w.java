package i20;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m20.z;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.edit.EditContactViewModel$setContactToEdit$1", f = "EditContactViewModel.kt", l = {71, 72}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f87224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f87225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, String str, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f87224b = tVar;
        this.f87225c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f87224b, this.f87225c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objO;
        Object objG;
        v2 v2Var;
        l20.a aVar;
        Object next;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87223a;
        t tVar = this.f87224b;
        if (i14 == 0) {
            o13.r.b(obj);
            hl.a aVar3 = tVar.f87204c;
            if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                z zVar = tVar.f87202a;
                this.f87223a = 1;
                objG = zVar.g(this);
            } else {
                if (!(aVar3 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                re0.o oVar = tVar.f87203b;
                long j8 = ((hl.a.b) tVar.f87204c).f84252b;
                this.f87223a = 2;
                objO = oVar.o(j8, this);
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objG = obj;
            v2Var = (v2) objG;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objO = obj;
            v2Var = (v2) objO;
        }
        if (v2Var instanceof v2.b) {
            l20.r rVar = (l20.r) ((v2.b) v2Var).f47386a;
            List<l20.a> listF = rVar.f();
            String str = this.f87225c;
            Object obj2 = null;
            if (listF != null) {
                Iterator<T> it = listF.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.a) next).getContactId(), str));
                aVar = (l20.a) next;
                if (aVar == null) {
                    aVar = new l20.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
            } else {
                aVar = new l20.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            }
            tVar.f87205d = aVar;
            y0<g3<l20.a>> y0Var = tVar.f87211j;
            g3.a aVar4 = g3.f35298f;
            List<l20.a> listF2 = rVar.f();
            if (listF2 != null) {
                for (Object obj3 : listF2) {
                    if (p005kotlin.jvm.internal.s.g(((l20.a) obj3).getContactId(), str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (l20.a) obj2;
            }
            aVar4.getClass();
            y0Var.j(g3.a.d(obj2));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            tVar.f87211j.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
