package com.xiaomi.hm.health.nps.model;

import com.alipay.sdk.m.x.d;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0015\u0010.\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u0007R\u0013\u00100\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u0007¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/nps/model/NpsTarget;", "", "", "toString", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", WebConst.QueryParam.SET_ID, "(Ljava/lang/String;)V", "title", "getTitle", d.o, "subTitle", "getSubTitle", "setSubTitle", "target", "getTarget", "setTarget", "image", "getImage", "setImage", "describe", "getDescribe", "setDescribe", "", "status", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "mode", "getMode", "setMode", "deliveryType", "getDeliveryType", "setDeliveryType", "Lcom/xiaomi/hm/health/nps/model/Extensions;", GPXTrackPoint.XML.TAG_EXTENSIONS, "Lcom/xiaomi/hm/health/nps/model/Extensions;", "getExtensions", "()Lcom/xiaomi/hm/health/nps/model/Extensions;", "setExtensions", "(Lcom/xiaomi/hm/health/nps/model/Extensions;)V", "getDeviceId", "deviceId", "getSurveyId", "surveyId", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsTarget {

    @Nullable
    private String deliveryType;

    @Nullable
    private String describe;

    @Nullable
    private Extensions extensions;

    @Nullable
    private String id;

    @Nullable
    private String image;

    @Nullable
    private Integer mode;

    @Nullable
    private Integer status;

    @Nullable
    private String subTitle;

    @Nullable
    private String target;

    @Nullable
    private String title;

    @Nullable
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    @Nullable
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    public final String getDeviceId() {
        Extensions extensions = this.extensions;
        if (extensions == null) {
            return null;
        }
        return extensions.getNpsDeviceSource();
    }

    @Nullable
    public final Extensions getExtensions() {
        return this.extensions;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final Integer getMode() {
        return this.mode;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getSurveyId() {
        Assets assets;
        String npsId;
        Extensions extensions = this.extensions;
        return (extensions == null || (assets = extensions.getAssets()) == null || (npsId = assets.getNpsId()) == null) ? "" : npsId;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDeliveryType(@Nullable String str) {
        this.deliveryType = str;
    }

    public final void setDescribe(@Nullable String str) {
        this.describe = str;
    }

    public final void setExtensions(@Nullable Extensions extensions) {
        this.extensions = extensions;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setMode(@Nullable Integer num) {
        this.mode = num;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTarget(@Nullable String str) {
        this.target = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "问券ID:" + getSurveyId() + ", 设备ID:" + ((Object) getDeviceId());
    }
}
