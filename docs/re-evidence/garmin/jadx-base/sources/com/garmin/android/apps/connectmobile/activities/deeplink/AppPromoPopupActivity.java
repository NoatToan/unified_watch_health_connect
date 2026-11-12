package com.garmin.android.apps.connectmobile.activities.deeplink;

import a61.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b.j;
import c22.b2;
import en.n;
import g.h;
import hb2.g;
import java.util.ArrayList;
import o13.p;
import o4.d0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/deeplink/AppPromoPopupActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppPromoPopupActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29002e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g.a f29005c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29003a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.e f29004b = (a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f29006d = registerForActivityResult(new h(), new i(this, 15));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29008b;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.GARMIN_DEZL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.GARMIN_DIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.GARMIN_PILOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.GARMIN_MESSENGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29007a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.DIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n.DEZL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[n.GARMIN_MESSENGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[n.AB_SYNAPSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[n.AB_QUANTUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[n.GARMIN_PILOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[n.CONNECT_IQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f29008b = iArr2;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        this.f29003a = getIntent().getLongExtra("deviceUnitId", -1L);
        n nVar = (n) n.f64676n.get(getIntent().getIntExtra("promotedApp", 0));
        boolean booleanExtra = getIntent().getBooleanExtra("showOpenApp", false);
        String stringExtra = getIntent().getStringExtra("devicePartNumber");
        int i14 = !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() ? 2131231126 : 2131231125;
        b2.f23009a.getClass();
        double[] dArrD = b2.d();
        ArrayList arrayList = new ArrayList(100);
        int i15 = 0;
        int i16 = 0;
        while (i15 < 100) {
            double d14 = dArrD[i15];
            int i17 = i16 + 1;
            Float fValueOf = Float.valueOf(i16 / 100);
            d0.f128823b.getClass();
            arrayList.add(new p(fValueOf, d0.a(d0.c((float) d14, d0.f128824c, 14))));
            i15++;
            i16 = i17;
        }
        initComposeScreen(new z3.e(-1845405059, true, new en.a(booleanExtra, this, nVar, stringExtra, (p[]) arrayList.toArray(new p[0]), i14, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/deeplink/AppPromoPopupActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PROMOTED_APP_KEY", "SHOW_OPEN_APP_KEY", "DEVICE_PART_NUMBER", "DEVICE_UNIT_ID", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, n nVar, boolean z14, Long l14, String str, int i14) {
            context.getClass();
            nVar.getClass();
            Intent intent = new Intent(context, (Class<?>) AppPromoPopupActivity.class);
            intent.putExtra("promotedApp", nVar.ordinal());
            intent.putExtra("showOpenApp", z14);
            intent.putExtra("deviceUnitId", l14);
            intent.putExtra("devicePartNumber", str);
            intent.setFlags(i14);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, n nVar, boolean z14, Long l14, String str, int i14) {
            if ((i14 & 4) != 0) {
                z14 = false;
            }
            boolean z15 = z14;
            Long l15 = (i14 & 8) != 0 ? null : l14;
            String str2 = (i14 & 16) != 0 ? null : str;
            aVar.getClass();
            return a(context, nVar, z15, l15, str2, 1610612736);
        }

        public static void c(a aVar, Context context, n nVar, int i14) {
            int i15 = (i14 & 32) != 0 ? 1610612736 : 0;
            aVar.getClass();
            nVar.getClass();
            context.startActivity(a(context, nVar, false, null, null, i15));
        }

        private a() {
        }
    }
}
