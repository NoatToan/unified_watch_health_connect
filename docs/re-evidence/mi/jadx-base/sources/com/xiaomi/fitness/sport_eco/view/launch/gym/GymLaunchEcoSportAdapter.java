package com.xiaomi.fitness.sport_eco.view.launch.gym;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_eco.course.CourseGridAudioDataKt;
import com.xiaomi.fitness.sport_eco.course.CourseGridHolder;
import com.xiaomi.fitness.sport_eco.course.CourseVideoHolder;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportAdapter;
import com.xiaomi.fitness.sport_eco.view.launch.gym.data.CourseFirstPageData;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.eua;
import defpackage.fvi;
import defpackage.iq4;
import defpackage.mq4;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bB\u0010*J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b#\u0010\u0007R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010-\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R!\u0010@\u001a\b\u0012\u0004\u0012\u00020;0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "viewType", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "genCourse", "(I)Lcom/mi/health/course/export/data/CourseModel$CourseData;", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/data/CourseFirstPageData;", "data", "setFirstPage", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/data/CourseFirstPageData;)V", "", "addVideoData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "getControlHolder", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "getFunctionListHolder", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "getItemViewType", "(I)I", "getItemCount", "()I", "pos", "getVideoData", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", "getActivity", "()Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;", "setActivity", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportActivity;)V", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "", "list", "Ljava/util/List;", "videoStart", "I", "controlHolder", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/ControlHolder;", "", "localSportType", "Ljava/lang/String;", "functionListHolder", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListHolder;", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "recentData$delegate", "Lkotlin/Lazy;", "getRecentData", "()Ljava/util/List;", "recentData", "videoFirstPosition", "<init>", "LabelHolder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGymLaunchEcoSportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GymLaunchEcoSportAdapter.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class GymLaunchEcoSportAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private GymLaunchEcoSportActivity activity;

    @Nullable
    private ControlHolder controlHolder;

    @Nullable
    private FunctionListHolder functionListHolder;
    private final LayoutInflater inflater;

    @NotNull
    private final List<CourseModel.CourseData> list;

    @NotNull
    private final String localSportType;

    /* JADX INFO: renamed from: recentData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recentData;
    private int videoFirstPosition;
    private int videoStart;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/GymLaunchEcoSportAdapter$LabelHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LabelHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public GymLaunchEcoSportAdapter(@NotNull GymLaunchEcoSportActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.inflater = LayoutInflater.from(activity);
        this.list = CollectionsKt__CollectionsKt.mutableListOf(genCourse(501));
        this.videoStart = 1;
        this.localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        this.recentData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zbb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GymLaunchEcoSportAdapter.recentData_delegate$lambda$0();
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
    public final GymLaunchEcoSportActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final ControlHolder getControlHolder() {
        return this.controlHolder;
    }

    @Nullable
    public final FunctionListHolder getFunctionListHolder() {
        return this.functionListHolder;
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
            ControlHolder controlHolder = (ControlHolder) holder;
            controlHolder.loadDeviceImage();
            this.controlHolder = controlHolder;
        } else if (holder instanceof FunctionListHolder) {
            this.functionListHolder = (FunctionListHolder) holder;
        } else if (holder instanceof CourseVideoHolder) {
            ((CourseVideoHolder) holder).bind(this.list.get(position), position == this.videoStart);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 505) {
            View viewInflate = this.inflater.inflate(fvi.course_eco_launch_layout_label, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new LabelHolder(viewInflate);
        }
        if (viewType == 601) {
            eua euaVarA0 = eua.A0(this.inflater, parent, false);
            Intrinsics.checkNotNullExpressionValue(euaVarA0, "inflate(...)");
            return new FunctionListHolder(euaVarA0, FunctionListDataKt.getFunctionList(), this.activity);
        }
        switch (viewType) {
            case 501:
                View viewInflate2 = this.inflater.inflate(fvi.s0, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
                return new ControlHolder(viewInflate2, this.activity, this.localSportType);
            case 502:
                iq4 iq4VarA0 = iq4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(iq4VarA0, "inflate(...)");
                return new CourseGridHolder(iq4VarA0, 2, getRecentData());
            case 503:
                iq4 iq4VarA1 = iq4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(iq4VarA1, "inflate(...)");
                return new CourseGridHolder(iq4VarA1, 1, CourseGridAudioDataKt.getAudioList());
            default:
                mq4 mq4VarA0 = mq4.A0(this.inflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(mq4VarA0, "inflate(...)");
                return new CourseVideoHolder(mq4VarA0);
        }
    }

    public final void setActivity(@NotNull GymLaunchEcoSportActivity gymLaunchEcoSportActivity) {
        Intrinsics.checkNotNullParameter(gymLaunchEcoSportActivity, "<set-?>");
        this.activity = gymLaunchEcoSportActivity;
    }

    public final void setFirstPage(@NotNull CourseFirstPageData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.list.clear();
        this.list.add(genCourse(501));
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            this.list.add(genCourse(601));
            if (!Intrinsics.areEqual(this.localSportType, "yunmai.jmprope.sr804")) {
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
        }
        notifyDataSetChanged();
    }
}
