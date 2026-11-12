package com.garmin.android.library.mobileauth.ui.mfa;

import android.content.Context;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rc2.c0;
import sc2.f;
import sc2.g;
import u53.o;
import v13.i;
import vb.h;
import ze2.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$requestLoginToken$2", f = "AbstractMFAFlowActivity.kt", l = {335, 350}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f50528b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$requestLoginToken$2$1", f = "AbstractMFAFlowActivity.kt", l = {345, 347}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.android.library.mobileauth.ui.mfa.a f50529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f50531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.mobileauth.ui.mfa.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f50531c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f50531c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r2 == r1) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE0;
            com.garmin.android.library.mobileauth.ui.mfa.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50530b;
            com.garmin.android.library.mobileauth.ui.mfa.a aVar3 = this.f50531c;
            if (i14 != 0) {
                if (i14 == 1) {
                    com.garmin.android.library.mobileauth.ui.mfa.a aVar4 = this.f50529a;
                    r.b(obj);
                    aVar = aVar4;
                    objE0 = obj;
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
            Context applicationContext = aVar3.getApplicationContext();
            applicationContext.getClass();
            ve2.e eVar = aVar3.Z9().f177690a;
            String str = aVar3.Z9().f177691b;
            g gVar = aVar3.f50493m;
            o13.p<? extends sc2.a, String> pVar = aVar3.f50504z;
            if (pVar == null) {
                s.m("credential");
                throw null;
            }
            rc2.b0 b0Var = new rc2.b0(applicationContext, eVar, str, gVar, pVar, aVar3.ca(), null, aVar3.aa(), aVar3.R9().d(), 64, null);
            this.f50529a = aVar3;
            this.f50530b = 1;
            x53.c cVar = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new c0(b0Var, null), this);
            if (objE0 != aVar2) {
                aVar = aVar3;
            }
            return aVar2;
            aVar.f50495o = (f) wc2.b.a((wc2.a) objE0);
            this.f50529a = null;
            this.f50530b = 2;
            aVar3.f50497q.debug("useITLoginToken");
            x53.c cVar2 = s0.f129406a;
            Object objE1 = ge1.b.e0(o.f168762a, new c(aVar3, null), this);
            if (objE1 != aVar2) {
                objE1 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.mobileauth.ui.mfa.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f50528b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f50528b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (ge1.b.e0(r8, r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r6.ga("requestLoginToken", r1, r8, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f50527a;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f50528b;
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
            aVar2.f50497q.debug("requestLoginToken");
            aVar2.da(com.garmin.android.library.mobileauth.ui.mfa.a.C1007a.EnumC1008a.f50505b);
            aVar2.T9();
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(aVar2, null);
            this.f50527a = 1;
        } catch (Exception e4) {
            l lVar = l.EXCEPTION;
            String message = e4.getMessage();
            this.f50527a = 2;
        }
        return Unit.INSTANCE;
    }
}
