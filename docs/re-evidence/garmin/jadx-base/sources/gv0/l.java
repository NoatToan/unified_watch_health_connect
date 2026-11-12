package gv0;

import com.garmin.android.apps.connectmobile.g3;
import java.util.Collection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$fetchSharingOptions$1", f = "LiveTrackSettingsViewModel.kt", l = {231, 232, 232}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79316b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f79317a;

        public a(d dVar) {
            this.f79317a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object value;
            ou0.f fVar;
            ge2.e eVar = (ge2.e) obj;
            if (eVar != null) {
                ou0.f fVarA = ou0.a.a(eVar);
                boolean z14 = false;
                boolean z15 = (fVarA.f133983a == null || fVarA.f133984b == null) ? false : true;
                d dVar2 = this.f79317a;
                p2 p2Var = dVar2.H0;
                p2 p2Var2 = dVar2.f79203v;
                Collection collection = (Collection) ((g3) p2Var.getValue()).f35301b;
                boolean z16 = collection == null || collection.isEmpty();
                if (dVar2.Y == null) {
                    boolean z17 = dVar2.J0;
                    if ((z17 && !z16) || (!z17 && z15 && fVarA.f133986d != null)) {
                        z14 = true;
                    }
                    dVar2.Y = Boolean.valueOf(z14);
                }
                ou0.f fVar2 = (ou0.f) ((g3) p2Var2.getValue()).f35301b;
                ou0.f fVarA2 = ou0.f.a(fVarA, null, null, fVar2 != null ? fVar2.f133985c : null, null, null, 59);
                do {
                    value = p2Var2.getValue();
                    g3 g3Var = (g3) value;
                    g3.a aVar = g3.f35298f;
                    fVar = p005kotlin.jvm.internal.s.g(dVar2.Y, Boolean.TRUE) ? fVarA2 : (ou0.f) g3Var.f35301b;
                    aVar.getClass();
                } while (!p2Var2.b(value, g3.a.d(fVar)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, t13.d<? super l> dVar2) {
        super(2, dVar2);
        this.f79316b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f79316b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (((r53.i) r7).collect(r1, r6) == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79315a;
        d dVar = this.f79316b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f79315a = 1;
            if (d.z4(dVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            a aVar2 = new a(dVar);
            this.f79315a = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f79315a = 2;
        int i15 = d.O0;
        dVar.getClass();
        o53.k kVar = new o53.k(u13.f.b(this), 1);
        kVar.q();
        dVar.Y4(new k(kVar));
        obj = kVar.p();
        if (obj != aVar) {
            a aVar3 = new a(dVar);
            this.f79315a = 3;
        }
        return aVar;
    }
}
