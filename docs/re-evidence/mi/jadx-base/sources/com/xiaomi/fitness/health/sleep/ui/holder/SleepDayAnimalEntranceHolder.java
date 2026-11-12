package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.OvulationTestRecord;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.util.CoilUtils;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepDayAnimalEntranceHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.av6;
import defpackage.c0j;
import defpackage.jbe;
import defpackage.of1;
import defpackage.pni;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u00020\u00042!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDayAnimalEntranceHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "report", "", "showReportView", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", "showEmptyReportView", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "resultCallback", "showCloudSyncDialog", "(Lkotlin/jvm/functions/Function1;)V", "updateLatestSleepAnimalReport", "disposeImageRequest", "Ljbe;", "binding", "Ljbe;", "Landroid/widget/TextView;", "tvCardTitle", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "cardBg", "Landroid/widget/ImageView;", "Landroid/view/View;", "noReportView", "Landroid/view/View;", "hasReportView", "hasReportInnerRectView", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcoil/request/Disposable;", "gifDisposable", "Lcoil/request/Disposable;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "wearableDeviceManager$delegate", "Lkotlin/Lazy;", "getWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "wearableDeviceManager", "<init>", "(Ljbe;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDayAnimalEntranceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayAnimalEntranceHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepDayAnimalEntranceHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,211:1\n54#2,3:212\n24#2:215\n59#2,6:216\n71#2,2:222\n71#2,2:224\n*S KotlinDebug\n*F\n+ 1 SleepDayAnimalEntranceHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepDayAnimalEntranceHolder\n*L\n94#1:212,3\n94#1:215\n94#1:216,6\n207#1:222,2\n208#1:224,2\n*E\n"})
public final class SleepDayAnimalEntranceHolder {

    @NotNull
    public static final String TAG = "SleepDayAnimalEntranceHolder";

    @NotNull
    private final jbe binding;

    @NotNull
    private final ImageView cardBg;

    @NotNull
    private final Context context;

    @Nullable
    private Disposable gifDisposable;

    @NotNull
    private final View hasReportInnerRectView;

    @NotNull
    private final View hasReportView;

    @NotNull
    private final View noReportView;

    @NotNull
    private final TextView tvCardTitle;

    /* JADX INFO: renamed from: wearableDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wearableDeviceManager;

    public SleepDayAnimalEntranceHolder(@NotNull jbe binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        TextView tvTitle = binding.P;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.tvCardTitle = tvTitle;
        AppCompatImageView ivCardBg = binding.G;
        Intrinsics.checkNotNullExpressionValue(ivCardBg, "ivCardBg");
        this.cardBg = ivCardBg;
        CardView cardNoReport = binding.B;
        Intrinsics.checkNotNullExpressionValue(cardNoReport, "cardNoReport");
        this.noReportView = cardNoReport;
        CardView cardHasReport = binding.A;
        Intrinsics.checkNotNullExpressionValue(cardHasReport, "cardHasReport");
        this.hasReportView = cardHasReport;
        ConstraintLayout clAnimalReport = binding.D;
        Intrinsics.checkNotNullExpressionValue(clAnimalReport, "clAnimalReport");
        this.hasReportInnerRectView = clAnimalReport;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        this.wearableDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hjm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDayAnimalEntranceHolder.wearableDeviceManager_delegate$lambda$0();
            }
        });
    }

    private final WearableDeviceManager getWearableDeviceManager() {
        return (WearableDeviceManager) this.wearableDeviceManager.getValue();
    }

    private final void showCloudSyncDialog(final Function1<? super Boolean, Unit> resultCallback) {
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("open_sync_guide");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("open_sync_guide").setDialogTitle(c0j.Ol).setDialogDescription(c0j.cd).setNegativeText(c0j.c).setPositiveText(c0j.Va).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepDayAnimalEntranceHolder.showCloudSyncDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which != -1) {
                            resultCallback.invoke2(Boolean.FALSE);
                        } else {
                            RegionPreference.INSTANCE.setSyncWeb(true);
                            resultCallback.invoke2(Boolean.TRUE);
                        }
                    }
                });
                commonDialogCreate.showIfNeed(supportFragmentManager);
            }
        }
    }

    private final void showEmptyReportView() {
        ViewExtKt.setVisible(this.noReportView, true);
        ViewExtKt.setVisible(this.hasReportView, false);
        this.binding.C.setBackground(of1.b(this.context, pni.g1));
        this.cardBg.setBackgroundResource(pni.b1);
        this.tvCardTitle.setText(ExtUtilKt.getString(c0j.oh));
        this.tvCardTitle.setTextColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceTopCardTitleTextColor(0)));
        this.noReportView.setOnClickListener(new View.OnClickListener() { // from class: mjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDayAnimalEntranceHolder.showEmptyReportView$lambda$6(this.f26936a, view);
            }
        });
        AppCompatImageView ivNoReportAnimal = this.binding.H;
        Intrinsics.checkNotNullExpressionValue(ivNoReportAnimal, "ivNoReportAnimal");
        this.gifDisposable = SleepAnimalExtKt.showGifImage(ivNoReportAnimal, SleepAnimalExtKt.SLEEP_ANIMAL_LOADING_ANIMATION_MIDDLE_WEBP_URL, pni.l1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEmptyReportView$lambda$6(final SleepDayAnimalEntranceHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((WearableDeviceModel) this$0.getWearableDeviceManager().getCurrentDeviceModel()) == null) {
            Logger.i(TAG, "deviceModel is null");
            this$0.showCloudSyncDialog(new Function1() { // from class: kjm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepDayAnimalEntranceHolder.showEmptyReportView$lambda$6$lambda$4(this.f23925a, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            this$0.showCloudSyncDialog(new Function1() { // from class: ljm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepDayAnimalEntranceHolder.showEmptyReportView$lambda$6$lambda$5(this.f25136a, ((Boolean) obj).booleanValue());
                }
            });
        }
        SleepTrackHelper.INSTANCE.trackSleepAnimalCardClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showEmptyReportView$lambda$6$lambda$4(SleepDayAnimalEntranceHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            SleepAnimalExtKt.gotoSleepAnimalReportActivity$default(this$0.context, null, null, false, "sleep_day_entrance", 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showEmptyReportView$lambda$6$lambda$5(SleepDayAnimalEntranceHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            SleepAnimalExtKt.gotoSleepAnimalDetectingActivity$default(this$0.context, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void showReportView(final SleepAnimalReport report) {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            View root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setVisible(root, false);
            return;
        }
        View root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.setVisible(root2, true);
        ViewExtKt.setVisible(this.noReportView, false);
        ViewExtKt.setVisible(this.hasReportView, true);
        AnimalInfo animal = report.getAnimal();
        if (animal == null) {
            return;
        }
        int type = animal.getType();
        ImageView imageView = this.cardBg;
        String sleepAnimalEntranceBgUrl = SleepAnimalExtKt.getSleepAnimalEntranceBgUrl(type);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(sleepAnimalEntranceBgUrl).target(imageView);
        builderTarget.placeholder(pni.b1);
        builderTarget.error(pni.b1);
        imageLoader.enqueue(builderTarget.build());
        Drawable drawableB = of1.b(this.context, pni.f1);
        if (drawableB instanceof GradientDrawable) {
            ((GradientDrawable) drawableB).setStroke(1, this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceBgStrokeColor(type)));
        }
        this.binding.C.setBackground(drawableB);
        this.hasReportInnerRectView.setBackgroundColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceInnerBgColor(type)));
        this.tvCardTitle.setText(ExtUtilKt.getString(c0j.Tf));
        this.tvCardTitle.setTextColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceTopCardTitleTextColor(type)));
        this.binding.I.setMInnerStrokeColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalStrokeColor(type)));
        this.binding.I.setImageResource(SleepAnimalExtKt.getSleepAnimalDrawableRes(type));
        this.binding.F.updateShadowColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalShadowColor(type)));
        this.binding.M.setText(ExtUtilKt.getString(SleepAnimalExtKt.getSleepAnimalStringRes(type)));
        AnimalInfo animal2 = report.getAnimal();
        Intrinsics.checkNotNull(animal2);
        this.binding.O.setText(this.context.getString(c0j.Uf, TimeUtils.formatDate(ExtUtilKt.getString(c0j.n), Long.valueOf(animal2.getUpdateTime() * ((long) 1000)))));
        this.binding.N.setTextColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceDetailTextColor(type)));
        this.binding.O.setTextColor(this.context.getColor(SleepAnimalExtKt.getSleepAnimalEntranceLastUpdateTextColor(type)));
        this.hasReportView.setOnClickListener(new View.OnClickListener() { // from class: ijm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDayAnimalEntranceHolder.showReportView$lambda$3(this.f21235a, report, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showReportView$lambda$3(final SleepDayAnimalEntranceHolder this$0, final SleepAnimalReport report, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(report, "$report");
        this$0.showCloudSyncDialog(new Function1() { // from class: jjm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepDayAnimalEntranceHolder.showReportView$lambda$3$lambda$2(report, this$0, ((Boolean) obj).booleanValue());
            }
        });
        SleepTrackHelper.INSTANCE.trackSleepAnimalCardClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showReportView$lambda$3$lambda$2(SleepAnimalReport report, SleepDayAnimalEntranceHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            TimeUtils timeUtils = TimeUtils.INSTANCE;
            AnimalInfo animal = report.getAnimal();
            Intrinsics.checkNotNull(animal);
            if (timeUtils.isSameDay(animal.getUpdateTime() * ((long) 1000), System.currentTimeMillis())) {
                SleepAnimalExtKt.gotoSleepAnimalReportActivity$default(this$0.context, report, null, false, "sleep_day_entrance", 6, null);
            } else {
                SleepAnimalExtKt.gotoSleepAnimalDetectingActivity(this$0.context, report);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceManager wearableDeviceManager_delegate$lambda$0() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
    }

    public final void disposeImageRequest() {
        AppCompatImageView ivNoReportAnimal = this.binding.H;
        Intrinsics.checkNotNullExpressionValue(ivNoReportAnimal, "ivNoReportAnimal");
        CoilUtils.dispose(ivNoReportAnimal);
        CoilUtils.dispose(this.cardBg);
        Disposable disposable = this.gifDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void updateLatestSleepAnimalReport(@Nullable SleepAnimalReport report) {
        Logger.i(TAG, "updateLatestSleepAnimalReport " + report);
        if ((report != null ? report.getAnimal() : null) == null) {
            showEmptyReportView();
        } else {
            showReportView(report);
        }
    }
}
