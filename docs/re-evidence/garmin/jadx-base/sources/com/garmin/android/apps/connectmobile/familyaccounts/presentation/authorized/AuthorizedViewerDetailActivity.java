package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewerDetailActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizedViewerDetailActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34963c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34964a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.class), new c(this), new rg0.k(this, 0), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.e f34965b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewerDetailActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ViewableAccount,
        ViewerOfThisAccount,
        ManagedByThisAccount,
        ManagedAccount
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34971a;

        public c(b.g gVar) {
            this.f34971a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34971a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f34973b;

        public d(e23.a aVar, b.g gVar) {
            this.f34972a = aVar;
            this.f34973b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34972a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34973b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d da() {
        return (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d) this.f34964a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ge1.b.T(f0.w(this), null, null, new rg0.l(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.b(this, null), 3);
        ge1.b.T(f0.w(this), null, null, new rg0.m(this, null), 3);
        initComposeScreen(new z3.e(1733387421, true, new rg0.j(this, 5)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/AuthorizedViewerDetailActivity$a;", "", "<init>", "()V", "", "REMOVED_INVITE_KEY", "Ljava/lang/String;", "USER_DATA_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
