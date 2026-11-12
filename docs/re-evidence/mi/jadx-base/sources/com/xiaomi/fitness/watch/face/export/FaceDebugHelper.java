package com.xiaomi.fitness.watch.face.export;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u000bH¦@¢\u0006\u0002\u0010\rJ4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\u000bH&¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceDebugHelper;", "", "gotoFaceFragment", "", "resizeFace", "resize", "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "requestDownloadUrl", "id", "", "result", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doDownloadFace", "url", "filePath", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "Companion", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceDebugHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceDebugHelper$Companion;", "", "<init>", "()V", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void doDownloadFace(@NotNull String url, @NotNull String filePath, @NotNull Function2<? super Integer, ? super String, Unit> progress);

    void gotoFaceFragment();

    @Nullable
    Object requestDownloadUrl(@NotNull String str, @NotNull Function2<? super FaceDownloadResultV2, ? super String, Unit> function2, @NotNull Continuation<? super Unit> continuation);

    void resizeFace(@Nullable Product.Size resize);
}
