package com.garmin.android.apps.connectmobile.settings.thirdparty.google;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import gk1.e;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/google/GoogleHealthConnectActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GoogleHealthConnectActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43979c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43980a = m.b(new g12.m(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43981b = new w1(s0.f105811a.b(e.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43982a;

        public b(g gVar) {
            this.f43982a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43982a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43983a;

        public c(g gVar) {
            this.f43983a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43983a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43985b;

        public d(e23.a aVar, g gVar) {
            this.f43984a = aVar;
            this.f43985b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43984a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43985b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        initActionBar(true, R.string.lbl_googlehealthconnect);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1902660626, true, new gk1.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/google/GoogleHealthConnectActivity$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
