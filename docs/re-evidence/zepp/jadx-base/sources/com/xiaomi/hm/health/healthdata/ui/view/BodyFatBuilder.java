package com.xiaomi.hm.health.healthdata.ui.view;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/view/BodyFatBuilder;", "Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "getColors", "()Ljava/util/List;", "colors", "", "getLevelHints", "levelHints", "getSectionValues", "sectionValues", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatBuilder implements ColoredProgressBarBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context = BraceletApp.getContext();

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<Integer> getColors() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(ContextCompat.getColor(this.context, R.color.s25)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s15)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s20)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s33)), Integer.valueOf(ContextCompat.getColor(this.context, R.color.s52))});
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getLevelHints() {
        return ArraysKt___ArraysKt.toList(this.context.getResources().getStringArray(R.array.bodyfat_content_leval));
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder
    @NotNull
    public List<String> getSectionValues() {
        ArrayList arrayList;
        float[] bodyFatAllSection = BodyParamsUtils.getBodyFatAllSection(ColoredProgressBarBuilderKt.a().getAge(), ColoredProgressBarBuilderKt.a().getGender());
        if (bodyFatAllSection == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(bodyFatAllSection.length);
            int i = 0;
            int length = bodyFatAllSection.length;
            while (i < length) {
                float f = bodyFatAllSection[i];
                i++;
                arrayList2.add(f + "%");
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
