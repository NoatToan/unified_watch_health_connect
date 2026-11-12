package com.mi.health.course.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.lu4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/mi/health/course/adapter/CourseContentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CourseContentAdapter$Holder;", "exercises", "", "Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;", "coachSelectable", "", "<init>", "(Ljava/util/List;Z)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseContentAdapter extends RecyclerView.Adapter<Holder> {
    private final boolean coachSelectable;

    @NotNull
    private final List<CourseConfigModel.Exercise> exercises;
    private final LayoutInflater inflater;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/mi/health/course/adapter/CourseContentAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;", "pos", "", "bind", "(Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;)V", "Llu4;", "itemBinding", "Llu4;", "<init>", "(Lcom/mi/health/course/adapter/CourseContentAdapter;Llu4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseContentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseContentAdapter.kt\ncom/mi/health/course/adapter/CourseContentAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,39:1\n54#2,3:40\n24#2:43\n57#2,6:44\n63#2,2:51\n57#3:50\n*S KotlinDebug\n*F\n+ 1 CourseContentAdapter.kt\ncom/mi/health/course/adapter/CourseContentAdapter$Holder\n*L\n33#1:40,3\n33#1:43\n33#1:44,6\n33#1:51,2\n33#1:50\n*E\n"})
    public final class Holder extends RecyclerView.d0 {

        @NotNull
        private final lu4 itemBinding;
        final /* synthetic */ CourseContentAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseContentAdapter courseContentAdapter, lu4 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.this$0 = courseContentAdapter;
            this.itemBinding = itemBinding;
        }

        public final void bind(@NotNull CourseConfigModel.Exercise pos) {
            Intrinsics.checkNotNullParameter(pos, "pos");
            this.itemBinding.C.setText(pos.title);
            this.itemBinding.C.setImportantForAccessibility(2);
            ShapeableImageView imageView = this.itemBinding.A;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(CourseExtKt.getImgUrl(pos, this.this$0.coachSelectable)).target(imageView).build());
            this.itemBinding.B.setText(pos.subTitle);
            this.itemBinding.B.setImportantForAccessibility(2);
            View root = this.itemBinding.getRoot();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(pos.title);
            stringBuffer.append(",");
            stringBuffer.append(pos.subTitle);
            root.setContentDescription(stringBuffer.toString());
        }
    }

    public CourseContentAdapter(@NotNull List<CourseConfigModel.Exercise> exercises, boolean z) {
        Intrinsics.checkNotNullParameter(exercises, "exercises");
        this.exercises = exercises;
        this.coachSelectable = z;
        this.inflater = LayoutInflater.from(ApplicationExtKt.getApplication());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.exercises.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.exercises.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        lu4 lu4VarA0 = lu4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(lu4VarA0, "inflate(...)");
        return new Holder(this, lu4VarA0);
    }
}
