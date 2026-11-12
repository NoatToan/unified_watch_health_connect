package com.huami.nfc.web.entity;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\r\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/nfc/web/entity/RequestScript;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/nfc/web/entity/RequestCommand;", "component5", "type", b.c, "currentStep", "info", "commands", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getSession", "c", "getCurrentStep", GoogleApiAvailabilityLight.a, "getInfo", "e", "Lcom/huami/nfc/web/entity/RequestCommand;", "getCommands", "()Lcom/huami/nfc/web/entity/RequestCommand;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/nfc/web/entity/RequestCommand;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RequestScript {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(b.c)
    @NotNull
    private final String session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("current_step")
    @NotNull
    private final String currentStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("extra_info")
    @Nullable
    private final String info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("command_results")
    @NotNull
    private final RequestCommand commands;

    public RequestScript(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull RequestCommand requestCommand) {
        this.type = str;
        this.session = str2;
        this.currentStep = str3;
        this.info = str4;
        this.commands = requestCommand;
    }

    public static /* synthetic */ RequestScript copy$default(RequestScript requestScript, String str, String str2, String str3, String str4, RequestCommand requestCommand, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestScript.type;
        }
        if ((i & 2) != 0) {
            str2 = requestScript.session;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = requestScript.currentStep;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = requestScript.info;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            requestCommand = requestScript.commands;
        }
        return requestScript.copy(str, str5, str6, str7, requestCommand);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RequestCommand getCommands() {
        return this.commands;
    }

    @NotNull
    public final RequestScript copy(@NotNull String type, @NotNull String session, @NotNull String currentStep, @Nullable String info, @NotNull RequestCommand commands) {
        return new RequestScript(type, session, currentStep, info, commands);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestScript)) {
            return false;
        }
        RequestScript requestScript = (RequestScript) other;
        return Intrinsics.areEqual(this.type, requestScript.type) && Intrinsics.areEqual(this.session, requestScript.session) && Intrinsics.areEqual(this.currentStep, requestScript.currentStep) && Intrinsics.areEqual(this.info, requestScript.info) && Intrinsics.areEqual(this.commands, requestScript.commands);
    }

    @NotNull
    public final RequestCommand getCommands() {
        return this.commands;
    }

    @NotNull
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final String getSession() {
        return this.session;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.session.hashCode()) * 31) + this.currentStep.hashCode()) * 31;
        String str = this.info;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.commands.hashCode();
    }

    @NotNull
    public String toString() {
        return "RequestScript(type=" + this.type + ", session=" + this.session + ", currentStep=" + this.currentStep + ", info=" + ((Object) this.info) + ", commands=" + this.commands + ')';
    }

    public /* synthetic */ RequestScript(String str, String str2, String str3, String str4, RequestCommand requestCommand, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, requestCommand);
    }
}
