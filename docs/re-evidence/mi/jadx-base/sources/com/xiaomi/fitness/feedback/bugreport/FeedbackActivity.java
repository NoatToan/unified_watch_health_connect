package com.xiaomi.fitness.feedback.bugreport;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.statistics.export.BleLogUploadProgressListener;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.single.Weak;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.FeedbackActivity;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.feedback.util.FeedbackFileUtils;
import com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil;
import com.xiaomi.fitness.feedback.util.RTLUtilKt;
import com.xiaomi.fitness.feedback.util.WeakHandler;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.a0j;
import defpackage.av6;
import defpackage.bv1;
import defpackage.di9;
import defpackage.fci;
import defpackage.gji;
import defpackage.hui;
import defpackage.mni;
import defpackage.xpd;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\f*\u0001\\\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001fB\u0007¢\u0006\u0004\be\u0010\rJ\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0012J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0011\u0010'\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b%\u0010&J#\u0010,\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\rJ\u0019\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000bH\u0014¢\u0006\u0004\b3\u0010\rR\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010;R\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u00108R\u0018\u0010O\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R$\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010FR\u0014\u0010b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010a¨\u0006g"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackViewModel;", "Ldi9;", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;", "Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;", "", "id", "Landroid/text/SpannedString;", "getHintString", "(I)Landroid/text/SpannedString;", "", "openGallery", "()V", "onUploadClick", "uploadDeviceLog", "msgRes", "showLoading", "(I)V", "", "cancelLoading", "()Z", "showSelectLogDialog", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "syncDeviceLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "textRes", "showToastMsg", "isSuccess", "onUploadResult", "(Z)V", "", "getExternalFilesDirPath$feedback_chinaProductRelease", "()Ljava/lang/String;", "getExternalFilesDirPath", "Landroid/view/View;", "view", "", "any", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", "onBackPressed", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/widget/Toast;", "sToast", "Landroid/widget/Toast;", "DESC_NUM_MAX", "I", "DESC_NUM_MIN", "mSelectedTypeString", "Ljava/lang/String;", "mSubTagID", "mMainTagID", "Lfci;", "loadingDialog", "Lfci;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter;", "mImgAdapter", "Lcom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter;", "TAG", "mIsUploadLogFile", "Z", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "mFeedBackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mSelectLogDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mSelectDeviceMode", "DEVICE_CAPABILITY_SUPPORT_LOG", "mCancelDialog", "Ljava/lang/Boolean;", "mType", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "handler", "Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "getHandler", "()Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "setHandler", "(Lcom/xiaomi/fitness/feedback/util/WeakHandler;)V", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "mFeedbackUploadDeviceLogDialog", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "com/xiaomi/fitness/feedback/bugreport/FeedbackActivity$mBleLogUploadProgressReceiver$1", "mBleLogUploadProgressReceiver", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity$mBleLogUploadProgressReceiver$1;", "pickImageProcess", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "SimpleTextWatcher", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFeedbackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedbackActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,555:1\n108#2:556\n80#2,22:557\n108#2:579\n80#2,22:580\n108#2:602\n80#2,22:603\n*S KotlinDebug\n*F\n+ 1 FeedbackActivity.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedbackActivity\n*L\n243#1:556\n243#1:557,22\n244#1:579\n244#1:580,22\n245#1:602\n245#1:603,22\n*E\n"})
public final class FeedbackActivity extends BaseBindingActivity<FeedbackViewModel, di9> implements OnItemClickCallBack, WeakHandler.HandlerMsgCallback {

    @Nullable
    private fci loadingDialog;

    @Nullable
    private FeedImgAdapter mImgAdapter;
    private boolean mIsUploadLogFile;
    private int mMainTagID;

    @Nullable
    private String mSelectDeviceMode;

    @Nullable
    private CommonDialog<?> mSelectLogDialog;

    @Nullable
    private String mSelectedTypeString;
    private int mSubTagID;

    @Nullable
    private String mType;
    private boolean pickImageProcess;

    @Nullable
    private Toast sToast;
    private final int DESC_NUM_MAX = 500;
    private final int DESC_NUM_MIN = 10;

    @NotNull
    private final String TAG = "FeedActivity";

    @NotNull
    private FeedBackModelData mFeedBackModel = new FeedBackModelData();
    private final int DEVICE_CAPABILITY_SUPPORT_LOG = 4;

    @Nullable
    private Boolean mCancelDialog = Boolean.FALSE;

    @Nullable
    private WeakHandler handler = new WeakHandler(this);

    @NotNull
    private FeedbackUploadDeviceLogDialogUtil mFeedbackUploadDeviceLogDialog = new FeedbackUploadDeviceLogDialogUtil();

    @NotNull
    private FeedbackActivity$mBleLogUploadProgressReceiver$1 mBleLogUploadProgressReceiver = new BleLogUploadProgressListener() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedbackActivity$mBleLogUploadProgressReceiver$1
        @Override // com.example.statistics.export.BleLogUploadProgressListener
        public void uploadLogResult(boolean success) {
            Logger.i(this.this$0.TAG, "dismissUploadDeviceLogDialogLoading " + success);
            FeedbackActivity.access$getMViewModel(this.this$0).uploadInfo(this.this$0.mIsUploadLogFile, this.this$0.mFeedBackModel, this.this$0.getExternalFilesDirPath$feedback_chinaProductRelease());
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J*\u0010\u0015\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0018H\u0016R/\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity$SimpleTextWatcher;", "Landroid/text/TextWatcher;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity;", "<init>", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity;)V", "<set-?>", "act", "getAct", "()Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity;", "setAct", "act$delegate", "Lcom/xiaomi/fitness/common/single/Weak;", "beforeTextChanged", "", "s", "", StatConstants.PARAM_START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SimpleTextWatcher implements TextWatcher {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SimpleTextWatcher.class, "act", "getAct()Lcom/xiaomi/fitness/feedback/bugreport/FeedbackActivity;", 0))};

        /* JADX INFO: renamed from: act$delegate, reason: from kotlin metadata */
        @NotNull
        private final Weak act;

        public SimpleTextWatcher(@NotNull FeedbackActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.act = new Weak();
            setAct(activity);
        }

        private final FeedbackActivity getAct() {
            return (FeedbackActivity) this.act.getValue(this, $$delegatedProperties[0]);
        }

        private final void setAct(FeedbackActivity feedbackActivity) {
            this.act.setValue(this, $$delegatedProperties[0], feedbackActivity);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s) {
            di9 di9VarAccess$getMBinding;
            TextView textView;
            Intrinsics.checkNotNull(s);
            int length = s.length();
            FeedbackActivity act = getAct();
            if (act == null || (di9VarAccess$getMBinding = FeedbackActivity.access$getMBinding(act)) == null || (textView = di9VarAccess$getMBinding.R) == null) {
                return;
            }
            FeedbackActivity act2 = getAct();
            textView.setText(act2 != null ? act2.getString(a0j.O, Integer.valueOf(length)) : null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
        }
    }

    public static final /* synthetic */ di9 access$getMBinding(FeedbackActivity feedbackActivity) {
        return feedbackActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FeedbackViewModel access$getMViewModel(FeedbackActivity feedbackActivity) {
        return (FeedbackViewModel) feedbackActivity.getMViewModel();
    }

    private final boolean cancelLoading() {
        return false;
    }

    private final SpannedString getHintString(int id) {
        SpannableString spannableString = new SpannableString(getString(id));
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(FeedbackActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onUploadClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(FeedbackActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().K.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(final FeedbackActivity this$0, List list, final String str, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getIntent().putExtra(FeedbackConstants.KEY_SHOW_RIGHT, false);
        this$0.getIntent().putExtra(FeedbackConstants.KEY_TAG_ID_FROM_WEB, this$0.getString(a0j.H));
        this$0.getIntent().putExtra(FeedbackConstants.KEY_SUB_TAG_ID_FROM_WEB, xpd.c(list));
        this$0.getIntent().setClass(this$0, FeedBackSubCategoryActivity.class);
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this$0.startForActivityResult(intent, new Function2() { // from class: ci9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedbackActivity.onCreate$lambda$3$lambda$2(this.f5368a, str, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3$lambda$2(FeedbackActivity this$0, String str, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 100) {
            if (intent == null) {
                return Unit.INSTANCE;
            }
            String stringExtra = intent.getStringExtra("showContent");
            String stringExtra2 = intent.getStringExtra("wideTagContent");
            this$0.mMainTagID = intent.getIntExtra(FeedbackConstants.KEY_MAIN_TAG_ID, 0);
            this$0.mSubTagID = intent.getIntExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
            this$0.mSelectedTypeString = str + " - " + stringExtra;
            Logger.i(this$0.TAG, "showContent: " + stringExtra + " >> " + stringExtra2);
            this$0.getMBinding().E.setText(stringExtra2 + "-" + stringExtra);
        }
        Logger.i("FeedbackActivity", "connectDevice: " + i + " >> " + intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(FeedbackActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        sb.append("uploadResult: ");
        sb.append(bool);
        FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = this$0.mFeedbackUploadDeviceLogDialog;
        if (feedbackUploadDeviceLogDialogUtil != null) {
            feedbackUploadDeviceLogDialogUtil.dismissSyncOrUploadDeviceLogDeviceLogDialogLoading();
        }
        Intrinsics.checkNotNull(bool);
        this$0.onUploadResult(bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final void onUploadClick() {
        if (!NetworkUtils.isNetworkConnected(this)) {
            showToastMsg(a0j.common_hint_network_unavailable);
            return;
        }
        String string = getMBinding().A.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        String string3 = getMBinding().N.getText().toString();
        int length2 = string3.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.compare((int) string3.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length2--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        String string4 = string3.subSequence(i2, length2 + 1).toString();
        String string5 = getMBinding().M.getText().toString();
        int length3 = string5.length() - 1;
        int i3 = 0;
        boolean z5 = false;
        while (i3 <= length3) {
            boolean z6 = Intrinsics.compare((int) string5.charAt(!z5 ? i3 : length3), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length3--;
                }
            } else if (z6) {
                i3++;
            } else {
                z5 = true;
            }
        }
        String string6 = string5.subSequence(i3, length3 + 1).toString();
        this.mIsUploadLogFile = getMBinding().K.isChecked();
        if (TextUtils.isEmpty(string2)) {
            showToastMsg(a0j.w);
            return;
        }
        if (TextUtils.isEmpty(string4) && TextUtils.isEmpty(string6)) {
            showToastMsg(a0j.j);
            return;
        }
        if (string2.length() < this.DESC_NUM_MIN) {
            showToastMsg(a0j.M);
            return;
        }
        if (string2.length() > this.DESC_NUM_MAX) {
            showToastMsg(a0j.N);
            return;
        }
        this.mFeedBackModel.setModule_id(getIntent().getIntExtra(FeedbackConstants.KEY_MODULE_ID, 400));
        this.mFeedBackModel.setContent(string2);
        this.mFeedBackModel.setMi_wide_tag_id(this.mMainTagID);
        this.mFeedBackModel.setMi_tag_id(this.mSubTagID);
        this.mFeedBackModel.setContact(new FeedBackModelData.Contact());
        FeedBackModelData.Contact contact = this.mFeedBackModel.getContact();
        Intrinsics.checkNotNull(contact);
        contact.setPhone(string4);
        FeedBackModelData.Contact contact2 = this.mFeedBackModel.getContact();
        Intrinsics.checkNotNull(contact2);
        contact2.setEmail(string6);
        this.mFeedBackModel.setTags(new ArrayList());
        List<String> tags = this.mFeedBackModel.getTags();
        if (tags == null) {
            return;
        }
        ListExtKt.add(tags, this.mSelectedTypeString);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            this.mFeedBackModel.setDid(wearableDeviceModel.getDid());
            this.mFeedBackModel.setModel(DeviceModelExtKt.getModel(wearableDeviceModel));
            this.mFeedBackModel.setFw_version(DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel));
        }
        this.mFeedBackModel.setVersion_code(AppUtil.getVersionCode());
        this.mFeedBackModel.setVersion_name(AppUtil.getVersionName());
        this.mFeedBackModel.setRegion(RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry());
        uploadDeviceLog();
    }

    private final void openGallery() {
        if (this.pickImageProcess) {
            return;
        }
        this.pickImageProcess = true;
        startForActivityResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), new Function2() { // from class: uh9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeedbackActivity.openGallery$lambda$5(this.f35755a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit openGallery$lambda$5(FeedbackActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pickImageProcess = false;
        Uri data = intent != null ? intent.getData() : null;
        Logger.i(this$0.TAG, "uri: " + data + " >> " + intent + " >> " + (intent != null ? intent.getData() : null));
        if (data == null) {
            return Unit.INSTANCE;
        }
        FeedImgAdapter feedImgAdapter = this$0.mImgAdapter;
        if (feedImgAdapter != null) {
            feedImgAdapter.addData(data);
        }
        ((FeedbackViewModel) this$0.getMViewModel()).copyFileToLog(data);
        Logger.i(this$0.TAG, "connectDevice: " + i + " >> " + intent + " >> " + i);
        return Unit.INSTANCE;
    }

    private final void showLoading(int msgRes) {
        String string = getString(msgRes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showLoading(string, 0, true);
    }

    @SuppressLint({"InflateParams"})
    private final void showSelectLogDialog() {
        CommonDialog<?> commonDialog = this.mSelectLogDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.mSelectLogDialog == null) {
                this.mSelectLogDialog = new CommonDialog.c("choice").setDialogTitle(a0j.q).setDialogDescription(a0j.R).setNegativeText(a0j.f487k).setPositiveText(a0j.I).setCanceledOnBackPressed(false).setCancelable(false).create();
            }
            CommonDialog<?> commonDialog2 = this.mSelectLogDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedbackActivity.showSelectLogDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            FeedbackActivity.access$getMViewModel(FeedbackActivity.this).uploadInfo(FeedbackActivity.this.mIsUploadLogFile, FeedbackActivity.this.mFeedBackModel, FeedbackActivity.this.getExternalFilesDirPath$feedback_chinaProductRelease());
                        } else if (which == -1) {
                            FeedbackActivity.this.mIsUploadLogFile = true;
                            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                            Logger.i(FeedbackActivity.this.TAG, "uploadDeviceLog is " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null));
                            if (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected()) {
                                FeedbackActivity.access$getMViewModel(FeedbackActivity.this).uploadInfo(FeedbackActivity.this.mIsUploadLogFile, FeedbackActivity.this.mFeedBackModel, FeedbackActivity.this.getExternalFilesDirPath$feedback_chinaProductRelease());
                                return;
                            }
                            FeedbackActivity.this.syncDeviceLog(wearableDeviceModel);
                        }
                        CommonDialog commonDialog3 = FeedbackActivity.this.mSelectLogDialog;
                        if (commonDialog3 != null) {
                            commonDialog3.dismiss();
                        }
                        FeedbackActivity.this.mSelectLogDialog = null;
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.mSelectLogDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncDeviceLog(WearableDeviceModel device) {
        if (device == null || !device.getIsDeviceConnected() || StringsKt__StringsJVMKt.equals$default(this.mType, "threadmill", false, 2, null) || (StringsKt__StringsJVMKt.equals$default(this.mType, "weardevice", false, 2, null) && !Intrinsics.areEqual(DeviceModelExtKt.getModel(device), this.mSelectDeviceMode))) {
            ((FeedbackViewModel) getMViewModel()).uploadInfo(this.mIsUploadLogFile, this.mFeedBackModel, getExternalFilesDirPath$feedback_chinaProductRelease());
            return;
        }
        if (DeviceModelExtKt.isHuaMi(device)) {
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil != null) {
                feedbackUploadDeviceLogDialogUtil.syncHuamiDeviceLog(device, new Function1() { // from class: zh9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeedbackActivity.syncDeviceLog$lambda$9(this.f41270a, ((Integer) obj).intValue());
                    }
                });
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isWearOS(device)) {
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil2 = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil2 != null) {
                feedbackUploadDeviceLogDialogUtil2.syncWearOsBugreport(this, device, new Function1() { // from class: ai9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeedbackActivity.syncDeviceLog$lambda$10(this.f1049a, ((Integer) obj).intValue());
                    }
                });
                return;
            }
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String did = device.getDid();
        if (did == null) {
            did = "";
        }
        int deviceCapability = deviceManagerExtKt.getDeviceCapability(did);
        int i = this.DEVICE_CAPABILITY_SUPPORT_LOG;
        if ((deviceCapability & i) == i) {
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil3 = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil3 != null) {
                feedbackUploadDeviceLogDialogUtil3.syncBleDeviceLog(device, new Function1() { // from class: bi9
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FeedbackActivity.syncDeviceLog$lambda$11(this.f4241a, ((Integer) obj).intValue());
                    }
                });
                return;
            }
            return;
        }
        Logger.i(this.TAG, "uploadInfo feedbackModel " + this.mFeedBackModel);
        ((FeedbackViewModel) getMViewModel()).uploadInfo(this.mIsUploadLogFile, this.mFeedBackModel, getExternalFilesDirPath$feedback_chinaProductRelease());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncDeviceLog$lambda$10(FeedbackActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakHandler weakHandler = this$0.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncDeviceLog$lambda$11(FeedbackActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakHandler weakHandler = this$0.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncDeviceLog$lambda$9(FeedbackActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakHandler weakHandler = this$0.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(i);
        }
        return Unit.INSTANCE;
    }

    private final void uploadDeviceLog() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(this.TAG, "uploadDeviceLog is " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null) + " mSelectDeviceMode is " + this.mSelectDeviceMode + " device?.model is " + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        if (this.mIsUploadLogFile) {
            syncDeviceLog(wearableDeviceModel);
        } else {
            showSelectLogDialog();
        }
    }

    @Nullable
    public final String getExternalFilesDirPath$feedback_chinaProductRelease() {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(FeedbackFileUtils.INSTANCE.getLOG_DIR());
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + externalFilesDir;
    }

    @Nullable
    public final WeakHandler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.f20475a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.f4630a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.feedback.util.WeakHandler.HandlerMsgCallback
    public void handleMessage(@Nullable Message msg) {
        Logger.i(this.TAG, "handleMessage msg " + (msg != null ? Integer.valueOf(msg.what) : null));
        if (msg != null && msg.what == 1) {
            this.mCancelDialog = Boolean.FALSE;
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).addListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
            FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil = this.mFeedbackUploadDeviceLogDialog;
            if (feedbackUploadDeviceLogDialogUtil != null) {
                feedbackUploadDeviceLogDialogUtil.showSyncOrUploadDeviceLogDialogLoading(this, a0j.K, a0j.L, new av6() { // from class: com.xiaomi.fitness.feedback.bugreport.FeedbackActivity.handleMessage.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            FeedbackActivity.this.mCancelDialog = Boolean.TRUE;
                            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(FeedbackActivity.this.mBleLogUploadProgressReceiver);
                            FeedbackActivity.access$getMViewModel(FeedbackActivity.this).uploadInfo(FeedbackActivity.this.mIsUploadLogFile, FeedbackActivity.this.mFeedBackModel, FeedbackActivity.this.getExternalFilesDirPath$feedback_chinaProductRelease());
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
        FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil2 = this.mFeedbackUploadDeviceLogDialog;
        if (feedbackUploadDeviceLogDialogUtil2 != null) {
            feedbackUploadDeviceLogDialogUtil2.dismissSyncOrUploadDeviceLogDeviceLogDialogLoading();
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
        Logger.i("WEAROS_BUGREPORT", "MSG_DIALOG_DISMISS");
        if (Intrinsics.areEqual(this.mCancelDialog, Boolean.FALSE)) {
            ((FeedbackViewModel) getMViewModel()).uploadInfo(this.mIsUploadLogFile, this.mFeedBackModel, getExternalFilesDirPath$feedback_chinaProductRelease());
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        super.lambda$onCreate$0();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n", "RtlHardcoded"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(a0j.y);
        setTitleBackground(gji.f19056a);
        final String stringExtra = getIntent().getStringExtra(FeedbackConstants.KEY_SELECTED_TYPE);
        String stringExtra2 = getIntent().getStringExtra(FeedbackConstants.KEY_CONTENT_TYPE);
        String stringExtra3 = getIntent().getStringExtra(FeedbackConstants.KEY_TAG_LIST);
        this.mSelectDeviceMode = getIntent().getStringExtra("device_model");
        this.mType = getIntent().getStringExtra("type");
        final List listG = xpd.g(stringExtra3, FeedbackDeviceInfo.class);
        Logger.i(this.TAG, "selectType is " + stringExtra + " showContent is " + stringExtra2);
        if (stringExtra != null && stringExtra2 != null) {
            getMBinding().E.setText(stringExtra + " - " + stringExtra2);
        }
        this.mMainTagID = getIntent().getIntExtra(FeedbackConstants.KEY_MAIN_TAG_ID, 0);
        int intExtra = getIntent().getIntExtra(FeedbackConstants.KEY_SUB_TAG_ID, 0);
        this.mSubTagID = intExtra;
        Logger.i(this.TAG, "onCreate mMainTagID is " + this.mMainTagID + ", mSubTagID is " + intExtra);
        StringBuilder sb = new StringBuilder();
        sb.append(stringExtra);
        sb.append(" - ");
        sb.append(stringExtra2);
        this.mSelectedTypeString = sb.toString();
        getWindow().setSoftInputMode(32);
        getMBinding().A.setHint(getHintString(a0j.s));
        getMBinding().S.setText(getString(a0j.n) + getString(a0j.o));
        SpannableString spannableString = new SpannableString(getHintString(a0j.C));
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(getHintString(a0j.x));
        spannableString2.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString2.length(), 33);
        getMBinding().M.setHint(new SpannableString(spannableString2));
        getMBinding().N.setHint(new SpannableString(spannableString));
        if (RTLUtilKt.isRTL(this)) {
            getMBinding().N.setGravity(5);
        }
        getMBinding().F.setLayoutManager(new LinearLayoutManager(this) { // from class: com.xiaomi.fitness.feedback.bugreport.FeedbackActivity$onCreate$layout$1
            {
                super(this, 0, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        getMBinding().F.addItemDecoration(FeedImgDecor.INSTANCE.FeedImgDecor(ExtUtilsKt.getDp(Float.valueOf(10.0f))));
        FeedImgAdapter feedImgAdapter = new FeedImgAdapter(getBaseContext());
        this.mImgAdapter = feedImgAdapter;
        feedImgAdapter.setOnItemClickCallBack(this);
        getMBinding().F.setAdapter(this.mImgAdapter);
        if (RTLUtilKt.isRTL(this)) {
            getMBinding().E.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(mni.f27028a, null), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        getMBinding().A.addTextChangedListener(new SimpleTextWatcher(this));
        getMBinding().U.setOnClickListener(new View.OnClickListener() { // from class: vh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.onCreate$lambda$0(this.f36896a, view);
            }
        });
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: wh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.onCreate$lambda$1(this.f37973a, view);
            }
        });
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: xh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.onCreate$lambda$3(this.f39122a, listG, stringExtra, view);
            }
        });
        ((FeedbackViewModel) getMViewModel()).getUploadResult().observe(this, new FeedbackActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yh9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackActivity.onCreate$lambda$4(this.f40174a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).removeListenerBleLogLoadProgress(this.mBleLogUploadProgressReceiver);
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        this.handler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.feedback.bugreport.OnItemClickCallBack
    public void onItemClick(@Nullable View view, @Nullable Object any) {
        if (any == null) {
            openGallery();
            return;
        }
        if (any instanceof Uri) {
            Uri uri = (Uri) any;
            String destPath = ((FeedbackViewModel) getMViewModel()).getDestPath(uri);
            FeedImgAdapter feedImgAdapter = this.mImgAdapter;
            if (feedImgAdapter == null) {
                return;
            }
            feedImgAdapter.removeData(uri, destPath);
        }
    }

    public final void onUploadResult(boolean isSuccess) {
        if (!isSuccess) {
            showToastMsg(a0j.f488r);
        } else {
            showToastMsg(a0j.T);
            lambda$onCreate$0();
        }
    }

    public final void setHandler(@Nullable WeakHandler weakHandler) {
        this.handler = weakHandler;
    }

    public final void showToastMsg(int textRes) {
        if (TextUtils.isEmpty(getString(textRes))) {
            return;
        }
        Toast toast = this.sToast;
        if (toast == null) {
            Toast toastMakeText = Toast.makeText(this, getString(textRes), 0);
            this.sToast = toastMakeText;
            if (toastMakeText != null) {
                toastMakeText.show();
                return;
            }
            return;
        }
        if (toast != null) {
            toast.setText(getString(textRes));
        }
        Toast toast2 = this.sToast;
        if (toast2 != null) {
            toast2.setDuration(0);
        }
        Toast toast3 = this.sToast;
        if (toast3 != null) {
            toast3.show();
        }
    }
}
