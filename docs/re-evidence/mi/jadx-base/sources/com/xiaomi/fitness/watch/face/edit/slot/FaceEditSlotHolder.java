package com.xiaomi.fitness.watch.face.edit.slot;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import defpackage.z19;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", "index", "", "onFaceEditSlotClick", "(I)V", "Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotListData;", "data", "setSlotList", "(Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotListData;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/slot/OnFaceEditSlotClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFaceEditSlotClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lz19;", "binding", "Lz19;", "Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter;", "slotAdapter", "Lcom/xiaomi/fitness/watch/face/edit/slot/FaceEditSlotItemAdapter;", "onFaceEditSlotClickListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lz19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditSlotHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final z19 binding;

    @Nullable
    private Function1<? super Integer, Unit> onFaceEditSlotClickListener;

    @NotNull
    private final FaceEditSlotItemAdapter slotAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.slot.FaceEditSlotHolder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, FaceEditSlotHolder.class, "onFaceEditSlotClick", "onFaceEditSlotClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditSlotHolder) this.receiver).onFaceEditSlotClick(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditSlotHolder(@NotNull z19 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        binding.A.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 1, false));
        FaceEditSlotItemAdapter faceEditSlotItemAdapter = new FaceEditSlotItemAdapter(new AnonymousClass1(this));
        this.slotAdapter = faceEditSlotItemAdapter;
        binding.A.setAdapter(faceEditSlotItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFaceEditSlotClick(int index) {
        Function1<? super Integer, Unit> function1 = this.onFaceEditSlotClickListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    public final void setOnFaceEditSlotClickListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onFaceEditSlotClickListener = listener;
    }

    public final void setSlotList(@NotNull FaceEditSlotListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.binding.B.setText(data.getTitle());
        this.slotAdapter.setData(data.getSlotWidgetList());
    }
}
