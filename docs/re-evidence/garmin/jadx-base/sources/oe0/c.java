package oe0;

import android.content.Context;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.v2;
import ne0.j0;
import ne0.k0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.AddDogViewModel$saveDog$2", f = "AddDogViewModel.kt", l = {98, 100}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pe0.c f131252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f131254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f131255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f131254c = dVar;
        this.f131255d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f131254c, this.f131255d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r2 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        pe0.c cVarA;
        Object objE0;
        Object value;
        Object objE1;
        Context context;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131253b;
        d dVar = this.f131254c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = dVar.f131261f;
            p2 p2Var2 = dVar.f131261f;
            cVarA = pe0.c.a((pe0.c) p2Var.getValue(), null, null, null, null, null, ((pe0.c) p2Var2.getValue()).f137411f > 0.0d ? ((pe0.c) p2Var2.getValue()).f137411f : 0.0d, null, null, false, null, 991);
            ne0.c cVar = (ne0.c) dVar.f131256a.getValue();
            this.f131252a = cVarA;
            this.f131253b = 1;
            objE0 = ge1.b.e0(cVar.f125433b, new ne0.b(cVar, cVarA, null), this);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            cVarA = this.f131252a;
            o13.r.b(obj);
            objE0 = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        p2 p2Var3 = dVar.f131259d;
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, a.a((a) value2, false, false, 4)));
        return Unit.INSTANCE;
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            long j8 = ((je0.f) ((v2.b) v2Var).f47386a).f98501a;
            Uri uri = cVarA.f137415j;
            this.f131252a = null;
            this.f131253b = 2;
            dVar.getClass();
            if (uri == null || (context = this.f131255d) == null) {
                objE1 = Unit.INSTANCE;
            } else {
                j0 j0Var = (j0) dVar.f131258c.getValue();
                j0Var.getClass();
                x53.c cVar2 = s0.f129406a;
                objE1 = ge1.b.e0(x53.b.f189152a, new k0(j0Var, context, uri, j8, null), this);
                if (objE1 != aVar) {
                    objE1 = Unit.INSTANCE;
                }
            }
        } else {
            p2 p2Var4 = dVar.f131259d;
            do {
                value = p2Var4.getValue();
            } while (!p2Var4.b(value, a.a((a) value, false, true, 2)));
        }
        return Unit.INSTANCE;
    }
}
