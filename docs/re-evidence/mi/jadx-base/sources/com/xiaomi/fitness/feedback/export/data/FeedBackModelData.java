package com.xiaomi.fitness.feedback.export.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010=\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR \u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001e\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001c\u0010:\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000f¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "", "<init>", "()V", "platform", "", "getPlatform", "()I", "setPlatform", "(I)V", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "model", "getModel", "setModel", "version_code", "", "getVersion_code", "()J", "setVersion_code", "(J)V", "version_name", "getVersion_name", "setVersion_name", "tags", "", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", MiuiCursorConstants.CONTENT, "getContent", "setContent", "logfile", "getLogfile", "setLogfile", "fw_version", "getFw_version", "setFw_version", "mi_wide_tag_id", "getMi_wide_tag_id", "setMi_wide_tag_id", "mi_tag_id", "getMi_tag_id", "setMi_tag_id", "contact", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$Contact;", "getContact", "()Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$Contact;", "setContact", "(Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$Contact;)V", FeedbackConstants.KEY_MODULE_ID, "getModule_id", "setModule_id", "region", "getRegion", "setRegion", "toString", "Contact", "FeedBackType", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedBackModelData {

    @Nullable
    private Contact contact;

    @Nullable
    private String content;

    @Nullable
    private String did;

    @SerializedName("fw_version")
    @Nullable
    private String fw_version;

    @Nullable
    private String logfile;

    @SerializedName("mi_tag_id")
    private int mi_tag_id;

    @SerializedName("mi_wide_tag_id")
    private int mi_wide_tag_id;

    @Nullable
    private String model;

    @Nullable
    private String region;

    @Nullable
    private List<String> tags;

    @SerializedName("version_code")
    private long version_code;

    @SerializedName("version_name")
    @Nullable
    private String version_name;
    private int platform = 1;

    @SerializedName(FeedbackConstants.KEY_MODULE_ID)
    private int module_id = 239;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$Contact;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "email", "getEmail", "setEmail", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Contact {

        @Nullable
        private String email;

        @Nullable
        private String name;

        @Nullable
        private String phone;

        @Nullable
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        public final void setEmail(@Nullable String str) {
            this.email = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPhone(@Nullable String str) {
            this.phone = str;
        }
    }

    @Nullable
    public final Contact getContact() {
        return this.contact;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getFw_version() {
        return this.fw_version;
    }

    @Nullable
    public final String getLogfile() {
        return this.logfile;
    }

    public final int getMi_tag_id() {
        return this.mi_tag_id;
    }

    public final int getMi_wide_tag_id() {
        return this.mi_wide_tag_id;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    public final int getModule_id() {
        return this.module_id;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    public final long getVersion_code() {
        return this.version_code;
    }

    @Nullable
    public final String getVersion_name() {
        return this.version_name;
    }

    public final void setContact(@Nullable Contact contact) {
        this.contact = contact;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setFw_version(@Nullable String str) {
        this.fw_version = str;
    }

    public final void setLogfile(@Nullable String str) {
        this.logfile = str;
    }

    public final void setMi_tag_id(int i) {
        this.mi_tag_id = i;
    }

    public final void setMi_wide_tag_id(int i) {
        this.mi_wide_tag_id = i;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setModule_id(int i) {
        this.module_id = i;
    }

    public final void setPlatform(int i) {
        this.platform = i;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setTags(@Nullable List<String> list) {
        this.tags = list;
    }

    public final void setVersion_code(long j) {
        this.version_code = j;
    }

    public final void setVersion_name(@Nullable String str) {
        this.version_name = str;
    }

    @NotNull
    public String toString() {
        return "FeedBackModelData(platform=" + this.platform + ", did=" + this.did + ", model=" + this.model + ", version_code=" + this.version_code + ", version_name=" + this.version_name + ", tags=" + this.tags + ", content=" + this.content + ", logfile=" + this.logfile + ", fw_version=" + this.fw_version + ", mi_wide_tag_id=" + this.mi_wide_tag_id + ", mi_tag_id=" + this.mi_tag_id + ", contact=" + this.contact + ", module_id=" + this.module_id + ")";
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "Ljava/io/Serializable;", "wideTagId", "", "wideTagContent", "", "tagList", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "category", "subCategory", "model", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWideTagId", "()I", "setWideTagId", "(I)V", "getWideTagContent", "()Ljava/lang/String;", "setWideTagContent", "(Ljava/lang/String;)V", "getTagList", "()Ljava/util/List;", "setTagList", "(Ljava/util/List;)V", "getCategory", "setCategory", "getSubCategory", "setSubCategory", "getModel", "setModel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "SubTypeItem", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeedBackType implements Serializable {

        @SerializedName("hlth_category")
        @Nullable
        private String category;

        @Nullable
        private String model;

        @SerializedName("hlth_subcategory")
        @Nullable
        private String subCategory;

        @Nullable
        private List<SubTypeItem> tagList;

        @NotNull
        private String wideTagContent;
        private int wideTagId;

        public FeedBackType(int i, @NotNull String wideTagContent, @Nullable List<SubTypeItem> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(wideTagContent, "wideTagContent");
            this.wideTagId = i;
            this.wideTagContent = wideTagContent;
            this.tagList = list;
            this.category = str;
            this.subCategory = str2;
            this.model = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeedBackType copy$default(FeedBackType feedBackType, int i, String str, List list, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = feedBackType.wideTagId;
            }
            if ((i2 & 2) != 0) {
                str = feedBackType.wideTagContent;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                list = feedBackType.tagList;
            }
            List list2 = list;
            if ((i2 & 8) != 0) {
                str2 = feedBackType.category;
            }
            String str6 = str2;
            if ((i2 & 16) != 0) {
                str3 = feedBackType.subCategory;
            }
            String str7 = str3;
            if ((i2 & 32) != 0) {
                str4 = feedBackType.model;
            }
            return feedBackType.copy(i, str5, list2, str6, str7, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWideTagId() {
            return this.wideTagId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWideTagContent() {
            return this.wideTagContent;
        }

        @Nullable
        public final List<SubTypeItem> component3() {
            return this.tagList;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSubCategory() {
            return this.subCategory;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        @NotNull
        public final FeedBackType copy(int wideTagId, @NotNull String wideTagContent, @Nullable List<SubTypeItem> tagList, @Nullable String category, @Nullable String subCategory, @Nullable String model) {
            Intrinsics.checkNotNullParameter(wideTagContent, "wideTagContent");
            return new FeedBackType(wideTagId, wideTagContent, tagList, category, subCategory, model);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedBackType)) {
                return false;
            }
            FeedBackType feedBackType = (FeedBackType) other;
            return this.wideTagId == feedBackType.wideTagId && Intrinsics.areEqual(this.wideTagContent, feedBackType.wideTagContent) && Intrinsics.areEqual(this.tagList, feedBackType.tagList) && Intrinsics.areEqual(this.category, feedBackType.category) && Intrinsics.areEqual(this.subCategory, feedBackType.subCategory) && Intrinsics.areEqual(this.model, feedBackType.model);
        }

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        public final String getModel() {
            return this.model;
        }

        @Nullable
        public final String getSubCategory() {
            return this.subCategory;
        }

        @Nullable
        public final List<SubTypeItem> getTagList() {
            return this.tagList;
        }

        @NotNull
        public final String getWideTagContent() {
            return this.wideTagContent;
        }

        public final int getWideTagId() {
            return this.wideTagId;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.wideTagId) * 31) + this.wideTagContent.hashCode()) * 31;
            List<SubTypeItem> list = this.tagList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.category;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subCategory;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.model;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setModel(@Nullable String str) {
            this.model = str;
        }

        public final void setSubCategory(@Nullable String str) {
            this.subCategory = str;
        }

        public final void setTagList(@Nullable List<SubTypeItem> list) {
            this.tagList = list;
        }

        public final void setWideTagContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.wideTagContent = str;
        }

        public final void setWideTagId(int i) {
            this.wideTagId = i;
        }

        @NotNull
        public String toString() {
            return "FeedBackType(wideTagId=" + this.wideTagId + ", wideTagContent=" + this.wideTagContent + ", tagList=" + this.tagList + ", category=" + this.category + ", subCategory=" + this.subCategory + ", model=" + this.model + ")";
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "Ljava/io/Serializable;", "tagId", "", "showContent", "", "hasFaq", "", "<init>", "(ILjava/lang/String;Z)V", "getTagId", "()I", "setTagId", "(I)V", "getShowContent", "()Ljava/lang/String;", "setShowContent", "(Ljava/lang/String;)V", "getHasFaq", "()Z", "setHasFaq", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubTypeItem implements Serializable {

            @SerializedName("has_faq")
            private boolean hasFaq;

            @NotNull
            private String showContent;
            private int tagId;

            public SubTypeItem(int i, @NotNull String showContent, boolean z) {
                Intrinsics.checkNotNullParameter(showContent, "showContent");
                this.tagId = i;
                this.showContent = showContent;
                this.hasFaq = z;
            }

            public static /* synthetic */ SubTypeItem copy$default(SubTypeItem subTypeItem, int i, String str, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = subTypeItem.tagId;
                }
                if ((i2 & 2) != 0) {
                    str = subTypeItem.showContent;
                }
                if ((i2 & 4) != 0) {
                    z = subTypeItem.hasFaq;
                }
                return subTypeItem.copy(i, str, z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getTagId() {
                return this.tagId;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getShowContent() {
                return this.showContent;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getHasFaq() {
                return this.hasFaq;
            }

            @NotNull
            public final SubTypeItem copy(int tagId, @NotNull String showContent, boolean hasFaq) {
                Intrinsics.checkNotNullParameter(showContent, "showContent");
                return new SubTypeItem(tagId, showContent, hasFaq);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubTypeItem)) {
                    return false;
                }
                SubTypeItem subTypeItem = (SubTypeItem) other;
                return this.tagId == subTypeItem.tagId && Intrinsics.areEqual(this.showContent, subTypeItem.showContent) && this.hasFaq == subTypeItem.hasFaq;
            }

            public final boolean getHasFaq() {
                return this.hasFaq;
            }

            @NotNull
            public final String getShowContent() {
                return this.showContent;
            }

            public final int getTagId() {
                return this.tagId;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.tagId) * 31) + this.showContent.hashCode()) * 31) + Boolean.hashCode(this.hasFaq);
            }

            public final void setHasFaq(boolean z) {
                this.hasFaq = z;
            }

            public final void setShowContent(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.showContent = str;
            }

            public final void setTagId(int i) {
                this.tagId = i;
            }

            @NotNull
            public String toString() {
                return "SubTypeItem(tagId=" + this.tagId + ", showContent=" + this.showContent + ", hasFaq=" + this.hasFaq + ")";
            }

            public /* synthetic */ SubTypeItem(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? false : z);
            }
        }

        public /* synthetic */ FeedBackType(int i, String str, List list, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
        }
    }
}
