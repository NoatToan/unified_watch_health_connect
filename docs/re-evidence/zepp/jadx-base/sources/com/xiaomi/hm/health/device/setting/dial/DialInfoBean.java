package com.xiaomi.hm.health.device.setting.dial;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/DialInfoBean;", "", "", "a", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", WebConst.QueryParam.SET_ID, "(Ljava/lang/Integer;)V", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "c", "getBuiltinId", "setBuiltinId", "builtinId", GoogleApiAvailabilityLight.a, "getImage", "setImage", "image", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialInfoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("id")
    @Nullable
    private Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    @Nullable
    private String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("builtin_id")
    @Nullable
    private Integer builtinId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("image")
    @Nullable
    private String image;

    @Nullable
    public final Integer getBuiltinId() {
        return this.builtinId;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setBuiltinId(@Nullable Integer num) {
        this.builtinId = num;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
