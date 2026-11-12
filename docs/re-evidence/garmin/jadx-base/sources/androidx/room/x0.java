package androidx.room;

import com.google.firebase.perf.FirebasePerformance;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/room/x0;", "", "Landroidx/room/b0;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Landroidx/room/b0;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLe23/l;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f10973l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f10974m = {"INSERT", "UPDATE", FirebasePerformance.HttpMethod.DELETE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f10976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Set<String>> f10977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<Set<Integer>, Unit> f10979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f10981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f10982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f10983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f10984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e23.a<Boolean> f10985k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f10988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f10988c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x0.this.new b(this.f10988c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10986a;
            e23.a<Unit> aVar2 = this.f10988c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    x0 x0Var = x0.this;
                    this.f10986a = 1;
                    obj = x0.b(x0Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                aVar2.invoke();
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                aVar2.invoke();
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(b0 b0Var, Map<String, String> map, Map<String, ? extends Set<String>> map2, String[] strArr, boolean z14, e23.l<? super Set<Integer>, Unit> lVar) {
        String lowerCase;
        b0Var.getClass();
        map.getClass();
        map2.getClass();
        strArr.getClass();
        lVar.getClass();
        this.f10975a = b0Var;
        this.f10976b = map;
        this.f10977c = map2;
        this.f10978d = z14;
        this.f10979e = lVar;
        this.f10984j = new AtomicBoolean(false);
        this.f10985k = new ak0.t(8);
        this.f10980f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i14 = 0; i14 < length; i14++) {
            String str = strArr[i14];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f10980f.put(lowerCase2, Integer.valueOf(i14));
            String str2 = this.f10976b.get(strArr[i14]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i14] = lowerCase2;
        }
        this.f10981g = strArr2;
        for (Map.Entry<String, String> entry : this.f10976b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f10980f.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.f10980f;
                linkedHashMap.put(lowerCase4, p13.u0.c(lowerCase3, linkedHashMap));
            }
        }
        this.f10982h = new s(this.f10981g.length);
        this.f10983i = new u(this.f10981g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(x0 x0Var, w wVar, v13.c cVar) {
        y0 y0Var;
        x0Var.getClass();
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f11000d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f11000d = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(x0Var, cVar);
            }
        } else {
            y0Var = new y0(x0Var, cVar);
        }
        Object objC = y0Var.f10998b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var.f11000d;
        if (i15 == 0) {
            o13.r.b(objC);
            w0 w0Var = new w0(0);
            y0Var.f10997a = wVar;
            y0Var.f11000d = 1;
            objC = wVar.c(w0Var, "SELECT * FROM room_table_modification_log WHERE invalidated = 1", y0Var);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) y0Var.f10997a;
            o13.r.b(objC);
            return set;
        }
        wVar = (w) y0Var.f10997a;
        o13.r.b(objC);
        Set set2 = (Set) objC;
        if (!set2.isEmpty()) {
            y0Var.f10997a = set2;
            y0Var.f11000d = 2;
            if (v0.a(wVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", y0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(x0 x0Var, v13.c cVar) throws Throwable {
        a1 a1Var;
        id.a aVar;
        Object value;
        int[] iArr;
        b0 b0Var = x0Var.f10975a;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f10721d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f10721d = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(x0Var, cVar);
            }
        } else {
            a1Var = new a1(x0Var, cVar);
        }
        Object obj = a1Var.f10719b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f10721d;
        if (i15 == 0) {
            o13.r.b(obj);
            id.a closeBarrier = b0Var.getCloseBarrier();
            if (!closeBarrier.a()) {
                return p13.l0.f134950a;
            }
            try {
                if (!x0Var.f10984j.compareAndSet(true, false)) {
                    p13.l0 l0Var = p13.l0.f134950a;
                    closeBarrier.b();
                    return l0Var;
                }
                if (!x0Var.f10985k.invoke().booleanValue()) {
                    p13.l0 l0Var2 = p13.l0.f134950a;
                    closeBarrier.b();
                    return l0Var2;
                }
                b1 b1Var = new b1(x0Var, null);
                a1Var.f10718a = closeBarrier;
                a1Var.f10721d = 1;
                Object objUseConnection = b0Var.useConnection(false, b1Var, a1Var);
                if (objUseConnection == aVar2) {
                    return aVar2;
                }
                aVar = closeBarrier;
                obj = objUseConnection;
            } catch (Throwable th3) {
                th = th3;
                aVar = closeBarrier;
                aVar.b();
                throw th;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = a1Var.f10718a;
            try {
                o13.r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                aVar.b();
                throw th;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            u uVar = x0Var.f10983i;
            uVar.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                p2 p2Var = uVar.f10962a;
                do {
                    value = p2Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i16 = 0; i16 < length; i16++) {
                        iArr[i16] = set.contains(Integer.valueOf(i16)) ? iArr2[i16] + 1 : iArr2[i16];
                    }
                } while (!p2Var.b(value, iArr));
            }
            x0Var.f10979e.invoke(set);
        }
        aVar.b();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (androidx.room.v0.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if (androidx.room.v0.a(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00dc -> B:28:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(x0 x0Var, u0 u0Var, int i14, v13.c cVar) {
        c1 c1Var;
        w wVar;
        int length;
        String[] strArr;
        int i15;
        int i16;
        String str;
        String str2;
        boolean z14;
        w wVar2 = u0Var;
        int i17 = i14;
        x0Var.getClass();
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i18 = c1Var.f10811i;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c1Var.f10811i = i18 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(x0Var, cVar);
            }
        } else {
            c1Var = new c1(x0Var, cVar);
        }
        Object obj = c1Var.f10809g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = c1Var.f10811i;
        boolean z15 = true;
        if (i19 != 0) {
            if (i19 == 1) {
                int i24 = c1Var.f10806d;
                w wVar3 = c1Var.f10803a;
                o13.r.b(obj);
                i17 = i24;
                wVar2 = wVar3;
            } else {
                if (i19 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                length = c1Var.f10808f;
                i16 = c1Var.f10807e;
                i15 = c1Var.f10806d;
                strArr = c1Var.f10805c;
                str = c1Var.f10804b;
                wVar = c1Var.f10803a;
                o13.r.b(obj);
                z14 = true;
            }
            i16++;
            z15 = z14;
            if (i16 < length) {
                return Unit.INSTANCE;
            }
            String str3 = strArr[i16];
            if (x0Var.f10978d) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            f10973l.getClass();
            z14 = z15;
            StringBuilder sbI = p6.b.i("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            sn.a.t(sbI, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strQ = am.j.q(sbI, i15, " AND invalidated = 0; END");
            c1Var.f10803a = wVar;
            c1Var.f10804b = str;
            c1Var.f10805c = strArr;
            c1Var.f10806d = i15;
            c1Var.f10807e = i16;
            c1Var.f10808f = length;
            c1Var.f10811i = 2;
        } else {
            o13.r.b(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i17 + ", 0)";
            c1Var.f10803a = wVar2;
            c1Var.f10806d = i17;
            c1Var.f10811i = 1;
        }
        String str5 = x0Var.f10981g[i17];
        String[] strArr2 = f10974m;
        wVar = wVar2;
        length = strArr2.length;
        strArr = strArr2;
        i15 = i17;
        i16 = 0;
        str = str5;
        if (i16 < length) {
            return Unit.INSTANCE;
        }
        String str6 = strArr[i16];
        if (x0Var.f10978d) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        f10973l.getClass();
        z14 = z15;
        StringBuilder sbI2 = p6.b.i("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str6, "` AFTER ");
        sn.a.t(sbI2, str6, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String strQ2 = am.j.q(sbI2, i15, " AND invalidated = 0; END");
        c1Var.f10803a = wVar;
        c1Var.f10804b = str;
        c1Var.f10805c = strArr;
        c1Var.f10806d = i15;
        c1Var.f10807e = i16;
        c1Var.f10808f = length;
        c1Var.f10811i = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:19:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(androidx.room.x0 r8, androidx.room.u0 r9, int r10, v13.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof androidx.room.d1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.room.d1 r0 = (androidx.room.d1) r0
            int r1 = r0.f10822h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f10822h = r1
            goto L1b
        L16:
            androidx.room.d1 r0 = new androidx.room.d1
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f10820f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f10822h
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.f10819e
            int r9 = r0.f10818d
            java.lang.String[] r10 = r0.f10817c
            java.lang.String r2 = r0.f10816b
            androidx.room.w r4 = r0.f10815a
            o13.r.b(r11)
            r11 = r10
            r10 = r4
            goto L88
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r8)
            r8 = 0
            return r8
        L3d:
            o13.r.b(r11)
            java.lang.String[] r8 = r8.f10981g
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.x0.f10974m
            int r11 = r10.length
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4e:
            if (r9 >= r8) goto L8a
            r4 = r11[r9]
            androidx.room.x0$a r5 = androidx.room.x0.f10973l
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = o2.c.c(r6, r5, r4)
            r0.f10815a = r10
            r0.f10816b = r2
            r0.f10817c = r11
            r0.f10818d = r9
            r0.f10819e = r8
            r0.f10822h = r3
            java.lang.Object r4 = androidx.room.v0.a(r10, r4, r0)
            if (r4 != r1) goto L88
            return r1
        L88:
            int r9 = r9 + r3
            goto L4e
        L8a:
            kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.d(androidx.room.x0, androidx.room.u0, int, v13.c):java.lang.Object");
    }

    public final void e(e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.f10984j.compareAndSet(false, true)) {
            aVar.invoke();
            ge1.b.T(this.f10975a.getCoroutineScope(), new o53.a0("Room Invalidation Tracker Refresh"), null, new b(aVar2, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) throws Throwable {
        e1 e1Var;
        id.a aVar;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i14 = e1Var.f10826d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e1Var.f10826d = i14 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, cVar);
            }
        } else {
            e1Var = new e1(this, cVar);
        }
        Object obj = e1Var.f10824b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = e1Var.f10826d;
        if (i15 == 0) {
            o13.r.b(obj);
            b0 b0Var = this.f10975a;
            id.a closeBarrier = b0Var.getCloseBarrier();
            if (closeBarrier.a()) {
                try {
                    f1 f1Var = new f1(this, null);
                    e1Var.f10823a = closeBarrier;
                    e1Var.f10826d = 1;
                    if (b0Var.useConnection(false, f1Var, e1Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = closeBarrier;
                    aVar.b();
                } catch (Throwable th3) {
                    th = th3;
                    aVar = closeBarrier;
                    aVar.b();
                    throw th;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = e1Var.f10823a;
            try {
                o13.r.b(obj);
                aVar.b();
            } catch (Throwable th4) {
                th = th4;
                aVar.b();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final o13.p<String[], int[]> g(String[] strArr) {
        strArr.getClass();
        q13.g gVar = new q13.g();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set<String> set = this.f10977c.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr2 = (String[]) p13.a1.a(gVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            String str2 = strArr2[i14];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f10980f.get(lowerCase2);
            if (num == null) {
                vb.h.s("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i14] = num.intValue();
        }
        return new o13.p<>(strArr2, iArr);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/room/x0$a;", "", "<init>", "()V", "", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
