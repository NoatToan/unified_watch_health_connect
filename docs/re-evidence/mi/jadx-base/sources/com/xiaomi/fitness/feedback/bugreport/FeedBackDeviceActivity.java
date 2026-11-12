package com.xiaomi.fitness.feedback.bugreport;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.BleLogUploadProgressListener;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity;
import com.xiaomi.fitness.feedback.eco.EcoExtKt;
import com.xiaomi.fitness.feedback.eco.EcoFeedbackSupporter;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil;
import com.xiaomi.fitness.feedback.util.WeakHandler;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.a0j;
import defpackage.av6;
import defpackage.aw1;
import defpackage.gji;
import defpackage.hui;
import defpackage.li9;
import defpackage.owk;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u000b*\u0001c\b\u0007\u0018\u0000 l2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001lB\u0007¢\u0006\u0004\bk\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJu\u0010\u0019\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0$2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\bJ\u0019\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100Jo\u00103\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0014¢\u0006\u0004\b8\u0010\bJ\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010ARB\u0010D\u001a.\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010Bj\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u0001`C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010[R\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010g¨\u0006m"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesViewModel;", "Lli9;", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickListener;", "Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;", "", "initDataList", "()V", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "feedBack", "addDeviceInfo", "(Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "wideTagContent", "showContent", "json", "appName", "model", "type", "", "wideTagId", "subTagId", "uploadLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "doOnFeedBackForLiBai", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "list", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;", "feedbackDeviceInfo", "Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;", "deviceData", "", "getListFromFeedbackModelData", "(Ljava/util/List;Lcom/xiaomi/fitness/feedback/bugreport/FeedbackDeviceInfo;Lcom/xiaomi/fitness/feedback/bugreport/DeviceData;)Ljava/util/List;", "setLayoutManager", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "position", "onItemClick", "(Landroid/view/View;I)V", "intentToFeedback$feedback_chinaProductRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "intentToFeedback", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter;", "mDeviceAdapter", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceAdapter;", "mDataList", "Ljava/util/List;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mTagMap", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/feedback/bugreport/MiuiFeedBack;", "feedback", "Lcom/xiaomi/fitness/feedback/bugreport/MiuiFeedBack;", "", "isClickDeviceItem", "Z", "tagId", "I", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "handler", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "getHandler", "()Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "setHandler", "(Lcom/xiaomi/fitness/feedback/util/WeakHandler;)V", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "mFeedbackUploadDeviceLogDialog", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "mCancelDialog", "Ljava/lang/Boolean;", "mWideTagContent", "Ljava/lang/String;", "mShowContent", "mJson", "mAppName", "mWideTagId", "Ljava/lang/Integer;", "mSubTagId", "mType", "com/xiaomi/fitness/feedback/bugreport/FeedBackDeviceActivity$mBleLogUploadProgressReceiver$1", "mBleLogUploadProgressReceiver", "Lcom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceActivity$mBleLogUploadProgressReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedBackDeviceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBackDeviceActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1863#2,2:681\n1863#2,2:684\n1863#2,2:686\n1#3:683\n*S KotlinDebug\n*F\n+ 1 FeedBackDeviceActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedBackDeviceActivity\n*L\n169#1:681,2\n122#1:684,2\n137#1:686,2\n*E\n"})
public final class FeedBackDeviceActivity extends Hilt_FeedBackDeviceActivity<FeedbackTypesViewModel, li9> implements OnItemClickListener, WeakHandler.HandlerMsgCallback {

    @NotNull
    private static final String APP_LABEL_NAME = "applable";
    public static final int DEVICE_CAPABILITY_SUPPORT_LOG = 4;

    @NotNull
    private static final String TAG = "FeedBackDeviceFragment";
    private boolean isClickDeviceItem;

    @Nullable
    private String mAppName;

    @Nullable
    private FeedBackDeviceAdapter mDeviceAdapter;

    @Nullable
    private String mJson;

    @Nullable
    private String mShowContent;

    @Nullable
    private String mType;

    @Nullable
    private String mWideTagContent;
    private int tagId;

    @NotNull
    private List<FeedbackDeviceInfo> mDataList = new ArrayList();

    @Nullable
    private HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> mTagMap = new HashMap<>();

    @NotNull
    private final MiuiFeedBack feedback = new MiuiFeedBack();

    @Nullable
    private WeakHandler handler = new WeakHandler(this);

    @NotNull
    private FeedbackUploadDeviceLogDialogUtil mFeedbackUploadDeviceLogDialog = new FeedbackUploadDeviceLogDialogUtil();

    @Nullable
    private Boolean mCancelDialog = Boolean.FALSE;

    @Nullable
    private Integer mWideTagId = 0;

    @Nullable
    private Integer mSubTagId = 0;

    @NotNull
    private FeedBackDeviceActivity$mBleLogUploadProgressReceiver$1 mBleLogUploadProgressReceiver = new BleLogUploadProgressListener() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity$mBleLogUploadProgressReceiver$1
        @Override // com.example.statistics.export.BleLogUploadProgressListener
        public void uploadLogResult(boolean success) {
            Logger.i("FeedBackDeviceFragment", "dismissUploadDeviceLogDialogLoading " + success);
            WeakHandler handler = this.this$0.getHandler();
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        }
    };

    private final void addDeviceInfo(FeedBackModelData.FeedBackType feedBack) {
        HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> map;
        for (WearableDeviceModel wearableDeviceModel : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
            Logger.d(TAG, "deviceModel.product.category" + wearableDeviceModel.getProduct().getCategory() + ", feedBack.wideTagId is " + feedBack.getWideTagId() + " feedback is " + feedBack);
            if (Intrinsics.areEqual(feedBack.getCategory(), wearableDeviceModel.getProduct().getCategory())) {
                FeedbackDeviceInfo feedbackDeviceInfo = new FeedbackDeviceInfo(new DeviceData(null, wearableDeviceModel), 2, feedBack.getWideTagContent(), 0, feedBack.getWideTagId(), feedBack.getWideTagContent(), false, false, 200, null);
                this.mDataList.add(feedbackDeviceInfo);
                Logger.d(TAG, "info is " + feedbackDeviceInfo);
            }
        }
        List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBack.getTagList();
        if (tagList == null || (map = this.mTagMap) == null) {
            return;
        }
        map.put(feedBack.getWideTagContent(), tagList);
    }

    private final void doOnFeedBackForLiBai(final String wideTagContent, final String showContent, final String json, final String appName) {
        CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogTitle(a0j.S).setDialogDescription(a0j.Q).setNegativeText(a0j.f485a).setPositiveText(a0j.i).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity.doOnFeedBackForLiBai.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    FeedBackDeviceActivity feedBackDeviceActivity = FeedBackDeviceActivity.this;
                    FeedBackDeviceActivity.intentToFeedback$feedback_chinaProductRelease$default(feedBackDeviceActivity, wideTagContent, showContent, json, appName, null, feedBackDeviceActivity.mType, FeedBackDeviceActivity.this.mWideTagId, FeedBackDeviceActivity.this.mSubTagId, 16, null);
                } else {
                    if (which != -1) {
                        return;
                    }
                    new WearosWatchLogHelper().startUploadFirmwareLog(LifecycleOwnerKt.getLifecycleScope(FeedBackDeviceActivity.this));
                    FeedBackDeviceActivity feedBackDeviceActivity2 = FeedBackDeviceActivity.this;
                    FeedBackDeviceActivity.intentToFeedback$feedback_chinaProductRelease$default(feedBackDeviceActivity2, wideTagContent, showContent, json, appName, null, feedBackDeviceActivity2.mType, FeedBackDeviceActivity.this.mWideTagId, FeedBackDeviceActivity.this.mSubTagId, 16, null);
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

    public static /* synthetic */ void doOnFeedBackForLiBai$default(FeedBackDeviceActivity feedBackDeviceActivity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        feedBackDeviceActivity.doOnFeedBackForLiBai(str, str2, str3, str4);
    }

    private final List<FeedbackDeviceInfo> getListFromFeedbackModelData(List<FeedBackModelData.FeedBackType.SubTypeItem> list, FeedbackDeviceInfo feedbackDeviceInfo, DeviceData deviceData) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Logger.d(TAG, "getListFromFeedbackModelData list[i].showContent == " + list.get(i).getShowContent());
            AppUtil appUtil = AppUtil.INSTANCE;
            arrayList.add(new FeedbackDeviceInfo(deviceData, feedbackDeviceInfo.getType(), list.get(i).getShowContent(), list.get(i).getTagId(), feedbackDeviceInfo.getWideTagId(), feedbackDeviceInfo.getWideTagContent(), ((appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) && (!appUtil.isPlayChannel() || RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)))) ? false : list.get(i).getHasFaq(), false, 128, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List getListFromFeedbackModelData$default(FeedBackDeviceActivity feedBackDeviceActivity, List list, FeedbackDeviceInfo feedbackDeviceInfo, DeviceData deviceData, int i, Object obj) {
        if ((i & 4) != 0) {
            deviceData = null;
        }
        return feedBackDeviceActivity.getListFromFeedbackModelData(list, feedbackDeviceInfo, deviceData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDataList() {
        ((FeedbackTypesViewModel) getMViewModel()).getFeedbackList().observe(this, new FeedBackDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lh9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedBackDeviceActivity.initDataList$lambda$4(this.f25072a, (List) obj);
            }
        }));
        this.mDeviceAdapter = new FeedBackDeviceAdapter(this.mDataList, this);
        ((li9) getMBinding()).A.setAdapter(this.mDeviceAdapter);
        FeedBackDeviceAdapter feedBackDeviceAdapter = this.mDeviceAdapter;
        if (feedBackDeviceAdapter != null) {
            feedBackDeviceAdapter.setItemClickListener(this);
        }
        setLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initDataList$lambda$4(FeedBackDeviceActivity this$0, List list) {
        HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> map;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mDataList.clear();
        Logger.i(TAG, "tagId = " + this$0.tagId);
        Intrinsics.checkNotNull(list);
        List<FeedBackModelData.FeedBackType> list2 = list;
        for (FeedBackModelData.FeedBackType feedBackType : list2) {
            Logger.d(TAG, "FeedBackType = " + feedBackType);
            String category = feedBackType.getCategory();
            if (Intrinsics.areEqual(category, "wearable")) {
                this$0.addDeviceInfo(feedBackType);
            } else if (Intrinsics.areEqual(category, "equipment")) {
                EcoFeedbackSupporter.INSTANCE.addEcoDevice(feedBackType, this$0.mDataList, this$0.mTagMap);
            } else {
                Logger.i("This category(" + category + ") is not supported", new Object[0]);
            }
        }
        if (this$0.mDataList.size() > 0) {
            this$0.mDataList.add(0, null);
        }
        FeedbackDeviceInfo feedbackDeviceInfo = new FeedbackDeviceInfo(null, 1, APP_LABEL_NAME, 0, 0, null, false, false, 248, null);
        List<FeedbackDeviceInfo> list3 = this$0.mDataList;
        list3.add(list3.size(), feedbackDeviceInfo);
        for (FeedBackModelData.FeedBackType feedBackType2 : list2) {
            if (Intrinsics.areEqual("application", feedBackType2.getCategory())) {
                String wideTagContent = feedBackType2.getWideTagContent();
                Logger.d(TAG, "it1.showContent is " + wideTagContent);
                List<FeedBackModelData.FeedBackType.SubTypeItem> tagList = feedBackType2.getTagList();
                if (tagList != null && (map = this$0.mTagMap) != null) {
                    map.put(wideTagContent, tagList);
                }
                this$0.mDataList.add(new FeedbackDeviceInfo(null, 1, wideTagContent, 0, feedBackType2.getWideTagId(), feedBackType2.getWideTagContent(), false, false, 200, null));
            }
        }
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            this$0.mDataList.add(null);
        }
        FeedBackDeviceAdapter feedBackDeviceAdapter = this$0.mDeviceAdapter;
        if (feedBackDeviceAdapter != null) {
            feedBackDeviceAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void intentToFeedback$feedback_chinaProductRelease$default(FeedBackDeviceActivity feedBackDeviceActivity, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            num = 0;
        }
        if ((i & 128) != 0) {
            num2 = 0;
        }
        feedBackDeviceActivity.intentToFeedback$feedback_chinaProductRelease(str, str2, str3, str4, str5, str6, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$10(FeedBackDeviceActivity this$0, FeedbackDeviceInfo feedbackDeviceInfo, WearableDeviceModel wearableDeviceModel, Ref.ObjectRef dataList, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataList, "$dataList");
        if (i == 100) {
            if (intent == null) {
                return Unit.INSTANCE;
            }
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            String stringExtra = intent.getStringExtra("showContent");
            String stringExtra2 = intent.getStringExtra("wideTagContent");
            int intExtra = intent.getIntExtra(FeedbackConstants.KEY_MAIN_TAG_ID, 0);
            int intExtra2 = intent.getIntExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
            if (booleanExtra) {
                this$0.finish();
            } else {
                this$0.isClickDeviceItem = true;
                DeviceData deviceData = feedbackDeviceInfo != null ? feedbackDeviceInfo.getDeviceData() : null;
                Logger.e(TAG, "WEARDEVICE showContent: " + feedbackDeviceInfo.getAppName() + " >> " + feedbackDeviceInfo.getWideTagContent());
                Logger.e(TAG, "WEARDEVICE showContent is: " + stringExtra + " >> " + stringExtra2);
                if (wearableDeviceModel == null || deviceData == null) {
                    Logger.i(TAG, "DEVICES deviceModel did is " + wearableDeviceModel + ", clickDeviceModel.did is " + deviceData);
                    intentToFeedback$feedback_chinaProductRelease$default(this$0, stringExtra2, stringExtra, xpd.c((List) dataList.element), feedbackDeviceInfo.getAppName(), null, "weardevice", Integer.valueOf(intExtra), Integer.valueOf(intExtra2), 16, null);
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(wearableDeviceModel.getDid(), deviceData.getDid())) {
                    Logger.d(TAG, "deviceModel did is " + wearableDeviceModel.getDid() + ", clickDeviceModel.did is " + deviceData.getDid());
                    String strC = xpd.c((List) dataList.element);
                    String appName = feedbackDeviceInfo.getAppName();
                    DeviceData deviceData2 = feedbackDeviceInfo.getDeviceData();
                    this$0.intentToFeedback$feedback_chinaProductRelease(stringExtra2, stringExtra, strC, appName, deviceData2 != null ? deviceData2.getModel() : null, "weardevice", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
                    return Unit.INSTANCE;
                }
                Logger.i(TAG, "deviceModel " + wearableDeviceModel);
                String strC2 = xpd.c((List) dataList.element);
                String appName2 = feedbackDeviceInfo.getAppName();
                DeviceData deviceData3 = feedbackDeviceInfo.getDeviceData();
                this$0.uploadLog(wearableDeviceModel, stringExtra2, stringExtra, strC2, appName2, deviceData3 != null ? deviceData3.getModel() : null, "weardevice", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
            }
        }
        Logger.e(TAG, "connectDevice: " + i + " >> " + intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$12(FeedBackDeviceActivity this$0, Ref.ObjectRef dataList, FeedbackDeviceInfo feedbackDeviceInfo, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataList, "$dataList");
        if (i == 100) {
            Intrinsics.checkNotNull(intent);
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            String stringExtra = intent.getStringExtra("showContent");
            String stringExtra2 = intent.getStringExtra("wideTagContent");
            int intExtra = intent.getIntExtra(FeedbackConstants.KEY_MAIN_TAG_ID, 0);
            int intExtra2 = intent.getIntExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
            if (booleanExtra) {
                this$0.finish();
            } else {
                this$0.isClickDeviceItem = true;
                intentToFeedback$feedback_chinaProductRelease$default(this$0, stringExtra2, stringExtra, xpd.c((List) dataList.element), feedbackDeviceInfo.getAppName(), null, "threadmill", Integer.valueOf(intExtra), Integer.valueOf(intExtra2), 16, null);
            }
        }
        Logger.e("FeedbackActivity", "connectDevice: " + i + " >> " + intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$8(FeedBackDeviceActivity this$0, WearableDeviceModel wearableDeviceModel, Ref.ObjectRef dataList, FeedbackDeviceInfo feedbackDeviceInfo, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataList, "$dataList");
        if (i == 100) {
            if (intent == null) {
                return Unit.INSTANCE;
            }
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            String stringExtra = intent.getStringExtra("showContent");
            String stringExtra2 = intent.getStringExtra("wideTagContent");
            int intExtra = intent.getIntExtra(FeedbackConstants.KEY_MAIN_TAG_ID, 0);
            int intExtra2 = intent.getIntExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
            Logger.i(TAG, "APP wideTagId is " + intExtra + " subTagId is " + intExtra2);
            if (booleanExtra) {
                this$0.finish();
            } else {
                this$0.isClickDeviceItem = false;
                if (wearableDeviceModel == null) {
                    intentToFeedback$feedback_chinaProductRelease$default(this$0, stringExtra2, stringExtra, xpd.c((List) dataList.element), feedbackDeviceInfo.getAppName(), null, "app", Integer.valueOf(intExtra), Integer.valueOf(intExtra2), 16, null);
                    return Unit.INSTANCE;
                }
                String strC = xpd.c((List) dataList.element);
                String appName = feedbackDeviceInfo.getAppName();
                DeviceData deviceData = feedbackDeviceInfo.getDeviceData();
                this$0.uploadLog(wearableDeviceModel, stringExtra2, stringExtra, strC, appName, deviceData != null ? deviceData.getModel() : null, "app", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
            }
        }
        Logger.e("FeedbackActivity", "connectDevice: " + i + " >> " + intent);
        return Unit.INSTANCE;
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
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                FeedBackDeviceAdapter feedBackDeviceAdapter = FeedBackDeviceActivity.this.mDeviceAdapter;
                Integer numValueOf = feedBackDeviceAdapter != null ? Integer.valueOf(feedBackDeviceAdapter.getItemViewType(position)) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    return i;
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    return 1;
                }
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    return i;
                }
                if (numValueOf != null && numValueOf.intValue() == 4) {
                    return i;
                }
                return 1;
            }
        });
        ((li9) getMBinding()).A.setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadLog(WearableDeviceModel deviceModel, String wideTagContent, String showContent, String json, String appName, String model, String type, Integer wideTagId, Integer subTagId) {
        String did;
        FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil;
        Product product;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        int deviceCapability = deviceManagerExtKt.getDeviceCapability(did) & 4;
        if ((deviceModel != null && !deviceModel.getIsDeviceConnected()) || (deviceModel != null && (product = deviceModel.getProduct()) != null && !DeviceModelExtKt.isHuami(product) && deviceCapability != 4)) {
            Logger.i(TAG, "uploadLog intentToFeedback");
            intentToFeedback$feedback_chinaProductRelease$default(this, wideTagContent, showContent, json, appName, null, this.mType, wideTagId, subTagId, 16, null);
            return;
        }
        if (deviceModel == null) {
            return;
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(deviceModel)) {
            doOnFeedBackForLiBai$default(this, null, null, null, null, 15, null);
            return;
        }
        Logger.i(TAG, "upload isL67 " + DeviceModelExtKt.isL67(deviceModel.getProduct()) + " bltNamePrefix is " + deviceModel.getProduct().getBltNamePrefix());
        this.mWideTagContent = wideTagContent;
        this.mShowContent = showContent;
        this.mJson = json;
        this.mAppName = appName;
        this.mWideTagId = wideTagId;
        this.mSubTagId = subTagId;
        this.mType = type;
        if (this.isClickDeviceItem || !owk.b()) {
            intentToFeedback$feedback_chinaProductRelease(wideTagContent, showContent, json, appName, model, type, wideTagId, subTagId);
        } else if (deviceModel.getIsDeviceConnected() && (feedbackUploadDeviceLogDialogUtil = this.mFeedbackUploadDeviceLogDialog) != null) {
            feedbackUploadDeviceLogDialogUtil.showUploadDeviceLogDialog(this, deviceModel, this.handler, new Function1() { // from class: kh9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FeedBackDeviceActivity.uploadLog$lambda$13(this.f23847a, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadLog$lambda$13(FeedBackDeviceActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakHandler weakHandler = this$0.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(i);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final WeakHandler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return aw1.f3504a;
    }

    @Override // com.xiaomi.fitness.feedback.util.WeakHandler.HandlerMsgCallback
    public void handleMessage(@Nullable Message msg) {
        if (msg != null && msg.what == 1) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).addListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
            this.mCancelDialog = Boolean.FALSE;
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil != null) {
                feedbackUploadDeviceLogDialogUtil.showSyncOrUploadDeviceLogDialogLoading(this, a0j.K, a0j.L, new av6() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity.handleMessage.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            Logger.i(FeedBackDeviceActivity.TAG, "removeListenerBleLogLoadProgress user sync log cancel");
                            FeedBackDeviceActivity.this.mCancelDialog = Boolean.TRUE;
                            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(FeedBackDeviceActivity.this.mBleLogUploadProgressReceiver);
                            FeedBackDeviceActivity feedBackDeviceActivity = FeedBackDeviceActivity.this;
                            FeedBackDeviceActivity.intentToFeedback$feedback_chinaProductRelease$default(feedBackDeviceActivity, feedBackDeviceActivity.mWideTagContent, FeedBackDeviceActivity.this.mShowContent, FeedBackDeviceActivity.this.mJson, FeedBackDeviceActivity.this.mAppName, null, FeedBackDeviceActivity.this.mType, FeedBackDeviceActivity.this.mWideTagId, FeedBackDeviceActivity.this.mSubTagId, 16, null);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (msg == null || msg.what != 2) {
            return;
        }
        this.mFeedbackUploadDeviceLogDialog.dismissSyncOrUploadDeviceLogDeviceLogDialogLoading();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
        Logger.i("WEAROS_BUGREPORT", "MSG_DIALOG_DISMISS");
        if (Intrinsics.areEqual(this.mCancelDialog, Boolean.FALSE)) {
            intentToFeedback$feedback_chinaProductRelease$default(this, this.mWideTagContent, this.mShowContent, this.mJson, this.mAppName, null, this.mType, this.mWideTagId, this.mSubTagId, 16, null);
        }
    }

    public final void intentToFeedback$feedback_chinaProductRelease(@Nullable String wideTagContent, @Nullable String showContent, @Nullable String json, @Nullable String appName, @Nullable String deviceModel, @Nullable String type, @Nullable Integer wideTagId, @Nullable Integer subTagId) {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!netUtil.getNetWorkAvailable(application)) {
            Application application2 = getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            ToastExtKt.toastShort(application2, a0j.h);
            return;
        }
        if (!this.isClickDeviceItem) {
            this.feedback.intentToFeedback(this, this.tagId, wideTagContent, showContent, json, appName, type, wideTagId, subTagId, 239);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(FeedbackConstants.KEY_TAG_ID, this.tagId);
        intent.putExtra(FeedbackConstants.KEY_SELECTED_TYPE, wideTagContent);
        intent.putExtra(FeedbackConstants.KEY_CONTENT_TYPE, showContent);
        intent.putExtra(FeedbackConstants.KEY_TAG_LIST, json);
        intent.putExtra(FeedbackConstants.KEY_APP_NAME, appName);
        intent.putExtra("device_model", deviceModel);
        intent.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, wideTagId);
        intent.putExtra(FeedbackConstants.KEY_SUB_TAG_ID, subTagId);
        intent.putExtra("type", type);
        intent.putExtra(FeedbackConstants.KEY_MODULE_ID, 239);
        intent.setClass(this, FeedbackActivity.class);
        startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.feedback.bugreport.Hilt_FeedBackDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        super.onCreate(savedInstanceState);
        ((FeedbackTypesViewModel) getMViewModel()).loadTypes();
        setTitle(a0j.G);
        setTitleBackground(gji.f19056a);
        initDataList();
    }

    @Override // com.xiaomi.fitness.feedback.bugreport.Hilt_FeedBackDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.util.ArrayList] */
    @Override // com.xiaomi.fitness.feedback.bugreport.OnItemClickListener
    public void onItemClick(@Nullable View view, int position) {
        final FeedbackDeviceInfo feedbackDeviceInfo;
        if (position <= this.mDataList.size() - 1 && (feedbackDeviceInfo = this.mDataList.get(position)) != null) {
            DeviceData deviceData = feedbackDeviceInfo.getDeviceData();
            Logger.i(TAG, "feedbackDeviceInfo is " + feedbackDeviceInfo + " did is " + (deviceData != null ? deviceData.getDid() : null));
            final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            int type = feedbackDeviceInfo.getType();
            if (type == 1) {
                HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> map = this.mTagMap;
                List<FeedBackModelData.FeedBackType.SubTypeItem> list = map != null ? map.get(feedbackDeviceInfo.getAppName()) : null;
                Intent intent = new Intent();
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = new ArrayList();
                if (list != null) {
                    objectRef.element = getListFromFeedbackModelData$default(this, list, feedbackDeviceInfo, null, 4, null);
                }
                intent.putExtra(FeedbackConstants.KEY_TAG_ID_FROM_WEB, feedbackDeviceInfo.getAppName());
                intent.putExtra(FeedbackConstants.KEY_SUB_TAG_ID_FROM_WEB, xpd.c((List) objectRef.element));
                intent.setClass(this, FeedBackSubCategoryActivity.class);
                startForActivityResult(intent, new Function2() { // from class: mh9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FeedBackDeviceActivity.onItemClick$lambda$8(this.f26179a, wearableDeviceModel, objectRef, feedbackDeviceInfo, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            } else if (type == 2) {
                Logger.i(TAG, "mTagMap feedbackDeviceInfo.appName == " + feedbackDeviceInfo.getAppName());
                HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> map2 = this.mTagMap;
                List<FeedBackModelData.FeedBackType.SubTypeItem> list2 = map2 != null ? map2.get(feedbackDeviceInfo.getAppName()) : null;
                Intent intent2 = new Intent();
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = new ArrayList();
                if (list2 != null) {
                    objectRef2.element = getListFromFeedbackModelData(list2, feedbackDeviceInfo, feedbackDeviceInfo.getDeviceData());
                }
                intent2.putExtra(FeedbackConstants.KEY_TAG_ID_FROM_WEB, feedbackDeviceInfo.getAppName());
                intent2.putExtra(FeedbackConstants.KEY_SUB_TAG_ID_FROM_WEB, xpd.c((List) objectRef2.element));
                intent2.setClass(this, FeedBackSubCategoryActivity.class);
                startForActivityResult(intent2, new Function2() { // from class: nh9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FeedBackDeviceActivity.onItemClick$lambda$10(this.f27929a, feedbackDeviceInfo, wearableDeviceModel, objectRef2, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            }
            if (EcoExtKt.isEco(feedbackDeviceInfo.getType())) {
                Logger.i(TAG, "THREADMILL feedbackDeviceInfo.appName == " + feedbackDeviceInfo.getAppName());
                HashMap<String, List<FeedBackModelData.FeedBackType.SubTypeItem>> map3 = this.mTagMap;
                List<FeedBackModelData.FeedBackType.SubTypeItem> list3 = map3 != null ? map3.get(feedbackDeviceInfo.getAppName()) : null;
                Intent intent3 = new Intent();
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = new ArrayList();
                if (list3 != null) {
                    objectRef3.element = getListFromFeedbackModelData(list3, feedbackDeviceInfo, feedbackDeviceInfo.getDeviceData());
                }
                intent3.putExtra(FeedbackConstants.KEY_TAG_ID_FROM_WEB, feedbackDeviceInfo.getAppName());
                intent3.putExtra(FeedbackConstants.KEY_SUB_TAG_ID_FROM_WEB, xpd.c((List) objectRef3.element));
                intent3.setClass(this, FeedBackSubCategoryActivity.class);
                startForActivityResult(intent3, new Function2() { // from class: oh9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FeedBackDeviceActivity.onItemClick$lambda$12(this.f29168a, objectRef3, feedbackDeviceInfo, ((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            }
        }
    }

    public final void setHandler(@Nullable WeakHandler weakHandler) {
        this.handler = weakHandler;
    }
}
