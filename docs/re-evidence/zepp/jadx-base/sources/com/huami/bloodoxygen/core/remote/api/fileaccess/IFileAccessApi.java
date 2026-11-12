package com.huami.bloodoxygen.core.remote.api.fileaccess;

import com.huami.snore.ui.fragment.SnoreListFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/IFileAccessApi;", "", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileInfoEntity;", "fileInfoEntity", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileUrlEntity;", "getFileInfo", "", "putUrl", "filePath", "", SnoreListFragment.TYPE_UPLOAD, "core_release"}, k = 1, mv = {1, 5, 1})
public interface IFileAccessApi {
    @Nullable
    FileUrlEntity getFileInfo(@NotNull FileInfoEntity fileInfoEntity);

    boolean upload(@NotNull String putUrl, @NotNull String filePath);
}
