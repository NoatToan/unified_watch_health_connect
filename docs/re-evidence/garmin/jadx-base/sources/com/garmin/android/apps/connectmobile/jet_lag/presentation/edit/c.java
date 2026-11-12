package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import e32.j;
import e32.k;
import e32.o;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/c;", "Le32/j;", "Landroidx/fragment/app/m;", "activity", "Lorg/joda/time/DateTime;", "initialDate", "pagerStartDate", "", "showDrawer", "", "tripId", "<init>", "(Landroidx/fragment/app/m;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZJ)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/c$a;", "Le32/k;", "Lorg/joda/time/DateTime;", "pagerStartDate", "", "showDrawer", "", "tripId", "<init>", "(Lorg/joda/time/DateTime;ZJ)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f37036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f37038d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, boolean z14, long j8) {
            super(null, 1, null);
            dateTime.getClass();
            this.f37036b = dateTime;
            this.f37037c = z14;
            this.f37038d = j8;
        }

        @Override // e32.k
        public final Fragment b(int i14, DateTime dateTime, DateTime dateTime2) {
            com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a.f37015l.getClass();
            return com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a.C0662a.a(i14, dateTime, this.f37036b, this.f37037c, this.f37038d);
        }

        @Override // e32.k
        public final Fragment c(DateTime dateTime) {
            com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a.f37015l.getClass();
            return com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a.C0662a.a(1, dateTime, this.f37036b, this.f37037c, this.f37038d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, DateTime dateTime, DateTime dateTime2, boolean z14, long j8) {
        super(mVar, dateTime, new o[]{o.f62806i}, new a(dateTime2, z14, j8));
        mVar.getClass();
        dateTime2.getClass();
    }
}
