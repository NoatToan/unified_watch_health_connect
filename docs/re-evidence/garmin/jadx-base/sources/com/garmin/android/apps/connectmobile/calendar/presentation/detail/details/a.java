package com.garmin.android.apps.connectmobile.calendar.presentation.detail.details;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import e32.h;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/a;", "Le32/h;", "<init>", "()V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0499a f31202j = new C0499a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31203i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/calendar/presentation/detail/details/a$b", "Lr22/b0;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a f31204v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.c cVar, a aVar, v vVar, DateTime dateTime) {
            super(vVar, 1, null, dateTime, cVar);
            this.f31204v = aVar;
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            if (this.f31204v.f31203i) {
                iy.a.f95765o.getClass();
                iy.a aVar = new iy.a();
                Bundle bundle = new Bundle();
                bundle.putLong("extra.date.time", j8);
                aVar.setArguments(bundle);
                return aVar;
            }
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b.C.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b bVar = new com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("extra.date.time", j8);
            bVar.setArguments(bundle2);
            return bVar;
        }
    }

    @Override // e32.h, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f31203i = arguments.getBoolean("is_group_calendar_key", false);
        }
    }

    @Override // e32.h, x22.a
    public final b0 u6() {
        Context context = getContext();
        return new b(context != null ? new x22.b(context) : new b0.c(), this, getChildFragmentManager(), DateTime.now().plusDays(100000));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/a$a;", "", "<init>", "()V", "", "IS_GROUP_CALENDAR_KEY", "Ljava/lang/String;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0499a {
        public /* synthetic */ C0499a(j jVar) {
            this();
        }

        private C0499a() {
        }
    }
}
