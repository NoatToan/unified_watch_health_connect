package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/PregnancyBloodGlucoseActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyBloodGlucoseActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40449c = new a(null);

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // z10.p3
    public final Fragment ca() {
        LocalDate localDate;
        db1.r rVar;
        Parcelable parcelable;
        Object serializable;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            localDate = new LocalDate();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("extra_user_glucose_log_date", LocalDate.class);
            } else {
                Object serializable2 = extras.getSerializable("extra_user_glucose_log_date");
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
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("extra_user_glucose_dto", db1.r.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("extra_user_glucose_dto");
                if (!(parcelable2 instanceof db1.r)) {
                    parcelable2 = null;
                }
                parcelable = (db1.r) parcelable2;
            }
            rVar = (db1.r) parcelable;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = null;
        }
        Bundle extras3 = getIntent().getExtras();
        ArrayList<String> stringArrayList = extras3 != null ? extras3.getStringArrayList("extra_user_glucose_log_time_list") : null;
        if (stringArrayList == null) {
            stringArrayList = null;
        }
        h.B.getClass();
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_user_glucose_dto", rVar);
        bundle.putStringArrayList("extra_user_glucose_log_time_list", stringArrayList != null ? new ArrayList<>(stringArrayList) : null);
        bundle.putSerializable("extra_user_glucose_log_date", localDate);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // z10.p3
    public final String da() {
        Bundle extras = getIntent().getExtras();
        if ((extras != null ? extras.getStringArrayList("extra_user_glucose_log_time_list") : null) != null) {
            String string = getString(R.string.pregnancy_edit_baby_movement);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.pregnancy_add_baby_movement);
        string2.getClass();
        return string2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/PregnancyBloodGlucoseActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_USER_GLUCOSE_DTO", "EXTRA_USER_GLUCOSE_DTO_LOG_TIME_LIST", "EXTRA_USER_GLUCOSE_LOG_DATE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(LocalDate localDate, Context context, db1.r rVar, List list) {
            localDate.getClass();
            context.getClass();
            list.getClass();
            Intent intent = new Intent(context, (Class<?>) PregnancyBloodGlucoseActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_user_glucose_dto", rVar);
            bundle.putStringArrayList("extra_user_glucose_log_time_list", new ArrayList<>(list));
            bundle.putSerializable("extra_user_glucose_log_date", localDate);
            intent.putExtras(bundle);
            return intent;
        }

        private a() {
        }
    }
}
