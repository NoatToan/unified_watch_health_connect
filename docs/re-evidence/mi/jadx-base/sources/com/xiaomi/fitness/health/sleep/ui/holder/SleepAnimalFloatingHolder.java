package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalFloatingHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import defpackage.gyb;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalFloatingHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "latestAnimalReport", "", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", "Lgyb;", "binding", "Lgyb;", "getBinding", "()Lgyb;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvSubtitle", "tvBuy", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "<init>", "(Lgyb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalFloatingHolder {

    @NotNull
    private final gyb binding;
    private final Context context;

    @NotNull
    private final View rootView;

    @NotNull
    private final TextView tvBuy;

    @NotNull
    private final TextView tvSubtitle;

    @NotNull
    private final TextView tvTitle;

    public SleepAnimalFloatingHolder(@NotNull gyb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        TextView tvTitle = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.tvTitle = tvTitle;
        TextView tvSubtitle = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
        this.tvSubtitle = tvSubtitle;
        TextView tvBuy = binding.C;
        Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
        this.tvBuy = tvBuy;
        this.context = binding.getRoot().getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateReport$lambda$0(View view) {
        WebViewUtilKt.startWebView$default(SleepAnimalExtKt.guideBuyDeviceUrl(), null, false, false, null, false, null, false, 254, null);
        SleepTrackHelper.INSTANCE.trackSleepGuideBuy();
    }

    @NotNull
    public final gyb getBinding() {
        return this.binding;
    }

    public final void updateReport(@Nullable SleepAnimalReport animalReport, @Nullable SleepAnimalReport latestAnimalReport) {
        List<Long> arrayList;
        List<Long> sampleDates;
        if ((latestAnimalReport != null ? latestAnimalReport.getAnimal() : null) != null || (animalReport != null && (sampleDates = animalReport.getSampleDates()) != null && sampleDates.size() == 7)) {
            ViewExtKt.setVisible(this.rootView, false);
            return;
        }
        ViewExtKt.setVisible(this.rootView, true);
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            ViewExtKt.setVisible(this.tvTitle, false);
            ViewExtKt.setVisible(this.tvSubtitle, true);
            ViewExtKt.setVisible(this.tvBuy, true);
            this.tvBuy.setOnClickListener(new View.OnClickListener() { // from class: igm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepAnimalFloatingHolder.updateReport$lambda$0(view);
                }
            });
            this.tvSubtitle.setText(this.context.getString(c0j.Lf));
            return;
        }
        if (animalReport == null || (arrayList = animalReport.getSampleDates()) == null) {
            arrayList = new ArrayList<>();
        }
        ViewExtKt.setVisible(this.tvTitle, true);
        ViewExtKt.setVisible(this.tvSubtitle, true);
        ViewExtKt.setVisible(this.tvBuy, false);
        int size = 7 - arrayList.size();
        this.tvTitle.setText(this.context.getResources().getQuantityString(qxi.x0, size, Integer.valueOf(size)));
        this.tvSubtitle.setText(this.context.getString(c0j.dd));
    }
}
