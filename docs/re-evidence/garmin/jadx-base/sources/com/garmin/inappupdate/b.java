package com.garmin.inappupdate;

import am.j;
import e23.p;
import ht2.n;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper$initialize$2$1", f = "InAppUpdateCheckHelper.kt", l = {89, 96}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f52404b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f52404b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r3.e(r10) == r2) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52403a;
        String str = this.f52404b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            n nVar = n.f85666a;
            n63.b.a aVar2 = n63.b.f123892d;
            aVar2.getClass();
            e eVar = (e) aVar2.c(e.INSTANCE.serializer(), str);
            n.f85670e = eVar;
            eVar.getClass();
            String str2 = eVar.f52426e;
            String str3 = new zy2.a().getInfo().f52812b;
            if (s.g(str2, str3)) {
                ht2.a aVar3 = ht2.a.f85620a;
                String str4 = "initialize: using persisted update -> " + n.f85670e;
                n.f85666a.getClass();
                aVar3.b(str4);
            } else {
                ht2.a aVar4 = ht2.a.f85620a;
                String str5 = "initialize: removing persisted update (appVersionWhenPrompted " + str2 + " != currentAppVersion " + str3 + ") -> " + n.f85670e;
                n nVar2 = n.f85666a;
                nVar2.getClass();
                aVar4.b(str5);
                n.f85670e = null;
                this.f52403a = 1;
                if (nVar2.e(this) == aVar) {
                    return aVar;
                }
            }
        } catch (Throwable th3) {
            ht2.a aVar5 = ht2.a.f85620a;
            String strM = j.m("initialize: failed to decode '", str, "'");
            n nVar3 = n.f85666a;
            nVar3.getClass();
            aVar5.c(strM, th3);
            n.f85670e = null;
            this.f52403a = 2;
        }
        return Unit.INSTANCE;
    }
}
