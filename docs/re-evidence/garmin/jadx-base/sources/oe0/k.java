package oe0;

import ne0.e0;
import ne0.f0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$toggleDogStatus$1", f = "DogProfileViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f131339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pe0.f f131340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f131342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f131342d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f131342d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        j jVar;
        Object value;
        pe0.f fVar;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131341c;
        if (i14 == 0) {
            o13.r.b(obj);
            jVar = this.f131342d;
            pe0.f fVar2 = (pe0.f) jVar.f131288e.getValue();
            if (fVar2 != null) {
                p2 p2Var = jVar.f131290g;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.TRUE));
                je0.j jVar2 = fVar2.f137427h;
                je0.j jVar3 = je0.j.ACTIVE;
                if (jVar2 == jVar3) {
                    jVar3 = je0.j.RETIRED;
                }
                f0 f0Var = (f0) jVar.f131286c.getValue();
                long j8 = fVar2.f137420a;
                this.f131339a = jVar;
                this.f131340b = fVar2;
                this.f131341c = 1;
                f0Var.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new e0(f0Var, j8, jVar3, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
                fVar = fVar2;
                obj = objE0;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar = this.f131340b;
        jVar = this.f131339a;
        o13.r.b(obj);
        j jVar4 = jVar;
        if (((Boolean) obj).booleanValue()) {
            jVar4.x4(fVar.f137420a);
        } else {
            p2 p2Var2 = jVar4.f131294k;
            do {
                value2 = p2Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!p2Var2.b(value2, Boolean.TRUE));
        }
        p2 p2Var3 = jVar4.f131290g;
        do {
            value3 = p2Var3.getValue();
            ((Boolean) value3).getClass();
        } while (!p2Var3.b(value3, Boolean.FALSE));
        return Unit.INSTANCE;
    }
}
