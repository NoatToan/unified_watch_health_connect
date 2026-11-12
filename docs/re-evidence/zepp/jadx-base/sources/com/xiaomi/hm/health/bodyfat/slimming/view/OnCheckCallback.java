package com.xiaomi.hm.health.bodyfat.slimming.view;

import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/OnCheckCallback;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfo", "", "onNextStep", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public interface OnCheckCallback {
    void onNextStep(@NotNull WeightInfos weightInfo);
}
