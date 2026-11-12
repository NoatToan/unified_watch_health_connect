package com.xiaomi.fitness.medal.export.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "", "result", "", "<init>", "(Z)V", "getResult", "()Z", "toString", "", "component1", "copy", "equals", "other", "hashCode", "", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalAssistResult {
    private final boolean result;

    public MedalAssistResult(boolean z) {
        this.result = z;
    }

    public static /* synthetic */ MedalAssistResult copy$default(MedalAssistResult medalAssistResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = medalAssistResult.result;
        }
        return medalAssistResult.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public final MedalAssistResult copy(boolean result) {
        return new MedalAssistResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MedalAssistResult) && this.result == ((MedalAssistResult) other).result;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return Boolean.hashCode(this.result);
    }

    @NotNull
    public String toString() {
        return "MedalAssistResult(result=" + this.result + ")";
    }
}
