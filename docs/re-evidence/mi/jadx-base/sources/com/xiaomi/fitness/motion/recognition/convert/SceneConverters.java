package com.xiaomi.fitness.motion.recognition.convert;

import com.google.gson.Gson;
import com.xiaomi.fitness.motion.recognition.pressure.PressureSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/convert/SceneConverters;", "", "<init>", "()V", "fromPressureSegment", "", "segment", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "toPressureSegment", "json", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneConverters {

    @NotNull
    public static final SceneConverters INSTANCE = new SceneConverters();

    private SceneConverters() {
    }

    @NotNull
    public final String fromPressureSegment(@Nullable PressureSegment segment) {
        if (segment == null) {
            return "";
        }
        String json = new Gson().toJson(segment);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Nullable
    public final PressureSegment toPressureSegment(@Nullable String json) {
        if (json == null || json.length() == 0) {
            return null;
        }
        return (PressureSegment) new Gson().fromJson(json, PressureSegment.class);
    }
}
