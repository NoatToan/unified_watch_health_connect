package com.garmin.android.apps.connectmobile.group.details.about.member;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import e23.q;
import java.util.LinkedHashSet;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.k0;
import r53.p2;
import r53.q2;
import v13.i;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/c;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/j1;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f36233h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupDTO f36234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f36235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f36238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f36239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r53.u1 f36240g;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lyc/v2;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "members", "", "", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "map", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "<anonymous>", "(Lyc/v2;Ljava/util/Map;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$groupMemberFlow$1", f = "GroupManageMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements q<v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b>, Map<String, ? extends GroupDTO.c>, t13.d<? super v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ v2 f36241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Map f36242b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "data", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$groupMemberFlow$1$1", f = "GroupManageMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f36244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, GroupDTO.c> f36245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Map<String, ? extends GroupDTO.c> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f36245b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f36245b, dVar);
                aVar.f36244a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.connections.groups.services.model.b> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f36244a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                GroupDTO.c cVar = this.f36245b.get(bVar.getUserProfileId());
                return cVar != null ? com.garmin.android.apps.connectmobile.connections.groups.services.model.b.C(bVar, cVar, null, 32703) : bVar;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$groupMemberFlow$1$2", f = "GroupManageMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0631b extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f36246a;

            public C0631b(t13.d<? super C0631b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0631b c0631b = new C0631b(dVar);
                c0631b.f36246a = obj;
                return c0631b;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super Boolean> dVar) {
                return ((C0631b) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f36246a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return Boolean.valueOf(bVar.getGroupRole() != GroupDTO.c.NOT_DEFINED);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "it", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$groupMemberFlow$1$3", f = "GroupManageMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0632c extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f36247a;

            public C0632c(t13.d<? super C0632c> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C0632c c0632c = new C0632c(dVar);
                c0632c.f36247a = obj;
                return c0632c;
            }

            @Override // e23.p
            public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b> dVar) {
                return ((C0632c) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f36247a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.b(bVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$groupMemberFlow$1$4", f = "GroupManageMembersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class d extends i implements q<com.garmin.android.apps.connectmobile.group.details.about.member.a.b, com.garmin.android.apps.connectmobile.group.details.about.member.a.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f36248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f36249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f36250c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(c cVar, t13.d<? super d> dVar) {
                super(3, dVar);
                this.f36250c = cVar;
            }

            @Override // e23.q
            public final Object invoke(com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar, com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar2, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar) {
                d dVar2 = new d(this.f36250c, dVar);
                dVar2.f36248a = bVar;
                dVar2.f36249b = bVar2;
                return dVar2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                String str;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar3;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar4;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar5;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar6;
                com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar7 = this.f36248a;
                com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar8 = this.f36249b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                GroupDTO.c groupRole = (bVar7 == null || (bVar6 = bVar7.f36221a) == null) ? null : bVar6.getGroupRole();
                GroupDTO.c cVar = GroupDTO.c.OWNER;
                boolean z14 = groupRole == cVar;
                boolean z15 = ((bVar8 == null || (bVar5 = bVar8.f36221a) == null) ? null : bVar5.getGroupRole()) == cVar;
                GroupDTO.c groupRole2 = (bVar7 == null || (bVar4 = bVar7.f36221a) == null) ? null : bVar4.getGroupRole();
                GroupDTO.c cVar2 = GroupDTO.c.ADMIN;
                boolean z16 = groupRole2 == cVar2;
                boolean z17 = ((bVar8 == null || (bVar3 = bVar8.f36221a) == null) ? null : bVar3.getGroupRole()) == cVar2;
                boolean z18 = ((bVar8 == null || (bVar2 = bVar8.f36221a) == null) ? null : bVar2.getGroupRole()) == GroupDTO.c.MEMBER;
                String displayName = (bVar8 == null || (bVar = bVar8.f36221a) == null) ? null : bVar.getDisplayName();
                c cVar3 = this.f36250c;
                if (bVar7 == null && z15) {
                    cVar3.f36238e.add(displayName);
                    return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_owner);
                }
                if (!z14 || !z17 || cVar3.f36238e.contains(displayName) || cVar3.f36236c != null) {
                    String str2 = cVar3.f36236c;
                    LinkedHashSet linkedHashSet = cVar3.f36238e;
                    if (str2 == null || !str2.equals(displayName)) {
                        if (((!z16 && !z14) || !z18 || linkedHashSet.contains(displayName) || cVar3.f36237d != null) && ((str = cVar3.f36237d) == null || !str.equals(displayName))) {
                            linkedHashSet.add(displayName);
                            return null;
                        }
                        cVar3.f36237d = displayName;
                        linkedHashSet.add(displayName);
                        return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_members);
                    }
                }
                cVar3.f36236c = displayName;
                cVar3.f36238e.add(displayName);
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_admin);
            }
        }

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(v2<com.garmin.android.apps.connectmobile.connections.groups.services.model.b> v2Var, Map<String, ? extends GroupDTO.c> map, t13.d<? super v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f36241a = v2Var;
            bVar.f36242b = map;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = this.f36241a;
            Map map = this.f36242b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.d(i0.e(i0.b(i0.e(v2Var, new a(map, null)), new C0631b(null)), new C0632c(null)), new d(c.this, null));
        }
    }

    static {
        new a(null);
    }

    public c(j1 j1Var) {
        j1Var.getClass();
        this.f36234a = (GroupDTO) j1Var.a("GCM_extra_connection_group");
        ym0.a.f197886f.getClass();
        this.f36235b = ym0.a.C3709a.a();
        this.f36238e = new LinkedHashSet();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f36239f = p2VarA;
        this.f36240g = new r53.u1(o.a(new t2(new u2(50, 0, false, 50, 0, 0, 54, null), null, new n82.i(this, 22), 2, null).f196485a, v1.a(this)), p2VarA, new b(null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
