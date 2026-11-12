package com.example.aivs.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/example/aivs/export/AivsHelper;", "", "getPrivacySettings", "", "did", "", "callback", "Lcom/example/aivs/export/PrivacyCallback;", "setPrivacySettings", "checked", "", "getAivsEnv", "Lcom/example/aivs/export/AivsEnvEntry;", "setAivsEnv", "env", "syncNlpEngine", "getDeviceId", "getAuthorization", "initEngine", "Companion", "aivs-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AivsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/example/aivs/export/AivsHelper$Companion;", "", "<init>", "()V", "aivs-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    AivsEnvEntry getAivsEnv();

    @NotNull
    String getAuthorization(@NotNull String did);

    @NotNull
    String getDeviceId(@NotNull String did);

    void getPrivacySettings(@NotNull String did, @NotNull PrivacyCallback callback);

    void initEngine();

    void setAivsEnv(@NotNull AivsEnvEntry env);

    void setPrivacySettings(@NotNull String did, boolean checked, @NotNull PrivacyCallback callback);

    void syncNlpEngine();
}
