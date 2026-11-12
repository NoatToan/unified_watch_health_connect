package com.garmin.android.apps.connectmobile.follow.domain;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;
import fp0.l;
import p003ji0.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import wn1.n;
import wn1.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/InviteFriendsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteFriendsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35263d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35265b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35264a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f35266c = new w1(s0.f105811a.b(n.class), new f(this), new e(this), new g(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, InviteFriendsActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((InviteFriendsActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, InviteFriendsActivity.class, "startInviteByEmailActivity", "startInviteByEmailActivity()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) this.receiver;
            a aVar = InviteFriendsActivity.f35263d;
            inviteFriendsActivity.getClass();
            InviteByEmailActivity.a aVar2 = InviteByEmailActivity.f43034c;
            String strValueOf = String.valueOf(inviteFriendsActivity.f35264a);
            String strValueOf2 = String.valueOf(inviteFriendsActivity.f35265b);
            aVar2.getClass();
            strValueOf.getClass();
            Intent intent = new Intent(inviteFriendsActivity, (Class<?>) InviteByEmailActivity.class);
            intent.putExtra("GCM_deviceUnitID", strValueOf);
            intent.putExtra("GCM_deviceDisplayName", strValueOf2);
            inviteFriendsActivity.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, InviteFriendsActivity.class, "startFriendListActivity", "startFriendListActivity()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) this.receiver;
            a aVar = InviteFriendsActivity.f35263d;
            inviteFriendsActivity.getClass();
            FriendListActivity.a aVar2 = FriendListActivity.f35257b;
            k kVar = k.SUGGESTED;
            aVar2.getClass();
            inviteFriendsActivity.startActivity(new Intent(FriendListActivity.a.a(inviteFriendsActivity, kVar)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35267a;

        public e(b.g gVar) {
            this.f35267a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f35267a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35268a;

        public f(b.g gVar) {
            this.f35268a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f35268a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f35269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f35270b;

        public g(e23.a aVar, b.g gVar) {
            this.f35269a = aVar;
            this.f35270b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f35269a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f35270b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            this.f35264a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
            Bundle extras = getIntent().getExtras();
            this.f35265b = extras != null ? extras.getString("GCM_deviceDisplayName", "") : null;
        }
        if (!s3.b()) {
            w1 w1Var = this.f35266c;
            ((n) w1Var.getValue()).f186273j = this.f35264a;
            n nVar = (n) w1Var.getValue();
            ge1.b.T(v1.a(nVar), null, null, new r(nVar, null), 3);
            initComposeScreen(new z3.e(988459996, true, new l(this, 6)));
            return;
        }
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(false, R.string.title_invite_people);
        g10.d.a aVar = g10.d.f74830e;
        long j8 = this.f35264a;
        String str = this.f35265b;
        aVar.getClass();
        g10.d dVar = new g10.d();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("GCM_deviceUnitID", j8);
        bundle2.putString("GCM_deviceDisplayName", str);
        dVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.content_frame_layout, dVar, null);
        aVar2.e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/InviteFriendsActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
