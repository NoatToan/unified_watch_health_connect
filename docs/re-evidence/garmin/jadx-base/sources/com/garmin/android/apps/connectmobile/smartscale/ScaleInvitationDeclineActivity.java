package com.garmin.android.apps.connectmobile.smartscale;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
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
import fw.m;
import fw.p;
import hb2.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wd2.h0;
import wn1.k;
import wn1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/ScaleInvitationDeclineActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScaleInvitationDeclineActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44378d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f44379a = new w1(s0.f105811a.b(l.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f44381c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44382a;

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
            f44382a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44383a;

        public b(g gVar) {
            this.f44383a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44383a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44384a;

        public c(g gVar) {
            this.f44384a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44384a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44386b;

        public d(e23.a aVar, g gVar) {
            this.f44385a = aVar;
            this.f44386b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44385a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44386b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca() {
        hideProgressOverlay();
        if (!s.g(this.f44381c, Boolean.TRUE)) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
            return;
        }
        f12.l.f68084a.getClass();
        int iY4 = f12.l.a.a().y4();
        if (iY4 > 0) {
            f12.l.a.a().r3(iY4 - 1);
        }
        Toast.makeText(this, R.string.txt_you_have_declined_this_request, 0).show();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        if (!i.a(this)) {
            Toast.makeText(this, R.string.txt_no_internet_connection, 0).show();
            finish();
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
        Long lValueOf = bVar != null ? Long.valueOf(bVar.d()) : null;
        Long deviceInviteID = bVar != null ? bVar.getDeviceInviteID() : null;
        Long invitorID = bVar != null ? bVar.getInvitorID() : null;
        Long inviteeID = bVar != null ? bVar.getInviteeID() : null;
        if (!(bVar != null ? bVar.s() : false)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.e(a2Var, "Aborting. Invalid extra params. One or more ids are invalid");
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
        }
        setContentView(R.layout.gcm3_content_frame);
        w1 w1Var = this.f44379a;
        dh.b.L(((l) w1Var.getValue()).f186258c, this, new h0(this, 7));
        l lVar = (l) w1Var.getValue();
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar2 = new com.garmin.android.apps.connectmobile.smartscale.model.b(deviceInviteID, String.valueOf(lValueOf), invitorID, null, null, inviteeID, null, com.garmin.android.apps.connectmobile.smartscale.model.d.DECLINED, null, null, null, null, null, null, null, null, 65368, null);
        y0<m<Unit>> y0Var = lVar.f186258c;
        m<Unit> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.j(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(lVar), null, null, new k(lVar, bVar2, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f44380b = true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f44380b = false;
        if (this.f44381c != null) {
            ca();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(-1L);
    }
}
