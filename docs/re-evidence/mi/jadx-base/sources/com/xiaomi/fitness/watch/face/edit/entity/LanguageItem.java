package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/LanguageItem;", "", "language", "", "str", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "getStr", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageItem {

    @Nullable
    private final String language;

    @Nullable
    private final String str;

    public LanguageItem(@Nullable String str, @Nullable String str2) {
        this.language = str;
        this.str = str2;
    }

    public static /* synthetic */ LanguageItem copy$default(LanguageItem languageItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageItem.language;
        }
        if ((i & 2) != 0) {
            str2 = languageItem.str;
        }
        return languageItem.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStr() {
        return this.str;
    }

    @NotNull
    public final LanguageItem copy(@Nullable String language, @Nullable String str) {
        return new LanguageItem(language, str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageItem)) {
            return false;
        }
        LanguageItem languageItem = (LanguageItem) other;
        return Intrinsics.areEqual(this.language, languageItem.language) && Intrinsics.areEqual(this.str, languageItem.str);
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getStr() {
        return this.str;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.str;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LanguageItem(language=" + this.language + ", str=" + this.str + ")";
    }
}
