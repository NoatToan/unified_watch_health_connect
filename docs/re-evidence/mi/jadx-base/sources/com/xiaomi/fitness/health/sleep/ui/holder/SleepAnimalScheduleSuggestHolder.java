package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.ScheduleItem;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepAnimalScheduleAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import defpackage.a7e;
import defpackage.c0j;
import defpackage.myb;
import defpackage.ni4;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J!\u0010\r\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalScheduleSuggestHolder;", "", "", "initRecyclerView", "()V", "Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;", "animalInfo", "refreshScheduleView", "(Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;)V", "showEmptyReportView", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "latestAnimalReport", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", "Lmyb;", "binding", "Lmyb;", "getBinding", "()Lmyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "La7e;", "titleBinding", "La7e;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "ivSchedule", "ivScheduleAnimal", "tvTip", "Landroidx/recyclerview/widget/RecyclerView;", "scheduleRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalScheduleAdapter;", "scheduleAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalScheduleAdapter;", "<init>", "(Lmyb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepAnimalScheduleSuggestHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalScheduleSuggestHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalScheduleSuggestHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,78:1\n54#2,3:79\n24#2:82\n57#2,6:83\n63#2,2:90\n54#2,3:92\n24#2:95\n57#2,6:96\n63#2,2:103\n57#3:89\n57#3:102\n*S KotlinDebug\n*F\n+ 1 SleepAnimalScheduleSuggestHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalScheduleSuggestHolder\n*L\n60#1:79,3\n60#1:82\n60#1:83,6\n60#1:90,2\n71#1:92,3\n71#1:95\n71#1:96,6\n71#1:103,2\n60#1:89\n71#1:102\n*E\n"})
public final class SleepAnimalScheduleSuggestHolder {

    @NotNull
    private final myb binding;
    private final Context context;

    @NotNull
    private final AppCompatImageView ivIcon;

    @NotNull
    private final AppCompatImageView ivSchedule;

    @NotNull
    private final AppCompatImageView ivScheduleAnimal;
    private SleepAnimalScheduleAdapter scheduleAdapter;

    @NotNull
    private final RecyclerView scheduleRecyclerView;

    @NotNull
    private final a7e titleBinding;

    @NotNull
    private final TextView tvTip;

    @NotNull
    private final TextView tvTitle;

    public SleepAnimalScheduleSuggestHolder(@NotNull myb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        this.context = context;
        a7e layoutCommonTitle = binding.C;
        Intrinsics.checkNotNullExpressionValue(layoutCommonTitle, "layoutCommonTitle");
        this.titleBinding = layoutCommonTitle;
        TextView tvLabel = layoutCommonTitle.B;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        this.tvTitle = tvLabel;
        AppCompatImageView ivIcon = layoutCommonTitle.A;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        this.ivIcon = ivIcon;
        AppCompatImageView ivSchedule = binding.A;
        Intrinsics.checkNotNullExpressionValue(ivSchedule, "ivSchedule");
        this.ivSchedule = ivSchedule;
        AppCompatImageView ivScheduleAnimal = binding.B;
        Intrinsics.checkNotNullExpressionValue(ivScheduleAnimal, "ivScheduleAnimal");
        this.ivScheduleAnimal = ivScheduleAnimal;
        TextView tvTips = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
        this.tvTip = tvTips;
        RecyclerView scheduleRecyclerView = binding.D;
        Intrinsics.checkNotNullExpressionValue(scheduleRecyclerView, "scheduleRecyclerView");
        this.scheduleRecyclerView = scheduleRecyclerView;
        ivIcon.setBackground(ni4.e(context, pni.x0));
        tvLabel.setTextSize(18.0f);
        initRecyclerView();
    }

    private final void initRecyclerView() {
        this.scheduleAdapter = new SleepAnimalScheduleAdapter();
        this.scheduleRecyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        RecyclerView recyclerView = this.scheduleRecyclerView;
        SleepAnimalScheduleAdapter sleepAnimalScheduleAdapter = this.scheduleAdapter;
        if (sleepAnimalScheduleAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            sleepAnimalScheduleAdapter = null;
        }
        recyclerView.setAdapter(sleepAnimalScheduleAdapter);
    }

    private final void refreshScheduleView(AnimalInfo animalInfo) {
        this.tvTitle.setText(this.context.getString(c0j.Re));
        int type = animalInfo.getType();
        this.ivScheduleAnimal.setImageResource(SleepAnimalExtKt.getSleepAnimalDrawableRes(type));
        AppCompatImageView appCompatImageView = this.ivSchedule;
        Coil.imageLoader(appCompatImageView.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView.getContext()).data(SleepAnimalExtKt.getSleepAnimalScheduleBgUrl(type)).target(appCompatImageView).build());
        ViewExtKt.setVisible(this.tvTip, false);
        ViewExtKt.setVisible(this.scheduleRecyclerView, true);
        SleepAnimalHelper sleepAnimalHelper = SleepAnimalHelper.INSTANCE;
        int type2 = animalInfo.getType();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        List<ScheduleItem> listBuildScheduleList = sleepAnimalHelper.buildScheduleList(type2, context);
        SleepAnimalScheduleAdapter sleepAnimalScheduleAdapter = this.scheduleAdapter;
        if (sleepAnimalScheduleAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            sleepAnimalScheduleAdapter = null;
        }
        sleepAnimalScheduleAdapter.updateDataList(listBuildScheduleList);
    }

    private final void showEmptyReportView() {
        this.tvTitle.setText(this.context.getString(c0j.Se));
        this.titleBinding.getRoot().setAlpha(0.8f);
        this.ivScheduleAnimal.setImageResource(SleepAnimalExtKt.getSleepAnimalDrawableRes(2));
        AppCompatImageView appCompatImageView = this.ivSchedule;
        Coil.imageLoader(appCompatImageView.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView.getContext()).data(SleepAnimalExtKt.getSleepAnimalScheduleBgUrl(2)).target(appCompatImageView).build());
        ViewExtKt.setVisible(this.tvTip, true);
        this.tvTip.setAlpha(0.4f);
        this.ivScheduleAnimal.setAlpha(0.4f);
        this.ivSchedule.setAlpha(0.4f);
        ViewExtKt.setVisible(this.scheduleRecyclerView, false);
    }

    @NotNull
    public final myb getBinding() {
        return this.binding;
    }

    public final void updateReport(@Nullable SleepAnimalReport animalReport, @Nullable SleepAnimalReport latestAnimalReport) {
        AnimalInfo animal;
        if (animalReport == null || (animal = animalReport.getAnimal()) == null) {
            animal = latestAnimalReport != null ? latestAnimalReport.getAnimal() : null;
        }
        if (animal == null) {
            showEmptyReportView();
        } else {
            refreshScheduleView(animal);
        }
    }
}
