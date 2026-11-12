package com.huami.assistant.ui.v2.db.converter;

import androidx.room.TypeConverter;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, d2 = {"Lcom/huami/assistant/ui/v2/db/converter/ScheduleConverters;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "", "repeatModeToLong", "longToRepeatMode", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "source", "", "sourceToInt", "intToSource", "value", "", "intToBoolean", "booleanToInt", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleConverters {
    @TypeConverter
    public final int booleanToInt(boolean value) {
        return value ? 1 : 0;
    }

    @TypeConverter
    public final boolean intToBoolean(int value) {
        return value == 1;
    }

    @TypeConverter
    @NotNull
    public final ScheduleSource intToSource(int source) {
        return ScheduleSource.INSTANCE.fromSource(source);
    }

    @TypeConverter
    @NotNull
    public final ScheduleRepeatMode longToRepeatMode(long mode) {
        return new ScheduleRepeatMode(mode);
    }

    @TypeConverter
    public final long repeatModeToLong(@NotNull ScheduleRepeatMode mode) {
        return mode.getMode();
    }

    @TypeConverter
    public final int sourceToInt(@NotNull ScheduleSource source) {
        return source.getSource();
    }
}
