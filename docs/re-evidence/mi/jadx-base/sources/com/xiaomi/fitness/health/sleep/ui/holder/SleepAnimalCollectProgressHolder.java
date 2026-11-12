package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepCollectAdapter;
import com.xiaomi.fitness.health.sleep.ui.adapter.SpaceItemDecoration;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalCollectProgressHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import defpackage.c0j;
import defpackage.eyb;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalCollectProgressHolder;", "", "", "initRecyclerView", "()V", "showTipDialog", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "latestAnimalReport", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", "Leyb;", "binding", "Leyb;", "getBinding", "()Leyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "collectRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepCollectAdapter;", "collectAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepCollectAdapter;", "<init>", "(Leyb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalCollectProgressHolder {

    @NotNull
    private final eyb binding;
    private SleepCollectAdapter collectAdapter;

    @NotNull
    private final RecyclerView collectRecyclerView;
    private final Context context;

    @NotNull
    private final AppCompatImageView ivIcon;

    @NotNull
    private final View rootView;

    @NotNull
    private final TextView tvTitle;

    public SleepAnimalCollectProgressHolder(@NotNull eyb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.context = binding.getRoot().getContext();
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        RecyclerView collectRecyclerView = binding.A;
        Intrinsics.checkNotNullExpressionValue(collectRecyclerView, "collectRecyclerView");
        this.collectRecyclerView = collectRecyclerView;
        TextView tvTitle = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.tvTitle = tvTitle;
        AppCompatImageView ivQuestion = binding.B;
        Intrinsics.checkNotNullExpressionValue(ivQuestion, "ivQuestion");
        this.ivIcon = ivQuestion;
        initRecyclerView();
    }

    private final void initRecyclerView() {
        this.collectRecyclerView.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
        this.collectRecyclerView.post(new Runnable() { // from class: bgm
            @Override // java.lang.Runnable
            public final void run() {
                SleepAnimalCollectProgressHolder.initRecyclerView$lambda$0(this.f4188a);
            }
        });
        SleepCollectAdapter sleepCollectAdapter = new SleepCollectAdapter();
        this.collectAdapter = sleepCollectAdapter;
        this.collectRecyclerView.setAdapter(sleepCollectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRecyclerView$lambda$0(SleepAnimalCollectProgressHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.collectRecyclerView.addItemDecoration(new SpaceItemDecoration((int) Math.floor(Math.min(ExtUtilsKt.getDp(90), (this$0.collectRecyclerView.getWidth() - (ExtUtilsKt.getDp(Double.valueOf(31.6d)) * 7)) / 6.0f))));
    }

    private final void showTipDialog() {
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("animal_tip");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("animal_tip").setDialogTitle(c0j.Ye).setDialogDescription(c0j.Xe).setPositiveText(c0j.I7).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.showIfNeed(supportFragmentManager);
                SleepTrackHelper.INSTANCE.trackSleepAnimalReportCollectDetailClick();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateReport$lambda$1(SleepAnimalCollectProgressHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showTipDialog();
    }

    @NotNull
    public final eyb getBinding() {
        return this.binding;
    }

    public final void updateReport(@Nullable SleepAnimalReport animalReport, @Nullable SleepAnimalReport latestAnimalReport) {
        List<Long> arrayList;
        String string;
        SleepCollectAdapter sleepCollectAdapter = null;
        AnimalInfo animal = animalReport != null ? animalReport.getAnimal() : null;
        AnimalInfo animal2 = latestAnimalReport != null ? latestAnimalReport.getAnimal() : null;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (animal == null && animal2 == null && wearableDeviceModel == null) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        if (animalReport == null || (arrayList = animalReport.getSampleDates()) == null) {
            arrayList = new ArrayList<>();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < 7) {
            arrayList2.add(Boolean.valueOf(i < size));
            i++;
        }
        SleepCollectAdapter sleepCollectAdapter2 = this.collectAdapter;
        if (sleepCollectAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collectAdapter");
        } else {
            sleepCollectAdapter = sleepCollectAdapter2;
        }
        sleepCollectAdapter.updateDataList(arrayList2);
        int size2 = 7 - arrayList.size();
        TextView textView = this.tvTitle;
        if (animal2 != null) {
            string = this.context.getResources().getQuantityString(qxi.q0, size2, Integer.valueOf(size2));
        } else {
            string = size2 == 0 ? this.context.getString(c0j.Ve) : this.context.getResources().getQuantityString(qxi.r0, size2, Integer.valueOf(size2));
        }
        textView.setText(string);
        this.ivIcon.setOnClickListener(new View.OnClickListener() { // from class: agm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalCollectProgressHolder.updateReport$lambda$1(this.f994a, view);
            }
        });
    }
}
