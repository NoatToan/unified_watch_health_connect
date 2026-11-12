package com.xiaomi.fitness.watch.face.edit.text;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseHolder;
import com.xiaomi.fitness.watch.face.export.data.FaceEditLiteralBean;
import defpackage.n29;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\u00020\u00072\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR6\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextHolder;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseHolder;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;", "textEditItem", "", "", "editTextList", "", "onSelect", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;Ljava/util/List;)V", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextListData;", "data", "setTextList", "(Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextListData;)V", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/edit/text/OnTextChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "Ln29;", "binding", "Ln29;", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextItemAdapter;", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "onTextChangeListener", "Lkotlin/jvm/functions/Function2;", "<init>", "(Ln29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditTextHolder extends FaceEditPickerBaseHolder {

    @NotNull
    private final n29 binding;

    @NotNull
    private final FaceEditTextItemAdapter mAdapter;

    @Nullable
    private l mItemTouchHelper;

    @Nullable
    private Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> onTextChangeListener;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextHolder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<FaceEditLiteralBean, List<? extends String>, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, FaceEditTextHolder.class, "onSelect", "onSelect(Lcom/xiaomi/fitness/watch/face/export/data/FaceEditLiteralBean;Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FaceEditLiteralBean faceEditLiteralBean, List<? extends String> list) {
            invoke2(faceEditLiteralBean, (List<String>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FaceEditLiteralBean p0, List<String> p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((FaceEditTextHolder) this.receiver).onSelect(p0, p1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FaceEditTextHolder(@NotNull n29 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        FaceEditTextItemAdapter faceEditTextItemAdapter = new FaceEditTextItemAdapter(new AnonymousClass1(this), new FaceEditTextDragListener() { // from class: com.xiaomi.fitness.watch.face.edit.text.FaceEditTextHolder.2
            @Override // com.xiaomi.fitness.watch.face.edit.text.FaceEditTextDragListener
            public void onDragOver() {
            }

            @Override // com.xiaomi.fitness.watch.face.edit.text.FaceEditTextDragListener
            public void startDragItem(RecyclerView.d0 holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                l lVar = FaceEditTextHolder.this.mItemTouchHelper;
                if (lVar != null) {
                    lVar.x(holder);
                }
            }
        });
        this.mAdapter = faceEditTextItemAdapter;
        l lVar = new l(faceEditTextItemAdapter.getItemTouchHelperCallback());
        this.mItemTouchHelper = lVar;
        lVar.d(binding.A);
        binding.A.setAdapter(faceEditTextItemAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelect(FaceEditLiteralBean textEditItem, List<String> editTextList) {
        Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> function2 = this.onTextChangeListener;
        if (function2 != null) {
            function2.invoke(textEditItem, editTextList);
        }
    }

    public final void setOnTextChangeListener(@NotNull Function2<? super FaceEditLiteralBean, ? super List<String>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTextChangeListener = listener;
    }

    public final void setTextList(@NotNull FaceEditTextListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mAdapter.setStringList(data);
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
