package com.garmin.android.apps.connectmobile.userprofile.presentation;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import m12.m;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pu.k;
import r53.e2;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$handleLoginToken$1", f = "EditProfileViewModel.kt", l = {254, 256}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f47012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f47012b = dVar;
        this.f47013c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f47012b, this.f47013c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r1.emit(r4, r7) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        p2 p2Var;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f47011a;
        String str = this.f47013c;
        d dVar = this.f47012b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var2 = dVar.f47028l;
            do {
                value = p2Var2.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var2.b(value, Boolean.TRUE));
            m mVar = dVar.f47020d;
            this.f47011a = 1;
            obj = mVar.a(str, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            e2 e2Var = dVar.f47033q;
            String strA = ((k) ((v2.b) v2Var).f47386a).a();
            strA.getClass();
            a.c cVar = new a.c(str, strA);
            this.f47011a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
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
}
