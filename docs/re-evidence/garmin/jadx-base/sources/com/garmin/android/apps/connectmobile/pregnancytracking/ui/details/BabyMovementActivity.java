package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/BabyMovementActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BabyMovementActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40448c = new a(null);

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    @Override // z10.p3
    public final Fragment ca() {
        LocalDate localDate;
        ww0.b bVarA;
        Parcelable parcelable;
        Object serializable;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            localDate = new LocalDate();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("extra_baby_movement_log_date", LocalDate.class);
            } else {
                Object serializable2 = extras.getSerializable("extra_baby_movement_log_date");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            localDate = (LocalDate) serializable;
            if (localDate == null) {
                localDate = new LocalDate();
            }
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null) {
            ww0.b.f187523n.getClass();
            bVarA = ww0.b.a.a(localDate);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("extra_daily_menstrual_cycle_log_dto", ww0.b.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("extra_daily_menstrual_cycle_log_dto");
                parcelable = (ww0.b) (parcelable2 instanceof ww0.b ? parcelable2 : null);
            }
            bVarA = (ww0.b) parcelable;
            if (bVarA == null) {
                ww0.b.f187523n.getClass();
                bVarA = ww0.b.a.a(localDate);
            }
        }
        Bundle extras3 = getIntent().getExtras();
        int i14 = extras3 != null ? extras3.getInt("extra_selected_index", -1) : -1;
        b.f40456y.getClass();
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_daily_menstrual_cycle_log_dto", bVarA);
        bundle.putInt("extra_selected_index", i14);
        bundle.putSerializable("extra_baby_movement_log_date", localDate);
        bVar.setArguments(bundle);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    @Override // z10.p3
    public final String da() {
        LocalDate localDate;
        ww0.b bVarA;
        Parcelable parcelable;
        Object serializable;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            localDate = new LocalDate();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("extra_baby_movement_log_date", LocalDate.class);
            } else {
                Object serializable2 = extras.getSerializable("extra_baby_movement_log_date");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            localDate = (LocalDate) serializable;
            if (localDate == null) {
                localDate = new LocalDate();
            }
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null) {
            ww0.b.f187523n.getClass();
            bVarA = ww0.b.a.a(localDate);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("extra_daily_menstrual_cycle_log_dto", ww0.b.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("extra_daily_menstrual_cycle_log_dto");
                parcelable = (ww0.b) (parcelable2 instanceof ww0.b ? parcelable2 : null);
            }
            bVarA = (ww0.b) parcelable;
            if (bVarA == null) {
                ww0.b.f187523n.getClass();
                bVarA = ww0.b.a.a(localDate);
            }
        }
        List<db1.a> listD = bVarA.d();
        String string = getString(h0.L(listD != null ? h0.Z(listD) : j0.f134944a) ? R.string.pregnancy_edit_baby_movement : R.string.pregnancy_add_baby_movement);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/BabyMovementActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DAILY_MENSTRUAL_CYCLE_LOG_DTO", "EXTRA_BABY_MOVEMENT_LOG_DATE", "EXTRA_SELECTED_INDEX", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(LocalDate localDate, Context context, ww0.b bVar, int i14) {
            localDate.getClass();
            context.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) BabyMovementActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_daily_menstrual_cycle_log_dto", bVar);
            bundle.putInt("extra_selected_index", i14);
            bundle.putSerializable("extra_baby_movement_log_date", localDate);
            intent.putExtras(bundle);
            return intent;
        }

        private a() {
        }
    }
}
