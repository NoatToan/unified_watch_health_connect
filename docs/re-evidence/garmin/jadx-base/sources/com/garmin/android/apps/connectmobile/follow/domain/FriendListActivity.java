package com.garmin.android.apps.connectmobile.follow.domain;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import p003ji0.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/FriendListActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FriendListActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35257b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f35258a = new w1(s0.f105811a.b(mi0.f.class), new e(this), new d(this), new f(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, FriendListActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((FriendListActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, FriendListActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((FriendListActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35259a;

        public d(g gVar) {
            this.f35259a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f35259a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35260a;

        public e(g gVar) {
            this.f35260a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f35260a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f35261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f35262b;

        public f(e23.a aVar, g gVar) {
            this.f35261a = aVar;
            this.f35262b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f35261a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f35262b.getDefaultViewModelCreationExtras() : creationExtras;
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
        initComposeScreen(new z3.e(141051851, true, new g80.e(2, this, kVar)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/follow/domain/FriendListActivity$a;", "", "<init>", "()V", "", "EXTRA_INITIAL_TAB", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, k kVar) {
            Intent intentD = sn.a.d(context, context, FriendListActivity.class);
            if (kVar != null) {
                intentD.putExtra("extra_initial_tab", kVar.ordinal());
            }
            return intentD;
        }

        private a() {
        }
    }
}
