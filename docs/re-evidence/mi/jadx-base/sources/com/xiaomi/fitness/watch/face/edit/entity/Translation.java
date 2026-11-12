package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Translation;", "", "name", "", "languageList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/LanguageItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getLanguageList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Translation {

    @NotNull
    private final List<LanguageItem> languageList;

    @Nullable
    private final String name;

    public Translation(@Nullable String str, @NotNull List<LanguageItem> languageList) {
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        this.name = str;
        this.languageList = languageList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Translation copy$default(Translation translation, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translation.name;
        }
        if ((i & 2) != 0) {
            list = translation.languageList;
        }
        return translation.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<LanguageItem> component2() {
        return this.languageList;
    }

    @NotNull
    public final Translation copy(@Nullable String name, @NotNull List<LanguageItem> languageList) {
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        return new Translation(name, languageList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) other;
        return Intrinsics.areEqual(this.name, translation.name) && Intrinsics.areEqual(this.languageList, translation.languageList);
    }

    @NotNull
    public final List<LanguageItem> getLanguageList() {
        return this.languageList;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.languageList.hashCode();
    }

    @NotNull
    public String toString() {
        return "Translation(name=" + this.name + ", languageList=" + this.languageList + ")";
    }
}
