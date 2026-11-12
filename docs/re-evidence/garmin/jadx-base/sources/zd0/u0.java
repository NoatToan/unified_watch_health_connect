package zd0;

import android.content.Context;
import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzd0/u0;", "Lzd0/q0;", "Lz70/b0;", "store", "Lz70/x;", "imageManager", "Lub1/m;", "viewFactory", "Lz70/z;", "promosPreferences", "Lht/p;", "analytics", "Lzd0/f0;", "eventManager", "Lc22/k;", "appConfigurationDelegate", "Lzd0/k0;", "promoTargetRouterFactory", "<init>", "(Lz70/b0;Lz70/x;Lub1/m;Lz70/z;Lht/p;Lzd0/f0;Lc22/k;Lzd0/k0;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements q0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f204141p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.b0 f204142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z70.x f204143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub1.m f204144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z70.z f204145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.p f204146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f204147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c22.k f204148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f204149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f204150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f204151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<c80.s0, ? extends List<c80.y0>> f204152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<c80.y0> f204153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u53.d f204154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z53.b f204155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f204156o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f204158b;

        static {
            int[] iArr = new int[c80.s0.values().length];
            try {
                iArr[c80.s0.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c80.s0.LEADERBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c80.s0.FIND_A_WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c80.s0.ACTIVITY_REPORTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c80.s0.ACTIVITY_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c80.s0.TRAIL_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c80.s0.HIDDEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c80.s0.PROFILE_FRAME_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c80.s0.GARMIN_COACH_PLAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c80.s0.LIVE_TRACK_MAIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c80.s0.WHATS_NEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c80.s0.PROFILE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c80.s0.SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c80.s0.HYDRATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c80.s0.WEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c80.s0.CALORIES_BURNED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c80.s0.NUTRITION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c80.s0.MCT_GENESIS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c80.s0.MCT_REPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c80.s0.NEWS_FEED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c80.s0.FIND_PLAN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c80.s0.HOME_MAINTENANCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[c80.s0.TRAINING_STATUS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[c80.s0.TRAINING_READINESS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[c80.s0.VO2_MAX.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f204157a = iArr;
            int[] iArr2 = new int[l0.values().length];
            try {
                iArr2[l0.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[l0.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            f204158b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager$dismissWhatsNewPromo$1", f = "PromosProvider.kt", l = {441}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204159a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f204161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f204161c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u0.this.new c(this.f204161c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204159a;
            String str = this.f204161c;
            u0 u0Var = u0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f204159a = 1;
                int i15 = u0.f204141p;
                u0Var.getClass();
                Object objB = u0.B(u0Var, str, c80.s0.WHATS_NEW, null, true, false, new a1(u0Var), this, 16);
                if (objB != obj2) {
                    objB = Unit.INSTANCE;
                }
                if (objB == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            u0Var.f204146e.a(ht.q.CLOSE, str, c80.s0.WHATS_NEW);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager$onWhatsNewPromoClick$1", f = "PromosProvider.kt", l = {825, 459}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.b f204162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u0 f204163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f204164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f204165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f204166e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f204168g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f204168g = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = u0.this.new d(this.f204168g, dVar);
            dVar2.f204166e = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
        
            if (r13 == r1) goto L42;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z53.b bVar;
            u0 u0Var;
            String str;
            c80.y0 y0Var;
            Object next;
            o53.b0 b0Var = (o53.b0) this.f204166e;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204165d;
            u0 u0Var2 = u0.this;
            String str2 = this.f204168g;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        str = this.f204164c;
                        u0Var = this.f204163b;
                        bVar = this.f204162a;
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                z53.b bVar2 = u0Var2.f204155n;
                this.f204166e = b0Var;
                this.f204162a = bVar2;
                this.f204163b = u0Var2;
                this.f204164c = str2;
                this.f204165d = 1;
                if (bVar2.c(this) != obj2) {
                    bVar = bVar2;
                    u0Var = u0Var2;
                    str = str2;
                }
                return obj2;
                List<c80.y0> list = u0Var.f204152k.get(c80.s0.WHATS_NEW);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((c80.y0) next).f25637a.equals(str));
                    y0Var = (c80.y0) next;
                } else {
                    y0Var = null;
                }
                bVar.e(null);
                if (y0Var == null) {
                    a2 a2Var = a2.PROMOTIONS;
                    String strN = fb1.c.n("Unable to find a what's new promo with id ", str2);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "PromosManager", strN);
                    return Unit.INSTANCE;
                }
                c80.k0 k0Var = y0Var.f25647k;
                if (k0Var.f25402b && k0Var.f25403c) {
                    c80.w0 w0Var = y0Var.f25649m;
                    this.f204166e = null;
                    this.f204162a = null;
                    this.f204163b = null;
                    this.f204164c = null;
                    this.f204165d = 2;
                    u0Var2.getClass();
                    Object objB = u0.B(u0Var2, str2, c80.s0.WHATS_NEW, w0Var, false, false, new a1(u0Var2), this, 16);
                    if (objB != u13.a.COROUTINE_SUSPENDED) {
                        objB = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                bVar.e(null);
                throw th3;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosManager", f = "PromosProvider.kt", l = {825, 192, 192, 196}, m = "reset", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f204169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p005kotlin.jvm.internal.m0 f204170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f204171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f204172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f204173e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f204175g;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f204173e = obj;
            this.f204175g |= Integer.MIN_VALUE;
            return u0.this.k(this);
        }
    }

    static {
        new a(null);
    }

    public u0(z70.b0 b0Var, z70.x xVar, ub1.m mVar, z70.z zVar, ht.p pVar, f0 f0Var, c22.k kVar, k0 k0Var) {
        b0Var.getClass();
        xVar.getClass();
        mVar.getClass();
        zVar.getClass();
        pVar.getClass();
        f0Var.getClass();
        kVar.getClass();
        k0Var.getClass();
        this.f204142a = b0Var;
        this.f204143b = xVar;
        this.f204144c = mVar;
        this.f204145d = zVar;
        this.f204146e = pVar;
        this.f204147f = f0Var;
        this.f204148g = kVar;
        this.f204149h = k0Var;
        this.f204150i = new LinkedHashMap();
        this.f204151j = new ArrayList();
        p13.k0 k0Var2 = p13.k0.f134949a;
        k0Var2.getClass();
        this.f204152k = k0Var2;
        this.f204153l = p13.j0.f134944a;
        x53.c cVar = o53.s0.f129406a;
        this.f204154m = o53.c0.a(x53.b.f189152a);
        this.f204155n = z53.c.a();
    }

    public static /* synthetic */ Object B(u0 u0Var, String str, c80.s0 s0Var, c80.w0 w0Var, boolean z14, boolean z15, a1 a1Var, v13.i iVar, int i14) {
        if ((i14 & 16) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        e23.a r0Var = a1Var;
        if ((i14 & 32) != 0) {
            r0Var = new r0(0);
        }
        return u0Var.A(str, s0Var, w0Var, z14, z16, r0Var, iVar);
    }

    public static Object D(v13.c cVar) {
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        if (bVar.c()) {
            return bVar.C(cVar);
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.p(a2Var, "PromosManager", "PromosProvider can't find customer guid.");
        return null;
    }

    public static void z(u0 u0Var, c80.y0 y0Var, c80.s0 s0Var, boolean z14, int i14) {
        ge1.b.T(u0Var.f204154m, null, null, new y0(y0Var, u0Var, (i14 & 2) != 0 ? null : s0Var, (i14 & 8) != 0 ? true : z14, (i14 & 4) != 0, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[PHI: r9 r10 r11 r13 r15
      0x00cf: PHI (r9v6 java.lang.String) = (r9v3 java.lang.String), (r9v14 java.lang.String) binds: [B:33:0x00cc, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v8 boolean) = (r10v6 boolean), (r10v13 boolean) binds: [B:33:0x00cc, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v5 z70.b0) = (r11v3 z70.b0), (r11v13 z70.b0) binds: [B:33:0x00cc, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r13v4 boolean) = (r13v2 boolean), (r13v6 boolean) binds: [B:33:0x00cc, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r15v6 java.lang.Object) = (r15v5 java.lang.Object), (r15v1 java.lang.Object) binds: [B:33:0x00cc, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        if (r11.c(r15, r9, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, c80.s0 s0Var, c80.w0 w0Var, boolean z14, boolean z15, e23.a aVar, v13.c cVar) {
        z0 z0Var;
        boolean z16;
        e23.a aVar2;
        String str2;
        boolean z17;
        z70.b0 b0Var;
        String str3;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i14 = z0Var.f204220j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z0Var.f204220j = i14 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objD = z0Var.f204218h;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = z0Var.f204220j;
        if (i15 == 0) {
            o13.r.b(objD);
            if (z15) {
                z0Var.f204211a = str;
                z0Var.f204212b = s0Var;
                z0Var.f204213c = w0Var;
                z0Var.f204214d = aVar;
                z0Var.f204216f = z14;
                z0Var.f204217g = z15;
                z0Var.f204220j = 1;
                if (E(str, z0Var) != obj) {
                }
            }
            return obj;
        }
        if (i15 == 1) {
            z15 = z0Var.f204217g;
            z14 = z0Var.f204216f;
            aVar = z0Var.f204214d;
            w0Var = z0Var.f204213c;
            s0Var = z0Var.f204212b;
            str = z0Var.f204211a;
            o13.r.b(objD);
        } else {
            if (i15 == 2) {
                z17 = z0Var.f204217g;
                z16 = z0Var.f204216f;
                aVar2 = z0Var.f204214d;
                str2 = z0Var.f204211a;
                o13.r.b(objD);
                z15 = z17;
                aVar = aVar2;
                str = str2;
                aVar.invoke();
                z0Var.f204211a = str;
                z0Var.f204212b = null;
                z0Var.f204213c = null;
                z0Var.f204214d = null;
                b0Var = this.f204142a;
                z0Var.f204215e = b0Var;
                z0Var.f204216f = z16;
                z0Var.f204217g = z15;
                z0Var.f204220j = 3;
                objD = D(z0Var);
                if (objD != obj) {
                    str3 = (String) objD;
                    if (str3 == null) {
                        return Unit.INSTANCE;
                    }
                    z0Var.f204211a = str;
                    z0Var.f204212b = null;
                    z0Var.f204213c = null;
                    z0Var.f204214d = null;
                    z0Var.f204215e = null;
                    z0Var.f204216f = z16;
                    z0Var.f204217g = z15;
                    z0Var.f204220j = 4;
                }
                return obj;
            }
            if (i15 == 3) {
                boolean z18 = z0Var.f204217g;
                z16 = z0Var.f204216f;
                b0Var = z0Var.f204215e;
                String str4 = z0Var.f204211a;
                o13.r.b(objD);
                z15 = z18;
                str = str4;
                str3 = (String) objD;
                if (str3 == null) {
                    return Unit.INSTANCE;
                }
                z0Var.f204211a = str;
                z0Var.f204212b = null;
                z0Var.f204213c = null;
                z0Var.f204214d = null;
                z0Var.f204215e = null;
                z0Var.f204216f = z16;
                z0Var.f204217g = z15;
                z0Var.f204220j = 4;
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = z0Var.f204211a;
                o13.r.b(objD);
            }
        }
        a2 a2Var = a2.PROMOTIONS;
        String strM = am.j.m("Promo ", str, " dismissed.");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosManager", strM);
        return Unit.INSTANCE;
        if (s0Var != null) {
            this.f204145d.n(s0Var);
            c80.q0.a aVar3 = new c80.q0.a(s0Var, w0Var, z14);
            z0Var.f204211a = str;
            z0Var.f204212b = null;
            z0Var.f204213c = null;
            z0Var.f204214d = aVar;
            z0Var.f204215e = null;
            z0Var.f204216f = z14;
            z0Var.f204217g = z15;
            z0Var.f204220j = 2;
            if (this.f204147f.a(aVar3, z0Var) != obj) {
                z16 = z14;
                aVar2 = aVar;
                str2 = str;
                z17 = z15;
                z15 = z17;
                aVar = aVar2;
                str = str2;
                aVar.invoke();
                z0Var.f204211a = str;
                z0Var.f204212b = null;
                z0Var.f204213c = null;
                z0Var.f204214d = null;
                b0Var = this.f204142a;
                z0Var.f204215e = b0Var;
                z0Var.f204216f = z16;
                z0Var.f204217g = z15;
                z0Var.f204220j = 3;
                objD = D(z0Var);
                if (objD != obj) {
                    str3 = (String) objD;
                    if (str3 == null) {
                        return Unit.INSTANCE;
                    }
                    z0Var.f204211a = str;
                    z0Var.f204212b = null;
                    z0Var.f204213c = null;
                    z0Var.f204214d = null;
                    z0Var.f204215e = null;
                    z0Var.f204216f = z16;
                    z0Var.f204217g = z15;
                    z0Var.f204220j = 4;
                }
            }
        } else {
            z16 = z14;
            aVar.invoke();
            z0Var.f204211a = str;
            z0Var.f204212b = null;
            z0Var.f204213c = null;
            z0Var.f204214d = null;
            b0Var = this.f204142a;
            z0Var.f204215e = b0Var;
            z0Var.f204216f = z16;
            z0Var.f204217g = z15;
            z0Var.f204220j = 3;
            objD = D(z0Var);
            if (objD != obj) {
                str3 = (String) objD;
                if (str3 == null) {
                    return Unit.INSTANCE;
                }
                z0Var.f204211a = str;
                z0Var.f204212b = null;
                z0Var.f204213c = null;
                z0Var.f204214d = null;
                z0Var.f204215e = null;
                z0Var.f204216f = z16;
                z0Var.f204217g = z15;
                z0Var.f204220j = 4;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005d A[SYNTHETIC] */
    public final List<o13.p<c80.y0, j0>> C(c80.s0 s0Var, e0 e0Var, List<? extends c80.p0> list) {
        ArrayList<c80.y0> arrayList;
        o13.p pVar;
        synchronized (this.f204152k) {
            List<c80.y0> list2 = this.f204152k.get(s0Var);
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (list.contains(((c80.y0) obj).f25638b)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
        }
        if (arrayList == null) {
            i2.f36769a.getClass();
            i2.a.b(a2.PROMOTIONS, "PromosManager", "No promos found for location " + s0Var);
            return p13.j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c80.y0 y0Var : arrayList) {
            l0 l0VarD = e0Var != null ? e0Var.d(y0Var.f25646j) : null;
            int i14 = l0VarD == null ? -1 : b.f204158b[l0VarD.ordinal()];
            if (i14 == 1) {
                a2 a2Var = a2.PROMOTIONS;
                String strM = am.j.m("Promo ", y0Var.f25637a, " is being auto dismissed");
                i2.f36769a.getClass();
                i2.a.k(a2Var, "PromosManager", strM);
                z(this, y0Var, null, false, 2);
            } else if (i14 != 2) {
                a2 a2Var2 = a2.PROMOTIONS;
                String strM2 = am.j.m("Promo ", y0Var.f25637a, " passed validation");
                i2.f36769a.getClass();
                i2.a.k(a2Var2, "PromosManager", strM2);
                c80.w0 w0Var = y0Var.f25649m;
                if (w0Var == null) {
                    i2.a.f(a2Var2, "PromosManager", "Missing promo target");
                } else {
                    j0 j0VarA = this.f204149h.a(w0Var);
                    if (j0VarA == null) {
                        i2.a.f(a2Var2, "PromosManager", "Promo " + y0Var.f25637a + " is missing router for target");
                    } else {
                        i2.a.b(a2Var2, "PromosManager", "Returning promo alert for location " + s0Var);
                        pVar = new o13.p(y0Var, j0VarA);
                    }
                    if (pVar != null) {
                        arrayList2.add(pVar);
                    }
                }
            } else {
                a2 a2Var3 = a2.PROMOTIONS;
                String strM3 = am.j.m("Promo ", y0Var.f25637a, " failed to pass validation");
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "PromosManager", strM3);
            }
            pVar = null;
            if (pVar != null) {
                arrayList2.add(pVar);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[Catch: all -> 0x006c, PHI: r1
      0x0096: PHI (r1v5 c80.y0) = (r1v4 c80.y0), (r1v11 c80.y0) binds: [B:27:0x0072, B:36:0x0093] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x006c, blocks: (B:17:0x0046, B:18:0x0056, B:20:0x005c, B:26:0x0070, B:28:0x0074, B:29:0x007a, B:31:0x0080, B:35:0x0091, B:45:0x00ee, B:38:0x0096, B:39:0x00a8, B:41:0x00ae, B:43:0x00bc, B:44:0x00dd), top: B:50:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:17:0x0046, B:18:0x0056, B:20:0x005c, B:26:0x0070, B:28:0x0074, B:29:0x007a, B:31:0x0080, B:35:0x0091, B:45:0x00ee, B:38:0x0096, B:39:0x00a8, B:41:0x00ae, B:43:0x00bc, B:44:0x00dd), top: B:50:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, v13.c cVar) {
        d1 d1Var;
        z53.b bVar;
        Object next;
        Set<String> set;
        LinkedHashMap linkedHashMapN;
        p13.c.b bVar2;
        c80.s0 s0Var;
        List list;
        Object next2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f204007e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f204007e = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object obj = d1Var.f204005c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var.f204007e;
        if (i15 == 0) {
            o13.r.b(obj);
            d1Var.f204003a = str;
            bVar = this.f204155n;
            d1Var.f204004b = bVar;
            d1Var.f204007e = 1;
            if (bVar.c(d1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar3 = d1Var.f204004b;
            String str2 = d1Var.f204003a;
            o13.r.b(obj);
            bVar = bVar3;
            str = str2;
        }
        try {
            Iterator it = p13.y.s(this.f204152k.values()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((c80.y0) next).f25637a.equals(str));
            c80.y0 y0Var = (c80.y0) next;
            if (y0Var == null) {
                Iterator<T> it3 = this.f204153l.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!((c80.y0) next2).f25637a.equals(str));
                y0Var = (c80.y0) next2;
                if (y0Var != null) {
                    set = y0Var.f25650n;
                    linkedHashMapN = p13.u0.n(this.f204152k);
                    w13.c cVar2 = c80.s0.E;
                    cVar2.getClass();
                    bVar2 = new p13.c.b();
                    while (bVar2.hasNext()) {
                        s0Var = (c80.s0) bVar2.next();
                        list = (List) linkedHashMapN.get(s0Var);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(list);
                            arrayList.removeIf(new s52.e(new y01.k(str, 27), 24));
                            zf.b.K(arrayList, set);
                            linkedHashMapN.put(s0Var, p13.h0.b1(arrayList));
                        }
                    }
                    ArrayList arrayListD1 = p13.h0.d1(this.f204153l);
                    zf.b.K(arrayListD1, set);
                    this.f204152k = linkedHashMapN;
                    this.f204153l = p13.h0.b1(arrayListD1);
                }
            } else {
                set = y0Var.f25650n;
                linkedHashMapN = p13.u0.n(this.f204152k);
                w13.c cVar3 = c80.s0.E;
                cVar3.getClass();
                bVar2 = new p13.c.b();
                while (bVar2.hasNext()) {
                    s0Var = (c80.s0) bVar2.next();
                    list = (List) linkedHashMapN.get(s0Var);
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.removeIf(new s52.e(new y01.k(str, 27), 24));
                        zf.b.K(arrayList2, set);
                        linkedHashMapN.put(s0Var, p13.h0.b1(arrayList2));
                    }
                }
                ArrayList arrayListD2 = p13.h0.d1(this.f204153l);
                zf.b.K(arrayListD2, set);
                this.f204152k = linkedHashMapN;
                this.f204153l = p13.h0.b1(arrayListD2);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:58:0x0167->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r4 == r3) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(c80.s0 s0Var, List list, v13.c cVar) {
        f1 f1Var;
        c80.s0 s0Var2;
        Object objY;
        Iterator it;
        int i14;
        c80.y0 y0Var;
        c80.q0 q0Var;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i15 = f1Var.f204017f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                f1Var.f204017f = i15 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object obj = f1Var.f204015d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = f1Var.f204017f;
        if (i16 != 0) {
            if (i16 == 1) {
                c80.s0 s0Var3 = f1Var.f204012a;
                o13.r.b(obj);
                objY = obj;
                s0Var2 = s0Var3;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = f1Var.f204014c;
                it = f1Var.f204013b;
                o13.r.b(obj);
            }
            while (it.hasNext()) {
                q0Var = (c80.q0) it.next();
                f1Var.f204012a = null;
                f1Var.f204013b = it;
                f1Var.f204014c = i14;
                f1Var.f204017f = 2;
                if (this.f204147f.a(q0Var, f1Var) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        s0Var2 = s0Var;
        f1Var.f204012a = s0Var2;
        f1Var.f204017f = 1;
        objY = y(list, f1Var);
        o13.p pVar = (o13.p) objY;
        Map<c80.s0, ? extends List<c80.y0>> map = (Map) pVar.f128594a;
        List<c80.y0> list2 = (List) pVar.f128595b;
        i2.f36769a.getClass();
        i2.a.b(a2.PROMOTIONS, "PromosManager", "newPromoMap " + map);
        Map<c80.s0, ? extends List<c80.y0>> map2 = this.f204152k;
        Set<c80.s0> setKeySet = map2.keySet();
        Set<c80.s0> setKeySet2 = map.keySet();
        LinkedHashSet linkedHashSetH = p13.c1.h(setKeySet, setKeySet2);
        ArrayList arrayList = new ArrayList();
        ArrayList<c80.s0> arrayList2 = new ArrayList();
        for (Object obj2 : setKeySet) {
            if (!setKeySet2.contains((c80.s0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        for (c80.s0 s0Var4 : arrayList2) {
            List<c80.y0> list3 = map2.get(s0Var4);
            arrayList3.add(new c80.q0.a(s0Var4, (list3 == null || (y0Var = (c80.y0) p13.h0.d0(list3)) == null) ? null : y0Var.f25649m, s0Var2 == s0Var4));
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : linkedHashSetH) {
            c80.s0 s0Var5 = (c80.s0) obj3;
            List<c80.y0> list4 = map2.get(s0Var5);
            if (list4 == null) {
                list4 = p13.j0.f134944a;
            }
            List<c80.y0> list5 = map.get(s0Var5);
            if (list5 == null) {
                list5 = p13.j0.f134944a;
            }
            if (!p005kotlin.jvm.internal.s.g(list4, list5) && !list5.isEmpty()) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(new c80.q0.b((c80.s0) it3.next()));
        }
        arrayList.addAll(arrayList5);
        i53.c cVarE = i53.a.e(arrayList);
        this.f204152k = map;
        this.f204153l = list2;
        it = cVarE.iterator();
        i14 = 0;
        while (it.hasNext()) {
            q0Var = (c80.q0) it.next();
            f1Var.f204012a = null;
            f1Var.f204013b = it;
            f1Var.f204014c = i14;
            f1Var.f204017f = 2;
            if (this.f204147f.a(q0Var, f1Var) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // zd0.g1
    public final void a() {
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromosManager", "onLogout");
        this.f204156o = false;
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f204152k = k0Var;
        this.f204153l = p13.j0.f134944a;
        this.f204142a.f();
    }

    @Override // zd0.q0
    public final void b() {
        this.f204143b.b();
    }

    @Override // zd0.g1
    public final boolean c(c80.s0 s0Var) {
        s0Var.getClass();
        switch (b.f204157a[s0Var.ordinal()]) {
            case 1:
                z70.z zVar = this.f204145d;
                Long lJ = zVar.j(s0Var);
                if (lJ == null) {
                    return true;
                }
                long jLongValue = lJ.longValue();
                e53.j.f63112c.getClass();
                e53.j jVarA = e53.j.a.a(jLongValue);
                if (zVar.w()) {
                    return true;
                }
                e53.j jVarB = jVarA.b(zVar.d());
                e53.a.C1329a.f63093a.getClass();
                return jVarB.compareTo(e53.k.f63117a.a()) <= 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                lc.u0.r();
                return false;
        }
    }

    @Override // zd0.g1
    public final void d(c80.m0 m0Var, e0 e0Var) {
        m0Var.getClass();
        e0Var.getClass();
        this.f204150i.put(m0Var, e0Var);
    }

    @Override // zd0.q0
    public final Object e(g2.a.b bVar) throws Throwable {
        if (!x()) {
            return Unit.INSTANCE;
        }
        Long lT = this.f204145d.t();
        if (lT == null) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "PromosManager", "No PromosLastFetchDate found. Reset promos.");
            Object objK = k(bVar);
            return objK == u13.a.COROUTINE_SUSPENDED ? objK : Unit.INSTANCE;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - lT.longValue()) / 1000;
        if (this.f204148g.d("promos_max_cache_age") * ((long) DateTimeConstants.SECONDS_PER_HOUR) >= jCurrentTimeMillis) {
            return Unit.INSTANCE;
        }
        i2.f36769a.getClass();
        i2.a.k(a2.PROMOTIONS, "PromosManager", jCurrentTimeMillis + " seconds has passed since last fetch of promotions. Reset.");
        Object objK2 = k(bVar);
        return objK2 == u13.a.COROUTINE_SUSPENDED ? objK2 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.q0
    public final Object f(v13.c cVar) {
        e1 e1Var;
        z70.b0 b0Var;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i14 = e1Var.f204011d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e1Var.f204011d = i14 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, cVar);
            }
        } else {
            e1Var = new e1(this, cVar);
        }
        Object obj = e1Var.f204009b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e1Var.f204011d;
        if (i15 == 0) {
            o13.r.b(obj);
            z70.b0 b0Var2 = this.f204142a;
            e1Var.f204008a = b0Var2;
            e1Var.f204011d = 1;
            Object objD = D(e1Var);
            if (objD == aVar) {
                return aVar;
            }
            b0Var = b0Var2;
            obj = objD;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = e1Var.f204008a;
            o13.r.b(obj);
        }
        String str = (String) obj;
        if (str == null) {
            return Unit.INSTANCE;
        }
        b0Var.b(str);
        return Unit.INSTANCE;
    }

    @Override // zd0.g1
    public final List<c80.y0> g() {
        List<c80.y0> list = this.f204152k.get(c80.s0.WHATS_NEW);
        i2.f36769a.getClass();
        i2.a.b(a2.PROMOTIONS, "PromosManager", "Whats new promos " + list);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [t4.d] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r23v0, types: [t4.d] */
    @Override // zd0.g1
    public final ArrayList h(c80.s0 s0Var, z81.b bVar) {
        u0 u0Var = this;
        c80.s0 s0Var2 = s0Var;
        s0Var2.getClass();
        o4.v0 v0Var = null;
        List<o13.p<c80.y0, j0>> listC = u0Var.C(s0Var2, null, c80.p0.f25530i);
        ArrayList arrayList = new ArrayList();
        for (o13.p<c80.y0, j0> pVar : listC) {
            c80.y0 y0Var = pVar.f128594a;
            j0 j0Var = pVar.f128595b;
            c80.t0 t0Var = y0Var.f25648l;
            String str = y0Var.f25637a;
            c80.t0.b bVar2 = t0Var.f25590a;
            z70.x xVar = u0Var.f204143b;
            o4.v0 v0VarC = bVar2 != null ? xVar.c(bVar2.f25594a) : v0Var;
            String str2 = y0Var.f25648l.f25591b;
            o4.v0 v0VarC2 = str2 != null ? xVar.c(str2) : v0Var;
            i2.f36769a.getClass();
            i2.a.b(a2.PROMOTIONS, "PromosManager", "Found promo with id " + str + " for location " + s0Var2);
            arrayList.add(new c80.o0(str, y0Var.f25640d, y0Var.f25641e, y0Var.f25642f, v0VarC2 != null ? new t4.a(v0VarC2, 0L, 0L, 6, null) : v0Var, v0VarC != null ? new t4.a(v0VarC, 0L, 0L, 6, null) : v0Var, y0Var.f25649m, y0Var.f25645i, y0Var.f25646j, y0Var.f25647k, u0Var.f204147f.getF203980a(), new s0(u0Var, s0Var2, y0Var, 3), new s0(y0Var, u0Var, s0Var2, 4), new t0(u0Var, s0Var2, y0Var, j0Var, bVar, 1)));
            v0Var = null;
            u0Var = this;
            s0Var2 = s0Var;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:27:0x0056, B:48:0x00b0, B:51:0x00b6), top: B:73:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:22:0x0047, B:55:0x00c8, B:57:0x00cc, B:58:0x00da), top: B:72:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00da A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:22:0x0047, B:55:0x00c8, B:57:0x00cc, B:58:0x00da), top: B:72:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.q0
    public final Object i(v13.c cVar) throws Throwable {
        b1 b1Var;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        Throwable th3;
        z53.a aVar3;
        int i15;
        int i16;
        String str;
        z53.a aVar4;
        List list;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i17 = b1Var.f203987f;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                b1Var.f203987f = i17 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objD = b1Var.f203985d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i18 = b1Var.f203987f;
        int i19 = 0;
        try {
            if (i18 == 0) {
                o13.r.b(objD);
                aVar = this.f204155n;
                b1Var.f203982a = aVar;
                b1Var.f203983b = 0;
                b1Var.f203987f = 1;
                if (aVar.c(b1Var) != obj) {
                    i14 = 0;
                }
                return obj;
            }
            if (i18 != 1) {
                if (i18 == 2) {
                    i19 = b1Var.f203984c;
                    i14 = b1Var.f203983b;
                    aVar3 = b1Var.f203982a;
                    try {
                        o13.r.b(objD);
                        int i24 = i19;
                        i15 = i14;
                        i16 = i24;
                        str = (String) objD;
                        if (str != null) {
                            z70.b0 b0Var = this.f204142a;
                            b1Var.f203982a = aVar3;
                            b1Var.f203983b = i15;
                            b1Var.f203984c = i16;
                            b1Var.f203987f = 3;
                            objD = b0Var.d(str, b1Var);
                            if (objD != obj) {
                                aVar4 = aVar3;
                                list = (List) objD;
                                if (list != null) {
                                    a2 a2Var = a2.PROMOTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "PromosManager", "Initial load failed due to API error.");
                                    aVar2 = aVar4;
                                } else {
                                    b1Var.f203982a = aVar4;
                                    b1Var.f203983b = i15;
                                    b1Var.f203984c = i16;
                                    b1Var.f203987f = 4;
                                    if (F(null, list, b1Var) != obj) {
                                        aVar2 = aVar4;
                                        this.f204156o = true;
                                        a2 a2Var2 = a2.PROMOTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var2, "PromosManager", "Initial load complete.");
                                    }
                                }
                            }
                            return obj;
                        }
                        aVar2 = aVar3;
                        Unit unit = Unit.INSTANCE;
                        aVar2.e(null);
                        return unit;
                    } catch (Throwable th4) {
                        th3 = th4;
                        aVar2 = aVar3;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                if (i18 != 3) {
                    if (i18 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = b1Var.f203982a;
                    try {
                        o13.r.b(objD);
                        this.f204156o = true;
                        a2 a2Var3 = a2.PROMOTIONS;
                        i2.f36769a.getClass();
                        i2.a.k(a2Var3, "PromosManager", "Initial load complete.");
                        Unit unit2 = Unit.INSTANCE;
                        aVar2.e(null);
                        return unit2;
                    } catch (Throwable th5) {
                        th3 = th5;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                i16 = b1Var.f203984c;
                i15 = b1Var.f203983b;
                aVar4 = b1Var.f203982a;
                try {
                    o13.r.b(objD);
                    list = (List) objD;
                    if (list != null) {
                        b1Var.f203982a = aVar4;
                        b1Var.f203983b = i15;
                        b1Var.f203984c = i16;
                        b1Var.f203987f = 4;
                        if (F(null, list, b1Var) != obj) {
                            aVar2 = aVar4;
                            this.f204156o = true;
                            a2 a2Var4 = a2.PROMOTIONS;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var4, "PromosManager", "Initial load complete.");
                        }
                        return obj;
                    }
                    a2 a2Var5 = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "PromosManager", "Initial load failed due to API error.");
                    aVar2 = aVar4;
                    Unit unit3 = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit3;
                } catch (Throwable th6) {
                    th3 = th6;
                    aVar2 = aVar4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = b1Var.f203983b;
            z53.a aVar5 = b1Var.f203982a;
            o13.r.b(objD);
            aVar = aVar5;
            if (x()) {
                if (!this.f204156o) {
                    b1Var.f203982a = aVar;
                    b1Var.f203983b = i14;
                    b1Var.f203984c = 0;
                    b1Var.f203987f = 2;
                    Object objD2 = D(b1Var);
                    if (objD2 != obj) {
                        aVar3 = aVar;
                        objD = objD2;
                        int i25 = i19;
                        i15 = i14;
                        i16 = i25;
                        str = (String) objD;
                        if (str != null) {
                            aVar2 = aVar3;
                        } else {
                            z70.b0 b0Var2 = this.f204142a;
                            b1Var.f203982a = aVar3;
                            b1Var.f203983b = i15;
                            b1Var.f203984c = i16;
                            b1Var.f203987f = 3;
                            objD = b0Var2.d(str, b1Var);
                            if (objD != obj) {
                                aVar4 = aVar3;
                                list = (List) objD;
                                if (list != null) {
                                    a2 a2Var6 = a2.PROMOTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var6, "PromosManager", "Initial load failed due to API error.");
                                    aVar2 = aVar4;
                                } else {
                                    b1Var.f203982a = aVar4;
                                    b1Var.f203983b = i15;
                                    b1Var.f203984c = i16;
                                    b1Var.f203987f = 4;
                                    if (F(null, list, b1Var) != obj) {
                                        aVar2 = aVar4;
                                        this.f204156o = true;
                                        a2 a2Var7 = a2.PROMOTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.k(a2Var7, "PromosManager", "Initial load complete.");
                                    }
                                }
                            }
                        }
                        Unit unit4 = Unit.INSTANCE;
                        aVar2.e(null);
                        return unit4;
                    }
                    return obj;
                }
                a2 a2Var8 = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.b(a2Var8, "PromosManager", "Initial load has been completed. Ignoring request.");
            }
            aVar2 = aVar;
            Unit unit5 = Unit.INSTANCE;
            aVar2.e(null);
            return unit5;
        } catch (Throwable th7) {
            aVar2 = aVar;
            th3 = th7;
            aVar2.e(null);
            throw th3;
        }
    }

    @Override // zd0.q0
    public final void j() {
        this.f204145d.n(c80.s0.HOME);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:27:0x005c, B:42:0x00a6, B:44:0x00aa), top: B:70:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2 A[Catch: all -> 0x0039, TryCatch #3 {all -> 0x0039, blocks: (B:15:0x0034, B:57:0x00de, B:59:0x00e2, B:61:0x00e6, B:65:0x00ef), top: B:76:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.q0
    public final Object k(t13.d<? super Unit> dVar) throws Throwable {
        e eVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        Throwable th3;
        p005kotlin.jvm.internal.m0 m0Var;
        z53.a aVar3;
        int i15;
        int i16;
        String str;
        int i17;
        z53.a aVar4;
        p005kotlin.jvm.internal.m0 m0Var2;
        List list;
        p005kotlin.jvm.internal.m0 m0Var3;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i18 = eVar.f204175g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                eVar.f204175g = i18 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objD = eVar.f204173e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i19 = eVar.f204175g;
        z70.b0 b0Var = this.f204142a;
        try {
            if (i19 == 0) {
                o13.r.b(objD);
                aVar = this.f204155n;
                eVar.f204169a = aVar;
                eVar.f204171c = 0;
                eVar.f204175g = 1;
                if (aVar.c(eVar) != obj) {
                    i14 = 0;
                }
                return obj;
            }
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m0Var3 = eVar.f204170b;
                        aVar2 = eVar.f204169a;
                        try {
                            o13.r.b(objD);
                            if (m0Var3.f105804a && !this.f204156o) {
                                this.f204156o = true;
                            }
                            Unit unit = Unit.INSTANCE;
                            aVar2.e(null);
                            return unit;
                        } catch (Throwable th4) {
                            th3 = th4;
                            aVar2.e(null);
                            throw th3;
                        }
                    }
                    i16 = eVar.f204172d;
                    i17 = eVar.f204171c;
                    m0Var2 = eVar.f204170b;
                    aVar4 = eVar.f204169a;
                    try {
                        o13.r.b(objD);
                        list = (List) objD;
                        if (list == null) {
                            m0Var = m0Var2;
                            m0Var.f105804a = false;
                            list = p13.j0.f134944a;
                            m0Var2 = m0Var;
                        }
                        eVar.f204169a = aVar4;
                        eVar.f204170b = m0Var2;
                        eVar.f204171c = i17;
                        eVar.f204172d = i16;
                        eVar.f204175g = 4;
                        if (F(null, list, eVar) != obj) {
                            m0Var3 = m0Var2;
                            aVar2 = aVar4;
                            if (m0Var3.f105804a) {
                                this.f204156o = true;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            aVar2.e(null);
                            return unit2;
                        }
                        return obj;
                    } catch (Throwable th5) {
                        th3 = th5;
                        aVar2 = aVar4;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                i16 = eVar.f204172d;
                i15 = eVar.f204171c;
                m0Var = eVar.f204170b;
                aVar3 = eVar.f204169a;
                try {
                    o13.r.b(objD);
                    str = (String) objD;
                    if (str != null) {
                        eVar.f204169a = aVar3;
                        eVar.f204170b = m0Var;
                        eVar.f204171c = i15;
                        eVar.f204172d = i16;
                        eVar.f204175g = 3;
                        objD = b0Var.d(str, eVar);
                        if (objD != obj) {
                            i17 = i15;
                            m0Var2 = m0Var;
                            aVar4 = aVar3;
                            list = (List) objD;
                            if (list == null) {
                                m0Var = m0Var2;
                                m0Var.f105804a = false;
                                list = p13.j0.f134944a;
                                m0Var2 = m0Var;
                            }
                            eVar.f204169a = aVar4;
                            eVar.f204170b = m0Var2;
                            eVar.f204171c = i17;
                            eVar.f204172d = i16;
                            eVar.f204175g = 4;
                            if (F(null, list, eVar) != obj) {
                                m0Var3 = m0Var2;
                                aVar2 = aVar4;
                                if (m0Var3.f105804a) {
                                    this.f204156o = true;
                                }
                                Unit unit3 = Unit.INSTANCE;
                                aVar2.e(null);
                                return unit3;
                            }
                        }
                    } else {
                        i17 = i15;
                        aVar4 = aVar3;
                        m0Var.f105804a = false;
                        list = p13.j0.f134944a;
                        m0Var2 = m0Var;
                        eVar.f204169a = aVar4;
                        eVar.f204170b = m0Var2;
                        eVar.f204171c = i17;
                        eVar.f204172d = i16;
                        eVar.f204175g = 4;
                        if (F(null, list, eVar) != obj) {
                            m0Var3 = m0Var2;
                            aVar2 = aVar4;
                            if (m0Var3.f105804a) {
                                this.f204156o = true;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            aVar2.e(null);
                            return unit4;
                        }
                    }
                    return obj;
                } catch (Throwable th6) {
                    th3 = th6;
                    aVar2 = aVar3;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = eVar.f204171c;
            z53.a aVar5 = eVar.f204169a;
            o13.r.b(objD);
            aVar = aVar5;
            if (x()) {
                b0Var.f();
                m0Var = new p005kotlin.jvm.internal.m0();
                m0Var.f105804a = true;
                eVar.f204169a = aVar;
                eVar.f204170b = m0Var;
                eVar.f204171c = i14;
                eVar.f204172d = 0;
                eVar.f204175g = 2;
                Object objD2 = D(eVar);
                if (objD2 != obj) {
                    aVar3 = aVar;
                    objD = objD2;
                    i15 = i14;
                    i16 = 0;
                    str = (String) objD;
                    if (str != null) {
                        eVar.f204169a = aVar3;
                        eVar.f204170b = m0Var;
                        eVar.f204171c = i15;
                        eVar.f204172d = i16;
                        eVar.f204175g = 3;
                        objD = b0Var.d(str, eVar);
                        if (objD != obj) {
                            i17 = i15;
                            m0Var2 = m0Var;
                            aVar4 = aVar3;
                            list = (List) objD;
                            if (list == null) {
                                m0Var = m0Var2;
                                m0Var.f105804a = false;
                                list = p13.j0.f134944a;
                                m0Var2 = m0Var;
                            }
                            eVar.f204169a = aVar4;
                            eVar.f204170b = m0Var2;
                            eVar.f204171c = i17;
                            eVar.f204172d = i16;
                            eVar.f204175g = 4;
                            if (F(null, list, eVar) != obj) {
                                m0Var3 = m0Var2;
                                aVar2 = aVar4;
                                if (m0Var3.f105804a) {
                                    this.f204156o = true;
                                }
                            }
                        }
                    } else {
                        i17 = i15;
                        aVar4 = aVar3;
                        m0Var.f105804a = false;
                        list = p13.j0.f134944a;
                        m0Var2 = m0Var;
                        eVar.f204169a = aVar4;
                        eVar.f204170b = m0Var2;
                        eVar.f204171c = i17;
                        eVar.f204172d = i16;
                        eVar.f204175g = 4;
                        if (F(null, list, eVar) != obj) {
                            m0Var3 = m0Var2;
                            aVar2 = aVar4;
                            if (m0Var3.f105804a) {
                                this.f204156o = true;
                            }
                        }
                    }
                }
                return obj;
            }
            aVar2 = aVar;
            Unit unit5 = Unit.INSTANCE;
            aVar2.e(null);
            return unit5;
        } catch (Throwable th7) {
            aVar2 = aVar;
            th3 = th7;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zd0.g1
    public final void l() {
        c80.y0 y0Var;
        Object obj = null;
        for (Object obj2 : C(c80.s0.HOME, null, c80.p0.f25530i)) {
            if (((c80.y0) ((o13.p) obj2).f128594a).f25646j.a().contains(c80.m0.B)) {
                obj = obj2;
                break;
            }
        }
        o13.p pVar = (o13.p) obj;
        if (pVar == null || (y0Var = (c80.y0) pVar.f128594a) == null) {
            return;
        }
        z(this, y0Var, c80.s0.HOME, true, 4);
    }

    @Override // zd0.q0
    public final Map<c80.s0, List<c80.y0>> m() {
        Map<c80.s0, List<c80.y0>> mapM;
        synchronized (this.f204155n) {
            mapM = p13.u0.m(this.f204152k);
        }
        return mapM;
    }

    @Override // zd0.g1
    public final void n(String str) {
        str.getClass();
        this.f204146e.a(ht.q.SHOW, str, c80.s0.WHATS_NEW);
    }

    @Override // zd0.q0
    public final List<c80.y0> o() {
        List<c80.y0> listB1;
        synchronized (this.f204155n) {
            listB1 = p13.h0.b1(this.f204153l);
        }
        return listB1;
    }

    @Override // zd0.g1
    public final void p(String str) {
        str.getClass();
        ge1.b.T(this.f204154m, null, null, new c(str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0181 A[LOOP:0: B:3:0x0024->B:48:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x018f A[SYNTHETIC] */
    @Override // zd0.g1
    public final ub1.l q(c80.s0 s0Var, e0 e0Var, e23.l<? super i0, Unit> lVar) {
        c80.l0 eVar;
        c80.l0 l0Var;
        c80.s0 s0Var2 = s0Var;
        s0Var2.getClass();
        lVar.getClass();
        Iterator<o13.p<c80.y0, j0>> it = C(s0Var2, e0Var, p13.x.k(c80.p0.CARD, c80.p0.BANNER, c80.p0.WHATS_NEW, c80.p0.CROSS_SELL)).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            o13.p<c80.y0, j0> next = it.next();
            c80.y0 y0Var = next.f128594a;
            j0 j0Var = next.f128595b;
            c80.l0.f25408c.getClass();
            y0Var.getClass();
            c80.p0 p0Var = y0Var.f25638b;
            c80.k0 k0Var = y0Var.f25647k;
            c80.t0 t0Var = y0Var.f25648l;
            c80.t0.b bVar = t0Var.f25590a;
            String str = t0Var.f25592c;
            String str2 = t0Var.f25591b;
            z70.x xVar = this.f204143b;
            o4.v0 v0VarC = bVar != null ? xVar.c(bVar.f25594a) : null;
            o4.v0 v0VarC2 = str2 != null ? xVar.c(str2) : null;
            int i14 = c80.l0.a.C0378a.f25411a[p0Var.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        String str3 = y0Var.f25641e;
                        if (str3 == null) {
                            a2 a2Var = a2.PROMOTIONS;
                            i2.f36769a.getClass();
                            i2.a.k(a2Var, "PromoCardData", "Missing required whats new body text");
                            s0Var2 = s0Var;
                            l0Var = null;
                        } else {
                            String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL);
                            s0Var2 = s0Var;
                            eVar = new c80.l0.d(tn.k.g(strK, str2), g22.n.d(str) ? tn.k.g(strK, str) : null, y0Var.f25640d, str3, y0Var.f25642f, s0Var2, k0Var.f25402b);
                        }
                    } else if (i14 != 4) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.PROMOTIONS, "PromoCardData", "Trying to get promo card data for an unsupported type " + p0Var);
                        l0Var = null;
                    } else {
                        eVar = new c80.l0.b(bVar != null ? ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL).concat(bVar.f25594a) : null, y0Var.f25639c, y0Var.f25640d, y0Var.f25641e, y0Var.f25642f, s0Var2, k0Var.f25402b);
                        s0Var2 = s0Var;
                    }
                } else if (v0VarC == null) {
                    a2 a2Var2 = a2.PROMOTIONS;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var2, "PromoCardData", "Missing required card image");
                    s0Var2 = s0Var;
                    l0Var = null;
                } else {
                    s0Var2 = s0Var;
                    eVar = new c80.l0.c(new o13.p(new t4.a(v0VarC, 0L, 0L, 6, null), ""), false, y0Var.f25640d, y0Var.f25641e, y0Var.f25642f, s0Var2, k0Var.f25402b);
                }
                if (l0Var == null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.PROMOTIONS, "PromosManager", "Returning promo view for location " + s0Var2);
                    return this.f204144c.b(l0Var, new s0(this, s0Var2, y0Var, 1), new s0(y0Var, this, s0Var2, 2), this.f204147f.getF203980a(), new ug2.q(this, s0Var2, y0Var, j0Var, lVar, 17));
                }
                a2 a2Var3 = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "PromosManager", "Missing PromoCardData");
            } else {
                eVar = new c80.l0.e((bVar == null || v0VarC == null) ? null : new c80.l0.e.a(new t4.a(v0VarC, 0L, 0L, 6, null), bVar.f25595b, ""), false, v0VarC2 != null ? new o13.p(new t4.a(v0VarC2, 0L, 0L, 6, null), "") : null, null, y0Var.f25640d, y0Var.f25642f, s0Var, k0Var.f25402b, null);
                s0Var2 = s0Var;
            }
            l0Var = eVar;
            if (l0Var == null) {
                i2.f36769a.getClass();
                i2.a.b(a2.PROMOTIONS, "PromosManager", "Returning promo view for location " + s0Var2);
                return this.f204144c.b(l0Var, new s0(this, s0Var2, y0Var, 1), new s0(y0Var, this, s0Var2, 2), this.f204147f.getF203980a(), new ug2.q(this, s0Var2, y0Var, j0Var, lVar, 17));
            }
            a2 a2Var4 = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var4, "PromosManager", "Missing PromoCardData");
        }
    }

    @Override // zd0.g1
    public final i0 r(Context context, String str, c80.w0 w0Var) {
        context.getClass();
        str.getClass();
        w0Var.getClass();
        this.f204146e.a(ht.q.TAP, str, c80.s0.WHATS_NEW);
        j0 j0VarA = this.f204149h.a(w0Var);
        if (j0VarA != null) {
            j0VarA.a(context);
        }
        ge1.b.T(this.f204154m, null, null, new d(str, null), 3);
        return null;
    }

    @Override // zd0.q0
    public final List<e0> s() {
        return p13.h0.b1(this.f204150i.values());
    }

    @Override // zd0.g1
    public final void t(z70.w wVar) {
        wVar.getClass();
        this.f204151j.add(wVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[LOOP:0: B:3:0x0012->B:22:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[SYNTHETIC] */
    @Override // zd0.g1
    public final o13.p v(c80.s0 s0Var, z81.b bVar) {
        c80.b0.b bVar2;
        s0Var.getClass();
        for (o13.p<c80.y0, j0> pVar : C(s0Var, null, p13.w.c(c80.p0.SYSTEM_ALERT))) {
            c80.y0 y0Var = pVar.f128594a;
            j0 j0Var = pVar.f128595b;
            c80.b0.f25300a.getClass();
            y0Var.getClass();
            String str = y0Var.f25637a;
            c80.p0 p0Var = y0Var.f25638b;
            if (c80.b0.a.C0376a.f25301a[p0Var.ordinal()] == 1) {
                if (y0Var.f25640d == null || y0Var.f25641e == null || y0Var.f25642f == null || y0Var.f25643g == null) {
                    a2 a2Var = a2.PROMOTIONS;
                    String strM = am.j.m("Missing data for promo alert ", str, " to display");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "PromoAlertData", strM);
                } else {
                    bVar2 = new c80.b0.b(y0Var.f25640d, y0Var.f25641e, y0Var.f25642f, y0Var.f25643g, s0Var);
                }
                if (bVar2 == null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.PROMOTIONS, "PromosManager", "Returning promo alert for location " + s0Var);
                    return new o13.p(str, this.f204144c.a(bVar2, new s0(this, s0Var, y0Var, 5), new s0(this, s0Var, y0Var, 0), new t0(this, s0Var, y0Var, j0Var, bVar, 0)));
                }
                a2 a2Var2 = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, "PromosManager", "Missing PromoAlertData");
            } else {
                i2.f36769a.getClass();
                i2.a.b(a2.PROMOTIONS, "PromoAlertData", "Trying to get promo alert data for an unsupported type " + p0Var);
            }
            bVar2 = null;
            if (bVar2 == null) {
                i2.f36769a.getClass();
                i2.a.b(a2.PROMOTIONS, "PromosManager", "Returning promo alert for location " + s0Var);
                return new o13.p(str, this.f204144c.a(bVar2, new s0(this, s0Var, y0Var, 5), new s0(this, s0Var, y0Var, 0), new t0(this, s0Var, y0Var, j0Var, bVar, 0)));
            }
            a2 a2Var3 = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var3, "PromosManager", "Missing PromoAlertData");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:21:0x0044, B:37:0x008a, B:39:0x008e, B:42:0x0098, B:41:0x0096), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.g1
    public final Object w(t13.d dVar) throws Throwable {
        c1 c1Var;
        z53.a aVar;
        c80.s0 s0Var;
        int i14;
        z53.a aVar2;
        Throwable th3;
        z53.a aVar3;
        String str;
        List listA;
        if (dVar instanceof c1) {
            c1Var = (c1) dVar;
            int i15 = c1Var.f203998g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c1Var.f203998g = i15 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, dVar);
            }
        } else {
            c1Var = new c1(this, dVar);
        }
        Object obj = c1Var.f203996e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = c1Var.f203998g;
        int i17 = 0;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                c1Var.f203992a = null;
                aVar = this.f204155n;
                c1Var.f203993b = aVar;
                c1Var.f203994c = 0;
                c1Var.f203998g = 1;
                if (aVar.c(c1Var) != obj2) {
                    s0Var = null;
                    i14 = 0;
                }
                return obj2;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = c1Var.f203993b;
                    try {
                        o13.r.b(obj);
                        Unit unit = Unit.INSTANCE;
                        aVar2.e(null);
                        return unit;
                    } catch (Throwable th4) {
                        th3 = th4;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                i17 = c1Var.f203995d;
                i14 = c1Var.f203994c;
                aVar3 = c1Var.f203993b;
                s0Var = c1Var.f203992a;
                try {
                    o13.r.b(obj);
                    str = (String) obj;
                    if (str != null || (listA = this.f204142a.a(str)) == null) {
                        listA = p13.j0.f134944a;
                    }
                    c1Var.f203992a = null;
                    c1Var.f203993b = aVar3;
                    c1Var.f203994c = i14;
                    c1Var.f203995d = i17;
                    c1Var.f203998g = 3;
                    if (F(s0Var, listA, c1Var) != obj2) {
                        aVar2 = aVar3;
                        Unit unit2 = Unit.INSTANCE;
                        aVar2.e(null);
                        return unit2;
                    }
                    return obj2;
                } catch (Throwable th5) {
                    th3 = th5;
                    aVar2 = aVar3;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = c1Var.f203994c;
            z53.a aVar4 = c1Var.f203993b;
            c80.s0 s0Var2 = c1Var.f203992a;
            o13.r.b(obj);
            aVar = aVar4;
            s0Var = s0Var2;
            if (x()) {
                c1Var.f203992a = s0Var;
                c1Var.f203993b = aVar;
                c1Var.f203994c = i14;
                c1Var.f203995d = 0;
                c1Var.f203998g = 2;
                Object objD = D(c1Var);
                if (objD != obj2) {
                    aVar3 = aVar;
                    obj = objD;
                    str = (String) obj;
                    if (str != null) {
                        listA = p13.j0.f134944a;
                    } else {
                        listA = p13.j0.f134944a;
                    }
                    c1Var.f203992a = null;
                    c1Var.f203993b = aVar3;
                    c1Var.f203994c = i14;
                    c1Var.f203995d = i17;
                    c1Var.f203998g = 3;
                    if (F(s0Var, listA, c1Var) != obj2) {
                        aVar2 = aVar3;
                    }
                }
                return obj2;
            }
            aVar2 = aVar;
            Unit unit3 = Unit.INSTANCE;
            aVar2.e(null);
            return unit3;
        } catch (Throwable th6) {
            aVar2 = aVar;
            th3 = th6;
            aVar2.e(null);
            throw th3;
        }
    }

    public final boolean x() {
        s3.f23252a.getClass();
        return s3.a("ROLE_DI_TESTER") || this.f204148g.c("promos_enabled");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:122:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:4: B:72:0x01dc->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[LOOP:6: B:62:0x01b8->B:135:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x019c A[LOOP:3: B:55:0x0196->B:57:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0241  */
    /* JADX WARN: Code duplicated, block: B:88:0x024d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0263  */
    /* JADX WARN: Code duplicated, block: B:97:0x0286  */
    /* JADX WARN: Code duplicated, block: B:99:0x0292  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01f6, please report this as an issue */
    public final Serializable y(List list, v13.c cVar) {
        v0 v0Var;
        List<c80.y0> list2;
        Map map;
        List list3;
        Map map2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        List list4;
        Map map3;
        c80.t0.b bVar;
        String str;
        ArrayList arrayList;
        c80.w0 w0Var;
        String str2;
        ArrayList<c80.m0> arrayList2;
        ArrayList arrayList3;
        Iterator it3;
        Iterator it4;
        p13.c.b bVarN;
        c80.s0 s0Var;
        Collection collection;
        Iterator it5;
        List list5;
        Map map4;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f204188g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f204188g = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objE = v0Var.f204186e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f204188g;
        if (i15 == 0) {
            o13.r.b(objE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                p13.d0.v(arrayList5, ((c80.y0) it6.next()).f25646j.a());
            }
            Set setG1 = p13.h0.g1(arrayList5);
            Map mapM = p13.u0.m(this.f204150i);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapM.entrySet()) {
                if (p13.h0.R(setG1, ((e0) entry.getValue()).a())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            w0 w0Var2 = new w0(linkedHashMap2, null);
            list2 = list;
            v0Var.f204182a = list2;
            v0Var.f204183b = linkedHashMap;
            v0Var.f204184c = arrayList4;
            v0Var.f204185d = linkedHashMap2;
            v0Var.f204188g = 1;
            Object objE2 = o53.c0.e(w0Var2, v0Var);
            if (objE2 != aVar) {
                map = linkedHashMap;
                objE = objE2;
                list3 = arrayList4;
                map2 = linkedHashMap2;
            }
            return aVar;
        }
        if (i15 == 1) {
            map2 = v0Var.f204185d;
            list3 = v0Var.f204184c;
            map = v0Var.f204183b;
            list2 = v0Var.f204182a;
            o13.r.b(objE);
        } else {
            if (i15 == 2) {
                map2 = v0Var.f204185d;
                list3 = v0Var.f204184c;
                map = v0Var.f204183b;
                list2 = v0Var.f204182a;
                o13.r.b(objE);
                for (c80.y0 y0Var : list2) {
                    arrayList = new ArrayList();
                    c80.n0 n0Var = y0Var.f25646j;
                    w0Var = y0Var.f25649m;
                    str2 = y0Var.f25637a;
                    Set<c80.m0> setA = n0Var.a();
                    arrayList2 = new ArrayList();
                    for (Object obj : setA) {
                        if (!((c80.m0) obj).f25462b) {
                            arrayList2.add(obj);
                        }
                    }
                    for (c80.m0 m0Var : arrayList2) {
                        try {
                            arrayList.add((e0) p13.u0.c(m0Var, map2));
                        } catch (NoSuchElementException unused) {
                            i2.a aVar2 = i2.f36769a;
                            aVar2.getClass();
                            i2.a.e(a2.PROMOTIONS, "Missing promo validator for promo " + str2 + " for " + m0Var);
                            list3.add(y0Var);
                        }
                    }
                    arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                    it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((e0) it3.next()).d(y0Var.f25646j));
                    }
                    if (arrayList3.isEmpty()) {
                        it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((l0) it4.next()) == l0.DISMISS) {
                                    z(this, y0Var, null, false, 2);
                                }
                            } else if (arrayList3.isEmpty()) {
                                it5 = arrayList3.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (((l0) it5.next()) == l0.HIDE) {
                                            list3.add(y0Var);
                                        }
                                    } else if (w0Var == null) {
                                        i2.a aVar3 = i2.f36769a;
                                        aVar3.getClass();
                                        i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                                    } else if (w0Var.equals(c80.a0.f25291b)) {
                                        w13.c cVar2 = c80.s0.E;
                                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                                        while (bVarN.hasNext()) {
                                            s0Var = (c80.s0) bVarN.next();
                                            if (y0Var.f25644h.contains(s0Var)) {
                                                collection = (List) map.get(s0Var);
                                                if (collection == null) {
                                                    collection = p13.j0.f134944a;
                                                }
                                                map.put(s0Var, p13.h0.D0(collection, y0Var));
                                            }
                                        }
                                    } else {
                                        w13.c cVar3 = c80.s0.E;
                                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                                        while (bVarN.hasNext()) {
                                            s0Var = (c80.s0) bVarN.next();
                                            if (y0Var.f25644h.contains(s0Var)) {
                                                collection = (List) map.get(s0Var);
                                                if (collection == null) {
                                                    collection = p13.j0.f134944a;
                                                }
                                                map.put(s0Var, p13.h0.D0(collection, y0Var));
                                            }
                                        }
                                    }
                                }
                            } else if (w0Var == null) {
                                i2.a aVar4 = i2.f36769a;
                                aVar4.getClass();
                                i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                            } else if (w0Var.equals(c80.a0.f25291b)) {
                                w13.c cVar4 = c80.s0.E;
                                bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                                while (bVarN.hasNext()) {
                                    s0Var = (c80.s0) bVarN.next();
                                    if (y0Var.f25644h.contains(s0Var)) {
                                        collection = (List) map.get(s0Var);
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        map.put(s0Var, p13.h0.D0(collection, y0Var));
                                    }
                                }
                            } else {
                                w13.c cVar5 = c80.s0.E;
                                bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                                while (bVarN.hasNext()) {
                                    s0Var = (c80.s0) bVarN.next();
                                    if (y0Var.f25644h.contains(s0Var)) {
                                        collection = (List) map.get(s0Var);
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        map.put(s0Var, p13.h0.D0(collection, y0Var));
                                    }
                                }
                            }
                        }
                    } else if (arrayList3.isEmpty()) {
                        it5 = arrayList3.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (((l0) it5.next()) == l0.HIDE) {
                                    list3.add(y0Var);
                                }
                            } else if (w0Var == null) {
                                i2.a aVar5 = i2.f36769a;
                                aVar5.getClass();
                                i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                            } else if (w0Var.equals(c80.a0.f25291b)) {
                                w13.c cVar6 = c80.s0.E;
                                bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                while (bVarN.hasNext()) {
                                    s0Var = (c80.s0) bVarN.next();
                                    if (y0Var.f25644h.contains(s0Var)) {
                                        collection = (List) map.get(s0Var);
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        map.put(s0Var, p13.h0.D0(collection, y0Var));
                                    }
                                }
                            } else {
                                w13.c cVar7 = c80.s0.E;
                                bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                while (bVarN.hasNext()) {
                                    s0Var = (c80.s0) bVarN.next();
                                    if (y0Var.f25644h.contains(s0Var)) {
                                        collection = (List) map.get(s0Var);
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        map.put(s0Var, p13.h0.D0(collection, y0Var));
                                    }
                                }
                            }
                        }
                    } else if (w0Var == null) {
                        i2.a aVar6 = i2.f36769a;
                        aVar6.getClass();
                        i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                    } else if (w0Var.equals(c80.a0.f25291b) || this.f204149h.a(w0Var) != null) {
                        w13.c cVar8 = c80.s0.E;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                        while (bVarN.hasNext()) {
                            s0Var = (c80.s0) bVarN.next();
                            if (y0Var.f25644h.contains(s0Var)) {
                                collection = (List) map.get(s0Var);
                                if (collection == null) {
                                    collection = p13.j0.f134944a;
                                }
                                map.put(s0Var, p13.h0.D0(collection, y0Var));
                            }
                        }
                    } else {
                        i2.a aVar7 = i2.f36769a;
                        aVar7.getClass();
                        i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to lack of router for target " + w0Var);
                    }
                }
                ArrayList arrayListS = p13.y.s(map.values());
                linkedHashSet = new LinkedHashSet();
                it = arrayListS.iterator();
                while (it.hasNext()) {
                    c80.t0 t0Var = ((c80.y0) it.next()).f25648l;
                    bVar = t0Var.f25590a;
                    if (bVar != null) {
                        linkedHashSet.add(bVar.f25594a);
                    }
                    str = t0Var.f25591b;
                    if (str != null) {
                        linkedHashSet.add(str);
                    }
                }
                x0 x0Var = new x0(i53.a.h(linkedHashSet), this, null);
                v0Var.f204182a = null;
                v0Var.f204183b = map;
                v0Var.f204184c = list3;
                v0Var.f204185d = null;
                v0Var.f204188g = 3;
                objE = o53.c0.e(x0Var, v0Var);
                if (objE != aVar) {
                    list4 = list3;
                    map3 = map;
                    v0Var.f204182a = null;
                    v0Var.f204183b = map3;
                    v0Var.f204184c = list4;
                    v0Var.f204185d = null;
                    v0Var.f204188g = 4;
                    if (g8.i.o((Collection) objE, v0Var) != aVar) {
                        list5 = list4;
                        map4 = map3;
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                list4 = v0Var.f204184c;
                map3 = v0Var.f204183b;
                o13.r.b(objE);
                v0Var.f204182a = null;
                v0Var.f204183b = map3;
                v0Var.f204184c = list4;
                v0Var.f204185d = null;
                v0Var.f204188g = 4;
                if (g8.i.o((Collection) objE, v0Var) != aVar) {
                    list5 = list4;
                    map4 = map3;
                }
                return aVar;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list5 = v0Var.f204184c;
            map4 = v0Var.f204183b;
            o13.r.b(objE);
        }
        return new o13.p(map4, list5);
        v0Var.f204182a = list2;
        v0Var.f204183b = map;
        v0Var.f204184c = list3;
        v0Var.f204185d = map2;
        v0Var.f204188g = 2;
        if (g8.i.o((Collection) objE, v0Var) != aVar) {
            while (r1.hasNext()) {
                arrayList = new ArrayList();
                c80.n0 n0Var2 = y0Var.f25646j;
                w0Var = y0Var.f25649m;
                str2 = y0Var.f25637a;
                Set<c80.m0> setA2 = n0Var2.a();
                arrayList2 = new ArrayList();
                while (r13.hasNext()) {
                    if (!((c80.m0) obj).f25462b) {
                        arrayList2.add(obj);
                    }
                }
                while (r5.hasNext()) {
                    arrayList.add((e0) p13.u0.c(m0Var, map2));
                }
                arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((e0) it3.next()).d(y0Var.f25646j));
                }
                if (arrayList3.isEmpty()) {
                    it4 = arrayList3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((l0) it4.next()) == l0.DISMISS) {
                                z(this, y0Var, null, false, 2);
                            }
                        } else if (arrayList3.isEmpty()) {
                            it5 = arrayList3.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (((l0) it5.next()) == l0.HIDE) {
                                        list3.add(y0Var);
                                    }
                                } else if (w0Var == null) {
                                    i2.a aVar8 = i2.f36769a;
                                    aVar8.getClass();
                                    i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                                } else if (w0Var.equals(c80.a0.f25291b)) {
                                    w13.c cVar9 = c80.s0.E;
                                    bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar9, cVar9);
                                    while (bVarN.hasNext()) {
                                        s0Var = (c80.s0) bVarN.next();
                                        if (y0Var.f25644h.contains(s0Var)) {
                                            collection = (List) map.get(s0Var);
                                            if (collection == null) {
                                                collection = p13.j0.f134944a;
                                            }
                                            map.put(s0Var, p13.h0.D0(collection, y0Var));
                                        }
                                    }
                                } else {
                                    w13.c cVar10 = c80.s0.E;
                                    bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar10, cVar10);
                                    while (bVarN.hasNext()) {
                                        s0Var = (c80.s0) bVarN.next();
                                        if (y0Var.f25644h.contains(s0Var)) {
                                            collection = (List) map.get(s0Var);
                                            if (collection == null) {
                                                collection = p13.j0.f134944a;
                                            }
                                            map.put(s0Var, p13.h0.D0(collection, y0Var));
                                        }
                                    }
                                }
                            }
                        } else if (w0Var == null) {
                            i2.a aVar9 = i2.f36769a;
                            aVar9.getClass();
                            i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                        } else if (w0Var.equals(c80.a0.f25291b)) {
                            w13.c cVar11 = c80.s0.E;
                            bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar11, cVar11);
                            while (bVarN.hasNext()) {
                                s0Var = (c80.s0) bVarN.next();
                                if (y0Var.f25644h.contains(s0Var)) {
                                    collection = (List) map.get(s0Var);
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    map.put(s0Var, p13.h0.D0(collection, y0Var));
                                }
                            }
                        } else {
                            w13.c cVar12 = c80.s0.E;
                            bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar12, cVar12);
                            while (bVarN.hasNext()) {
                                s0Var = (c80.s0) bVarN.next();
                                if (y0Var.f25644h.contains(s0Var)) {
                                    collection = (List) map.get(s0Var);
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    map.put(s0Var, p13.h0.D0(collection, y0Var));
                                }
                            }
                        }
                    }
                } else if (arrayList3.isEmpty()) {
                    it5 = arrayList3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (((l0) it5.next()) == l0.HIDE) {
                                list3.add(y0Var);
                            }
                        } else if (w0Var == null) {
                            i2.a aVar10 = i2.f36769a;
                            aVar10.getClass();
                            i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                        } else if (w0Var.equals(c80.a0.f25291b)) {
                            w13.c cVar13 = c80.s0.E;
                            bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar13, cVar13);
                            while (bVarN.hasNext()) {
                                s0Var = (c80.s0) bVarN.next();
                                if (y0Var.f25644h.contains(s0Var)) {
                                    collection = (List) map.get(s0Var);
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    map.put(s0Var, p13.h0.D0(collection, y0Var));
                                }
                            }
                        } else {
                            w13.c cVar14 = c80.s0.E;
                            bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar14, cVar14);
                            while (bVarN.hasNext()) {
                                s0Var = (c80.s0) bVarN.next();
                                if (y0Var.f25644h.contains(s0Var)) {
                                    collection = (List) map.get(s0Var);
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    map.put(s0Var, p13.h0.D0(collection, y0Var));
                                }
                            }
                        }
                    }
                } else if (w0Var == null) {
                    i2.a aVar11 = i2.f36769a;
                    aVar11.getClass();
                    i2.a.f(a2.PROMOTIONS, "PromosManager", "Filtering promo " + str2 + " due to unknown target");
                } else if (w0Var.equals(c80.a0.f25291b)) {
                    w13.c cVar15 = c80.s0.E;
                    bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar15, cVar15);
                    while (bVarN.hasNext()) {
                        s0Var = (c80.s0) bVarN.next();
                        if (y0Var.f25644h.contains(s0Var)) {
                            collection = (List) map.get(s0Var);
                            if (collection == null) {
                                collection = p13.j0.f134944a;
                            }
                            map.put(s0Var, p13.h0.D0(collection, y0Var));
                        }
                    }
                } else {
                    w13.c cVar16 = c80.s0.E;
                    bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar16, cVar16);
                    while (bVarN.hasNext()) {
                        s0Var = (c80.s0) bVarN.next();
                        if (y0Var.f25644h.contains(s0Var)) {
                            collection = (List) map.get(s0Var);
                            if (collection == null) {
                                collection = p13.j0.f134944a;
                            }
                            map.put(s0Var, p13.h0.D0(collection, y0Var));
                        }
                    }
                }
            }
            ArrayList arrayListS2 = p13.y.s(map.values());
            linkedHashSet = new LinkedHashSet();
            it = arrayListS2.iterator();
            while (it.hasNext()) {
                c80.t0 t0Var2 = ((c80.y0) it.next()).f25648l;
                bVar = t0Var2.f25590a;
                if (bVar != null) {
                    linkedHashSet.add(bVar.f25594a);
                }
                str = t0Var2.f25591b;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            x0 x0Var2 = new x0(i53.a.h(linkedHashSet), this, null);
            v0Var.f204182a = null;
            v0Var.f204183b = map;
            v0Var.f204184c = list3;
            v0Var.f204185d = null;
            v0Var.f204188g = 3;
            objE = o53.c0.e(x0Var2, v0Var);
            if (objE != aVar) {
                list4 = list3;
                map3 = map;
                v0Var.f204182a = null;
                v0Var.f204183b = map3;
                v0Var.f204184c = list4;
                v0Var.f204185d = null;
                v0Var.f204188g = 4;
                if (g8.i.o((Collection) objE, v0Var) != aVar) {
                    list5 = list4;
                    map4 = map3;
                    return new o13.p(map4, list5);
                }
            }
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzd0/u0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PROMOS_ENABLED", "WHATS_NEW_CARDS_KEY", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
