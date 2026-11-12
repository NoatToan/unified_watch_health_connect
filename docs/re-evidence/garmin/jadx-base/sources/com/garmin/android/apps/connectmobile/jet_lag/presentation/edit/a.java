package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import e32.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.b0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/a;", "Le32/h;", "Lorg/joda/time/DateTime;", "pagerStartDate", "<init>", "(Lorg/joda/time/DateTime;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0662a f37015l = new C0662a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTime f37016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f37018k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/presentation/edit/a$b", "Lr22/b0;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a f37019v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.c cVar, a aVar, v vVar, DateTime dateTime) {
            super(vVar, 1, dateTime, null, cVar);
            this.f37019v = aVar;
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
            a aVar2 = this.f37019v;
            boolean z14 = aVar2.f37017j;
            Long lValueOf = Long.valueOf(aVar2.f37018k);
            aVar.getClass();
            return com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a.a(j8, z14, lValueOf);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(DateTime dateTime, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            dateTime = DateTime.now();
            dateTime.getClass();
        }
        this(dateTime);
    }

    @Override // e32.h, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f37017j = arguments.getBoolean("GCM_extra_top_navigation");
            this.f37018k = arguments.getLong("EXTRA_TRIP_ID");
        }
    }

    @Override // e32.h, x22.a
    public final b0 u6() {
        Context context = getContext();
        return new b(context != null ? new x22.b(context) : new b0.c(), this, getChildFragmentManager(), this.f37016i);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/a$a;", "", "<init>", "()V", "", "EXTRA_TRIP_ID", "Ljava/lang/String;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0662a {
        public /* synthetic */ C0662a(j jVar) {
            this();
        }

        public static a a(int i14, DateTime dateTime, DateTime dateTime2, boolean z14, long j8) {
            dateTime2.getClass();
            a aVar = new a(dateTime2);
            Bundle bundle = new Bundle();
            h.f62784h.getClass();
            bundle.putInt("ARG_INTERVAL_TYPE", i14);
            bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
            bundle.putSerializable("ARG_END_DATE", null);
            bundle.putBoolean("GCM_extra_top_navigation", z14);
            if (j8 != -1) {
                bundle.putLong("EXTRA_TRIP_ID", j8);
            }
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0662a() {
        }
    }

    public a(DateTime dateTime) {
        dateTime.getClass();
        this.f37016i = dateTime;
        this.f37018k = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
