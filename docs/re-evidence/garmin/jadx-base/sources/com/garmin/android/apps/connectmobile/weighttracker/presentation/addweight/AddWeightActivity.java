package com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/addweight/AddWeightActivity;", "Lz10/p3;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddWeightActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48007c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DateTime f48008d = new DateTime(1990, 1, 2, 0, 0, 0);

    @Override // z10.p3
    public final Fragment ca() {
        long longExtra = getIntent().getLongExtra("extra.date.time", f48008d.getMillis());
        com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a.f48009b.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("date_in_millis", longExtra);
        com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a aVar = new com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.lbl_add_weight);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/addweight/AddWeightActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_ADD_WEIGHT", "I", "VALUES_EDITED", "VALUES_NOT_EDITED", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, LocalDate localDate) {
            Intent intentD = sn.a.d(context, context, AddWeightActivity.class);
            if (localDate != null) {
                intentD.putExtra("extra.date.time", localDate.toDate().getTime());
            }
            return intentD;
        }

        private a() {
        }
    }
}
