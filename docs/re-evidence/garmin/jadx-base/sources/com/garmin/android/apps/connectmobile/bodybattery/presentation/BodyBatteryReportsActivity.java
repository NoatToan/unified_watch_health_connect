package com.garmin.android.apps.connectmobile.bodybattery.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import g22.k;
import ix.j;
import ix.l;
import java.io.Serializable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bodybattery/presentation/BodyBatteryReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lix/l;", "uiState", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BodyBatteryReportsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30937b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f30938a = new w1(s0.f105811a.b(j.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30939a;

        public b(g gVar) {
            this.f30939a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30939a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30940a;

        public c(g gVar) {
            this.f30940a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30940a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30942b;

        public d(e23.a aVar, g gVar) {
            this.f30941a = aVar;
            this.f30942b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30941a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30942b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o82.g gVar;
        Object value;
        Object value2;
        Serializable serializable;
        Serializable serializable2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        DateTime dateTime = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
            } else {
                Serializable serializable3 = extras.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                if (!(serializable3 instanceof o82.g)) {
                    serializable3 = null;
                }
                serializable2 = (o82.g) serializable3;
            }
            gVar = (o82.g) serializable2;
        } else {
            gVar = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Serializable serializable4 = extras2.getSerializable("EXTRA_INITIAL_DATE");
                serializable = (DateTime) (serializable4 instanceof DateTime ? serializable4 : null);
            }
            dateTime = (DateTime) serializable;
        }
        p2 p2Var = ((j) this.f30938a.getValue()).f95627g;
        if (gVar != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, l.a((l) value2, false, gVar, null, false, false, false, false, false, null, 509)));
        }
        if (dateTime != null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, false, null, k.z(dateTime).b(), false, false, false, false, false, null, 507)));
        }
        initComposeScreen(new e(-375746965, true, new ik1.c(this, 4)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bodybattery/presentation/BodyBatteryReportsActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP", "Ljava/lang/String;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
