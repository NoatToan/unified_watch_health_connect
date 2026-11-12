package com.garmin.android.apps.connectmobile.startup;

import android.content.Context;
import androidx.lifecycle.y0;
import aq1.i0;
import aq1.w;
import c22.y;
import com.garmin.android.apps.connectmobile.k1;
import dq1.q;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p92.o;
import q92.v;
import q92.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupViewModel$startBlockingTasks$1", f = "StartupViewModel.kt", l = {63, 64, 65, 68, 71}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f44898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f44900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f44901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Context context, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f44900f = kVar;
        this.f44901g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f44900f, this.f44901g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r14 == r0) goto L47;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        Object objE0;
        int i14;
        boolean zR;
        Object objA;
        boolean z14;
        int i15;
        boolean zBooleanValue;
        v vVarN;
        Object objA2;
        boolean z15;
        int i16;
        v vVar;
        boolean zBooleanValue2;
        y0<k.c> y0Var;
        y0<k.c> y0Var2;
        y0<k.c> y0Var3;
        y0<k.c> y0Var4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = this.f44899e;
        int i18 = 1;
        k kVar = this.f44900f;
        if (i17 == 0) {
            r.b(obj);
            dq1.d.f60719j.getClass();
            dq1.d dVar = (dq1.d) dq1.d.f60720k.getValue();
            this.f44899e = 1;
            if (!dVar.f60722b.invoke().booleanValue() || (objB = dVar.b(this)) != aVar) {
                objB = Unit.INSTANCE;
            }
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i17 == 1) {
            r.b(obj);
        } else {
            if (i17 == 2) {
                r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    i18 = 0;
                }
                i iVar = kVar.f44879a;
                this.f44895a = i18;
                this.f44899e = 3;
                iVar.getClass();
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new i0(this.f44901g, null), this);
                if (objE0 != aVar) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != aVar) {
                    i14 = i18;
                    zR = k1.f37122a.r();
                    dq1.a aVar2 = (dq1.a) KoinJavaComponent.get$default(dq1.a.class, null, null, 6, null);
                    this.f44895a = i14;
                    this.f44896b = zR;
                    this.f44899e = 4;
                    objA = aVar2.a(this);
                    if (objA != aVar) {
                        int i19 = i14;
                        z14 = zR;
                        obj = objA;
                        i15 = i19;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        o oVar = o.f136619a;
                        x xVar = x.DI_CONNECT_UPLOAD;
                        oVar.getClass();
                        vVarN = o.n(xVar);
                        q qVar = (q) KoinJavaComponent.get$default(q.class, null, null, 6, null);
                        this.f44898d = vVarN;
                        this.f44895a = i15;
                        this.f44896b = z14;
                        this.f44897c = zBooleanValue;
                        this.f44899e = 5;
                        int i24 = q.f60783d;
                        objA2 = qVar.a(20000L, this);
                        if (objA2 != aVar) {
                            z15 = zBooleanValue;
                            obj = objA2;
                            i16 = i15;
                            vVar = vVarN;
                        }
                    }
                }
                return aVar;
            }
            if (i17 == 3) {
                i14 = this.f44895a;
                r.b(obj);
                zR = k1.f37122a.r();
                dq1.a aVar3 = (dq1.a) KoinJavaComponent.get$default(dq1.a.class, null, null, 6, null);
                this.f44895a = i14;
                this.f44896b = zR;
                this.f44899e = 4;
                objA = aVar3.a(this);
                if (objA != aVar) {
                    int i110 = i14;
                    z14 = zR;
                    obj = objA;
                    i15 = i110;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    o oVar2 = o.f136619a;
                    x xVar2 = x.DI_CONNECT_UPLOAD;
                    oVar2.getClass();
                    vVarN = o.n(xVar2);
                    q qVar2 = (q) KoinJavaComponent.get$default(q.class, null, null, 6, null);
                    this.f44898d = vVarN;
                    this.f44895a = i15;
                    this.f44896b = z14;
                    this.f44897c = zBooleanValue;
                    this.f44899e = 5;
                    int i25 = q.f60783d;
                    objA2 = qVar2.a(20000L, this);
                    if (objA2 != aVar) {
                        z15 = zBooleanValue;
                        obj = objA2;
                        i16 = i15;
                        vVar = vVarN;
                    }
                }
                return aVar;
            }
            if (i17 == 4) {
                z14 = this.f44896b;
                i15 = this.f44895a;
                r.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                o oVar3 = o.f136619a;
                x xVar3 = x.DI_CONNECT_UPLOAD;
                oVar3.getClass();
                vVarN = o.n(xVar3);
                q qVar3 = (q) KoinJavaComponent.get$default(q.class, null, null, 6, null);
                this.f44898d = vVarN;
                this.f44895a = i15;
                this.f44896b = z14;
                this.f44897c = zBooleanValue;
                this.f44899e = 5;
                int i26 = q.f60783d;
                objA2 = qVar3.a(20000L, this);
                if (objA2 != aVar) {
                    z15 = zBooleanValue;
                    obj = objA2;
                    i16 = i15;
                    vVar = vVarN;
                }
                return aVar;
            }
            if (i17 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z15 = this.f44897c;
            z14 = this.f44896b;
            i16 = this.f44895a;
            vVar = this.f44898d;
            r.b(obj);
        }
        zBooleanValue2 = ((Boolean) obj).booleanValue();
        if (!z14 && z15) {
            y0<k.c> y0Var5 = kVar.f44880b;
            if (y0Var5 == null) {
                s.m("startupLiveData");
                throw null;
            }
            y0Var5.m(new k.c(k.b.START_COLLECTING_DOB_FLOW, null, 2, null));
        } else if (i16 != 0) {
            y0Var4 = kVar.f44880b;
            if (y0Var4 == null) {
                s.m("startupLiveData");
                throw null;
            }
            y0Var4.m(new k.c(k.b.START_LOCATION_CONSENT_CHECKS, null, 2, null));
        } else if (y.a(vVar)) {
            y0Var3 = kVar.f44880b;
            if (y0Var3 == null) {
                s.m("startupLiveData");
                throw null;
            }
            y0Var3.m(new k.c(k.b.START_DELETE_DATA_CONSENT, vVar));
        } else if (zBooleanValue2) {
            y0Var2 = kVar.f44880b;
            if (y0Var2 == null) {
                s.m("startupLiveData");
                throw null;
            }
            y0Var2.m(new k.c(k.b.LOCKED_IN_LIVE_ACTIVITY_SESSION, null, 2, null));
        } else {
            y0Var = kVar.f44880b;
            if (y0Var == null) {
                s.m("startupLiveData");
                throw null;
            }
            y0Var.m(new k.c(k.b.REDIRECT, null, 2, null));
        }
        return Unit.INSTANCE;
        StartupChecksActivity.f44788d.getClass();
        if (StartupChecksActivity.a.a()) {
            i iVar2 = kVar.f44879a;
            this.f44895a = i18;
            this.f44899e = 3;
            iVar2.getClass();
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new i0(this.f44901g, null), this);
            if (objE0 != aVar) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 != aVar) {
                i14 = i18;
                zR = k1.f37122a.r();
                dq1.a aVar4 = (dq1.a) KoinJavaComponent.get$default(dq1.a.class, null, null, 6, null);
                this.f44895a = i14;
                this.f44896b = zR;
                this.f44899e = 4;
                objA = aVar4.a(this);
                if (objA != aVar) {
                    int i111 = i14;
                    z14 = zR;
                    obj = objA;
                    i15 = i111;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    o oVar4 = o.f136619a;
                    x xVar4 = x.DI_CONNECT_UPLOAD;
                    oVar4.getClass();
                    vVarN = o.n(xVar4);
                    q qVar4 = (q) KoinJavaComponent.get$default(q.class, null, null, 6, null);
                    this.f44898d = vVarN;
                    this.f44895a = i15;
                    this.f44896b = z14;
                    this.f44897c = zBooleanValue;
                    this.f44899e = 5;
                    int i27 = q.f60783d;
                    objA2 = qVar4.a(20000L, this);
                    if (objA2 != aVar) {
                        z15 = zBooleanValue;
                        obj = objA2;
                        i16 = i15;
                        vVar = vVarN;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!z14) {
                            if (i16 != 0) {
                                y0Var4 = kVar.f44880b;
                                if (y0Var4 == null) {
                                    s.m("startupLiveData");
                                    throw null;
                                }
                                y0Var4.m(new k.c(k.b.START_LOCATION_CONSENT_CHECKS, null, 2, null));
                            } else if (y.a(vVar)) {
                                y0Var3 = kVar.f44880b;
                                if (y0Var3 == null) {
                                    s.m("startupLiveData");
                                    throw null;
                                }
                                y0Var3.m(new k.c(k.b.START_DELETE_DATA_CONSENT, vVar));
                            } else if (zBooleanValue2) {
                                y0Var2 = kVar.f44880b;
                                if (y0Var2 == null) {
                                    s.m("startupLiveData");
                                    throw null;
                                }
                                y0Var2.m(new k.c(k.b.LOCKED_IN_LIVE_ACTIVITY_SESSION, null, 2, null));
                            } else {
                                y0Var = kVar.f44880b;
                                if (y0Var == null) {
                                    s.m("startupLiveData");
                                    throw null;
                                }
                                y0Var.m(new k.c(k.b.REDIRECT, null, 2, null));
                            }
                        } else if (i16 != 0) {
                            y0Var4 = kVar.f44880b;
                            if (y0Var4 == null) {
                                s.m("startupLiveData");
                                throw null;
                            }
                            y0Var4.m(new k.c(k.b.START_LOCATION_CONSENT_CHECKS, null, 2, null));
                        } else if (y.a(vVar)) {
                            y0Var3 = kVar.f44880b;
                            if (y0Var3 == null) {
                                s.m("startupLiveData");
                                throw null;
                            }
                            y0Var3.m(new k.c(k.b.START_DELETE_DATA_CONSENT, vVar));
                        } else if (zBooleanValue2) {
                            y0Var2 = kVar.f44880b;
                            if (y0Var2 == null) {
                                s.m("startupLiveData");
                                throw null;
                            }
                            y0Var2.m(new k.c(k.b.LOCKED_IN_LIVE_ACTIVITY_SESSION, null, 2, null));
                        } else {
                            y0Var = kVar.f44880b;
                            if (y0Var == null) {
                                s.m("startupLiveData");
                                throw null;
                            }
                            y0Var.m(new k.c(k.b.REDIRECT, null, 2, null));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        } else {
            w wVar = (w) KoinJavaComponent.get$default(w.class, null, null, 6, null);
            this.f44899e = 2;
            obj = wVar.a(this);
        }
        return aVar;
    }
}
