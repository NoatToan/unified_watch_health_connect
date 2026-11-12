package com.garmin.android.apps.connectmobile.follow.domain;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import b.g;
import e11.f0;
import g12.m;
import mi0.j;
import p003ji0.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/OthersFriendListActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lmi0/j;", "viewModel", "", "userName", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OthersFriendListActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35271a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35272a;

        public b(g gVar) {
            this.f35272a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f35272a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f35273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f35274b;

        public c(e23.a aVar, g gVar) {
            this.f35273a = aVar;
            this.f35274b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f35273a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f35274b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, OthersFriendListActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((OthersFriendListActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, OthersFriendListActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((OthersFriendListActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        k kVar;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            kVar = (k) k.f98796f.get(extras.getInt("extra_initial_tab"));
        } else {
            kVar = null;
        }
        gi0.c cVar = new gi0.c(getIntent().getStringExtra("GCM_userDisplayName"), getIntent().getStringExtra("GCM_extra_user_full_name"), 0);
        initComposeScreen(new z3.e(-788885051, true, new f0(this, 24, kVar, new w1(s0.f105811a.b(j.class), new b(this), new m(22), new c(cVar, this)))));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/OthersFriendListActivity$a;", "", "<init>", "()V", "", "EXTRA_INITIAL_TAB", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, k kVar, String str, String str2) {
            Intent intentD = sn.a.d(context, context, OthersFriendListActivity.class);
            if (kVar != null) {
                intentD.putExtra("extra_initial_tab", kVar.ordinal());
                intentD.putExtra("GCM_userDisplayName", str);
                intentD.putExtra("GCM_extra_user_full_name", str2);
            }
            return intentD;
        }

        private a() {
        }
    }
}
