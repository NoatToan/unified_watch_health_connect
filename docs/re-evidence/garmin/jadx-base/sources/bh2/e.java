package bh2;

import am.x0;
import am.z0;
import e23.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import og2.i;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f17919b;

    public /* synthetic */ e(Map map, int i14) {
        this.f17918a = i14;
        this.f17919b = map;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        Integer num;
        List<com.garmin.android.apps.connectmobile.performance.dto.d> list;
        boolean z15;
        switch (this.f17918a) {
            case 0:
                ag2.c cVar = (ag2.c) obj;
                cVar.getClass();
                ag2.c.a aVarA = cVar.a();
                if (aVarA != null) {
                    switch (g.f17920a[aVarA.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            if (this.f17919b.get(aVarA) == null) {
                                z14 = true;
                                break;
                            }
                        default:
                            z14 = false;
                            break;
                    }
                } else {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                x0 x0VarM = z0.m((String) entry.getKey());
                if (x0VarM == null || (num = (Integer) this.f17919b.get(x0VarM)) == null) {
                    return Integer.MAX_VALUE;
                }
                return num;
            case 2:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                o71.e.c cVar2 = (o71.e.c) this.f17919b.get(localDate);
                if (cVar2 == null || (list = cVar2.f130187b) == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (com.garmin.android.apps.connectmobile.performance.dto.d dVar : list) {
                    com.garmin.android.apps.connectmobile.performance.dto.c cVarB = dVar.b();
                    Double d14 = (Double) linkedHashMap.get(cVarB);
                    linkedHashMap.put(cVarB, Double.valueOf(dVar.getTotalVolume() + (d14 != null ? d14.doubleValue() : 0.0d)));
                    Integer num2 = (Integer) linkedHashMap2.get(cVarB);
                    int iIntValue = 0;
                    linkedHashMap2.put(cVarB, Integer.valueOf(dVar.getTotalReps() + (num2 != null ? num2.intValue() : 0)));
                    Integer num3 = (Integer) linkedHashMap3.get(cVarB);
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    }
                    linkedHashMap3.put(cVarB, Integer.valueOf(dVar.getTotalSets() + iIntValue));
                }
                return new o71.b.C2480b(new YearMonth(localDate), list, linkedHashMap, linkedHashMap2, linkedHashMap3);
            case 3:
                ag2.c cVar3 = (ag2.c) obj;
                cVar3.getClass();
                ag2.c.a aVarA2 = cVar3.a();
                if (aVarA2 != null) {
                    int i14 = i.a.f132041a[aVarA2.ordinal()];
                    if (i14 == 2 || i14 == 3 || i14 == 4 || i14 == 7) {
                        z15 = this.f17919b.get(cVar3.a()) == null;
                    }
                }
                return Boolean.valueOf(z15);
            default:
                this.f17919b.remove(obj);
                return Unit.INSTANCE;
        }
    }
}
