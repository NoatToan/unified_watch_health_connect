package com.xiaomi.hm.health.device.brand;

import com.huami.watch.companion.device.brand.BrandName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/brand/BrandFilterRule;", "", "", "btName", "Lcom/huami/watch/companion/device/brand/BrandName;", "a", "", "names", "matchMultiNames", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "amazfitRule", "b", "zeppRule", "c", "miRule", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BrandFilterRule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Regex amazfitRule = new Regex("([A|a]mazfit|AMAZFIT|米动)");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Regex zeppRule = new Regex("([Z|z]epp|ZEPP)");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Regex miRule = new Regex("([mM][iI]|[x|X][i|I][a|A][o|O][m|M][i|I]|MIBCS|MIBFS|小米)");

    private final BrandName a(String btName) {
        if (this.amazfitRule.containsMatchIn(btName)) {
            return BrandName.AMZ;
        }
        if (this.zeppRule.containsMatchIn(btName)) {
            return BrandName.ZEPP;
        }
        return this.miRule.containsMatchIn(btName) ? BrandName.XMI : BrandName.OTHER;
    }

    @NotNull
    public final BrandName matchMultiNames(@NotNull List<String> names) {
        Object obj;
        if (names.isEmpty()) {
            return BrandName.OTHER;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(names, 10));
        Iterator<T> it2 = names.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((String) it2.next()));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            if (it3.hasNext()) {
                int iOrdinal = ((BrandName) next).ordinal();
                do {
                    Object next2 = it3.next();
                    int iOrdinal2 = ((BrandName) next2).ordinal();
                    if (iOrdinal > iOrdinal2) {
                        next = next2;
                        iOrdinal = iOrdinal2;
                    }
                } while (it3.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        BrandName brandName = (BrandName) obj;
        return brandName == null ? BrandName.OTHER : brandName;
    }
}
