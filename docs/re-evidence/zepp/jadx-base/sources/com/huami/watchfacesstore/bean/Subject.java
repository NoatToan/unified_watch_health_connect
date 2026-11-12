package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, d2 = {"Lcom/huami/watchfacesstore/bean/Subject;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "describe", "image", "mode", "sub_title", "target", "title", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDescribe", "()Ljava/lang/String;", "getImage", LogUtil.I, "getMode", "()I", "getSub_title", "getTarget", "getTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Subject {

    @NotNull
    private final String describe;

    @NotNull
    private final String image;
    private final int mode;

    @NotNull
    private final String sub_title;

    @NotNull
    private final String target;

    @NotNull
    private final String title;

    public Subject(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.describe = str;
        this.image = str2;
        this.mode = i;
        this.sub_title = str3;
        this.target = str4;
        this.title = str5;
    }

    public static /* synthetic */ Subject copy$default(Subject subject, String str, String str2, int i, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subject.describe;
        }
        if ((i2 & 2) != 0) {
            str2 = subject.image;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            i = subject.mode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = subject.sub_title;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = subject.target;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = subject.title;
        }
        return subject.copy(str, str6, i3, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSub_title() {
        return this.sub_title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Subject copy(@NotNull String describe, @NotNull String image, int mode, @NotNull String sub_title, @NotNull String target, @NotNull String title) {
        return new Subject(describe, image, mode, sub_title, target, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subject)) {
            return false;
        }
        Subject subject = (Subject) other;
        return Intrinsics.areEqual(this.describe, subject.describe) && Intrinsics.areEqual(this.image, subject.image) && this.mode == subject.mode && Intrinsics.areEqual(this.sub_title, subject.sub_title) && Intrinsics.areEqual(this.target, subject.target) && Intrinsics.areEqual(this.title, subject.title);
    }

    @NotNull
    public final String getDescribe() {
        return this.describe;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getSub_title() {
        return this.sub_title;
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.describe.hashCode() * 31) + this.image.hashCode()) * 31) + this.mode) * 31) + this.sub_title.hashCode()) * 31) + this.target.hashCode()) * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "Subject(describe=" + this.describe + ", image=" + this.image + ", mode=" + this.mode + ", sub_title=" + this.sub_title + ", target=" + this.target + ", title=" + this.title + ")";
    }
}
