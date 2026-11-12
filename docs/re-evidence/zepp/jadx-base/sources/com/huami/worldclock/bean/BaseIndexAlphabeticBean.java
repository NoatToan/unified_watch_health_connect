package com.huami.worldclock.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/worldclock/bean/BaseIndexAlphabeticBean;", "Lcom/huami/worldclock/bean/BaseIndexBean;", "", "getBaseIndexPinyin", "baseIndexPinyin", "setBaseIndexPinyin", "baseAlphabeticString", "", "setBaseAlphabeticString", "getBaseAlphabeticString", "c", "Ljava/lang/String;", GoogleApiAvailabilityLight.a, "", "isNeedToAlphabetic", "()Z", "getTarget", "()Ljava/lang/String;", "target", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseIndexAlphabeticBean extends BaseIndexBean {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String baseIndexPinyin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String baseAlphabeticString;

    @Nullable
    public final String getBaseAlphabeticString() {
        return this.baseAlphabeticString;
    }

    @Nullable
    public final String getBaseIndexPinyin() {
        return this.baseIndexPinyin;
    }

    @NotNull
    public abstract String getTarget();

    public boolean isNeedToAlphabetic() {
        return true;
    }

    public final void setBaseAlphabeticString(@NotNull String baseAlphabeticString) {
        this.baseAlphabeticString = baseAlphabeticString;
    }

    @NotNull
    public final BaseIndexAlphabeticBean setBaseIndexPinyin(@NotNull String baseIndexPinyin) {
        this.baseIndexPinyin = baseIndexPinyin;
        return this;
    }
}
