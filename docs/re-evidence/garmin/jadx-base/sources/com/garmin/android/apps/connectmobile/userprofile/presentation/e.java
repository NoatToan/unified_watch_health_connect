package com.garmin.android.apps.connectmobile.userprofile.presentation;

import e23.p;
import lc.u0;
import m12.q;
import m12.u;
import m12.v;
import m12.x;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.e2;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$saveProfileChanges$1", f = "EditProfileViewModel.kt", l = {317, 319, 323}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f47070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f47070b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f47070b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r2.emit(r3, r17) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r2.emit(r4, r17) == r1) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        p2 p2Var;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f47069a;
        d dVar = this.f47070b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                objA = obj;
            } else {
                if (i14 != 2 && i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            p2Var = dVar.f47028l;
            do {
                value3 = p2Var.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var.b(value3, Boolean.FALSE));
            return Unit.INSTANCE;
        }
        r.b(obj);
        p2 p2Var2 = dVar.f47028l;
        do {
            value = p2Var2.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var2.b(value, Boolean.TRUE));
        q qVar = (q) dVar.f47032p.f150540a.getValue();
        String str = dVar.f47025i;
        q qVar2 = dVar.f47030n;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar2 != null ? qVar2.f115856b : null;
        com.garmin.android.apps.connectmobile.userprofile.model.r rVar2 = qVar != null ? qVar.f115856b : null;
        nj1.e eVar = qVar2 != null ? qVar2.f115857c : null;
        nj1.e eVar2 = qVar != null ? qVar.f115857c : null;
        nj1.e eVar3 = eVar2;
        u uVar = new u(str, rVar, rVar2, eVar, eVar3, qVar2 != null ? Boolean.valueOf(qVar2.f115858d) : null, qVar != null ? Boolean.valueOf(qVar.f115858d) : null, dVar.f47026j);
        v vVar = dVar.f47021e;
        this.f47069a = 1;
        objA = vVar.a(uVar, this);
        if (objA != aVar) {
        }
        return aVar;
        x xVar = (x) objA;
        if (!s.g(xVar, x.b.f115911a)) {
            if (s.g(xVar, x.c.f115912a)) {
                e2 e2Var = dVar.f47033q;
                a.C0906a c0906a = new a.C0906a(true);
                this.f47069a = 3;
            } else {
                if (!s.g(xVar, x.a.f115910a)) {
                    u0.r();
                    return null;
                }
                p2 p2Var3 = dVar.f47029m;
                do {
                    value2 = p2Var3.getValue();
                    ((Boolean) value2).getClass();
                } while (!p2Var3.b(value2, Boolean.TRUE));
            }
            p2Var = dVar.f47028l;
            do {
                value3 = p2Var.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var.b(value3, Boolean.FALSE));
            return Unit.INSTANCE;
        }
        e2 e2Var2 = dVar.f47033q;
        a.C0906a c0906a2 = new a.C0906a(dVar.f47035t);
        this.f47069a = 2;
    }
}
