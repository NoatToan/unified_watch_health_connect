package com.xiaomi.hm.health.play.card.intelligence.watchface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinConstant;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinDetailDialog;
import com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity;
import com.xiaomi.hm.health.play.bean.WatchFaceData;
import com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardAdapter;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RJ\u0010\u001d\u001a6\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b0\u0014j\u0002`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "watchFaceList", "setData", "a", "Ljava/util/List;", "mWatchFaceList", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/ParameterName;", "name", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/intelligence/watchface/ItemClickListener;", "b", "Lkotlin/jvm/functions/Function2;", "itemClick", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceCardAdapter extends RecyclerView.Adapter<WatchFaceHolder> {

    @NotNull
    private static final String c = "WatchFaceCardAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<WatchFaceData> mWatchFaceList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Function2<? super RecyclerView.ViewHolder, ? super Context, Unit> itemClick = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<RecyclerView.ViewHolder, Context, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceCardAdapter$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0986a extends Lambda implements Function0<String> {
            public static final C0986a a = new C0986a();

            public C0986a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "dialog showing.";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "currentActivity is not FragmentActivity.";
            }
        }

        public a() {
            super(2);
        }

        public final void a(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Context context) {
            WatchFaceCardAdapter watchFaceCardAdapter = WatchFaceCardAdapter.this;
            HMDeviceSource majorDeviceSource = PlayKoinModuleKt.getMajorDeviceSource();
            WatchFaceData watchFaceData = (WatchFaceData) watchFaceCardAdapter.mWatchFaceList.get(viewHolder.getAdapterPosition());
            if (HMDeviceConfig.isSupportNewWatchStore(majorDeviceSource)) {
                WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, context, 0, watchFaceData.getId(), null, null, 24, null);
                return;
            }
            if (watchFaceData.getCustomizable()) {
                DiyDialBgActivity.INSTANCE.launch(context, 0, CollectionsKt__CollectionsKt.arrayListOf(WatchFaceCardAdapterKt.b(watchFaceData)));
                return;
            }
            if (WatchSkinDetailDialog.SHOWING) {
                HMLog.info(WatchFaceCardAdapter.c, C0986a.a);
                return;
            }
            Activity topActivity = BraceletForegroundCallBack.getTopActivity();
            if (!(topActivity instanceof FragmentActivity)) {
                HMLog.info(WatchFaceCardAdapter.c, b.a);
                return;
            }
            WatchSkinDetailDialog.SHOWING = true;
            WatchSkinDetailDialog watchSkinDetailDialog = new WatchSkinDetailDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable(WatchSkinConstant.ARGS_SKIN_INFO, WatchFaceCardAdapterKt.a(watchFaceData));
            watchSkinDetailDialog.setArguments(bundle);
            ((FragmentActivity) topActivity).getSupportFragmentManager().beginTransaction().add(watchSkinDetailDialog, "watchSkinDetailDialog").commitAllowingStateLoss();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder, Context context) {
            a(viewHolder, context);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WatchFaceCardAdapter watchFaceCardAdapter, WatchFaceHolder watchFaceHolder, ViewGroup viewGroup, View view) {
        watchFaceCardAdapter.itemClick.invoke(watchFaceHolder, viewGroup.getContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.mWatchFaceList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<WatchFaceData> watchFaceList) {
        this.mWatchFaceList = watchFaceList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WatchFaceHolder holder, int position) {
        holder.bind(this.mWatchFaceList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WatchFaceHolder onCreateViewHolder(@NotNull final ViewGroup parent, int viewType) {
        final WatchFaceHolder watchFaceHolder = new WatchFaceHolder(parent.getContext(), LayoutInflater.from(parent.getContext()).inflate(R.layout.play_item_watch_face, parent, false));
        watchFaceHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: oe8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchFaceCardAdapter.b(this.a, watchFaceHolder, parent, view);
            }
        });
        return watchFaceHolder;
    }
}
