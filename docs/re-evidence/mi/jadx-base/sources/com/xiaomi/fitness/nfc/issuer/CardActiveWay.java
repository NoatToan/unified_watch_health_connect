package com.xiaomi.fitness.nfc.issuer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/nfc/issuer/CardActiveWay;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MASTERCARD_EMAIL", "MASTERCARD_SMS", "VISA_EMAIL", "VISA_SMS", "VISA_CALL_CENTER", "VISA_CALL_CENTER2", "VISA_CALL_CENTER3", "MASTER_APP_TO_APPLICATION", "VISA_APP_TO_APPLICATION2", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CardActiveWay {
    MASTERCARD_EMAIL("EMAIL_TO_CARDHOLDER_ADDRESS"),
    MASTERCARD_SMS("TEXT_TO_CARDHOLDER_NUMBER"),
    VISA_EMAIL("OTPEMAIL"),
    VISA_SMS("OTPSMS"),
    VISA_CALL_CENTER("CARDHOLDER_TO_CALL_AUTOMATED_NUMBER"),
    VISA_CALL_CENTER2("OUTBOUNDCALL"),
    VISA_CALL_CENTER3("CUSTOMERSERVICE"),
    MASTER_APP_TO_APPLICATION("CARDHOLDER_TO_USE_ISSUER_MOBILE_APP"),
    VISA_APP_TO_APPLICATION2("APP-TO-APP");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String type;

    CardActiveWay(String str) {
        this.type = str;
    }

    @NotNull
    public static EnumEntries<CardActiveWay> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
