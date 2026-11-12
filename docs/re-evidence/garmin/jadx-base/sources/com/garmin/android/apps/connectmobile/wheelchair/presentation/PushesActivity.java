package com.garmin.android.apps.connectmobile.wheelchair.presentation;

import a61.i;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.u2;
import d52.q;
import d52.r;
import f.c;
import g.h;
import g22.k;
import java.io.Serializable;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/wheelchair/presentation/PushesActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Ld52/r;", "uiState", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PushesActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48030d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48031a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c52.a f48032b = (c52.a) KoinJavaComponent.get$default(c52.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<Intent> f48033c = registerForActivityResult(new h(), new i(this, 12));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f48035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f48036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f48037d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f48034a = gVar;
            this.f48035b = qualifier;
            this.f48036c = aVar;
            this.f48037d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, d52.q] */
        @Override // e23.a
        public final q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f48034a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f48036c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(q.class), f189591b, null, defaultViewModelCreationExtras, this.f48035b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f48037d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final q da() {
        return (q) this.f48031a.getValue();
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
        p2 p2Var = da().f57618g;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, r.a((r) value2, k.z(dateTime).b(), null, null, false, false, false, false, false, false, 510)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, r.a((r) value, null, gVar, null, false, false, false, gVar == o82.g.f130850c, false, false, 445)));
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            if (extras3.getInt("initialTab") == 0) {
                da().y4(yd1.b.WEEKLY);
            } else {
                da().y4(yd1.b.MONTHLY);
            }
        }
        initComposeScreen(new e(1431760438, true, new d52.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/wheelchair/presentation/PushesActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_EDIT_PUSHES_GOAL", "Ljava/lang/String;", "MENU_ITEM_HELP_PUSHES", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(GCMCommonDeepLinkHandler gCMCommonDeepLinkHandler, o82.g gVar, DateTime dateTime, Integer num) {
            Intent intentZ;
            if (gVar != null) {
                u2 u2Var = new u2();
                u2Var.f46492a = dateTime;
                u2Var.f46493b = gVar;
                intentZ = u2Var.a(gCMCommonDeepLinkHandler, PushesActivity.class);
            } else {
                intentZ = dh.b.z(PushesActivity.class, gCMCommonDeepLinkHandler, null, false);
            }
            if (gVar == o82.g.f130856i && num != null) {
                intentZ.putExtra("initialTab", num.intValue());
            }
            return intentZ;
        }

        private a() {
        }
    }
}
