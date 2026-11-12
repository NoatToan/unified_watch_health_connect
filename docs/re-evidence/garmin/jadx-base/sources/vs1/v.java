package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.SendTrailToDeviceUseCase$sendTrailToDeviceWithTargetedDeviceId$1", f = "SendTrailToDeviceUseCase.kt", l = {70, 73, 74, 76, 83, 84, 86}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ts1.a f179911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f179912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f179913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f179915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f179916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f179917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, long j8, Context context, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f179915e = wVar;
        this.f179916f = j8;
        this.f179917g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f179915e, this.f179916f, this.f179917g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b7 A[PHI: r2 r6 r8
      0x00b7: PHI (r2v6 ts1.a) = (r2v5 ts1.a), (r2v8 ts1.a) binds: [B:17:0x00b3, B:11:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r6v3 long) = (r6v2 long), (r6v4 long) binds: [B:17:0x00b3, B:11:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v9 java.lang.Object) binds: [B:17:0x00b3, B:11:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x016d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0172  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c6 A[PHI: r3 r6
      0x01c6: PHI (r3v5 long) = (r3v1 long), (r3v6 long) binds: [B:42:0x01c3, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r6v11 vs1.w) = (r6v6 vs1.w), (r6v13 vs1.w) binds: [B:42:0x01c3, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0233, code lost:
    
        if (r4.emit(r6, r39) == r1) goto L50;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ts1.a aVar;
        long jD;
        Object objA;
        Iterator it;
        Object next;
        sd2.f fVar;
        String displayName;
        Object objC;
        String str;
        w wVar;
        long j8;
        z1<pt1.o> z1Var;
        pt1.o oVarA;
        z1<pt1.o> z1Var2;
        long j14;
        pt1.o oVarA2;
        long j15;
        h hVar;
        pt1.k kVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179914d;
        w wVar2 = this.f179915e;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                z1<pt1.o> z1Var3 = wVar2.f179919b;
                pt1.o oVarA3 = pt1.o.a(z1Var3.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644667);
                this.f179914d = 1;
                if (z1Var3.emit(oVarA3, this) != aVar2) {
                    aVar = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                    jD = aVar.d();
                    this.f179911a = aVar;
                    this.f179913c = jD;
                    this.f179914d = 2;
                    objA = aVar.a();
                    if (objA != aVar2) {
                        it = ((Iterable) objA).iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            fVar = (sd2.f) next;
                            if (fVar != null) {
                                displayName = fVar.getDisplayName();
                            } else {
                                displayName = null;
                            }
                            this.f179911a = null;
                            this.f179912b = displayName;
                            this.f179913c = jD;
                            this.f179914d = 3;
                            objC = aVar.c(this.f179916f, jD);
                            if (objC != aVar2) {
                                str = displayName;
                                if (((c83.a0) objC).f25745a.isSuccessful()) {
                                    long j16 = jD;
                                    wVar = wVar2;
                                    j8 = j16;
                                    z1Var = wVar.f179919b;
                                    oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j8;
                                    this.f179914d = 5;
                                    if (z1Var.emit(oVarA, this) != aVar2) {
                                        hVar = wVar.f179920c;
                                        kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                                        this.f179911a = null;
                                        this.f179912b = null;
                                        this.f179913c = j8;
                                        this.f179914d = 6;
                                        if (hVar.a(kVar, this) != aVar2) {
                                            j15 = j8;
                                            z1<pt1.o> z1Var4 = wVar.f179919b;
                                            pt1.o oVarA4 = pt1.o.a(z1Var4.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                            this.f179911a = null;
                                            this.f179912b = null;
                                            this.f179913c = j15;
                                            this.f179914d = 7;
                                        }
                                    }
                                } else {
                                    z1Var2 = wVar2.f179919b;
                                    j14 = jD;
                                    oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j14;
                                    this.f179914d = 4;
                                    if (z1Var2.emit(oVarA2, this) != aVar2) {
                                        j15 = j14;
                                        wVar = wVar2;
                                        z1<pt1.o> z1Var5 = wVar.f179919b;
                                        pt1.o oVarA5 = pt1.o.a(z1Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                        this.f179911a = null;
                                        this.f179912b = null;
                                        this.f179913c = j15;
                                        this.f179914d = 7;
                                    }
                                }
                            }
                            break;
                        } while (((sd2.f) next).getUnitID() != jD);
                        fVar = (sd2.f) next;
                        if (fVar != null) {
                            displayName = fVar.getDisplayName();
                        } else {
                            displayName = null;
                        }
                        this.f179911a = null;
                        this.f179912b = displayName;
                        this.f179913c = jD;
                        this.f179914d = 3;
                        objC = aVar.c(this.f179916f, jD);
                        if (objC != aVar2) {
                            str = displayName;
                            if (((c83.a0) objC).f25745a.isSuccessful()) {
                                long j17 = jD;
                                wVar = wVar2;
                                j8 = j17;
                                z1Var = wVar.f179919b;
                                oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j8;
                                this.f179914d = 5;
                                if (z1Var.emit(oVarA, this) != aVar2) {
                                    hVar = wVar.f179920c;
                                    kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j8;
                                    this.f179914d = 6;
                                    if (hVar.a(kVar, this) != aVar2) {
                                        j15 = j8;
                                        z1<pt1.o> z1Var6 = wVar.f179919b;
                                        pt1.o oVarA6 = pt1.o.a(z1Var6.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                        this.f179911a = null;
                                        this.f179912b = null;
                                        this.f179913c = j15;
                                        this.f179914d = 7;
                                    }
                                }
                            } else {
                                z1Var2 = wVar2.f179919b;
                                j14 = jD;
                                oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j14;
                                this.f179914d = 4;
                                if (z1Var2.emit(oVarA2, this) != aVar2) {
                                    j15 = j14;
                                    wVar = wVar2;
                                    z1<pt1.o> z1Var7 = wVar.f179919b;
                                    pt1.o oVarA7 = pt1.o.a(z1Var7.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j15;
                                    this.f179914d = 7;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 1:
                o13.r.b(obj);
                aVar = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
                jD = aVar.d();
                this.f179911a = aVar;
                this.f179913c = jD;
                this.f179914d = 2;
                objA = aVar.a();
                if (objA != aVar2) {
                    it = ((Iterable) objA).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        fVar = (sd2.f) next;
                        if (fVar != null) {
                            displayName = fVar.getDisplayName();
                        } else {
                            displayName = null;
                        }
                        this.f179911a = null;
                        this.f179912b = displayName;
                        this.f179913c = jD;
                        this.f179914d = 3;
                        objC = aVar.c(this.f179916f, jD);
                        if (objC != aVar2) {
                            str = displayName;
                            if (((c83.a0) objC).f25745a.isSuccessful()) {
                                long j18 = jD;
                                wVar = wVar2;
                                j8 = j18;
                                z1Var = wVar.f179919b;
                                oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j8;
                                this.f179914d = 5;
                                if (z1Var.emit(oVarA, this) != aVar2) {
                                    hVar = wVar.f179920c;
                                    kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j8;
                                    this.f179914d = 6;
                                    if (hVar.a(kVar, this) != aVar2) {
                                        j15 = j8;
                                        z1<pt1.o> z1Var8 = wVar.f179919b;
                                        pt1.o oVarA8 = pt1.o.a(z1Var8.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                        this.f179911a = null;
                                        this.f179912b = null;
                                        this.f179913c = j15;
                                        this.f179914d = 7;
                                    }
                                }
                            } else {
                                z1Var2 = wVar2.f179919b;
                                j14 = jD;
                                oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j14;
                                this.f179914d = 4;
                                if (z1Var2.emit(oVarA2, this) != aVar2) {
                                    j15 = j14;
                                    wVar = wVar2;
                                    z1<pt1.o> z1Var9 = wVar.f179919b;
                                    pt1.o oVarA9 = pt1.o.a(z1Var9.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j15;
                                    this.f179914d = 7;
                                }
                            }
                        }
                        break;
                    } while (((sd2.f) next).getUnitID() != jD);
                    fVar = (sd2.f) next;
                    if (fVar != null) {
                        displayName = fVar.getDisplayName();
                    } else {
                        displayName = null;
                    }
                    this.f179911a = null;
                    this.f179912b = displayName;
                    this.f179913c = jD;
                    this.f179914d = 3;
                    objC = aVar.c(this.f179916f, jD);
                    if (objC != aVar2) {
                        str = displayName;
                        if (((c83.a0) objC).f25745a.isSuccessful()) {
                            long j19 = jD;
                            wVar = wVar2;
                            j8 = j19;
                            z1Var = wVar.f179919b;
                            oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j8;
                            this.f179914d = 5;
                            if (z1Var.emit(oVarA, this) != aVar2) {
                                hVar = wVar.f179920c;
                                kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j8;
                                this.f179914d = 6;
                                if (hVar.a(kVar, this) != aVar2) {
                                    j15 = j8;
                                    z1<pt1.o> z1Var10 = wVar.f179919b;
                                    pt1.o oVarA10 = pt1.o.a(z1Var10.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j15;
                                    this.f179914d = 7;
                                }
                            }
                        } else {
                            z1Var2 = wVar2.f179919b;
                            j14 = jD;
                            oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j14;
                            this.f179914d = 4;
                            if (z1Var2.emit(oVarA2, this) != aVar2) {
                                j15 = j14;
                                wVar = wVar2;
                                z1<pt1.o> z1Var11 = wVar.f179919b;
                                pt1.o oVarA11 = pt1.o.a(z1Var11.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j15;
                                this.f179914d = 7;
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 2:
                jD = this.f179913c;
                aVar = this.f179911a;
                o13.r.b(obj);
                objA = obj;
                it = ((Iterable) objA).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    fVar = (sd2.f) next;
                    if (fVar != null) {
                        displayName = fVar.getDisplayName();
                    } else {
                        displayName = null;
                    }
                    this.f179911a = null;
                    this.f179912b = displayName;
                    this.f179913c = jD;
                    this.f179914d = 3;
                    objC = aVar.c(this.f179916f, jD);
                    if (objC != aVar2) {
                        str = displayName;
                        if (((c83.a0) objC).f25745a.isSuccessful()) {
                            long j110 = jD;
                            wVar = wVar2;
                            j8 = j110;
                            z1Var = wVar.f179919b;
                            oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j8;
                            this.f179914d = 5;
                            if (z1Var.emit(oVarA, this) != aVar2) {
                                hVar = wVar.f179920c;
                                kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j8;
                                this.f179914d = 6;
                                if (hVar.a(kVar, this) != aVar2) {
                                    j15 = j8;
                                    z1<pt1.o> z1Var12 = wVar.f179919b;
                                    pt1.o oVarA12 = pt1.o.a(z1Var12.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                    this.f179911a = null;
                                    this.f179912b = null;
                                    this.f179913c = j15;
                                    this.f179914d = 7;
                                }
                            }
                        } else {
                            z1Var2 = wVar2.f179919b;
                            j14 = jD;
                            oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j14;
                            this.f179914d = 4;
                            if (z1Var2.emit(oVarA2, this) != aVar2) {
                                j15 = j14;
                                wVar = wVar2;
                                z1<pt1.o> z1Var13 = wVar.f179919b;
                                pt1.o oVarA13 = pt1.o.a(z1Var13.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j15;
                                this.f179914d = 7;
                            }
                        }
                        break;
                    }
                    return aVar2;
                } while (((sd2.f) next).getUnitID() != jD);
                fVar = (sd2.f) next;
                if (fVar != null) {
                    displayName = fVar.getDisplayName();
                } else {
                    displayName = null;
                }
                this.f179911a = null;
                this.f179912b = displayName;
                this.f179913c = jD;
                this.f179914d = 3;
                objC = aVar.c(this.f179916f, jD);
                if (objC != aVar2) {
                    str = displayName;
                    if (((c83.a0) objC).f25745a.isSuccessful()) {
                        long j111 = jD;
                        wVar = wVar2;
                        j8 = j111;
                        z1Var = wVar.f179919b;
                        oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                        this.f179911a = null;
                        this.f179912b = null;
                        this.f179913c = j8;
                        this.f179914d = 5;
                        if (z1Var.emit(oVarA, this) != aVar2) {
                            hVar = wVar.f179920c;
                            kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j8;
                            this.f179914d = 6;
                            if (hVar.a(kVar, this) != aVar2) {
                                j15 = j8;
                                z1<pt1.o> z1Var14 = wVar.f179919b;
                                pt1.o oVarA14 = pt1.o.a(z1Var14.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179911a = null;
                                this.f179912b = null;
                                this.f179913c = j15;
                                this.f179914d = 7;
                            }
                        }
                    } else {
                        z1Var2 = wVar2.f179919b;
                        j14 = jD;
                        oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                        this.f179911a = null;
                        this.f179912b = null;
                        this.f179913c = j14;
                        this.f179914d = 4;
                        if (z1Var2.emit(oVarA2, this) != aVar2) {
                            j15 = j14;
                            wVar = wVar2;
                            z1<pt1.o> z1Var15 = wVar.f179919b;
                            pt1.o oVarA15 = pt1.o.a(z1Var15.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j15;
                            this.f179914d = 7;
                        }
                    }
                    break;
                }
                return aVar2;
            case 3:
                jD = this.f179913c;
                String str2 = this.f179912b;
                o13.r.b(obj);
                str = str2;
                objC = obj;
                if (((c83.a0) objC).f25745a.isSuccessful()) {
                    z1Var2 = wVar2.f179919b;
                    j14 = jD;
                    oVarA2 = pt1.o.a(z1Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, i.SUCCESS, str, null, false, false, false, false, false, 1067450367);
                    this.f179911a = null;
                    this.f179912b = null;
                    this.f179913c = j14;
                    this.f179914d = 4;
                    if (z1Var2.emit(oVarA2, this) != aVar2) {
                        j15 = j14;
                        wVar = wVar2;
                        z1<pt1.o> z1Var16 = wVar.f179919b;
                        pt1.o oVarA16 = pt1.o.a(z1Var16.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179911a = null;
                        this.f179912b = null;
                        this.f179913c = j15;
                        this.f179914d = 7;
                    }
                    break;
                } else {
                    long j112 = jD;
                    wVar = wVar2;
                    j8 = j112;
                    z1Var = wVar.f179919b;
                    oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1071644671);
                    this.f179911a = null;
                    this.f179912b = null;
                    this.f179913c = j8;
                    this.f179914d = 5;
                    if (z1Var.emit(oVarA, this) != aVar2) {
                        hVar = wVar.f179920c;
                        kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179911a = null;
                        this.f179912b = null;
                        this.f179913c = j8;
                        this.f179914d = 6;
                        if (hVar.a(kVar, this) != aVar2) {
                            j15 = j8;
                            z1<pt1.o> z1Var17 = wVar.f179919b;
                            pt1.o oVarA17 = pt1.o.a(z1Var17.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179911a = null;
                            this.f179912b = null;
                            this.f179913c = j15;
                            this.f179914d = 7;
                        }
                    }
                    break;
                }
                return aVar2;
            case 4:
                j15 = this.f179913c;
                o13.r.b(obj);
                wVar = wVar2;
                z1<pt1.o> z1Var18 = wVar.f179919b;
                pt1.o oVarA18 = pt1.o.a(z1Var18.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179911a = null;
                this.f179912b = null;
                this.f179913c = j15;
                this.f179914d = 7;
                break;
            case 5:
                long j24 = this.f179913c;
                o13.r.b(obj);
                wVar = wVar2;
                j8 = j24;
                hVar = wVar.f179920c;
                kVar = new pt1.k(this.f179917g.getString(R.string.txt_error_occurred), null, null, 6, null);
                this.f179911a = null;
                this.f179912b = null;
                this.f179913c = j8;
                this.f179914d = 6;
                if (hVar.a(kVar, this) != aVar2) {
                    j15 = j8;
                    z1<pt1.o> z1Var19 = wVar.f179919b;
                    pt1.o oVarA19 = pt1.o.a(z1Var19.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179911a = null;
                    this.f179912b = null;
                    this.f179913c = j15;
                    this.f179914d = 7;
                    break;
                }
                return aVar2;
            case 6:
                j15 = this.f179913c;
                o13.r.b(obj);
                wVar = wVar2;
                z1<pt1.o> z1Var110 = wVar.f179919b;
                pt1.o oVarA110 = pt1.o.a(z1Var110.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179911a = null;
                this.f179912b = null;
                this.f179913c = j15;
                this.f179914d = 7;
                break;
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
