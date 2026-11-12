package com.garmin.android.apps.connectmobile.group.details.about.member;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.p1;
import v13.i;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/GroupTransferOwnershipActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "isLoading", "isUpdating", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "selectedMember", "showConfirmDialog", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupTransferOwnershipActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36209d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDTO f36210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f36212c = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.group.details.about.member.d.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity$onCreate$1$1$1$1", f = "GroupTransferOwnershipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> f36213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f36213a = dVar;
            this.f36214b = p1Var;
            this.f36215c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f36213a, this.f36214b, this.f36215c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0028  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (s.g(this.f36213a.d().f196385a, z0.b.f196664b)) {
                z14 = true;
            } else {
                a aVar2 = GroupTransferOwnershipActivity.f36209d;
                if (this.f36214b.getF182175a().booleanValue()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            a aVar3 = GroupTransferOwnershipActivity.f36209d;
            this.f36215c.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, GroupTransferOwnershipActivity.class, "finish", "finish()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((GroupTransferOwnershipActivity) this.receiver).finish();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36216a;

        public d(g gVar) {
            this.f36216a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36216a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36217a;

        public e(g gVar) {
            this.f36217a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36217a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36219b;

        public f(e23.a aVar, g gVar) {
            this.f36218a = aVar;
            this.f36219b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36218a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36219b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f36211b) {
            Intent intent = new Intent();
            intent.putExtra("GCM_extra_connection_group", this.f36210a);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(519134290, true, new om0.p(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/GroupTransferOwnershipActivity$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
