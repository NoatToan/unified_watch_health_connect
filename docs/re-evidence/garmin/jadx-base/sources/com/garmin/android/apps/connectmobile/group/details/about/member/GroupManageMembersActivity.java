package com.garmin.android.apps.connectmobile.group.details.about.member;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import om0.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.p1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/GroupManageMembersActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "isLoading", "userInitiateRefresh", "isPullToRefreshing", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupManageMembersActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36194d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f36195a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.group.details.about.member.c.class), new h(this), new g(this), new i(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36197c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity$onCreate$1$1$1$1", f = "GroupManageMembersActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> f36198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36201d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f36198a = dVar;
            this.f36199b = p1Var;
            this.f36200c = p1Var2;
            this.f36201d = p1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f36198a, this.f36199b, this.f36200c, this.f36201d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean zG = s.g(this.f36198a.d().f196385a, z0.b.f196664b);
            p1<Boolean> p1Var = this.f36201d;
            p1<Boolean> p1Var2 = this.f36200c;
            p1<Boolean> p1Var3 = this.f36199b;
            if (zG) {
                a aVar2 = GroupManageMembersActivity.f36194d;
                if (p1Var3.getF182175a().booleanValue()) {
                    p1Var2.setValue(Boolean.TRUE);
                } else {
                    p1Var.setValue(Boolean.TRUE);
                }
            } else {
                a aVar3 = GroupManageMembersActivity.f36194d;
                Boolean bool = Boolean.FALSE;
                p1Var2.setValue(bool);
                p1Var.setValue(bool);
                p1Var3.setValue(bool);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, GroupManageMembersActivity.class, "finish", "finish()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((GroupManageMembersActivity) this.receiver).finish();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity$onCreate$1$1$3$1$1$1", f = "GroupManageMembersActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> f36202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GroupManageMembersActivity f36203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f36204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar, GroupManageMembersActivity groupManageMembersActivity, p1<Boolean> p1Var, t13.d<? super d> dVar2) {
            super(2, dVar2);
            this.f36202a = dVar;
            this.f36203b = groupManageMembersActivity;
            this.f36204c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f36202a, this.f36203b, this.f36204c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = GroupManageMembersActivity.f36194d;
            this.f36204c.setValue(Boolean.TRUE);
            this.f36202a.e();
            com.garmin.android.apps.connectmobile.group.details.about.member.c cVar = (com.garmin.android.apps.connectmobile.group.details.about.member.c) this.f36203b.f36195a.getValue();
            cVar.f36236c = null;
            cVar.f36237d = null;
            cVar.f36238e.clear();
            ge1.b.T(v1.a(cVar), null, null, new m(cVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, GroupManageMembersActivity.class, "showErrorMessage", "showErrorMessage()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            GroupManageMembersActivity groupManageMembersActivity = (GroupManageMembersActivity) this.receiver;
            a aVar = GroupManageMembersActivity.f36194d;
            Toast.makeText(groupManageMembersActivity, groupManageMembersActivity.getString(R.string.txt_error_occurred), 0).show();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.a<Unit> {
        public f(Object obj) {
            super(0, obj, GroupManageMembersActivity.class, "showErrorMessage", "showErrorMessage()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            GroupManageMembersActivity groupManageMembersActivity = (GroupManageMembersActivity) this.receiver;
            a aVar = GroupManageMembersActivity.f36194d;
            Toast.makeText(groupManageMembersActivity, groupManageMembersActivity.getString(R.string.txt_error_occurred), 0).show();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36205a;

        public g(b.g gVar) {
            this.f36205a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36205a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36206a;

        public h(b.g gVar) {
            this.f36206a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36206a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36208b;

        public i(e23.a aVar, b.g gVar) {
            this.f36207a = aVar;
            this.f36208b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36207a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36208b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("MEMBER_UPDATED", this.f36196b);
        intent.putExtra("USER_NO_LONGER_IN_GROUP", this.f36197c);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(1447682898, true, new om0.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/about/member/GroupManageMembersActivity$a;", "", "<init>", "()V", "", "MEMBER_UPDATED", "Ljava/lang/String;", "USER_NO_LONGER_IN_GROUP", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
