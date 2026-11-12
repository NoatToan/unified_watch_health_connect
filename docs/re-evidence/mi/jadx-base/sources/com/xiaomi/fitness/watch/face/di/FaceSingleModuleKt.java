package com.xiaomi.fitness.watch.face.di;

import com.xiaomi.fitness.watch.face.di.FaceSingleModuleKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"faceTabContentItem", "Lcom/xiaomi/fitness/watch/face/di/FaceTabContentItem;", "getFaceTabContentItem", "()Lcom/xiaomi/fitness/watch/face/di/FaceTabContentItem;", "faceTabContentItem$delegate", "Lkotlin/Lazy;", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceSingleModuleKt {

    @NotNull
    private static final Lazy faceTabContentItem$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p59
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceSingleModuleKt.faceTabContentItem_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceTabContentItem faceTabContentItem_delegate$lambda$0() {
        return new FaceTabContentItem();
    }

    @NotNull
    public static final FaceTabContentItem getFaceTabContentItem() {
        return (FaceTabContentItem) faceTabContentItem$delegate.getValue();
    }
}
