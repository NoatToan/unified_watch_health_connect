package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import f12.l;
import java.io.Serializable;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleSymptomActivity;", "Lz10/p3;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleSymptomActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38817c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        ww0.b bVar;
        Integer num;
        Integer num2;
        Serializable serializable;
        Object serializable2;
        Object serializable3;
        Parcelable parcelable;
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        Serializable serializable4 = null;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("EXTRA_LOG_KEY", ww0.b.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("EXTRA_LOG_KEY");
                if (!(parcelable2 instanceof ww0.b)) {
                    parcelable2 = null;
                }
                parcelable = (ww0.b) parcelable2;
            }
            bVar = (ww0.b) parcelable;
        } else {
            bVar = null;
        }
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable3 = bundleA.getSerializable("EXTRA_PHASE_KEY", Integer.class);
            } else {
                Object serializable5 = bundleA.getSerializable("EXTRA_PHASE_KEY");
                if (!(serializable5 instanceof Integer)) {
                    serializable5 = null;
                }
                serializable3 = (Integer) serializable5;
            }
            num = (Integer) serializable3;
        } else {
            num = null;
        }
        if (num == null) {
            num = null;
        }
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = bundleA.getSerializable("EXTRA_CYCLE_TYPE", Integer.class);
            } else {
                Object serializable6 = bundleA.getSerializable("EXTRA_CYCLE_TYPE");
                if (!(serializable6 instanceof Integer)) {
                    serializable6 = null;
                }
                serializable2 = (Integer) serializable6;
            }
            num2 = (Integer) serializable2;
        } else {
            num2 = null;
        }
        if (num2 == null) {
            num2 = null;
        }
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundleA.getSerializable("EXTRA_DATE_KEY", LocalDate.class);
            } else {
                Serializable serializable7 = bundleA.getSerializable("EXTRA_DATE_KEY");
                serializable = (LocalDate) (serializable7 instanceof LocalDate ? serializable7 : null);
            }
            serializable4 = (LocalDate) serializable;
        }
        serializable4.getClass();
        h.P.getClass();
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_LOG_KEY", bVar);
        bundle.putSerializable("EXTRA_DATE_KEY", serializable4);
        if (num != null) {
            bundle.putInt("EXTRA_PHASE_KEY", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("EXTRA_CYCLE_TYPE", num2.intValue());
        }
        l2.a.c(hVar, bundle);
        return hVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.mct_log_symptoms);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleSymptomActivity$a;", "", "<init>", "()V", "", "EXTRA_LOG_KEY", "Ljava/lang/String;", "EXTRA_DATE_KEY", "EXTRA_PHASE_KEY", "EXTRA_CYCLE_TYPE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, ww0.b bVar, LocalDate localDate, Integer num, Integer num2) {
            context.getClass();
            if (!b(num)) {
                return null;
            }
            Intent intent = new Intent(context, (Class<?>) MenstrualCycleSymptomActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_LOG_KEY", bVar);
            bundle.putSerializable("EXTRA_DATE_KEY", localDate);
            bundle.putSerializable("EXTRA_PHASE_KEY", num);
            bundle.putSerializable("EXTRA_CYCLE_TYPE", num2);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        public static boolean b(Integer num) {
            if (num == null || num.intValue() != 1 || !com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.d(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
                i52.a.f91796a.getClass();
                if (!i52.a.q() && !i52.a.p() && !i52.a.m()) {
                    l.a aVar = l.f68084a;
                    aVar.getClass();
                    if (!l.a.a().E1() && !i52.a.r()) {
                        aVar.getClass();
                        if (!l.a.a().x0()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public static void c(Context context, Integer num) {
            context.getClass();
            LocalDate localDateNow = LocalDate.now();
            localDateNow.getClass();
            Intent intentA = a(context, null, localDateNow, num, null);
            if (intentA != null) {
                context.startActivity(intentA);
            }
        }

        private a() {
        }
    }
}
