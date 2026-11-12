package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Image;", "", "", "component1", "", "Lcom/huami/ai/speech/alexa/entity/payload/ImageSource;", "component2", "contentDescription", "sources", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getSources", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Image {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("contentDescription")
    @NotNull
    private final String contentDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("sources")
    @NotNull
    private final List<ImageSource> sources;

    /* JADX WARN: Multi-variable type inference failed */
    public Image() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Image(@NotNull String str, @NotNull List<ImageSource> list) {
        this.contentDescription = str;
        this.sources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Image copy$default(Image image, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = image.contentDescription;
        }
        if ((i & 2) != 0) {
            list = image.sources;
        }
        return image.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    public final List<ImageSource> component2() {
        return this.sources;
    }

    @NotNull
    public final Image copy(@NotNull String contentDescription, @NotNull List<ImageSource> sources) {
        return new Image(contentDescription, sources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return Intrinsics.areEqual(this.contentDescription, image.contentDescription) && Intrinsics.areEqual(this.sources, image.sources);
    }

    @NotNull
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    public final List<ImageSource> getSources() {
        return this.sources;
    }

    public int hashCode() {
        return (this.contentDescription.hashCode() * 31) + this.sources.hashCode();
    }

    @NotNull
    public String toString() {
        return "Image(contentDescription=" + this.contentDescription + ", sources=" + this.sources + ')';
    }

    public /* synthetic */ Image(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
