package com.xiaomi.hm.health.device.assistant.smart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B+\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "", "", "a", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", "cardId", "b", "getAppId", "appId", "", "c", "Z", "isEnable", "()Z", "setEnable", "(Z)V", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getType", "()I", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVo;", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoWithUrl;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String appId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int type;

    private ItemVo(String str, String str2, boolean z, int i) {
        this.cardId = str;
        this.appId = str2;
        this.isEnable = z;
        this.type = i;
    }

    public /* synthetic */ ItemVo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, i);
    }

    @NotNull
    public String getAppId() {
        return this.appId;
    }

    @NotNull
    public String getCardId() {
        return this.cardId;
    }

    public int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isEnable, reason: from getter */
    public boolean getIsEnable() {
        return this.isEnable;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }

    public /* synthetic */ ItemVo(String str, String str2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i2 & 8) != 0 ? -1 : i, null);
    }
}
