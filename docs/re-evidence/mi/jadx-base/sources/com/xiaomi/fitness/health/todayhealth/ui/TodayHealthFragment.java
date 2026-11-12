package com.xiaomi.fitness.health.todayhealth.ui;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment;
import com.xiaomi.fitness.util.HealthBundleKey;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import defpackage.yaa;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001AB\u0007¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\r\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0012\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010&J'\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020#H\u0016¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00109¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/TodayHealthFragment;", "Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/health/todayhealth/ui/TodayHealthDayFragment;", "Lyaa;", "", "initActionBar", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "selectedType", "selectedCallback", "showRecordDownLoadRemindDialog", "(Lkotlin/jvm/functions/Function1;)V", "", "success", "onComplete", "takeLongScreenshot", "generatePDF", "", "getResultPath", "(Ljava/lang/String;)Ljava/lang/String;", "showDeleteDialog", "setTabType", "Landroid/view/View;", "contentView", "initContentView", "(Landroid/view/View;)V", "position", "Ljava/lang/Class;", "getClassChild", "(I)Ljava/lang/Class;", "getClassChildName", "(I)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "visibility", "showImgMore", "(I)V", "expandBundle", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "mViewModel", "getContentResourceId", "()I", "contentResourceId", "getClassName", "()Ljava/lang/String;", "className", "getDefaultDataType", "defaultDataType", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodayHealthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthFragment.kt\ncom/xiaomi/fitness/health/todayhealth/ui/TodayHealthFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,264:1\n106#2,15:265\n*S KotlinDebug\n*F\n+ 1 TodayHealthFragment.kt\ncom/xiaomi/fitness/health/todayhealth/ui/TodayHealthFragment\n*L\n50#1:265,15\n*E\n"})
public final class TodayHealthFragment extends Hilt_TodayHealthFragment<TodayHealthDayFragment> implements yaa {

    @NotNull
    private static final String TAG = "HealthCheckFragment";

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    public TodayHealthFragment() {
        setContentAttachToScrollView(false);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HealthCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final void generatePDF(final Function1<? super Boolean, Unit> onComplete) {
        final PdfDocument pdfDocument = new PdfDocument();
        View view = getView();
        final RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(eri.v3) : null;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: zgp
                @Override // java.lang.Runnable
                public final void run() {
                    TodayHealthFragment.generatePDF$lambda$5(recyclerView, pdfDocument, this, onComplete);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generatePDF$lambda$5(RecyclerView recyclerView, PdfDocument pdfDocument, TodayHealthFragment this$0, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(pdfDocument, "$pdfDocument");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(recyclerView, 0, 0, 6, null);
        Logger.d(TAG, "generatePDF bitmap width=" + bitmapLoadBitmapFromView$default.getWidth() + " height=" + bitmapLoadBitmapFromView$default.getHeight());
        int width = bitmapLoadBitmapFromView$default.getWidth();
        int height = bitmapLoadBitmapFromView$default.getHeight();
        Logger.d(TAG, "generatePDF scrollBitmap.width=" + width + " scrollBitmap.height=" + height);
        PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(width, height, 1).create());
        pageStartPage.getCanvas().drawBitmap(bitmapLoadBitmapFromView$default, (Rect) null, new RectF(0.0f, 0.0f, (float) width, (float) height), (Paint) null);
        pdfDocument.finishPage(pageStartPage);
        try {
            pdfDocument.writeTo(new FileOutputStream(new File(this$0.getResultPath("todayHealth.pdf"))));
            onComplete.invoke2(Boolean.TRUE);
            Logger.d(TAG, "generatePDF success. ");
        } catch (Exception e) {
            Logger.i(TAG, "generatePDF e=" + e);
            onComplete.invoke2(Boolean.FALSE);
        }
        pdfDocument.close();
    }

    private final HealthCheckViewModel getMViewModel() {
        return (HealthCheckViewModel) this.mViewModel.getValue();
    }

    private final String getResultPath(String name) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("TodayHealth");
        return (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + name;
    }

    private final void initActionBar() {
        setActionBarDisplayable(false);
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.Ga).setDialogDescription(c0j.ma).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(200);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showImgMore$lambda$3(final TodayHealthFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showRecordDownLoadRemindDialog(new Function1() { // from class: ahp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthFragment.showImgMore$lambda$3$lambda$2(this.f1036a, ((Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showImgMore$lambda$3$lambda$2(TodayHealthFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            this$0.generatePDF(new Function1() { // from class: chp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TodayHealthFragment.showImgMore$lambda$3$lambda$2$lambda$0(((Boolean) obj).booleanValue());
                }
            });
        } else if (i == 1) {
            this$0.takeLongScreenshot(new Function1() { // from class: dhp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TodayHealthFragment.showImgMore$lambda$3$lambda$2$lambda$1(((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showImgMore$lambda$3$lambda$2$lambda$0(boolean z) {
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), z ? c0j.common_save_success : c0j.common_download_fail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showImgMore$lambda$3$lambda$2$lambda$1(boolean z) {
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), z ? c0j.common_save_success : c0j.common_download_fail);
        return Unit.INSTANCE;
    }

    private final void showRecordDownLoadRemindDialog(final Function1<? super Integer, Unit> selectedCallback) {
        String[] strArr = {getString(c0j.Fi), getString(c0j.Gi)};
        final Ref.IntRef intRef = new Ref.IntRef();
        CommonDialog commonDialogCreate = new CommonDialog.c("health_sleep_rhythm_download_select").setDialogTitle(c0j.Hi).setItems(strArr).setItemsCheckedIndex(intRef.element).setPositiveText(c0j.e).setNegativeText(c0j.c).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment.showRecordDownLoadRemindDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    selectedCallback.invoke2(Integer.valueOf(intRef.element));
                }
                Logger.d(TodayHealthFragment.TAG, "showRecordDownLoadRemindDialog which=" + which);
                intRef.element = which;
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void takeLongScreenshot(final Function1<? super Boolean, Unit> onComplete) {
        final String resultPath = getResultPath("todayHealthReport.jpeg");
        View view = getView();
        final RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(eri.v3) : null;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: bhp
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    TodayHealthFragment.takeLongScreenshot$lambda$4(recyclerView, resultPath, onComplete);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takeLongScreenshot$lambda$4(RecyclerView recyclerView, String resultPath, Function1 onComplete) throws IOException {
        Intrinsics.checkNotNullParameter(resultPath, "$resultPath");
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(recyclerView, 0, 0, 6, null);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(resultPath));
        bitmapLoadBitmapFromView$default.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        try {
            fileOutputStream.flush();
            onComplete.invoke2(Boolean.TRUE);
        } catch (Exception e) {
            fileOutputStream.close();
            Logger.i(TAG, "takeLongScreenshot failed. exception=" + e);
            onComplete.invoke2(Boolean.FALSE);
        }
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean("switch_day_week_month", false);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return TodayHealthDayFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @Nullable
    public String getClassChildName(int position) {
        return "HealthCheckItemsFragment";
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public String getClassName() {
        String name = TodayHealthFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getContentResourceId() {
        return jui.Y;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getDefaultDataType() {
        return 30000;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initContentView(@Nullable View contentView) {
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initParamsFromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            setFromCalendar(bundle.getBoolean("calendar", false));
            if (getIsFromCalendar()) {
                setCalendarDate((LocalDate) bundle.getSerializable("calendar_date"));
                bundle.remove("calendar");
                bundle.remove("calendar_date");
            }
            setMPosition(bundle.getInt("position", 0));
            if (getMSelectDate() == null) {
                LocalDate value = getMViewModel().getLocalSelectDay().getValue();
                if (value == null) {
                    value = LocalDate.now();
                }
                setMSelectDate(value);
            }
            setMDid(bundle.getString("did"));
            setExtendValue(bundle.getInt(HealthBundleKey.BUNDLE_PARAMS_EXTEND_VALUE));
            setRelativeUid(bundle.getLong("key_relative_uid", -1L));
            setHealthDataType(bundle.getInt("sport_type", getDefaultDataType()));
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActionBar();
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 200 && resultCode == -1) {
            requireActivity().setResult(2);
            requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void setTabType() {
        setTabType(2);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void showImgMore(int visibility) {
        ImageView imgShare;
        ImageView shareView;
        ImageView imgShare2;
        ImageView imgShare3;
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView != null && (imgShare3 = titleBarAlphaView.getImgShare()) != null) {
            ViewExtKt.gone(imgShare3);
        }
        TitleBarAlphaView titleBarAlphaView2 = getTitleBarAlphaView();
        if (titleBarAlphaView2 != null && (imgShare2 = titleBarAlphaView2.getImgShare()) != null) {
            imgShare2.setImageResource(pni.z);
        }
        TitleBarAlphaView titleBarAlphaView3 = getTitleBarAlphaView();
        if (titleBarAlphaView3 != null && (shareView = titleBarAlphaView3.getShareView()) != null) {
            ViewExtKt.gone(shareView);
        }
        TitleBarAlphaView titleBarAlphaView4 = getTitleBarAlphaView();
        if (titleBarAlphaView4 == null || (imgShare = titleBarAlphaView4.getImgShare()) == null) {
            return;
        }
        ViewExtKt.clickWithTrigger$default(imgShare, 0L, new Function1() { // from class: ehp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayHealthFragment.showImgMore$lambda$3(this.f16656a, (ImageView) obj);
            }
        }, 1, null);
    }
}
