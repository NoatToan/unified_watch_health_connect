package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003Jo\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010\u0015\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0016\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#¨\u0006:"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "component2", "component3", "", "Lcom/huami/ai/speech/alexa/entity/payload/AlertAsset;", "component4", "component5", "component6", "", "component7", "component8", "component9", "token", "type", "scheduledTime", "assets", "assetPlayOrder", "backgroundAlertAsset", "loopCount", "loopPauseInMilliSeconds", "label", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", "getType", "c", "getScheduledTime", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getAssets", "()Ljava/util/List;", "e", "getAssetPlayOrder", "f", "getBackgroundAlertAsset", "g", "J", "getLoopCount", "()J", "h", "getLoopPauseInMilliSeconds", "i", "getLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JJLjava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SetAlertPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("scheduledTime")
    @NotNull
    private final String scheduledTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("assets")
    @NotNull
    private final List<AlertAsset> assets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("assetPlayOrder")
    @NotNull
    private final List<String> assetPlayOrder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("backgroundAlertAsset")
    @NotNull
    private final String backgroundAlertAsset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("loopCount")
    private final long loopCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("loopPauseInMilliSeconds")
    private final long loopPauseInMilliSeconds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("label")
    @NotNull
    private final String label;

    public SetAlertPayload(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<AlertAsset> list, @NotNull List<String> list2, @NotNull String str4, long j, long j2, @NotNull String str5) {
        this.token = str;
        this.type = str2;
        this.scheduledTime = str3;
        this.assets = list;
        this.assetPlayOrder = list2;
        this.backgroundAlertAsset = str4;
        this.loopCount = j;
        this.loopPauseInMilliSeconds = j2;
        this.label = str5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    public final List<AlertAsset> component4() {
        return this.assets;
    }

    @NotNull
    public final List<String> component5() {
        return this.assetPlayOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundAlertAsset() {
        return this.backgroundAlertAsset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLoopCount() {
        return this.loopCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLoopPauseInMilliSeconds() {
        return this.loopPauseInMilliSeconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final SetAlertPayload copy(@NotNull String token, @NotNull String type, @NotNull String scheduledTime, @NotNull List<AlertAsset> assets, @NotNull List<String> assetPlayOrder, @NotNull String backgroundAlertAsset, long loopCount, long loopPauseInMilliSeconds, @NotNull String label) {
        return new SetAlertPayload(token, type, scheduledTime, assets, assetPlayOrder, backgroundAlertAsset, loopCount, loopPauseInMilliSeconds, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetAlertPayload)) {
            return false;
        }
        SetAlertPayload setAlertPayload = (SetAlertPayload) other;
        return Intrinsics.areEqual(this.token, setAlertPayload.token) && Intrinsics.areEqual(this.type, setAlertPayload.type) && Intrinsics.areEqual(this.scheduledTime, setAlertPayload.scheduledTime) && Intrinsics.areEqual(this.assets, setAlertPayload.assets) && Intrinsics.areEqual(this.assetPlayOrder, setAlertPayload.assetPlayOrder) && Intrinsics.areEqual(this.backgroundAlertAsset, setAlertPayload.backgroundAlertAsset) && this.loopCount == setAlertPayload.loopCount && this.loopPauseInMilliSeconds == setAlertPayload.loopPauseInMilliSeconds && Intrinsics.areEqual(this.label, setAlertPayload.label);
    }

    @NotNull
    public final List<String> getAssetPlayOrder() {
        return this.assetPlayOrder;
    }

    @NotNull
    public final List<AlertAsset> getAssets() {
        return this.assets;
    }

    @NotNull
    public final String getBackgroundAlertAsset() {
        return this.backgroundAlertAsset;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final long getLoopCount() {
        return this.loopCount;
    }

    public final long getLoopPauseInMilliSeconds() {
        return this.loopPauseInMilliSeconds;
    }

    @NotNull
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((this.token.hashCode() * 31) + this.type.hashCode()) * 31) + this.scheduledTime.hashCode()) * 31) + this.assets.hashCode()) * 31) + this.assetPlayOrder.hashCode()) * 31) + this.backgroundAlertAsset.hashCode()) * 31) + b.a(this.loopCount)) * 31) + b.a(this.loopPauseInMilliSeconds)) * 31) + this.label.hashCode();
    }

    @NotNull
    public String toString() {
        return "SetAlertPayload(token=" + this.token + ", type=" + this.type + ", scheduledTime=" + this.scheduledTime + ", assets=" + this.assets + ", assetPlayOrder=" + this.assetPlayOrder + ", backgroundAlertAsset=" + this.backgroundAlertAsset + ", loopCount=" + this.loopCount + ", loopPauseInMilliSeconds=" + this.loopPauseInMilliSeconds + ", label=" + this.label + ')';
    }
}
