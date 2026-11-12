package com.garmin.feature.garminpay.providers.felica.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import hn2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import pn2.t;
import sy2.g;
import v.b0;
import vg1.d;
import vn2.i1;
import vn2.j1;
import vn2.k1;
import vn2.o0;
import vn2.q0;
import vn2.v0;
import xy2.m;
import xy2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaUpdateUserInfoActivity;", "Lhn2/c;", "Lvn2/k1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaUpdateUserInfoActivity extends c implements k1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f50988j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f50989k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1 f50991h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FelicaUpdateUserInfoActivity f50990g = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.AbstractC1676c f50992i = new c.AbstractC1676c.a();

    static {
        int i14 = gt2.c.f79010a;
        f50989k = gt2.b.f79005a.h("PAY#FN#FelicaUpdateUserInfoActivity");
    }

    @Override // vn2.k1
    public final void D1(int i14) {
        f50989k.trace("finishView()");
        setResult(i14);
        finish();
    }

    @Override // vq2.c
    /* JADX INFO: renamed from: M */
    public final Activity getF52032a() {
        return this.f50990g;
    }

    @Override // hn2.c
    /* JADX INFO: renamed from: Q9, reason: from getter */
    public final c.AbstractC1676c getF84550d() {
        return this.f50992i;
    }

    @Override // vq2.f
    public final View W0() {
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // vn2.k1
    public final void X5(String str) {
        str.getClass();
        f50989k.trace("navigateToUserVerification()");
        runOnUiThread(new d(6, this, str));
    }

    @Override // hn2.c
    public final void Y9(c.AbstractC1676c abstractC1676c) {
        this.f50992i = abstractC1676c;
    }

    @Override // sy2.e
    public final void a(j1 j1Var) {
        j1 j1Var2 = j1Var;
        j1Var2.getClass();
        this.f50991h = j1Var2;
    }

    @Override // sy2.e
    public final j1 b() {
        j1 j1Var = this.f50991h;
        if (j1Var != null) {
            return j1Var;
        }
        s.m("presenter");
        throw null;
    }

    @Override // vn2.k1
    public final void e3() {
        f50989k.trace("leaveUserVerification()");
        getSupportFragmentManager().a0(1, "PAY#FN#FelicaUserVerificationFragment");
    }

    @Override // vn2.k1
    public final void e9(t tVar) {
        tVar.getClass();
        f50989k.trace("navigateToEditingUserInfo()");
        runOnUiThread(new o0(this, tVar, 0));
    }

    @Override // xn2.y
    public final void k0() {
        f50989k.trace("clearAllInputError()");
        runOnUiThread(new b0(this, 11));
    }

    @Override // vn2.k1
    public final void k7() {
        f50989k.trace("leaveEditingUserInfo()");
        getSupportFragmentManager().a0(1, "PAY#FN#FelicaEditUserInfoFragment");
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() > 1) {
            super.onBackPressed();
        } else {
            D1(0);
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_simple_frame_layout, c.a.BACK, getString(R.string.wallet_suica_title_user_information));
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(i1.class), t0Var.b(j1.class), t0Var.b(k1.class)).a(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_felica_edit_user_info, menu);
        return true;
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        f50989k.trace("onSupportNavigateUp()");
        onBackPressed();
        return true;
    }

    @Override // xn2.y
    public final void q3(int i14, String str, boolean z14) {
        f50989k.trace("showInputError()");
        runOnUiThread(new vn2.g(this, i14, str, z14, 1));
    }

    @Override // xn2.i0
    public final void u9() {
        f50989k.trace("showSingInDialog()");
        Z5(new uo1.a(this, 24));
    }

    @Override // vn2.k1
    public final void y7(t tVar) {
        tVar.getClass();
        f50989k.trace("navigateToViewingUserInfo()");
        runOnUiThread(new o0(this, tVar, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaUpdateUserInfoActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaUpdateUserInfoActivity$a$a;", "Lxy2/m;", "Lvn2/i1;", "", "cid", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1043a extends m<i1> {
            public static final Parcelable.Creator<C1043a> CREATOR = new C1044a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f50993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f50994b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1044a implements Parcelable.Creator<C1043a> {
                @Override // android.os.Parcelable.Creator
                public final C1043a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1043a(parcel.readString(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final C1043a[] newArray(int i14) {
                    return new C1043a[i14];
                }
            }

            public C1043a(String str, long j8) {
                str.getClass();
                this.f50993a = str;
                this.f50994b = j8;
            }

            @Override // xy2.i
            public final Object b() {
                return new q0(this.f50993a, this.f50994b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f50993a);
                parcel.writeLong(this.f50994b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaUpdateUserInfoActivity$a$b;", "Lxy2/n;", "Lvn2/j1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<j1> {
            public static final Parcelable.Creator<b> CREATOR = new C1045a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1045a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new b();
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i14) {
                    return new b[i14];
                }
            }

            @Override // xy2.i
            public final Object b() {
                return new v0();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(c cVar, String str, long j8) {
            cVar.getClass();
            str.getClass();
            Intent intent = new Intent(cVar, (Class<?>) FelicaUpdateUserInfoActivity.class);
            intent.putExtra("extra.synthesize.model_factory", new C1043a(str, j8));
            intent.putExtra("extra.synthesize.presenter_factory", new b());
            return intent;
        }

        private a() {
        }
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final c getF52032a() {
        return this.f50990g;
    }
}
