package com.huami.watchfacesstore.usecase;

import androidx.annotation.WorkerThread;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ui.DownLoadState;
import com.huami.watchfacesstore.ui.MyDownloader;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0087\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/usecase/DownloadFaceUseCase;", "", "", "watchFaceParentPath", "watchFaceUrl", "Lkotlin/Pair;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "invoke", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DownloadFaceUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "DownloadFaceUseCase";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "watchFaceUrl: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "watchFacePath: " + this.a;
        }
    }

    @WorkerThread
    @NotNull
    public final Pair<Flow<DownLoadState>, String> invoke(@NotNull String watchFaceParentPath, @NotNull String watchFaceUrl) {
        File file = new File(watchFaceParentPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        HMLog.info(this.tag, new a(watchFaceUrl));
        String str = watchFaceParentPath + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + WatchFaceManager.INSTANCE.getDialFileName(watchFaceUrl);
        HMLog.info(this.tag, new b(str));
        return TuplesKt.to(new MyDownloader(watchFaceUrl, watchFaceParentPath).startDownLoad(), str);
    }
}
