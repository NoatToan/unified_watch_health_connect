package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import ip.f;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyViewModel$checkPendingUpdatePrivacyRequest$1", f = "ActivitiesPrivacyViewModel.kt", l = {145, 148, 150, SyslogConstants.LOG_LOCAL3, 154, 158, 159, 162}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f47171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f47172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f47176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f47176f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f47176f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007b A[PHI: r12
      0x007b: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v8 java.lang.Object) binds: [B:17:0x0077, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7 A[PHI: r12
      0x00e7: PHI (r12v15 java.lang.Object) = (r12v5 java.lang.Object), (r12v16 java.lang.Object) binds: [B:20:0x007f, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a A[PHI: r4 r5 r12
      0x010a: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:36:0x0107, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r5v1 com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b) = 
      (r5v0 com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b)
      (r5v2 com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b)
     binds: [B:36:0x0107, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r12v17 java.lang.Object) = (r12v15 java.lang.Object), (r12v18 java.lang.Object) binds: [B:36:0x0107, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r2.emit(r8, r11) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013a, code lost:
    
        if (r12.emit(r2, r11) == r0) goto L44;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objF;
        boolean zBooleanValue;
        Object obj2;
        int i14;
        b bVar;
        e2 e2Var;
        b.AbstractC0915b.a aVar;
        Object obj3;
        int i15;
        b bVar2;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f47175e;
        int i17 = 0;
        b bVar3 = this.f47176f;
        switch (i16) {
            case 0:
                r.b(obj);
                p2 p2Var = bVar3.f47151e;
                b.a aVarA = b.a.a((b.a) p2Var.getValue(), false, true, 7);
                this.f47175e = 1;
                p2Var.k(null, aVarA);
                if (Unit.INSTANCE != aVar2) {
                    f fVar = bVar3.f47147a;
                    this.f47175e = 2;
                    objF = fVar.f(this);
                    if (objF != aVar2) {
                        int i18 = q.f128596b;
                        if (objF instanceof q.b) {
                            if (q.b(objF) != null) {
                                p2 p2Var2 = bVar3.f47151e;
                                b.a aVarA2 = b.a.a((b.a) p2Var2.getValue(), false, false, 7);
                                this.f47171a = objF;
                                this.f47172b = bVar3;
                                this.f47174d = 0;
                                this.f47175e = 6;
                                p2Var2.k(null, aVarA2);
                                if (Unit.INSTANCE != aVar2) {
                                    e2Var = bVar3.f47152f;
                                    aVar = new b.AbstractC0915b.a(new fw.r());
                                    this.f47171a = objF;
                                    this.f47172b = bVar3;
                                    this.f47174d = i17;
                                    this.f47175e = 7;
                                    if (e2Var.emit(aVar, this) != aVar2) {
                                        obj3 = objF;
                                        i15 = i17;
                                        bVar2 = bVar3;
                                        e2 e2Var2 = bVar2.f47152f;
                                        b.AbstractC0915b.c cVar = b.AbstractC0915b.c.f47165a;
                                        this.f47171a = obj3;
                                        this.f47172b = null;
                                        this.f47174d = i15;
                                        this.f47175e = 8;
                                    }
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        zBooleanValue = ((Boolean) objF).booleanValue();
                        p2 p2Var3 = bVar3.f47151e;
                        b.a aVarA3 = b.a.a((b.a) p2Var3.getValue(), false, false, 7);
                        this.f47171a = objF;
                        this.f47172b = bVar3;
                        this.f47173c = zBooleanValue;
                        this.f47174d = 0;
                        this.f47175e = 3;
                        p2Var3.k(null, aVarA3);
                        if (Unit.INSTANCE != aVar2) {
                            obj2 = objF;
                            i14 = 0;
                            bVar = bVar3;
                            if (!zBooleanValue) {
                                e2 e2Var3 = bVar.f47152f;
                                b.AbstractC0915b.c cVar2 = b.AbstractC0915b.c.f47165a;
                                this.f47171a = obj2;
                                this.f47172b = null;
                                this.f47173c = zBooleanValue;
                                this.f47174d = i14;
                                this.f47175e = 5;
                            } else {
                                p2 p2Var4 = bVar.f47151e;
                                b.a aVarA4 = b.a.a((b.a) p2Var4.getValue(), true, false, 13);
                                this.f47171a = obj2;
                                this.f47172b = null;
                                this.f47173c = zBooleanValue;
                                this.f47174d = i14;
                                this.f47175e = 4;
                                p2Var4.k(null, aVarA4);
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 1:
                r.b(obj);
                f fVar2 = bVar3.f47147a;
                this.f47175e = 2;
                objF = fVar2.f(this);
                if (objF != aVar2) {
                    int i19 = q.f128596b;
                    if (objF instanceof q.b) {
                        if (q.b(objF) != null) {
                            p2 p2Var5 = bVar3.f47151e;
                            b.a aVarA5 = b.a.a((b.a) p2Var5.getValue(), false, false, 7);
                            this.f47171a = objF;
                            this.f47172b = bVar3;
                            this.f47174d = 0;
                            this.f47175e = 6;
                            p2Var5.k(null, aVarA5);
                            if (Unit.INSTANCE != aVar2) {
                                e2Var = bVar3.f47152f;
                                aVar = new b.AbstractC0915b.a(new fw.r());
                                this.f47171a = objF;
                                this.f47172b = bVar3;
                                this.f47174d = i17;
                                this.f47175e = 7;
                                if (e2Var.emit(aVar, this) != aVar2) {
                                    obj3 = objF;
                                    i15 = i17;
                                    bVar2 = bVar3;
                                    e2 e2Var4 = bVar2.f47152f;
                                    b.AbstractC0915b.c cVar3 = b.AbstractC0915b.c.f47165a;
                                    this.f47171a = obj3;
                                    this.f47172b = null;
                                    this.f47174d = i15;
                                    this.f47175e = 8;
                                }
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    zBooleanValue = ((Boolean) objF).booleanValue();
                    p2 p2Var6 = bVar3.f47151e;
                    b.a aVarA6 = b.a.a((b.a) p2Var6.getValue(), false, false, 7);
                    this.f47171a = objF;
                    this.f47172b = bVar3;
                    this.f47173c = zBooleanValue;
                    this.f47174d = 0;
                    this.f47175e = 3;
                    p2Var6.k(null, aVarA6);
                    if (Unit.INSTANCE != aVar2) {
                        obj2 = objF;
                        i14 = 0;
                        bVar = bVar3;
                        if (!zBooleanValue) {
                            e2 e2Var5 = bVar.f47152f;
                            b.AbstractC0915b.c cVar4 = b.AbstractC0915b.c.f47165a;
                            this.f47171a = obj2;
                            this.f47172b = null;
                            this.f47173c = zBooleanValue;
                            this.f47174d = i14;
                            this.f47175e = 5;
                        } else {
                            p2 p2Var7 = bVar.f47151e;
                            b.a aVarA7 = b.a.a((b.a) p2Var7.getValue(), true, false, 13);
                            this.f47171a = obj2;
                            this.f47172b = null;
                            this.f47173c = zBooleanValue;
                            this.f47174d = i14;
                            this.f47175e = 4;
                            p2Var7.k(null, aVarA7);
                        }
                    }
                    break;
                }
                return aVar2;
            case 2:
                r.b(obj);
                objF = ((q) obj).f128597a;
                int i110 = q.f128596b;
                if (objF instanceof q.b) {
                    if (q.b(objF) != null) {
                        p2 p2Var8 = bVar3.f47151e;
                        b.a aVarA8 = b.a.a((b.a) p2Var8.getValue(), false, false, 7);
                        this.f47171a = objF;
                        this.f47172b = bVar3;
                        this.f47174d = 0;
                        this.f47175e = 6;
                        p2Var8.k(null, aVarA8);
                        if (Unit.INSTANCE != aVar2) {
                            e2Var = bVar3.f47152f;
                            aVar = new b.AbstractC0915b.a(new fw.r());
                            this.f47171a = objF;
                            this.f47172b = bVar3;
                            this.f47174d = i17;
                            this.f47175e = 7;
                            if (e2Var.emit(aVar, this) != aVar2) {
                                obj3 = objF;
                                i15 = i17;
                                bVar2 = bVar3;
                                e2 e2Var6 = bVar2.f47152f;
                                b.AbstractC0915b.c cVar5 = b.AbstractC0915b.c.f47165a;
                                this.f47171a = obj3;
                                this.f47172b = null;
                                this.f47174d = i15;
                                this.f47175e = 8;
                            }
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                zBooleanValue = ((Boolean) objF).booleanValue();
                p2 p2Var9 = bVar3.f47151e;
                b.a aVarA9 = b.a.a((b.a) p2Var9.getValue(), false, false, 7);
                this.f47171a = objF;
                this.f47172b = bVar3;
                this.f47173c = zBooleanValue;
                this.f47174d = 0;
                this.f47175e = 3;
                p2Var9.k(null, aVarA9);
                if (Unit.INSTANCE != aVar2) {
                    obj2 = objF;
                    i14 = 0;
                    bVar = bVar3;
                    if (!zBooleanValue) {
                        e2 e2Var7 = bVar.f47152f;
                        b.AbstractC0915b.c cVar6 = b.AbstractC0915b.c.f47165a;
                        this.f47171a = obj2;
                        this.f47172b = null;
                        this.f47173c = zBooleanValue;
                        this.f47174d = i14;
                        this.f47175e = 5;
                    } else {
                        p2 p2Var10 = bVar.f47151e;
                        b.a aVarA10 = b.a.a((b.a) p2Var10.getValue(), true, false, 13);
                        this.f47171a = obj2;
                        this.f47172b = null;
                        this.f47173c = zBooleanValue;
                        this.f47174d = i14;
                        this.f47175e = 4;
                        p2Var10.k(null, aVarA10);
                    }
                }
                break;
                return aVar2;
            case 3:
                int i24 = this.f47174d;
                zBooleanValue = this.f47173c;
                bVar = this.f47172b;
                Object obj4 = this.f47171a;
                r.b(obj);
                i14 = i24;
                obj2 = obj4;
                if (!zBooleanValue) {
                    p2 p2Var11 = bVar.f47151e;
                    b.a aVarA11 = b.a.a((b.a) p2Var11.getValue(), true, false, 13);
                    this.f47171a = obj2;
                    this.f47172b = null;
                    this.f47173c = zBooleanValue;
                    this.f47174d = i14;
                    this.f47175e = 4;
                    p2Var11.k(null, aVarA11);
                    break;
                } else {
                    e2 e2Var8 = bVar.f47152f;
                    b.AbstractC0915b.c cVar7 = b.AbstractC0915b.c.f47165a;
                    this.f47171a = obj2;
                    this.f47172b = null;
                    this.f47173c = zBooleanValue;
                    this.f47174d = i14;
                    this.f47175e = 5;
                    break;
                }
                return aVar2;
            case 4:
            case 5:
                obj2 = this.f47171a;
                r.b(obj);
                objF = obj2;
                if (q.b(objF) != null) {
                    p2 p2Var12 = bVar3.f47151e;
                    b.a aVarA12 = b.a.a((b.a) p2Var12.getValue(), false, false, 7);
                    this.f47171a = objF;
                    this.f47172b = bVar3;
                    this.f47174d = 0;
                    this.f47175e = 6;
                    p2Var12.k(null, aVarA12);
                    if (Unit.INSTANCE != aVar2) {
                        e2Var = bVar3.f47152f;
                        aVar = new b.AbstractC0915b.a(new fw.r());
                        this.f47171a = objF;
                        this.f47172b = bVar3;
                        this.f47174d = i17;
                        this.f47175e = 7;
                        if (e2Var.emit(aVar, this) != aVar2) {
                            obj3 = objF;
                            i15 = i17;
                            bVar2 = bVar3;
                            e2 e2Var9 = bVar2.f47152f;
                            b.AbstractC0915b.c cVar8 = b.AbstractC0915b.c.f47165a;
                            this.f47171a = obj3;
                            this.f47172b = null;
                            this.f47174d = i15;
                            this.f47175e = 8;
                        }
                        break;
                    }
                    return aVar2;
                }
                return Unit.INSTANCE;
            case 6:
                i17 = this.f47174d;
                bVar3 = this.f47172b;
                Object obj5 = this.f47171a;
                r.b(obj);
                objF = obj5;
                e2Var = bVar3.f47152f;
                aVar = new b.AbstractC0915b.a(new fw.r());
                this.f47171a = objF;
                this.f47172b = bVar3;
                this.f47174d = i17;
                this.f47175e = 7;
                if (e2Var.emit(aVar, this) != aVar2) {
                    obj3 = objF;
                    i15 = i17;
                    bVar2 = bVar3;
                    e2 e2Var10 = bVar2.f47152f;
                    b.AbstractC0915b.c cVar9 = b.AbstractC0915b.c.f47165a;
                    this.f47171a = obj3;
                    this.f47172b = null;
                    this.f47174d = i15;
                    this.f47175e = 8;
                    break;
                }
                return aVar2;
            case 7:
                i15 = this.f47174d;
                bVar2 = this.f47172b;
                obj3 = this.f47171a;
                r.b(obj);
                e2 e2Var11 = bVar2.f47152f;
                b.AbstractC0915b.c cVar10 = b.AbstractC0915b.c.f47165a;
                this.f47171a = obj3;
                this.f47172b = null;
                this.f47174d = i15;
                this.f47175e = 8;
                break;
            case 8:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
