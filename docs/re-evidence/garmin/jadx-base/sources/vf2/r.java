package vf2;

import com.garmin.proto.generated.GDIDataTypes;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lk2.y;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvf2/r;", "Lvf2/q;", "Luf2/a;", "workoutFileTransfer", "Lvf2/k;", "exerciseMapSource", "<init>", "(Luf2/a;Lvf2/k;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f178007e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf2.a f178008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f178009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f178010d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.communication.workout.WorkoutDataSourceImpl", f = "WorkoutDataSourceImpl.kt", l = {57, 58}, m = "loadWorkout", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f178011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f178012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f178013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f178014d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f178016f;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f178014d = obj;
            this.f178016f |= Integer.MIN_VALUE;
            return r.this.c(null, 0L, null, null, this);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(uf2.a aVar, k kVar) {
        super(kVar);
        aVar.getClass();
        kVar.getClass();
        this.f178008b = aVar;
        this.f178009c = o13.m.b(new vd1.c(2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vf2.q
    public final Object a(int i14, int i15, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i16 = sVar.f178019c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                sVar.f178019c = i16 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objD = sVar.f178017a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = sVar.f178019c;
        if (i17 == 0) {
            o13.r.b(objD);
            String str = this.f178010d;
            if (str == null) {
                return null;
            }
            sVar.f178019c = 1;
            objD = d(i14, i15, str, sVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        o13.u uVar = (o13.u) objD;
        if (uVar != null) {
            return (c) uVar.f128607c;
        }
        return null;
    }

    @Override // vf2.q
    public final Object b(String str, fg2.j jVar) {
        Serializable serializableB = ((m) this.f178009c.getValue()).b(str, jVar);
        return serializableB == u13.a.COROUTINE_SUSPENDED ? serializableB : (List) serializableB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // vf2.q
    public final Object c(String str, long j8, String str2, GDIDataTypes.UUID uuid, t13.d<? super p> dVar) throws Throwable {
        b bVar;
        Object objP;
        Object obj;
        long j14;
        UUID uuidC;
        p pVar;
        String str3 = str;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f178016f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f178016f = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f178014d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f178016f;
        if (i15 != 0) {
            if (i15 == 1) {
                long j15 = bVar.f178013c;
                String str4 = bVar.f178011a;
                o13.r.b(objE);
                obj = objE;
                j14 = j15;
                str3 = str4;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pVar = bVar.f178012b;
                o13.r.b(objE);
            }
            p pVarA = p.a(pVar, (List) objE);
            zg2.c.f204692a.getClass();
            zg2.c.a("WorkoutDataSourceImpl", "newWorkoutData - " + pVarA);
            return pVarA;
        }
        o13.r.b(objE);
        this.f178010d = str3;
        bVar.f178011a = str3;
        bVar.f178013c = j8;
        bVar.f178016f = 1;
        uf2.a aVar = this.f178008b;
        aVar.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("DeviceWorkoutFileTransfer", "fileUUID - " + uuid);
        if (uuid == null || (uuidC = y.c(uuid)) == null) {
            objP = null;
        } else {
            zg2.c.a("DeviceWorkoutFileTransfer", "fileUUID toUUID - " + uuidC);
            dz2.e eVar = new dz2.e();
            o53.k kVar = new o53.k(u13.f.b(bVar), 1);
            kVar.q();
            uf2.c cVar = new uf2.c(aVar, eVar, kVar, j8);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new uf2.b(eVar, cVar, str2, uuidC, null), 3);
            objP = kVar.p();
        }
        if (objP != obj2) {
            obj = objP;
            j14 = j8;
        }
        return obj2;
        p pVar2 = (p) obj;
        if (pVar2 == null) {
            return null;
        }
        bVar.f178011a = null;
        bVar.f178012b = pVar2;
        bVar.f178013c = j14;
        bVar.f178016f = 2;
        objE = e(str3, pVar2, bVar);
        if (objE != obj2) {
            pVar = pVar2;
            p pVarA2 = p.a(pVar, (List) objE);
            zg2.c.f204692a.getClass();
            zg2.c.a("WorkoutDataSourceImpl", "newWorkoutData - " + pVarA2);
            return pVarA2;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable d(int i14, int i15, String str, v13.c cVar) {
        t tVar;
        o13.p pVar;
        String str2;
        String str3;
        Object next;
        Object next2;
        String name;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i16 = tVar.f178024e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                tVar.f178024e = i16 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objA = tVar.f178022c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = tVar.f178024e;
        if (i17 == 0) {
            o13.r.b(objA);
            List list = (List) this.f178006a.f177995b.getValue();
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((d) next).getCategory().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != i14);
                d dVar = (d) next;
                if (dVar != null) {
                    Iterator<T> it3 = dVar.b().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((f) next2).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != i15);
                    f fVar = (f) next2;
                    pVar = (fVar == null || (name = fVar.getName()) == null) ? new o13.p(dVar.getCategory().getName(), dVar.getCategory().getName()) : new o13.p(dVar.getCategory().getName(), name);
                } else {
                    pVar = null;
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                String str4 = (String) pVar.f128594a;
                String str5 = (String) pVar.f128595b;
                tVar.f178020a = str4;
                tVar.f178021b = str5;
                tVar.f178024e = 1;
                objA = ((m) this.f178009c.getValue()).a(str, str4, Character.isDigit(d53.y.p0(str5)) ? "_".concat(str5) : str5, tVar);
                if (objA == aVar) {
                    return aVar;
                }
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = tVar.f178021b;
        str2 = tVar.f178020a;
        o13.r.b(objA);
        c cVar2 = (c) objA;
        if (cVar2 != null) {
            return new o13.u(str2, str3, cVar2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009b -> B:25:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.lang.String r11, vf2.p r12, v13.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof vf2.u
            if (r0 == 0) goto L13
            r0 = r13
            vf2.u r0 = (vf2.u) r0
            int r1 = r0.f178034j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178034j = r1
            goto L18
        L13:
            vf2.u r0 = new vf2.u
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f178032h
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f178034j
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L39
            int r11 = r0.f178031g
            int r12 = r0.f178030f
            java.util.Collection r2 = r0.f178029e
            java.util.Collection r2 = (java.util.Collection) r2
            vf2.v r4 = r0.f178028d
            java.util.Iterator r5 = r0.f178027c
            java.util.Collection r6 = r0.f178026b
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r0.f178025a
            o13.r.b(r13)
            goto La0
        L39:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            r11 = 0
            return r11
        L40:
            o13.r.b(r13)
            java.util.List r12 = r12.e()
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = p13.y.r(r12, r2)
            r13.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r5 = r12
            r12 = r2
        L59:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto Lc5
            java.lang.Object r4 = r5.next()
            vf2.v r4 = (vf2.v) r4
            java.lang.Integer r6 = r4.getExerciseCategoryId()
            if (r6 == 0) goto Lbc
            java.lang.Integer r6 = r4.getExerciseNameId()
            if (r6 == 0) goto Lbc
            java.lang.Integer r6 = r4.getExerciseCategoryId()
            int r6 = r6.intValue()
            java.lang.Integer r7 = r4.getExerciseNameId()
            int r7 = r7.intValue()
            r0.f178025a = r11
            r8 = r13
            java.util.Collection r8 = (java.util.Collection) r8
            r0.f178026b = r8
            r0.f178027c = r5
            r0.f178028d = r4
            r0.f178029e = r8
            r0.f178030f = r12
            r0.f178031g = r2
            r0.f178034j = r3
            java.io.Serializable r6 = r10.d(r6, r7, r11, r0)
            if (r6 != r1) goto L9b
            return r1
        L9b:
            r7 = r11
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r2
        La0:
            o13.u r13 = (o13.u) r13
            if (r13 == 0) goto Lb5
            A r8 = r13.f128605a
            java.lang.String r8 = (java.lang.String) r8
            B r9 = r13.f128606b
            java.lang.String r9 = (java.lang.String) r9
            C r13 = r13.f128607c
            vf2.c r13 = (vf2.c) r13
            vf2.v r13 = vf2.v.a(r4, r8, r9, r13)
            r4 = r13
        Lb5:
            r4.n()
            r13 = r2
            r2 = r11
            r11 = r7
            goto Lc0
        Lbc:
            r4.n()
            r6 = r13
        Lc0:
            r13.add(r4)
            r13 = r6
            goto L59
        Lc5:
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.r.e(java.lang.String, vf2.p, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvf2/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
