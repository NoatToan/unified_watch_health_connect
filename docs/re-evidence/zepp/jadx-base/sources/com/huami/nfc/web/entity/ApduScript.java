package com.huami.nfc.web.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.b;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001b¨\u0006*"}, d2 = {"Lcom/huami/nfc/web/entity/ApduScript;", "", "", "component1", "component2", "component3", "component4", "", "Lcom/huami/nfc/web/entity/Command;", "component5", "component6", b.c, "bizSerialNo", "nextStep", "aid", "commands", "voucherCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSession", "()Ljava/lang/String;", "b", "getBizSerialNo", "c", "getNextStep", GoogleApiAvailabilityLight.a, "getAid", "e", "Ljava/util/List;", "getCommands", "()Ljava/util/List;", "f", "getVoucherCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ApduScript {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(b.c)
    @NotNull
    private final String session;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("biz_serial_no")
    @Nullable
    private final String bizSerialNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("next_step")
    @NotNull
    private final String nextStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @Nullable
    private final String aid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("commands")
    @NotNull
    private final List<Command> commands;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("voucherCode")
    @Nullable
    private final String voucherCode;

    public ApduScript(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4, @NotNull List<Command> list, @Nullable String str5) {
        this.session = str;
        this.bizSerialNo = str2;
        this.nextStep = str3;
        this.aid = str4;
        this.commands = list;
        this.voucherCode = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApduScript copy$default(ApduScript apduScript, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apduScript.session;
        }
        if ((i & 2) != 0) {
            str2 = apduScript.bizSerialNo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = apduScript.nextStep;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = apduScript.aid;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = apduScript.commands;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str5 = apduScript.voucherCode;
        }
        return apduScript.copy(str, str6, str7, str8, list2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBizSerialNo() {
        return this.bizSerialNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextStep() {
        return this.nextStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final List<Command> component5() {
        return this.commands;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    @NotNull
    public final ApduScript copy(@NotNull String session, @Nullable String bizSerialNo, @NotNull String nextStep, @Nullable String aid, @NotNull List<Command> commands, @Nullable String voucherCode) {
        return new ApduScript(session, bizSerialNo, nextStep, aid, commands, voucherCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApduScript)) {
            return false;
        }
        ApduScript apduScript = (ApduScript) other;
        return Intrinsics.areEqual(this.session, apduScript.session) && Intrinsics.areEqual(this.bizSerialNo, apduScript.bizSerialNo) && Intrinsics.areEqual(this.nextStep, apduScript.nextStep) && Intrinsics.areEqual(this.aid, apduScript.aid) && Intrinsics.areEqual(this.commands, apduScript.commands) && Intrinsics.areEqual(this.voucherCode, apduScript.voucherCode);
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getBizSerialNo() {
        return this.bizSerialNo;
    }

    @NotNull
    public final List<Command> getCommands() {
        return this.commands;
    }

    @NotNull
    public final String getNextStep() {
        return this.nextStep;
    }

    @NotNull
    public final String getSession() {
        return this.session;
    }

    @Nullable
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public int hashCode() {
        int iHashCode = this.session.hashCode() * 31;
        String str = this.bizSerialNo;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nextStep.hashCode()) * 31;
        String str2 = this.aid;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.commands.hashCode()) * 31;
        String str3 = this.voucherCode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApduScript(session=" + this.session + ", bizSerialNo=" + ((Object) this.bizSerialNo) + ", nextStep=" + this.nextStep + ", aid=" + ((Object) this.aid) + ", commands=" + this.commands + ", voucherCode=" + ((Object) this.voucherCode) + ')';
    }

    public /* synthetic */ ApduScript(String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? null : str5);
    }
}
