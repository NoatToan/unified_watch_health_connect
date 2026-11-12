package ms0;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import java.util.ArrayList;
import java.util.List;
import k32.l;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Unit;
import yr0.k;
import yr0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(e eVar, k.a aVar) {
        eVar.getClass();
        aVar.getClass();
        eVar.f120466b.setHasError(aVar.f199014a);
        l lVar = eVar.f120471g;
        l.d(lVar, R.drawable.icon_danger, null, 16, 10);
        lVar.e(null);
        lVar.f(aVar.f199015b);
        l lVar2 = eVar.f120472h;
        l.d(lVar2, R.drawable.icon_danger, null, 16, 10);
        lVar2.e(null);
        lVar2.f(aVar.f199016c);
        TextView textView = eVar.f120473i;
        textView.setText(textView.getContext().getString(aVar.f199017d));
    }

    public static final void b(e eVar, Context context, d dVar, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar) {
        eVar.f120465a.setText(dVar.f120458a);
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar.f120466b;
        styledInlineTextFieldViewDark.getClass();
        TextView textView = styledInlineTextFieldViewDark.f81348h;
        textView.getClass();
        textView.setText(dVar.f120459b);
        Unit unit = Unit.INSTANCE;
        String str = dVar.f120460c;
        if (str == null) {
            str = "";
        }
        styledInlineTextFieldViewDark.i(new h32.h.c(str, null, null, null, aVar, lVar, null, null, 1, false, null, null, 3278, null));
        c(eVar, context, dVar.f120462e, dVar.f120461d);
        d(eVar, context, dVar.f120464g, dVar.f120463f);
    }

    public static final void c(e eVar, Context context, LocalDate localDate, String str) {
        eVar.getClass();
        l lVar = eVar.f120471g;
        String strD = localDate != null ? new pi0.e(context).d(localDate, qi0.a.YEAR_MONTH_DAY_WEEKDAY) : null;
        if (str != null) {
            lVar.b(str, strD);
        } else {
            lVar.h(strD);
        }
    }

    public static final void d(e eVar, Context context, LocalTime localTime, String str) {
        eVar.getClass();
        l lVar = eVar.f120472h;
        String strE = localTime != null ? new pi0.e(context).e(localTime, qi0.f.RELATIVE_24H_AM_PM_TIME) : null;
        if (str != null) {
            lVar.b(str, strE);
        } else {
            lVar.h(strE);
        }
    }

    public static final void e(e eVar, List<n> list) {
        eVar.getClass();
        list.getClass();
        RecyclerView.h adapter = eVar.f120468d.getAdapter();
        if (adapter == null || !(adapter instanceof g)) {
            return;
        }
        g gVar = (g) adapter;
        ArrayList arrayList = gVar.f120476b;
        arrayList.clear();
        arrayList.addAll(list);
        gVar.notifyDataSetChanged();
    }
}
