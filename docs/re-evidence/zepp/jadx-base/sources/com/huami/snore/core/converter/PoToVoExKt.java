package com.huami.snore.core.converter;

import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.snore.core.util.DateParseUtilKt;
import com.huami.snore.core.vo.VoiceShowInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "toVoiceShowInfo", "snore_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoExKt {
    @NotNull
    public static final VoiceShowInfo toVoiceShowInfo(@NotNull VoiceRecorderEntity voiceRecorderEntity) {
        return new VoiceShowInfo(voiceRecorderEntity.getId(), DateParseUtilKt.timeParseMS(voiceRecorderEntity.getDuration()), voiceRecorderEntity.getDuration(), voiceRecorderEntity.getType(), voiceRecorderEntity.getStartTime(), voiceRecorderEntity.getFilePath(), false, voiceRecorderEntity.getUploaded(), 64, null);
    }
}
