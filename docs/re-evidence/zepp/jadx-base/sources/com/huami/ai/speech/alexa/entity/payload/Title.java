package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Title;", "", "", "component1", "component2", "mainTitle", "subTitle", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMainTitle", "()Ljava/lang/String;", "b", "getSubTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Title {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("mainTitle")
    @NotNull
    private final String mainTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("subTitle")
    @NotNull
    private final String subTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public Title() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Title(@NotNull String str, @NotNull String str2) {
        this.mainTitle = str;
        this.subTitle = str2;
    }

    public static /* synthetic */ Title copy$default(Title title, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = title.mainTitle;
        }
        if ((i & 2) != 0) {
            str2 = title.subTitle;
        }
        return title.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final Title copy(@NotNull String mainTitle, @NotNull String subTitle) {
        return new Title(mainTitle, subTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Title)) {
            return false;
        }
        Title title = (Title) other;
        return Intrinsics.areEqual(this.mainTitle, title.mainTitle) && Intrinsics.areEqual(this.subTitle, title.subTitle);
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        return (this.mainTitle.hashCode() * 31) + this.subTitle.hashCode();
    }

    @NotNull
    public String toString() {
        return "Title(mainTitle=" + this.mainTitle + ", subTitle=" + this.subTitle + ')';
    }

    public /* synthetic */ Title(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
