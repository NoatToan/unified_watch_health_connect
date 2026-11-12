package com.huami.ai.speech.alexa.alarm;

import com.huami.ai.speech.alexa.entity.Alarm;
import com.huami.ai.speech.alexa.entity.Alarms;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H&J\u0012\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0002H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0002H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "", "", "endpointId", "status", "", "maxResults", "nextToken", "Lcom/huami/ai/speech/alexa/entity/Alarms;", "readAllAlarm", "scheduledTime", "Lcom/huami/ai/speech/alexa/entity/Alarm;", "createAlarm", "token", "", "deleteAlarm", "deleteAllAlarm", "cancelAlarm", "activeAlarm", "alarmDetail", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AlarmRestApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Alarm createAlarm$default(AlarmRestApi alarmRestApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAlarm");
            }
            if ((i & 1) != 0) {
                str = "@self";
            }
            return alarmRestApi.createAlarm(str, str2);
        }

        public static /* synthetic */ boolean deleteAllAlarm$default(AlarmRestApi alarmRestApi, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAllAlarm");
            }
            if ((i & 1) != 0) {
                str = "@self";
            }
            return alarmRestApi.deleteAllAlarm(str);
        }

        public static /* synthetic */ Alarms readAllAlarm$default(AlarmRestApi alarmRestApi, String str, String str2, int i, String str3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAllAlarm");
            }
            if ((i2 & 1) != 0) {
                str = "@self";
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 4) != 0) {
                i = Integer.MAX_VALUE;
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            return alarmRestApi.readAllAlarm(str, str2, i, str3);
        }
    }

    @Nullable
    Alarm activeAlarm(@NotNull String token);

    @Nullable
    Alarm alarmDetail(@NotNull String token);

    @Nullable
    Alarm cancelAlarm(@NotNull String token);

    @Nullable
    Alarm createAlarm(@NotNull String endpointId, @NotNull String scheduledTime);

    boolean deleteAlarm(@NotNull String token);

    boolean deleteAllAlarm(@NotNull String endpointId);

    @Nullable
    Alarms readAllAlarm(@NotNull String endpointId, @Nullable String status, int maxResults, @Nullable String nextToken);
}
