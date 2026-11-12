package hy;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhy/s;", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "", "onItemSelected", "<init>", "(Landroid/view/View;Le23/l;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f86360a;

    public s(View view2, e23.l<? super CalendarItemDTO, Unit> lVar) {
        view2.getClass();
        lVar.getClass();
        Context context = view2.getContext();
        context.getClass();
        r rVar = new r(context, lVar);
        this.f86360a = rVar;
        new e32.g(null, view2, null, 1, null).a(rVar);
    }
}
