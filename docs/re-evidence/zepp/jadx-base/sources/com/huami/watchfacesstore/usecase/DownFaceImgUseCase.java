package com.huami.watchfacesstore.usecase;

import androidx.annotation.WorkerThread;
import com.huami.watchfacesstore.ui.DownLoadState;
import com.huami.watchfacesstore.ui.MyDownloader;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0087\u0002R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/watchfacesstore/usecase/DownFaceImgUseCase;", "", "", "watchFaceParentPath", "url", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "invoke", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DownFaceImgUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "DownFaceImgUseCase";

    @WorkerThread
    @NotNull
    public final Flow<DownLoadState> invoke(@NotNull String watchFaceParentPath, @NotNull String url) {
        return new MyDownloader(url, watchFaceParentPath).startDownLoad();
    }
}
