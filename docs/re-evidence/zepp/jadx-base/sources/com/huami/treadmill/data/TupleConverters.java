package com.huami.treadmill.data;

import androidx.room.TypeConverter;
import com.google.gson.reflect.TypeToken;
import com.huami.network.base.util.HMHttpUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/data/TupleConverters;", "", "", "json", "Lcom/huami/treadmill/data/StringGenderTuple;", "TupleToJson", "tuple", "jsonToTuple", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TupleConverters {
    @TypeConverter
    @Nullable
    public final StringGenderTuple TupleToJson(@Nullable String json) {
        return (StringGenderTuple) HMHttpUtils.getGson().fromJson(json, new TypeToken<StringGenderTuple>() { // from class: com.huami.treadmill.data.TupleConverters$TupleToJson$type$1
        }.getType());
    }

    @TypeConverter
    @Nullable
    public final String jsonToTuple(@Nullable StringGenderTuple tuple) {
        return HMHttpUtils.getGson().toJson(tuple);
    }
}
