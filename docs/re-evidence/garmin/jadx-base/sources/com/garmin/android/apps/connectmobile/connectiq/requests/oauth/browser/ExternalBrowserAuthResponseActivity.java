package com.garmin.android.apps.connectmobile.connectiq.requests.oauth.browser;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.startup.StartupChecksActivity;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.google.gson.Gson;
import d53.w;
import f12.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import u10.i;
import u10.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/requests/oauth/browser/ExternalBrowserAuthResponseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExternalBrowserAuthResponseActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31992c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f31993a = new w1(s0.f105811a.b(i.class), new c(this), new v10.a(0), new d(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f31994b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31995a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31995a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f31996a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f31996a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f31996a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31996a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31997a;

        public c(g gVar) {
            this.f31997a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31997a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f31999b;

        public d(e23.a aVar, g gVar) {
            this.f31998a = aVar;
            this.f31999b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31998a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31999b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ExternalBrowserAuthResponseActivity() {
        l.f68084a.getClass();
        this.f31994b = l.a.a();
    }

    @Override // android.app.Activity
    public final void finish() {
        StartupChecksActivity.f44788d.getClass();
        StartupChecksActivity.a.c(this);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l lVar = this.f31994b;
        String strS2 = lVar.S2();
        ConnectIQOAuthRequest connectIQOAuthRequest = (strS2 == null || !(w.J(strS2) ^ true)) ? null : (ConnectIQOAuthRequest) new Gson().fromJson(strS2, ConnectIQOAuthRequest.class);
        if (connectIQOAuthRequest == null) {
            displayFailedMessage();
            finish();
            return;
        }
        super.initActionBar(false, connectIQOAuthRequest.getAppName());
        lVar.F2("");
        Uri data = getIntent().getData();
        if (data != null) {
            w1 w1Var = this.f31993a;
            ((i) w1Var.getValue()).f167752b.f(this, new b(new uo1.a(this, 7)));
            i iVar = (i) w1Var.getValue();
            String string = data.toString();
            string.getClass();
            ge1.b.T(v1.a(iVar), null, null, new j(iVar, string, connectIQOAuthRequest, null), 3);
        }
    }
}
