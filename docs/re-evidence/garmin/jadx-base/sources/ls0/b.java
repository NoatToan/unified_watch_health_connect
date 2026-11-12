package ls0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lls0/b;", "Lxz2/j;", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "calendarView", "<init>", "(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements xz2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCalendarView f114701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f114702b;

    public b(MaterialCalendarView materialCalendarView) {
        materialCalendarView.getClass();
        this.f114701a = materialCalendarView;
        Context context = materialCalendarView.getContext();
        if (context != null) {
            this.f114702b = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
        }
    }

    @Override // xz2.j
    public final boolean a(xz2.b bVar) {
        bVar.getClass();
        return p005kotlin.jvm.internal.s.g(this.f114701a.getSelectedDate(), bVar);
    }

    @Override // xz2.j
    public final void b(xz2.k kVar) {
        Drawable drawable = this.f114702b;
        if (drawable != null) {
            kVar.b(drawable);
        }
    }
}
