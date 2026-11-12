package ny;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lny/d;", "", "", "Lny/e;", "summaries", "<init>", "(Ljava/util/List;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f128299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128300b;

    public d(List<e> list) {
        Integer dataDaysCount;
        this.f128299a = list;
        int i14 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                e.b values = ((e) it.next()).getValues();
                iIntValue += (values == null || (dataDaysCount = values.getDataDaysCount()) == null) ? 0 : dataDaysCount.intValue();
            }
            i14 = iIntValue;
        }
        this.f128300b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public final Integer a() {
        Iterator<T> it;
        int i14;
        Integer numValueOf;
        e.b values;
        int iIntValue;
        Integer activeCalories;
        List<e> list = this.f128299a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                e.b values2 = ((e) obj).getValues();
                if ((values2 != null ? values2.getActiveCalories() : null) != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                numValueOf = null;
            } else if (list != null) {
                it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    values = ((e) it.next()).getValues();
                    if (values != null || (activeCalories = values.getActiveCalories()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = activeCalories.intValue();
                    }
                    i14 += iIntValue;
                }
                numValueOf = Integer.valueOf(i14);
            } else {
                numValueOf = null;
            }
        } else if (list != null) {
            it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                values = ((e) it.next()).getValues();
                if (values != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                i14 += iIntValue;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue2 = numValueOf.intValue();
        int i15 = this.f128300b;
        if (i15 <= 0) {
            i15 = 364;
        }
        return Integer.valueOf(iIntValue2 / i15);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public final Integer b() {
        Iterator<T> it;
        int i14;
        Integer numValueOf;
        e.b values;
        int iIntValue;
        Integer restingCalories;
        List<e> list = this.f128299a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                e.b values2 = ((e) obj).getValues();
                if ((values2 != null ? values2.getRestingCalories() : null) != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                numValueOf = null;
            } else if (list != null) {
                it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    values = ((e) it.next()).getValues();
                    if (values != null || (restingCalories = values.getRestingCalories()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = restingCalories.intValue();
                    }
                    i14 += iIntValue;
                }
                numValueOf = Integer.valueOf(i14);
            } else {
                numValueOf = null;
            }
        } else if (list != null) {
            it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                values = ((e) it.next()).getValues();
                if (values != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                i14 += iIntValue;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue2 = numValueOf.intValue();
        int i15 = this.f128300b;
        if (i15 <= 0) {
            i15 = 364;
        }
        return Integer.valueOf(iIntValue2 / i15);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public final Integer c() {
        Iterator<T> it;
        int i14;
        Integer numValueOf;
        e.b values;
        int iIntValue;
        Integer totalCalories;
        List<e> list = this.f128299a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                e.b values2 = ((e) obj).getValues();
                if ((values2 != null ? values2.getTotalCalories() : null) != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                numValueOf = null;
            } else if (list != null) {
                it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    values = ((e) it.next()).getValues();
                    if (values != null || (totalCalories = values.getTotalCalories()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = totalCalories.intValue();
                    }
                    i14 += iIntValue;
                }
                numValueOf = Integer.valueOf(i14);
            } else {
                numValueOf = null;
            }
        } else if (list != null) {
            it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                values = ((e) it.next()).getValues();
                if (values != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                i14 += iIntValue;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue2 = numValueOf.intValue();
        int i15 = this.f128300b;
        if (i15 <= 0) {
            i15 = 364;
        }
        return Integer.valueOf(iIntValue2 / i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.f128299a, ((d) obj).f128299a);
    }

    public final int hashCode() {
        List<e> list = this.f128299a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("WeeklyCaloriesSummary(summaries=", ")", this.f128299a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ d(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }
}
