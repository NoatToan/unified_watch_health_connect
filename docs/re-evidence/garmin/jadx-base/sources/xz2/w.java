package xz2;

import android.annotation.SuppressLint;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class w extends f {
    public w(MaterialCalendarView materialCalendarView, b bVar, int i14) {
        super(materialCalendarView, bVar, i14);
    }

    @Override // xz2.f
    public final void b(ArrayList arrayList, Calendar calendar) {
        for (int i14 = 0; i14 < 7; i14++) {
            a(arrayList, calendar);
        }
    }

    @Override // xz2.f
    public final boolean c(b bVar) {
        return true;
    }

    @Override // xz2.f
    public int getRows() {
        return 2;
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i14) {
        super.setDateTextAppearance(i14);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setDayFormatter(yz2.e eVar) {
        super.setDayFormatter(eVar);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setMaximumDate(b bVar) {
        super.setMaximumDate(bVar);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setMinimumDate(b bVar) {
        super.setMinimumDate(bVar);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setSelectionColor(int i14) {
        super.setSelectionColor(i14);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z14) {
        super.setSelectionEnabled(z14);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setShowOtherDates(int i14) {
        super.setShowOtherDates(i14);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setWeekDayFormatter(yz2.h hVar) {
        super.setWeekDayFormatter(hVar);
    }

    @Override // xz2.f
    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i14) {
        super.setWeekDayTextAppearance(i14);
    }
}
