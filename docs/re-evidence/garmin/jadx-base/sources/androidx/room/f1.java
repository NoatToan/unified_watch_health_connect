package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/u0;", "connection", "", "<anonymous>", "(Landroidx/room/u0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 314}, m = "invokeSuspend")
public final class f1 extends v13.i implements e23.p<u0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReentrantLock f10828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f10831d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/t0;", "", "<anonymous>", "(Landroidx/room/t0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<t0<Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s.a[] f10832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x0 f10833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u0 f10834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ s.a[] f10839h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x0 f10840i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ u0 f10841j;

        /* JADX INFO: renamed from: androidx.room.f1$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0151a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10842a;

            static {
                int[] iArr = new int[s.a.values().length];
                try {
                    iArr[s.a.NO_OP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.a.ADD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.a.REMOVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10842a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.a[] aVarArr, x0 x0Var, u0 u0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f10839h = aVarArr;
            this.f10840i = x0Var;
            this.f10841j = u0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f10839h, this.f10840i, this.f10841j, dVar);
        }

        @Override // e23.p
        public final Object invoke(t0<Unit> t0Var, t13.d<? super Unit> dVar) {
            return ((a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0033  */
        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:27:0x0078). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r11.f10838g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto Lc
                if (r1 != r2) goto L1c
            Lc:
                int r1 = r11.f10837f
                int r4 = r11.f10836e
                int r5 = r11.f10835d
                androidx.room.u0 r6 = r11.f10834c
                androidx.room.x0 r7 = r11.f10833b
                androidx.room.s$a[] r8 = r11.f10832a
                o13.r.b(r12)
                goto L5c
            L1c:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r12)
            L21:
                r12 = 0
                return r12
            L23:
                o13.r.b(r12)
                androidx.room.s$a[] r12 = r11.f10839h
                int r1 = r12.length
                r4 = 0
                androidx.room.x0 r5 = r11.f10840i
                androidx.room.u0 r6 = r11.f10841j
                r8 = r12
                r12 = r4
                r7 = r5
            L31:
                if (r4 >= r1) goto L7a
                r5 = r8[r4]
                int r9 = r12 + 1
                int[] r10 = androidx.room.f1.a.C0151a.f10842a
                int r5 = r5.ordinal()
                r5 = r10[r5]
                if (r5 == r3) goto L77
                if (r5 == r2) goto L62
                r10 = 3
                if (r5 != r10) goto L5e
                r11.f10832a = r8
                r11.f10833b = r7
                r11.f10834c = r6
                r11.f10835d = r9
                r11.f10836e = r4
                r11.f10837f = r1
                r11.f10838g = r2
                java.lang.Object r12 = androidx.room.x0.d(r7, r6, r12, r11)
                if (r12 != r0) goto L5b
                goto L76
            L5b:
                r5 = r9
            L5c:
                r12 = r5
                goto L78
            L5e:
                lc.u0.r()
                goto L21
            L62:
                r11.f10832a = r8
                r11.f10833b = r7
                r11.f10834c = r6
                r11.f10835d = r9
                r11.f10836e = r4
                r11.f10837f = r1
                r11.f10838g = r3
                java.lang.Object r12 = androidx.room.x0.c(r7, r6, r12, r11)
                if (r12 != r0) goto L5b
            L76:
                return r0
            L77:
                r12 = r9
            L78:
                int r4 = r4 + r3
                goto L31
            L7a:
                kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.f1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(x0 x0Var, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f10831d = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f10831d, dVar);
        f1Var.f10830c = obj;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(u0 u0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u0 u0Var;
        Object objD;
        s sVar;
        ReentrantLock reentrantLock;
        s.a[] aVarArr;
        s.a aVar;
        s sVar2;
        ReentrantLock reentrantLock2;
        boolean z14;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f10829b;
        boolean z15 = false;
        boolean z16 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            u0Var = (u0) this.f10830c;
            this.f10830c = u0Var;
            this.f10829b = 1;
            objD = u0Var.d(this);
            if (objD != aVar2) {
            }
            return aVar2;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reentrantLock2 = this.f10828a;
            sVar2 = (s) this.f10830c;
            try {
                o13.r.b(obj);
                reentrantLock = reentrantLock2;
                sVar = sVar2;
                sVar.f10950f = false;
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                z14 = false;
                try {
                    sVar2.f10950f = z14;
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        u0Var = (u0) this.f10830c;
        o13.r.b(obj);
        objD = obj;
        if (((Boolean) objD).booleanValue()) {
            return Unit.INSTANCE;
        }
        x0 x0Var = this.f10831d;
        sVar = x0Var.f10982h;
        reentrantLock = sVar.f10949e;
        reentrantLock.lock();
        try {
            sVar.f10950f = true;
            ReentrantLock reentrantLock3 = sVar.f10945a;
            reentrantLock3.lock();
            try {
                if (sVar.f10948d) {
                    sVar.f10948d = false;
                    int length = sVar.f10946b.length;
                    aVarArr = new s.a[length];
                    int i15 = 0;
                    boolean z17 = false;
                    while (i15 < length) {
                        boolean z18 = sVar.f10946b[i15] > 0 ? z16 : z15;
                        boolean[] zArr = sVar.f10947c;
                        if (z18 != zArr[i15]) {
                            zArr[i15] = z18;
                            aVar = z18 ? s.a.ADD : s.a.REMOVE;
                            z17 = true;
                        } else {
                            aVar = s.a.NO_OP;
                        }
                        aVarArr[i15] = aVar;
                        i15++;
                        z15 = false;
                        z16 = true;
                    }
                    if (!z17) {
                        aVarArr = null;
                    }
                } else {
                    aVarArr = null;
                }
                reentrantLock3.unlock();
                if (aVarArr != null) {
                    try {
                        if (aVarArr.length != 0) {
                            u0.a aVar3 = u0.a.IMMEDIATE;
                            a aVar4 = new a(aVarArr, x0Var, u0Var, null);
                            this.f10830c = sVar;
                            this.f10828a = reentrantLock;
                            this.f10829b = 2;
                            if (u0Var.b(aVar3, aVar4, this) != aVar2) {
                                sVar2 = sVar;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                sVar = sVar2;
                            }
                            return aVar2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sVar2 = sVar;
                        reentrantLock2 = reentrantLock;
                        z14 = false;
                        sVar2.f10950f = z14;
                        throw th;
                    }
                }
                sVar.f10950f = false;
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                reentrantLock3.unlock();
                throw th6;
            }
        } catch (Throwable th7) {
            th = th7;
            reentrantLock.unlock();
            throw th;
        }
    }
}
