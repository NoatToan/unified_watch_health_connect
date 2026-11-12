package com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders;

import android.os.Bundle;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pd1.c;
import xg0.v;
import xm0.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/BloodPressureRemindersActivity;", "Ljd1/a;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BloodPressureRemindersActivity extends jd1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30927d = new a(null);

    @Override // jd1.a
    public final void ca(pd1.b bVar) {
        f.d(f.f23050a, this, "", getString(R.string.lbl_delete_reminder_question), new p(getString(R.string.lbl_ok), new h(7, this, bVar)), new p(getString(R.string.lbl_cancel), new v(23)), null, false, 96).show();
    }

    @Override // jd1.a
    public final String ea() {
        String string = getString(R.string.lbl_blood_pressure_reminders);
        string.getClass();
        return string;
    }

    @Override // jd1.a
    public final pd1.a fa() {
        return pd1.a.BLOOD_PRESSURE;
    }

    @Override // jd1.a
    public final jd1.f ga() {
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x.getClass();
        return new com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a();
    }

    @Override // jd1.a
    public final td1.b ha(pd1.b bVar) {
        b.a aVar = b.f30933m;
        c cVarD = ((jd1.h) this.f98394b.getValue()).C4().d();
        aVar.getClass();
        b bVar2 = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("reminders_list_dto_bundle_key", cVarD);
        if (bVar != null) {
            bundle.putParcelable("new_reminder_bundle_key", bVar);
        }
        bVar2.setArguments(bundle);
        return bVar2;
    }

    @Override // jd1.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((nw.a) KoinJavaComponent.get$default(nw.a.class, null, null, 6, null)).b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/BloodPressureRemindersActivity$a;", "", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
