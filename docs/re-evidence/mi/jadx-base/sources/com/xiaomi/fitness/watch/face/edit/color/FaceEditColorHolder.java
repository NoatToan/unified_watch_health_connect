package com.xiaomi.fitness.watch.face.edit.color;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import defpackage.f19;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", "index", "", "onColorGroupSelect", "(I)V", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorGroupListData;", "data", "setColorGroupList", "(Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorGroupListData;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/color/OnColorGroupSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnColorGroupSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lf19;", "binding", "Lf19;", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter;", "onColorGroupSelectListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lf19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditColorHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final f19 binding;

    @NotNull
    private final FaceEditColorItemAdapter mAdapter;

    @Nullable
    private Function1<? super Integer, Unit> onColorGroupSelectListener;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.color.FaceEditColorHolder$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, FaceEditColorHolder.class, "onColorGroupSelect", "onColorGroupSelect(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditColorHolder) this.receiver).onColorGroupSelect(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditColorHolder(@NotNull f19 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(ApplicationExtKt.getApplication());
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        flexboxLayoutManager.R(4);
        binding.A.setLayoutManager(flexboxLayoutManager);
        binding.A.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.watch.face.edit.color.FaceEditColorHolder.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setCollectionInfo(null);
            }
        });
        FaceEditColorItemAdapter faceEditColorItemAdapter = new FaceEditColorItemAdapter(new AnonymousClass2(this));
        this.mAdapter = faceEditColorItemAdapter;
        binding.A.setAdapter(faceEditColorItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onColorGroupSelect(int index) {
        Function1<? super Integer, Unit> function1 = this.onColorGroupSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    public final void setColorGroupList(@NotNull FaceEditColorGroupListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mAdapter.setColorList(data);
    }

    public final void setOnColorGroupSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onColorGroupSelectListener = listener;
    }
}
