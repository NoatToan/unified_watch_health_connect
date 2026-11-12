package pc0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lhv/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getAllDevices$2", f = "DevicesRepo.kt", l = {472, 479, 484, 485}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends hv.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f137244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f137245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f137247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f137248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f137249f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getAllDevices$2$result$1", f = "DevicesRepo.kt", l = {479}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f137251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f137251b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f137251b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<String>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137250a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<String>> i0VarN = this.f137251b.f137224a.n();
            this.f137250a = 1;
            Object objAwait = i0VarN.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z14, j jVar, String str, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f137247d = z14;
        this.f137248e = jVar;
        this.f137249f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f137247d, this.f137248e, this.f137249f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends hv.h>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        ArrayList arrayListB;
        ArrayList arrayList;
        v2 v2Var;
        String str;
        ArrayList arrayListB2;
        qd2.a aVarB;
        ic0.b bVar;
        v2 v2Var2;
        ArrayList arrayList2;
        zb0.x.a aVar;
        ArrayList arrayList3;
        v2 v2Var3;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137246c;
        String str2 = this.f137249f;
        j jVar = this.f137248e;
        if (i14 == 0) {
            o13.r.b(obj);
            qd2.a aVarB2 = qd2.a.b();
            String strC = aVarB2 != null ? aVarB2.c(qd2.a.b.ALL_DEVICES) : null;
            if (strC == null || !this.f137247d || (arrayListB = j.b(jVar, strC)) == null) {
                a aVar3 = new a(jVar, null);
                this.f137246c = 2;
                jVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(jVar, aVar3, this);
                if (objJ != aVar2) {
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        if (v2Var instanceof v2.a) {
                            return v2Var;
                        }
                        u0.r();
                        return null;
                    }
                    str = (String) ((v2.b) v2Var).f47386a;
                    arrayListB2 = j.b(jVar, str);
                    if (arrayListB2 != null) {
                        return new v2.a(new Exception("Error parsing all device list response"), null, null, 6, null);
                    }
                    aVarB = qd2.a.b();
                    if (aVarB != null) {
                        aVarB.g(qd2.a.b.ALL_DEVICES, str);
                    }
                    bVar = jVar.f137225b;
                    this.f137244a = v2Var;
                    this.f137245b = arrayListB2;
                    this.f137246c = 3;
                    if (bVar.b(this) != aVar2) {
                        v2Var2 = v2Var;
                        arrayList2 = arrayListB2;
                        aVar = zb0.x.f203870a;
                        this.f137244a = v2Var2;
                        this.f137245b = arrayList2;
                        this.f137246c = 4;
                        if (aVar.a(arrayList2, this) != aVar2) {
                            arrayList3 = arrayList2;
                            v2Var3 = v2Var2;
                            j.c(jVar, arrayList3, str2);
                            return new v2.b(new hv.h(arrayList3, this.f137249f, false, false, 12, null), ((v2.b) v2Var3).f47387b, null, null, 12, null);
                        }
                    }
                }
            } else {
                zb0.x.a aVar4 = zb0.x.f203870a;
                this.f137244a = arrayListB;
                this.f137246c = 1;
                if (aVar4.a(arrayListB, this) != aVar2) {
                    arrayList = arrayListB;
                    j.c(jVar, arrayList, str2);
                    return new v2.b(new hv.h(arrayList, this.f137249f, false, false, 12, null), 200, null, null, 12, null);
                }
            }
            return aVar2;
        }
        if (i14 == 1) {
            ArrayList arrayList4 = (ArrayList) this.f137244a;
            o13.r.b(obj);
            arrayList = arrayList4;
            j.c(jVar, arrayList, str2);
            return new v2.b(new hv.h(arrayList, this.f137249f, false, false, 12, null), 200, null, null, 12, null);
        }
        if (i14 == 2) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                u0.r();
                return null;
            }
            str = (String) ((v2.b) v2Var).f47386a;
            arrayListB2 = j.b(jVar, str);
            if (arrayListB2 != null) {
                return new v2.a(new Exception("Error parsing all device list response"), null, null, 6, null);
            }
            aVarB = qd2.a.b();
            if (aVarB != null) {
                aVarB.g(qd2.a.b.ALL_DEVICES, str);
            }
            bVar = jVar.f137225b;
            this.f137244a = v2Var;
            this.f137245b = arrayListB2;
            this.f137246c = 3;
            if (bVar.b(this) != aVar2) {
                v2Var2 = v2Var;
                arrayList2 = arrayListB2;
                aVar = zb0.x.f203870a;
                this.f137244a = v2Var2;
                this.f137245b = arrayList2;
                this.f137246c = 4;
                if (aVar.a(arrayList2, this) != aVar2) {
                    arrayList3 = arrayList2;
                    v2Var3 = v2Var2;
                }
            }
            return aVar2;
        }
        if (i14 == 3) {
            arrayList2 = this.f137245b;
            v2Var2 = (v2) this.f137244a;
            o13.r.b(obj);
            aVar = zb0.x.f203870a;
            this.f137244a = v2Var2;
            this.f137245b = arrayList2;
            this.f137246c = 4;
            if (aVar.a(arrayList2, this) != aVar2) {
                arrayList3 = arrayList2;
                v2Var3 = v2Var2;
            }
            return aVar2;
        }
        if (i14 != 4) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList5 = this.f137245b;
        v2Var3 = (v2) this.f137244a;
        o13.r.b(obj);
        arrayList3 = arrayList5;
        j.c(jVar, arrayList3, str2);
        return new v2.b(new hv.h(arrayList3, this.f137249f, false, false, 12, null), ((v2.b) v2Var3).f47387b, null, null, 12, null);
    }
}
