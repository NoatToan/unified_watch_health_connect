package com.huami.snore.core.db.dao;

import androidx.room.TypeConverter;
import com.huami.snore.core.dto.VoiceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/snore/core/db/dao/VoiceTypeConvert;", "", "Lcom/huami/snore/core/dto/VoiceType;", "type", "", "toString", "toType", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceTypeConvert {
    @TypeConverter
    @Nullable
    public final String toString(@Nullable VoiceType type) {
        String type2;
        return (type == null || (type2 = type.getType()) == null) ? "" : type2;
    }

    @TypeConverter
    @NotNull
    public final VoiceType toType(@NotNull String type) {
        return VoiceType.INSTANCE.find(type);
    }
}
