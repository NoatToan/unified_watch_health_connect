package com.xiaomi.fitness.watch.face.edit.position;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import defpackage.x19;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", "index", "", "onPositionSelect", "(I)V", "Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionListData;", "data", "setPositionList", "(Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionListData;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/position/OnPositionSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setonPositionSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lx19;", "binding", "Lx19;", "Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/edit/position/FaceEditPositionItemAdapter;", "onPositionSelectListener", "Lkotlin/jvm/functions/Function1;", "", "isTablet", "<init>", "(Lx19;Z)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditPositionHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final x19 binding;

    @NotNull
    private final FaceEditPositionItemAdapter mAdapter;

    @Nullable
    private Function1<? super Integer, Unit> onPositionSelectListener;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionHolder$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, FaceEditPositionHolder.class, "onPositionSelect", "onPositionSelect(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditPositionHolder) this.receiver).onPositionSelect(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditPositionHolder(@NotNull x19 binding, boolean z) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        binding.A.setLayoutManager(new GridLayoutManager((Context) ApplicationExtKt.getApplication(), z ? 6 : 3, 1, false));
        binding.A.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.watch.face.edit.position.FaceEditPositionHolder.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setCollectionInfo(null);
            }
        });
        FaceEditPositionItemAdapter faceEditPositionItemAdapter = new FaceEditPositionItemAdapter(new AnonymousClass2(this));
        this.mAdapter = faceEditPositionItemAdapter;
        binding.A.setAdapter(faceEditPositionItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPositionSelect(int index) {
        Function1<? super Integer, Unit> function1 = this.onPositionSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    public final void setPositionList(@NotNull FaceEditPositionListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.binding.B.setText(data.getTitle());
        this.mAdapter.setPositionList(data);
    }

    public final void setonPositionSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPositionSelectListener = listener;
    }
}
