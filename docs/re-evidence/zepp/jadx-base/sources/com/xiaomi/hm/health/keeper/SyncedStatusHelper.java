package com.xiaomi.hm.health.keeper;

import android.content.SharedPreferences;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.huami.widget.share.ShareAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/keeper/SyncedStatusHelper;", "", "", "isSynced", "isSyncedData", "", Configs.Params.RESET, ShareAnalytics.ParamValue.SAVE, "", "a", "Ljava/lang/String;", "stateKey", "b", "originDataStartDateKey", "", "c", LogUtil.I, "getDataState", "()I", "setDataState", "(I)V", "dataState", GoogleApiAvailabilityLight.a, "getOriginDataStartDate", "()Ljava/lang/String;", "setOriginDataStartDate", "(Ljava/lang/String;)V", "originDataStartDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class SyncedStatusHelper {
    public static final int DATA_HAVE = 2;
    public static final int DATA_NONE = 1;
    public static final int DATA_UNKNOWN = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String stateKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String originDataStartDateKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int dataState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String originDataStartDate;

    public SyncedStatusHelper(@NotNull String str, @NotNull String str2) {
        this.stateKey = str;
        this.originDataStartDateKey = str2;
        this.dataState = HMKeeper.getSharedPref().getInt(str, 0);
        this.originDataStartDate = HMKeeper.getSharedPref().getString(str2, null);
    }

    public final int getDataState() {
        return this.dataState;
    }

    @Nullable
    public final String getOriginDataStartDate() {
        return this.originDataStartDate;
    }

    public final boolean isSynced() {
        return this.dataState != 0;
    }

    public final boolean isSyncedData() {
        return this.dataState == 2;
    }

    public final void reset() {
        this.dataState = 0;
        this.originDataStartDate = "";
    }

    public final void save() {
        SharedPreferences.Editor editorEdit = HMKeeper.getSharedPref().edit();
        editorEdit.putInt(this.stateKey, getDataState());
        editorEdit.putString(this.originDataStartDateKey, getOriginDataStartDate());
        editorEdit.apply();
    }

    public final void setDataState(int i) {
        this.dataState = i;
    }

    public final void setOriginDataStartDate(@Nullable String str) {
        this.originDataStartDate = str;
    }
}
