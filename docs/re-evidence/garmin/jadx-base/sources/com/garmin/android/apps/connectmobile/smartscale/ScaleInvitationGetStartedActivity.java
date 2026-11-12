package com.garmin.android.apps.connectmobile.smartscale;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fw.p;
import hb2.i;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import wd2.h0;
import wn1.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/ScaleInvitationGetStartedActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScaleInvitationGetStartedActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f44387f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f44388a = m.b(new d0(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f44389b = new w1(s0.f105811a.b(wn1.c.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.smartscale.model.b f44391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.smartscale.model.a.b f44392e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44394b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.smartscale.model.a.b.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.smartscale.model.a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.smartscale.model.a.b.REACH_DEVICE_MAX_USER_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44393a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f44394b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44395a;

        public b(g gVar) {
            this.f44395a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44395a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44396a;

        public c(g gVar) {
            this.f44396a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44396a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44398b;

        public d(e23.a aVar, g gVar) {
            this.f44397a = aVar;
            this.f44398b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44397a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44398b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca() {
        String string;
        hideProgressOverlay();
        com.garmin.android.apps.connectmobile.smartscale.model.a.b bVar = this.f44392e;
        int i14 = bVar == null ? -1 : a.f44393a[bVar.ordinal()];
        if (i14 == 1) {
            Bundle bundleA = h7.c.a(new o13.p("GCM_extra_device_invite", this.f44391d));
            IndexScaleTellUSMoreActivity.f44359h.getClass();
            Intent intent = new Intent(this, (Class<?>) IndexScaleTellUSMoreActivity.class);
            intent.putExtras(bundleA);
            startActivity(intent);
            finish();
            return;
        }
        if (i14 != 2) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar2 = this.f44391d;
        if (bVar2 == null || (string = bVar2.getInvitorName()) == null) {
            string = getString(R.string.no_value);
            string.getClass();
        }
        e eVarCreate = new e.a(this).create();
        eVarCreate.setCancelable(false);
        eVarCreate.setCanceledOnTouchOutside(false);
        eVarCreate.setTitle(R.string.smart_scale_max_users_reached_title);
        eVarCreate.h(getString(R.string.smart_scale_max_users_reached_msg, string));
        eVarCreate.g(-3, getText(R.string.lbl_ok), new sa2.b(this, 27));
        eVarCreate.show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        if (!i.a(this)) {
            Toast.makeText(this, R.string.txt_no_internet_connection, 0).show();
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_device_invite", com.garmin.android.apps.connectmobile.smartscale.model.b.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_device_invite");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.smartscale.model.b)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.smartscale.model.b) parcelable2;
            }
            bVar = (com.garmin.android.apps.connectmobile.smartscale.model.b) parcelable;
        } else {
            bVar = null;
        }
        this.f44391d = bVar;
        long jD = bVar != null ? bVar.d() : -1L;
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar2 = this.f44391d;
        if (!(bVar2 != null ? bVar2.s() : false)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.e(a2Var, "Aborting. Invalid extra params. One or more ids are invalid");
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
        }
        setContentView(R.layout.gcm3_content_frame);
        w1 w1Var = this.f44389b;
        dh.b.L(((wn1.c) w1Var.getValue()).f186195c, this, new h0(this, 8));
        wn1.c cVar = (wn1.c) w1Var.getValue();
        y0<fw.m<com.garmin.android.apps.connectmobile.smartscale.model.a>> y0Var = cVar.f186195c;
        fw.m<com.garmin.android.apps.connectmobile.smartscale.model.a> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(cVar), null, null, new wn1.b(cVar, jD, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f44390c = true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f44390c = false;
        if (this.f44392e != null) {
            ca();
        }
    }
}
