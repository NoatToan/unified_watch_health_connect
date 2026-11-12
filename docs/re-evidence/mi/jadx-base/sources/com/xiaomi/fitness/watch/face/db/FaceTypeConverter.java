package com.xiaomi.fitness.watch.face.db;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceTypeConverter;", "", "<init>", "()V", "toJson", "", "value", "", "Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "fromJson", "json", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceTypeConverter {
    @Nullable
    public final List<FaceBleMultiPhoto> fromJson(@Nullable String json) {
        return (List) new Gson().fromJson(json, new TypeToken<List<? extends FaceBleMultiPhoto>>() { // from class: com.xiaomi.fitness.watch.face.db.FaceTypeConverter$fromJson$type$1
        }.getType());
    }

    @NotNull
    public final String toJson(@Nullable List<FaceBleMultiPhoto> value) {
        String json = new Gson().toJson(value, new TypeToken<List<? extends FaceBleMultiPhoto>>() { // from class: com.xiaomi.fitness.watch.face.db.FaceTypeConverter$toJson$type$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
