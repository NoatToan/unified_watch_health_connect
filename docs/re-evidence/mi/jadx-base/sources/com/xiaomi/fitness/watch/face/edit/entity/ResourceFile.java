package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.smarthome.setting.ServerSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/ResourceFile;", "", "name", "", "fileName", ServerSetting.SERVER_ENV_PREVIEW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getFileName", "getPreview", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResourceFile {

    @Nullable
    private final String fileName;

    @Nullable
    private final String name;

    @Nullable
    private final String preview;

    public ResourceFile(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.fileName = str2;
        this.preview = str3;
    }

    public static /* synthetic */ ResourceFile copy$default(ResourceFile resourceFile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourceFile.name;
        }
        if ((i & 2) != 0) {
            str2 = resourceFile.fileName;
        }
        if ((i & 4) != 0) {
            str3 = resourceFile.preview;
        }
        return resourceFile.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @NotNull
    public final ResourceFile copy(@Nullable String name, @Nullable String fileName, @Nullable String preview) {
        return new ResourceFile(name, fileName, preview);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFile)) {
            return false;
        }
        ResourceFile resourceFile = (ResourceFile) other;
        return Intrinsics.areEqual(this.name, resourceFile.name) && Intrinsics.areEqual(this.fileName, resourceFile.fileName) && Intrinsics.areEqual(this.preview, resourceFile.preview);
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPreview() {
        return this.preview;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preview;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResourceFile(name=" + this.name + ", fileName=" + this.fileName + ", preview=" + this.preview + ")";
    }
}
