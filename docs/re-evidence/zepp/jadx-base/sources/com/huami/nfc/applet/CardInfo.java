package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/nfc/applet/CardInfo;", "", "", "toString", "a", "Ljava/lang/String;", "getNumber", "()Ljava/lang/String;", "number", "", "b", "J", "getActivationDate", "()J", "activationDate", "c", "getExpiredDate", "expiredDate", "", GoogleApiAvailabilityLight.a, "Z", "getEnable", "()Z", "enable", "", "e", LogUtil.I, "getBalance", "()I", StatEvent.SPORT_TP_VALUE_BALANCE, "<init>", "(Ljava/lang/String;JJZI)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public class CardInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long activationDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long expiredDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int balance;

    public CardInfo(@NotNull String str, long j, long j2, boolean z, int i) {
        this.number = str;
        this.activationDate = j;
        this.expiredDate = j2;
        this.enable = z;
        this.balance = i;
    }

    public final long getActivationDate() {
        return this.activationDate;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getExpiredDate() {
        return this.expiredDate;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public String toString() {
        return "CardInfo(enable= " + this.enable + ", number='" + this.number + "', balance=" + this.balance + ", activationDate=" + this.activationDate + '(' + CityAppletExtensionsKt.toDateString(this.activationDate) + "), expiredDate=" + this.expiredDate + '(' + CityAppletExtensionsKt.toDateString(this.expiredDate) + "))";
    }

    public /* synthetic */ CardInfo(String str, long j, long j2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? 0 : i);
    }
}
