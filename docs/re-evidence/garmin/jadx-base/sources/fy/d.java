package fy;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfy/d;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "calendarDTO", "", "groupId", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;Ljava/lang/String;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarDTO f73871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73872b;

    static {
        CalendarDTO.Companion companion = CalendarDTO.INSTANCE;
    }

    public /* synthetic */ d(CalendarDTO calendarDTO, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : calendarDTO, (i14 & 2) != 0 ? null : str);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f73871a, this.f73872b, new xx.c().b());
        }
        h.s("Incompatible ViewModel class!");
        return null;
    }

    public d(CalendarDTO calendarDTO, String str) {
        this.f73871a = calendarDTO;
        this.f73872b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
