package com.huami.third.googlefit;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/huami/third/googlefit/MapItem;", "", "", "a", LogUtil.I, "getId", "()I", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "getDesc", "desc", GoogleApiAvailabilityLight.a, "getGoogle", "google", "e", "getHm", Constant.PAI_KEY_HIGH_ZONE_MINUTES, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class MapItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("id")
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("desc")
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("google")
    @NotNull
    private final String google;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(Constant.PAI_KEY_HIGH_ZONE_MINUTES)
    private final int hm;

    public MapItem(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2) {
        this.id = i;
        this.name = str;
        this.desc = str2;
        this.google = str3;
        this.hm = i2;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getGoogle() {
        return this.google;
    }

    public final int getHm() {
        return this.hm;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
