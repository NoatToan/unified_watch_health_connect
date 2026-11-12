package com.garmin.android.apps.connectmobile.respiration.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import fe1.o;
import g22.k;
import java.io.Serializable;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/presentation/RespirationReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RespirationReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41143b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41144a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<fe1.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41148d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41145a = gVar;
            this.f41146b = qualifier;
            this.f41147c = aVar;
            this.f41148d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, fe1.n] */
        @Override // e23.a
        public final fe1.n invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41145a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f41147c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(fe1.n.class), f189591b, null, defaultViewModelCreationExtras, this.f41146b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41148d, 4, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, o13.l] */
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
        p2 p2Var = ((fe1.n) this.f41144a.getValue()).f70560d;
        if (gVar != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, o.a((o) value2, false, gVar, null, null, null, 29)));
        }
        if (dateTime != null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o.a((o) value, false, null, k.z(dateTime).b(), null, null, 27)));
        }
        initComposeScreen(new e(1984906812, true, new dh1.a(this, 28)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/presentation/RespirationReportsActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP", "Ljava/lang/String;", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
