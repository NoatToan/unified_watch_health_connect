package com.xiaomi.hm.health.step.stage.local.convert;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.step.stage.model.StageItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/local/convert/StageItemTypeConvert;", "", "", "Lcom/xiaomi/hm/health/step/stage/model/StageItem;", "list", "", "toJson", "json", "toStageItems", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StageItemTypeConvert {
    @TypeConverter
    @NotNull
    public final String toJson(@NotNull List<StageItem> list) {
        return new Gson().toJson(list);
    }

    @TypeConverter
    @NotNull
    public final List<StageItem> toStageItems(@NotNull String json) {
        return (List) new Gson().fromJson(json, new TypeToken<List<? extends StageItem>>() { // from class: com.xiaomi.hm.health.step.stage.local.convert.StageItemTypeConvert.toStageItems.1
        }.getType());
    }
}
