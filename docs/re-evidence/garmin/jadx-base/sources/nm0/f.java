package nm0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.t;
import e23.p;
import e23.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import li0.d0;
import li0.e0;
import li0.l0;
import o13.r;
import o53.b0;
import om0.n;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;
import p13.u0;
import r53.a2;
import r53.j;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import yc.h3;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm0/f;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126576a = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f126577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f126578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f126579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f126580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f126581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f126582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r53.u1 f126583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f126584i;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", TtmlNode.ATTR_ID, "<unused var>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$_groupMemberFlow$1", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements q<String, Integer, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f126585a;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(String str, Integer num, t13.d<? super String> dVar) {
            num.intValue();
            a aVar = new a(dVar);
            aVar.f126585a = str;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = this.f126585a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return str;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<h3<Integer, com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f126586a;

        public b(String str) {
            this.f126586a = str;
        }

        @Override // e23.a
        public final h3<Integer, com.garmin.android.apps.connectmobile.connections.groups.services.model.b> invoke() {
            String str = this.f126586a;
            if (str == null) {
                str = "";
            }
            return new n(str, true, false, true, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nm0/f$c", "Lli0/f;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$followAction$1$updateStateData$1", f = "GroupDetailAboutViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f126588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f126589b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f126590c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f126591d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, String str, l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f126589b = fVar;
                this.f126590c = str;
                this.f126591d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f126589b, this.f126590c, this.f126591d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f126588a;
                if (i14 == 0) {
                    r.b(obj);
                    f fVar = this.f126589b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) fVar.f126582g.getValue());
                    linkedHashMapN.put(this.f126590c, this.f126591d);
                    p2 p2Var = fVar.f126582g;
                    this.f126588a = 1;
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

        public c(b0 b0Var) {
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
            f fVar = f.this;
            ge1.b.T(v1.a(fVar), null, null, new a(fVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lyc/v2;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "list", "", "", "Lli0/l0;", "map", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "<anonymous>", "(Lyc/v2;Ljava/util/Map;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$groupMemberFlow$1", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements q<v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>, Map<String, ? extends l0>, t13.d<? super v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ v2 f126592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Map f126593b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "member", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$groupMemberFlow$1$1", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126595a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f126596b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f126596b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f126596b, dVar);
                aVar.f126595a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f126595a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                l0 l0Var = this.f126596b.get(bVar.getDisplayName());
                if (l0Var == null) {
                    return bVar;
                }
                d0 d0Var = bVar.f31627o;
                return com.garmin.android.apps.connectmobile.connections.groups.services.model.b.C(bVar, null, d0Var != null ? d0.b(d0Var, null, l0Var.f112785a, l0Var.f112786b, null, l0Var.f112787c, l0Var.f112788d, l0Var.f112789e, 57) : null, 16383);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "member", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$groupMemberFlow$1$2", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f126598b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f126598b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(this.f126598b, dVar);
                bVar.f126597a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b> dVar) {
                return ((b) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f126597a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                String userProfileId = bVar.getUserProfileId();
                if (userProfileId != null) {
                    Integer numI = t.i(userProfileId);
                    int i14 = this.f126598b.f126576a;
                    if (numI != null && numI.intValue() == i14 && bVar.getGroupRole() == GroupDTO.c.MEMBER) {
                        d0 d0Var = bVar.f31627o;
                        return com.garmin.android.apps.connectmobile.connections.groups.services.model.b.C(bVar, null, d0Var != null ? d0.b(d0Var, null, null, null, null, null, null, null, 479) : null, 16383);
                    }
                }
                return bVar;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "it", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$groupMemberFlow$1$3", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f126599a;

            public c(t13.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.f126599a = obj;
                return cVar;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b> dVar) {
                return ((c) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f126599a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.b(bVar);
            }
        }

        /* JADX INFO: renamed from: nm0.f$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$groupMemberFlow$1$4", f = "GroupDetailAboutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2434d extends i implements q<com.garmin.android.apps.connectmobile.group.details.about.member.a.b, com.garmin.android.apps.connectmobile.group.details.about.member.a.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f126600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f126601b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f126602c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2434d(f fVar, t13.d<? super C2434d> dVar) {
                super(3, dVar);
                this.f126602c = fVar;
            }

            @Override // e23.q
            public final Object invoke(com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar, com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar2, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar) {
                C2434d c2434d = new C2434d(this.f126602c, dVar);
                c2434d.f126600a = bVar;
                c2434d.f126601b = bVar2;
                return c2434d.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x002a  */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0096, code lost:
            
                if (r5.equals((r1 == null || (r1 = r1.f36221a) == null) ? null : r1.getDisplayName()) != false) goto L63;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z14;
                String str;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2;
                d0 d0Var;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar3;
                d0 d0Var2;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar4;
                d0 d0Var3;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar5;
                String userProfileId;
                com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar6 = this.f126600a;
                com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar7 = this.f126601b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                f fVar = this.f126602c;
                if (bVar6 == null || (bVar5 = bVar6.f36221a) == null || (userProfileId = bVar5.getUserProfileId()) == null) {
                    z14 = false;
                } else {
                    Integer numI = t.i(userProfileId);
                    int i14 = fVar.f126576a;
                    if (numI != null && numI.intValue() == i14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                boolean z15 = (bVar6 == null || (bVar4 = bVar6.f36221a) == null || (d0Var3 = bVar4.f31627o) == null || !e0.b(d0Var3)) ? false : true;
                boolean z16 = (bVar7 == null || (bVar3 = bVar7.f36221a) == null || (d0Var2 = bVar3.f31627o) == null || !e0.b(d0Var2)) ? false : true;
                boolean z17 = (bVar7 == null || (bVar2 = bVar7.f36221a) == null || (d0Var = bVar2.f31627o) == null || e0.b(d0Var)) ? false : true;
                String displayName = (bVar7 == null || (bVar = bVar7.f36221a) == null) ? null : bVar.getDisplayName();
                if (!z14 || !z16 || fVar.f126581f.contains(displayName) || fVar.f126579d != null) {
                    String str2 = fVar.f126579d;
                    LinkedHashSet linkedHashSet = fVar.f126581f;
                    if (str2 != null) {
                    }
                    if (((!z15 && !z14) || !z17 || linkedHashSet.contains(displayName) || fVar.f126580e != null) && ((str = fVar.f126580e) == null || !str.equals(displayName))) {
                        linkedHashSet.add(displayName);
                        return null;
                    }
                    fVar.f126580e = displayName;
                    linkedHashSet.add(displayName);
                    return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_other_members);
                }
                fVar.f126579d = displayName;
                fVar.f126581f.add(displayName);
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_followed_by_you);
            }
        }

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b> v2Var, Map<String, ? extends l0> map, t13.d<? super v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>> dVar) {
            d dVar2 = f.this.new d(dVar);
            dVar2.f126592a = v2Var;
            dVar2.f126593b = map;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = this.f126592a;
            Map map = this.f126593b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            v2 v2VarE = i0.e(v2Var, new a(map, null));
            f fVar = f.this;
            return i0.d(i0.e(i0.e(v2VarE, new b(fVar, null)), new c(null)), new C2434d(fVar, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.GroupDetailAboutViewModel$special$$inlined$flatMapLatest$1", f = "GroupDetailAboutViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements q<j<? super v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f126604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f126605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f126606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t13.d dVar, f fVar) {
            super(3, dVar);
            this.f126606d = fVar;
        }

        @Override // e23.q
        public final Object invoke(j<? super v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> jVar, String str, t13.d<? super Unit> dVar) {
            e eVar = new e(dVar, this.f126606d);
            eVar.f126604b = jVar;
            eVar.f126605c = str;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126603a;
            if (i14 == 0) {
                r.b(obj);
                j jVar = this.f126604b;
                Object obj2 = null;
                t2 t2Var = new t2(new u2(50, 0, false, 50, 0, 0, 54, null), obj2, new b((String) this.f126605c), 2, null);
                a2 a2VarA = o.a(t2Var.f196485a, v1.a(this.f126606d));
                this.f126604b = null;
                this.f126605c = null;
                this.f126603a = 1;
                if (s.v(jVar, a2VarA, this) == aVar) {
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

    public f() {
        p2 p2VarA = q2.a(null);
        this.f126577b = p2VarA;
        p2 p2VarA2 = q2.a(0);
        this.f126578c = p2VarA2;
        this.f126581f = new LinkedHashSet();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA3 = q2.a(k0Var);
        this.f126582g = p2VarA3;
        this.f126583h = new r53.u1(s.N(new r53.u1(p2VarA, p2VarA2, new a(null)), new e(null, this)), p2VarA3, new d(null));
        this.f126584i = new c(v1.a(this));
    }
}
