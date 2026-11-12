package com.xiaomi.fitness.sport.course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.widget.view.RatioImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.au4;
import defpackage.nuf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0014\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aJ\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/course/CourseGridAdapter$Holder;", "context", "Landroid/content/Context;", "from", "", "sourceKey", "", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "getContext", "()Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "list", "", "", "onBindViewHolder", "", "holder", "position", "setData", "data", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseGridAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final Context context;
    private final int from;
    private final LayoutInflater inflater;

    @NotNull
    private final List<Object> list;

    @Nullable
    private final String sourceKey;

    public /* synthetic */ CourseGridAdapter(Context context, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? null : str);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@NotNull List<? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.list.clear();
        this.list.addAll(data);
        notifyDataSetChanged();
    }

    public CourseGridAdapter(@NotNull Context context, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.from = i;
        this.sourceKey = str;
        this.inflater = LayoutInflater.from(context);
        this.list = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = this.from;
        if (i == 1) {
            Object obj = this.list.get(position);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.sport.course.CourseGridAudioData");
            holder.bind((CourseGridAudioData) obj);
        } else if (i != 2) {
            Object obj2 = this.list.get(position);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.CourseData");
            holder.bind((CourseModel.CourseData) obj2);
        } else {
            Object obj3 = this.list.get(position);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.PracticedCourse");
            holder.bind((CourseModel.PracticedCourse) obj3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        au4 au4VarA0 = au4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(au4VarA0, "inflate(...)");
        return new Holder(this, au4VarA0);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "post", "", "bind", "(Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;)V", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "(Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;)V", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "courseData", "(Lcom/mi/health/course/export/data/CourseModel$CourseData;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lau4;", "view", "Lau4;", "getView", "()Lau4;", "<init>", "(Lcom/xiaomi/fitness/sport/course/CourseGridAdapter;Lau4;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseGridAdapter.kt\ncom/xiaomi/fitness/sport/course/CourseGridAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,133:1\n54#2,3:134\n24#2:137\n57#2,6:138\n63#2,2:145\n54#2,3:147\n24#2:150\n57#2,6:151\n63#2,2:158\n57#3:144\n57#3:157\n*S KotlinDebug\n*F\n+ 1 CourseGridAdapter.kt\ncom/xiaomi/fitness/sport/course/CourseGridAdapter$Holder\n*L\n58#1:134,3\n58#1:137\n58#1:138,6\n58#1:145,2\n71#1:147,3\n71#1:150\n71#1:151,6\n71#1:158,2\n58#1:144\n71#1:157\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {
        final /* synthetic */ CourseGridAdapter this$0;

        @NotNull
        private final au4 view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseGridAdapter courseGridAdapter, au4 view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = courseGridAdapter;
            this.view = view;
            view.getRoot().setOnClickListener(this);
            nuf.f(view.getRoot());
        }

        public final void bind(@NotNull CourseModel.PracticedCourse post) {
            Intrinsics.checkNotNullParameter(post, "post");
            CourseModel.CourseData courseData = post.courseData;
            if (courseData != null) {
                RatioImageView imgView = this.view.A;
                Intrinsics.checkNotNullExpressionValue(imgView, "imgView");
                Coil.imageLoader(imgView.getContext()).enqueue(new ImageRequest.Builder(imgView.getContext()).data(courseData.smallImageUrl).target(imgView).build());
                this.view.getRoot().setTag(courseData);
                this.view.B.setText(courseData.name);
            }
        }

        @NotNull
        public final au4 getView() {
            return this.view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (this.this$0.from == 1) {
                Object tag = v.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.sport.course.CourseGridAudioData");
                CourseGridAudioData courseGridAudioData = (CourseGridAudioData) tag;
                if (courseGridAudioData.getSportType() == 3) {
                    CourseApiKt.getCourseApi().goFeedPage(courseGridAudioData.getScene(), courseGridAudioData.getSportType(), ResourceExtKt.getString(courseGridAudioData.getTitle()));
                    return;
                } else {
                    CourseApi.DefaultImpls.goCourseCatalog$default(CourseApiKt.getCourseApi(), CourseApiKt.getCourseScene(courseGridAudioData.getScene(), "default"), new int[]{courseGridAudioData.getSportType()}, null, ResourceExtKt.getString(courseGridAudioData.getTitle()), false, 20, null);
                    return;
                }
            }
            Object tag2 = v.getTag();
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.CourseData");
            CourseModel.CourseData courseData = (CourseModel.CourseData) tag2;
            boolean z = this.this$0.from == 2;
            String str = z ? "mijia_treadmill_home_page" : this.this$0.sourceKey;
            Logger.d("CourseGridAdapter", "onClick: source = " + str);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.to("name", z ? "treadmill_recent_course_cover" : "course_recommend_cover");
            pairArr[1] = TuplesKt.to("source", str);
            pairArr[2] = TuplesKt.to("asset_id", Long.valueOf(courseData.courseId));
            pairArr[3] = TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name);
            pairArr[4] = TuplesKt.to("tip", z ? "56.2.2.1.19569" : "56.2.2.1.19567");
            oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
            CourseApiKt.getCourseApi().goInfoPage(courseData.courseId, 6);
        }

        public final void bind(@NotNull CourseGridAudioData post) {
            Intrinsics.checkNotNullParameter(post, "post");
            this.view.A.setImageResource(post.getIcon());
            this.view.getRoot().setTag(post);
            this.view.B.setText(post.getTitle());
        }

        public final void bind(@NotNull CourseModel.CourseData courseData) {
            Intrinsics.checkNotNullParameter(courseData, "courseData");
            RatioImageView imgView = this.view.A;
            Intrinsics.checkNotNullExpressionValue(imgView, "imgView");
            Coil.imageLoader(imgView.getContext()).enqueue(new ImageRequest.Builder(imgView.getContext()).data(courseData.smallImageUrl).target(imgView).build());
            this.view.getRoot().setTag(courseData);
            this.view.B.setText(courseData.title);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.108.0.1.40461"), TuplesKt.to("area", 6), TuplesKt.to(FaceDetailFragment.PAGE_NAME, "发起运动推荐"), TuplesKt.to("type_sku", Integer.valueOf(courseData.pricingStatus + 1)), TuplesKt.to("asset_id", String.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name)));
        }
    }
}
