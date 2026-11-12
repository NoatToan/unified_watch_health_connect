package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0002\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0003\u001a\u00020\u00018\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Links;", "", "component1", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getNext", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Links {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("next")
    @NotNull
    private final Object next;

    public Links(@NotNull Object obj) {
        this.next = obj;
    }

    public static /* synthetic */ Links copy$default(Links links, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = links.next;
        }
        return links.copy(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    @NotNull
    public final Links copy(@NotNull Object next) {
        return new Links(next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Links) && Intrinsics.areEqual(this.next, ((Links) other).next);
    }

    @NotNull
    public final Object getNext() {
        return this.next;
    }

    public int hashCode() {
        return this.next.hashCode();
    }

    @NotNull
    public String toString() {
        return "Links(next=" + this.next + ')';
    }
}
