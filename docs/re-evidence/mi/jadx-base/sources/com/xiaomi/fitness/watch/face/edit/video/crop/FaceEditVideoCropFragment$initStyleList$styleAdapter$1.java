package com.xiaomi.fitness.watch.face.edit.video.crop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class FaceEditVideoCropFragment$initStyleList$styleAdapter$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public FaceEditVideoCropFragment$initStyleList$styleAdapter$1(Object obj) {
        super(1, obj, FaceEditVideoCropFragment.class, "onStyleClick", "onStyleClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((FaceEditVideoCropFragment) this.receiver).onStyleClick(i);
    }
}
