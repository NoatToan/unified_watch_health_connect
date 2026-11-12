package com.garmin.android.apps.connectmobile.startup;

import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import aq1.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2$b;", "", "Ld20/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$getCountries$1", f = "StartupChecksViewModel.kt", l = {124, 127, 132}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<t0<v2.b<? extends List<? extends d20.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f44850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f44850c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f44850c, dVar);
        fVar.f44849b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2.b<? extends List<? extends d20.b>>> t0Var, t13.d<? super Unit> dVar) {
        return ((f) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r0.emit(null, r10) == r1) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f44849b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f44848a;
        e eVar = this.f44850c;
        if (i14 == 0) {
            r.b(obj);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "getCountries()");
            y0<j> y0Var = eVar.f44831d;
            if (y0Var == null) {
                s.m("startupChecksLiveData");
                throw null;
            }
            j.f44873f.getClass();
            y0Var.m(j.a.b());
            aq1.i iVar = eVar.f44828a;
            this.f44849b = t0Var;
            this.f44848a = 1;
            obj = iVar.c(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2 && i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        y0<j> y0Var2 = eVar.f44831d;
        if (y0Var2 == null) {
            s.m("startupChecksLiveData");
            throw null;
        }
        j.f44873f.getClass();
        y0Var2.m(new j(j0.HIDE_LOADING, null, null, null, null, 30, null));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "StartupChecksViewModel", "GET COUNTRIES -> SUCCESS");
            this.f44849b = null;
            this.f44848a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET COUNTRIES -> failed with status = ", v2Var);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "StartupChecksViewModel", strF);
            this.f44849b = null;
            this.f44848a = 3;
        }
    }
}
