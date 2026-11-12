package a91;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lc.u0;
import n70.k1;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.s0;
import o53.z;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.c1;
import r53.b2;
import r53.k2;
import r53.l2;
import r53.p2;
import r53.q2;
import z10.d1;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"La91/a;", "La91/x;", "La91/y;", "store", "La91/m;", "languageSelectionRepository", "Lc22/k;", "appConfigurationDelegate", "Ll80/b;", "gdiDelegate", "Lc22/o;", "appUtilDelegate", "Ln70/k1;", "getDashboardSectionVisibilityUseCase", "Lzr1/a;", "syncStatusUseCase", "Laz0/c;", "networkStateObserver", "Lo53/z;", "dispatcher", "<init>", "(La91/y;La91/m;Lc22/k;Ll80/b;Lc22/o;Ln70/k1;Lzr1/a;Laz0/c;Lo53/z;)V", "b", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2038p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f2040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c22.k f2041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l80.b f2042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c22.o f2043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f2044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f2045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2 f2046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f2047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f2048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f2049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f2050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f2052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f2053o;

    /* JADX INFO: renamed from: a91.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class C0019a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zr1.a f2055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f2056c;

        /* JADX INFO: renamed from: a91.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzr1/c;", "syncStatus", "", "<anonymous>", "(Lzr1/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$1$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0020a extends v13.i implements e23.p<zr1.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f2057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f2058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0020a(a aVar, t13.d<? super C0020a> dVar) {
                super(2, dVar);
                this.f2058b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0020a c0020a = new C0020a(this.f2058b, dVar);
                c0020a.f2057a = obj;
                return c0020a;
            }

            @Override // e23.p
            public final Object invoke(zr1.c cVar, t13.d<? super Unit> dVar) {
                return ((C0020a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                zr1.c cVar = (zr1.c) this.f2057a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                boolean z14 = cVar instanceof zr1.c.e;
                a aVar2 = this.f2058b;
                if (z14 && ((zr1.c.e) cVar).f206777a.f3776b.f132729a) {
                    if (!aVar2.f2043e.i()) {
                        aVar2.f2051m = true;
                    }
                } else if (cVar instanceof zr1.c.a) {
                    zr1.c.a aVar3 = (zr1.c.a) cVar;
                    if (aVar3.f206771a.f3776b.f132729a && !aVar3.f206772b) {
                        aVar2.a(d91.u.SYNC_UNSUCCESSFUL);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0019a(zr1.a aVar, a aVar2, t13.d<? super C0019a> dVar) {
            super(2, dVar);
            this.f2055b = aVar;
            this.f2056c = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0019a(this.f2055b, this.f2056c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0019a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2054a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = zr1.a.f206766a;
                this.f2055b.getClass();
                r53.b bVarF = r53.s.f(new zr1.b(null, null));
                C0020a c0020a = new C0020a(this.f2056c, null);
                this.f2054a = 1;
                if (r53.s.k(bVarF, c0020a, this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2059a;

        static {
            int[] iArr = new int[d91.u.values().length];
            try {
                iArr[d91.u.PUSH_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d91.u.HOME_SCREEN_LANGUAGE_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d91.u.DEVELOPER_MENU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d91.u.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d91.u.SYNC_SUCCESSFUL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d91.u.SYNC_UNSUCCESSFUL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d91.u.PULL_TO_REFRESH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d91.u.OTHER_LOCALE_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d91.u.UNSPECIFIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2059a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$refresh$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {112, 456, 119, 126, TsExtractor.TS_STREAM_TYPE_E_AC3, 147}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f2060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f2061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d91.u f2062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f2066g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d91.u f2068i;

        /* JADX INFO: renamed from: a91.a$d$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0021a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2069a;

            static {
                int[] iArr = new int[d91.p.values().length];
                try {
                    iArr[d91.p.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d91.p.GENERATE_MESSAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d91.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2069a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d91.u uVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f2068i = uVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = a.this.new d(this.f2068i, dVar);
            dVar2.f2066g = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ec A[Catch: all -> 0x0148, PHI: r4 r8 r9 r10 r13 r14
          0x00ec: PHI (r4v17 z53.a) = (r4v13 z53.a), (r4v21 z53.a) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00ec: PHI (r8v6 int) = (r8v3 int), (r8v8 int) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00ec: PHI (r9v5 d91.u) = (r9v2 d91.u), (r9v7 d91.u) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00ec: PHI (r10v1 int) = (r10v0 int), (r10v2 int) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00ec: PHI (r13v11 a91.a) = (r13v8 a91.a), (r13v13 a91.a) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x00ec: PHI (r14v4 java.lang.Object) = (r14v3 java.lang.Object), (r14v7 java.lang.Object) binds: [B:45:0x00e8, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0110 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x0112 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0114 A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0118  */
        /* JADX WARN: Code duplicated, block: B:58:0x0125  */
        /* JADX WARN: Code duplicated, block: B:61:0x0143  */
        /* JADX WARN: Code duplicated, block: B:66:0x014a A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0150 A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0163 A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0184  */
        /* JADX WARN: Code duplicated, block: B:73:0x0185 A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #0 {all -> 0x0148, blocks: (B:47:0x00ec, B:51:0x0114, B:59:0x0126, B:66:0x014a, B:67:0x014f, B:68:0x0150, B:70:0x0163, B:32:0x00bb, B:34:0x00c1, B:40:0x00cd, B:44:0x00d6, B:73:0x0185), top: B:86:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:81:0x019f  */
        /* JADX WARN: Code duplicated, block: B:87:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01ad, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r3) goto L83;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ec, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11, types: [a91.a, d91.s, d91.u, java.lang.Object, kotlin.jvm.internal.j] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL;
            z53.a aVar;
            a aVar2;
            d91.u uVar;
            int i14;
            z53.a aVar3;
            c2 c2Var;
            boolean z14;
            Object objZ0;
            d91.e eVar;
            int i15;
            d91.t tVarA;
            c2 c2Var2;
            ?? r14;
            Object obj2;
            b0 b0Var = (b0) this.f2066g;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f2065f;
            a aVar5 = a.this;
            int i17 = 0;
            switch (i16) {
                case 0:
                    o13.r.b(obj);
                    j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                    if (!((Boolean) aVar5.f2049k.f150540a.getValue()).booleanValue()) {
                        p2 p2Var = aVar5.f2052n;
                        d91.t.d dVar = d91.t.d.f58594b;
                        this.f2066g = null;
                        this.f2065f = 6;
                        p2Var.setValue(dVar);
                        break;
                    } else {
                        c80.q qVar = c80.q.MESSAGING_PLUS;
                        this.f2066g = b0Var;
                        this.f2065f = 1;
                        objL = j1Var.l(qVar, this);
                        if (objL != aVar4) {
                            if (((Boolean) objL).booleanValue() || !d1.h(q92.x.DI_CONNECT_AI, false)) {
                                p2 p2Var2 = aVar5.f2052n;
                                d91.t.d dVar2 = d91.t.d.f58594b;
                                this.f2066g = null;
                                this.f2065f = 6;
                                p2Var2.setValue(dVar2);
                                break;
                            } else {
                                aVar = aVar5.f2045g;
                                this.f2066g = b0Var;
                                this.f2060a = aVar;
                                this.f2061b = aVar5;
                                d91.u uVar2 = this.f2068i;
                                this.f2062c = uVar2;
                                this.f2063d = 0;
                                this.f2065f = 2;
                                if (aVar.c(this) != aVar4) {
                                    aVar2 = aVar5;
                                    uVar = uVar2;
                                    i14 = 0;
                                    try {
                                        try {
                                            if (a.g(aVar2, uVar)) {
                                                c2Var = aVar2.f2047i;
                                                if (c2Var != null) {
                                                    try {
                                                        c2Var.c(null);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        aVar3 = aVar;
                                                        obj2 = null;
                                                        aVar3.e(obj2);
                                                        throw th;
                                                    }
                                                }
                                                y yVar = aVar2.f2039a;
                                                if (uVar == d91.u.SYNC_SUCCESSFUL) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                this.f2066g = b0Var;
                                                this.f2060a = aVar;
                                                this.f2061b = aVar2;
                                                this.f2062c = uVar;
                                                this.f2063d = i14;
                                                this.f2064e = 0;
                                                this.f2065f = 3;
                                                objZ0 = yVar.Z0(z14, this);
                                                if (objZ0 == aVar4) {
                                                    eVar = (d91.e) objZ0;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Refreshing personalized messages; result = " + eVar);
                                                    i15 = C0021a.f2069a[eVar.f58523a.ordinal()];
                                                    if (i15 != 1) {
                                                        if (i15 == 2) {
                                                            int i18 = a.f2038p;
                                                            aVar2.getClass();
                                                            aVar2.f2047i = ge1.b.T(b0Var, null, null, new a91.d(aVar2, uVar, null), 3);
                                                        } else {
                                                            if (i15 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            c2Var2 = aVar2.f2046h;
                                                            if (c2Var2 != null) {
                                                                r14 = 0;
                                                                try {
                                                                    c2Var2.c(null);
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    z53.a aVar6 = aVar;
                                                                    obj2 = null;
                                                                    aVar3 = aVar6;
                                                                    aVar3.e(obj2);
                                                                    throw th;
                                                                }
                                                            } else {
                                                                r14 = 0;
                                                            }
                                                            p2 p2Var3 = aVar2.f2052n;
                                                            d91.t.b bVar = new d91.t.b(r14, 1, r14);
                                                            this.f2066g = r14;
                                                            this.f2060a = aVar;
                                                            this.f2061b = r14;
                                                            this.f2062c = r14;
                                                            this.f2063d = i14;
                                                            this.f2064e = i17;
                                                            this.f2065f = 5;
                                                            p2Var3.k(r14, bVar);
                                                            if (Unit.INSTANCE == aVar4) {
                                                            }
                                                        }
                                                        break;
                                                    } else {
                                                        d91.t.a aVar7 = d91.t.f58590a;
                                                        d91.c cVar = eVar.f58524b;
                                                        aVar7.getClass();
                                                        tVarA = d91.t.a.a(cVar);
                                                        this.f2066g = null;
                                                        this.f2060a = aVar;
                                                        this.f2061b = null;
                                                        this.f2062c = null;
                                                        this.f2063d = i14;
                                                        this.f2064e = i17;
                                                        this.f2065f = 4;
                                                        if (a.f(aVar2, tVarA, uVar, this) == aVar4) {
                                                        }
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    aVar3.e(null);
                                                    return Unit.INSTANCE;
                                                }
                                                break;
                                            } else {
                                                a2 a2Var = a2.DASHBOARD;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "Ignoring call to refresh");
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            aVar3.e(null);
                                            return Unit.INSTANCE;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = null;
                                            aVar3.e(obj2);
                                            throw th;
                                        }
                                        aVar3 = aVar;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        aVar3 = aVar;
                                        obj2 = null;
                                        aVar3.e(obj2);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    return aVar4;
                case 1:
                    o13.r.b(obj);
                    objL = obj;
                    if (((Boolean) objL).booleanValue()) {
                    }
                    p2 p2Var4 = aVar5.f2052n;
                    d91.t.d dVar3 = d91.t.d.f58594b;
                    this.f2066g = null;
                    this.f2065f = 6;
                    p2Var4.setValue(dVar3);
                    break;
                case 2:
                    int i19 = this.f2063d;
                    d91.u uVar3 = this.f2062c;
                    a aVar8 = this.f2061b;
                    z53.a aVar9 = this.f2060a;
                    o13.r.b(obj);
                    i14 = i19;
                    aVar = aVar9;
                    aVar2 = aVar8;
                    uVar = uVar3;
                    if (a.g(aVar2, uVar)) {
                        c2Var = aVar2.f2047i;
                        if (c2Var != null) {
                            c2Var.c(null);
                            break;
                        }
                        y yVar2 = aVar2.f2039a;
                        if (uVar == d91.u.SYNC_SUCCESSFUL) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f2066g = b0Var;
                        this.f2060a = aVar;
                        this.f2061b = aVar2;
                        this.f2062c = uVar;
                        this.f2063d = i14;
                        this.f2064e = 0;
                        this.f2065f = 3;
                        objZ0 = yVar2.Z0(z14, this);
                        if (objZ0 == aVar4) {
                            eVar = (d91.e) objZ0;
                            i2.f36769a.getClass();
                            i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Refreshing personalized messages; result = " + eVar);
                            i15 = C0021a.f2069a[eVar.f58523a.ordinal()];
                            if (i15 != 1) {
                                if (i15 == 2) {
                                    int i110 = a.f2038p;
                                    aVar2.getClass();
                                    aVar2.f2047i = ge1.b.T(b0Var, null, null, new a91.d(aVar2, uVar, null), 3);
                                } else {
                                    if (i15 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c2Var2 = aVar2.f2046h;
                                    if (c2Var2 != null) {
                                        r14 = 0;
                                        c2Var2.c(null);
                                    } else {
                                        r14 = 0;
                                    }
                                    p2 p2Var5 = aVar2.f2052n;
                                    d91.t.b bVar2 = new d91.t.b(r14, 1, r14);
                                    this.f2066g = r14;
                                    this.f2060a = aVar;
                                    this.f2061b = r14;
                                    this.f2062c = r14;
                                    this.f2063d = i14;
                                    this.f2064e = i17;
                                    this.f2065f = 5;
                                    p2Var5.k(r14, bVar2);
                                    if (Unit.INSTANCE == aVar4) {
                                    }
                                }
                                break;
                            } else {
                                d91.t.a aVar10 = d91.t.f58590a;
                                d91.c cVar2 = eVar.f58524b;
                                aVar10.getClass();
                                tVarA = d91.t.a.a(cVar2);
                                this.f2066g = null;
                                this.f2060a = aVar;
                                this.f2061b = null;
                                this.f2062c = null;
                                this.f2063d = i14;
                                this.f2064e = i17;
                                this.f2065f = 4;
                                if (a.f(aVar2, tVarA, uVar, this) == aVar4) {
                                }
                            }
                            Unit unit3 = Unit.INSTANCE;
                            aVar3.e(null);
                            return Unit.INSTANCE;
                        }
                        return aVar4;
                    }
                    a2 a2Var2 = a2.DASHBOARD;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "DefaultPersonalizedInsightsProvider", "Ignoring call to refresh");
                    aVar3 = aVar;
                    Unit unit4 = Unit.INSTANCE;
                    aVar3.e(null);
                    return Unit.INSTANCE;
                case 3:
                    i17 = this.f2064e;
                    int i24 = this.f2063d;
                    d91.u uVar4 = this.f2062c;
                    a aVar11 = this.f2061b;
                    z53.a aVar12 = this.f2060a;
                    try {
                        o13.r.b(obj);
                        i14 = i24;
                        aVar = aVar12;
                        aVar2 = aVar11;
                        uVar = uVar4;
                        objZ0 = obj;
                        eVar = (d91.e) objZ0;
                        i2.f36769a.getClass();
                        i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Refreshing personalized messages; result = " + eVar);
                        i15 = C0021a.f2069a[eVar.f58523a.ordinal()];
                        if (i15 != 1) {
                            if (i15 == 2) {
                                int i111 = a.f2038p;
                                aVar2.getClass();
                                aVar2.f2047i = ge1.b.T(b0Var, null, null, new a91.d(aVar2, uVar, null), 3);
                            } else {
                                if (i15 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2Var2 = aVar2.f2046h;
                                if (c2Var2 != null) {
                                    r14 = 0;
                                    c2Var2.c(null);
                                } else {
                                    r14 = 0;
                                }
                                p2 p2Var6 = aVar2.f2052n;
                                d91.t.b bVar3 = new d91.t.b(r14, 1, r14);
                                this.f2066g = r14;
                                this.f2060a = aVar;
                                this.f2061b = r14;
                                this.f2062c = r14;
                                this.f2063d = i14;
                                this.f2064e = i17;
                                this.f2065f = 5;
                                p2Var6.k(r14, bVar3);
                                if (Unit.INSTANCE == aVar4) {
                                    return aVar4;
                                }
                            }
                            aVar3 = aVar;
                            break;
                        } else {
                            d91.t.a aVar13 = d91.t.f58590a;
                            d91.c cVar3 = eVar.f58524b;
                            aVar13.getClass();
                            tVarA = d91.t.a.a(cVar3);
                            this.f2066g = null;
                            this.f2060a = aVar;
                            this.f2061b = null;
                            this.f2062c = null;
                            this.f2063d = i14;
                            this.f2064e = i17;
                            this.f2065f = 4;
                            if (a.f(aVar2, tVarA, uVar, this) == aVar4) {
                                return aVar4;
                            }
                            aVar3 = aVar;
                        }
                        Unit unit5 = Unit.INSTANCE;
                        aVar3.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = null;
                        aVar3 = aVar12;
                        aVar3.e(obj2);
                        throw th;
                    }
                case 4:
                case 5:
                    aVar3 = this.f2060a;
                    try {
                        o13.r.b(obj);
                        Unit unit6 = Unit.INSTANCE;
                        aVar3.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = null;
                        aVar3.e(obj2);
                        throw th;
                    }
                case 6:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f2070a;

        /* JADX INFO: renamed from: a91.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0022a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f2071a;

            /* JADX INFO: renamed from: a91.a$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$special$$inlined$map$1$2", f = "DefaultPersonalizedInsightsProvider.kt", l = {50}, m = "emit", v = 2)
            public static final class C0023a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f2072a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f2073b;

                public C0023a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f2072a = obj;
                    this.f2073b |= Integer.MIN_VALUE;
                    return C0022a.this.emit(null, this);
                }
            }

            public C0022a(r53.j jVar) {
                this.f2071a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x005b  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0023a c0023a;
                boolean z14;
                if (dVar instanceof C0023a) {
                    c0023a = (C0023a) dVar;
                    int i14 = c0023a.f2073b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0023a.f2073b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0023a = new C0023a(dVar);
                    }
                } else {
                    c0023a = new C0023a(dVar);
                }
                Object obj2 = c0023a.f2072a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0023a.f2073b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    zr1.c cVar = (zr1.c) obj;
                    if ((cVar instanceof zr1.c.b) || ((cVar instanceof zr1.c.e) && ((zr1.c.e) cVar).f206777a.f3776b.f132729a)) {
                        z14 = true;
                    } else {
                        if (cVar instanceof zr1.c.d) {
                            al2.a aVar2 = ((zr1.c.d) cVar).f206775a;
                            if (aVar2.f3760b.f132729a && aVar2.f3764f) {
                                z14 = true;
                            }
                        }
                        z14 = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    c0023a.f2073b = 1;
                    if (this.f2071a.emit(boolValueOf, c0023a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i iVar) {
            this.f2070a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f2070a.collect(new C0022a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$submitFeedback$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {388, 454, 394}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f2075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f2076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d91.f f2078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f2079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f2080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2082h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f2084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d91.f f2085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<d91.b> f2086l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f2087m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(String str, d91.f fVar, List<? extends d91.b> list, String str2, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f2084j = str;
            this.f2085k = fVar;
            this.f2086l = list;
            this.f2087m = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new f(this.f2084j, this.f2085k, this.f2086l, this.f2087m, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:42:0x00e6, B:24:0x0081, B:26:0x008d, B:28:0x009a, B:30:0x00aa, B:37:0x00bc, B:39:0x00c5, B:35:0x00b3), top: B:47:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:42:0x00e6, B:24:0x0081, B:26:0x008d, B:28:0x009a, B:30:0x00aa, B:37:0x00bc, B:39:0x00c5, B:35:0x00b3), top: B:47:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r6) goto L41;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            d91.f fVar;
            List<d91.b> list;
            String str2;
            z53.a aVar;
            int i14;
            d91.f fVar2;
            d91.t tVar;
            d91.f fVar3;
            i53.c cVarE;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f2082h;
            a aVar3 = a.this;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    y yVar = aVar3.f2039a;
                    this.f2082h = 1;
                    if (yVar.Q2(this.f2084j, this.f2085k, this.f2086l, this.f2087m, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i15 == 1) {
                    o13.r.b(obj);
                } else if (i15 == 2) {
                    i14 = this.f2081g;
                    String str3 = this.f2080f;
                    list = this.f2079e;
                    fVar = this.f2078d;
                    str = this.f2077c;
                    aVar3 = this.f2076b;
                    z53.a aVar4 = this.f2075a;
                    o13.r.b(obj);
                    str2 = str3;
                    aVar = aVar4;
                    fVar2 = fVar;
                    tVar = (d91.t) aVar3.f2052n.getValue();
                    if ((tVar instanceof d91.t.g) && p005kotlin.jvm.internal.s.g(((d91.t.g) tVar).f58597b.f58579a, str)) {
                        p2 p2Var = aVar3.f2052n;
                        d91.s sVar = ((d91.t.g) tVar).f58597b;
                        fVar2.getClass();
                        if (fVar2 != d91.f.f58525d || fVar2 == d91.f.f58526e) {
                            fVar3 = fVar2;
                        } else {
                            fVar3 = ((d91.t.g) tVar).f58597b.f58586h;
                        }
                        if (list != null) {
                            cVarE = i53.a.e(list);
                        } else {
                            cVarE = null;
                        }
                        d91.t.g gVar = new d91.t.g(d91.s.a(sVar, fVar2, fVar3, cVarE, str2, 1087));
                        this.f2075a = aVar;
                        this.f2076b = null;
                        this.f2077c = null;
                        this.f2078d = null;
                        this.f2079e = null;
                        this.f2080f = null;
                        this.f2081g = i14;
                        this.f2082h = 3;
                        p2Var.k(null, gVar);
                    }
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = this.f2075a;
                    o13.r.b(obj);
                }
                Unit unit = Unit.INSTANCE;
                aVar.e(null);
                return Unit.INSTANCE;
                z53.b bVar = aVar3.f2045g;
                this.f2075a = bVar;
                this.f2076b = aVar3;
                str = this.f2084j;
                this.f2077c = str;
                fVar = this.f2085k;
                this.f2078d = fVar;
                list = this.f2086l;
                this.f2079e = list;
                String str4 = this.f2087m;
                this.f2080f = str4;
                this.f2081g = 0;
                this.f2082h = 2;
                if (bVar.c(this) != aVar2) {
                    str2 = str4;
                    aVar = bVar;
                    i14 = 0;
                    fVar2 = fVar;
                    tVar = (d91.t) aVar3.f2052n.getValue();
                    if (tVar instanceof d91.t.g) {
                        p2 p2Var2 = aVar3.f2052n;
                        d91.s sVar2 = ((d91.t.g) tVar).f58597b;
                        fVar2.getClass();
                        if (fVar2 != d91.f.f58525d || fVar2 == d91.f.f58526e) {
                            fVar3 = fVar2;
                        } else {
                            fVar3 = ((d91.t.g) tVar).f58597b.f58586h;
                        }
                        if (list != null) {
                            cVarE = i53.a.e(list);
                        } else {
                            cVarE = null;
                        }
                        d91.t.g gVar2 = new d91.t.g(d91.s.a(sVar2, fVar2, fVar3, cVarE, str2, 1087));
                        this.f2075a = aVar;
                        this.f2076b = null;
                        this.f2077c = null;
                        this.f2078d = null;
                        this.f2079e = null;
                        this.f2080f = null;
                        this.f2081g = i14;
                        this.f2082h = 3;
                        p2Var2.k(null, gVar2);
                    }
                    Unit unit2 = Unit.INSTANCE;
                    aVar.e(null);
                    return Unit.INSTANCE;
                }
                return aVar2;
            } catch (Throwable th3) {
                aVar.e(null);
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$updateLanguage$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {454, 419, 422, 466, 430}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.b f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f2089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f2090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f2093f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Set<String> f2095h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f2096i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f2097j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Set<String> set, String str, boolean z14, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f2095h = set;
            this.f2096i = str;
            this.f2097j = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = a.this.new g(this.f2095h, this.f2096i, this.f2097j, dVar);
            gVar.f2093f = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009b  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[PHI: r13
          0x00b2: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:31:0x00af, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00be  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:49:0x0113  */
        /* JADX WARN: Code duplicated, block: B:51:0x0117  */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o53.b0] */
        /* JADX WARN: Type inference failed for: r0v10, types: [z53.a] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [z53.a] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z53.b bVar;
            a aVar;
            v2 v2Var;
            z53.b bVar2;
            z53.a aVar2;
            ?? r14 = (b0) this.f2093f;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f2092e;
            int i15 = 0;
            a aVar4 = a.this;
            try {
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        bVar = aVar4.f2045g;
                        this.f2093f = r14;
                        this.f2088a = bVar;
                        this.f2089b = aVar4;
                        this.f2091d = 0;
                        this.f2092e = 1;
                        if (bVar.c(this) != aVar3) {
                            aVar = aVar4;
                        }
                        return aVar3;
                    }
                    if (i14 == 1) {
                        aVar = (a) this.f2089b;
                        bVar = this.f2088a;
                        o13.r.b(obj);
                    } else {
                        if (i14 == 2) {
                            o13.r.b(obj);
                            if (this.f2097j) {
                                m mVar = aVar4.f2040b;
                                this.f2093f = r14;
                                this.f2092e = 3;
                                mVar.getClass();
                                obj = f0.J(mVar, new t(mVar, "system", null), this);
                                if (obj != aVar3) {
                                    v2Var = (v2) obj;
                                    if (!(v2Var instanceof v2.b)) {
                                        aVar4.a(d91.u.HOME_SCREEN_LANGUAGE_UPDATE);
                                    } else {
                                        if (!(v2Var instanceof v2.a)) {
                                            u0.r();
                                            return null;
                                        }
                                        a2 a2Var = a2.SUBSCRIPTIONS;
                                        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error setting selected language: ");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "DefaultPersonalizedInsightsProvider", strD);
                                        bVar2 = aVar4.f2045g;
                                        this.f2093f = null;
                                        this.f2088a = null;
                                        this.f2089b = bVar2;
                                        this.f2090c = aVar4;
                                        this.f2091d = 0;
                                        this.f2092e = 4;
                                        if (bVar2.c(this) != aVar3) {
                                            aVar2 = bVar2;
                                            p2 p2Var = aVar4.f2052n;
                                            d91.t.b bVar3 = new d91.t.b(null);
                                            this.f2093f = null;
                                            this.f2088a = null;
                                            this.f2089b = aVar2;
                                            this.f2090c = null;
                                            this.f2091d = i15;
                                            this.f2092e = 5;
                                            p2Var.k(null, bVar3);
                                            r14 = aVar2;
                                        }
                                    }
                                }
                                return aVar3;
                            }
                            aVar4.a(d91.u.HOME_SCREEN_LANGUAGE_UPDATE);
                            return Unit.INSTANCE;
                        }
                        if (i14 == 3) {
                            o13.r.b(obj);
                            v2Var = (v2) obj;
                            if (!(v2Var instanceof v2.b)) {
                                if (!(v2Var instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                a2 a2Var2 = a2.SUBSCRIPTIONS;
                                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error setting selected language: ");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "DefaultPersonalizedInsightsProvider", strD2);
                                bVar2 = aVar4.f2045g;
                                this.f2093f = null;
                                this.f2088a = null;
                                this.f2089b = bVar2;
                                this.f2090c = aVar4;
                                this.f2091d = 0;
                                this.f2092e = 4;
                                if (bVar2.c(this) != aVar3) {
                                    aVar2 = bVar2;
                                    p2 p2Var2 = aVar4.f2052n;
                                    d91.t.b bVar4 = new d91.t.b(null);
                                    this.f2093f = null;
                                    this.f2088a = null;
                                    this.f2089b = aVar2;
                                    this.f2090c = null;
                                    this.f2091d = i15;
                                    this.f2092e = 5;
                                    p2Var2.k(null, bVar4);
                                    r14 = aVar2;
                                }
                                return aVar3;
                            }
                            aVar4.a(d91.u.HOME_SCREEN_LANGUAGE_UPDATE);
                            return Unit.INSTANCE;
                        }
                        if (i14 == 4) {
                            i15 = this.f2091d;
                            aVar4 = this.f2090c;
                            z53.a aVar5 = (z53.a) this.f2089b;
                            o13.r.b(obj);
                            aVar2 = aVar5;
                            p2 p2Var3 = aVar4.f2052n;
                            d91.t.b bVar5 = new d91.t.b(null);
                            this.f2093f = null;
                            this.f2088a = null;
                            this.f2089b = aVar2;
                            this.f2090c = null;
                            this.f2091d = i15;
                            this.f2092e = 5;
                            p2Var3.k(null, bVar5);
                            r14 = aVar2;
                        } else {
                            if (i14 != 5) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z53.a aVar6 = (z53.a) this.f2089b;
                            o13.r.b(obj);
                            r14 = aVar6;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    r14.e(null);
                    return Unit.INSTANCE;
                    aVar.f2052n.k(null, new d91.t.e(null, 1, null));
                    Unit unit2 = Unit.INSTANCE;
                    bVar.e(null);
                    m mVar2 = aVar4.f2040b;
                    LinkedHashSet linkedHashSetI = c1.i(this.f2095h, this.f2096i);
                    this.f2093f = r14;
                    this.f2088a = null;
                    this.f2089b = null;
                    this.f2092e = 2;
                    if (mVar2.d(linkedHashSetI, this) != aVar3) {
                        if (this.f2097j) {
                            m mVar3 = aVar4.f2040b;
                            this.f2093f = r14;
                            this.f2092e = 3;
                            mVar3.getClass();
                            obj = f0.J(mVar3, new t(mVar3, "system", null), this);
                            if (obj != aVar3) {
                                v2Var = (v2) obj;
                                if (!(v2Var instanceof v2.b)) {
                                    aVar4.a(d91.u.HOME_SCREEN_LANGUAGE_UPDATE);
                                } else {
                                    if (!(v2Var instanceof v2.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    a2 a2Var3 = a2.SUBSCRIPTIONS;
                                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error setting selected language: ");
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var3, "DefaultPersonalizedInsightsProvider", strD3);
                                    bVar2 = aVar4.f2045g;
                                    this.f2093f = null;
                                    this.f2088a = null;
                                    this.f2089b = bVar2;
                                    this.f2090c = aVar4;
                                    this.f2091d = 0;
                                    this.f2092e = 4;
                                    if (bVar2.c(this) != aVar3) {
                                        aVar2 = bVar2;
                                        p2 p2Var4 = aVar4.f2052n;
                                        d91.t.b bVar6 = new d91.t.b(null);
                                        this.f2093f = null;
                                        this.f2088a = null;
                                        this.f2089b = aVar2;
                                        this.f2090c = null;
                                        this.f2091d = i15;
                                        this.f2092e = 5;
                                        p2Var4.k(null, bVar6);
                                        r14 = aVar2;
                                    }
                                }
                            }
                        } else {
                            aVar4.a(d91.u.HOME_SCREEN_LANGUAGE_UPDATE);
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar3;
                } catch (Throwable th3) {
                    bVar.e(null);
                    throw th3;
                }
            } catch (Throwable th4) {
                r14.e(null);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$viewedInsight$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {369, 454, 375}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f2098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f2099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2102e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f2104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f2104g = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new h(this.f2104g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [z53.a] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v6, types: [z53.a] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i14;
            z53.a aVar;
            d91.t tVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f2102e;
            String str = this.f2104g;
            a aVar3 = a.this;
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    y yVar = aVar3.f2039a;
                    this.f2102e = 1;
                    if (yVar.C2(str, this) != aVar2) {
                    }
                    r14 = aVar;
                    r14 = aVar;
                    return aVar2;
                }
                if (r14 == 1) {
                    o13.r.b(obj);
                } else if (r14 == 2) {
                    int i15 = this.f2101d;
                    str = this.f2100c;
                    aVar3 = this.f2099b;
                    z53.a aVar4 = this.f2098a;
                    o13.r.b(obj);
                    i14 = i15;
                    aVar = aVar4;
                    tVar = (d91.t) aVar3.f2052n.getValue();
                    r14 = aVar;
                    if ((tVar instanceof d91.t.g) && p005kotlin.jvm.internal.s.g(((d91.t.g) tVar).f58597b.f58579a, str)) {
                        p2 p2Var = aVar3.f2052n;
                        d91.t.g gVar = new d91.t.g(d91.s.a(((d91.t.g) tVar).f58597b, null, null, null, null, 2015));
                        this.f2098a = aVar;
                        this.f2099b = null;
                        this.f2100c = null;
                        this.f2101d = i14;
                        this.f2102e = 3;
                        p2Var.k(null, gVar);
                    }
                } else {
                    if (r14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z53.a aVar5 = this.f2098a;
                    o13.r.b(obj);
                    r14 = aVar5;
                }
                r14 = aVar;
                r14 = aVar;
                r14 = aVar;
                Unit unit = Unit.INSTANCE;
                r14.e(null);
                return Unit.INSTANCE;
                z53.b bVar = aVar3.f2045g;
                this.f2098a = bVar;
                this.f2099b = aVar3;
                this.f2100c = str;
                i14 = 0;
                this.f2101d = 0;
                this.f2102e = 2;
                Object objC = bVar.c(this);
                aVar = bVar;
                if (objC != aVar2) {
                    tVar = (d91.t) aVar3.f2052n.getValue();
                    r14 = aVar;
                    if (tVar instanceof d91.t.g) {
                        p2 p2Var2 = aVar3.f2052n;
                        d91.t.g gVar2 = new d91.t.g(d91.s.a(((d91.t.g) tVar).f58597b, null, null, null, null, 2015));
                        this.f2098a = aVar;
                        this.f2099b = null;
                        this.f2100c = null;
                        this.f2101d = i14;
                        this.f2102e = 3;
                        p2Var2.k(null, gVar2);
                    }
                    r14 = aVar;
                    r14 = aVar;
                    r14 = aVar;
                    Unit unit2 = Unit.INSTANCE;
                    r14.e(null);
                    return Unit.INSTANCE;
                }
                r14 = aVar;
                r14 = aVar;
                return aVar2;
            } catch (Throwable th3) {
                r14.e(null);
                throw th3;
            }
        }
    }

    static {
        new b(null);
    }

    public a(y yVar, m mVar, c22.k kVar, l80.b bVar, c22.o oVar, k1 k1Var, zr1.a aVar, az0.c cVar, z zVar) {
        yVar.getClass();
        mVar.getClass();
        kVar.getClass();
        bVar.getClass();
        oVar.getClass();
        k1Var.getClass();
        aVar.getClass();
        cVar.getClass();
        zVar.getClass();
        this.f2039a = yVar;
        this.f2040b = mVar;
        this.f2041c = kVar;
        this.f2042d = bVar;
        this.f2043e = oVar;
        this.f2044f = zVar;
        this.f2045g = z53.c.a();
        e eVar = new e(r53.s.f(new zr1.b(null, null)));
        u53.d dVarA = c0.a(zVar);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        Boolean bool = Boolean.FALSE;
        this.f2048j = r53.s.K(eVar, dVarA, l2Var, bool);
        this.f2049k = r53.s.K(k1Var.a(o70.f.PERSONALIZED_INSIGHTS), c0.a(zVar), l2Var, bool);
        this.f2050l = r53.s.K(cVar.a(), c0.a(zVar), l2Var, null);
        p2 p2VarA = q2.a(d91.t.d.f58594b);
        this.f2052n = p2VarA;
        this.f2053o = r53.s.d(p2VarA);
        ge1.b.T(c0.a(zVar), null, null, new C0019a(aVar, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(a aVar, d91.t tVar, d91.u uVar, v13.c cVar) {
        a91.b bVar;
        c2 c2Var;
        p2 p2Var = aVar.f2052n;
        if (cVar instanceof a91.b) {
            bVar = (a91.b) cVar;
            int i14 = bVar.f2108d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f2108d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new a91.b(aVar, cVar);
            }
        } else {
            bVar = new a91.b(aVar, cVar);
        }
        Object obj = bVar.f2106b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f2108d;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i15 == 2) {
                tVar = bVar.f2105a;
                o13.r.b(obj);
                bVar.f2105a = null;
                bVar.f2108d = 3;
                p2Var.setValue(tVar);
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (tVar instanceof d91.t.e) {
            d91.t.e eVar = (d91.t.e) tVar;
            if (eVar.f58595b != null) {
                c2Var = aVar.f2046h;
                if (c2Var != null) {
                    c2Var.c(null);
                }
            } else if (uVar == d91.u.TIMEOUT) {
                d91.t.b bVar2 = new d91.t.b(null, 1, null);
                bVar.f2105a = null;
                bVar.f2108d = 1;
                p2Var.k(null, bVar2);
            } else {
                c2 c2Var2 = aVar.f2046h;
                if (c2Var2 == null || c2Var2.e()) {
                    a91.c cVar2 = new a91.c(aVar, null);
                    bVar.f2105a = eVar;
                    bVar.f2108d = 2;
                    if (c0.e(cVar2, bVar) != aVar2) {
                    }
                }
            }
            bVar.f2105a = null;
            bVar.f2108d = 3;
            p2Var.setValue(tVar);
        } else {
            c2Var = aVar.f2046h;
            if (c2Var != null) {
                c2Var.c(null);
            }
            bVar.f2105a = null;
            bVar.f2108d = 3;
            p2Var.setValue(tVar);
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00be A[RETURN] */
    public static final boolean g(a aVar, d91.u uVar) {
        b2 b2Var = aVar.f2050l;
        if (aVar.f2052n.getValue() instanceof d91.t.h) {
            a2 a2Var = a2.DASHBOARD;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "Not refreshing because we are showing the update language prompt");
            return false;
        }
        if (b2Var.f150540a.getValue() != null && b2Var.f150540a.getValue() != az0.c.a.Available) {
            a2 a2Var2 = a2.DASHBOARD;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DefaultPersonalizedInsightsProvider", "Not refreshing because we do not have network access");
            return false;
        }
        c2 c2Var = aVar.f2047i;
        boolean z14 = c2Var != null && c2Var.isActive();
        boolean zI = aVar.f2043e.i();
        boolean z15 = !zI;
        switch (c.f2059a[uVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i2.f36769a.getClass();
                i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Always refreshing because source is " + uVar);
                return true;
            case 5:
            case 6:
                boolean z16 = aVar.f2051m;
                aVar.f2051m = false;
                i2.f36769a.getClass();
                i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Choosing whether to refresh after " + uVar + "; isForeground = " + z15 + ", foregroundSyncStarted = " + z16);
                if (!zI || z16) {
                    return true;
                }
                return false;
            case 7:
            case 8:
            case 9:
                i2.f36769a.getClass();
                i2.a.b(a2.DASHBOARD, "DefaultPersonalizedInsightsProvider", "Choosing whether to refresh after " + uVar + "; isGenerating = " + z14 + ", isForeground = " + z15);
                if (z14 || zI) {
                    return false;
                }
                return true;
            default:
                u0.r();
                return false;
        }
    }

    @Override // a91.x
    public final void a(d91.u uVar) {
        uVar.getClass();
        ge1.b.T(c0.a(this.f2044f), null, null, new d(uVar, null), 3);
    }

    @Override // a91.x
    public final void b(String str, d91.f fVar, List<? extends d91.b> list, String str2) {
        str.getClass();
        fVar.getClass();
        ge1.b.T(c0.a(this.f2044f), null, null, new f(str, fVar, list, str2, null), 3);
    }

    @Override // a91.x
    public final void c(String str, Set<String> set, boolean z14) {
        str.getClass();
        set.getClass();
        ge1.b.T(c0.a(this.f2044f), null, null, new g(set, str, z14, null), 3);
    }

    @Override // a91.x
    public final void d(String str) {
        str.getClass();
        ge1.b.T(c0.a(this.f2044f), null, null, new h(str, null), 3);
    }

    @Override // a91.x
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b2 getF2053o() {
        return this.f2053o;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"La91/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_DEVICE_CONNECTION_TIME", "KEY_DEVICE_SYNC_TIME", "KEY_RETRY_TIME", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(y yVar, m mVar, c22.k kVar, l80.b bVar, c22.o oVar, k1 k1Var, zr1.a aVar, az0.c cVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z zVar2;
        if ((i14 & 256) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(yVar, mVar, kVar, bVar, oVar, k1Var, aVar, cVar, zVar2);
    }
}
