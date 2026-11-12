package com.garmin.android.apps.connectmobile.groupride;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bn0.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import e23.l;
import fw.p;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import z10.e1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/groupride/GroupRideShareActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideShareActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f36417i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f36418j = "GroupRideShareActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f36419a = gt2.c.b(a2.GROUPRIDE.f28756a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f36420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f36421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.c<Intent> f36422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.c<Intent> f36423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.groupride.a f36424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bn0.e f36425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bn0.d f36426h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36427a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36427a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36428a;

        public c(l lVar) {
            lVar.getClass();
            this.f36428a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f36428a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36428a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36429a;

        public d(b.g gVar) {
            this.f36429a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36429a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36430a;

        public e(b.g gVar) {
            this.f36430a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36430a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36432b;

        public f(e23.a aVar, b.g gVar) {
            this.f36431a = aVar;
            this.f36432b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36431a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36432b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36433a;

        public g(b.g gVar) {
            this.f36433a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36433a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36434a;

        public h(b.g gVar) {
            this.f36434a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36434a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36436b;

        public i(e23.a aVar, b.g gVar) {
            this.f36435a = aVar;
            this.f36436b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36435a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36436b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public GroupRideShareActivity() {
        d dVar = new d(this);
        t0 t0Var = s0.f105811a;
        this.f36420b = new w1(t0Var.b(e1.class), new e(this), dVar, new f(null, this));
        this.f36421c = new w1(t0Var.b(bn0.l.class), new h(this), new g(this), new i(null, this));
        this.f36426h = (bn0.d) KoinJavaComponent.get$default(bn0.d.class, null, null, 6, null);
    }

    public final void ca(int i14, int i15) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        aVar.setTitle(i14);
        aVar.setMessage(i15);
        String string = getString(R.string.lbl_ok);
        string.getClass();
        aVar.setPositiveButton(g22.n.g(string), new ai1.a(this, 5));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.setCanceledOnTouchOutside(false);
        eVarCreate.show();
    }

    public final void da(long j8, String str, String str2) {
        bn0.l lVar = (bn0.l) this.f36421c.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(lVar), null, null, new bn0.n(y0Var, lVar, j8, str2, null), 3);
        y0Var.f(this, new c(new bn0.h(this, str, j8, str2, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_group_ride_share_activity);
        initActionBar(getString(R.string.lbl_group_ride_code), 2);
        com.garmin.android.apps.connectmobile.groupride.a.f36437c.getClass();
        this.f36424f = new com.garmin.android.apps.connectmobile.groupride.a(new l22.a(this));
        View viewFindViewById = findViewById(R.id.group_ride_details_container);
        viewFindViewById.getClass();
        com.garmin.android.apps.connectmobile.groupride.a aVar = this.f36424f;
        if (aVar == null) {
            s.m("formatter");
            throw null;
        }
        this.f36425g = new bn0.e(viewFindViewById, aVar);
        Intent intent = getIntent();
        final String stringExtra = intent != null ? intent.getStringExtra("EXTRA_GROUP_RIDE_CODE") : null;
        if (stringExtra == null || stringExtra.length() == 0) {
            finish();
            return;
        }
        this.f36422d = registerForActivityResult(new g.h(), new f.b() { // from class: bn0.g
            @Override // f.b
            public final void a(Object obj) {
                GroupRideShareActivity groupRideShareActivity = this.f18992a;
                Logger logger = groupRideShareActivity.f36419a;
                f.a aVar2 = (f.a) obj;
                GroupRideShareActivity.a aVar3 = GroupRideShareActivity.f36417i;
                aVar2.getClass();
                if (aVar2.f67585a == -1) {
                    d dVar = groupRideShareActivity.f36426h;
                    String str = GroupRideShareActivity.f36418j;
                    logger.debug(str + " - Received id of selected device");
                    long jA = dVar.a();
                    if (jA != -1) {
                        groupRideShareActivity.da(jA, dVar.b(jA), stringExtra);
                        return;
                    }
                    logger.error(str + " - Device id not received or a device with invalid id was selected");
                }
            }
        });
        this.f36423e = registerForActivityResult(new g.h(), new a61.i(this, 5));
        bn0.l lVar = (bn0.l) this.f36421c.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(lVar), null, null, new m(y0Var, lVar, stringExtra, null), 3);
        y0Var.f(this, new c(new a42.i(29, this, stringExtra)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/groupride/GroupRideShareActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "EXTRA_GROUP_RIDE_CODE", "", "CLOSE_SUCCESS_INDICATOR_DELAY", "J", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
