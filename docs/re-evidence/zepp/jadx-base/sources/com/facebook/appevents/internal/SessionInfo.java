package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B'\b\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010*\u001a\u00020#¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0013\u0010-\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo;", "", "", "incrementInterruptionCount", "writeSessionToDisk", "", "<set-?>", "a", LogUtil.I, "getInterruptionCount", "()I", "interruptionCount", "", "b", "Ljava/lang/Long;", "getDiskRestoreTime", "()Ljava/lang/Long;", "setDiskRestoreTime", "(Ljava/lang/Long;)V", "diskRestoreTime", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "c", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "getSourceApplicationInfo", "()Lcom/facebook/appevents/internal/SourceApplicationInfo;", "setSourceApplicationInfo", "(Lcom/facebook/appevents/internal/SourceApplicationInfo;)V", "sourceApplicationInfo", GoogleApiAvailabilityLight.a, "getSessionStartTime", "sessionStartTime", "e", "getSessionLastEventTime", "setSessionLastEventTime", "sessionLastEventTime", "Ljava/util/UUID;", "f", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "sessionId", "getSessionLength", "()J", "sessionLength", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class SessionInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String g = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final String h = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final String i = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final String j = "com.facebook.appevents.SessionInfo.sessionId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int interruptionCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Long diskRestoreTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SourceApplicationInfo sourceApplicationInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Long sessionStartTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Long sessionLastEventTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private UUID sessionId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo$Companion;", "", "Lcom/facebook/appevents/internal/SessionInfo;", "getStoredSessionInfo", "", "clearSavedSessionFromDisk", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            editorEdit.remove(SessionInfo.g);
            editorEdit.remove(SessionInfo.h);
            editorEdit.remove(SessionInfo.i);
            editorEdit.remove(SessionInfo.j);
            editorEdit.apply();
            SourceApplicationInfo.INSTANCE.clearSavedSourceApplicationInfoFromDisk();
        }

        @JvmStatic
        @Nullable
        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j = defaultSharedPreferences.getLong(SessionInfo.g, 0L);
            long j2 = defaultSharedPreferences.getLong(SessionInfo.h, 0L);
            String string = defaultSharedPreferences.getString(SessionInfo.j, null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.i, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.INSTANCE.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            sessionInfo.setSessionId(UUID.fromString(string));
            return sessionInfo;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public SessionInfo(@Nullable Long l, @Nullable Long l2) {
        this(l, l2, null, 4, null);
    }

    @JvmOverloads
    public SessionInfo(@Nullable Long l, @Nullable Long l2, @NotNull UUID uuid) {
        this.sessionStartTime = l;
        this.sessionLastEventTime = l2;
        this.sessionId = uuid;
    }

    @JvmStatic
    public static final void clearSavedSessionFromDisk() {
        INSTANCE.clearSavedSessionFromDisk();
    }

    @JvmStatic
    @Nullable
    public static final SessionInfo getStoredSessionInfo() {
        return INSTANCE.getStoredSessionInfo();
    }

    @Nullable
    public final Long getDiskRestoreTime() {
        Long l = this.diskRestoreTime;
        return Long.valueOf(l != null ? l.longValue() : 0L);
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    @NotNull
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l;
        if (this.sessionStartTime == null || (l = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Nullable
    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    @Nullable
    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(@Nullable Long l) {
        this.diskRestoreTime = l;
    }

    public final void setSessionId(@NotNull UUID uuid) {
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(@Nullable Long l) {
        this.sessionLastEventTime = l;
    }

    public final void setSourceApplicationInfo(@Nullable SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void writeSessionToDisk() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l = this.sessionStartTime;
        editorEdit.putLong(g, l != null ? l.longValue() : 0L);
        Long l2 = this.sessionLastEventTime;
        editorEdit.putLong(h, l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt(i, this.interruptionCount);
        editorEdit.putString(j, this.sessionId.toString());
        editorEdit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    public /* synthetic */ SessionInfo(Long l, Long l2, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, (i2 & 4) != 0 ? UUID.randomUUID() : uuid);
    }
}
