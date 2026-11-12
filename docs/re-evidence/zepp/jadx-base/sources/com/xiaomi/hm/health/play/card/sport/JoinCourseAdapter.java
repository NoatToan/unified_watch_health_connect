package com.xiaomi.hm.health.play.card.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.navigation.NavigationController;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewholder.ViewHolderBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.xiaomi.hm.health.databinding.PlayCardItemJoinCourseBinding;
import com.xiaomi.hm.health.play.bean.PlayJoinCourseBean;
import com.xiaomi.hm.health.play.card.sport.JoinCourseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter$JoinCourseViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "lists", "updateData", "", "a", "Ljava/util/List;", "joinCourseList", "Lcom/huami/training/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "<init>", "()V", "Companion", "JoinCourseViewHolder", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JoinCourseAdapter extends RecyclerView.Adapter<JoinCourseViewHolder> {
    public static final int MAX_SIZE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<PlayJoinCourseBean> joinCourseList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter$JoinCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "joinCourse", "", "bind", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databinding/PlayCardItemJoinCourseBinding;", "b", "Lcom/huami/viewbindingx/ViewBindingProperty;", "()Lcom/xiaomi/hm/health/databinding/PlayCardItemJoinCourseBinding;", "binding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class JoinCourseViewHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JoinCourseViewHolder.class), "binding", "getBinding()Lcom/xiaomi/hm/health/databinding/PlayCardItemJoinCourseBinding;"))};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;

        public JoinCourseViewHolder(@NotNull Context context, @NotNull View view) {
            super(view);
            this.context = context;
            this.binding = ViewHolderBindingsKt.viewBinding(this, PlayCardItemJoinCourseBinding.class);
        }

        private final PlayCardItemJoinCourseBinding a() {
            return (PlayCardItemJoinCourseBinding) this.binding.getValue(this, c[0]);
        }

        public final void bind(@NotNull PlayJoinCourseBean joinCourse) {
            PlayCardItemJoinCourseBinding playCardItemJoinCourseBindingA = a();
            ExtensionsKt.loadWithRadius(playCardItemJoinCourseBindingA.ivCourseImage, joinCourse.getCourseImg(), ExtensionsKt.getDp(4));
            playCardItemJoinCourseBindingA.tvCourseName.setText(joinCourse.getCourseName());
            playCardItemJoinCourseBindingA.tvCourseNum.setText(getContext().getResources().getQuantityString(R.plurals.action_amout, joinCourse.getCourseNum(), Integer.valueOf(joinCourse.getCourseNum())));
            if (joinCourse.getTrainingTimes() == 0) {
                playCardItemJoinCourseBindingA.tvCourseStatus.setText(R.string.tr_has_not_train_yet);
            } else {
                playCardItemJoinCourseBindingA.tvCourseStatus.setText(getContext().getResources().getQuantityString(R.plurals.tr_train_times, joinCourse.getTrainingTimes(), Integer.valueOf(joinCourse.getTrainingTimes())));
            }
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/navigation/NavigationController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NavigationController> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NavigationController getA() {
            return (NavigationController) ScopesAndQualifersKt.trainingScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);
        }
    }

    private final NavigationController b() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(JoinCourseAdapter joinCourseAdapter, JoinCourseViewHolder joinCourseViewHolder, ViewGroup viewGroup, View view) {
        PlayJoinCourseBean playJoinCourseBean = joinCourseAdapter.joinCourseList.get(joinCourseViewHolder.getAdapterPosition());
        joinCourseAdapter.b().navigateToTrainingDetail(viewGroup.getContext(), playJoinCourseBean.getId(), playJoinCourseBean.getTrainingType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        if (this.joinCourseList.size() > 3) {
            return 3;
        }
        return this.joinCourseList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateData(@NotNull List<PlayJoinCourseBean> lists) {
        this.joinCourseList.clear();
        this.joinCourseList.addAll(lists);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull JoinCourseViewHolder holder, int position) {
        holder.bind(this.joinCourseList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public JoinCourseViewHolder onCreateViewHolder(@NotNull final ViewGroup parent, int viewType) {
        final JoinCourseViewHolder joinCourseViewHolder = new JoinCourseViewHolder(parent.getContext(), LayoutInflater.from(parent.getContext()).inflate(R.layout.play_card_item_join_course, parent, false));
        joinCourseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: li4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JoinCourseAdapter.c(this.a, joinCourseViewHolder, parent, view);
            }
        });
        return joinCourseViewHolder;
    }
}
