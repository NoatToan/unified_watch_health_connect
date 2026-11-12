package com.xiaomi.fitness.watch.face.edit.style;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import defpackage.h29;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "", "index", "", "onStyleSelect", "(I)V", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditThemeListData;", "data", "setStyleList", "(Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditThemeListData;)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/edit/style/OnStyleSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnStyleSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "Lh29;", "binding", "Lh29;", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter;", "onStyleSelectListener", "Lkotlin/jvm/functions/Function1;", "", "isTablet", "<init>", "(Lh29;Z)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditStyleHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final h29 binding;

    @NotNull
    private final FaceEditStyleItemAdapter mAdapter;

    @Nullable
    private Function1<? super Integer, Unit> onStyleSelectListener;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.style.FaceEditStyleHolder$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, FaceEditStyleHolder.class, "onStyleSelect", "onStyleSelect(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((FaceEditStyleHolder) this.receiver).onStyleSelect(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditStyleHolder(@NotNull h29 binding, boolean z) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        binding.A.setLayoutManager(new GridLayoutManager((Context) ApplicationExtKt.getApplication(), z ? 6 : 3, 1, false));
        binding.A.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.watch.face.edit.style.FaceEditStyleHolder.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setCollectionInfo(null);
            }
        });
        FaceEditStyleItemAdapter faceEditStyleItemAdapter = new FaceEditStyleItemAdapter(new AnonymousClass2(this));
        this.mAdapter = faceEditStyleItemAdapter;
        binding.A.setAdapter(faceEditStyleItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStyleSelect(int index) {
        Function1<? super Integer, Unit> function1 = this.onStyleSelectListener;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(index));
        }
    }

    public final void setOnStyleSelectListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onStyleSelectListener = listener;
    }

    public final void setStyleList(@NotNull FaceEditThemeListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mAdapter.setStyleList(data);
        ViewGroup.LayoutParams layoutParams = this.binding.getRoot().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (data.getIsFirstData()) {
            TextView title = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            ViewExtKt.gone(title);
            marginLayoutParams.topMargin = 0;
        } else {
            TextView title2 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            ViewExtKt.visible(title2);
            this.binding.B.setText(data.getTitle());
            marginLayoutParams.topMargin = ExtUtilsKt.getDp(25);
        }
        this.binding.getRoot().setLayoutParams(marginLayoutParams);
    }
}
