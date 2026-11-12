package com.xiaomi.fitness.access.misport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.about.utils.MiSportImportUrlsKt;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.access.misport.MiSportImportActivity;
import com.xiaomi.fitness.access.preference.AccessPreference;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.hyperlink.CommonTextLinkUtil;
import com.xiaomi.smarthome.plugin.update.PluginError;
import defpackage.aui;
import defpackage.av6;
import defpackage.eni;
import defpackage.mzi;
import defpackage.p30;
import defpackage.wi4;
import defpackage.xv1;
import defpackage.yii;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.WechatFileUtil;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001bB\u0007¢\u0006\u0004\ba\u0010\fJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ'\u0010\u001c\u001a\u00020\b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010 J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010&J\u0017\u0010!\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\nJ\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\fJ\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\fJ\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\fR\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010F\u001a\u0004\bS\u0010H\"\u0004\bT\u0010JR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportImportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/misport/MiSportViewModel;", "Lp30;", "Lcom/xiaomi/fitness/access/misport/IMiSportImportView;", "Lcom/xiaomi/fitness/access/misport/OnConfigChange;", "", "stringId", "", "setHtmlText", "(I)V", "resetBtnStatus", "()V", "code", "faileToast", "", MiuiCursorConstants.CONTENT, "showMiSportMigrateFaileDialog", "(Ljava/lang/String;)V", "status", "setMigrateStatus", "", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataItem;", "dataList", "setDataList", "(Ljava/util/List;)V", "postMigrateResult", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportUpdateStatusItem;", "getDataStatus", "(Ljava/util/List;I)V", "", "isInValid", "()Z", "showLoading", "isCancelable", "(Z)V", "cancelLoading", "msgRes", "(ZI)V", "goBack", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "loadData", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onDataChange", "TAG$1", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "loadingDialog", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "getLoadingDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "setLoadingDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;)V", "Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter;", "statusAdapter", "Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter;", "getStatusAdapter", "()Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter;", "setStatusAdapter", "(Lcom/xiaomi/fitness/access/misport/MiSportDataStatusAdapter;)V", "Landroid/widget/TextView;", "misport_import_desc_urltext", "Landroid/widget/TextView;", "getMisport_import_desc_urltext", "()Landroid/widget/TextView;", "setMisport_import_desc_urltext", "(Landroid/widget/TextView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "misport_data_recyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "getMisport_data_recyclerview", "()Landroidx/recyclerview/widget/RecyclerView;", "setMisport_data_recyclerview", "(Landroidx/recyclerview/widget/RecyclerView;)V", "misport_import_immediately", "getMisport_import_immediately", "setMisport_import_immediately", "Landroid/widget/ImageView;", "misport_divider_line", "Landroid/widget/ImageView;", "getMisport_divider_line", "()Landroid/widget/ImageView;", "setMisport_divider_line", "(Landroid/widget/ImageView;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MiSportImportActivity extends Hilt_MiSportImportActivity<MiSportViewModel, p30> implements IMiSportImportView, OnConfigChange {

    @NotNull
    public static final String EXTRA_KEY_CODE = "extra_key_code";

    @NotNull
    public static final String EXTRA_KEY_MSG = "extra_key_msg";

    @NotNull
    public static final String TAG = "MiSportImportActivity";

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = TAG;

    @Nullable
    private CircleProgressDialog loadingDialog;
    public RecyclerView misport_data_recyclerview;
    public ImageView misport_divider_line;
    public TextView misport_import_desc_urltext;
    public TextView misport_import_immediately;

    @Nullable
    private MiSportDataStatusAdapter statusAdapter;

    private final void faileToast(int code) {
        switch (code) {
            case PluginError.INSTALL_ERROR_FOR_FILE_CHECK /* -1004 */:
                String string = getString(mzi.B);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                showMiSportMigrateFaileDialog(string);
                break;
            case -1003:
                String string2 = getString(mzi.A);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                showMiSportMigrateFaileDialog(string2);
                break;
            case -1002:
                String string3 = getString(mzi.y);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                showMiSportMigrateFaileDialog(string3);
                break;
            case -1001:
                String string4 = getString(mzi.z);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                showMiSportMigrateFaileDialog(string4);
                break;
            default:
                WechatFileUtil.INSTANCE.showToastShort(mzi.E);
                break;
        }
    }

    public static /* synthetic */ void faileToast$default(MiSportImportActivity miSportImportActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        miSportImportActivity.faileToast(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(MiSportImportActivity this$0, MiSportData.MiSportDataList miSportDataList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setDataList(miSportDataList.dataList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(MiSportImportActivity this$0, MiSportData.MiSportStatus miSportStatus) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMigrateStatus(miSportStatus != null ? miSportStatus.status : -2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(MiSportImportActivity this$0, MiSportData.MigrateResponse migrateResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postMigrateResult(migrateResponse != null ? migrateResponse.retCode : -1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(MiSportImportActivity this$0, MiSportData.MiSportStatusList miSportStatusList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getDataStatus(miSportStatusList.dataList, miSportStatusList.status);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$6(MiSportImportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.getMisport_import_immediately().getText(), this$0.getString(mzi.L))) {
            this$0.finish();
            return;
        }
        try {
            this$0.startActivity(((MiSportViewModel) this$0.getMViewModel()).buildMiSportIntent());
        } catch (ActivityNotFoundException unused) {
            Logger.e(this$0.TAG, "activity not found exception");
        }
    }

    private final void resetBtnStatus() {
        getMisport_import_immediately().setClickable(true);
        getMisport_import_immediately().setText(getText(mzi.L));
        getMisport_import_immediately().setBackgroundResource(eni.s);
    }

    private final void setHtmlText(int stringId) {
        String string = getResources().getString(stringId, MiSportImportUrlsKt.getMiSportMigrateUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "app", RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Logger.d(this.TAG, "experienceHtml is " + string);
        getMisport_import_desc_urltext().setText(CommonTextLinkUtil.INSTANCE.getClickableHtml(string));
        getMisport_import_desc_urltext().setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void showMiSportMigrateFaileDialog(String content) {
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(mzi.C).setDialogDescriptionString(new DialogParams.DialogDescriptionString(content)).setPositiveText(mzi.common_known).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.misport.MiSportImportActivity.showMiSportMigrateFaileDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    dialog.dismiss();
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public boolean cancelLoading() {
        CircleProgressDialog circleProgressDialog = this.loadingDialog;
        if (circleProgressDialog == null) {
            return false;
        }
        Intrinsics.checkNotNull(circleProgressDialog);
        circleProgressDialog.dismiss();
        this.loadingDialog = null;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void getDataStatus(@Nullable List<? extends MiSportData.MiSportUpdateStatusItem> dataList, int status) {
        if (dataList == null) {
            return;
        }
        MiSportDataStatusAdapter miSportDataStatusAdapter = this.statusAdapter;
        if (miSportDataStatusAdapter != null) {
            if (miSportDataStatusAdapter != null) {
                miSportDataStatusAdapter.statusUpdate(dataList);
            }
            if (status == -1) {
                resetBtnStatus();
                setHtmlText(mzi.F);
                AccessPreference.INSTANCE.setMisportImportState(-1);
                return;
            } else {
                if (status != 2) {
                    return;
                }
                resetBtnStatus();
                AccessPreference.INSTANCE.setMisportImportState(2);
                return;
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = ((p30) getMBinding()).D;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            MiSportDataStatusAdapter miSportDataStatusAdapter2 = new MiSportDataStatusAdapter(dataList);
            this.statusAdapter = miSportDataStatusAdapter2;
            recyclerView.setAdapter(miSportDataStatusAdapter2);
        }
        setHtmlText(mzi.H);
        getMisport_import_immediately().setClickable(false);
        getMisport_import_immediately().setText(getText(mzi.x));
        getMisport_import_immediately().setBackgroundResource(eni.f16844a);
        getMisport_divider_line().setVisibility(0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.f3459b;
    }

    @Nullable
    public final CircleProgressDialog getLoadingDialog() {
        return this.loadingDialog;
    }

    @NotNull
    public final RecyclerView getMisport_data_recyclerview() {
        RecyclerView recyclerView = this.misport_data_recyclerview;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("misport_data_recyclerview");
        return null;
    }

    @NotNull
    public final ImageView getMisport_divider_line() {
        ImageView imageView = this.misport_divider_line;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("misport_divider_line");
        return null;
    }

    @NotNull
    public final TextView getMisport_import_desc_urltext() {
        TextView textView = this.misport_import_desc_urltext;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("misport_import_desc_urltext");
        return null;
    }

    @NotNull
    public final TextView getMisport_import_immediately() {
        TextView textView = this.misport_import_immediately;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("misport_import_immediately");
        return null;
    }

    @Nullable
    public final MiSportDataStatusAdapter getStatusAdapter() {
        return this.statusAdapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return xv1.f39496a;
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void goBack() {
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    @SuppressLint({"RestrictedApi"})
    public boolean isInValid() {
        if (wi4.a(getBaseContext()) != null) {
            Activity activityA = wi4.a(getBaseContext());
            Intrinsics.checkNotNull(activityA);
            if (!activityA.isFinishing()) {
                Activity activityA2 = wi4.a(this);
                Intrinsics.checkNotNull(activityA2);
                if (!activityA2.isDestroyed()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadData() {
        ((MiSportViewModel) getMViewModel()).checkStatus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.Hilt_MiSportImportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(mzi.I);
        setTitleBackground(yii.f40215b);
        loadData();
        setMisport_import_desc_urltext(((p30) getMBinding()).G);
        setMisport_import_immediately(((p30) getMBinding()).H);
        setMisport_divider_line(((p30) getMBinding()).E);
        setMisport_data_recyclerview(((p30) getMBinding()).D);
        ((MiSportViewModel) getMViewModel()).getMGetMiSportData().observe(this, new MiSportImportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: awf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MiSportImportActivity.onCreate$lambda$2(this.f3514a, (MiSportData.MiSportDataList) obj);
            }
        }));
        ((MiSportViewModel) getMViewModel()).getMGetMiSportLastMigrateStatus().observe(this, new MiSportImportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bwf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MiSportImportActivity.onCreate$lambda$3(this.f4671a, (MiSportData.MiSportStatus) obj);
            }
        }));
        ((MiSportViewModel) getMViewModel()).getMMiSportDataMigrate().observe(this, new MiSportImportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cwf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MiSportImportActivity.onCreate$lambda$4(this.f14801a, (MiSportData.MigrateResponse) obj);
            }
        }));
        ((MiSportViewModel) getMViewModel()).getMGetMiSportStatus().observe(this, new MiSportImportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dwf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MiSportImportActivity.onCreate$lambda$5(this.f15990a, (MiSportData.MiSportStatusList) obj);
            }
        }));
        ((p30) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: ewf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiSportImportActivity.onCreate$lambda$6(this.f17128a, view);
            }
        });
        MiSportImportUtilKt.addDataObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.OnConfigChange
    public void onDataChange() {
        ((MiSportViewModel) getMViewModel()).updateStatus();
        MiSportImportUtilKt.removeObserver(this);
    }

    @Override // com.xiaomi.fitness.access.misport.Hilt_MiSportImportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MiSportImportUtilKt.removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Logger.d(this.TAG, "onNewIntent INTENT " + intent);
        ((MiSportViewModel) getMViewModel()).handleMiSportAuthResponse(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void postMigrateResult(int code) {
        if (code != 0) {
            faileToast(code);
        } else {
            AccessPreference.INSTANCE.setKEY_MI_SPORT_DATA_IMPORT_STATE(1);
            ((MiSportViewModel) getMViewModel()).updateStatus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void setDataList(@Nullable List<? extends MiSportData.MiSportDataItem> dataList) {
        if (dataList == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = ((p30) getMBinding()).D;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(new MiSportDataAdapter(dataList));
        }
    }

    public final void setLoadingDialog(@Nullable CircleProgressDialog circleProgressDialog) {
        this.loadingDialog = circleProgressDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void setMigrateStatus(int status) {
        if (status == 1) {
            ((MiSportViewModel) getMViewModel()).updateStatus();
            getMisport_divider_line().setVisibility(0);
            return;
        }
        getMisport_import_immediately().setClickable(true);
        getMisport_import_immediately().setText(getText(mzi.G));
        ((MiSportViewModel) getMViewModel()).loadData();
        setHtmlText(mzi.D);
        getMisport_divider_line().setVisibility(8);
    }

    public final void setMisport_data_recyclerview(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.misport_data_recyclerview = recyclerView;
    }

    public final void setMisport_divider_line(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.misport_divider_line = imageView;
    }

    public final void setMisport_import_desc_urltext(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.misport_import_desc_urltext = textView;
    }

    public final void setMisport_import_immediately(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.misport_import_immediately = textView;
    }

    public final void setStatusAdapter(@Nullable MiSportDataStatusAdapter miSportDataStatusAdapter) {
        this.statusAdapter = miSportDataStatusAdapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, com.xiaomi.fitness.baseui.view.PageState, com.xiaomi.fitness.access.AliPayView
    public void showLoading() {
        showLoading(true);
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void showLoading(boolean isCancelable) {
        showLoading(isCancelable, -1);
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void showLoading(boolean isCancelable, int msgRes) {
        int i = mzi.e;
        if (msgRes <= 0) {
            msgRes = i;
        }
        CircleProgressDialog circleProgressDialogCreate = new CircleProgressDialog.a("repeat").setCustomTitleId(aui.s).setCancelable(isCancelable).setCanceledOnTouchOutside(isCancelable).create();
        this.loadingDialog = circleProgressDialogCreate;
        if (circleProgressDialogCreate != null) {
            circleProgressDialogCreate.showIfNeed(getSupportFragmentManager());
        }
        CircleProgressDialog circleProgressDialog = this.loadingDialog;
        if (circleProgressDialog != null) {
            circleProgressDialog.setPickerHintText(getString(msgRes));
        }
    }

    @Override // com.xiaomi.fitness.access.misport.IMiSportImportView
    public void showLoading(int msgRes) {
        showLoading(true, msgRes);
    }
}
