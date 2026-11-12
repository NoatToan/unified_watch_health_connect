package com.xiaomi.fitness.watch.face.edit.font;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import defpackage.l19;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00042\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u00042\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u0011¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR*\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", "index", "", "onFaceEditFontStyleSelectListener", "(I)V", "onFaceEditFontColorSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontListData;", "fontListData", "setFontList", "(Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontListData;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontStyleSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFaceEditFontStyleSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontColorSelectListener;", "setOnFaceEditFontColorSelectListener", "Ll19;", "binding", "Ll19;", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter;", "fontStyleAdapter", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter;", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter;", "fontColorAdapter", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontColorItemAdapter;", "Lkotlin/jvm/functions/Function1;", "<init>", "(Ll19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditFontHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final l19 binding;

    @NotNull
    private final FaceEditFontColorItemAdapter fontColorAdapter;

    @NotNull
    private final FaceEditFontStyleItemAdapter fontStyleAdapter;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontColorSelectListener;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditFontStyleSelectListener;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.font.FaceEditFontHolder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, FaceEditFontHolder.class, "onFaceEditFontStyleSelectListener", "onFaceEditFontStyleSelectListener(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditFontHolder) this.receiver).onFaceEditFontStyleSelectListener(i);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.font.FaceEditFontHolder$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, FaceEditFontHolder.class, "onFaceEditFontColorSelectListener", "onFaceEditFontColorSelectListener(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditFontHolder) this.receiver).onFaceEditFontColorSelectListener(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditFontHolder(@NotNull l19 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        binding.B.setLayoutManager(new GridLayoutManager((Context) ApplicationExtKt.getApplication(), 3, 1, false));
        FaceEditFontStyleItemAdapter faceEditFontStyleItemAdapter = new FaceEditFontStyleItemAdapter(new AnonymousClass1(this));
        this.fontStyleAdapter = faceEditFontStyleItemAdapter;
        binding.B.setAdapter(faceEditFontStyleItemAdapter);
        binding.A.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        FaceEditFontColorItemAdapter faceEditFontColorItemAdapter = new FaceEditFontColorItemAdapter(new AnonymousClass2(this));
        this.fontColorAdapter = faceEditFontColorItemAdapter;
        binding.A.setAdapter(faceEditFontColorItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFaceEditFontColorSelectListener(int index) {
        Function1<? super Integer, Unit> function1 = this.onFaceEditFontColorSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFaceEditFontStyleSelectListener(int index) {
        Function1<? super Integer, Unit> function1 = this.onFaceEditFontStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    public final void setFontList(@NotNull FaceEditFontListData fontListData) {
        Intrinsics.checkNotNullParameter(fontListData, "fontListData");
        this.fontStyleAdapter.setFontStyle(fontListData);
    }

    public final void setOnFaceEditFontColorSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditFontColorSelectListener = listener;
    }

    public final void setOnFaceEditFontStyleSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditFontStyleSelectListener = listener;
    }
}
