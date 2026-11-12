package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import t61.m;
import vc0.v;
import vg1.t0;
import vg1.v0;
import vg1.w0;
import vg1.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/TransferActivityProfilesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TransferActivityProfilesActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f42791h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f42792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f42793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f42794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f42795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42796e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42797f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f42798g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42799a;

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
            f42799a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f42800a;

        public c(l lVar) {
            lVar.getClass();
            this.f42800a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f42800a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42800a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_transfer_activity_profiles);
        initActionBar(true, R.string.bic_transfer_activity_profiles_button);
        Intent intent = getIntent();
        this.f42796e = (intent == null || (extras2 = intent.getExtras()) == null) ? -1L : extras2.getLong("GCM_deviceUnitID", -1L);
        Intent intent2 = getIntent();
        String string = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : extras.getString("GCM_deviceName");
        if (string == null) {
            string = "";
        }
        this.f42797f = string;
        if (this.f42796e == -1 || string.length() == 0) {
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.empty_state_container);
        viewFindViewById.getClass();
        this.f42792a = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.backups_container);
        viewFindViewById2.getClass();
        this.f42793b = viewFindViewById2;
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2.findViewById(R.id.backups_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        View view2 = this.f42793b;
        if (view2 == null) {
            s.m("backupsContainer");
            throw null;
        }
        View viewFindViewById3 = view2.findViewById(R.id.btn_transfer);
        viewFindViewById3.getClass();
        this.f42794c = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new m(this, 29));
        v0 v0Var = new v0(new v(this, 8));
        this.f42795d = v0Var;
        recyclerView.setAdapter(v0Var);
        y0 y0Var = (y0) new x1(this).b(s0.f105811a.b(y0.class));
        this.f42798g = y0Var;
        long j8 = this.f42796e;
        androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
        y0Var2.j(g3.a.c(g3.f35298f));
        new SimpleSetupProtoManager(j8, new w0(y0Var, y0Var2)).sendFeatureListRequest();
        y0Var2.f(this, new c(new t0(this, 1)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/TransferActivityProfilesActivity$a;", "", "<init>", "()V", "", "TRANSFER_PROFILES_SUCCESS_DELAY", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
