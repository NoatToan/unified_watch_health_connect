package com.huami.sky.lib.room;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.sky.lib.entity.RelaxInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/room/RelaxInfoListConverter;", "", "", "json", "", "Lcom/huami/sky/lib/entity/RelaxInfo;", "fromString", "scores", "toString", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class RelaxInfoListConverter {
    @TypeConverter
    @NotNull
    public final List<RelaxInfo> fromString(@NotNull String json) {
        return (List) new Gson().fromJson(json, new TypeToken<List<? extends RelaxInfo>>() { // from class: com.huami.sky.lib.room.RelaxInfoListConverter$fromString$type$1
        }.getType());
    }

    @TypeConverter
    @NotNull
    public final String toString(@NotNull List<RelaxInfo> scores) {
        return new Gson().toJson(scores);
    }
}
