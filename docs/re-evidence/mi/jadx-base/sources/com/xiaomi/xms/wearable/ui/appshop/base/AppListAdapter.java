package com.xiaomi.xms.wearable.ui.appshop.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.xms.wearable.ui.appshop.base.AppListAdapter;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.widget.ProgressButton;
import defpackage.htr;
import defpackage.ni4;
import defpackage.uoi;
import defpackage.x1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000221B\u0007¢\u0006\u0004\b/\u00100J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001d\u001a\u00020\u00102\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00102\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "packageName", "", "findPosition", "(Ljava/lang/String;)I", "position", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "getItem", "(I)Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "", "isLoadingMore", "", "list", "", "update", "(ZLjava/util/List;)V", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "statusInfo", "onAppStatusChanged", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;)V", "appListItem", "notifyItemInstall", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;)V", "notifyItemUninstall", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnItemBtnClickListener", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "mOnItemClickListener", "Lkotlin/jvm/functions/Function1;", "mOnItemBtnClickListener", "mDataList", "Ljava/util/List;", "<init>", "()V", "Companion", "AppListViewHolder", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class AppListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "AppListAdapter";

    @NotNull
    private final List<AppListItem> mDataList = new ArrayList();

    @Nullable
    private Function1<? super AppListItem, Unit> mOnItemBtnClickListener;

    @Nullable
    private Function1<? super AppListItem, Unit> mOnItemClickListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter$AppListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "item", "", "onBind", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;)V", "Lhtr;", "mViewBinding", "Lhtr;", "Lcom/xiaomi/xms/wearable/widget/ProgressButton;", "actionBtn", "Lcom/xiaomi/xms/wearable/widget/ProgressButton;", "getActionBtn", "()Lcom/xiaomi/xms/wearable/widget/ProgressButton;", "<init>", "(Lhtr;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nAppListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppListAdapter.kt\ncom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter$AppListViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,142:1\n54#2,3:143\n24#2:146\n57#2,6:147\n63#2,2:154\n57#3:153\n*S KotlinDebug\n*F\n+ 1 AppListAdapter.kt\ncom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter$AppListViewHolder\n*L\n111#1:143,3\n111#1:146\n111#1:147,6\n111#1:154,2\n111#1:153\n*E\n"})
    public static final class AppListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ProgressButton actionBtn;

        @NotNull
        private final htr mViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppListViewHolder(@NotNull htr mViewBinding) {
            super(mViewBinding.getRoot());
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.mViewBinding = mViewBinding;
            ProgressButton actionBtn = mViewBinding.A;
            Intrinsics.checkNotNullExpressionValue(actionBtn, "actionBtn");
            this.actionBtn = actionBtn;
        }

        @NotNull
        public final ProgressButton getActionBtn() {
            return this.actionBtn;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0095  */
        public final void onBind(@NotNull AppListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView icon = this.mViewBinding.D;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            Coil.imageLoader(icon.getContext()).enqueue(new ImageRequest.Builder(icon.getContext()).data(item.getBean().icon).target(icon).build());
            this.mViewBinding.C.setText(item.getBean().app_name);
            this.mViewBinding.B.setText(item.getBean().description);
            AppStatusInfo appStatusInfoNewAppStatusInfo = item.newAppStatusInfo();
            this.mViewBinding.A.setEnabled(appStatusInfoNewAppStatusInfo.getStatusEnable());
            String statusText = appStatusInfoNewAppStatusInfo.getStatusText();
            ProgressButton.DisplayMode displayMode = ProgressButton.DisplayMode.NORMAL.INSTANCE;
            int statusValue = appStatusInfoNewAppStatusInfo.getStatusValue();
            int status = appStatusInfoNewAppStatusInfo.getStatus();
            if (status == 2) {
                displayMode = ProgressButton.DisplayMode.PROGRESS.INSTANCE;
            } else if (status == 4) {
                statusText = this.itemView.getContext().getResources().getString(x1j.p, Integer.valueOf(appStatusInfoNewAppStatusInfo.getStatusValue()));
                displayMode = ProgressButton.DisplayMode.PROGRESS.INSTANCE;
            } else if (status == 8) {
                displayMode = ProgressButton.DisplayMode.PROGRESS.INSTANCE;
            }
            this.mViewBinding.A.setContentDescription(appStatusInfoNewAppStatusInfo.getStatusText());
            if (statusText != null) {
                this.actionBtn.setBtnText(statusText, displayMode, statusValue);
            }
        }
    }

    private final int findPosition(String packageName) {
        int size = this.mDataList.size();
        int i = 0;
        while (i < size) {
            if (Intrinsics.areEqual(packageName, this.mDataList.get(i).getBean().package_name)) {
                Logger.i(TAG, "AppListAdapter findPosition " + i + " " + packageName);
                return i;
            }
            i++;
        }
        i = -1;
        Logger.i(TAG, "AppListAdapter findPosition " + i + " " + packageName);
        return i;
    }

    private final AppListItem getItem(int position) {
        return this.mDataList.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AppListAdapter this$0, AppListItem item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Function1<? super AppListItem, Unit> function1 = this$0.mOnItemBtnClickListener;
        if (function1 != null) {
            function1.invoke2(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(AppListAdapter this$0, AppListItem item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Function1<? super AppListItem, Unit> function1 = this$0.mOnItemClickListener;
        if (function1 != null) {
            function1.invoke2(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    public final void notifyItemInstall(@NotNull AppListItem appListItem) {
        Intrinsics.checkNotNullParameter(appListItem, "appListItem");
        String package_name = appListItem.getBean().package_name;
        Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
        int iFindPosition = findPosition(package_name);
        if (iFindPosition != -1) {
            notifyItemChanged(iFindPosition);
        } else {
            this.mDataList.add(appListItem);
            notifyItemInserted(this.mDataList.size());
        }
    }

    public final void notifyItemUninstall(@NotNull AppListItem appListItem) {
        Intrinsics.checkNotNullParameter(appListItem, "appListItem");
        String package_name = appListItem.getBean().package_name;
        Intrinsics.checkNotNullExpressionValue(package_name, "package_name");
        int iFindPosition = findPosition(package_name);
        if (iFindPosition != -1) {
            this.mDataList.remove(iFindPosition);
            notifyItemRemoved(iFindPosition);
        }
    }

    public final void onAppStatusChanged(@NotNull AppStatusInfo statusInfo) {
        Intrinsics.checkNotNullParameter(statusInfo, "statusInfo");
        int iFindPosition = findPosition(statusInfo.getPackageName());
        if (iFindPosition != -1) {
            notifyItemChanged(iFindPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof AppListViewHolder)) {
            Logger.e(TAG, "onBindViewHolder: unknown ViewHolder:" + holder);
            return;
        }
        final AppListItem item = getItem(position);
        AppListViewHolder appListViewHolder = (AppListViewHolder) holder;
        appListViewHolder.onBind(item);
        appListViewHolder.getActionBtn().setOnClickListener(new View.OnClickListener() { // from class: yg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppListAdapter.onBindViewHolder$lambda$0(this.f40145a, item, view);
            }
        });
        holder.itemView.setBackground(ni4.e(ApplicationExtKt.getApplication(), uoi.d));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: zg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppListAdapter.onBindViewHolder$lambda$1(this.f41238a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        htr htrVarA0 = htr.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(htrVarA0, "inflate(...)");
        return new AppListViewHolder(htrVarA0);
    }

    public final void setOnItemBtnClickListener(@Nullable Function1<? super AppListItem, Unit> listener) {
        this.mOnItemBtnClickListener = listener;
    }

    public final void setOnItemClickListener(@Nullable Function1<? super AppListItem, Unit> listener) {
        this.mOnItemClickListener = listener;
    }

    public final void update(boolean isLoadingMore, @NotNull List<AppListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (!isLoadingMore) {
            this.mDataList.clear();
        }
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }
}
