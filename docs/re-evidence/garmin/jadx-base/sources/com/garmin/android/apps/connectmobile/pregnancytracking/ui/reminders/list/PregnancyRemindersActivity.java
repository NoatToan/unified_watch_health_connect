package com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import f12.b;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import jd1.f;
import jd1.h;
import l72.o2;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;
import pd1.c;
import vd1.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/reminders/list/PregnancyRemindersActivity;", "Ljd1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyRemindersActivity extends jd1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40928d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f40929e = m.b(new o2(9));

    @Override // jd1.a
    public final c da() {
        f40928d.getClass();
        ((Logger) f40929e.getValue()).debug("generateDefaultReminders");
        int userProfilePk = ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).getUserProfilePk();
        DateTime dateTimeNow = DateTime.now();
        wd1.a[] aVarArrValues = wd1.a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        int length = aVarArrValues.length;
        for (int iD = 0; iD < length; iD = e5.d(aVarArrValues[iD].f184373b, iD, arrayList, 1)) {
        }
        String str = pd1.a.PREGNANCY.f137376a;
        Integer numValueOf = Integer.valueOf(userProfilePk);
        List listC = w.c(Integer.valueOf(new DateTime().withTime(8, 0, 0, 0).getMinuteOfDay()));
        String string = getString(R.string.pregnancy_take_prenatal_vitamins);
        Boolean bool = Boolean.FALSE;
        return new c(str, x.k(new pd1.b(null, numValueOf, "PREGNANCY", "WEEKLY", arrayList, listC, string, bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(10, 0, 0, 0).getMinuteOfDay())), getString(R.string.pregnancy_drink_more_water), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(20, 0, 0, 0).getMinuteOfDay())), getString(R.string.pregnancy_practice_kegels), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(18, 0, 0, 0).getMinuteOfDay())), getString(R.string.pregnancy_log_symptoms), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(10, 0, 0, 0).getMinuteOfDay())), getString(R.string.pregnancy_record_baby_movement), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(12, 0, 0, 0).getMinuteOfDay())), getString(R.string.pregnancy_log_blood_glucose), bool, dateTimeNow, dateTimeNow)), null, 4, null);
    }

    @Override // jd1.a
    public final String ea() {
        String string = getString(R.string.mct_reminders);
        string.getClass();
        return string;
    }

    @Override // jd1.a
    public final pd1.a fa() {
        return pd1.a.PREGNANCY;
    }

    @Override // jd1.a
    public final f ga() {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.f40930t.getClass();
        return new com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a();
    }

    @Override // jd1.a
    public final td1.b ha(pd1.b bVar) {
        mb1.b.a aVar = mb1.b.f117754n;
        c cVarD = ((h) this.f98394b.getValue()).C4().d();
        aVar.getClass();
        mb1.b bVar2 = new mb1.b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("reminders_list_dto_bundle_key", cVarD);
        if (bVar != null) {
            bundle.putParcelable("new_reminder_bundle_key", bVar);
        }
        bVar2.setArguments(bundle);
        return bVar2;
    }

    @Override // jd1.a
    public final d ia(pd1.b bVar) {
        bVar.getClass();
        ob1.a.f131136m.getClass();
        ob1.a aVar = new ob1.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("USER_REMINDER_BUNDLE_KET", bVar);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/reminders/list/PregnancyRemindersActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
