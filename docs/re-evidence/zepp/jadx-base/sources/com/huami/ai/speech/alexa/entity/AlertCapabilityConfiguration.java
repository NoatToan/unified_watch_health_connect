package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/AlertCapabilityConfiguration;", "Lcom/huami/ai/speech/alexa/entity/CapabilityConfiguration;", "Lcom/huami/ai/speech/alexa/entity/MaximumAlerts;", "component1", "maximumAlerts", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/MaximumAlerts;", "getMaximumAlerts", "()Lcom/huami/ai/speech/alexa/entity/MaximumAlerts;", "<init>", "(Lcom/huami/ai/speech/alexa/entity/MaximumAlerts;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlertCapabilityConfiguration extends CapabilityConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("maximumAlerts")
    @NotNull
    private final MaximumAlerts maximumAlerts;

    public AlertCapabilityConfiguration(@NotNull MaximumAlerts maximumAlerts) {
        super(null);
        this.maximumAlerts = maximumAlerts;
    }

    public static /* synthetic */ AlertCapabilityConfiguration copy$default(AlertCapabilityConfiguration alertCapabilityConfiguration, MaximumAlerts maximumAlerts, int i, Object obj) {
        if ((i & 1) != 0) {
            maximumAlerts = alertCapabilityConfiguration.maximumAlerts;
        }
        return alertCapabilityConfiguration.copy(maximumAlerts);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MaximumAlerts getMaximumAlerts() {
        return this.maximumAlerts;
    }

    @NotNull
    public final AlertCapabilityConfiguration copy(@NotNull MaximumAlerts maximumAlerts) {
        return new AlertCapabilityConfiguration(maximumAlerts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlertCapabilityConfiguration) && Intrinsics.areEqual(this.maximumAlerts, ((AlertCapabilityConfiguration) other).maximumAlerts);
    }

    @NotNull
    public final MaximumAlerts getMaximumAlerts() {
        return this.maximumAlerts;
    }

    public int hashCode() {
        return this.maximumAlerts.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertCapabilityConfiguration(maximumAlerts=" + this.maximumAlerts + ')';
    }
}
