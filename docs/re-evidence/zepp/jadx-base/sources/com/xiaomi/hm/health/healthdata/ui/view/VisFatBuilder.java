package com.xiaomi.hm.health.healthdata.ui.view;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/VisFatBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "getColors", "()Ljava/util/List;", "colors", "", "getLevelHints", "levelHints", "getSectionValues", "sectionValues", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class VisFatBuilder implements ColoredProgressBarBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context = BraceletApp.getContext();

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<Integer> getColors() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(ContextCompat.getColor(this.context, R.color.s15)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s33)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s52))});
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getLevelHints() {
        return ArraysKt___ArraysKt.toList(this.context.getResources().getStringArray(R.array.visceral_fat_leval));
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getSectionValues() {
        List<Float> visFatSections = BodyCompositionUtilsKt.getVisFatSections();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(visFatSections, 10));
        Iterator<T> it2 = visFatSections.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf((int) ((Number) it2.next()).floatValue()));
        }
        return arrayList;
    }
}
