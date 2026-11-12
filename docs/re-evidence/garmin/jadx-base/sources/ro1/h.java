package ro1;

import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lro1/h;", "Ljava/util/Comparator;", "Lro1/e;", "Lkotlin/Comparator;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Comparator<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f153958a;

    public h(Map<String, Integer> map) {
        this.f153958a = map;
    }

    @Override // java.util.Comparator
    public final int compare(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        eVar3.getClass();
        eVar4.getClass();
        String str = eVar3.f153929a.packageName;
        Map<String, Integer> map = this.f153958a;
        Integer num = map.get(str);
        int iIntValue = num != null ? num.intValue() : 1073741823;
        Integer num2 = map.get(eVar4.f153929a.packageName);
        int iIntValue2 = iIntValue - (num2 != null ? num2.intValue() : 1073741823);
        return iIntValue2 == 0 ? eVar3.toString().compareTo(eVar4.toString()) : iIntValue2;
    }
}
