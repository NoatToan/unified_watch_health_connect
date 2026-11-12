package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.aicr.vision.imagesegment.SegmentResult;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.hz0;
import defpackage.t5d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropManager;", "", "Lt5d;", "manager", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "", "", ServiceUtils.EXTRA_PROCESS, "doSplit", "(Lt5d;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "context", "split", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "SPLIT_START", "I", "SPLIT_DONE", "SPLIT_FAIL", "SPLIT_NOT_SUPPORT", "", "nodeTime", "J", "WAIT_FOR_CONNECT", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditPhotoCropManager {

    @NotNull
    public static final FaceEditPhotoCropManager INSTANCE = new FaceEditPhotoCropManager();
    public static final int SPLIT_DONE = 1;
    public static final int SPLIT_FAIL = 2;
    public static final int SPLIT_NOT_SUPPORT = 3;
    public static final int SPLIT_START = 0;

    @NotNull
    private static final String TAG = "FaceEditPhotoCropManager";
    private static final long WAIT_FOR_CONNECT = 3000;
    private static long nodeTime;

    private FaceEditPhotoCropManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doSplit(t5d manager, Bitmap bitmap, Function2<? super Integer, ? super Bitmap, Unit> process) throws RemoteException {
        if (!manager.isConnected() && !manager.v5(3000L)) {
            Logger.i(TAG, "wait for 3000, still not connect");
            return;
        }
        Logger.i(TAG, "cachePath: " + manager.r2());
        Logger.i(TAG, "initPersonModel: " + manager.Z4());
        SegmentResult segmentResultT3 = manager.T3(bitmap, new VisionAttribute(true, false));
        if (segmentResultT3 != null) {
            List<Bitmap> listA = segmentResultT3.a();
            Logger.i(TAG, "result size: " + listA.size());
            if (listA.size() > 0) {
                process.invoke(1, listA.get(0));
            } else {
                process.invoke(2, null);
            }
            Logger.i(TAG, "split success cost " + (System.currentTimeMillis() - nodeTime) + "ms");
        }
        manager.Y();
        manager.t5();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, t5d] */
    public final void split(@NotNull Context context, @NotNull final Bitmap bitmap, @NotNull final Function2<? super Integer, ? super Bitmap, Unit> process) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(process, "process");
        Logger.i(TAG, "try split fg");
        nodeTime = System.currentTimeMillis();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new t5d(context, new hz0() { // from class: com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropManager.split.1
            @Override // defpackage.hz0
            public void onError(int code) {
                super.onError(code);
                Logger.i(FaceEditPhotoCropManager.TAG, "service connect error: " + code);
                process.invoke(3, null);
            }

            @Override // defpackage.hz0
            public void onServiceConnected(int connectStatus) {
                super.onServiceConnected(connectStatus);
                Logger.i(FaceEditPhotoCropManager.TAG, "service connect cost: " + (System.currentTimeMillis() - FaceEditPhotoCropManager.nodeTime) + "ms");
                FaceEditPhotoCropManager.nodeTime = System.currentTimeMillis();
                process.invoke(0, null);
                AnyExtKt.io$default(null, new FaceEditPhotoCropManager$split$1$onServiceConnected$1(objectRef, bitmap, process, null), 1, null);
            }

            @Override // defpackage.hz0
            public void onServiceDisconnected() {
                super.onServiceDisconnected();
                Logger.i(FaceEditPhotoCropManager.TAG, "service disconnect");
                process.invoke(3, null);
            }
        });
    }
}
