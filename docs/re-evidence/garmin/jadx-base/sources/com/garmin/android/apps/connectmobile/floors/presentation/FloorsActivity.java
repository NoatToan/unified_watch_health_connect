package com.garmin.android.apps.connectmobile.floors.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import tr2.y;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/floors/presentation/FloorsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lxh0/g;", "uiState", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FloorsActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35229c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35230a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<Intent> f35231b = registerForActivityResult(new h(), new y(this, 14));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<xh0.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f35232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35235d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35232a = gVar;
            this.f35233b = qualifier;
            this.f35234c = aVar;
            this.f35235d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, xh0.h] */
        @Override // e23.a
        public final xh0.h invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f35232a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f35234c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(xh0.h.class), f189591b, null, defaultViewModelCreationExtras, this.f35233b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35235d, 4, null);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.DAILY_SUMMARY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
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
        p2 p2Var = ((xh0.h) this.f35230a.getValue()).f191013f;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, xh0.g.a((xh0.g) value2, k.z(dateTime).b(), null, false, false, false, false, false, false, 254)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, xh0.g.a((xh0.g) value, null, gVar, false, false, false, false, gVar == o82.g.f130850c, false, PsExtractor.PRIVATE_STREAM_1)));
        }
        initComposeScreen(new e(1390237205, true, new xh0.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/floors/presentation/FloorsActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_EDIT_FLOOR_GOAL", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
