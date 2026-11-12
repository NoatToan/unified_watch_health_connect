package com.huami.nfc.web;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/huami/nfc/web/PayHeader;", "", "", "a", "Ljava/lang/String;", "getCplc", "()Ljava/lang/String;", "cplc", "b", "getModel", "model", "c", "getImei", "imei", GoogleApiAvailabilityLight.a, "getRomVersion", "romVersion", "e", "getOsVersion", DbUtils.Const.Columns.Context.OS_VERSION_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class PayHeader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String cplc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String imei;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String romVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String osVersion;

    public PayHeader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.cplc = str;
        this.model = str2;
        this.imei = str3;
        this.romVersion = str4;
        this.osVersion = str5;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getRomVersion() {
        return this.romVersion;
    }

    public /* synthetic */ PayHeader(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? PayHeaderKt.getANDROID_VERSION() : str5);
    }
}
