package com.huami.watch.companion.hci;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/huami/watch/companion/hci/NfcTradeInfoRaw;", "", "", "a", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "aid", "b", "getCode", "code", "c", "getBalance", StatEvent.SPORT_TP_VALUE_BALANCE, GoogleApiAvailabilityLight.a, "getClientId", "clientId", "e", "getConsumption", "consumption", "f", "getDate", "date", "g", "getHci", "hci", "h", "getType", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class NfcTradeInfoRaw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(StatEvent.SPORT_TP_VALUE_BALANCE)
    @NotNull
    private final String balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("clientId")
    @NotNull
    private final String clientId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("consumption")
    @NotNull
    private final String consumption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("hci")
    @NotNull
    private final String hci;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("type")
    @NotNull
    private final String type;

    public NfcTradeInfoRaw(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this.aid = str;
        this.code = str2;
        this.balance = str3;
        this.clientId = str4;
        this.consumption = str5;
        this.date = str6;
        this.hci = str7;
        this.type = str8;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getConsumption() {
        return this.consumption;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getHci() {
        return this.hci;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
