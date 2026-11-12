package com.xiaomi.hm.health.nps.model;

import com.google.gson.annotations.SerializedName;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/nps/model/Assets;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "npsId", "getNpsId", "setNpsId", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class Assets {

    @Nullable
    private String id;

    @SerializedName("nps_id")
    @Nullable
    private String npsId;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNpsId() {
        return this.npsId;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setNpsId(@Nullable String str) {
        this.npsId = str;
    }
}
