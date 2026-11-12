package com.xiaomi.fitness.watch.face.edit.text;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/text/FaceEditTextDragListener;", "", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "startDragItem", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "onDragOver", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface FaceEditTextDragListener {
    void onDragOver();

    void startDragItem(@NotNull RecyclerView.d0 holder);
}
