package com.garmin.android.apps.connectmobile.activities.manual;

import am.x0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import lo.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import z10.p3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/ActivitiesCreateManualActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivitiesCreateManualActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29125c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        b bVar;
        x0 x0Var;
        String stringExtra = getIntent().getStringExtra("ActivityType");
        if (stringExtra != null) {
            x0[] x0VarArrValues = x0.values();
            int length = x0VarArrValues.length;
            int i14 = 0;
            while (true) {
                bVar = null;
                if (i14 >= length) {
                    x0Var = null;
                    break;
                }
                x0Var = x0VarArrValues[i14];
                if (s.g(x0Var.f4358a, stringExtra)) {
                    break;
                }
                i14++;
            }
            if (x0Var != null) {
                Bundle bundle = new Bundle();
                bVar = new b();
                bundle.putSerializable("extra_activity_type", x0Var);
                bVar.setArguments(bundle);
            }
            if (bVar != null) {
                return bVar;
            }
        }
        return new b();
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.lbl_create_manual_activities);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/ActivitiesCreateManualActivity$a;", "", "<init>", "()V", "", "ACTIVITY_TYPE_KEY", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
