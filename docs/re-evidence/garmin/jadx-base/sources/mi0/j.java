package mi0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.mlkit.common.MlKitException;
import d53.w;
import java.util.LinkedHashMap;
import java.util.Map;
import li0.d0;
import li0.e0;
import li0.l0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.k0;
import p13.u0;
import r53.a2;
import r53.p2;
import r53.q2;
import yc.h3;
import yc.i0;
import yc.t2;
import yc.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lmi0/j;", "Landroidx/lifecycle/u1;", "", "displayName", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f118892t = new d(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f118893v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f118894w = new b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f118895x = new c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u9.a f118896y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei0.d f118899c = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qo1.c f118900d = (qo1.c) KoinJavaComponent.get$default(qo1.c.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f118901e = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f118902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f118903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f118904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f118905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f118906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f118907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f118908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r53.u1 f118909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r53.u1 f118910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f118911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r53.u1 f118912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r53.u1 f118913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f118914r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$1", f = "OthersFriendListViewModel.kt", l = {201, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118915a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0047  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118915a;
            j jVar = j.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        p2 p2Var = jVar.f118914r;
                        String fullName = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).getFullName();
                        this.f118915a = 2;
                        p2Var.setValue(fullName);
                    }
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            if (jVar.f118898b == null) {
                qo1.c cVar = jVar.f118900d;
                String str = jVar.f118897a;
                if (str == null) {
                    str = "";
                }
                this.f118915a = 1;
                qo1.c.a aVar2 = qo1.c.f145960d;
                w13.c cVar2 = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
                cVar.getClass();
                obj = f0.J(cVar, new qo1.f(cVar, str, cVar2, null), this);
                if (obj != aVar) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        p2 p2Var2 = jVar.f118914r;
                        String fullName2 = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).getFullName();
                        this.f118915a = 2;
                        p2Var2.setValue(fullName2);
                    }
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"mi0/j$b", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements CreationExtras.c<String> {
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"mi0/j$c", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements CreationExtras.c<String> {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "Lji0/m;", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerFlow$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<Map<String, ? extends l0>, yc.v2<d0>, t13.d<? super yc.v2<p003ji0.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yc.v2 f118918b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerFlow$1$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118921b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118921b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118921b, dVar);
                aVar.f118920a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118920a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f118921b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "it", "Lji0/m$a;", "<anonymous>", "(Lli0/d0;)Lji0/m$a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerFlow$1$2", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super ji0.m.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118922a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118922a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super ji0.m.a> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118922a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new ji0.m.a(d0Var);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lji0/m$a;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lji0/m;", "<anonymous>", "(Lji0/m$a;Lji0/m$a;)Lji0/m;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerFlow$1$3", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.q<ji0.m.a, ji0.m.a, t13.d<? super p003ji0.m>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ji0.m.a f118923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ ji0.m.a f118924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f118925c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(j jVar, t13.d<? super c> dVar) {
                super(3, dVar);
                this.f118925c = jVar;
            }

            @Override // e23.q
            public final Object invoke(ji0.m.a aVar, ji0.m.a aVar2, t13.d<? super p003ji0.m> dVar) {
                c cVar = new c(this.f118925c, dVar);
                cVar.f118923a = aVar;
                cVar.f118924b = aVar2;
                return cVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x005a  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ji0.m.a aVar = this.f118923a;
                ji0.m.a aVar2 = this.f118924b;
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                j jVar = this.f118925c;
                if ((aVar2 != null && e0.b(aVar2.f98798a) && aVar == null && jVar.f118904h == null) || (aVar2 != null && s.g(jVar.f118904h, aVar2.f98798a.f112650c))) {
                    jVar.f118904h = aVar2.f98798a.f112650c;
                    return new ji0.m.b(R.string.lbl_followed_by_you);
                }
                if (aVar2 == null) {
                    return aVar2 != null ? null : null;
                }
                d0 d0Var = aVar2.f98798a;
                if ((e0.b(d0Var) && !s.g(d0Var.f112650c, jVar.f118901e)) || ((aVar != null && !e0.b(aVar.f98798a)) || jVar.f118905i != null)) {
                    if (aVar2 != null || !s.g(jVar.f118905i, aVar2.f98798a.f112650c)) {
                    }
                }
                jVar.f118905i = aVar2.f98798a.f112650c;
                return new ji0.m.b(R.string.lbl_follow_username);
            }
        }

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, yc.v2<d0> v2Var, t13.d<? super yc.v2<p003ji0.m>> dVar) {
            e eVar = j.this.new e(dVar);
            eVar.f118917a = map;
            eVar.f118918b = v2Var;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118917a;
            yc.v2 v2Var = this.f118918b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.d(i0.e(i0.e(v2Var, new a(map, null)), new b(null)), new c(j.this, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerQueryFlow$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.q<Map<String, ? extends l0>, yc.v2<d0>, t13.d<? super yc.v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yc.v2 f118927b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followerQueryFlow$1$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118929b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118929b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118929b, dVar);
                aVar.f118928a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118928a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f118929b);
            }
        }

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, yc.v2<d0> v2Var, t13.d<? super yc.v2<d0>> dVar) {
            f fVar = new f(dVar);
            fVar.f118926a = map;
            fVar.f118927b = v2Var;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118926a;
            yc.v2 v2Var = this.f118927b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.e(v2Var, new a(map, null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<h3<Integer, d0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f118931b;

        public g(String str) {
            this.f118931b = str;
        }

        @Override // e23.a
        public final h3<Integer, d0> invoke() {
            j jVar = j.this;
            return new fi0.q(jVar.f118902f, jVar.f118897a, this.f118931b, jVar.f118899c, fi0.q.a.FOLLOWER, 1, 20);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "Lji0/m;", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingFlow$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.q<Map<String, ? extends l0>, yc.v2<d0>, t13.d<? super yc.v2<p003ji0.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yc.v2 f118933b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingFlow$1$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118936b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118936b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118936b, dVar);
                aVar.f118935a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118935a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f118936b);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lli0/d0;", "it", "Lji0/m$a;", "<anonymous>", "(Lli0/d0;)Lji0/m$a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingFlow$1$2", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<d0, t13.d<? super ji0.m.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118937a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f118937a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super ji0.m.a> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118937a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new ji0.m.a(d0Var);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lji0/m$a;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lji0/m;", "<anonymous>", "(Lji0/m$a;Lji0/m$a;)Lji0/m;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingFlow$1$3", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.q<ji0.m.a, ji0.m.a, t13.d<? super p003ji0.m>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ ji0.m.a f118938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ ji0.m.a f118939b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f118940c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(j jVar, t13.d<? super c> dVar) {
                super(3, dVar);
                this.f118940c = jVar;
            }

            @Override // e23.q
            public final Object invoke(ji0.m.a aVar, ji0.m.a aVar2, t13.d<? super p003ji0.m> dVar) {
                c cVar = new c(this.f118940c, dVar);
                cVar.f118938a = aVar;
                cVar.f118939b = aVar2;
                return cVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x005a  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ji0.m.a aVar = this.f118938a;
                ji0.m.a aVar2 = this.f118939b;
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                j jVar = this.f118940c;
                if ((aVar2 != null && e0.b(aVar2.f98798a) && aVar == null && jVar.f118906j == null) || (aVar2 != null && s.g(jVar.f118906j, aVar2.f98798a.f112650c))) {
                    jVar.f118906j = aVar2.f98798a.f112650c;
                    return new ji0.m.b(R.string.lbl_both_following);
                }
                if (aVar2 == null) {
                    return aVar2 != null ? null : null;
                }
                d0 d0Var = aVar2.f98798a;
                if ((e0.b(d0Var) && !s.g(d0Var.f112650c, jVar.f118901e)) || ((aVar != null && !e0.b(aVar.f98798a)) || jVar.f118907k != null)) {
                    if (aVar2 != null || !s.g(jVar.f118907k, aVar2.f98798a.f112650c)) {
                    }
                }
                jVar.f118907k = aVar2.f98798a.f112650c;
                return new ji0.m.b(R.string.lbl_username_is_following);
            }
        }

        public h(t13.d<? super h> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, yc.v2<d0> v2Var, t13.d<? super yc.v2<p003ji0.m>> dVar) {
            h hVar = j.this.new h(dVar);
            hVar.f118932a = map;
            hVar.f118933b = v2Var;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118932a;
            yc.v2 v2Var = this.f118933b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.d(i0.e(i0.e(v2Var, new a(map, null)), new b(null)), new c(j.this, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingQueryFlow$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.q<Map<String, ? extends l0>, yc.v2<d0>, t13.d<? super yc.v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ yc.v2 f118942b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$followingQueryFlow$1$1", f = "OthersFriendListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118944b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118944b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118944b, dVar);
                aVar.f118943a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118943a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f118944b);
            }
        }

        public i(t13.d<? super i> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, yc.v2<d0> v2Var, t13.d<? super yc.v2<d0>> dVar) {
            i iVar = new i(dVar);
            iVar.f118941a = map;
            iVar.f118942b = v2Var;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118941a;
            yc.v2 v2Var = this.f118942b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.e(v2Var, new a(map, null));
        }
    }

    /* JADX INFO: renamed from: mi0.j$j, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2261j implements e23.a<h3<Integer, d0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f118946b;

        public C2261j(String str) {
            this.f118946b = str;
        }

        @Override // e23.a
        public final h3<Integer, d0> invoke() {
            j jVar = j.this;
            return new fi0.q(jVar.f118902f, jVar.f118897a, this.f118946b, jVar.f118899c, fi0.q.a.FOLLOWING, 1, 20);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/j$k", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$friendAction$1$updateStateData$1", f = "OthersFriendListViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f118949b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118950c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f118951d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, String str, l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118949b = jVar;
                this.f118950c = str;
                this.f118951d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f118949b, this.f118950c, this.f118951d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118948a;
                if (i14 == 0) {
                    r.b(obj);
                    j jVar = this.f118949b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) jVar.f118902f.getValue());
                    linkedHashMapN.put(this.f118950c, this.f118951d);
                    p2 p2Var = jVar.f118902f;
                    this.f118948a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
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

        public k(b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            j jVar = j.this;
            ge1.b.T(v1.a(jVar), null, null, new a(jVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118952a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118953a;

            /* JADX INFO: renamed from: mi0.j$l$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$filter$1$2", f = "OthersFriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2262a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118954a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118955b;

                public C2262a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118954a = obj;
                    this.f118955b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118953a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2262a c2262a;
                if (dVar instanceof C2262a) {
                    c2262a = (C2262a) dVar;
                    int i14 = c2262a.f118955b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2262a.f118955b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2262a = new C2262a(dVar);
                    }
                } else {
                    c2262a = new C2262a(dVar);
                }
                Object obj2 = c2262a.f118954a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2262a.f118955b;
                if (i15 == 0) {
                    r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2262a.f118955b = 1;
                        if (this.f118953a.emit(obj, c2262a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public l(r53.i iVar) {
            this.f118952a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118952a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118957a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118958a;

            /* JADX INFO: renamed from: mi0.j$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$filter$2$2", f = "OthersFriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2263a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118959a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118960b;

                public C2263a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118959a = obj;
                    this.f118960b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118958a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2263a c2263a;
                if (dVar instanceof C2263a) {
                    c2263a = (C2263a) dVar;
                    int i14 = c2263a.f118960b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2263a.f118960b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2263a = new C2263a(dVar);
                    }
                } else {
                    c2263a = new C2263a(dVar);
                }
                Object obj2 = c2263a.f118959a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2263a.f118960b;
                if (i15 == 0) {
                    r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2263a.f118960b = 1;
                        if (this.f118958a.emit(obj, c2263a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public m(r53.i iVar) {
            this.f118957a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118957a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$flatMapLatest$1", f = "OthersFriendListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.q<r53.j<? super yc.v2<d0>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f118963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f118964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f118965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(t13.d dVar, j jVar) {
            super(3, dVar);
            this.f118965d = jVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super yc.v2<d0>> jVar, String str, t13.d<? super Unit> dVar) {
            n nVar = new n(dVar, this.f118965d);
            nVar.f118963b = jVar;
            nVar.f118964c = str;
            return nVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118962a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f118963b;
                String str = (String) this.f118964c;
                u2 u2Var = new u2(20, 0, false, 0, 0, 0, 62, null);
                j jVar2 = this.f118965d;
                a2 a2VarA = yc.o.a(new t2(u2Var, null, jVar2.new g(str), 2, null).f196485a, v1.a(jVar2));
                this.f118963b = null;
                this.f118964c = null;
                this.f118962a = 1;
                if (r53.s.v(jVar, a2VarA, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$flatMapLatest$2", f = "OthersFriendListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.q<r53.j<? super yc.v2<d0>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f118967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f118968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f118969d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(t13.d dVar, j jVar) {
            super(3, dVar);
            this.f118969d = jVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super yc.v2<d0>> jVar, String str, t13.d<? super Unit> dVar) {
            o oVar = new o(dVar, this.f118969d);
            oVar.f118967b = jVar;
            oVar.f118968c = str;
            return oVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118966a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f118967b;
                String str = (String) this.f118968c;
                u2 u2Var = new u2(20, 0, false, 0, 0, 0, 62, null);
                j jVar2 = this.f118969d;
                a2 a2VarA = yc.o.a(new t2(u2Var, null, jVar2.new C2261j(str), 2, null).f196485a, v1.a(jVar2));
                this.f118967b = null;
                this.f118968c = null;
                this.f118966a = 1;
                if (r53.s.v(jVar, a2VarA, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118970a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118971a;

            /* JADX INFO: renamed from: mi0.j$p$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$map$1$2", f = "OthersFriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2264a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118972a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118973b;

                public C2264a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118972a = obj;
                    this.f118973b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118971a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2264a c2264a;
                if (dVar instanceof C2264a) {
                    c2264a = (C2264a) dVar;
                    int i14 = c2264a.f118973b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2264a.f118973b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2264a = new C2264a(dVar);
                    }
                } else {
                    c2264a = new C2264a(dVar);
                }
                Object obj2 = c2264a.f118972a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2264a.f118973b;
                if (i15 == 0) {
                    r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2264a.f118973b = 1;
                    if (this.f118971a.emit(string, c2264a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public p(r53.i iVar) {
            this.f118970a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118970a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class q implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118975a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118976a;

            /* JADX INFO: renamed from: mi0.j$q$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.OthersFriendListViewModel$special$$inlined$map$2$2", f = "OthersFriendListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2265a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118977a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118978b;

                public C2265a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118977a = obj;
                    this.f118978b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118976a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2265a c2265a;
                if (dVar instanceof C2265a) {
                    c2265a = (C2265a) dVar;
                    int i14 = c2265a.f118978b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2265a.f118978b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2265a = new C2265a(dVar);
                    }
                } else {
                    c2265a = new C2265a(dVar);
                }
                Object obj2 = c2265a.f118977a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2265a.f118978b;
                if (i15 == 0) {
                    r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2265a.f118978b = 1;
                    if (this.f118976a.emit(string, c2265a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public q(r53.i iVar) {
            this.f118975a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118975a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        u9.b bVar = new u9.b();
        bVar.a(s0.f105811a.b(j.class), new mi0.i(0));
        f118896y = bVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(String str, String str2) {
        this.f118897a = str;
        this.f118898b = str2;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f118902f = p2VarA;
        this.f118903g = new k(v1.a(this));
        p2 p2VarA2 = q2.a("");
        this.f118908l = p2VarA2;
        int i14 = 0;
        Object obj = null;
        this.f118909m = new r53.u1(p2VarA, yc.o.a(new t2(new u2(20, 0, false, 0, 0, i14, 62, null), obj, new ii0.k0(this, 2), 2, null).f196485a, v1.a(this)), new e(null));
        this.f118910n = new r53.u1(p2VarA, r53.s.N(r53.s.q(new l(new p(p2VarA2)), 500L), new n(null, this)), new f(null));
        p2 p2VarA3 = q2.a("");
        this.f118911o = p2VarA3;
        Object[] objArr = 0 == true ? 1 : 0;
        Object obj2 = null;
        this.f118912p = new r53.u1(p2VarA, yc.o.a(new t2(new u2(20, 0, objArr, i14, 0, 0, 62, null), obj2, new ii0.k0(this, 3), 2, null).f196485a, v1.a(this)), new h(null));
        this.f118913q = new r53.u1(p2VarA, r53.s.N(r53.s.q(new m(new q(p2VarA3)), 500L), new o(null, this)), new i(null));
        this.f118914r = q2.a(str2);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmi0/j$d;", "", "<init>", "()V", "", "PAGING_SIZE", "I", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
