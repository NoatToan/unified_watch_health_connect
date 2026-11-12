package com.huami.ai.speech.alexa.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Alarms;", "", "", "Lcom/huami/ai/speech/alexa/entity/Alarm;", "component1", "Lcom/huami/ai/speech/alexa/entity/Links;", "component2", "", "component3", "alarms", "links", "totalCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getAlarms", "()Ljava/util/List;", "b", "Lcom/huami/ai/speech/alexa/entity/Links;", "getLinks", "()Lcom/huami/ai/speech/alexa/entity/Links;", "c", LogUtil.I, "getTotalCount", "()I", "<init>", "(Ljava/util/List;Lcom/huami/ai/speech/alexa/entity/Links;I)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Alarms {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("alarms")
    @NotNull
    private final List<Alarm> alarms;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("links")
    @NotNull
    private final Links links;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("totalCount")
    private final int totalCount;

    public Alarms(@NotNull List<Alarm> list, @NotNull Links links, int i) {
        this.alarms = list;
        this.links = links;
        this.totalCount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Alarms copy$default(Alarms alarms, List list, Links links, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = alarms.alarms;
        }
        if ((i2 & 2) != 0) {
            links = alarms.links;
        }
        if ((i2 & 4) != 0) {
            i = alarms.totalCount;
        }
        return alarms.copy(list, links, i);
    }

    @NotNull
    public final List<Alarm> component1() {
        return this.alarms;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final Alarms copy(@NotNull List<Alarm> alarms, @NotNull Links links, int totalCount) {
        return new Alarms(alarms, links, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alarms)) {
            return false;
        }
        Alarms alarms = (Alarms) other;
        return Intrinsics.areEqual(this.alarms, alarms.alarms) && Intrinsics.areEqual(this.links, alarms.links) && this.totalCount == alarms.totalCount;
    }

    @NotNull
    public final List<Alarm> getAlarms() {
        return this.alarms;
    }

    @NotNull
    public final Links getLinks() {
        return this.links;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (((this.alarms.hashCode() * 31) + this.links.hashCode()) * 31) + this.totalCount;
    }

    @NotNull
    public String toString() {
        return "Alarms(alarms=" + this.alarms + ", links=" + this.links + ", totalCount=" + this.totalCount + ')';
    }
}
