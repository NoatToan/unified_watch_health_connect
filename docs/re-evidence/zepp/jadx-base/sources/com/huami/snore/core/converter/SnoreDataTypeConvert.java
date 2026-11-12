package com.huami.snore.core.converter;

import android.content.Context;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.snore.core.cloud.api.response.SnoreEventsResponse;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.snore.core.dto.VoiceType;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.manager.SnoreFileManager;
import com.huami.snore.core.util.DateParseUtilKt;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/snore/core/converter/SnoreDataTypeConvert;", "", "Lcom/huami/snore/core/cloud/api/response/SnoreEventsResponse;", AbstractJSONTokenResponse.RESPONSE, "Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "convertResp2Entity", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreDataTypeConvert {

    @NotNull
    public static final SnoreDataTypeConvert INSTANCE = new SnoreDataTypeConvert();

    private SnoreDataTypeConvert() {
    }

    @NotNull
    public final VoiceRecorderEntity convertResp2Entity(@NotNull SnoreEventsResponse response) {
        long j = 1000;
        Date dateTimeStampToDate = DateParseUtilKt.timeStampToDate(Long.valueOf(response.getStartTime() * j));
        VoiceRecorderEntity voiceRecorderEntity = new VoiceRecorderEntity(0L, null, 0L, null, null, null, false, 127, null);
        voiceRecorderEntity.setUploaded(true);
        SnoreFileManager.Companion companion = SnoreFileManager.INSTANCE;
        Context appContext = KoinExtKt.getAppContext();
        VoiceType voiceType = VoiceType.SNORE;
        voiceRecorderEntity.setFilePath(companion.getFileNameByTime(appContext, voiceType, dateTimeStampToDate));
        voiceRecorderEntity.setUid(response.getUserId());
        voiceRecorderEntity.setDuration(response.getDuration() * j);
        voiceRecorderEntity.setType(voiceType);
        voiceRecorderEntity.setStartTime(dateTimeStampToDate);
        return voiceRecorderEntity;
    }
}
