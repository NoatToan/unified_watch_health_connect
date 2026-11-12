package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.SendTrailToDeviceUseCase$initSendTrailToDevice$1", f = "SendTrailToDeviceUseCase.kt", l = {23, 26, 29, 36, 38, 45, 46, 50, 57, 64}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ts1.a f179903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f179904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f179905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f179907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f179908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f179909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f179910h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j8, w wVar, long j14, Context context, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f179907e = j8;
        this.f179908f = wVar;
        this.f179909g = j14;
        this.f179910h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f179907e, this.f179908f, this.f179909g, this.f179910h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011d A[PHI: r2 r8 r9
      0x011d: PHI (r2v15 boolean) = (r2v14 boolean), (r2v16 boolean) binds: [B:30:0x0119, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r8v16 ts1.a) = (r8v15 ts1.a), (r8v23 ts1.a) binds: [B:30:0x0119, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r9v9 java.lang.Object) = (r9v8 java.lang.Object), (r9v14 java.lang.Object) binds: [B:30:0x0119, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:37:0x0173  */
    /* JADX WARN: Code duplicated, block: B:38:0x0175  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0247 A[PHI: r2
      0x0247: PHI (r2v23 boolean) = (r2v18 boolean), (r2v24 boolean) binds: [B:49:0x0243, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x026e  */
    /* JADX WARN: Code duplicated, block: B:58:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x030b A[PHI: r2
      0x030b: PHI (r2v20 boolean) = (r2v15 boolean), (r2v15 boolean), (r2v15 boolean), (r2v17 boolean), (r2v18 boolean), (r2v23 boolean) binds: [B:59:0x0308, B:56:0x02b9, B:35:0x016f, B:10:0x002e, B:46:0x01f6, B:52:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0356, code lost:
    
        if (r3.emit(r4, r38) == r1) goto L63;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        ts1.a aVar;
        boolean z14;
        Object objA;
        List list;
        z1<pt1.o> z1Var;
        pt1.o oVarA;
        z1<pt1.o> z1Var2;
        pt1.o oVarA2;
        Object objC;
        z1<pt1.o> z1Var3;
        pt1.o oVarA3;
        z1<pt1.o> z1Var4;
        pt1.o oVarA4;
        z1<pt1.o> z1Var5;
        pt1.o oVarA5;
        h hVar;
        pt1.k kVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179906d;
        w wVar = this.f179908f;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                ns1.a aVar3 = ns1.a.f127814a;
                c80.p pVar = wVar.f179919b.getValue().f140926x;
                aVar3.getClass();
                ArrayList arrayListM = p13.x.m(new zk.e("curatedCourseId", Long.valueOf(this.f179907e)));
                if (pVar != null) {
                    if (pVar instanceof c80.p.c) {
                        str = "ineligible";
                    } else if (pVar instanceof c80.p.b) {
                        str = "eligible";
                    } else {
                        if (!(pVar instanceof c80.p.a)) {
                            u0.r();
                            return null;
                        }
                        str = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
                    }
                    arrayListM.add(new zk.e("trailsFeatureStatus", str));
                }
                zk.c.f205034a.a(p13.x.k("GCS", "FIREBASE")).a(new zk.a("TRAILS_SEND_TO_DEVICE", arrayListM, false, 0L, 12, null));
                z1<pt1.o> z1Var6 = wVar.f179919b;
                pt1.o oVarA6 = pt1.o.a(z1Var6.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644667);
                this.f179906d = 1;
                if (z1Var6.emit(oVarA6, this) != aVar2) {
                    aVar = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                    z14 = wVar.f179919b.getValue().f140927y;
                    this.f179903a = aVar;
                    this.f179905c = z14;
                    this.f179906d = 2;
                    objA = aVar.a();
                    if (objA != aVar2) {
                        list = (List) objA;
                        if (list.isEmpty()) {
                            z1Var3 = wVar.f179919b;
                            oVarA3 = pt1.o.a(z1Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 3;
                            if (z1Var3.emit(oVarA3, this) != aVar2) {
                                z1<pt1.o> z1Var7 = wVar.f179919b;
                                pt1.o oVarA7 = pt1.o.a(z1Var7.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        } else if (!z14 && list.size() == 1) {
                            long unitID = ((sd2.f) list.get(0)).getUnitID();
                            this.f179903a = null;
                            this.f179904b = list;
                            this.f179905c = z14;
                            this.f179906d = 4;
                            objC = aVar.c(this.f179909g, unitID);
                            if (objC != aVar2) {
                                if (!((c83.a0) objC).f25745a.isSuccessful()) {
                                    z1Var4 = wVar.f179919b;
                                    oVarA4 = pt1.o.a(z1Var4.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                                    this.f179903a = null;
                                    this.f179904b = null;
                                    this.f179905c = z14;
                                    this.f179906d = 6;
                                    if (z1Var4.emit(oVarA4, this) != aVar2) {
                                        hVar = wVar.f179920c;
                                        kVar = new pt1.k(this.f179910h.getString(R.string.txt_error_occurred), null, null, 6, null);
                                        this.f179903a = null;
                                        this.f179904b = null;
                                        this.f179905c = z14;
                                        this.f179906d = 7;
                                        if (hVar.a(kVar, this) != aVar2) {
                                            z1<pt1.o> z1Var8 = wVar.f179919b;
                                            pt1.o oVarA8 = pt1.o.a(z1Var8.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                            this.f179903a = null;
                                            this.f179904b = null;
                                            this.f179905c = z14;
                                            this.f179906d = 10;
                                        }
                                    }
                                } else {
                                    z1Var5 = wVar.f179919b;
                                    oVarA5 = pt1.o.a(z1Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, ((sd2.f) list.get(0)).getDisplayName(), null, false, false, false, false, false, 1067450367);
                                    this.f179903a = null;
                                    this.f179904b = null;
                                    this.f179905c = z14;
                                    this.f179906d = 5;
                                    if (z1Var5.emit(oVarA5, this) != aVar2) {
                                        z1<pt1.o> z1Var9 = wVar.f179919b;
                                        pt1.o oVarA9 = pt1.o.a(z1Var9.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                        this.f179903a = null;
                                        this.f179904b = null;
                                        this.f179905c = z14;
                                        this.f179906d = 10;
                                    }
                                }
                            }
                        } else if (!z14) {
                            z1Var = wVar.f179919b;
                            oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 9;
                            if (z1Var.emit(oVarA, this) != aVar2) {
                                z1<pt1.o> z1Var10 = wVar.f179919b;
                                pt1.o oVarA10 = pt1.o.a(z1Var10.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        } else {
                            z1Var2 = wVar.f179919b;
                            oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.GO_TO_DEVICE_LIST, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 8;
                            if (z1Var2.emit(oVarA2, this) != aVar2) {
                                z1<pt1.o> z1Var11 = wVar.f179919b;
                                pt1.o oVarA11 = pt1.o.a(z1Var11.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 1:
                o13.r.b(obj);
                aVar = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                z14 = wVar.f179919b.getValue().f140927y;
                this.f179903a = aVar;
                this.f179905c = z14;
                this.f179906d = 2;
                objA = aVar.a();
                if (objA != aVar2) {
                    list = (List) objA;
                    if (list.isEmpty()) {
                        z1Var3 = wVar.f179919b;
                        oVarA3 = pt1.o.a(z1Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 3;
                        if (z1Var3.emit(oVarA3, this) != aVar2) {
                            z1<pt1.o> z1Var12 = wVar.f179919b;
                            pt1.o oVarA12 = pt1.o.a(z1Var12.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    } else if (!z14) {
                        if (!z14) {
                            z1Var = wVar.f179919b;
                            oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 9;
                            if (z1Var.emit(oVarA, this) != aVar2) {
                                z1<pt1.o> z1Var13 = wVar.f179919b;
                                pt1.o oVarA13 = pt1.o.a(z1Var13.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        } else {
                            z1Var2 = wVar.f179919b;
                            oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.GO_TO_DEVICE_LIST, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 8;
                            if (z1Var2.emit(oVarA2, this) != aVar2) {
                                z1<pt1.o> z1Var14 = wVar.f179919b;
                                pt1.o oVarA14 = pt1.o.a(z1Var14.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        }
                    } else if (!z14) {
                        z1Var = wVar.f179919b;
                        oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 9;
                        if (z1Var.emit(oVarA, this) != aVar2) {
                            z1<pt1.o> z1Var15 = wVar.f179919b;
                            pt1.o oVarA15 = pt1.o.a(z1Var15.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    } else {
                        z1Var2 = wVar.f179919b;
                        oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.GO_TO_DEVICE_LIST, null, null, false, false, false, false, false, 1071644671);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 8;
                        if (z1Var2.emit(oVarA2, this) != aVar2) {
                            z1<pt1.o> z1Var16 = wVar.f179919b;
                            pt1.o oVarA16 = pt1.o.a(z1Var16.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    }
                    break;
                }
                return aVar2;
            case 2:
                z14 = this.f179905c;
                aVar = this.f179903a;
                o13.r.b(obj);
                objA = obj;
                list = (List) objA;
                if (list.isEmpty()) {
                    z1Var3 = wVar.f179919b;
                    oVarA3 = pt1.o.a(z1Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_COMPATIBLE_DEVICES, null, null, false, false, false, false, false, 1071644671);
                    this.f179903a = null;
                    this.f179904b = null;
                    this.f179905c = z14;
                    this.f179906d = 3;
                    if (z1Var3.emit(oVarA3, this) != aVar2) {
                        z1<pt1.o> z1Var17 = wVar.f179919b;
                        pt1.o oVarA17 = pt1.o.a(z1Var17.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 10;
                    }
                    break;
                } else {
                    if (!z14) {
                        if (!z14) {
                            z1Var = wVar.f179919b;
                            oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 9;
                            if (z1Var.emit(oVarA, this) != aVar2) {
                                z1<pt1.o> z1Var18 = wVar.f179919b;
                                pt1.o oVarA18 = pt1.o.a(z1Var18.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        } else {
                            z1Var2 = wVar.f179919b;
                            oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.GO_TO_DEVICE_LIST, null, null, false, false, false, false, false, 1071644671);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 8;
                            if (z1Var2.emit(oVarA2, this) != aVar2) {
                                z1<pt1.o> z1Var19 = wVar.f179919b;
                                pt1.o oVarA19 = pt1.o.a(z1Var19.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179903a = null;
                                this.f179904b = null;
                                this.f179905c = z14;
                                this.f179906d = 10;
                            }
                        }
                    } else if (!z14) {
                        z1Var = wVar.f179919b;
                        oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.NO_SUBSCRIPTION, null, null, false, false, false, false, false, 1071644671);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 9;
                        if (z1Var.emit(oVarA, this) != aVar2) {
                            z1<pt1.o> z1Var110 = wVar.f179919b;
                            pt1.o oVarA110 = pt1.o.a(z1Var110.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    } else {
                        z1Var2 = wVar.f179919b;
                        oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.GO_TO_DEVICE_LIST, null, null, false, false, false, false, false, 1071644671);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 8;
                        if (z1Var2.emit(oVarA2, this) != aVar2) {
                            z1<pt1.o> z1Var111 = wVar.f179919b;
                            pt1.o oVarA111 = pt1.o.a(z1Var111.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    }
                    break;
                }
                return aVar2;
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                z14 = this.f179905c;
                o13.r.b(obj);
                z1<pt1.o> z1Var112 = wVar.f179919b;
                pt1.o oVarA112 = pt1.o.a(z1Var112.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179903a = null;
                this.f179904b = null;
                this.f179905c = z14;
                this.f179906d = 10;
                break;
            case 4:
                z14 = this.f179905c;
                List list2 = this.f179904b;
                o13.r.b(obj);
                list = list2;
                objC = obj;
                if (!((c83.a0) objC).f25745a.isSuccessful()) {
                    z1Var5 = wVar.f179919b;
                    oVarA5 = pt1.o.a(z1Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, ((sd2.f) list.get(0)).getDisplayName(), null, false, false, false, false, false, 1067450367);
                    this.f179903a = null;
                    this.f179904b = null;
                    this.f179905c = z14;
                    this.f179906d = 5;
                    if (z1Var5.emit(oVarA5, this) != aVar2) {
                        z1<pt1.o> z1Var113 = wVar.f179919b;
                        pt1.o oVarA113 = pt1.o.a(z1Var113.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 10;
                    }
                    break;
                } else {
                    z1Var4 = wVar.f179919b;
                    oVarA4 = pt1.o.a(z1Var4.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                    this.f179903a = null;
                    this.f179904b = null;
                    this.f179905c = z14;
                    this.f179906d = 6;
                    if (z1Var4.emit(oVarA4, this) != aVar2) {
                        hVar = wVar.f179920c;
                        kVar = new pt1.k(this.f179910h.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179903a = null;
                        this.f179904b = null;
                        this.f179905c = z14;
                        this.f179906d = 7;
                        if (hVar.a(kVar, this) != aVar2) {
                            z1<pt1.o> z1Var114 = wVar.f179919b;
                            pt1.o oVarA114 = pt1.o.a(z1Var114.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179903a = null;
                            this.f179904b = null;
                            this.f179905c = z14;
                            this.f179906d = 10;
                        }
                    }
                    break;
                }
                return aVar2;
            case 6:
                z14 = this.f179905c;
                o13.r.b(obj);
                hVar = wVar.f179920c;
                kVar = new pt1.k(this.f179910h.getString(R.string.txt_error_occurred), null, null, 6, null);
                this.f179903a = null;
                this.f179904b = null;
                this.f179905c = z14;
                this.f179906d = 7;
                if (hVar.a(kVar, this) != aVar2) {
                    z1<pt1.o> z1Var115 = wVar.f179919b;
                    pt1.o oVarA115 = pt1.o.a(z1Var115.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179903a = null;
                    this.f179904b = null;
                    this.f179905c = z14;
                    this.f179906d = 10;
                    break;
                }
                return aVar2;
            case 10:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
