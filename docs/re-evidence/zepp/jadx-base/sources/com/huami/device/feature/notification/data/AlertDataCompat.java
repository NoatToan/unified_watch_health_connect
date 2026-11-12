package com.huami.device.feature.notification.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xmlywind.sdk.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/notification/data/AlertDataCompat;", "", "", "toString", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "a", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "getExt", "()Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", Constants.EXT, "b", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "pkg", "", "c", LogUtil.I, "getEventId", "()I", "setEventId", "(I)V", DbUtils.Const.Columns.Event.EVENT_ID, GoogleApiAvailabilityLight.a, "getSupportReply", "setSupportReply", "supportReply", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;Ljava/lang/String;II)V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class AlertDataCompat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMAlertModeExt ext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int eventId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int supportReply;

    @JvmOverloads
    public AlertDataCompat(@NotNull HMAlertModeExt hMAlertModeExt) {
        this(hMAlertModeExt, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public AlertDataCompat(@NotNull HMAlertModeExt hMAlertModeExt, @NotNull String str) {
        this(hMAlertModeExt, str, 0, 0, 12, null);
    }

    @JvmOverloads
    public AlertDataCompat(@NotNull HMAlertModeExt hMAlertModeExt, @NotNull String str, int i) {
        this(hMAlertModeExt, str, i, 0, 8, null);
    }

    @JvmOverloads
    public AlertDataCompat(@NotNull HMAlertModeExt hMAlertModeExt, @NotNull String str, int i, int i2) {
        this.ext = hMAlertModeExt;
        this.pkg = str;
        this.eventId = i;
        this.supportReply = i2;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final HMAlertModeExt getExt() {
        return this.ext;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    public final int getSupportReply() {
        return this.supportReply;
    }

    public final void setEventId(int i) {
        this.eventId = i;
    }

    public final void setSupportReply(int i) {
        this.supportReply = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlertDataCompat{pkg=");
        sb.append(this.pkg);
        sb.append("eventId=");
        sb.append(this.eventId);
        sb.append("supportReply=");
        sb.append(this.supportReply == 1);
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ AlertDataCompat(HMAlertModeExt hMAlertModeExt, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMAlertModeExt, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
