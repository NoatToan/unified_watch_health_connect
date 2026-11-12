package com.garmin.feature.garminpay.providers.felica.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import hn2.c;
import java.util.ArrayList;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import pn2.e;
import pn2.f;
import sy2.g;
import vb.h;
import vn2.f1;
import vn2.g1;
import vn2.h1;
import vn2.l0;
import vn2.m0;
import xy2.m;
import xy2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTransactionHistoryActivity;", "Lhn2/c;", "Lvn2/h1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaTransactionHistoryActivity extends c implements h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f50984h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f50985i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g1 f50986g;

    static {
        int i14 = gt2.c.f79010a;
        f50985i = gt2.b.f79005a.h("FelicaTransactionHistoryActivity");
    }

    @Override // sy2.e
    public final void a(g1 g1Var) {
        g1 g1Var2 = g1Var;
        g1Var2.getClass();
        this.f50986g = g1Var2;
    }

    @Override // sy2.e
    public final g1 b() {
        g1 g1Var = this.f50986g;
        if (g1Var != null) {
            return g1Var;
        }
        s.m("presenter");
        throw null;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.layout_felica_recycler_view, c.a.BACK, getString(R.string.wallet_transactions));
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(f1.class), t0Var.b(g1.class), t0Var.b(h1.class)).a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vn2.h1
    public final void y(e eVar) {
        eVar.getClass();
        f50985i.trace("showHistory()");
        ArrayList arrayList = new ArrayList();
        for (f fVar : eVar.b()) {
            if (!s.g(fVar.getValid(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                String message = fVar.getMessage();
                message.getClass();
                arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.b(message, null, 2, 0 == true ? 1 : 0));
            } else {
                if (fVar.getRecord() == null) {
                    h.s("Required value was null.");
                    return;
                }
                arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.c(fVar.getRecord()));
            }
        }
        ((RecyclerView) findViewById(R.id.recycler_view)).setAdapter(new com.garmin.feature.garminpay.providers.felica.ui.a(this, arrayList));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTransactionHistoryActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTransactionHistoryActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTransactionHistoryActivity$a$a;", "Lxy2/m;", "Lvn2/f1;", "Lpn2/e;", "history", "<init>", "(Lpn2/e;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1040a extends m<f1> {
            public static final Parcelable.Creator<C1040a> CREATOR = new C1041a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f50987a;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTransactionHistoryActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1041a implements Parcelable.Creator<C1040a> {
                @Override // android.os.Parcelable.Creator
                public final C1040a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1040a(e.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final C1040a[] newArray(int i14) {
                    return new C1040a[i14];
                }
            }

            public C1040a(e eVar) {
                eVar.getClass();
                this.f50987a = eVar;
            }

            @Override // xy2.i
            public final Object b() {
                return new l0(this.f50987a);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                this.f50987a.writeToParcel(parcel, i14);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTransactionHistoryActivity$a$b;", "Lxy2/n;", "Lvn2/g1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<g1> {
            public static final Parcelable.Creator<b> CREATOR = new C1042a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTransactionHistoryActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1042a implements Parcelable.Creator<b> {
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
                return new m0();
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

        private a() {
        }
    }
}
