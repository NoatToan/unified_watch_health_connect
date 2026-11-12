package com.xiaomi.fitness.feedback.ui;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Message;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.BleLogUploadProgressListener;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.DeviceData;
import com.xiaomi.fitness.feedback.bugreport.FeedbackActivity;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.bugreport.MiuiFeedBack;
import com.xiaomi.fitness.feedback.bugreport.WearosWatchLogHelper;
import com.xiaomi.fitness.feedback.eco.EcoExtKt;
import com.xiaomi.fitness.feedback.extentions.FeedbackWebUrlsKt;
import com.xiaomi.fitness.feedback.history.HistoryActivity;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil;
import com.xiaomi.fitness.feedback.util.WeakHandler;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.a0j;
import defpackage.av6;
import defpackage.bv1;
import defpackage.gji;
import defpackage.hui;
import defpackage.ji9;
import defpackage.mni;
import defpackage.owk;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u000b*\u00017\b\u0007\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001@B\u0007¢\u0006\u0004\b?\u0010 J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionViewModel;", "Lji9;", "Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "feedbackItemInfo", "", "showDetail", "(Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;)V", "showHelp", "feedback", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "isUploadLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;)Z", "", "type", "", "getType", "(I)Ljava/lang/String;", "info", "intentToFeedback", "(Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "getItemInfoStr", "()Ljava/lang/String;", "uploadLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;Ljava/lang/String;)V", "doOnFeedBackForLiBai", "(Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;Ljava/lang/String;)V", "setLayoutManager", "()V", "bindView", "(Lji9;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "mTagInfo", "Lcom/xiaomi/fitness/feedback/ui/FeedbackItemInfo;", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "mFeedbackUploadDeviceLogDialog", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "handler", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "mCancelDialog", "Ljava/lang/Boolean;", "mType", "Ljava/lang/String;", "com/xiaomi/fitness/feedback/ui/FeedbackQuestionActivity$mBleLogUploadProgressReceiver$1", "mBleLogUploadProgressReceiver", "Lcom/xiaomi/fitness/feedback/ui/FeedbackQuestionActivity$mBleLogUploadProgressReceiver$1;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedbackQuestionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackQuestionActivity.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,429:1\n1863#2,2:430\n*S KotlinDebug\n*F\n+ 1 FeedbackQuestionActivity.kt\ncom/xiaomi/fitness/feedback/ui/FeedbackQuestionActivity\n*L\n293#1:430,2\n*E\n"})
public final class FeedbackQuestionActivity extends Hilt_FeedbackQuestionActivity<FeedbackQuestionViewModel, ji9> implements WeakHandler.HandlerMsgCallback {

    @NotNull
    private static final String KEY_INTENT_DEVICE_DATA = "key_intent_device_data";

    @NotNull
    private static final String KEY_INTENT_ITEMS = "key_intent_items";

    @NotNull
    private static final String TAG = "FeedbackQuestionActivity";

    @Nullable
    private FeedbackItemInfo mTagInfo;

    @Nullable
    private String mType;

    @NotNull
    private FeedbackUploadDeviceLogDialogUtil mFeedbackUploadDeviceLogDialog = new FeedbackUploadDeviceLogDialogUtil();

    @Nullable
    private WeakHandler handler = new WeakHandler(this);

    @Nullable
    private Boolean mCancelDialog = Boolean.FALSE;

    @NotNull
    private FeedbackQuestionActivity$mBleLogUploadProgressReceiver$1 mBleLogUploadProgressReceiver = new BleLogUploadProgressListener() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity$mBleLogUploadProgressReceiver$1
        @Override // com.example.statistics.export.BleLogUploadProgressListener
        public void uploadLogResult(boolean success) {
            Logger.i("FeedbackQuestionActivity", "dismissUploadDeviceLogDialogLoading " + success);
            WeakHandler weakHandler = this.this$0.handler;
            if (weakHandler != null) {
                weakHandler.sendEmptyMessage(2);
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FeedbackQuestionViewModel access$getMViewModel(FeedbackQuestionActivity feedbackQuestionActivity) {
        return (FeedbackQuestionViewModel) feedbackQuestionActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(FeedbackQuestionActivity this$0, FeedbackItemInfo feedbackItemInfo, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(feedbackItemInfo, "feedbackItemInfo");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        FeedbackItemInfo feedbackItemInfo2 = this$0.mTagInfo;
        if ((feedbackItemInfo2 != null ? feedbackItemInfo2.getDeviceData() : null) != null) {
            FeedbackItemInfo feedbackItemInfo3 = this$0.mTagInfo;
            Intrinsics.checkNotNull(feedbackItemInfo3);
            feedbackItemInfo.setDeviceData(feedbackItemInfo3.getDeviceData());
        }
        List<FeedbackItemInfo> subItemList = feedbackItemInfo.getSubItemList();
        if (subItemList != null && !subItemList.isEmpty()) {
            String json = new Gson().toJson(feedbackItemInfo);
            Intent intent = new Intent(this$0, (Class<?>) FeedbackQuestionActivity.class);
            intent.putExtra(KEY_INTENT_ITEMS, json);
            this$0.startActivity(intent);
            return Unit.INSTANCE;
        }
        Logger.i(feedbackItemInfo.getTitle() + " has not sub item list, show detail", new Object[0]);
        this$0.showDetail(feedbackItemInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(FeedbackQuestionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchExtensionKt.startActivity$default(this$0, HistoryActivity.class, (Function1) null, 2, (Object) null);
    }

    private final void doOnFeedBackForLiBai(final FeedbackItemInfo info, final String type) {
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(a0j.S).setDialogDescription(a0j.Q).setNegativeText(a0j.f485a).setPositiveText(a0j.i).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity.doOnFeedBackForLiBai.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    FeedbackQuestionActivity.intentToFeedback$default(FeedbackQuestionActivity.this, info, type, null, 4, null);
                } else {
                    if (which != -1) {
                        return;
                    }
                    new WearosWatchLogHelper().startUploadFirmwareLog(LifecycleOwnerKt.getLifecycleScope(FeedbackQuestionActivity.this));
                    FeedbackQuestionActivity.intentToFeedback$default(FeedbackQuestionActivity.this, info, type, null, 4, null);
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

    private final void feedback(FeedbackItemInfo feedbackItemInfo) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!isUploadLog(wearableDeviceModel, feedbackItemInfo)) {
            intentToFeedback(feedbackItemInfo, getType(feedbackItemInfo.getModuleId()), null);
        } else {
            Intrinsics.checkNotNull(wearableDeviceModel);
            uploadLog(wearableDeviceModel, feedbackItemInfo, getType(feedbackItemInfo.getModuleId()));
        }
    }

    private final String getItemInfoStr() {
        List<FeedbackItemInfo> subItemList;
        FeedbackItemInfo feedbackItemInfo = this.mTagInfo;
        List<FeedbackItemInfo> subItemList2 = feedbackItemInfo != null ? feedbackItemInfo.getSubItemList() : null;
        if (subItemList2 == null || subItemList2.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        FeedbackItemInfo feedbackItemInfo2 = this.mTagInfo;
        if (feedbackItemInfo2 != null && (subItemList = feedbackItemInfo2.getSubItemList()) != null) {
            for (FeedbackItemInfo feedbackItemInfo3 : subItemList) {
                FeedbackItemInfo feedbackItemInfo4 = this.mTagInfo;
                Intrinsics.checkNotNull(feedbackItemInfo4);
                DeviceData deviceData = feedbackItemInfo4.getDeviceData();
                String title = feedbackItemInfo3.getTitle();
                int id = feedbackItemInfo3.getId();
                FeedbackItemInfo feedbackItemInfo5 = this.mTagInfo;
                Intrinsics.checkNotNull(feedbackItemInfo5);
                int id2 = feedbackItemInfo5.getId();
                FeedbackItemInfo feedbackItemInfo6 = this.mTagInfo;
                Intrinsics.checkNotNull(feedbackItemInfo6);
                arrayList.add(new FeedbackDeviceInfo(deviceData, -1, title, id, id2, feedbackItemInfo6.getTitle(), feedbackItemInfo3.getHasFaq(), feedbackItemInfo3.isEcoIot()));
            }
        }
        String strC = xpd.c(arrayList);
        Intrinsics.checkNotNullExpressionValue(strC, "getJson(...)");
        return strC;
    }

    private final String getType(int type) {
        if (type == 239) {
            return "threadmill";
        }
        if (type != 400) {
            return type != 401 ? "" : "weardevice";
        }
        return "app";
    }

    private final void intentToFeedback(FeedbackItemInfo info, String type, WearableDeviceModel deviceModel) {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!netUtil.getNetWorkAvailable(application)) {
            Application application2 = getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            ToastExtKt.toastShort(application2, a0j.h);
            return;
        }
        String itemInfoStr = getItemInfoStr();
        if (info.getDeviceData() != null) {
            Intent intent = new Intent();
            FeedbackItemInfo feedbackItemInfo = this.mTagInfo;
            intent.putExtra(FeedbackConstants.KEY_SELECTED_TYPE, feedbackItemInfo != null ? feedbackItemInfo.getTitle() : null);
            intent.putExtra(FeedbackConstants.KEY_CONTENT_TYPE, info.getTitle());
            intent.putExtra("device_model", deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : null);
            FeedbackItemInfo feedbackItemInfo2 = this.mTagInfo;
            intent.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, feedbackItemInfo2 != null ? Integer.valueOf(feedbackItemInfo2.getId()) : null);
            intent.putExtra(FeedbackConstants.KEY_SUB_TAG_ID, info.getId());
            intent.putExtra("type", type);
            intent.putExtra(FeedbackConstants.KEY_TAG_LIST, itemInfoStr);
            FeedbackItemInfo feedbackItemInfo3 = this.mTagInfo;
            intent.putExtra(FeedbackConstants.KEY_MODULE_ID, feedbackItemInfo3 != null ? Integer.valueOf(feedbackItemInfo3.getModuleId()) : null);
            intent.setClass(this, FeedbackActivity.class);
            startActivity(intent);
            return;
        }
        if (this.mTagInfo == null) {
            return;
        }
        MiuiFeedBack miuiFeedBack = new MiuiFeedBack();
        FeedbackItemInfo feedbackItemInfo4 = this.mTagInfo;
        Intrinsics.checkNotNull(feedbackItemInfo4);
        int id = feedbackItemInfo4.getId();
        FeedbackItemInfo feedbackItemInfo5 = this.mTagInfo;
        String title = feedbackItemInfo5 != null ? feedbackItemInfo5.getTitle() : null;
        String title2 = info.getTitle();
        FeedbackItemInfo feedbackItemInfo6 = this.mTagInfo;
        Intrinsics.checkNotNull(feedbackItemInfo6);
        Integer numValueOf = Integer.valueOf(feedbackItemInfo6.getId());
        Integer numValueOf2 = Integer.valueOf(info.getId());
        FeedbackItemInfo feedbackItemInfo7 = this.mTagInfo;
        miuiFeedBack.intentToFeedback(this, id, title, title2, itemInfoStr, "", type, numValueOf, numValueOf2, feedbackItemInfo7 != null ? feedbackItemInfo7.getModuleId() : 239);
    }

    public static /* synthetic */ void intentToFeedback$default(FeedbackQuestionActivity feedbackQuestionActivity, FeedbackItemInfo feedbackItemInfo, String str, WearableDeviceModel wearableDeviceModel, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            wearableDeviceModel = null;
        }
        feedbackQuestionActivity.intentToFeedback(feedbackItemInfo, str, wearableDeviceModel);
    }

    private final boolean isUploadLog(WearableDeviceModel deviceModel, FeedbackItemInfo feedbackItemInfo) {
        if (deviceModel == null) {
            return false;
        }
        FeedbackItemInfo feedbackItemInfo2 = this.mTagInfo;
        if (feedbackItemInfo2 != null && feedbackItemInfo2.getModuleId() == 239) {
            return false;
        }
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(deviceModel.getDid()) & 4) == 4;
        if (!deviceModel.getIsDeviceConnected() || (!com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isHuami(deviceModel.getProduct()) && !z)) {
            return false;
        }
        if (feedbackItemInfo.getDeviceData() != null) {
            String did = deviceModel.getDid();
            DeviceData deviceData = feedbackItemInfo.getDeviceData();
            if (!Intrinsics.areEqual(did, deviceData != null ? deviceData.getDid() : null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        final int i;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            i = 3;
        } else {
            UIUtils uIUtils = UIUtils.INSTANCE;
            i = (uIUtils.isTablet() && uIUtils.isLandscape(this)) ? 4 : 2;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                FeedbackItemInfo itemData = FeedbackQuestionActivity.access$getMViewModel(FeedbackQuestionActivity.this).getAdapter().getItemData(position);
                if (itemData == null) {
                    return 0;
                }
                if (itemData.getType() == 11) {
                    return 1;
                }
                return i;
            }
        });
        ((ji9) getMBinding()).A.setLayoutManager(gridLayoutManager);
    }

    private final void showDetail(FeedbackItemInfo feedbackItemInfo) {
        Logger.d(TAG, " url = " + feedbackItemInfo.getTitle());
        if (feedbackItemInfo.getHasFaq()) {
            showHelp(feedbackItemInfo);
        } else {
            feedback(feedbackItemInfo);
        }
    }

    private final void showHelp(final FeedbackItemInfo feedbackItemInfo) {
        String feedbackFAQUrl;
        String model;
        if (EcoExtKt.isUseEcoUrl(feedbackItemInfo.getDeviceData(), feedbackItemInfo.isEcoIot())) {
            DeviceData deviceData = feedbackItemInfo.getDeviceData();
            model = deviceData != null ? deviceData.getModel() : null;
            FeedbackItemInfo feedbackItemInfo2 = this.mTagInfo;
            Intrinsics.checkNotNull(feedbackItemInfo2);
            feedbackFAQUrl = EcoExtKt.getEcoFAQUrl(model, feedbackItemInfo2.getId(), feedbackItemInfo.getId());
        } else if (feedbackItemInfo.getModuleId() == 401 || feedbackItemInfo.getModuleId() == 400) {
            FeedbackItemInfo feedbackItemInfo3 = this.mTagInfo;
            Intrinsics.checkNotNull(feedbackItemInfo3);
            int moduleId = feedbackItemInfo3.getModuleId();
            FeedbackItemInfo feedbackItemInfo4 = this.mTagInfo;
            Intrinsics.checkNotNull(feedbackItemInfo4);
            feedbackFAQUrl = FeedbackWebUrlsKt.getFeedbackFAQUrl(moduleId, feedbackItemInfo4.getId(), feedbackItemInfo.getId());
        } else {
            DeviceData deviceData2 = feedbackItemInfo.getDeviceData();
            model = deviceData2 != null ? deviceData2.getModel() : null;
            FeedbackItemInfo feedbackItemInfo5 = this.mTagInfo;
            Intrinsics.checkNotNull(feedbackItemInfo5);
            feedbackFAQUrl = FeedbackWebUrlsKt.getFeedbackFAQUrl(model, feedbackItemInfo5.getId(), feedbackItemInfo.getId());
        }
        Logger.d(TAG, " url = " + feedbackFAQUrl);
        Intent intent = new Intent(this, (Class<?>) HealthWebViewActivity.class);
        intent.putExtra("data4", feedbackItemInfo.getTitle());
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", feedbackFAQUrl);
        startForActivityResult(intent, new Function2() { // from class: hj9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedbackQuestionActivity.showHelp$lambda$2(this.f20123a, feedbackItemInfo, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showHelp$lambda$2(FeedbackQuestionActivity this$0, FeedbackItemInfo feedbackItemInfo, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(feedbackItemInfo, "$feedbackItemInfo");
        if (i == 100) {
            if (intent == null) {
                return Unit.INSTANCE;
            }
            if (intent.getBooleanExtra("result", false)) {
                MainExtKt.showTabWithIndex(this$0, MainTab.INSTANCE.getINDEX_ME());
            } else {
                this$0.feedback(feedbackItemInfo);
            }
        }
        return Unit.INSTANCE;
    }

    private final void uploadLog(WearableDeviceModel deviceModel, FeedbackItemInfo info, String type) {
        if (DeviceModelExtKt.isWearOS(deviceModel)) {
            doOnFeedBackForLiBai(info, type);
            return;
        }
        this.mType = type;
        Logger.i(TAG, "upload isL67 " + com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isL67(deviceModel.getProduct()) + " bltNamePrefix is " + deviceModel.getProduct().getBltNamePrefix());
        if (owk.b() && info.getModuleId() == 400) {
            this.mFeedbackUploadDeviceLogDialog.showUploadDeviceLogDialog(this, deviceModel, this.handler, new Function1() { // from class: kj9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeedbackQuestionActivity.uploadLog$lambda$4(this.f23913a, ((Integer) obj).intValue());
                }
            });
        } else {
            intentToFeedback(info, type, deviceModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadLog$lambda$4(FeedbackQuestionActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakHandler weakHandler = this$0.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ji9 ji9Var) throws JSONException {
        Intrinsics.checkNotNullParameter(ji9Var, "<this>");
        ((FeedbackQuestionViewModel) getMViewModel()).getAdapter().setLifecycle(getLifecycle());
        ((FeedbackQuestionViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: ij9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FeedbackQuestionActivity.bindView$lambda$0(this.f21218a, (FeedbackItemInfo) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        setTitleBackground(gji.f19056a);
        String stringExtra = getIntent().getStringExtra(KEY_INTENT_ITEMS);
        if (stringExtra == null || stringExtra.length() == 0) {
            ((FeedbackQuestionViewModel) getMViewModel()).loadItemInfos();
            setTitle(a0j.G);
        } else {
            FeedbackItemInfo feedbackItemInfo = (FeedbackItemInfo) new Gson().fromJson(stringExtra, FeedbackItemInfo.class);
            ((FeedbackQuestionViewModel) getMViewModel()).getItems().clear();
            ObservableArrayList<FeedbackItemInfo> items = ((FeedbackQuestionViewModel) getMViewModel()).getItems();
            List<FeedbackItemInfo> subItemList = feedbackItemInfo.getSubItemList();
            Intrinsics.checkNotNull(subItemList);
            items.addAll(subItemList);
            setTitle(feedbackItemInfo.getTitle());
            this.mTagInfo = feedbackItemInfo;
        }
        IActionBar.DefaultImpls.setEndView$default(this, 0, mni.f27029b, getString(a0j.u), new View.OnClickListener() { // from class: jj9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackQuestionActivity.bindView$lambda$1(this.f22857a, view);
            }
        }, 1, null);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.e;
    }

    @Override // com.xiaomi.fitness.feedback.util.WeakHandler.HandlerMsgCallback
    public void handleMessage(@Nullable Message msg) {
        FeedbackItemInfo feedbackItemInfo;
        if (msg != null && msg.what == 1) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).addListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
            this.mCancelDialog = Boolean.FALSE;
            this.mFeedbackUploadDeviceLogDialog.showSyncOrUploadDeviceLogDialogLoading(this, a0j.K, a0j.L, new av6() { // from class: com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity.handleMessage.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        Logger.i(FeedbackQuestionActivity.TAG, "removeListenerBleLogLoadProgress user sync log cancel");
                        FeedbackQuestionActivity.this.mCancelDialog = Boolean.TRUE;
                        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(FeedbackQuestionActivity.this.mBleLogUploadProgressReceiver);
                        FeedbackItemInfo feedbackItemInfo2 = FeedbackQuestionActivity.this.mTagInfo;
                        if (feedbackItemInfo2 != null) {
                            FeedbackQuestionActivity feedbackQuestionActivity = FeedbackQuestionActivity.this;
                            FeedbackQuestionActivity.intentToFeedback$default(feedbackQuestionActivity, feedbackItemInfo2, feedbackQuestionActivity.mType, null, 4, null);
                        }
                    }
                }
            });
        } else {
            if (msg == null || msg.what != 2) {
                return;
            }
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil != null) {
                feedbackUploadDeviceLogDialogUtil.dismissSyncOrUploadDeviceLogDeviceLogDialogLoading();
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
            Logger.i("WEAROS_BUGREPORT", "MSG_DIALOG_DISMISS");
            if (!Intrinsics.areEqual(this.mCancelDialog, Boolean.FALSE) || (feedbackItemInfo = this.mTagInfo) == null) {
                return;
            }
            intentToFeedback$default(this, feedbackItemInfo, this.mType, null, 4, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }
}
