package xm0;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c22.j0;
import i3.e5;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxm0/j;", "Lhe/a;", "Landroidx/fragment/app/Fragment;", "fragment", "", "groupId", "<init>", "(Landroidx/fragment/app/Fragment;J)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends he.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f191413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w[] f191414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.p<DateTime, DateTime>[] f191415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String[] f191416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, long j8) {
        String strG;
        super(fragment);
        fragment.getClass();
        this.f191413j = j8;
        w[] wVarArrValues = w.values();
        this.f191414k = wVarArrValues;
        this.f191415l = new o13.p[wVarArrValues.length];
        this.f191416m = new String[wVarArrValues.length];
        int length = wVarArrValues.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            w wVar = wVarArrValues[i14];
            int i16 = i15 + 1;
            this.f191415l[i15] = new o13.p<>(wVar.a(), DateTime.now());
            String[] strArr = this.f191416m;
            j0.f23099a.getClass();
            Date date = LocalDate.now().withDayOfWeek(7).toDate();
            date.getClass();
            DateTime dateTime = new DateTime(date);
            w wVar2 = w.WEEK;
            if (wVar == wVar2 && wVar.a().getMonthOfYear() == dateTime.getMonthOfYear()) {
                Date date2 = wVar.a().toDate();
                date2.getClass();
                String strG2 = j0.g(date2, "MMMM d", null);
                Date date3 = dateTime.toDate();
                date3.getClass();
                strG = e5.g(strG2, " - ", j0.g(date3, "d", null));
            } else if (wVar == wVar2 && wVar.a().getMonthOfYear() != dateTime.getMonthOfYear() && wVar.a().getYear() == dateTime.getYear()) {
                Date date4 = wVar.a().toDate();
                date4.getClass();
                String strG3 = j0.g(date4, "MMM d", null);
                Date date5 = dateTime.toDate();
                date5.getClass();
                strG = e5.g(strG3, " - ", j0.g(date5, "MMM d", null));
            } else if (wVar == wVar2 && wVar.a().getMonthOfYear() != dateTime.getMonthOfYear() && wVar.a().getYear() != dateTime.getYear()) {
                Date date6 = wVar.a().toDate();
                date6.getClass();
                String strG4 = j0.g(date6, "MMM d, yyyy", null);
                Date date7 = dateTime.toDate();
                date7.getClass();
                strG = e5.g(strG4, " - ", j0.g(date7, "MMM d, yyyy", null));
            } else if (wVar == w.MONTH) {
                Date date8 = wVar.a().toDate();
                date8.getClass();
                String strG5 = j0.g(date8, "MMMM d", null);
                Date date9 = DateTime.now().dayOfMonth().withMaximumValue().toDate();
                date9.getClass();
                strG = e5.g(strG5, " - ", j0.g(date9, "d", null));
            } else {
                Date date10 = wVar.a().toDate();
                date10.getClass();
                String strG6 = j0.g(date10, "MMM d", null);
                Date date11 = DateTime.now().dayOfYear().withMaximumValue().toDate();
                date11.getClass();
                strG = e5.g(strG6, " - ", j0.g(date11, "MMM d", null));
            }
            strArr[i15] = strG;
            i14++;
            i15 = i16;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f191414k.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // he.a
    public final Fragment u(int i14) {
        o13.p pVar = (o13.p) p13.u.L(i14, this.f191415l);
        if (pVar == null) {
            vb.h.s(e0.f(i14, "invalid dateTimePair at position=[", "]"));
            return null;
        }
        e.a aVar = e.f191353i;
        DateTime dateTime = (DateTime) pVar.f128594a;
        DateTime dateTime2 = (DateTime) pVar.f128595b;
        aVar.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_extra_connection_group_id", this.f191413j);
        bundle.putSerializable("GCM_extra_start_date", dateTime);
        bundle.putSerializable("GCM_extra_end_date", dateTime2);
        eVar.setArguments(bundle);
        return eVar;
    }
}
