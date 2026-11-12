package com.garmin.android.apps.connectmobile.steps.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.u2;
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
import yq1.e;
import z10.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/steps/presentation/StepsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lyq1/d;", "uiState", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StepsActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44915d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44916a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq1.a f44917b = (mq1.a) KoinJavaComponent.get$default(mq1.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<Intent> f44918c = registerForActivityResult(new h(), new jp.a(this, 19));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44922d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44919a = gVar;
            this.f44920b = qualifier;
            this.f44921c = aVar;
            this.f44922d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, yq1.e] */
        @Override // e23.a
        public final e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f44919a;
            y1 f185700a = gVar.getF189591b();
            e23.a aVar = this.f44921c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(e.class), f185700a, null, defaultViewModelCreationExtras, this.f44920b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44922d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final e da() {
        return (e) this.f44916a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.DAILY_SUMMARY;
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
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            if (extras3.getInt("initialTab") == 0) {
                da().y4(yd1.b.WEEKLY);
            } else {
                da().y4(yd1.b.MONTHLY);
            }
        }
        p2 p2Var = da().f198806g;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, yq1.d.a((yq1.d) value2, k.z(dateTime).b(), null, null, false, false, false, false, false, 510)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, yq1.d.a((yq1.d) value, null, gVar, null, false, false, false, gVar == o82.g.f130850c, false, 445)));
        }
        initComposeScreen(new z3.e(-40404079, true, new pq1.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/steps/presentation/StepsActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_EDIT_STEPS_GOAL", "Ljava/lang/String;", "MENU_ITEM_HELP_STEPS", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                intentZ = u2Var.a(gCMCommonDeepLinkHandler, StepsActivity.class);
            } else {
                intentZ = dh.b.z(StepsActivity.class, gCMCommonDeepLinkHandler, null, false);
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
