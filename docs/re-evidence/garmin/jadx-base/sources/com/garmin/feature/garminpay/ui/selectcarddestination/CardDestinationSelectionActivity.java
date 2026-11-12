package com.garmin.feature.garminpay.ui.selectcarddestination;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import e23.l;
import g.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import o53.c2;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import yr2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/CardDestinationSelectionActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CardDestinationSelectionActivity extends hn2.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f52143n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f52144o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f52146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f52147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qs2.d f52148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f52149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f52150l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f52145g = new w1(s0.f105811a.b(fr2.a.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f52151m = registerForActivityResult(new h(), new jp.a(this, 27));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52153a;

        static {
            int[] iArr = new int[br2.d.values().length];
            try {
                iArr[br2.d.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[br2.d.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[br2.d.NFC_NOT_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52153a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52154a;

        public c(l lVar) {
            lVar.getClass();
            this.f52154a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52154a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52154a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f52155a;

        public d(g gVar) {
            this.f52155a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f52155a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f52156a;

        public e(g gVar) {
            this.f52156a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f52156a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f52157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f52158b;

        public f(e23.a aVar, g gVar) {
            this.f52157a = aVar;
            this.f52158b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f52157a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52158b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52144o = gt2.b.f79005a.h("PAY#CardDestinationSelectionActivity");
    }

    public final fr2.a ca() {
        return (fr2.a) this.f52145g.getValue();
    }

    public final void da(long j8, String str) {
        if (this.f52150l) {
            f52144o.debug("Passcode entry is in progress, just wait for the result");
            return;
        }
        this.f52150l = true;
        PasscodeEntryActivity.a aVar = PasscodeEntryActivity.f52121n;
        Long lValueOf = Long.valueOf(j8);
        qs2.d dVar = this.f52148j;
        aVar.getClass();
        this.f52151m.a(PasscodeEntryActivity.a.b(this, lValueOf, str, dVar), null);
    }

    public final void ea(br2.f fVar) {
        boolean z14;
        boolean z15;
        fVar.getClass();
        br2.d dVar = fVar.f19602d;
        Logger logger = f52144o;
        logger.trace("onDeviceSelected({})", fVar);
        hn2.a aVar = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
        long j8 = fVar.f19599a;
        DeviceProfile deviceProfileB = aVar.b(j8);
        ca();
        hs2.e.a aVarE4 = fr2.a.E4(fVar);
        logger.debug("onDeviceSelected(): reason={}, remoteDeviceProfile={}", aVarE4 != null ? aVarE4.name() : null, deviceProfileB);
        if (aVarE4 == null && dVar != br2.d.CONNECTED) {
            int i14 = b.f52153a[dVar.ordinal()];
            if (i14 == 1) {
                wr.g.v("onDeviceSelected: device ", j8, " is connecting...", logger);
                return;
            }
            if (i14 == 2) {
                br2.c.f19585a.d(this, fVar.f19600b, new rr2.a(this, 0));
                return;
            }
            if (i14 == 3) {
                br2.c.f19585a.k(this);
                return;
            }
            logger.warn("onDeviceSelected: unsupported status " + dVar + " for device " + j8);
            return;
        }
        if (aVarE4 == hs2.e.a.NFC_STACK_FAILED) {
            br2.c.f19585a.l(this);
            return;
        }
        if (aVarE4 == hs2.e.a.ENVIRONMENT_MISMATCH) {
            kj0.b.f104940a.getClass();
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                Toast.makeText(this, "This device is not supported in this Garmin Connect environment", 1).show();
                return;
            } else {
                br2.c.f19585a.g(null, this);
                return;
            }
        }
        fr2.a aVarCa = ca();
        if (fr2.a.E4(fVar) == hs2.e.a.FIRMWARE_MISSING_REQUIRED_CMDS) {
            z15 = false;
        } else {
            ns2.a<? extends ms2.e> aVarQ = aVarCa.f73321h.get(Long.valueOf(j8));
            if (aVarQ == null) {
                aVarQ = gg.b.q(false);
            }
            List<T> list = aVarQ.f127815a;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    } else if (((ms2.e) it.next()).Z3().contains(qs2.b.FIRMWARE_VERSION_TOO_LOW)) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            z15 = !z14;
        }
        if (!z15) {
            com.garmin.feature.garminpay.ui.selectcarddestination.a.f52159b.getClass();
            com.garmin.feature.garminpay.ui.selectcarddestination.a aVar2 = new com.garmin.feature.garminpay.ui.selectcarddestination.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("DeviceItemBundleKey", fVar);
            aVar2.setArguments(bundle);
            fa(aVar2);
            return;
        }
        if (deviceProfileB == null) {
            br2.c.f19585a.g(null, this);
            logger.warn("onDeviceSelected: Missing RemoteDeviceProfile for " + j8 + "...");
            return;
        }
        ns2.a<? extends ms2.e> aVarQ2 = ca().f73321h.get(Long.valueOf(j8));
        if (aVarQ2 == null) {
            aVarQ2 = gg.b.q(false);
        }
        if (aVarQ2.f127815a.isEmpty()) {
            br2.c.f19585a.m(this);
            return;
        }
        logger.trace("setResultWithPasscodeCheck(" + fVar + ")");
        if (this.f52149k != null) {
            logger.info("Passcode refresh in progress, skip.");
        } else {
            this.f52149k = ge1.b.T(f0.w(this), null, null, new rr2.d(this, fVar, null), 3);
        }
    }

    public final void fa(Fragment fragment) {
        String string = getString(R.string.label_select_watch);
        string.getClass();
        W9(string, hn2.c.a.BACK);
        Fragment fragment2 = this.f52146h;
        if (fragment2 == null || !s.g(fragment2.getTag(), fragment.getTag())) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            aVarB.l(R.id.device_selection_container, fragment, fragment.getClass().getCanonicalName());
            aVarB.e();
            this.f52146h = fragment;
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        R9(R.layout.activity_card_destination_selection, hn2.c.a.BACK, null);
        Intent intent = getIntent();
        intent.getClass();
        Bundle extras2 = intent.getExtras();
        if (extras2 != null ? extras2.getBoolean("is.large.bundle") : false) {
            l2.f37135b.getClass();
            extras = l2.a.a(intent);
        } else {
            extras = intent.getExtras();
        }
        Logger logger = f52144o;
        if (extras == null) {
            logger.error("Incorrect bundle passed from caller");
            finish();
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = (Parcelable) extras.getParcelable("extra.operators.by.device", a.C1099a.class);
        } else {
            Parcelable parcelable3 = extras.getParcelable("extra.operators.by.device");
            if (!(parcelable3 instanceof a.C1099a)) {
                parcelable3 = null;
            }
            parcelable = (a.C1099a) parcelable3;
        }
        a.C1099a c1099a = (a.C1099a) parcelable;
        if (c1099a == null) {
            logger.error("container is not passed.");
            finish();
            return;
        }
        ca().f73321h = c1099a.f52152a;
        this.f52147i = Long.valueOf(extras.getLong("device.unit.id", -1L));
        if (i14 >= 33) {
            parcelable2 = (Parcelable) extras.getParcelable("extra.wallet.item", qs2.d.class);
        } else {
            Parcelable parcelable4 = extras.getParcelable("extra.wallet.item");
            if (!(parcelable4 instanceof qs2.d)) {
                parcelable4 = null;
            }
            parcelable2 = (qs2.d) parcelable4;
        }
        this.f52148j = (qs2.d) parcelable2;
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        ca().s1().f(this, new c(new rk0.g(5, this, c1099a)));
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/CardDestinationSelectionActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "NO_DEVICE_UNIT_ID_PASSED_VALUE", "J", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/CardDestinationSelectionActivity$a$a;", "Landroid/os/Parcelable;", "", "", "Lns2/a;", "Lms2/e;", "operatorsByDevice", "<init>", "(Ljava/util/Map;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1099a implements Parcelable {
            public static final Parcelable.Creator<C1099a> CREATOR = new C1100a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map<Long, ns2.a<ms2.e>> f52152a;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1100a implements Parcelable.Creator<C1099a> {
                @Override // android.os.Parcelable.Creator
                public final C1099a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        linkedHashMap.put(Long.valueOf(parcel.readLong()), parcel.readParcelable(C1099a.class.getClassLoader()));
                    }
                    return new C1099a(linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final C1099a[] newArray(int i14) {
                    return new C1099a[i14];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1099a(Map<Long, ? extends ns2.a<? extends ms2.e>> map) {
                map.getClass();
                this.f52152a = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1099a) && this.f52152a.equals(((C1099a) obj).f52152a);
            }

            public final int hashCode() {
                return this.f52152a.hashCode();
            }

            public final String toString() {
                return "OperatorMapContainer(operatorsByDevice=" + this.f52152a + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                Iterator itU = am.j.u(this.f52152a, parcel);
                while (itU.hasNext()) {
                    Map.Entry entry = (Map.Entry) itU.next();
                    parcel.writeLong(((Number) entry.getKey()).longValue());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i14);
                }
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Activity activity, ns2.a aVar, long j8, qs2.d dVar) {
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) CardDestinationSelectionActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra.operators.by.device", new C1099a(t0.b(new p(Long.valueOf(j8), aVar))));
            bundle.putLong("device.unit.id", j8);
            bundle.putParcelable("extra.wallet.item", dVar);
            k.a(intent, bundle);
            return intent;
        }

        public static Intent b(a aVar, Activity activity, Map map) {
            aVar.getClass();
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) CardDestinationSelectionActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra.operators.by.device", new C1099a(map));
            bundle.putLong("device.unit.id", -1L);
            bundle.putParcelable("extra.wallet.item", null);
            k.a(intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}
