package k00;

import android.content.Context;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.t;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lk00/h;", "T", "Lqz/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h<T> implements qz.c<T, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f101981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f101982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f101984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f101985e;

    static {
        new a(null);
    }

    public h(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f101981a = context;
        this.f101982b = localDate;
        this.f101983c = localDate2;
        this.f101984d = z14;
        this.f101985e = o13.m.b(new jx0.e(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    public ArrayList A(List list, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int i14 = this.f101984d ? 1 : 7;
            int iY = y() * i14;
            Iterator<T> it = list.iterator();
            LocalDate localDate3 = localDate;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                LocalDate localDate4 = cVar.f101961a.toLocalDate();
                if (Days.daysBetween(localDate3, localDate4).getDays() - i14 > iY && !arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
                if (localDate4.isBefore(localDate2)) {
                    arrayList2.add(new Entry(Days.daysBetween(localDate, localDate4).getDays() / i14, cVar.f101962b, cVar.f101963c));
                } else {
                    j0.f23099a.getClass();
                    if (localDate4.getYear() == localDate2.getYear() && localDate4.getMonthOfYear() == localDate2.getMonthOfYear() && localDate4.getDayOfMonth() == localDate2.getDayOfMonth()) {
                        arrayList2.add(new Entry(Days.daysBetween(localDate, localDate4).getDays() / i14, cVar.f101962b, cVar.f101963c));
                    }
                }
                localDate3 = localDate4;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public Integer B(T t7) {
        return null;
    }

    public abstract float C(T t7);

    public abstract float D(T t7);

    @Override // qz.c
    public List<ILineDataSet> a(T t7) {
        ArrayList arrayList = new ArrayList();
        Map<String, List<c>> mapZ = z(t7);
        if (mapZ != null) {
            ArrayList<List> arrayList2 = new ArrayList(mapZ.size());
            for (Map.Entry<String, List<c>> entry : mapZ.entrySet()) {
                ArrayList arrayListA = A(entry.getValue(), this.f101982b, this.f101983c);
                ArrayList arrayList3 = new ArrayList(y.r(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    LineDataSet lineDataSetX = x(entry.getKey(), (List) it.next());
                    gl.b.i(lineDataSetX, this.f101981a);
                    arrayList3.add(lineDataSetX);
                }
                arrayList2.add(arrayList3);
            }
            for (List list : arrayList2) {
                if (!list.isEmpty()) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final float i(T t7) {
        return C(t7);
    }

    @Override // qz.c
    public final Integer j(T t7) {
        return B(t7);
    }

    @Override // qz.c
    public final float m(T t7) {
        return D(t7);
    }

    @Override // qz.c
    public final Integer p(T t7) {
        return B(t7);
    }

    @Override // qz.c
    public float q(T t7) {
        LocalDate localDate = this.f101983c;
        boolean z14 = this.f101984d;
        LocalDate localDate2 = this.f101982b;
        return z14 ? Days.daysBetween(localDate2, localDate).getDays() : Weeks.weeksBetween(localDate2, localDate).getWeeks();
    }

    @Override // qz.c
    public final float t(T t7) {
        return D(t7);
    }

    @Override // qz.c
    public final float w(T t7) {
        return C(t7);
    }

    public abstract LineDataSet x(String str, List list);

    public int y() {
        return 0;
    }

    public abstract Map<String, List<c>> z(T t7);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lk00/h$a;", "", "<init>", "()V", "", "DAILY_DAYS_DELTA", "I", "WEEKLY_DAYS_DELTA", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
