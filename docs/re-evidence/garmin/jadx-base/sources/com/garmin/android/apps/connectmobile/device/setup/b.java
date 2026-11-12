package com.garmin.android.apps.connectmobile.device.setup;

import ca0.o1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import j70.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l90.j;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q90.c;
import r53.e2;
import rd2.f;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import x80.g;
import x80.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.DeviceSetupViewModel$endFlow$1", f = "DeviceSetupViewModel.kt", l = {278, 283, 300, 318}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x80.e f33768c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33769a;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.ADD_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33769a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x80.e eVar, d<? super b> dVar) {
        super(2, dVar);
        this.f33768c = eVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f33768c, dVar);
        bVar.f33767b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L83;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        c cVarZ4;
        l90.b bVar;
        j jVar;
        com.garmin.android.apps.connectmobile.device.setup.a bVar2;
        c cVarZ5;
        long j8;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33766a;
        x80.e eVar = this.f33768c;
        if (i14 != 0) {
            if (i14 == 1 || i14 == 2) {
                r.b(obj);
            } else if (i14 == 3) {
                r.b(obj);
                cVarZ4 = eVar.z4();
                if (cVarZ4 != null) {
                    bVar = cVarZ4.f143495c;
                } else {
                    bVar = null;
                }
                if (eVar.f189502d.g()) {
                    bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE;
                } else {
                    if (bVar != null) {
                        jVar = bVar.f111528m;
                    } else {
                        jVar = null;
                    }
                    if (jVar == j.EXPLORE) {
                        cVarZ5 = eVar.z4();
                        if (cVarZ5 != null) {
                            j8 = cVarZ5.f143493a;
                        } else {
                            j8 = 0;
                        }
                        bVar2 = new com.garmin.android.apps.connectmobile.device.setup.a.b(j8, bVar.f111521f);
                    } else {
                        bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE;
                    }
                }
                e2 e2Var = eVar.f189515q;
                this.f33767b = null;
                this.f33766a = 4;
            } else {
                if (i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        c cVarZ6 = eVar.z4();
        if (cVarZ6 != null) {
            hk0.a.f().n(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, cVarZ6.f143494b);
        }
        int i15 = a.f33769a[eVar.f189500b.ordinal()];
        if (i15 == 1) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSetupViewModel", "End of CREATE_ACCOUNT flow");
            eVar.f189507i.getClass();
            f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            if (arrayListD != null && !arrayListD.isEmpty()) {
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    if (((sd2.f) it.next()).isPaired()) {
                        s0 s0Var = (s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null);
                        a0.f97472p.getClass();
                        List<a0> list = a0.f97474r;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            a0 a0Var = (a0) obj3;
                            if (a0Var != null ? a0Var.f97481g : false) {
                                arrayList.add(obj3);
                            }
                        }
                        a0[] a0VarArr = (a0[]) arrayList.toArray(new a0[0]);
                        s0Var.i((a0[]) Arrays.copyOf(a0VarArr, a0VarArr.length));
                        break;
                    }
                }
            }
            this.f33767b = null;
            this.f33766a = 1;
            x53.c cVar = o53.s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new k(eVar, null), this);
            if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 != obj2) {
            }
        } else if (i15 == 2) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceSetupViewModel", "End of SIGN_IN flow");
            this.f33767b = null;
            this.f33766a = 2;
            x53.c cVar2 = o53.s0.f129406a;
            Object objE1 = ge1.b.e0(x53.b.f189152a, new k(eVar, null), this);
            if (objE1 != obj2) {
                objE1 = Unit.INSTANCE;
            }
            if (objE1 != obj2) {
            }
        } else {
            if (i15 != 3) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DeviceSetupViewModel", "End of ADD_DEVICE flow");
        }
        return obj2;
        dv.a.a().f61318a = false;
        mv.a.f121121a.getClass();
        mv.a.a();
        eVar.f189503e.j();
        c cVarZ7 = eVar.z4();
        if (cVarZ7 != null) {
            eVar.f189502d.p(cVarZ7.f143493a, cVarZ7.f143494b);
            this.f33767b = null;
            this.f33766a = 3;
            x53.c cVar3 = o53.s0.f129406a;
            Object objE2 = ge1.b.e0(x53.b.f189152a, new g(eVar, null), this);
            if (objE2 != u13.a.COROUTINE_SUSPENDED) {
                objE2 = Unit.INSTANCE;
            }
            if (objE2 != obj2) {
                cVarZ4 = eVar.z4();
                if (cVarZ4 != null) {
                    bVar = cVarZ4.f143495c;
                } else {
                    bVar = null;
                }
                if (eVar.f189502d.g()) {
                    bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE;
                } else {
                    if (bVar != null) {
                        jVar = bVar.f111528m;
                    } else {
                        jVar = null;
                    }
                    if (jVar == j.EXPLORE) {
                        cVarZ5 = eVar.z4();
                        if (cVarZ5 != null) {
                            j8 = cVarZ5.f143493a;
                        } else {
                            j8 = 0;
                        }
                        bVar2 = new com.garmin.android.apps.connectmobile.device.setup.a.b(j8, bVar.f111521f);
                    } else {
                        bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE;
                    }
                }
                e2 e2Var2 = eVar.f189515q;
                this.f33767b = null;
                this.f33766a = 4;
            }
        } else {
            cVarZ4 = eVar.z4();
            if (cVarZ4 != null) {
                bVar = cVarZ4.f143495c;
            } else {
                bVar = null;
            }
            if (eVar.f189502d.g()) {
                bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE;
            } else {
                if (bVar != null) {
                    jVar = bVar.f111528m;
                } else {
                    jVar = null;
                }
                if (jVar == j.EXPLORE) {
                    cVarZ5 = eVar.z4();
                    if (cVarZ5 != null) {
                        j8 = cVarZ5.f143493a;
                    } else {
                        j8 = 0;
                    }
                    bVar2 = new com.garmin.android.apps.connectmobile.device.setup.a.b(j8, bVar.f111521f);
                } else {
                    bVar2 = com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE;
                }
            }
            e2 e2Var3 = eVar.f189515q;
            this.f33767b = null;
            this.f33766a = 4;
        }
        return obj2;
    }
}
