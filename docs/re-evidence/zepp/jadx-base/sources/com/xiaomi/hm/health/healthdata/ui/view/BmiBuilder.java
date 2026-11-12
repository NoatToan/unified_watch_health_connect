package com.xiaomi.hm.health.healthdata.ui.view;

import com.xiaomi.hm.health.healthdata.ui.vo.BmiObject;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/BmiBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BmiObject;", "a", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BmiObject;", "bmiObject", "", "", "getColors", "()Ljava/util/List;", "colors", "", "getLevelHints", "levelHints", "getSectionValues", "sectionValues", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BmiBuilder implements ColoredProgressBarBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BmiObject bmiObject = BodyCompositionUtilsKt.getBmiObject();

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<Integer> getColors() {
        return BodyCompositionUtilsKt.getBmiObject().getColors();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getLevelHints() {
        return this.bmiObject.getLevelHints();
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getSectionValues() {
        List<Float> sectionValues = this.bmiObject.getSectionValues();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sectionValues, 10));
        Iterator<T> it2 = sectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).floatValue()));
        }
        return arrayList;
    }
}
