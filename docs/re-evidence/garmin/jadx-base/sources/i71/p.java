package i71;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li71/p;", "Ln70/v;", "Lo61/o;", "Li71/d;", "getTrainingStatusChartEntriesUseCase", "<init>", "(Li71/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements n70.v<o61.o> {
    public p(d dVar) {
        dVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    public final o61.o b(String... strArr) {
        List<o61.n> listC;
        boolean z14;
        boolean z15 = false;
        j71.a aVar = (j71.a) a((String) p13.u.L(0, strArr), new o());
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateMinusDays = localDateNow.minusDays(e32.o.f62808k.f62819a - 1);
        if (aVar != null ? p005kotlin.jvm.internal.s.g(aVar.getShowSelector(), Boolean.FALSE) : false) {
            listC = aVar.a();
        } else {
            String str = (String) p13.u.L(1, strArr);
            if (str == null) {
                listC = j0.f134944a;
            } else {
                listC = aVar != null ? aVar.c(str) : null;
                if (listC == null) {
                    listC = j0.f134944a;
                }
            }
        }
        ArrayList arrayListZ = h0.Z(listC);
        ArrayList arrayList = new ArrayList(arrayListZ);
        localDateMinusDays.getClass();
        i53.f fVarB = d.b(arrayList, localDateMinusDays, localDateNow, jg.b.r(localDateMinusDays, localDateNow));
        if (arrayListZ.isEmpty()) {
            z14 = false;
            break;
        }
        Iterator it = arrayListZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = false;
                break;
            }
            o61.n nVar = (o61.n) it.next();
            if (nVar.getTrainingStatus() != null || nVar.getIsTrainingStatusPaused()) {
                z14 = true;
                break;
            }
        }
        int i14 = e32.o.f62808k.f62819a / 2;
        ArrayList<o61.n> arrayList2 = new ArrayList();
        for (Object obj : arrayListZ) {
            if (((o61.n) obj).d().isAfter(LocalDate.now().minusDays(i14))) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (o61.n nVar2 : arrayList2) {
                if (nVar2.getTrainingStatus() != null || nVar2.getIsTrainingStatusPaused()) {
                    z15 = true;
                    break;
                }
            }
        }
        return new o61.o(fVarB, z14, z15);
    }

    @Override // n70.v
    public final String getTag() {
        return "GetTrainingStatusSummariesDataUseCase";
    }
}
