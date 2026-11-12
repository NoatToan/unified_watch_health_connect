package com.xiaomi.fitness.sport.view.launch.gym;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport.course.CourseGridAudioDataKt;
import com.xiaomi.fitness.sport.course.CourseGridHolder;
import com.xiaomi.fitness.sport.course.CourseVideoHolder;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportAdapter;
import com.xiaomi.fitness.sport.view.launch.gym.data.CourseFirstPageData;
import defpackage.cu4;
import defpackage.dvi;
import defpackage.yt4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b:\u0010'J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010\u0007R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010*\u001a\n )*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R!\u00108\u001a\b\u0012\u0004\u0012\u0002030,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00100¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "viewType", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "genCourse", "(I)Lcom/mi/health/course/export/data/CourseModel$CourseData;", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/sport/view/launch/gym/data/CourseFirstPageData;", "data", "setFirstPage", "(Lcom/xiaomi/fitness/sport/view/launch/gym/data/CourseFirstPageData;)V", "", "addVideoData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "getControlHolder", "()Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "getItemViewType", "(I)I", "getItemCount", "()I", "pos", "getVideoData", "Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;", "getActivity", "()Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;", "setActivity", "(Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;)V", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "", "list", "Ljava/util/List;", "videoStart", "I", "controlHolder", "Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "recentData$delegate", "Lkotlin/Lazy;", "getRecentData", "()Ljava/util/List;", "recentData", "videoFirstPosition", "<init>", "LabelHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGymLaunchSportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GymLaunchSportAdapter.kt\ncom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class GymLaunchSportAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private GymLaunchSportActivity activity;

    @Nullable
    private ControlHolder controlHolder;
    private final LayoutInflater inflater;

    @NotNull
    private final List<CourseModel.CourseData> list;

    /* JADX INFO: renamed from: recentData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recentData;
    private int videoFirstPosition;
    private int videoStart;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportAdapter$LabelHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LabelHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public GymLaunchSportAdapter(@NotNull GymLaunchSportActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.inflater = LayoutInflater.from(activity);
        this.list = CollectionsKt__CollectionsKt.mutableListOf(genCourse(501));
        this.videoStart = 1;
        this.recentData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jcb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GymLaunchSportAdapter.recentData_delegate$lambda$0();
            }
        });
        this.videoFirstPosition = -1;
    }

    private final CourseModel.CourseData genCourse(int viewType) {
        CourseModel.CourseData courseData = new CourseModel.CourseData();
        courseData.type = viewType;
        return courseData;
    }

    private final List<CourseModel.PracticedCourse> getRecentData() {
        return (List) this.recentData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recentData_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void addVideoData(@NotNull List<? extends CourseModel.CourseData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.list.addAll(data);
        notifyDataSetChanged();
    }

    @NotNull
    public final GymLaunchSportActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final ControlHolder getControlHolder() {
        return this.controlHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.videoFirstPosition == -1) {
            this.videoFirstPosition = position;
        }
        return this.list.get(position).type;
    }

    @Nullable
    public final CourseModel.CourseData getVideoData(int pos) {
        boolean z = pos < this.videoStart;
        boolean z2 = pos > this.list.size();
        if (z || z2) {
            return null;
        }
        return this.list.get(pos);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ControlHolder) {
            this.controlHolder = (ControlHolder) holder;
        } else if (holder instanceof CourseVideoHolder) {
            ((CourseVideoHolder) holder).bind(this.list.get(position), position == this.videoStart);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 501:
                View viewInflate = this.inflater.inflate(dvi.B1, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return new ControlHolder(viewInflate, this.activity);
            case 502:
                yt4 yt4VarA0 = yt4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(yt4VarA0, "inflate(...)");
                return new CourseGridHolder(yt4VarA0, 2, getRecentData());
            case 503:
                yt4 yt4VarA1 = yt4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(yt4VarA1, "inflate(...)");
                return new CourseGridHolder(yt4VarA1, 1, CourseGridAudioDataKt.getAudioList());
            case 504:
            default:
                cu4 cu4VarA0 = cu4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(cu4VarA0, "inflate(...)");
                return new CourseVideoHolder(cu4VarA0);
            case 505:
                View viewInflate2 = this.inflater.inflate(dvi.course_launch_layout_label, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
                return new LabelHolder(viewInflate2);
        }
    }

    public final void setActivity(@NotNull GymLaunchSportActivity gymLaunchSportActivity) {
        Intrinsics.checkNotNullParameter(gymLaunchSportActivity, "<set-?>");
        this.activity = gymLaunchSportActivity;
    }

    public final void setFirstPage(@NotNull CourseFirstPageData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.list.clear();
        this.list.add(genCourse(501));
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            this.list.add(genCourse(502));
            List<CourseModel.PracticedCourse> recent = data.getRecent();
            if (recent != null && !recent.isEmpty()) {
                getRecentData().addAll(data.getRecent());
                this.videoStart++;
            }
            this.list.add(genCourse(503));
            this.videoStart++;
            List<CourseModel.CourseData> video = data.getVideo();
            if (video != null && !video.isEmpty()) {
                this.list.add(genCourse(505));
                this.videoStart++;
                this.list.addAll(data.getVideo());
            }
        }
        notifyDataSetChanged();
    }
}
