package com.garmin.feature.garminpay.providers.gpay.ui.updatedevice;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import gp2.e;
import hn2.c;
import o13.m;
import o13.p;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import yo2.h;
import zd0.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/updatedevice/NewFitPayUpdateDeviceActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayUpdateDeviceActivity extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f51718o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f51719p = m.b(new r0(23));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f51720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yo2.b f51722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f51724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zp2.b f51725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressBar f51726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f51727n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51728a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51728a = iArr;
        }
    }

    public final void ca() {
        br2.c cVar = br2.c.f19585a;
        String string = getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = getString(R.string.verification_selection_failed);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, string, string2, new p(getString(R.string.lbl_ok), new z21.a((byte) 0, 26)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String creditCardId;
        Object serializableExtra;
        super.onCreate(bundle);
        R9(R.layout.fragment_garminpay_download_card, c.a.BACK, "");
        c.ba(this, Boolean.TRUE, null, null, 14);
        this.f51720g = Long.valueOf(getIntent().getLongExtra("device.unit.id", -1L));
        yo2.b bVar = (yo2.b) getIntent().getParcelableExtra("extra.credit.card");
        this.f51722i = bVar;
        t tVar = f51719p;
        a aVar = f51718o;
        if (bVar == null || (creditCardId = bVar.getCreditCardId()) == null) {
            aVar.getClass();
            ((Logger) tVar.getValue()).error("onCreate: missing credit card id");
            ca();
            return;
        }
        this.f51721h = creditCardId;
        this.f51723j = getIntent().getBooleanExtra("extra.is.credit.card.and.credential.flow", false);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra.credential.state", e.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("extra.credential.state") : null;
            if (!(serializableExtra2 instanceof e)) {
                serializableExtra2 = null;
            }
            serializableExtra = (e) serializableExtra2;
        }
        this.f51724k = (e) serializableExtra;
        zp2.b bVar2 = (zp2.b) new x1(this).b(s0.f105811a.b(zp2.b.class));
        Long l14 = this.f51720g;
        String str = this.f51721h;
        int i14 = 2;
        if (((l14 == null || str == null) ? null : ge1.b.T(v1.a(bVar2), o53.s0.f129406a, null, new zp2.c(bVar2, l14.longValue(), str, null), 2)) == null) {
            aVar.getClass();
            ((Logger) tVar.getValue()).error("onViewCreated: deviceId or creditCard is null (" + this.f51720g + ", " + this.f51721h + ")");
            Unit unit = Unit.INSTANCE;
        }
        this.f51725l = bVar2;
        bVar2.f206606f.f(this, new zp2.a(this, 1));
        zp2.b bVar3 = this.f51725l;
        if (bVar3 != null) {
            bVar3.f206603c.f(this, new zp2.a(this, i14));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        zp2.b bVar = this.f51725l;
        if (bVar != null) {
            bVar.f206602b.f(this, new zp2.a(this, 0));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/updatedevice/NewFitPayUpdateDeviceActivity$a;", "", "<init>", "()V", "", "EMPTY_STRING", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Long l14, yo2.b bVar, boolean z14, e eVar) {
            Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) NewFitPayUpdateDeviceActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("extra.credit.card", bVar);
            intent.putExtra("extra.is.credit.card.and.credential.flow", z14);
            Intent intentPutExtra = intent.putExtra("extra.credential.state", eVar);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private a() {
        }
    }
}
