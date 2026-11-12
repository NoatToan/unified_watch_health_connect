package com.xiaomi.fitness.devicesettings.guide;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.guide.GuideNotificationSelectAppAdapter;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0014\u0010\u001b\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter$AppViewHolder;", "viewModel", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;)V", "itemList", "", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "mViewModel", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "showLastCloseAlert", "itemView", "Landroid/view/View;", "isLastChecked", "", "showItemOpenAlert", "getItemCount", "refreshList", "it", "AppViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class GuideNotificationSelectAppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    @NotNull
    private List<InstallApplicationInfo> itemList;

    @NotNull
    private final GuideNotificationViewModel mViewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter$AppViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/SwitchButtonBindingSingleLineTextView;", "appItem", "Lcom/xiaomi/fitness/widget/SwitchButtonBindingSingleLineTextView;", "getAppItem", "()Lcom/xiaomi/fitness/widget/SwitchButtonBindingSingleLineTextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AppViewHolder extends RecyclerView.d0 {

        @NotNull
        private final SwitchButtonBindingSingleLineTextView appItem;
        final /* synthetic */ GuideNotificationSelectAppAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppViewHolder(@NotNull GuideNotificationSelectAppAdapter guideNotificationSelectAppAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = guideNotificationSelectAppAdapter;
            View viewFindViewById = itemView.findViewById(zqi.x);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.appItem = (SwitchButtonBindingSingleLineTextView) viewFindViewById;
        }

        @NotNull
        public final SwitchButtonBindingSingleLineTextView getAppItem() {
            return this.appItem;
        }
    }

    public GuideNotificationSelectAppAdapter(@NotNull GuideNotificationViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.itemList = new ArrayList();
        this.mViewModel = viewModel;
    }

    private final boolean isLastChecked() {
        Iterator<InstallApplicationInfo> it = this.itemList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isCheck()) {
                i++;
            }
        }
        return i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(GuideNotificationSelectAppAdapter this$0, InstallApplicationInfo item, AppViewHolder holder, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (!z && this$0.isLastChecked()) {
            item.setCheck(true);
            holder.getAppItem().setSwitch(true);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            this$0.showLastCloseAlert(itemView);
            return;
        }
        NotifyHelperExtKt.getNotificationManagerExport().setNotifyEnable(item.getPackageName(), z);
        item.setCheck(z);
        if (z) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            this$0.showItemOpenAlert(itemView2);
        }
    }

    private final void showItemOpenAlert(View itemView) {
        String did;
        WearableDeviceModel mDeviceModel = this.mViewModel.getMDeviceModel();
        if (mDeviceModel == null || (did = mDeviceModel.getDid()) == null || !NotifyHelperExtKt.getNotificationManagerExport().isShowNotificationItemOpenAlert(did)) {
            return;
        }
        NotifyHelperExtKt.getNotificationManagerExport().hideNotificationItemOpenAlert(did);
        if (itemView.getContext() instanceof FragmentActivity) {
            Context context = itemView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            new CommonDialog.c("commonDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(wzi.Se, new Object[0])).setNeutralText(wzi.common_known).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.guide.GuideNotificationSelectAppAdapter.showItemOpenAlert.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else if (which == -1 && dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).show(supportFragmentManager, "");
        }
    }

    private final void showLastCloseAlert(View itemView) {
        NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
        Context context = itemView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        notificationManagerExport.showLastCloseAlert((FragmentActivity) context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.itemList.size();
    }

    public final void refreshList(@NotNull List<InstallApplicationInfo> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.itemList = it;
        notifyDataSetChanged();
        Logger.d("Notify", "itemListLiveData observe:" + this.itemList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final AppViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final InstallApplicationInfo installApplicationInfo = this.itemList.get(position);
        holder.getAppItem().setTitle(this.itemList.get(position).getAppName());
        holder.getAppItem().setSwitch(installApplicationInfo.isCheck());
        holder.getAppItem().setIcon(installApplicationInfo.getAppIcon());
        holder.getAppItem().setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: d6b
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                GuideNotificationSelectAppAdapter.onBindViewHolder$lambda$0(this.f15130a, installApplicationInfo, holder, z, iSwitchButton);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AppViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(eui.o3, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new AppViewHolder(this, viewInflate);
    }
}
