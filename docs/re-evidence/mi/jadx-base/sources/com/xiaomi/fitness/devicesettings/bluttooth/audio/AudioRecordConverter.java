package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordConverter;", "", "<init>", "()V", "stringToAsrResultItemList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "json", "", "asrResultItemListToString", "data", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioRecordConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordConverter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordConverter\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,17:1\n29#2:18\n*S KotlinDebug\n*F\n+ 1 AudioRecordConverter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordConverter\n*L\n10#1:18\n*E\n"})
public final class AudioRecordConverter {
    @NotNull
    public final String asrResultItemListToString(@Nullable List<AsrResultItem> data) {
        String json = new Gson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Nullable
    public final List<AsrResultItem> stringToAsrResultItemList(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return (List) new Gson().fromJson(json, new TypeToken<List<? extends AsrResultItem>>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordConverter$stringToAsrResultItemList$$inlined$fromJson$1
        }.getType());
    }
}
