package com.garmin.android.apps.connectmobile.devices.targetedselection;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.s3;
import c80.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.z;
import p13.h0;
import p13.j0;
import p13.y;
import zb0.t;
import zd0.c0;
import zd0.j1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/n;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f34632h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34633a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z<bz.d> f34634b = new z<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f34635c = (c0) KoinJavaComponent.get$default(c0.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f34636d = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o52.d f34637e = (o52.d) KoinJavaComponent.get$default(o52.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<p> f34638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<p> f34639g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$loadDevices$1", f = "TDSViewModel.kt", l = {108, 121}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f34641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f34642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f34643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f34644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList f34645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f34646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f34647h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34648i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<sd2.f> f34650k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f34651l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ fd0.d f34652m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f34653n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.b f34654o;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34655a;

            static {
                int[] iArr = new int[bz.d.values().length];
                try {
                    iArr[bz.d.f22262a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bz.d.f22263b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bz.d.f22264c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[bz.d.f22265d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f34655a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.targetedselection.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$loadDevices$1$devices$1", f = "TDSViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0583b extends v13.i implements e23.p<b0, t13.d<? super List<? extends sd2.f>>, Object> {
            public C0583b(t13.d<? super C0583b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0583b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends sd2.f>> dVar) {
                return new C0583b(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                rd2.f.a().f152045a.getClass();
                ArrayList arrayListD = rd2.j.d();
                return arrayListD == null ? j0.f134944a : arrayListD;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends sd2.f> list, boolean z14, fd0.d dVar, boolean z15, com.garmin.android.library.mapsdkadapter.i.b bVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f34650k = list;
            this.f34651l = z14;
            this.f34652m = dVar;
            this.f34653n = z15;
            this.f34654o = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new b(this.f34650k, this.f34651l, this.f34652m, this.f34653n, this.f34654o, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02be  */
        /* JADX WARN: Code duplicated, block: B:103:0x02eb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:104:0x02ed A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:105:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:106:0x0319  */
        /* JADX WARN: Code duplicated, block: B:107:0x0343  */
        /* JADX WARN: Code duplicated, block: B:109:0x034b  */
        /* JADX WARN: Code duplicated, block: B:114:0x0385  */
        /* JADX WARN: Code duplicated, block: B:115:0x0392  */
        /* JADX WARN: Code duplicated, block: B:118:0x0399  */
        /* JADX WARN: Code duplicated, block: B:121:0x03aa  */
        /* JADX WARN: Code duplicated, block: B:124:0x03bb  */
        /* JADX WARN: Code duplicated, block: B:127:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:130:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:134:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:137:0x03fc  */
        /* JADX WARN: Code duplicated, block: B:144:0x0429  */
        /* JADX WARN: Code duplicated, block: B:147:0x0435  */
        /* JADX WARN: Code duplicated, block: B:150:0x043f  */
        /* JADX WARN: Code duplicated, block: B:152:0x0449  */
        /* JADX WARN: Code duplicated, block: B:160:0x0468  */
        /* JADX WARN: Code duplicated, block: B:163:0x0470  */
        /* JADX WARN: Code duplicated, block: B:165:0x0478  */
        /* JADX WARN: Code duplicated, block: B:168:0x048e  */
        /* JADX WARN: Code duplicated, block: B:170:0x0498  */
        /* JADX WARN: Code duplicated, block: B:172:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:175:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:176:0x04b5  */
        /* JADX WARN: Code duplicated, block: B:179:0x04bc  */
        /* JADX WARN: Code duplicated, block: B:182:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:183:0x04d5  */
        /* JADX WARN: Code duplicated, block: B:185:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:188:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:189:0x04f6  */
        /* JADX WARN: Code duplicated, block: B:192:0x037f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:193:0x0229 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:203:0x0406 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:206:0x03f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0468 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x0465 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x00be  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:32:0x0115  */
        /* JADX WARN: Code duplicated, block: B:34:0x013c  */
        /* JADX WARN: Code duplicated, block: B:35:0x013e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:38:0x0145 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0147  */
        /* JADX WARN: Code duplicated, block: B:42:0x0159 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x015b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0166  */
        /* JADX WARN: Code duplicated, block: B:47:0x016b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0175 A[PHI: r5
          0x0175: PHI (r5v42 bz.d$a) = (r5v39 bz.d$a), (r5v39 bz.d$a), (r5v43 bz.d$a), (r5v43 bz.d$a) binds: [B:74:0x01cd, B:78:0x01d7, B:48:0x016d, B:50:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:52:0x0178  */
        /* JADX WARN: Code duplicated, block: B:54:0x0185  */
        /* JADX WARN: Code duplicated, block: B:55:0x0188  */
        /* JADX WARN: Code duplicated, block: B:57:0x018f  */
        /* JADX WARN: Code duplicated, block: B:59:0x019b  */
        /* JADX WARN: Code duplicated, block: B:60:0x019e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:66:0x01b3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:71:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:80:0x01da  */
        /* JADX WARN: Code duplicated, block: B:82:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:87:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:94:0x022f  */
        /* JADX WARN: Code duplicated, block: B:95:0x025c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:96:0x025e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:97:0x0260  */
        /* JADX WARN: Code duplicated, block: B:98:0x028b  */
        /* JADX WARN: Code duplicated, block: B:99:0x02b6  */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x0115, please report this as an issue */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<sd2.f> list;
            n nVar;
            Object objE0;
            List listN0;
            ArrayList<l> arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Object objI;
            ArrayList<l> arrayList8;
            boolean z14;
            Iterator it;
            boolean zHasNext;
            fd0.d dVar;
            int i14;
            p pVar;
            ArrayList arrayList9;
            p pVarD;
            p pVarA;
            Object obj2;
            p pVarD2;
            p pVarA2;
            ArrayList arrayList10;
            l.a aVar;
            Iterator it3;
            l lVar;
            sd2.f fVar;
            boolean zM;
            boolean zA;
            boolean z15;
            z<bz.d> zVar;
            boolean z16;
            boolean z17;
            bz.d dVar2;
            long unitID;
            int i15;
            bz.d dVarB;
            bz.d dVarB2;
            bz.d.a aVar2;
            bz.d dVar3;
            bz.d dVarB3;
            int i16;
            String displayName;
            String displayName2;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i17 = this.f34648i;
            n nVar2 = n.this;
            if (i17 == 0) {
                r.b(obj);
                list = this.f34650k;
                if (list == null) {
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    C0583b c0583b = new C0583b(null);
                    this.f34640a = nVar2;
                    this.f34648i = 1;
                    objE0 = ge1.b.e0(bVar, c0583b, this);
                    if (objE0 != aVar3) {
                        nVar = nVar2;
                    }
                } else {
                    nVar = nVar2;
                    int i18 = n.f34632h;
                    nVar.getClass();
                    f12.l.f68084a.getClass();
                    listN0 = h0.N0(list, new fd0.i(new fd0.h(new fd0.g(f12.l.a.a().s4()))));
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    arrayList7 = new ArrayList();
                    j1 j1Var = nVar2.f34636d;
                    this.f34640a = listN0;
                    this.f34641b = arrayList;
                    this.f34642c = arrayList2;
                    this.f34643d = arrayList3;
                    this.f34644e = arrayList4;
                    this.f34645f = arrayList5;
                    this.f34646g = arrayList6;
                    this.f34647h = arrayList7;
                    this.f34648i = 2;
                    objI = j1Var.i(this);
                    if (objI != aVar3) {
                        arrayList8 = arrayList7;
                        s sVar = (s) objI;
                        z14 = sVar instanceof s.a;
                        boolean z18 = sVar instanceof s.b;
                        it = listN0.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            dVar = this.f34652m;
                            if (!zHasNext) {
                                if (arrayList.isEmpty()) {
                                    i14 = 0;
                                } else {
                                    i14 = 0;
                                    arrayList.add(0, new l.b(R.string.devices_compatible));
                                }
                                if (!arrayList2.isEmpty()) {
                                    arrayList2.add(i14, new l.b(R.string.targeted_device_selection_title_connected));
                                }
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.add(i14, new l.b(R.string.targeted_device_selection_title_not_connected));
                                }
                                if (!arrayList4.isEmpty()) {
                                    arrayList4.add(i14, new l.b(R.string.partially_compatible));
                                }
                                if (!arrayList5.isEmpty()) {
                                    arrayList5.add(i14, new l.b(R.string.targeted_device_selection_title_not_compatible));
                                }
                                if (!arrayList6.isEmpty()) {
                                    arrayList6.add(i14, new l.b(R.string.lbl_garmin_connect_plus));
                                }
                                arrayList8.addAll(arrayList);
                                if (!arrayList.isEmpty()) {
                                    for (l lVar2 : arrayList) {
                                        if (!(lVar2 instanceof l.a)) {
                                        }
                                    }
                                }
                                arrayList8.addAll(arrayList2);
                                arrayList8.addAll(arrayList3);
                                arrayList8.addAll(arrayList4);
                                arrayList8.addAll(arrayList5);
                                if (this.f34651l) {
                                    int i19 = n.f34632h;
                                    nVar2.getClass();
                                    if (arrayList8.isEmpty()) {
                                        pVar = null;
                                    } else {
                                        it3 = arrayList8.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                lVar = (l) it3.next();
                                                if (!(lVar instanceof l.a)) {
                                                }
                                            } else {
                                                pVar = null;
                                            }
                                        }
                                    }
                                } else {
                                    pVar = null;
                                }
                                arrayList8.addAll(arrayList6);
                                if (this.f34653n) {
                                    if (nVar2.f34633a > 1) {
                                        arrayList10 = new ArrayList(y.r(arrayList8, 10));
                                        obj2 = pVar;
                                        for (l lVarA : arrayList8) {
                                            if (lVarA instanceof l.a) {
                                                aVar = (l.a) lVarA;
                                                if (aVar.f34614c == nVar2.f34633a) {
                                                    lVarA = aVar;
                                                } else {
                                                    lVarA = aVar;
                                                }
                                            }
                                            arrayList10.add(lVarA);
                                        }
                                        arrayList8 = arrayList10;
                                    } else {
                                        obj2 = pVar;
                                    }
                                    y0<p> y0Var = nVar2.f34638f;
                                    pVarD2 = y0Var.d();
                                    if (pVarD2 != null) {
                                        pVarA2 = p.a(pVarD2, false, null, null, (l.a) obj2, 15);
                                    } else {
                                        pVarA2 = pVar;
                                    }
                                    y0Var.m(pVarA2);
                                    arrayList9 = new ArrayList(arrayList8);
                                } else {
                                    arrayList9 = arrayList8;
                                }
                                y0<p> y0Var2 = nVar2.f34638f;
                                pVarD = y0Var2.d();
                                if (pVarD != null) {
                                    pVarA = p.a(pVarD, false, arrayList9, null, null, 28);
                                } else {
                                    pVarA = pVar;
                                }
                                y0Var2.m(pVarA);
                                return Unit.INSTANCE;
                            }
                            fVar = (sd2.f) it.next();
                            zM = hk0.p.m(fVar);
                            zA = nVar2.f34635c.a(fVar);
                            if (zA) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            fd0.j jVar = fd0.j.f70475a;
                            zVar = nVar2.f34634b;
                            jVar.getClass();
                            dVar.getClass();
                            z16 = dVar.f70468b;
                            z17 = dVar.f70469c;
                            dVar2 = bz.d.f22264c;
                            Iterator it4 = it;
                            boolean z19 = z14;
                            unitID = fVar.getUnitID();
                            i15 = fd0.j.a.f70476a[dVar.ordinal()];
                            com.garmin.android.library.mapsdkadapter.i.b bVar2 = this.f34654o;
                            switch (i15) {
                                case 1:
                                    if (cu0.g.c(unitID)) {
                                        dVar2 = bz.d.f22262a;
                                    }
                                    dVar3 = dVar2;
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                    if (zVar != null) {
                                        dVarB = zVar.b(fVar.getUnitID());
                                    } else {
                                        dVarB = null;
                                    }
                                    if (dVarB == bz.d.f22263b) {
                                        dVar3 = dVarB;
                                    } else {
                                        if (zVar != null) {
                                            dVarB2 = zVar.b(fVar.getUnitID());
                                        } else {
                                            dVarB2 = null;
                                        }
                                        aVar2 = bz.d.f22262a;
                                        if (dVarB2 == aVar2) {
                                            dVar2 = aVar2;
                                        }
                                        dVar3 = dVar2;
                                    }
                                    break;
                                case 5:
                                    if (fVar.u3()) {
                                        dVar2 = bz.d.f22262a;
                                    } else {
                                        dVar2 = bz.d.f22262a;
                                    }
                                    dVar3 = dVar2;
                                    break;
                                case 6:
                                    if (km2.a.i(unitID, null, SupportedCapability.WORKOUT_DOWNLOAD.ordinal())) {
                                        dVar2 = bz.d.f22262a;
                                    }
                                    dVar3 = dVar2;
                                    break;
                                case 7:
                                case 8:
                                    if (zVar != null) {
                                        dVarB3 = zVar.b(fVar.getUnitID());
                                    } else {
                                        dVarB3 = null;
                                    }
                                    aVar2 = bz.d.f22262a;
                                    if (dVarB3 == aVar2) {
                                        dVar2 = aVar2;
                                    }
                                    dVar3 = dVar2;
                                    break;
                                case 9:
                                case 10:
                                    if (zA) {
                                        if (zVar != null) {
                                            bz.d dVarB4 = zVar.b(unitID);
                                            dVarB4.getClass();
                                            dVar2 = dVarB4;
                                        }
                                    } else if (zVar != null) {
                                        bz.d dVarB5 = zVar.b(unitID);
                                        dVarB5.getClass();
                                        dVar2 = dVarB5;
                                    }
                                    dVar3 = dVar2;
                                    break;
                                default:
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var = a2.DEVICES;
                                    String str = "Fix me developer! In .isCompatible(), I'm not handling module type [" + dVar.name() + "]!";
                                    aVar4.getClass();
                                    i2.a.f(a2Var, "TargetDeviceUtil", str);
                                    dVar3 = dVar2;
                                    break;
                            }
                            i16 = a.f34655a[dVar3.ordinal()];
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 == 3) {
                                        String productDisplayName = fVar.getProductDisplayName();
                                        productDisplayName.getClass();
                                        arrayList5.add(new l.a(productDisplayName, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, false, zM, false, dVar3, false, 688, null));
                                    } else {
                                        if (i16 != 4) {
                                            u0.r();
                                            return null;
                                        }
                                        boolean z24 = !s3.b();
                                        String productDisplayName2 = fVar.getProductDisplayName();
                                        productDisplayName2.getClass();
                                        arrayList6.add(new l.a(productDisplayName2, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, z24, zM, false, dVar3, false, 656, null));
                                    }
                                } else if (z17) {
                                    displayName2 = fVar.getDisplayName();
                                    if (displayName2 == null) {
                                        displayName2 = fVar.getProductDisplayName();
                                        displayName2.getClass();
                                    }
                                    arrayList4.add(new l.a(displayName2, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                                } else if (zM) {
                                    String productDisplayName3 = fVar.getProductDisplayName();
                                    productDisplayName3.getClass();
                                    arrayList2.add(new l.a(productDisplayName3, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                                } else {
                                    String productDisplayName4 = fVar.getProductDisplayName();
                                    productDisplayName4.getClass();
                                    arrayList3.add(new l.a(productDisplayName4, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                                }
                            } else if (z17) {
                                displayName = fVar.getDisplayName();
                                if (displayName == null) {
                                    displayName = fVar.getProductDisplayName();
                                    displayName.getClass();
                                }
                                arrayList.add(new l.a(displayName, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                            } else if (zM) {
                                String productDisplayName5 = fVar.getProductDisplayName();
                                productDisplayName5.getClass();
                                arrayList2.add(new l.a(productDisplayName5, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                            } else {
                                String productDisplayName6 = fVar.getProductDisplayName();
                                productDisplayName6.getClass();
                                arrayList3.add(new l.a(productDisplayName6, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                            }
                            z14 = z19;
                            it = it4;
                        }
                    }
                }
                return aVar3;
            }
            if (i17 == 1) {
                n nVar3 = (n) this.f34640a;
                r.b(obj);
                nVar = nVar3;
                objE0 = obj;
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList8 = this.f34647h;
                arrayList6 = this.f34646g;
                arrayList5 = this.f34645f;
                arrayList4 = this.f34644e;
                arrayList3 = this.f34643d;
                arrayList2 = this.f34642c;
                arrayList = this.f34641b;
                listN0 = (List) this.f34640a;
                r.b(obj);
                objI = obj;
            }
            s sVar2 = (s) objI;
            z14 = sVar2 instanceof s.a;
            boolean z110 = sVar2 instanceof s.b;
            it = listN0.iterator();
            while (true) {
                zHasNext = it.hasNext();
                dVar = this.f34652m;
                if (!zHasNext) {
                    if (arrayList.isEmpty()) {
                        i14 = 0;
                        arrayList.add(0, new l.b(R.string.devices_compatible));
                    } else {
                        i14 = 0;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList2.add(i14, new l.b(R.string.targeted_device_selection_title_connected));
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList3.add(i14, new l.b(R.string.targeted_device_selection_title_not_connected));
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList4.add(i14, new l.b(R.string.partially_compatible));
                    }
                    if (!arrayList5.isEmpty()) {
                        arrayList5.add(i14, new l.b(R.string.targeted_device_selection_title_not_compatible));
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList6.add(i14, new l.b(R.string.lbl_garmin_connect_plus));
                    }
                    arrayList8.addAll(arrayList);
                    if (!arrayList.isEmpty()) {
                        while (r5.hasNext()) {
                            if (!(lVar2 instanceof l.a) && ((l.a) lVar2).f34620i) {
                                arrayList8.add(new l.c(R.string.compatible_devices_gc_plus_footer_text, null, 2, null));
                            }
                        }
                    }
                    arrayList8.addAll(arrayList2);
                    arrayList8.addAll(arrayList3);
                    arrayList8.addAll(arrayList4);
                    arrayList8.addAll(arrayList5);
                    if (this.f34651l) {
                        int i110 = n.f34632h;
                        nVar2.getClass();
                        if (arrayList8.isEmpty()) {
                            pVar = null;
                        } else {
                            it3 = arrayList8.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    lVar = (l) it3.next();
                                    if (!(lVar instanceof l.a) && !((l.a) lVar).f34619h) {
                                        pVar = null;
                                        arrayList8.add(new l.c(dVar == fd0.d.GROUP_RIDE ? R.string.group_ride_send_to_device_note : R.string.send_to_device_not_connected_description, null, 2, null));
                                    }
                                } else {
                                    pVar = null;
                                }
                            }
                        }
                    } else {
                        pVar = null;
                    }
                    arrayList8.addAll(arrayList6);
                    if (this.f34653n) {
                        if (nVar2.f34633a > 1) {
                            arrayList10 = new ArrayList(y.r(arrayList8, 10));
                            obj2 = pVar;
                            while (r1.hasNext()) {
                                if (lVarA instanceof l.a) {
                                    aVar = (l.a) lVarA;
                                    if (aVar.f34614c == nVar2.f34633a || !aVar.f34618g) {
                                        lVarA = aVar;
                                    } else {
                                        obj2 = lVarA;
                                        lVarA = l.a.a(aVar, true);
                                    }
                                }
                                arrayList10.add(lVarA);
                            }
                            arrayList8 = arrayList10;
                        } else {
                            obj2 = pVar;
                        }
                        y0<p> y0Var3 = nVar2.f34638f;
                        pVarD2 = y0Var3.d();
                        if (pVarD2 != null) {
                            pVarA2 = p.a(pVarD2, false, null, null, (l.a) obj2, 15);
                        } else {
                            pVarA2 = pVar;
                        }
                        y0Var3.m(pVarA2);
                        arrayList9 = new ArrayList(arrayList8);
                    } else {
                        arrayList9 = arrayList8;
                    }
                    y0<p> y0Var4 = nVar2.f34638f;
                    pVarD = y0Var4.d();
                    if (pVarD != null) {
                        pVarA = p.a(pVarD, false, arrayList9, null, null, 28);
                    } else {
                        pVarA = pVar;
                    }
                    y0Var4.m(pVarA);
                    return Unit.INSTANCE;
                }
                fVar = (sd2.f) it.next();
                zM = hk0.p.m(fVar);
                zA = nVar2.f34635c.a(fVar);
                if (zA || !z14) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                fd0.j jVar2 = fd0.j.f70475a;
                zVar = nVar2.f34634b;
                jVar2.getClass();
                dVar.getClass();
                z16 = dVar.f70468b;
                z17 = dVar.f70469c;
                dVar2 = bz.d.f22264c;
                Iterator it5 = it;
                boolean z111 = z14;
                unitID = fVar.getUnitID();
                i15 = fd0.j.a.f70476a[dVar.ordinal()];
                com.garmin.android.library.mapsdkadapter.i.b bVar3 = this.f34654o;
                switch (i15) {
                    case 1:
                        if (cu0.g.c(unitID)) {
                            dVar2 = bz.d.f22262a;
                        }
                        dVar3 = dVar2;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        if (zVar != null) {
                            dVarB = zVar.b(fVar.getUnitID());
                        } else {
                            dVarB = null;
                        }
                        if (dVarB == bz.d.f22263b) {
                            dVar3 = dVarB;
                        } else {
                            if (zVar != null) {
                                dVarB2 = zVar.b(fVar.getUnitID());
                            } else {
                                dVarB2 = null;
                            }
                            aVar2 = bz.d.f22262a;
                            if (dVarB2 == aVar2 && fVar.Q2() && (bVar3 == com.garmin.android.library.mapsdkadapter.i.b.WGS84 || (fVar.r0() && bVar3 == com.garmin.android.library.mapsdkadapter.i.b.GCJ02))) {
                                dVar2 = aVar2;
                            }
                            dVar3 = dVar2;
                        }
                        break;
                    case 5:
                        if (fVar.u3() || km2.a.i(unitID, null, SupportedCapability.SEGMENTS.ordinal())) {
                            dVar2 = bz.d.f22262a;
                        }
                        dVar3 = dVar2;
                        break;
                    case 6:
                        if (km2.a.i(unitID, null, SupportedCapability.WORKOUT_DOWNLOAD.ordinal())) {
                            dVar2 = bz.d.f22262a;
                        }
                        dVar3 = dVar2;
                        break;
                    case 7:
                    case 8:
                        if (zVar != null) {
                            dVarB3 = zVar.b(fVar.getUnitID());
                        } else {
                            dVarB3 = null;
                        }
                        aVar2 = bz.d.f22262a;
                        if (dVarB3 == aVar2 && (bVar3 != com.garmin.android.library.mapsdkadapter.i.b.GCJ02 || fVar.r0())) {
                            dVar2 = aVar2;
                        }
                        dVar3 = dVar2;
                        break;
                    case 9:
                    case 10:
                        if (zA || z111) {
                            if (zVar != null && zVar.c(unitID) >= 0) {
                                bz.d dVarB6 = zVar.b(unitID);
                                dVarB6.getClass();
                                dVar2 = dVarB6;
                            }
                        } else if (z110) {
                            dVar2 = bz.d.f22265d;
                        }
                        dVar3 = dVar2;
                        break;
                    default:
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.DEVICES;
                        String str2 = "Fix me developer! In .isCompatible(), I'm not handling module type [" + dVar.name() + "]!";
                        aVar5.getClass();
                        i2.a.f(a2Var2, "TargetDeviceUtil", str2);
                        dVar3 = dVar2;
                        break;
                }
                i16 = a.f34655a[dVar3.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            String productDisplayName7 = fVar.getProductDisplayName();
                            productDisplayName7.getClass();
                            arrayList5.add(new l.a(productDisplayName7, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, false, zM, false, dVar3, false, 688, null));
                        } else {
                            if (i16 != 4) {
                                u0.r();
                                return null;
                            }
                            boolean z25 = !s3.b();
                            String productDisplayName8 = fVar.getProductDisplayName();
                            productDisplayName8.getClass();
                            arrayList6.add(new l.a(productDisplayName8, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, z25, zM, false, dVar3, false, 656, null));
                        }
                    } else if (z17) {
                        displayName2 = fVar.getDisplayName();
                        if (displayName2 == null) {
                            displayName2 = fVar.getProductDisplayName();
                            displayName2.getClass();
                        }
                        arrayList4.add(new l.a(displayName2, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                    } else if (zM) {
                        String productDisplayName9 = fVar.getProductDisplayName();
                        productDisplayName9.getClass();
                        arrayList2.add(new l.a(productDisplayName9, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                    } else {
                        String productDisplayName10 = fVar.getProductDisplayName();
                        productDisplayName10.getClass();
                        arrayList3.add(new l.a(productDisplayName10, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                    }
                } else if (z17) {
                    displayName = fVar.getDisplayName();
                    if (displayName == null) {
                        displayName = fVar.getProductDisplayName();
                        displayName.getClass();
                    }
                    arrayList.add(new l.a(displayName, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                } else if (zM) {
                    String productDisplayName11 = fVar.getProductDisplayName();
                    productDisplayName11.getClass();
                    arrayList2.add(new l.a(productDisplayName11, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                } else {
                    String productDisplayName12 = fVar.getProductDisplayName();
                    productDisplayName12.getClass();
                    arrayList3.add(new l.a(productDisplayName12, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                }
                z14 = z111;
                it = it5;
            }
            list = (List) objE0;
            int i111 = n.f34632h;
            nVar.getClass();
            f12.l.f68084a.getClass();
            listN0 = h0.N0(list, new fd0.i(new fd0.h(new fd0.g(f12.l.a.a().s4()))));
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            arrayList4 = new ArrayList();
            arrayList5 = new ArrayList();
            arrayList6 = new ArrayList();
            arrayList7 = new ArrayList();
            j1 j1Var2 = nVar2.f34636d;
            this.f34640a = listN0;
            this.f34641b = arrayList;
            this.f34642c = arrayList2;
            this.f34643d = arrayList3;
            this.f34644e = arrayList4;
            this.f34645f = arrayList5;
            this.f34646g = arrayList6;
            this.f34647h = arrayList7;
            this.f34648i = 2;
            objI = j1Var2.i(this);
            if (objI != aVar3) {
                arrayList8 = arrayList7;
                s sVar3 = (s) objI;
                z14 = sVar3 instanceof s.a;
                boolean z112 = sVar3 instanceof s.b;
                it = listN0.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    dVar = this.f34652m;
                    if (!zHasNext) {
                        if (arrayList.isEmpty()) {
                            i14 = 0;
                            arrayList.add(0, new l.b(R.string.devices_compatible));
                        } else {
                            i14 = 0;
                        }
                        if (!arrayList2.isEmpty()) {
                            arrayList2.add(i14, new l.b(R.string.targeted_device_selection_title_connected));
                        }
                        if (!arrayList3.isEmpty()) {
                            arrayList3.add(i14, new l.b(R.string.targeted_device_selection_title_not_connected));
                        }
                        if (!arrayList4.isEmpty()) {
                            arrayList4.add(i14, new l.b(R.string.partially_compatible));
                        }
                        if (!arrayList5.isEmpty()) {
                            arrayList5.add(i14, new l.b(R.string.targeted_device_selection_title_not_compatible));
                        }
                        if (!arrayList6.isEmpty()) {
                            arrayList6.add(i14, new l.b(R.string.lbl_garmin_connect_plus));
                        }
                        arrayList8.addAll(arrayList);
                        if (!arrayList.isEmpty()) {
                            while (r5.hasNext()) {
                                if (!(lVar2 instanceof l.a)) {
                                }
                            }
                        }
                        arrayList8.addAll(arrayList2);
                        arrayList8.addAll(arrayList3);
                        arrayList8.addAll(arrayList4);
                        arrayList8.addAll(arrayList5);
                        if (this.f34651l) {
                            int i112 = n.f34632h;
                            nVar2.getClass();
                            if (arrayList8.isEmpty()) {
                                pVar = null;
                            } else {
                                it3 = arrayList8.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        lVar = (l) it3.next();
                                        if (!(lVar instanceof l.a)) {
                                        }
                                    } else {
                                        pVar = null;
                                    }
                                }
                            }
                        } else {
                            pVar = null;
                        }
                        arrayList8.addAll(arrayList6);
                        if (this.f34653n) {
                            if (nVar2.f34633a > 1) {
                                arrayList10 = new ArrayList(y.r(arrayList8, 10));
                                obj2 = pVar;
                                while (r1.hasNext()) {
                                    if (lVarA instanceof l.a) {
                                        aVar = (l.a) lVarA;
                                        if (aVar.f34614c == nVar2.f34633a) {
                                            lVarA = aVar;
                                        } else {
                                            lVarA = aVar;
                                        }
                                    }
                                    arrayList10.add(lVarA);
                                }
                                arrayList8 = arrayList10;
                            } else {
                                obj2 = pVar;
                            }
                            y0<p> y0Var5 = nVar2.f34638f;
                            pVarD2 = y0Var5.d();
                            if (pVarD2 != null) {
                                pVarA2 = p.a(pVarD2, false, null, null, (l.a) obj2, 15);
                            } else {
                                pVarA2 = pVar;
                            }
                            y0Var5.m(pVarA2);
                            arrayList9 = new ArrayList(arrayList8);
                        } else {
                            arrayList9 = arrayList8;
                        }
                        y0<p> y0Var6 = nVar2.f34638f;
                        pVarD = y0Var6.d();
                        if (pVarD != null) {
                            pVarA = p.a(pVarD, false, arrayList9, null, null, 28);
                        } else {
                            pVarA = pVar;
                        }
                        y0Var6.m(pVarA);
                        return Unit.INSTANCE;
                    }
                    fVar = (sd2.f) it.next();
                    zM = hk0.p.m(fVar);
                    zA = nVar2.f34635c.a(fVar);
                    if (zA) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    fd0.j jVar3 = fd0.j.f70475a;
                    zVar = nVar2.f34634b;
                    jVar3.getClass();
                    dVar.getClass();
                    z16 = dVar.f70468b;
                    z17 = dVar.f70469c;
                    dVar2 = bz.d.f22264c;
                    Iterator it6 = it;
                    boolean z113 = z14;
                    unitID = fVar.getUnitID();
                    i15 = fd0.j.a.f70476a[dVar.ordinal()];
                    com.garmin.android.library.mapsdkadapter.i.b bVar4 = this.f34654o;
                    switch (i15) {
                        case 1:
                            if (cu0.g.c(unitID)) {
                                dVar2 = bz.d.f22262a;
                            }
                            dVar3 = dVar2;
                            break;
                        case 2:
                        case 3:
                        case 4:
                            if (zVar != null) {
                                dVarB = zVar.b(fVar.getUnitID());
                            } else {
                                dVarB = null;
                            }
                            if (dVarB == bz.d.f22263b) {
                                dVar3 = dVarB;
                            } else {
                                if (zVar != null) {
                                    dVarB2 = zVar.b(fVar.getUnitID());
                                } else {
                                    dVarB2 = null;
                                }
                                aVar2 = bz.d.f22262a;
                                if (dVarB2 == aVar2) {
                                    dVar2 = aVar2;
                                }
                                dVar3 = dVar2;
                            }
                            break;
                        case 5:
                            if (fVar.u3()) {
                                dVar2 = bz.d.f22262a;
                            } else {
                                dVar2 = bz.d.f22262a;
                            }
                            dVar3 = dVar2;
                            break;
                        case 6:
                            if (km2.a.i(unitID, null, SupportedCapability.WORKOUT_DOWNLOAD.ordinal())) {
                                dVar2 = bz.d.f22262a;
                            }
                            dVar3 = dVar2;
                            break;
                        case 7:
                        case 8:
                            if (zVar != null) {
                                dVarB3 = zVar.b(fVar.getUnitID());
                            } else {
                                dVarB3 = null;
                            }
                            aVar2 = bz.d.f22262a;
                            if (dVarB3 == aVar2) {
                                dVar2 = aVar2;
                            }
                            dVar3 = dVar2;
                            break;
                        case 9:
                        case 10:
                            if (zA) {
                                if (zVar != null) {
                                    bz.d dVarB7 = zVar.b(unitID);
                                    dVarB7.getClass();
                                    dVar2 = dVarB7;
                                }
                            } else if (zVar != null) {
                                bz.d dVarB8 = zVar.b(unitID);
                                dVarB8.getClass();
                                dVar2 = dVarB8;
                            }
                            dVar3 = dVar2;
                            break;
                        default:
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var3 = a2.DEVICES;
                            String str3 = "Fix me developer! In .isCompatible(), I'm not handling module type [" + dVar.name() + "]!";
                            aVar6.getClass();
                            i2.a.f(a2Var3, "TargetDeviceUtil", str3);
                            dVar3 = dVar2;
                            break;
                    }
                    i16 = a.f34655a[dVar3.ordinal()];
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                String productDisplayName13 = fVar.getProductDisplayName();
                                productDisplayName13.getClass();
                                arrayList5.add(new l.a(productDisplayName13, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, false, zM, false, dVar3, false, 688, null));
                            } else {
                                if (i16 != 4) {
                                    u0.r();
                                    return null;
                                }
                                boolean z26 = !s3.b();
                                String productDisplayName14 = fVar.getProductDisplayName();
                                productDisplayName14.getClass();
                                arrayList6.add(new l.a(productDisplayName14, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, z26, zM, false, dVar3, false, 656, null));
                            }
                        } else if (z17) {
                            displayName2 = fVar.getDisplayName();
                            if (displayName2 == null) {
                                displayName2 = fVar.getProductDisplayName();
                                displayName2.getClass();
                            }
                            arrayList4.add(new l.a(displayName2, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                        } else if (zM) {
                            String productDisplayName15 = fVar.getProductDisplayName();
                            productDisplayName15.getClass();
                            arrayList2.add(new l.a(productDisplayName15, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                        } else {
                            String productDisplayName16 = fVar.getProductDisplayName();
                            productDisplayName16.getClass();
                            arrayList3.add(new l.a(productDisplayName16, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                        }
                    } else if (z17) {
                        displayName = fVar.getDisplayName();
                        if (displayName == null) {
                            displayName = fVar.getProductDisplayName();
                            displayName.getClass();
                        }
                        arrayList.add(new l.a(displayName, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, zM, z15, dVar3, false, 528, null));
                    } else if (zM) {
                        String productDisplayName17 = fVar.getProductDisplayName();
                        productDisplayName17.getClass();
                        arrayList2.add(new l.a(productDisplayName17, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, true, true, z15, dVar3, false, 528, null));
                    } else {
                        String productDisplayName18 = fVar.getProductDisplayName();
                        productDisplayName18.getClass();
                        arrayList3.add(new l.a(productDisplayName18, fVar.getUnitID(), t.d(fVar), fVar.getImageURL(), false, !z16, false, z15, dVar3, false, 528, null));
                    }
                    z14 = z113;
                    it = it6;
                }
            }
            return aVar3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$onDeviceSelectionFinished$1", f = "TDSViewModel.kt", l = {391, 418}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd0.d f34657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m52.k f34658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f0 f34659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f34660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l.a f34661f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.targetedselection.TDSViewModel$onDeviceSelectionFinished$1$deviceDatabaseRecord$1", f = "TDSViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l.a f34662a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f34662a = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f34662a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                rd2.j jVar = rd2.f.a().f152045a;
                long j8 = this.f34662a.f34614c;
                jVar.getClass();
                return rd2.j.i(j8, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fd0.d dVar, m52.k kVar, f0 f0Var, n nVar, l.a aVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f34657b = dVar;
            this.f34658c = kVar;
            this.f34659d = f0Var;
            this.f34660e = nVar;
            this.f34661f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f34657b, this.f34658c, this.f34659d, this.f34660e, this.f34661f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0086  */
        /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
        
            if (com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.cancelSubscription(r8, r14) == r0) goto L49;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Integer num;
            Integer num2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34656a;
            m52.k kVar = this.f34658c;
            n nVar = this.f34660e;
            fd0.d dVar = this.f34657b;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f34661f, null);
                this.f34656a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            nVar.B4(dVar, kVar);
            y0<p> y0Var = nVar.f34638f;
            p pVarD = y0Var.d();
            y0Var.m(pVarD != null ? p.a(pVarD, false, null, null, null, 27) : null);
            return Unit.INSTANCE;
            sd2.f fVar = (sd2.f) obj;
            if (dVar == fd0.d.WORKOUTS && kVar == m52.k.f116755o && fVar != null) {
                f0 f0Var = this.f34659d;
                boolean z14 = f0Var.f48163a && !fVar.l1();
                boolean z15 = f0Var.f48164b && !fVar.N0();
                if (z14 && z15) {
                    num2 = new Integer(R.string.msg_device_power_curve_second_target_warning);
                } else if (z14) {
                    num2 = new Integer(R.string.msg_device_secondary_target_warning);
                } else if (z15) {
                    num2 = new Integer(R.string.msg_device_power_curve_targets_warning);
                } else {
                    num = null;
                }
                num = num2;
            } else {
                num = null;
            }
            if (num != null) {
                y0<p> y0Var2 = nVar.f34638f;
                p pVarD2 = y0Var2.d();
                y0Var2.m(pVarD2 != null ? p.a(pVarD2, false, null, num, null, 27) : null);
            } else {
                fd0.d dVar2 = fd0.d.LIVE_EVENT_SHARING;
                if (dVar == dVar2) {
                    long jR = GCMSettingManager.r(dVar2, null);
                    this.f34656a = 2;
                }
                nVar.B4(dVar, kVar);
            }
            y0<p> y0Var3 = nVar.f34638f;
            p pVarD3 = y0Var3.d();
            y0Var3.m(pVarD3 != null ? p.a(pVarD3, false, null, null, null, 27) : null);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public n() {
        y0<p> y0Var = new y0<>();
        y0Var.m(new p(true, j0.f134944a, null, false, null));
        this.f34638f = y0Var;
        this.f34639g = y0Var;
    }

    public static final bz.d x4(n nVar, Boolean bool) {
        nVar.getClass();
        return p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE) ? bz.d.f22262a : bz.d.f22264c;
    }

    public final void A4(l.a aVar) {
        Object obj;
        ArrayList arrayList;
        p pVarD;
        this.f34633a = -1L;
        y0<p> y0Var = this.f34638f;
        p pVarD2 = y0Var.d();
        p pVarA = null;
        if (pVarD2 != null) {
            List<l> list = pVarD2.f34682b;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            obj = null;
            for (Object objA : list) {
                if (objA instanceof l.a) {
                    l.a aVar2 = (l.a) objA;
                    if (aVar.f34614c == aVar2.f34614c) {
                        objA = l.a.a(aVar2, true);
                        obj = objA;
                    } else {
                        objA = l.a.a(aVar2, false);
                    }
                }
                arrayList2.add(objA);
            }
            arrayList = arrayList2;
        } else {
            obj = null;
            arrayList = null;
        }
        if (arrayList != null && (pVarD = y0Var.d()) != null) {
            pVarA = p.a(pVarD, false, arrayList, null, (l.a) obj, 13);
        }
        y0Var.m(pVarA);
    }

    public final void B4(fd0.d dVar, m52.k kVar) {
        dVar.getClass();
        y0<p> y0Var = this.f34638f;
        p pVarD = y0Var.d();
        l.a aVar = pVarD != null ? pVarD.f34685e : null;
        if (aVar != null) {
            long j8 = aVar.f34614c;
            if (j8 > 1) {
                GCMSettingManager.J(dVar, kVar != null ? kVar.f116768d : null, j8);
            }
        }
        p pVarD2 = y0Var.d();
        y0Var.m(pVarD2 != null ? p.a(pVarD2, false, null, null, null, 23) : null);
    }

    public final void y4(fd0.d dVar, com.garmin.android.library.mapsdkadapter.i.b bVar, boolean z14, boolean z15, List<? extends sd2.f> list) {
        dVar.getClass();
        if (!this.f34634b.d()) {
            ge1.b.T(v1.a(this), null, null, new b(list, z15, dVar, z14, bVar, null), 3);
        } else {
            p pVarD = this.f34638f.d();
            this.f34639g.m(pVarD != null ? p.a(pVarD, false, null, null, null, 30) : null);
        }
    }

    public final void z4(fd0.d dVar, m52.k kVar, f0 f0Var) {
        f0Var.getClass();
        p pVarD = this.f34638f.d();
        l.a aVar = pVarD != null ? pVarD.f34685e : null;
        if (aVar == null || aVar.f34614c <= 1) {
            return;
        }
        ge1.b.T(v1.a(this), null, null, new c(dVar, kVar, f0Var, this, aVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/n$a;", "", "<init>", "()V", "", "HEADER_POSITION", "I", "", "NO_UNIT_ID", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
