package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BW\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\nHÆ\u0003Jp\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b$\u0010#R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b%\u0010#R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\fR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b)\u0010#R\u0019\u0010\u0016\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/watchfacesstore/bean/Topic;", "", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Integer;", "component7", "component8", "data", "type", "name", "title", "image", "mode", "target", "id", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;I)Lcom/huami/watchfacesstore/bean/Topic;", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getName", "getTitle", "getImage", "Ljava/lang/Integer;", "getMode", "getTarget", LogUtil.I, "getId", "()I", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;I)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Topic {

    @NotNull
    public static final String COOL_SPECIAL = "collection";

    @NotNull
    public static final String TODAY_RECOMMEND = "single";

    @NotNull
    private final List<WatchData> data;
    private final int id;

    @Nullable
    private final String image;

    @Nullable
    private final Integer mode;

    @Nullable
    private final String name;

    @Nullable
    private final String target;

    @Nullable
    private final String title;

    @NotNull
    private final String type;

    public Topic(@NotNull List<WatchData> list, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5, int i) {
        this.data = list;
        this.type = str;
        this.name = str2;
        this.title = str3;
        this.image = str4;
        this.mode = num;
        this.target = str5;
        this.id = i;
    }

    @NotNull
    public final List<WatchData> component1() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Topic copy(@NotNull List<WatchData> data, @NotNull String type, @Nullable String name, @Nullable String title, @Nullable String image, @Nullable Integer mode, @Nullable String target, int id) {
        return new Topic(data, type, name, title, image, mode, target, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) other;
        return Intrinsics.areEqual(this.data, topic.data) && Intrinsics.areEqual(this.type, topic.type) && Intrinsics.areEqual(this.name, topic.name) && Intrinsics.areEqual(this.title, topic.title) && Intrinsics.areEqual(this.image, topic.image) && Intrinsics.areEqual(this.mode, topic.mode) && Intrinsics.areEqual(this.target, topic.target) && this.id == topic.id;
    }

    @NotNull
    public final List<WatchData> getData() {
        return this.data;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final Integer getMode() {
        return this.mode;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.data.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.mode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.target;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.id;
    }

    @NotNull
    public String toString() {
        return "Topic(data=" + this.data + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", image=" + this.image + ", mode=" + this.mode + ", target=" + this.target + ", id=" + this.id + ")";
    }
}
