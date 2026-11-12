package ul0;

import g22.k;
import j70.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n70.o;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lul0/b;", "Ln70/o;", "Lsl0/a;", "Lj70/d;", "Lo70/a;", "scoreCardData", "<init>", "(Lj70/d;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends o<sl0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<o70.a> f171952a;

    public b(d<o70.a> dVar) {
        dVar.getClass();
        this.f171952a = dVar;
    }

    @Override // n70.o
    public final ArrayList c() {
        LocalDate localDateNow;
        List<String> list;
        d<o70.a> dVar = this.f171952a;
        o70.a aVar = dVar.f97521b;
        List list2 = (List) a((aVar == null || (list = aVar.f129910a) == null) ? null : (String) h0.d0(list), new a());
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            LocalDate localDateD = ((sl0.a) obj).d();
            o70.a aVar2 = dVar.f97521b;
            if (aVar2 == null || (localDateNow = aVar2.f129911b) == null) {
                localDateNow = LocalDate.now();
            }
            if (k.g(localDateD, localDateNow)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d(dVar.f97520a, (sl0.a) it.next()));
        }
        return arrayList2;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.GOLF_SCORE_CARD;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetGolfScoreCardUseCase";
    }
}
