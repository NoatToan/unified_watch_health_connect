package androidx.room;

import java.util.ArrayList;
import java.util.Set;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {239, 239, 243}, m = "invokeSuspend")
public final class z0 extends v13.i implements e23.p<r53.j<? super Set<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f11004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f11005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f11007f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {239}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f11009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f11009b = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f11009b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11008a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f11008a = 1;
                if (this.f11009b.f(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<int[]> f11010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.j<Set<String>> f11012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f11013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int[] f11014e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {247, 256}, m = "emit")
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f11015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f11016b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b<T> f11017c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f11018d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, t13.d<? super a> dVar) {
                super(dVar);
                this.f11017c = bVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f11016b = obj;
                this.f11018d |= Integer.MIN_VALUE;
                return this.f11017c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(p005kotlin.jvm.internal.r0<int[]> r0Var, boolean z14, r53.j<? super Set<String>> jVar, String[] strArr, int[] iArr) {
            this.f11010a = r0Var;
            this.f11011b = z14;
            this.f11012c = jVar;
            this.f11013d = strArr;
            this.f11014e = iArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        
            r14 = r14;
            r14 = r14;
            r14 = r14;
            return r1;
         */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(int[] iArr, t13.d<? super Unit> dVar) {
            a aVar;
            Object obj;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f11018d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f11018d = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj2 = aVar.f11016b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f11018d;
            p005kotlin.jvm.internal.r0<int[]> r0Var = this.f11010a;
            if (i15 == 0) {
                o13.r.b(obj2);
                int[] iArr2 = r0Var.f105810a;
                String[] strArr = this.f11013d;
                r53.j<Set<String>> jVar = this.f11012c;
                if (iArr2 != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = strArr.length;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        String str = strArr[i16];
                        int i18 = i17 + 1;
                        int[] iArr3 = r0Var.f105810a;
                        if (iArr3 == null) {
                            vb.h.z("Required value was null.");
                            return null;
                        }
                        int i19 = this.f11014e[i17];
                        if (iArr3[i19] != iArr[i19]) {
                            arrayList.add(str);
                        }
                        i16++;
                        i17 = i18;
                    }
                    obj = iArr;
                    if (!arrayList.isEmpty()) {
                        Set<String> setG1 = p13.h0.g1(arrayList);
                        aVar.f11015a = iArr;
                        aVar.f11018d = 2;
                    }
                } else if (this.f11011b) {
                    Set<String> setM0 = p13.u.m0(strArr);
                    aVar.f11015a = iArr;
                    aVar.f11018d = 1;
                }
            } else {
                if (i15 != 1 && i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = (T) aVar.f11015a;
                o13.r.b(obj2);
                obj = obj3;
            }
            obj = iArr;
            obj = iArr;
            obj = iArr;
            obj = iArr;
            r0Var.f105810a = (T) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x0 x0Var, int[] iArr, boolean z14, String[] strArr, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f11004c = x0Var;
        this.f11005d = iArr;
        this.f11006e = z14;
        this.f11007f = strArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z0 z0Var = new z0(this.f11004c, this.f11005d, this.f11006e, this.f11007f, dVar);
        z0Var.f11003b = obj;
        return z0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Set<? extends String>> jVar, t13.d<? super Unit> dVar) {
        return ((z0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[PHI: r1
      0x0061: PHI (r1v5 r53.j) = (r1v3 r53.j), (r1v4 r53.j), (r1v11 r53.j) binds: [B:16:0x003f, B:21:0x005e, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r1.a(r8, r14) == r0) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar;
        Object objZ;
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11002a;
        int[] iArr = this.f11005d;
        x0 x0Var = this.f11004c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                jVar = (r53.j) this.f11003b;
                if (x0Var.f10982h.a(iArr)) {
                    b0 b0Var = x0Var.f10975a;
                    this.f11003b = jVar;
                    this.f11002a = 1;
                    objZ = gl1.d.z(b0Var, false, this);
                    if (objZ != aVar2) {
                        aVar = new a(x0Var, null);
                        this.f11003b = jVar;
                        this.f11002a = 2;
                        if (ge1.b.e0((t13.g) objZ, aVar, this) != aVar2) {
                            r53.j jVar2 = jVar;
                            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                            u uVar = x0Var.f10983i;
                            b bVar = new b(r0Var, this.f11006e, jVar2, this.f11007f, this.f11005d);
                            this.f11003b = null;
                            this.f11002a = 3;
                        }
                    }
                } else {
                    r53.j jVar3 = jVar;
                    p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                    u uVar2 = x0Var.f10983i;
                    b bVar2 = new b(r0Var2, this.f11006e, jVar3, this.f11007f, this.f11005d);
                    this.f11003b = null;
                    this.f11002a = 3;
                }
                return aVar2;
            }
            if (i14 == 1) {
                jVar = (r53.j) this.f11003b;
                o13.r.b(obj);
                objZ = obj;
                aVar = new a(x0Var, null);
                this.f11003b = jVar;
                this.f11002a = 2;
                if (ge1.b.e0((t13.g) objZ, aVar, this) != aVar2) {
                    r53.j jVar4 = jVar;
                    p005kotlin.jvm.internal.r0 r0Var3 = new p005kotlin.jvm.internal.r0();
                    u uVar3 = x0Var.f10983i;
                    b bVar3 = new b(r0Var3, this.f11006e, jVar4, this.f11007f, this.f11005d);
                    this.f11003b = null;
                    this.f11002a = 3;
                }
                return aVar2;
            }
            if (i14 == 2) {
                jVar = (r53.j) this.f11003b;
                o13.r.b(obj);
                r53.j jVar5 = jVar;
                p005kotlin.jvm.internal.r0 r0Var4 = new p005kotlin.jvm.internal.r0();
                u uVar4 = x0Var.f10983i;
                b bVar4 = new b(r0Var4, this.f11006e, jVar5, this.f11007f, this.f11005d);
                this.f11003b = null;
                this.f11002a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            x0Var.f10982h.b(iArr);
            throw th3;
        }
    }
}
