package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q;
import db1.m;
import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/d;", "Lx22/a;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/a$a;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends x22.a implements com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a.InterfaceC0763a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40556f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f40557g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DateTime f40558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f40559e;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/d$b;", "Lr22/b0;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "", "intervalType", "selectedDate", "<init>", "(Landroidx/fragment/app/v;Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILorg/joda/time/DateTime;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, Context context, DateTime dateTime, DateTime dateTime2, int i14, DateTime dateTime3) {
            super(vVar, i14, dateTime, dateTime2, context != null ? new x22.b(context) : new b0.c());
            vVar.getClass();
            if (dateTime3 != null) {
                this.f149912i = c(dateTime3);
            }
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            q.a aVar = q.f40794v;
            LocalDate localDate = new DateTime(j8).toLocalDate();
            localDate.getClass();
            aVar.getClass();
            return q.a.a(localDate);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f40557g = gt2.b.f79005a.h("PregnancySelectDayFragment");
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a.InterfaceC0763a
    public final String A(Context context) {
        return a0.e(R.string.mct_steps_day_segment, context);
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a.InterfaceC0763a
    public final String k(i.c cVar) {
        cVar.getClass();
        String string = cVar.getString(R.string.mct_next_phase_day);
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    @Override // x22.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DateTime dateTime;
        Serializable serializable;
        Parcelable parcelable;
        layoutInflater.getClass();
        m mVar = null;
        if (bundle != null) {
            dateTime = null;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null) {
                dateTime = new DateTime(new LocalDate().toDateTimeAtStartOfDay());
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("EXTRA_SELECTED_DATE", DateTime.class);
                } else {
                    Serializable serializable2 = arguments.getSerializable("EXTRA_SELECTED_DATE");
                    if (!(serializable2 instanceof DateTime)) {
                        serializable2 = null;
                    }
                    serializable = (DateTime) serializable2;
                }
                dateTime = (DateTime) serializable;
                if (dateTime == null) {
                    dateTime = new DateTime(new LocalDate().toDateTimeAtStartOfDay());
                }
            }
        }
        this.f40558d = dateTime;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments2.getParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", m.class);
            } else {
                Parcelable parcelable2 = arguments2.getParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO");
                parcelable = (m) (parcelable2 instanceof m ? parcelable2 : null);
            }
            mVar = (m) parcelable;
        }
        this.f40559e = mVar;
        return layoutInflater.inflate(R.layout.date_infinite_view_pager_fragment_layout, viewGroup, false);
    }

    @Override // x22.a
    public final b0 u6() {
        m mVar = this.f40559e;
        if (mVar != null) {
            LocalDate pregnancyCycleStart = mVar.getPregnancyCycleStart();
            DateTime dateTimeAtStartOfDay = pregnancyCycleStart != null ? pregnancyCycleStart.toDateTimeAtStartOfDay(DateTimeZone.getDefault()) : null;
            LocalDate deliveryDate = mVar.getDeliveryDate();
            if (deliveryDate == null && (deliveryDate = mVar.getEndDate()) == null) {
                deliveryDate = new LocalDate();
            }
            DateTime dateTimeAtStartOfDay2 = deliveryDate.toDateTimeAtStartOfDay(DateTimeZone.getDefault());
            v childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            return new b(childFragmentManager, getContext(), dateTimeAtStartOfDay, dateTimeAtStartOfDay2, 1, this.f40558d);
        }
        f40557g.error("PregnancySnapShotDTO is null");
        DateTime dateTime = this.f40558d;
        if (dateTime == null) {
            dateTime = new DateTime(new LocalDate().toDateTimeAtStartOfDay());
        }
        this.f40558d = dateTime;
        v childFragmentManager2 = getChildFragmentManager();
        childFragmentManager2.getClass();
        Context context = getContext();
        DateTime dateTime2 = this.f40558d;
        return new b(childFragmentManager2, context, dateTime2, dateTime2, 1, dateTime2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/d$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_DATE", "Ljava/lang/String;", "TAG", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
