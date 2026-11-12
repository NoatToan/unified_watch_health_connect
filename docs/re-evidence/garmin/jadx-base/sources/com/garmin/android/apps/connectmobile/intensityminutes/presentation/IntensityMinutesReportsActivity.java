package com.garmin.android.apps.connectmobile.intensityminutes.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.gncs.NotificationConstants;
import g22.k;
import h7.c;
import java.io.Serializable;
import m92.f;
import o13.m;
import o13.n;
import o13.p;
import or0.q;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/intensityminutes/presentation/IntensityMinutesReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntensityMinutesReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36935b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36936a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<or0.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f36938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f36939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f36940d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f36937a = gVar;
            this.f36938b = qualifier;
            this.f36939c = aVar;
            this.f36940d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, or0.m] */
        @Override // e23.a
        public final or0.m invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f36937a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f36939c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(or0.m.class), viewModelStore, null, defaultViewModelCreationExtras, this.f36938b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f36940d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.DAILY_SUMMARY;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, o13.l] */
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
        p2 p2Var = ((or0.m) this.f36936a.getValue()).f133367f;
        if (gVar != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, q.a((q) value2, false, false, gVar, null, 0, null, 59)));
        }
        if (dateTime != null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, q.a((q) value, false, false, null, k.z(dateTime).b(), 0, null, 55)));
        }
        initComposeScreen(new e(812842386, true, new f(this, 24)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = c.a(new p(NotificationConstants.KEY_DATA_MIME_TYPE, "intensity_minutes"));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewActivityDetail");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/intensityminutes/presentation/IntensityMinutesReportsActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_INTERVAL_TYPE", "Ljava/lang/String;", "EXTRA_INITIAL_DATE", "MENU_ITEM_HELP", "MENU_ITEM_EDIT_GOAL", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, DateTime dateTime, o82.g gVar) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) IntensityMinutesReportsActivity.class);
            intent.putExtra("EXTRA_INITIAL_DATE", dateTime);
            intent.putExtra("EXTRA_SELECTED_INTERVAL_TYPE", gVar);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, DateTime dateTime) {
            aVar.getClass();
            return a(context, dateTime, null);
        }

        private a() {
        }
    }
}
