package com.xiaomi.fitness.feedback.request;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/TagsResult;", "", "tagList", "", "Lcom/xiaomi/fitness/feedback/request/TagsResult$Tag;", "<init>", "(Ljava/util/List;)V", "getTagList", "()Ljava/util/List;", "setTagList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tag", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TagsResult {

    @SerializedName("feedback_tags_list")
    @NotNull
    private List<Tag> tagList;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/TagsResult$Tag;", "", "moduleId", "", "tags", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "<init>", "(ILjava/util/List;)V", "getModuleId", "()I", "setModuleId", "(I)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tag {

        @SerializedName(FeedbackConstants.KEY_MODULE_ID)
        private int moduleId;

        @NotNull
        private List<FeedBackModelData.FeedBackType> tags;

        public Tag(int i, @NotNull List<FeedBackModelData.FeedBackType> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.moduleId = i;
            this.tags = tags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tag copy$default(Tag tag, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tag.moduleId;
            }
            if ((i2 & 2) != 0) {
                list = tag.tags;
            }
            return tag.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getModuleId() {
            return this.moduleId;
        }

        @NotNull
        public final List<FeedBackModelData.FeedBackType> component2() {
            return this.tags;
        }

        @NotNull
        public final Tag copy(int moduleId, @NotNull List<FeedBackModelData.FeedBackType> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            return new Tag(moduleId, tags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) other;
            return this.moduleId == tag.moduleId && Intrinsics.areEqual(this.tags, tag.tags);
        }

        public final int getModuleId() {
            return this.moduleId;
        }

        @NotNull
        public final List<FeedBackModelData.FeedBackType> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (Integer.hashCode(this.moduleId) * 31) + this.tags.hashCode();
        }

        public final void setModuleId(int i) {
            this.moduleId = i;
        }

        public final void setTags(@NotNull List<FeedBackModelData.FeedBackType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tags = list;
        }

        @NotNull
        public String toString() {
            return "Tag(moduleId=" + this.moduleId + ", tags=" + this.tags + ")";
        }
    }

    public TagsResult(@NotNull List<Tag> tagList) {
        Intrinsics.checkNotNullParameter(tagList, "tagList");
        this.tagList = tagList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagsResult copy$default(TagsResult tagsResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tagsResult.tagList;
        }
        return tagsResult.copy(list);
    }

    @NotNull
    public final List<Tag> component1() {
        return this.tagList;
    }

    @NotNull
    public final TagsResult copy(@NotNull List<Tag> tagList) {
        Intrinsics.checkNotNullParameter(tagList, "tagList");
        return new TagsResult(tagList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TagsResult) && Intrinsics.areEqual(this.tagList, ((TagsResult) other).tagList);
    }

    @NotNull
    public final List<Tag> getTagList() {
        return this.tagList;
    }

    public int hashCode() {
        return this.tagList.hashCode();
    }

    public final void setTagList(@NotNull List<Tag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagList = list;
    }

    @NotNull
    public String toString() {
        return "TagsResult(tagList=" + this.tagList + ")";
    }
}
