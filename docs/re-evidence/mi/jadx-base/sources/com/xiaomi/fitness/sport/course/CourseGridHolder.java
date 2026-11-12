package com.xiaomi.fitness.sport.course;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.course.CourseGridHolder;
import defpackage.c1j;
import defpackage.gak;
import defpackage.yt4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "getRecyclerViewSpan", "()I", "Lyt4;", "view", "Lyt4;", "getView", "()Lyt4;", "source", "", "", "data", "<init>", "(Lyt4;ILjava/util/List;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseGridHolder extends RecyclerView.d0 {

    @NotNull
    private final yt4 view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseGridHolder(@NotNull yt4 view, int i, @NotNull List<? extends Object> data) {
        int i2;
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        this.view = view;
        if (data.isEmpty()) {
            View root = view.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setHeight(root, 0);
        }
        view.C.addItemDecoration(new gak(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(13)));
        view.getRoot().post(new Runnable() { // from class: jr4
            @Override // java.lang.Runnable
            public final void run() {
                CourseGridHolder._init_$lambda$0(this.f23046a);
            }
        });
        TextView textView = view.A;
        if (i != 1) {
            i2 = i != 2 ? c1j.V0 : c1j.U0;
        } else {
            i2 = c1j.P0;
        }
        textView.setText(ResourceExtKt.getString(i2));
        boolean z = i == 2;
        TextView moreView = view.B;
        Intrinsics.checkNotNullExpressionValue(moreView, "moreView");
        ExtUtilsKt.setVisible(moreView, z && data.size() > 2);
        view.B.setOnClickListener(new View.OnClickListener() { // from class: kr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CourseGridHolder._init_$lambda$1(view2);
            }
        });
        Context context = view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CourseGridAdapter courseGridAdapter = new CourseGridAdapter(context, i, null, 4, null);
        int recyclerViewSpan = getRecyclerViewSpan();
        view.C.setLayoutManager(new GridLayoutManager(view.getRoot().getContext(), recyclerViewSpan, 1, false));
        view.C.setAdapter(courseGridAdapter);
        courseGridAdapter.setData(z ? data.subList(0, Math.min(recyclerViewSpan, data.size())) : data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CourseGridHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewParent parent = this$0.view.getRoot().getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) parent).addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.sport.course.CourseGridHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(View view) {
        CourseApiKt.getCourseApi().startCourseMe("treadmill");
    }

    private final int getRecyclerViewSpan() {
        int screenState = UIUtils.INSTANCE.getScreenState();
        return (screenState == 0 || screenState == 1) ? 3 : 2;
    }

    @NotNull
    public final yt4 getView() {
        return this.view;
    }
}
