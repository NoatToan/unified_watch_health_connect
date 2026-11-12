package xz2;

import android.annotation.SuppressLint;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class o extends f {
    public o(MaterialCalendarView materialCalendarView, b bVar, int i14) {
        super(materialCalendarView, bVar, i14);
    }

    @Override // xz2.f
    public final void b(ArrayList arrayList, Calendar calendar) {
        for (int i14 = 0; i14 < 6; i14++) {
            for (int i15 = 0; i15 < 7; i15++) {
                a(arrayList, calendar);
            }
        }
    }

    @Override // xz2.f
    public final boolean c(b bVar) {
        return bVar.f192862b == getFirstViewDay().f192862b;
    }

    @Override // xz2.f
    public final int getRows() {
        return 7;
    }
}
