package yu0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import e23.q;
import o13.r;
import o53.m0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import r53.b2;
import r53.c2;
import r53.j;
import r53.k0;
import r53.k2;
import r53.l2;
import r53.m;
import r53.m1;
import r53.p0;
import r53.p2;
import r53.q2;
import r53.s;
import r53.z1;
import su0.b0;
import su0.t;
import su0.z;
import wd2.f0;
import wd2.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0012B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lyu0/f;", "Landroidx/lifecycle/u1;", "Lsu0/z;", "Lsu0/a;", "Lsu0/b0;", "Luu0/h;", "getLiveTrackPlusData", "Lyu0/e;", "dataFormatter", "Lru0/c;", "liveTrackPreferences", "profileUrlDelegate", "accessCodeDelegate", "settingsDelegate", "Laz0/c;", "networkStateObserver", "<init>", "(Luu0/h;Lyu0/e;Lru0/c;Lsu0/z;Lsu0/a;Lsu0/b0;Laz0/c;)V", "c", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 implements z, su0.a, b0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f199702y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f199703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su0.a f199704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f199705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uu0.h f199706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yu0.e f199707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ru0.c f199708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r53.i<az0.c.a> f199709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f199710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f199711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f199712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f199713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f199714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f199715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f199716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f199717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f199718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f199719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f199720r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f199721t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f199722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f199723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f199724x;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$1", f = "LiveTrackPlusViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f199725a;

        /* JADX INFO: renamed from: yu0.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou0/d;", "data", "", "<anonymous>", "(Lou0/d;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$1$1", f = "LiveTrackPlusViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
        public static final class C3737a extends v13.i implements p<ou0.d, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public z1 f199727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public f f199728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f199729c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ev0.c f199730d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public g3.a f199731e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f199732f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f199733g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public /* synthetic */ Object f199734h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ f f199735i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3737a(f fVar, t13.d<? super C3737a> dVar) {
                super(2, dVar);
                this.f199735i = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3737a c3737a = new C3737a(this.f199735i, dVar);
                c3737a.f199734h = obj;
                return c3737a;
            }

            @Override // e23.p
            public final Object invoke(ou0.d dVar, t13.d<? super Unit> dVar2) {
                return ((C3737a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
            
                if (r10.b(r8, com.garmin.android.apps.connectmobile.g3.a.d(r7)) != false) goto L32;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a7 -> B:6:0x0021). Please report as a decompilation issue!!! */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                f fVar;
                z1 z1Var;
                int i14;
                Object value;
                g3.a aVar;
                String str;
                ev0.c cVar;
                Object objT1;
                ou0.d dVar = (ou0.d) this.f199734h;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f199733g;
                if (i15 == 0) {
                    r.b(obj);
                    if (dVar != null) {
                        f fVar2 = this.f199735i;
                        fVar = fVar2;
                        z1Var = fVar2.f199711i;
                        i14 = 0;
                        value = z1Var.getValue();
                        aVar = g3.f35298f;
                        int i16 = f.f199702y;
                        fVar.getClass();
                        if (dVar.f133975b instanceof c80.p.c) {
                            cVar = new ev0.c(null, null, null, null, null, null, null, 127, null);
                        } else {
                            Boolean bool = dVar.f133974a;
                            k kVar = dVar.f133977d;
                            if (kVar == null || (str = kVar.f184516b) == null) {
                                str = "live.garmin.com/";
                            }
                            cVar = new ev0.c(bool, Boolean.valueOf(dVar.a()), str, kVar != null ? kVar.f184515a : null, null, null, null, 112, null);
                        }
                        this.f199734h = dVar;
                        this.f199727a = z1Var;
                        this.f199728b = fVar;
                        this.f199729c = value;
                        this.f199730d = cVar;
                        this.f199731e = aVar;
                        this.f199732f = i14;
                        this.f199733g = 1;
                        objT1 = fVar.f199704b.t1(this);
                        if (objT1 == aVar2) {
                            return aVar2;
                        }
                        ev0.c cVarA = ev0.c.a(cVar, null, (String) ((f0) objT1).f184457a, null, null, 111);
                        aVar.getClass();
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = this.f199732f;
                    aVar = this.f199731e;
                    cVar = this.f199730d;
                    value = this.f199729c;
                    fVar = this.f199728b;
                    z1Var = this.f199727a;
                    r.b(obj);
                    objT1 = obj;
                    ev0.c cVarA2 = ev0.c.a(cVar, null, (String) ((f0) objT1).f184457a, null, null, 111);
                    aVar.getClass();
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199725a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = f.this;
                b2 b2Var = fVar.f199710h;
                C3737a c3737a = new C3737a(fVar, null);
                this.f199725a = 1;
                if (s.k(b2Var, c3737a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$2", f = "LiveTrackPlusViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f199736a;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Lev0/c;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$2$1", f = "LiveTrackPlusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<g3<? extends ev0.c>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f199738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f199739b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f199739b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f199739b, dVar);
                aVar.f199738a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(g3<? extends ev0.c> g3Var, t13.d<? super Unit> dVar) {
                return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                T t7;
                String str;
                Object value2;
                ev0.c cVar;
                String str2;
                Object value3;
                boolean z14;
                g3 g3Var = (g3) this.f199738a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                f fVar = this.f199739b;
                p2 p2Var = fVar.f199717o;
                do {
                    value = p2Var.getValue();
                    t7 = g3Var.f35301b;
                    ev0.c cVar2 = (ev0.c) t7;
                    str = cVar2 != null ? cVar2.f66155d : null;
                    if (str == null) {
                        str = "";
                    }
                } while (!p2Var.b(value, str));
                p2 p2Var2 = fVar.f199719q;
                do {
                    value2 = p2Var2.getValue();
                    cVar = (ev0.c) t7;
                    str2 = cVar != null ? cVar.f66156e : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                } while (!p2Var2.b(value2, str2));
                p2 p2Var3 = fVar.f199721t;
                do {
                    value3 = p2Var3.getValue();
                    ((Boolean) value3).getClass();
                    z14 = false;
                    if (cVar != null && cVar.b()) {
                        z14 = true;
                    }
                } while (!p2Var3.b(value3, Boolean.valueOf(z14)));
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199736a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = f.this;
                b2 b2Var = fVar.f199712j;
                a aVar2 = new a(fVar, null);
                this.f199736a = 1;
                if (s.k(b2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "input", "Lcom/garmin/android/apps/connectmobile/g3;", "Lev0/c;", "uiState", "Lo13/p;", "<anonymous>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/g3;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$inputState$1", f = "LiveTrackPlusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements q<String, g3<? extends ev0.c>, t13.d<? super o13.p<? extends String, ? extends g3<? extends ev0.c>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f199740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ g3 f199741b;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(String str, g3<? extends ev0.c> g3Var, t13.d<? super o13.p<? extends String, ? extends g3<? extends ev0.c>>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f199740a = str;
            dVar2.f199741b = g3Var;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = this.f199740a;
            g3 g3Var = this.f199741b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return new o13.p(str, g3Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lyu0/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$inputState$2$1", f = "LiveTrackPlusViewModel.kt", l = {91, 94, 96, 98, 109}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<j<? super yu0.c>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f199742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f199743b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f199745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g3<ev0.c> f199746e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, g3<ev0.c> g3Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f199745d = str;
            this.f199746e = g3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = f.this.new e(this.f199745d, this.f199746e, dVar);
            eVar.f199743b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super yu0.c> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0070  */
        /* JADX WARN: Code duplicated, block: B:31:0x0078  */
        /* JADX WARN: Code duplicated, block: B:32:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x0082  */
        /* JADX WARN: Code duplicated, block: B:37:0x0085  */
        /* JADX WARN: Code duplicated, block: B:40:0x0092 A[PHI: r12
          0x0092: PHI (r12v18 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:38:0x008f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0097  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:46:0x00a6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00de, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L61;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:40:0x0092, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ev0.c cVar;
            String str;
            f0 f0Var;
            boolean zG;
            Exception exc;
            yu0.c cVar2;
            p2 p2Var;
            Object value;
            j jVar = (j) this.f199743b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199742a;
            String str2 = this.f199745d;
            f fVar = f.this;
            if (i14 == 0) {
                r.b(obj);
                if (fVar.k(str2)) {
                    yu0.c cVar3 = yu0.c.NORMAL;
                    this.f199743b = jVar;
                    this.f199742a = 2;
                    if (jVar.emit(cVar3, this) != aVar) {
                        this.f199743b = jVar;
                        this.f199742a = 3;
                        if (m0.b(2000L, this) != aVar) {
                            cVar = this.f199746e.f35301b;
                            if (cVar != null) {
                                str = cVar.f66155d;
                            } else {
                                str = null;
                            }
                            if (p005kotlin.jvm.internal.s.g(str2, str)) {
                                return Unit.INSTANCE;
                            }
                            this.f199743b = jVar;
                            this.f199742a = 4;
                            obj = fVar.f199703a.v3(str2, this);
                            if (obj != aVar) {
                                f0Var = (f0) obj;
                                if (f0Var != null) {
                                    zG = p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    cVar2 = yu0.c.SUCCESS;
                                } else {
                                    if (f0Var != null ? p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.FALSE) : false) {
                                        cVar2 = yu0.c.ERROR;
                                    } else {
                                        if (f0Var != null) {
                                            exc = f0Var.f184458b;
                                        } else {
                                            exc = null;
                                        }
                                        if (exc != null) {
                                            p2Var = fVar.f199715m;
                                            do {
                                                value = p2Var.getValue();
                                                ((Boolean) value).getClass();
                                            } while (!p2Var.b(value, Boolean.TRUE));
                                            cVar2 = yu0.c.NORMAL;
                                        } else {
                                            cVar2 = yu0.c.ERROR;
                                        }
                                    }
                                }
                                this.f199743b = null;
                                this.f199742a = 5;
                            }
                        }
                    }
                } else {
                    yu0.c cVar4 = yu0.c.ERROR_INVALID_CHARACTERS;
                    this.f199743b = null;
                    this.f199742a = 1;
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                r.b(obj);
                this.f199743b = jVar;
                this.f199742a = 3;
                if (m0.b(2000L, this) != aVar) {
                    cVar = this.f199746e.f35301b;
                    if (cVar != null) {
                        str = cVar.f66155d;
                    } else {
                        str = null;
                    }
                    if (p005kotlin.jvm.internal.s.g(str2, str)) {
                        return Unit.INSTANCE;
                    }
                    this.f199743b = jVar;
                    this.f199742a = 4;
                    obj = fVar.f199703a.v3(str2, this);
                    if (obj != aVar) {
                        f0Var = (f0) obj;
                        if (f0Var != null) {
                            zG = p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.TRUE);
                        } else {
                            zG = false;
                        }
                        if (zG) {
                            cVar2 = yu0.c.SUCCESS;
                        } else {
                            if (f0Var != null ? p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.FALSE) : false) {
                                cVar2 = yu0.c.ERROR;
                            } else {
                                if (f0Var != null) {
                                    exc = f0Var.f184458b;
                                } else {
                                    exc = null;
                                }
                                if (exc != null) {
                                    p2Var = fVar.f199715m;
                                    do {
                                        value = p2Var.getValue();
                                        ((Boolean) value).getClass();
                                    } while (!p2Var.b(value, Boolean.TRUE));
                                    cVar2 = yu0.c.NORMAL;
                                } else {
                                    cVar2 = yu0.c.ERROR;
                                }
                            }
                        }
                        this.f199743b = null;
                        this.f199742a = 5;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                r.b(obj);
                cVar = this.f199746e.f35301b;
                if (cVar != null) {
                    str = cVar.f66155d;
                } else {
                    str = null;
                }
                if (p005kotlin.jvm.internal.s.g(str2, str)) {
                    return Unit.INSTANCE;
                }
                this.f199743b = jVar;
                this.f199742a = 4;
                obj = fVar.f199703a.v3(str2, this);
                if (obj != aVar) {
                    f0Var = (f0) obj;
                    if (f0Var != null) {
                        zG = p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.TRUE);
                    } else {
                        zG = false;
                    }
                    if (zG) {
                        cVar2 = yu0.c.SUCCESS;
                    } else {
                        if (f0Var != null ? p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.FALSE) : false) {
                            cVar2 = yu0.c.ERROR;
                        } else {
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc != null) {
                                p2Var = fVar.f199715m;
                                do {
                                    value = p2Var.getValue();
                                    ((Boolean) value).getClass();
                                } while (!p2Var.b(value, Boolean.TRUE));
                                cVar2 = yu0.c.NORMAL;
                            } else {
                                cVar2 = yu0.c.ERROR;
                            }
                        }
                    }
                    this.f199743b = null;
                    this.f199742a = 5;
                }
                return aVar;
            }
            if (i14 == 4) {
                r.b(obj);
                f0Var = (f0) obj;
                if (f0Var != null) {
                    zG = p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.TRUE);
                } else {
                    zG = false;
                }
                if (zG) {
                    cVar2 = yu0.c.SUCCESS;
                } else {
                    if (f0Var != null ? p005kotlin.jvm.internal.s.g(f0Var.f184457a, Boolean.FALSE) : false) {
                        cVar2 = yu0.c.ERROR;
                    } else {
                        if (f0Var != null) {
                            exc = f0Var.f184458b;
                        } else {
                            exc = null;
                        }
                        if (exc != null) {
                            p2Var = fVar.f199715m;
                            do {
                                value = p2Var.getValue();
                                ((Boolean) value).getClass();
                            } while (!p2Var.b(value, Boolean.TRUE));
                            cVar2 = yu0.c.NORMAL;
                        } else {
                            cVar2 = yu0.c.ERROR;
                        }
                    }
                }
                this.f199743b = null;
                this.f199742a = 5;
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: yu0.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laz0/c$a;", "networkStatus", "Lr53/i;", "Lou0/d;", "<anonymous>", "(Laz0/c$a;)Lr53/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$liveTrackPlusData$1", f = "LiveTrackPlusViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class C3738f extends v13.i implements p<az0.c.a, t13.d<? super r53.i<? extends ou0.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f199747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f199748b;

        /* JADX INFO: renamed from: yu0.f$f$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou0/d;", "ltPlusData", "", "<anonymous>", "(Lou0/d;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$liveTrackPlusData$1$1", f = "LiveTrackPlusViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<ou0.d, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public p2 f199750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f199751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f199752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f199753d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f199753d = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f199753d, dVar);
                aVar.f199752c = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(ou0.d dVar, t13.d<? super Unit> dVar2) {
                return ((a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                p2 p2Var;
                ou0.d dVar = (ou0.d) this.f199752c;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f199751b;
                if (i14 == 0) {
                    r.b(obj);
                    f fVar = this.f199753d;
                    p2 p2Var2 = fVar.f199713k;
                    c80.p pVar = dVar.f133975b;
                    this.f199752c = null;
                    this.f199750a = p2Var2;
                    this.f199751b = 1;
                    obj = f.x4(fVar, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p2Var = p2Var2;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p2Var = this.f199750a;
                    r.b(obj);
                }
                p2Var.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        public C3738f(t13.d<? super C3738f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3738f c3738f = f.this.new C3738f(dVar);
            c3738f.f199748b = obj;
            return c3738f;
        }

        @Override // e23.p
        public final Object invoke(az0.c.a aVar, t13.d<? super r53.i<? extends ou0.d>> dVar) {
            return ((C3738f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            az0.c.a aVar = (az0.c.a) this.f199748b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199747a;
            f fVar = f.this;
            if (i14 == 0) {
                r.b(obj);
                if (aVar != az0.c.a.Available) {
                    return new m(null);
                }
                uu0.h hVar = fVar.f199706d;
                this.f199748b = null;
                this.f199747a = 1;
                obj = hVar.b(this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return new m1((r53.i) obj, new a(fVar, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<unused var>", "Lyu0/c;", "inputState", "accessCode", "", "accessCodeSwitch", "<anonymous>", "(Ljava/lang/String;Lyu0/c;Ljava/lang/String;Z)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$saveEnabled$1", f = "LiveTrackPlusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.s<String, yu0.c, String, Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yu0.c f199754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ String f199755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f199756c;

        public g(t13.d<? super g> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(String str, yu0.c cVar, String str2, Boolean bool, t13.d<? super Boolean> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = f.this.new g(dVar);
            gVar.f199754a = cVar;
            gVar.f199755b = str2;
            gVar.f199756c = zBooleanValue;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002b  */
        /* JADX WARN: Code duplicated, block: B:13:0x003b  */
        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Code duplicated, block: B:6:0x001d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            yu0.c cVar;
            yu0.c cVar2 = this.f199754a;
            String str = this.f199755b;
            boolean z15 = this.f199756c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f fVar = f.this;
            if (!z15) {
                if (!z15) {
                    cVar = yu0.c.SUCCESS;
                    if (cVar2 == cVar) {
                        int i14 = f.f199702y;
                        if (!fVar.B4()) {
                            if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                                int i15 = f.f199702y;
                                if (!fVar.z4()) {
                                }
                            }
                        }
                        z14 = true;
                    } else if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                        int i16 = f.f199702y;
                        if (!fVar.z4()) {
                        }
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            }
            fVar.getClass();
            str.getClass();
            if (fVar.f199704b.i(str)) {
                cVar = yu0.c.SUCCESS;
                if (cVar2 == cVar) {
                    int i17 = f.f199702y;
                    if (!fVar.B4()) {
                        if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                            int i18 = f.f199702y;
                            if (!fVar.z4()) {
                            }
                        }
                    }
                    z14 = true;
                } else if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                    int i19 = f.f199702y;
                    if (!fVar.z4()) {
                    }
                    z14 = true;
                }
            } else if (!z15) {
                cVar = yu0.c.SUCCESS;
                if (cVar2 == cVar) {
                    int i110 = f.f199702y;
                    if (!fVar.B4()) {
                        if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                            int i111 = f.f199702y;
                            if (!fVar.z4() || fVar.y4()) {
                            }
                        }
                    }
                    z14 = true;
                } else if (x.k(yu0.c.NORMAL, cVar).contains(cVar2)) {
                    int i112 = f.f199702y;
                    if (!fVar.z4()) {
                    }
                    z14 = true;
                }
            }
            return Boolean.valueOf(z14);
            z14 = false;
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$special$$inlined$flatMapLatest$1", f = "LiveTrackPlusViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements q<j<? super yu0.c>, o13.p<? extends String, ? extends g3<? extends ev0.c>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f199758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f199759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f199760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f199761d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(t13.d dVar, f fVar) {
            super(3, dVar);
            this.f199761d = fVar;
        }

        @Override // e23.q
        public final Object invoke(j<? super yu0.c> jVar, o13.p<? extends String, ? extends g3<? extends ev0.c>> pVar, t13.d<? super Unit> dVar) {
            h hVar = new h(dVar, this.f199761d);
            hVar.f199759b = jVar;
            hVar.f199760c = pVar;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199758a;
            if (i14 == 0) {
                r.b(obj);
                j jVar = this.f199759b;
                o13.p pVar = (o13.p) this.f199760c;
                c2 c2Var = new c2(this.f199761d.new e((String) pVar.f128594a, (g3) pVar.f128595b, null));
                this.f199759b = null;
                this.f199760c = null;
                this.f199758a = 1;
                if (s.v(jVar, c2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new c(null);
    }

    public f(uu0.h hVar, yu0.e eVar, ru0.c cVar, z zVar, su0.a aVar, b0 b0Var, az0.c cVar2) {
        hVar.getClass();
        eVar.getClass();
        cVar.getClass();
        zVar.getClass();
        aVar.getClass();
        b0Var.getClass();
        cVar2.getClass();
        this.f199703a = zVar;
        this.f199704b = aVar;
        this.f199705c = b0Var;
        this.f199706d = hVar;
        this.f199707e = eVar;
        this.f199708f = cVar;
        r53.b bVarA = cVar2.a();
        this.f199709g = bVarA;
        C3738f c3738f = new C3738f(null);
        int i14 = p0.f150790a;
        r53.m0 m0Var = new r53.m0(new k0(bVarA, c3738f));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.f199710h = s.K(m0Var, aVarA, l2Var, null);
        g3.a aVar2 = g3.f35298f;
        ev0.c cVar3 = new ev0.c(null, null, null, null, null, null, null, 127, null);
        aVar2.getClass();
        p2 p2VarA = q2.a(g3.a.b(cVar3));
        this.f199711i = p2VarA;
        b2 b2VarD = s.d(p2VarA);
        this.f199712j = b2VarD;
        p2 p2VarA2 = q2.a(yu0.b.a.f199691a);
        this.f199713k = p2VarA2;
        this.f199714l = p2VarA2;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this.f199715m = p2VarA3;
        this.f199716n = p2VarA3;
        p2 p2VarA4 = q2.a("");
        this.f199717o = p2VarA4;
        this.f199718p = p2VarA4;
        p2 p2VarA5 = q2.a("");
        this.f199719q = p2VarA5;
        this.f199720r = p2VarA5;
        p2 p2VarA6 = q2.a(bool);
        this.f199721t = p2VarA6;
        this.f199722v = p2VarA6;
        b2 b2VarK = s.K(s.N(new r53.u1(p2VarA4, b2VarD, new d(null)), new h(null, this)), v1.a(this), l2Var, yu0.c.NORMAL);
        this.f199723w = b2VarK;
        this.f199724x = s.K(s.m(p2VarA4, b2VarK, p2VarA5, p2VarA6, new g(null)), v1.a(this), l2Var, bool);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(f fVar, c80.p pVar, v13.c cVar) {
        yu0.h hVar;
        yu0.a aVar;
        fVar.getClass();
        if (cVar instanceof yu0.h) {
            hVar = (yu0.h) cVar;
            int i14 = hVar.f199766c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f199766c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new yu0.h(fVar, cVar);
            }
        } else {
            hVar = new yu0.h(fVar, cVar);
        }
        Object objH = hVar.f199764a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f199766c;
        if (i15 == 0) {
            r.b(objH);
            if (pVar != null && (pVar instanceof c80.p.a)) {
                c80.p.a aVar3 = (c80.p.a) pVar;
                if (g22.k.e(aVar3.f25519a, DateTime.now(), DateTime.now().plusDays(15)) && !aVar3.f25520b) {
                    aVar = yu0.a.SUBSCRIPTION_EXPIRING;
                }
                return (aVar != null || fVar.f199708f.c(aVar)) ? yu0.b.a.f199691a : new yu0.b.C3736b(aVar);
            }
            if (pVar != null) {
                hVar.f199766c = 1;
                objH = ((pVar instanceof c80.p.b) || (pVar instanceof c80.p.c)) ? t.f161004a.h(hVar) : Boolean.FALSE;
                if (objH == aVar2) {
                    return aVar2;
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
            }
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objH);
        if (((Boolean) objH).booleanValue()) {
            aVar = yu0.a.SUBSCRIPTION_EXPIRED;
        } else {
            aVar = null;
        }
        if (aVar != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A4() {
        p2 p2Var;
        Object value;
        ev0.c cVarA;
        do {
            p2Var = this.f199711i;
            value = p2Var.getValue();
            g3.a aVar = g3.f35298f;
            ev0.c cVar = (ev0.c) ((g3) value).f35301b;
            cVarA = cVar != null ? ev0.c.a(cVar, null, null, null, null, 63) : null;
            aVar.getClass();
        } while (!p2Var.b(value, g3.a.d(cVarA)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B4() {
        Object value = this.f199718p.getValue();
        ev0.c cVar = (ev0.c) ((g3) this.f199712j.f150540a.getValue()).f35301b;
        String str = cVar != null ? cVar.f66155d : null;
        if (str == null) {
            str = "";
        }
        return !p005kotlin.jvm.internal.s.g(value, str);
    }

    @Override // su0.a
    public final Object J1(String str, i iVar) {
        return this.f199704b.J1(str, iVar);
    }

    @Override // su0.b0
    public final Object b(t13.d<? super f0<ge2.e>> dVar) {
        return this.f199705c.b(dVar);
    }

    @Override // su0.a
    public final boolean i(String str) {
        str.getClass();
        return this.f199704b.i(str);
    }

    @Override // su0.z
    public final boolean k(String str) {
        str.getClass();
        return this.f199703a.k(str);
    }

    @Override // su0.a
    public final Object k2(i iVar) {
        return this.f199704b.k2(iVar);
    }

    @Override // su0.z
    public final Object o1(String str, i iVar) {
        return this.f199703a.o1(str, iVar);
    }

    @Override // su0.a
    public final Object t1(a.C3737a c3737a) {
        return this.f199704b.t1(c3737a);
    }

    @Override // su0.z
    public final Object v3(String str, e eVar) {
        return this.f199703a.v3(str, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y4() {
        Object value = this.f199720r.getValue();
        ev0.c cVar = (ev0.c) ((g3) this.f199712j.f150540a.getValue()).f35301b;
        String str = cVar != null ? cVar.f66156e : null;
        if (str == null) {
            str = "";
        }
        return !p005kotlin.jvm.internal.s.g(value, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z4() {
        ev0.c cVar = (ev0.c) ((g3) this.f199712j.f150540a.getValue()).f35301b;
        boolean z14 = false;
        if (cVar != null && ((Boolean) this.f199722v.getValue()).booleanValue() == cVar.b()) {
            z14 = true;
        }
        return !z14;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyu0/f$c;", "", "<init>", "()V", "", "PROFILE_URL_MIN_CHAR", "I", "ACCESS_CODE_MIN_CHAR", "PROFILE_URL_ACCESS_CODE_MAX_CHAR", "", "TWO_SECONDS", "J", "EXPIRING_INTERVAL_DAYS", "", "BASE_PROFILE_URL", "Ljava/lang/String;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
