package tl2;

import android.util.Size;
import androidx.media3.common.q;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.k;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165325a;

    public /* synthetic */ g(int i14) {
        this.f165325a = i14;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f165325a) {
            case 0:
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                g gVar = i.f165328k;
                c.EnumC3105c enumC3105c = cVar.f165285b;
                return enumC3105c == cVar2.f165285b ? Integer.compare(cVar.f165291h, cVar2.f165291h) : Integer.compare(enumC3105c.ordinal(), cVar2.f165285b.ordinal());
            case 1:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 2:
                return ((q) obj2).f8382j - ((q) obj).f8382j;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering<Integer> ordering = wa.e.f183652k;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return Integer.compare(((wa.e.c) ((List) obj).get(0)).f183681f, ((wa.e.c) ((List) obj2).get(0)).f183681f);
            case 5:
                return ((wa.e.b) Collections.max((List) obj)).compareTo((wa.e.b) Collections.max((List) obj2));
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i14 = 8;
                ComparisonChain comparisonChainCompare = ComparisonChain.start().compare((wa.e.j) Collections.max(list, new g(i14)), (wa.e.j) Collections.max(list2, new g(i14)), new g(i14)).compare(list.size(), list2.size());
                int i15 = 9;
                return comparisonChainCompare.compare((wa.e.j) Collections.max(list, new g(i15)), (wa.e.j) Collections.max(list2, new g(i15)), new g(i15)).result();
            case 7:
                return ((wa.e.h) ((List) obj).get(0)).compareTo((wa.e.h) ((List) obj2).get(0));
            case 8:
                wa.e.j jVar = (wa.e.j) obj;
                wa.e.j jVar2 = (wa.e.j) obj2;
                ComparisonChain comparisonChainCompare2 = ComparisonChain.start().compareFalseFirst(jVar.f183728h, jVar2.f183728h).compare(jVar.f183733m, jVar2.f183733m).compareFalseFirst(jVar.f183734n, jVar2.f183734n).compareFalseFirst(jVar.f183729i, jVar2.f183729i).compareFalseFirst(jVar.f183725e, jVar2.f183725e).compareFalseFirst(jVar.f183727g, jVar2.f183727g).compare(Integer.valueOf(jVar.f183732l), Integer.valueOf(jVar2.f183732l), Ordering.natural().reverse());
                boolean z14 = jVar.f183737q;
                ComparisonChain comparisonChainCompareFalseFirst = comparisonChainCompare2.compareFalseFirst(z14, jVar2.f183737q);
                boolean z15 = jVar.f183738r;
                ComparisonChain comparisonChainCompareFalseFirst2 = comparisonChainCompareFalseFirst.compareFalseFirst(z15, jVar2.f183738r);
                if (z14 && z15) {
                    comparisonChainCompareFalseFirst2 = comparisonChainCompareFalseFirst2.compare(jVar.f183739t, jVar2.f183739t);
                }
                return comparisonChainCompareFalseFirst2.result();
            case 9:
                wa.e.j jVar3 = (wa.e.j) obj;
                wa.e.j jVar4 = (wa.e.j) obj2;
                boolean z16 = jVar3.f183725e;
                int i16 = jVar3.f183730j;
                Object objReverse = (z16 && jVar3.f183728h) ? wa.e.f183652k : wa.e.f183652k.reverse();
                ComparisonChain comparisonChainStart = ComparisonChain.start();
                if (jVar3.f183726f.f8258y) {
                    comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(i16), Integer.valueOf(jVar4.f183730j), wa.e.f183652k.reverse());
                }
                return comparisonChainStart.compare(Integer.valueOf(jVar3.f183731k), Integer.valueOf(jVar4.f183731k), objReverse).compare(Integer.valueOf(i16), Integer.valueOf(jVar4.f183730j), objReverse).result();
            case 10:
                k kVar = ((SwingDTO) obj).f35875d;
                k kVar2 = ((SwingDTO) obj2).f35875d;
                if (kVar == null && kVar2 == null) {
                    return 0;
                }
                if (kVar == null) {
                    return -1;
                }
                if (kVar2 == null) {
                    return 1;
                }
                return kVar.f35954c.compareTo(kVar2.f35954c);
            case 11:
                long j8 = ((SwingDTO) obj).f35880i;
                long j14 = ((SwingDTO) obj2).f35880i;
                if (j8 < j14) {
                    return -1;
                }
                return j8 > j14 ? 1 : 0;
            case 12:
                cl0.b bVar = (cl0.b) KoinJavaComponent.get(cl0.b.class);
                boolean zA = bVar.a(((sd2.f) obj).getUnitID());
                if (bVar.a(((sd2.f) obj2).getUnitID()) ^ zA) {
                    return !zA ? 1 : -1;
                }
                return 0;
            case 13:
                return ((xa.i.b) obj).f189715a - ((xa.i.b) obj2).f189715a;
            case 14:
                return Float.compare(((xa.i.b) obj).f189717c, ((xa.i.b) obj2).f189717c);
            default:
                return Integer.compare(((zb.b.a) obj2).f203373b, ((zb.b.a) obj).f203373b);
        }
    }
}
