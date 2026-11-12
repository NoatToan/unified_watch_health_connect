package com.garmin.android.apps.connectmobile.performance.acclimation.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import e32.c;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import ei0.q0;
import java.io.Serializable;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/HeatAltitudeAcclimationActivity;", "Le32/n;", "Ld61/b;", "Le32/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeatAltitudeAcclimationActivity extends n<d61.b> implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f39835o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c61.a f39836n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39837a;

        static {
            int[] iArr = new int[c61.a.values().length];
            try {
                iArr[c61.a.ALTITUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c61.a.HEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39837a = iArr;
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        d61.b bVar = (d61.b) obj;
        bVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "AltitudeAcclimationActivity", "[navigateTo] Error! Tried to navigate to destination " + bVar + " and it was not handled!");
        q0.b(this);
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        Integer num = o.f62806i.f62822d;
        if (num == null || i14 != num.intValue()) {
            com.garmin.android.apps.connectmobile.performance.acclimation.presentation.b.a aVar = com.garmin.android.apps.connectmobile.performance.acclimation.presentation.b.f39846r;
            c61.a aVar2 = this.f39836n;
            if (aVar2 == null) {
                s.m("trainingStatusAcclimationType");
                throw null;
            }
            aVar.getClass();
            i.f62791o.getClass();
            Bundle bundleA = i.a.a(i14, j8, j14);
            bundleA.putSerializable("extra_acclimation_data", aVar2);
            com.garmin.android.apps.connectmobile.performance.acclimation.presentation.b bVar = new com.garmin.android.apps.connectmobile.performance.acclimation.presentation.b();
            bVar.setArguments(bundleA);
            return bVar;
        }
        com.garmin.android.apps.connectmobile.performance.acclimation.presentation.a.C0730a c0730a = com.garmin.android.apps.connectmobile.performance.acclimation.presentation.a.f39840p;
        c61.a aVar3 = this.f39836n;
        if (aVar3 == null) {
            s.m("trainingStatusAcclimationType");
            throw null;
        }
        c0730a.getClass();
        com.garmin.android.apps.connectmobile.performance.acclimation.presentation.a aVar4 = new com.garmin.android.apps.connectmobile.performance.acclimation.presentation.a();
        Bundle bundle = new Bundle();
        c.f62777m.getClass();
        bundle.putLong("extra.date.time", j8);
        bundle.putSerializable("extra_acclimation_data", aVar3);
        aVar4.setArguments(bundle);
        return aVar4;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Serializable serializableExtra = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("extra_acclimation_data") : null;
            serializableExtra = (c61.a) (serializableExtra2 instanceof c61.a ? serializableExtra2 : null);
        } else if (intent != null) {
            serializableExtra = intent.getSerializableExtra("extra_acclimation_data", c61.a.class);
        }
        c61.a aVar = (c61.a) serializableExtra;
        if (aVar == null) {
            aVar = c61.a.ALTITUDE;
        }
        this.f39836n = aVar;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        c61.a aVar = this.f39836n;
        if (aVar == null) {
            s.m("trainingStatusAcclimationType");
            throw null;
        }
        int i14 = b.f39837a[aVar.ordinal()];
        if (i14 == 1) {
            HelpActivity.a aVar2 = HelpActivity.f36653a;
            l lVar = l.TRAINING_STATUS;
            aVar2.getClass();
            HelpActivity.a.d(this, lVar, "ALTITUDE_ACTION", null);
            return true;
        }
        if (i14 != 2) {
            u0.r();
            return false;
        }
        HelpActivity.a aVar3 = HelpActivity.f36653a;
        l lVar2 = l.TRAINING_STATUS;
        aVar3.getClass();
        HelpActivity.a.d(this, lVar2, "HEAT_ACTION", null);
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new j(this, dateTime, new o[]{o.f62806i, o.f62807j, o.f62808k}, null, 8, null);
    }

    @Override // e32.n
    public final String ta() {
        Intent intent = getIntent();
        Serializable serializableExtra = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("extra_acclimation_data") : null;
            serializableExtra = (c61.a) (serializableExtra2 instanceof c61.a ? serializableExtra2 : null);
        } else if (intent != null) {
            serializableExtra = intent.getSerializableExtra("extra_acclimation_data", c61.a.class);
        }
        c61.a aVar = (c61.a) serializableExtra;
        if (aVar == null) {
            aVar = c61.a.ALTITUDE;
        }
        int i14 = b.f39837a[aVar.ordinal()];
        if (i14 == 1) {
            String string = getString(R.string.lbl_altitude_acclimation);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        String string2 = getString(R.string.lbl_heat_acclimation);
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/HeatAltitudeAcclimationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ACCLIMATION_DATA_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, c61.a aVar) {
            aVar.getClass();
            if (context != null) {
                context.startActivity(new Intent(context, (Class<?>) HeatAltitudeAcclimationActivity.class).putExtra("extra_acclimation_data", aVar));
            }
        }

        private a() {
        }
    }
}
