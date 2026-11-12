package com.xiaomi.fitness.main.config;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.nfc.NfcConstants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/main/config/AppConfigs;", "", "<init>", "()V", "version", "", "getVersion", "()J", "setVersion", "(J)V", "updateTime", "getUpdateTime", "setUpdateTime", "isGray", "", "()Z", "setGray", "(Z)V", "state", "", "getState", "()I", "setState", "(I)V", MiuiCursorConstants.CONTENT, "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", q.f13857a, "Lcom/xiaomi/fitness/main/config/JsonContent;", "getConfig", "()Lcom/xiaomi/fitness/main/config/JsonContent;", NfcConstants.METHOD_SET_CONFIG, "(Lcom/xiaomi/fitness/main/config/JsonContent;)V", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppConfigs {

    @Nullable
    private JsonContent config;

    @Nullable
    private String content;

    @SerializedName("is_gray")
    private boolean isGray;
    private int state;

    @SerializedName("update_time")
    private long updateTime;
    private long version;

    @Nullable
    public final JsonContent getConfig() {
        JsonContent jsonContent = (JsonContent) new Gson().fromJson(this.content, new TypeToken<JsonContent>() { // from class: com.xiaomi.fitness.main.config.AppConfigs$config$type$1
        }.getType());
        this.config = jsonContent;
        return jsonContent;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getState() {
        return this.state;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: isGray, reason: from getter */
    public final boolean getIsGray() {
        return this.isGray;
    }

    public final void setConfig(@Nullable JsonContent jsonContent) {
        this.config = jsonContent;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setGray(boolean z) {
        this.isGray = z;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setVersion(long j) {
        this.version = j;
    }
}
