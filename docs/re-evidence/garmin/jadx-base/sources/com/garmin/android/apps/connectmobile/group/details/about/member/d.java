package com.garmin.android.apps.connectmobile.group.details.about.member;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.i;
import vb.h;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/d;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/j1;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupDTO f36251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f36252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0633d f36253c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipViewModel$groupMemberFlow$2$1", f = "GroupTransferOwnershipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f36254a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f36254a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super Boolean> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f36254a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.valueOf(bVar.getGroupRole() != GroupDTO.c.OWNER);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "it", "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipViewModel$groupMemberFlow$2$2", f = "GroupTransferOwnershipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<com.garmin.android.apps.connectmobile.connections.groups.services.model.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f36255a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f36255a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a.b> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) this.f36255a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return new com.garmin.android.apps.connectmobile.group.details.about.member.a.b(bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;Lcom/garmin/android/apps/connectmobile/group/details/about/member/a$b;)Lcom/garmin/android/apps/connectmobile/group/details/about/member/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipViewModel$groupMemberFlow$2$3", f = "GroupTransferOwnershipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements q<com.garmin.android.apps.connectmobile.group.details.about.member.a.b, com.garmin.android.apps.connectmobile.group.details.about.member.a.b, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f36256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.a.b f36257b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar, com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar2, t13.d<? super com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar) {
            c cVar = new c(dVar);
            cVar.f36256a = bVar;
            cVar.f36257b = bVar2;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar;
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2;
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar3;
            com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar4 = this.f36256a;
            com.garmin.android.apps.connectmobile.group.details.about.member.a.b bVar5 = this.f36257b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            GroupDTO.c groupRole = (bVar5 == null || (bVar3 = bVar5.f36221a) == null) ? null : bVar3.getGroupRole();
            GroupDTO.c cVar = GroupDTO.c.ADMIN;
            boolean z14 = groupRole == cVar;
            boolean z15 = ((bVar4 == null || (bVar2 = bVar4.f36221a) == null) ? null : bVar2.getGroupRole()) == cVar;
            boolean z16 = ((bVar5 == null || (bVar = bVar5.f36221a) == null) ? null : bVar.getGroupRole()) == GroupDTO.c.MEMBER;
            if (bVar4 == null && z14) {
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_admin);
            }
            if (z15 && z16) {
                return new com.garmin.android.apps.connectmobile.group.details.about.member.a.C0629a(R.string.lbl_members);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0633d implements r53.i<v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f36258a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.d$d$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f36259a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.about.member.d$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipViewModel$special$$inlined$map$1$2", f = "GroupTransferOwnershipViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0634a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f36260a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f36261b;

                public C0634a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f36260a = obj;
                    this.f36261b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar) {
                this.f36259a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0634a c0634a;
                if (dVar instanceof C0634a) {
                    c0634a = (C0634a) dVar;
                    int i14 = c0634a.f36261b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0634a.f36261b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0634a = new C0634a(dVar);
                    }
                } else {
                    c0634a = new C0634a(dVar);
                }
                Object obj2 = c0634a.f36260a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0634a.f36261b;
                if (i15 == 0) {
                    r.b(obj2);
                    v2 v2VarD = i0.d(i0.e(i0.b((v2) obj, new a(null)), new b(null)), new c(null));
                    c0634a.f36261b = 1;
                    if (this.f36259a.emit(v2VarD, c0634a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C0633d(r53.i iVar) {
            this.f36258a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super v2<com.garmin.android.apps.connectmobile.group.details.about.member.a>> jVar, t13.d dVar) {
            Object objCollect = this.f36258a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public d(j1 j1Var) {
        j1Var.getClass();
        this.f36251a = (GroupDTO) j1Var.a("GCM_extra_connection_group");
        ym0.a.f197886f.getClass();
        this.f36252b = ym0.a.C3709a.a();
        Object obj = null;
        this.f36253c = new C0633d(o.a(new t2(new u2(50, 0, false, 50, 0, 0, 54, null), obj, new n82.i(this, 23), 2, null).f196485a, v1.a(this)));
    }
}
