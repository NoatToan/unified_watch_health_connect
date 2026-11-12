package com.xiaomi.fitness.devicesettings.bluttooth.applayout;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.WatchAppLayoutAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.yod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB%\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetWatchAppLayoutRet;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "selectItem", "(I)V", "kotlin.jvm.PlatformType", "getCurrentItem", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetWatchAppLayoutRet;", "getCurrentPos", "()I", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/GetWatchAppLayoutRetCallback;", "addAvailableTileAddedCallback", "Lkotlin/jvm/functions/Function2;", "currPos", "I", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWatchAppLayoutAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchAppLayoutAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1567#2:83\n1598#2,4:84\n*S KotlinDebug\n*F\n+ 1 WatchAppLayoutAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter\n*L\n53#1:83\n53#1:84,4\n*E\n"})
public final class WatchAppLayoutAdapter extends p<AppLayoutSettingViewModel.GetWatchAppLayoutRet, RecyclerView.d0> {

    @NotNull
    private final Function2<Integer, AppLayoutSettingViewModel.GetWatchAppLayoutRet, Unit> addAvailableTileAddedCallback;
    private int currPos;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetWatchAppLayoutRet;", "entity", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetWatchAppLayoutRet;)V", "Lyod;", "binding", "Lyod;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/WatchAppLayoutAdapter;Lyod;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private final yod binding;
        final /* synthetic */ WatchAppLayoutAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull WatchAppLayoutAdapter watchAppLayoutAdapter, yod binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = watchAppLayoutAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(AppLayoutSettingViewModel.GetWatchAppLayoutRet entity, WatchAppLayoutAdapter this$0, ViewHolder this$1, ImageView it) {
            Intrinsics.checkNotNullParameter(entity, "$entity");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(it, "it");
            if (!entity.isSelect()) {
                this$0.addAvailableTileAddedCallback.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), entity);
            }
            return Unit.INSTANCE;
        }

        public final void bind(@NotNull final AppLayoutSettingViewModel.GetWatchAppLayoutRet entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.binding.B.setBackgroundResource(entity.getDrawable());
            this.binding.C.setText(entity.getName());
            this.binding.A.setSelected(entity.isSelect());
            this.binding.A.setContentDescription(entity.getName());
            if (entity.isSelect()) {
                this.this$0.currPos = getBindingAdapterPosition();
            }
            ImageView imageView = this.binding.A;
            final WatchAppLayoutAdapter watchAppLayoutAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: r4r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WatchAppLayoutAdapter.ViewHolder.bind$lambda$0(entity, watchAppLayoutAdapter, this, (ImageView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchAppLayoutAdapter(@NotNull Function2<? super Integer, ? super AppLayoutSettingViewModel.GetWatchAppLayoutRet, Unit> addAvailableTileAddedCallback) {
        super(new WatchAppLayoutDiffCallback());
        Intrinsics.checkNotNullParameter(addAvailableTileAddedCallback, "addAvailableTileAddedCallback");
        this.addAvailableTileAddedCallback = addAvailableTileAddedCallback;
        this.currPos = -1;
    }

    public final AppLayoutSettingViewModel.GetWatchAppLayoutRet getCurrentItem() {
        return getCurrentList().get(this.currPos);
    }

    /* JADX INFO: renamed from: getCurrentPos, reason: from getter */
    public final int getCurrPos() {
        return this.currPos;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AppLayoutSettingViewModel.GetWatchAppLayoutRet getWatchAppLayoutRet = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(getWatchAppLayoutRet, "get(...)");
        ((ViewHolder) holder).bind(getWatchAppLayoutRet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yod yodVarA0 = yod.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yodVarA0, "inflate(...)");
        return new ViewHolder(this, yodVarA0);
    }

    public final void selectItem(int position) {
        List<AppLayoutSettingViewModel.GetWatchAppLayoutRet> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        List<AppLayoutSettingViewModel.GetWatchAppLayoutRet> list = currentList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AppLayoutSettingViewModel.GetWatchAppLayoutRet getWatchAppLayoutRet = (AppLayoutSettingViewModel.GetWatchAppLayoutRet) obj;
            if (i != position && getWatchAppLayoutRet.isSelect()) {
                getWatchAppLayoutRet.setSelect(false);
                notifyItemChanged(i);
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        getCurrentList().get(position).setSelect(true);
        notifyItemChanged(position);
    }
}
