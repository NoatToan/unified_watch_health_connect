package com.garmin.android.apps.connectmobile.contacts;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import m20.z;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import re0.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$saveContact$1", f = "ContactViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f32494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l20.a f32495c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll20/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$saveContact$1$result$1", f = "ContactViewModel.kt", l = {276, 278, 284, 286}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends l20.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f32497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l20.a f32498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l20.a f32499d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, l20.a aVar, l20.a aVar2, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f32497b = dVar;
            this.f32498c = aVar;
            this.f32499d = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f32497b, this.f32498c, this.f32499d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends l20.a>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            if (r0 == r6) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        
            if (r0 == r6) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        
            if (r0 == r6) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        
            if (r0 == r6) goto L43;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objQ;
            Object objH;
            Object objH2;
            Object objF;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32496a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    objF = obj;
                    return (v2) objF;
                }
                if (i14 == 2) {
                    r.b(obj);
                    objH2 = obj;
                    return (v2) objH2;
                }
                if (i14 == 3) {
                    r.b(obj);
                    objH = obj;
                    return (v2) objH;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objQ = obj;
                return (v2) objQ;
            }
            r.b(obj);
            d dVar = this.f32497b;
            hl.a aVar2 = dVar.f32388c;
            hl.a aVar3 = dVar.f32388c;
            boolean zG = s.g(aVar2, hl.a.c.f84256b);
            l20.a aVar4 = this.f32499d;
            l20.a aVar5 = this.f32498c;
            if (zG) {
                String contactId = aVar5.getContactId();
                z zVar = dVar.f32386a;
                if (contactId == null) {
                    this.f32496a = 1;
                    objF = zVar.f(aVar4, this);
                } else {
                    this.f32496a = 2;
                    objH2 = zVar.h(aVar4, this);
                }
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                String contactId2 = aVar5.getContactId();
                o oVar = dVar.f32387b;
                if (contactId2 == null) {
                    long j8 = ((hl.a.b) aVar3).f84252b;
                    this.f32496a = 3;
                    objH = oVar.h(j8, aVar4, this);
                } else {
                    long j14 = ((hl.a.b) aVar3).f84252b;
                    String contactId3 = aVar5.getContactId();
                    if (contactId3 == null) {
                        contactId3 = "";
                    }
                    this.f32496a = 4;
                    objQ = oVar.q(j14, contactId3, this.f32499d, this);
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, l20.a aVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f32494b = dVar;
        this.f32495c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f32494b, this.f32495c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f32493a;
        d dVar = this.f32494b;
        if (i14 == 0) {
            r.b(obj);
            dVar.f32399n.j(g3.a.c(g3.f35298f));
            boolean z14 = dVar.f32403r;
            l20.a aVar2 = this.f32495c;
            l20.a aVarB4 = z14 ? dVar.B4(aVar2) : dVar.C4(aVar2);
            x53.c cVar = s0.f129406a;
            a aVar3 = new a(dVar, aVar2, aVarB4, null);
            this.f32493a = 1;
            objE0 = ge1.b.e0(cVar, aVar3, this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            dVar.f32396k = true;
            dVar.x4();
            dVar.f32397l.j(new d.b(false, false, null, null, null, 0, 0, false, false, false, false, false, true, (l20.a) ((v2.b) v2Var).f47386a, false, false, false, null, null, 511999, null));
        } else {
            dVar.f32399n.j(g3.a.a(g3.f35298f, v2Var.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
