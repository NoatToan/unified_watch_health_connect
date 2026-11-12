package oe0;

import android.content.Context;
import ne0.g0;
import ne0.i0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.EditDogViewModel$updateDog$2", f = "EditDogViewModel.kt", l = {159, 162}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pe0.j f131437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f131439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f131440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, Context context, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f131439c = sVar;
        this.f131440d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f131439c, this.f131440d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        pe0.j jVar;
        Object objX4;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131438b;
        s sVar = this.f131439c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = sVar.f131412h;
                p2 p2Var2 = sVar.f131412h;
                pe0.j jVarA = pe0.j.a((pe0.j) p2Var.getValue(), null, null, null, null, null, ((pe0.j) p2Var2.getValue()).f137456f > 0.0d ? ((pe0.j) p2Var2.getValue()).f137456f : 0.0d, null, null, false, null, null, 2015);
                i0 i0Var = (i0) sVar.f131405a.getValue();
                long j8 = sVar.f131416l;
                this.f131437a = jVarA;
                this.f131438b = 1;
                objE0 = ge1.b.e0(i0Var.f125479b, new g0(i0Var, jVarA, j8, null), this);
                if (objE0 != aVar) {
                    jVar = jVarA;
                }
                return aVar;
            }
            if (i14 == 1) {
                pe0.j jVar2 = this.f131437a;
                o13.r.b(obj);
                jVar = jVar2;
                objE0 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objX4 = obj;
            }
            if (((Boolean) objX4).booleanValue()) {
                p2 p2Var3 = sVar.f131410f;
                do {
                    value3 = p2Var3.getValue();
                } while (!p2Var3.b(value3, o.a((o) value3, false, false, true, false, false, 249)));
                sVar.f131416l = -1L;
            } else {
                p2 p2Var4 = sVar.f131410f;
                do {
                    value2 = p2Var4.getValue();
                } while (!p2Var4.b(value2, o.a((o) value2, false, false, false, true, false, 245)));
            }
            return Unit.INSTANCE;
            je0.f fVar = (je0.f) objE0;
            je0.f fVarA = je0.f.a(fVar, fVar.f98517q);
            Context context = this.f131440d;
            this.f131437a = null;
            this.f131438b = 2;
            objX4 = s.x4(sVar, fVarA, jVar, context, this);
        } catch (Exception unused) {
            p2 p2Var5 = sVar.f131410f;
            do {
                value = p2Var5.getValue();
            } while (!p2Var5.b(value, o.a((o) value, false, false, false, true, false, 245)));
        }
    }
}
