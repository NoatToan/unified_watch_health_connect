package com.garmin.android.apps.connectmobile.blood_pressure.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.d;
import g22.k;
import java.io.Serializable;
import org.joda.time.DateTime;
import ov1.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qw.g;
import qw.l;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/BloodPressureReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BloodPressureReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30903b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f30904a = new w1(s0.f105811a.b(g.class), new b(this), new a(this), new c(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f30905a;

        public a(b.g gVar) {
            this.f30905a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30905a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f30906a;

        public b(b.g gVar) {
            this.f30906a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30906a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f30908b;

        public c(e23.a aVar, b.g gVar) {
            this.f30907a = aVar;
            this.f30908b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30907a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30908b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        Object value;
        Object value2;
        Serializable serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Serializable serializable3 = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable4 = extras.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable2 = (DateTime) serializable4;
            }
            dateTime = (DateTime) serializable2;
        } else {
            dateTime = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
            } else {
                Serializable serializable5 = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                serializable = (o82.g) (serializable5 instanceof o82.g ? serializable5 : null);
            }
            serializable3 = (o82.g) serializable;
        }
        o82.g gVar = serializable3;
        p2 p2Var = ((g) this.f30904a.getValue()).f148248c;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, l.a((l) value2, null, null, k.z(dateTime).b(), null, false, 27)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, null, gVar, null, null, false, 29)));
        }
        initComposeScreen(new e(-1134823834, true, new q(this, 25)));
    }
}
