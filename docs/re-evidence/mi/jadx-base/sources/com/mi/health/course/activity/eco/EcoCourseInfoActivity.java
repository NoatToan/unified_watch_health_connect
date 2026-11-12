package com.mi.health.course.activity.eco;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseLinkTipActivityKt;
import com.mi.health.course.activity.eco.EcoCourseInfoActivity;
import com.mi.health.course.adapter.CourseContentAdapter;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.CoursePreference;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.widget.expandable.ExpandableTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RatioImageView;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.av6;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.fs9;
import defpackage.fu4;
import defpackage.j7r;
import defpackage.kyi;
import defpackage.lm7;
import defpackage.s4m;
import defpackage.sti;
import defpackage.xmi;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001TB\u0007¢\u0006\u0004\bS\u0010\u001fJ%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J'\u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u0010\u001fJ\u000f\u00106\u001a\u00020\u0007H\u0014¢\u0006\u0004\b6\u0010\u001fJ\u000f\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u001fR\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010<R\u0018\u0010I\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020&0J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010GR\u0014\u0010P\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006U"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/activity/eco/EcoCourseInfoVM;", "Llm7;", "", MediaStoreUtil.MediaInfo.SIZE, "Lkotlin/Function0;", "", "block", "checkMobileTraffic", "(JLkotlin/jvm/functions/Function0;)V", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", PluginDeviceInfo.FICONOFF, "onDataOk", "(Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;)V", "intentToCourseAudioAndVideo", "", "is_spinning_bike", "callback", "goStartPlayer", "(ZLkotlin/jvm/functions/Function0;)V", OvulationTestRecord.Result.POSITIVE, OvulationTestRecord.Result.NEGATIVE, "showUserInfoDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "product", "showConnectDialog", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;)V", "intentToCourseHr", "showHrConditionDialog", "()V", "Lkotlin/Function1;", "checkIfUpdating", "(Lkotlin/jvm/functions/Function1;)V", "more", "setAudioView", "(Z)V", "Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;", MiuiCursorConstants.CONTENT, "setAudioItem", "(Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;)V", "", "unit", "value", "Landroid/widget/TextView;", "view", "setDataView", "(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "audioMore", "Z", "", "audioLessHeight", "I", "audioMoreHeight", "Ls4m;", "shareComponent$delegate", "Lkotlin/Lazy;", "getShareComponent", "()Ls4m;", "shareComponent", "model", "Ljava/lang/String;", "courseId", "J", "courseType", "courseName", "", "audioExercise", "Ljava/util/List;", "startMills", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseInfoActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseInfoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,582:1\n1#2:583\n54#3,3:584\n24#3:587\n57#3,6:588\n63#3,2:595\n57#4:594\n1863#5,2:597\n*S KotlinDebug\n*F\n+ 1 EcoCourseInfoActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseInfoActivity\n*L\n236#1:584,3\n236#1:587\n236#1:588,6\n236#1:595,2\n236#1:594\n304#1:597,2\n*E\n"})
public final class EcoCourseInfoActivity extends Hilt_EcoCourseInfoActivity<EcoCourseInfoVM, lm7> {
    public static final int AUDIO_SIZE_LIMIT = 4;

    @NotNull
    public static final String KEY_COURSE_FROM = "from";

    @NotNull
    public static final String KEY_COURSE_ID = "course_id";

    @NotNull
    public static final String KEY_NEED_CHECK_SYNC = "need_check_sync";

    @NotNull
    public static final String TAG = "EcoCourseInfoActivity";
    private List<? extends CourseConfigModel.Exercise> audioExercise;
    private int audioLessHeight;
    private boolean audioMore;
    private int audioMoreHeight;
    private long courseId;

    @Nullable
    private String courseName;
    private int courseType;

    /* JADX INFO: renamed from: shareComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareComponent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bn7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseInfoActivity.shareComponent_delegate$lambda$0(this.f4386a);
        }
    });

    @NotNull
    private String model = "";
    private long startMills = System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcoCourseInfoVM access$getMViewModel(EcoCourseInfoActivity ecoCourseInfoActivity) {
        return (EcoCourseInfoVM) ecoCourseInfoActivity.getMViewModel();
    }

    private final void checkIfUpdating(final Function1<? super Boolean, Unit> callback) {
        SportEcoManagerExtKt.getInstance(IEcoGym.INSTANCE).isGymUpdating(new DeviceTaskCallBack<fs9[]>() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoActivity.checkIfUpdating.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
            public void onError(int errorCode) {
                FitnessLogUtils.d(EcoCourseInfoActivity.TAG, "checkIfUpdating " + errorCode);
                callback.invoke2(Boolean.valueOf(errorCode == 5));
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
            public void onResult(fs9[] result) {
                FitnessLogUtils.d(EcoCourseInfoActivity.TAG, "not in ota");
                callback.invoke2(Boolean.FALSE);
            }
        });
    }

    private final void checkMobileTraffic(long size, final Function0<Unit> block) {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (netUtil.getNetWorkAvailable(application)) {
            Application application2 = getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            if (!netUtil.isWifiCon(application2)) {
                new CommonDialog.c("MobileTraffic").setDialogTitle(czi.course_traffic_title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(czi.course_traffic_desc, Long.valueOf(size)))).setPositiveText(czi.course_start).setNegativeText(czi.common_cancel).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoActivity.checkMobileTraffic.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        if (which == -1) {
                            block.invoke();
                        }
                    }
                }).showIfNeed(getSupportFragmentManager());
                return;
            }
        }
        block.invoke();
    }

    private final s4m getShareComponent() {
        return (s4m) this.shareComponent.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void goStartPlayer(boolean is_spinning_bike, final Function0<Unit> callback) {
        if (is_spinning_bike) {
            ((EcoCourseInfoVM) getMViewModel()).readEcoSettingConfig(new Function1() { // from class: ym7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseInfoActivity.goStartPlayer$lambda$18(this.f40318a, callback, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            callback.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goStartPlayer$lambda$18(EcoCourseInfoActivity this$0, Function0 callback, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (z) {
            callback.invoke();
        } else {
            new CommonDialog.c("model_dialog").setDialogTitle(new DialogParams.DialogDescriptionString(czi.course_model_dialog_title, new Object[0])).setDialogDescriptionString(new DialogParams.DialogDescriptionString(czi.course_model_dialog_des, new Object[0])).setPositiveText(czi.c).setNegativeText(czi.f14891b).create().addDialogCallback(new EcoCourseInfoActivity$goStartPlayer$1$1(this$0, callback)).showIfNeed(this$0.getSupportFragmentManager());
        }
        return Unit.INSTANCE;
    }

    private final void intentToCourseAudioAndVideo(final CourseModel.CourseDetailResult d) {
        CourseAllInfo courseAllInfo = d.allInfo;
        Intrinsics.checkNotNull(courseAllInfo);
        final long jMediaSize = CourseExtKt.mediaSize(courseAllInfo) / ((long) 1024);
        boolean zSupportLink = CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage());
        if (CourseExtKt.getTEST()) {
            CourseLinkTipActivityKt.startPlayer$default(this, d, this.model, 0L, 0, 0, 56, null);
            return;
        }
        FitnessLogUtils.d(TAG, "intentToCourseAudioAndVideo: supportLink = " + zSupportLink + ", type = " + courseAllInfo.getType());
        if (!zSupportLink) {
            if (courseAllInfo.getType() == 1) {
                checkMobileTraffic(jMediaSize, new Function0() { // from class: om7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EcoCourseInfoActivity.intentToCourseAudioAndVideo$lambda$12(this.f29288a, d);
                    }
                });
                return;
            }
            return;
        }
        if (!CourseExtKt.deviceMatch(courseAllInfo, this.model)) {
            FitnessLogUtils.d(TAG, "intentToCourseAudioAndVideo: device not match");
            ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
            return;
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
        FitnessLogUtils.d(TAG, "onDataOk intentToCourseAudioAndVideo: deviceReady = " + localDeviceModel);
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
            EcoProduct ecoProperProduct = CourseExtKt.getEcoProperProduct(this.model);
            if (ecoProperProduct == null) {
                ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
                return;
            } else {
                showConnectDialog(ecoProperProduct);
                return;
            }
        }
        CourseConfigModel.CourseTags tags = courseAllInfo.getTags();
        boolean z = false;
        if (tags != null) {
            List<String> tags2 = tags.tags;
            Intrinsics.checkNotNullExpressionValue(tags2, "tags");
            Iterator<T> it = tags2.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals("spinning_bike")) {
                    z = true;
                }
            }
        }
        goStartPlayer(z, new Function0() { // from class: xm7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoCourseInfoActivity.intentToCourseAudioAndVideo$lambda$17(this.f39258a, jMediaSize, d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$12(EcoCourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        CourseLinkTipActivityKt.startPlayer$default(this$0, d, this$0.model, 0L, 0, 0, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit intentToCourseAudioAndVideo$lambda$17(final EcoCourseInfoActivity this$0, final long j, final CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        String str = this$0.model;
        boolean z = true;
        switch (str.hashCode()) {
            case -1798122615:
                if (!str.equals("yesoul.exbike.jsc01y")) {
                    z = false;
                }
                break;
            case -1454035281:
                if (!str.equals("runmi.exbike.jscrm1")) {
                    z = false;
                }
                break;
            case 405899618:
                if (!str.equals("yunmai.jmprope.sr803")) {
                    z = false;
                }
                break;
            case 405899620:
                if (!str.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        ecoConnectPreference.setIS_ECO_DEVICE(z);
        this$0.checkIfUpdating(new Function1() { // from class: dn7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseInfoActivity.intentToCourseAudioAndVideo$lambda$17$lambda$16(this.f15713a, j, d, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$17$lambda$16(final EcoCourseInfoActivity this$0, long j, final CourseModel.CourseDetailResult d, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        if (z) {
            ToastUtil.showShortToast(czi.course_firmware_updating);
        } else {
            this$0.checkMobileTraffic(j, new Function0() { // from class: en7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EcoCourseInfoActivity.intentToCourseAudioAndVideo$lambda$17$lambda$16$lambda$15(this.f16835a, d);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$17$lambda$16$lambda$15(EcoCourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        CourseLinkTipActivityKt.startPlayer$default(this$0, d, this$0.model, 0L, 0, 0, 56, null);
        return Unit.INSTANCE;
    }

    private final void intentToCourseHr(final CourseModel.CourseDetailResult d) {
        CourseAllInfo courseAllInfo = d.allInfo;
        boolean zSupportLink = CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage());
        FitnessLogUtils.d(TAG, "onDataOk intentToCourseHr: supportLink = " + zSupportLink);
        if (!zSupportLink || CourseExtKt.getTEST()) {
            CourseLinkTipActivityKt.startPlayer$default(this, d, this.model, 0L, 0, 0, 56, null);
            return;
        }
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.model);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        FitnessLogUtils.d(TAG, "onDataOk intentToCourseHr: deviceReady = " + localDeviceModel + "**wearDevice isConnect=" + (ecoDeviceModel != null ? Boolean.valueOf(ecoDeviceModel.getIsDeviceConnected()) : null));
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected() || (ecoDeviceModel != null && !ecoDeviceModel.getIsDeviceConnected())) {
            showHrConditionDialog();
            return;
        }
        IEcoSportRemoteState sportEcoManagerExtKt = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
        CourseModel.CourseData basicInfo = courseAllInfo.getBasicInfo();
        sportEcoManagerExtKt.isSupportLaunchSport(basicInfo != null ? basicInfo.sportType : 0, new j7r() { // from class: sm7
            @Override // defpackage.j7r
            public final void a(Boolean bool) {
                EcoCourseInfoActivity.intentToCourseHr$lambda$20(this.f33778a, d, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intentToCourseHr$lambda$20(final EcoCourseInfoActivity this$0, final CourseModel.CourseDetailResult d, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        FitnessLogUtils.d(TAG, "onDataOk intentToCourseHr: isSupportLaunchSport = " + bool);
        if (bool.booleanValue()) {
            this$0.checkIfUpdating(new Function1() { // from class: cn7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseInfoActivity.intentToCourseHr$lambda$20$lambda$19(this.f5570a, d, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            this$0.showHrConditionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseHr$lambda$20$lambda$19(EcoCourseInfoActivity this$0, CourseModel.CourseDetailResult d, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        if (z) {
            ToastUtil.showShortToast(czi.course_firmware_updating);
        } else {
            CourseLinkTipActivityKt.startPlayer$default(this$0, d, this$0.model, 0L, 0, 0, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(EcoCourseInfoActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setAudioView(!this$0.audioMore);
        this$0.audioMore = !this$0.audioMore;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(EcoCourseInfoActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stateData.k()) {
            T data = stateData.f11668a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            this$0.onDataOk((CourseModel.CourseDetailResult) data);
        } else if (stateData.g()) {
            PageState.DefaultImpls.showEmpty$default(this$0, 0, 0, 3, null);
        } else if (stateData.h()) {
            this$0.showError();
        } else if (stateData.j()) {
            this$0.showNoNetwork();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOk(final CourseModel.CourseDetailResult d) {
        final CourseAllInfo courseAllInfo = d.allInfo;
        if (courseAllInfo == null) {
            PageState.DefaultImpls.showEmpty$default(this, 0, 0, 3, null);
            return;
        }
        showContent();
        this.courseType = d.allInfo.getType();
        FitnessLogUtils.d(TAG, "onDataOk: status = " + d.allInfo.getStatus());
        if (d.allInfo.getStatus() == 1) {
            showEmpty(czi.course_offline, xmi.course_offline);
            return;
        }
        ViewExtKt.clickWithTrigger$default(((lm7) getMBinding()).V, 0L, new Function1() { // from class: qm7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseInfoActivity.onDataOk$lambda$7(courseAllInfo, this, d, (TextView) obj);
            }
        }, 1, null);
        CourseModel.PracticedSummary practicedSummary = d.practicedSummary;
        int i = (practicedSummary != null ? practicedSummary.trainTimes : 0) + 1;
        ((lm7) getMBinding()).V.setText(getResources().getQuantityString(kyi.course_start_times, i, Integer.valueOf(i)));
        final CourseModel.CourseData basicInfo = courseAllInfo.getBasicInfo();
        if (basicInfo != null) {
            IActionBar.DefaultImpls.setEndView$default(this, 0, UIUtils.isNightMode(AppUtil.getApp()) ? xmi.j : xmi.f39270k, getString(czi.j), new View.OnClickListener() { // from class: rm7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcoCourseInfoActivity.onDataOk$lambda$9$lambda$8(this.f32698a, basicInfo, courseAllInfo, view);
                }
            }, 1, null);
            String str = basicInfo.title;
            this.courseName = str;
            setTitle(str);
            Pair<String, String> difficult = CourseExtKt.getDifficult(basicInfo);
            String str2 = " " + ((Object) difficult.getFirst());
            String second = difficult.getSecond();
            TextView difficultyValueView = ((lm7) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(difficultyValueView, "difficultyValueView");
            setDataView(str2, second, difficultyValueView);
            String str3 = " " + getString(czi.course_calorie_label);
            String strValueOf = String.valueOf(CourseExtKt.getCalorie(basicInfo));
            TextView consumeValueView = ((lm7) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(consumeValueView, "consumeValueView");
            setDataView(str3, strValueOf, consumeValueView);
            String str4 = " " + getString(czi.i);
            String strValueOf2 = String.valueOf(basicInfo.duration);
            TextView timeValueView = ((lm7) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(timeValueView, "timeValueView");
            setDataView(str4, strValueOf2, timeValueView);
            ConstraintLayout constraintLayout = ((lm7) getMBinding()).N;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(((lm7) getMBinding()).O.getText());
            stringBuffer.append(",");
            stringBuffer.append(((lm7) getMBinding()).P.getText());
            constraintLayout.setContentDescription(stringBuffer.toString());
            ConstraintLayout constraintLayout2 = ((lm7) getMBinding()).D;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(((lm7) getMBinding()).E.getText());
            stringBuffer2.append(",");
            stringBuffer2.append(((lm7) getMBinding()).F.getText());
            constraintLayout2.setContentDescription(stringBuffer2.toString());
            ConstraintLayout constraintLayout3 = ((lm7) getMBinding()).W;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(((lm7) getMBinding()).X.getText());
            stringBuffer3.append(",");
            stringBuffer3.append(((lm7) getMBinding()).Y.getText());
            constraintLayout3.setContentDescription(stringBuffer3.toString());
        }
        CourseConfigModel.PreviewImg img = courseAllInfo.getImg();
        if (img != null) {
            RatioImageView postView = ((lm7) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(postView, "postView");
            Coil.imageLoader(postView.getContext()).enqueue(new ImageRequest.Builder(postView.getContext()).data(img.large).target(postView).build());
        }
        CourseConfigModel.ConfigDetail detailInfo = courseAllInfo.getDetailInfo();
        if (detailInfo != null) {
            String str5 = detailInfo.course_intro;
            if (str5 == null || StringsKt__StringsKt.isBlank(str5)) {
                ExpandableTextView descView = ((lm7) getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(descView, "descView");
                ViewExtKt.gone(descView);
            } else {
                ExpandableTextView descView2 = ((lm7) getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(descView2, "descView");
                ViewExtKt.visible(descView2);
                ((lm7) getMBinding()).K.setText(detailInfo.course_intro);
            }
            ((lm7) getMBinding()).S.setText(detailInfo.train_frequency);
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(getString(czi.course_frequency));
            stringBuffer4.append(",");
            stringBuffer4.append(detailInfo.train_frequency);
            String string = stringBuffer4.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ((lm7) getMBinding()).Q.setContentDescription(string);
            ((lm7) getMBinding()).M.setText(detailInfo.equipments);
            View view = ((lm7) getMBinding()).L;
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(getString(czi.course_device));
            stringBuffer5.append(",");
            stringBuffer5.append(detailInfo.equipments);
            view.setContentDescription(stringBuffer5.toString());
            ((lm7) getMBinding()).a0.setText(detailInfo.attentions);
            List<CourseConfigModel.Exercise> list = detailInfo.exercises;
            if (list == null || list.isEmpty()) {
                Group contentLabelGroup = ((lm7) getMBinding()).I;
                Intrinsics.checkNotNullExpressionValue(contentLabelGroup, "contentLabelGroup");
                ViewExtKt.gone(contentLabelGroup);
                return;
            }
            ((lm7) getMBinding()).J.setText(getResources().getQuantityString(kyi.course_content_segment, detailInfo.exercises.size(), Integer.valueOf(detailInfo.exercises.size())));
            if (courseAllInfo.getType() == 1) {
                RecyclerView recyclerView = ((lm7) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                ViewExtKt.visible(recyclerView);
                RecyclerView recyclerView2 = ((lm7) getMBinding()).U;
                List<CourseConfigModel.Exercise> exercises = detailInfo.exercises;
                Intrinsics.checkNotNullExpressionValue(exercises, "exercises");
                recyclerView2.setAdapter(new CourseContentAdapter(exercises, CourseExtKt.coachSelectable(courseAllInfo)));
                return;
            }
            TextView audioMoreView = ((lm7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioMoreView, "audioMoreView");
            ViewExtKt.visible(audioMoreView);
            LinearLayout audioContainer = ((lm7) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(audioContainer, "audioContainer");
            ViewExtKt.visible(audioContainer);
            DividerView audioDivider = ((lm7) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(audioDivider, "audioDivider");
            ViewExtKt.visible(audioDivider);
            this.audioExercise = detailInfo.exercises;
            setAudioView(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    public static final Unit onDataOk$lambda$7(CourseAllInfo courseAllInfo, final EcoCourseInfoActivity this$0, final CourseModel.CourseDetailResult d, TextView it) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(it, "it");
        CourseConfigModel.DeviceLinkage deviceLinkage = courseAllInfo.getDeviceLinkage();
        Set<String> set = deviceLinkage != null ? deviceLinkage.models : null;
        String str2 = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
        if (str2 == null || str2.length() == 0) {
            str = "ksmb.treadmill.m1v1";
        } else {
            str = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
            Intrinsics.checkNotNull(str);
        }
        this$0.model = str;
        FitnessLogUtils.d(TAG, "解析课程获得首要支持的设备model = " + str);
        int i = this$0.courseType;
        if (i == 1 || i == 2) {
            if (UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).isCompleted()) {
                this$0.intentToCourseAudioAndVideo(d);
            } else {
                CoursePreference coursePreference = CoursePreference.INSTANCE;
                if (coursePreference.isShowUserInfoDialog()) {
                    this$0.intentToCourseAudioAndVideo(d);
                } else {
                    coursePreference.setShowUserInfoDialog(true);
                    this$0.showUserInfoDialog(new Function0() { // from class: vm7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EcoCourseInfoActivity.onDataOk$lambda$7$lambda$5(this.f37019a);
                        }
                    }, new Function0() { // from class: wm7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EcoCourseInfoActivity.onDataOk$lambda$7$lambda$6(this.f38118a, d);
                        }
                    });
                }
            }
        } else if (i == 3) {
            String birth = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getBirth();
            if (birth == null || birth.length() == 0) {
                this$0.showUserInfoDialog(new Function0() { // from class: tm7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EcoCourseInfoActivity.onDataOk$lambda$7$lambda$3(this.f34849a);
                    }
                }, new Function0() { // from class: um7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
            } else {
                this$0.intentToCourseHr(d);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataOk$lambda$7$lambda$3(EcoCourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(this$0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataOk$lambda$7$lambda$5(EcoCourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(this$0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataOk$lambda$7$lambda$6(EcoCourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.intentToCourseAudioAndVideo(d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataOk$lambda$9$lambda$8(EcoCourseInfoActivity this$0, CourseModel.CourseData this_apply, CourseAllInfo courseAllInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.getShareComponent().x(this_apply.title, this_apply.subTitle, CourseExtKt.SHARE_URL + courseAllInfo.getCourseId(), null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAudioItem(CourseConfigModel.Exercise content) {
        fu4 fu4VarA0 = fu4.A0(ExtUtilsKt.getInflater(this), ((lm7) getMBinding()).A, true);
        Intrinsics.checkNotNullExpressionValue(fu4VarA0, "inflate(...)");
        fu4VarA0.A.setText(content.title);
        fu4VarA0.C.setText(content.subTitle);
        fu4VarA0.B.setImageResource(CourseExtKt.getAudioContentImg(content.type, this.courseType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAudioView(boolean more) {
        FitnessLogUtils.d(TAG, "setAudioView: " + more + "; moreH = " + this.audioMoreHeight + "; lessH = " + this.audioLessHeight);
        if (more) {
            ((lm7) getMBinding()).C.setText(getString(czi.course_close_show_more));
            ((lm7) getMBinding()).C.setCompoundDrawablesWithIntrinsicBounds(xmi.course_arrow_up, 0, 0, 0);
            if (this.audioMoreHeight != 0) {
                LinearLayout linearLayout = ((lm7) getMBinding()).A;
                ViewGroup.LayoutParams layoutParams = ((lm7) getMBinding()).A.getLayoutParams();
                layoutParams.height = this.audioMoreHeight;
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            List<? extends CourseConfigModel.Exercise> list = this.audioExercise;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioExercise");
                list = null;
            }
            int size = list.size();
            for (int i = 4; i < size; i++) {
                List<? extends CourseConfigModel.Exercise> list2 = this.audioExercise;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioExercise");
                    list2 = null;
                }
                setAudioItem(list2.get(i));
            }
            ((lm7) getMBinding()).A.post(new Runnable() { // from class: pm7
                @Override // java.lang.Runnable
                public final void run() {
                    EcoCourseInfoActivity.setAudioView$lambda$23(this.f30534a);
                }
            });
            return;
        }
        ((lm7) getMBinding()).C.setText(getString(czi.course_info_all));
        ((lm7) getMBinding()).C.setCompoundDrawablesWithIntrinsicBounds(xmi.course_arrow_down, 0, 0, 0);
        if (this.audioLessHeight != 0) {
            LinearLayout linearLayout2 = ((lm7) getMBinding()).A;
            ViewGroup.LayoutParams layoutParams2 = ((lm7) getMBinding()).A.getLayoutParams();
            layoutParams2.height = this.audioLessHeight;
            linearLayout2.setLayoutParams(layoutParams2);
            return;
        }
        List<? extends CourseConfigModel.Exercise> list3 = this.audioExercise;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioExercise");
            list3 = null;
        }
        int size2 = list3.size();
        int iMin = Math.min(4, size2);
        for (int i2 = 0; i2 < iMin; i2++) {
            List<? extends CourseConfigModel.Exercise> list4 = this.audioExercise;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioExercise");
                list4 = null;
            }
            setAudioItem(list4.get(i2));
        }
        if (size2 <= 4) {
            TextView audioMoreView = ((lm7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioMoreView, "audioMoreView");
            ViewExtKt.gone(audioMoreView);
        }
        ((lm7) getMBinding()).A.post(new Runnable() { // from class: fn7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseInfoActivity.setAudioView$lambda$21(this.f17949a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setAudioView$lambda$21(EcoCourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.audioLessHeight = ((lm7) this$0.getMBinding()).A.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setAudioView$lambda$23(EcoCourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.audioMoreHeight = ((lm7) this$0.getMBinding()).A.getHeight();
    }

    private final void setDataView(String unit, String value, TextView view) {
        int length = value.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(value + unit);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(bli.course_black)), 0, length, 17);
        view.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4m shareComponent_delegate$lambda$0(EcoCourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new s4m(this$0);
    }

    private final void showConnectDialog(final EcoProduct product) {
        int i;
        int i2;
        if (Intrinsics.areEqual(this.model, "runmi.exbike.jscrm1")) {
            i = czi.course_link_bike_title;
            i2 = czi.course_link_bike_desc;
        } else if (Intrinsics.areEqual(this.model, "ksmb.treadmill.m1v1")) {
            i = czi.course_link_title;
            i2 = czi.course_link_desc;
        } else {
            i = czi.course_link_title;
            i2 = czi.course_link_desc;
        }
        new CommonDialog.c("connect").setDialogTitle(i).setDialogDescription(i2).setPositiveText(czi.course_link_go).setNegativeText(czi.common_cancel).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoActivity.showConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    DeviceManagerExtKt.launchToScanDevice(EcoCourseInfoActivity.this, EcoProductExtKt.toDeviceProduct(product), true);
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    private final void showHrConditionDialog() {
        new CommonDialog.c("HrCondition").setDialogDescription(czi.course_hr_enter_condition).setPositiveText(czi.course_got_it).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoActivity.showHrConditionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    private final void showUserInfoDialog(final Function0<Unit> positive, final Function0<Unit> negative) {
        new CommonDialog.c("userinfo").setDialogDescription(czi.course_user_info_desc).setNegativeText(czi.common_cancel).setPositiveText(czi.c).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoActivity.showUserInfoDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -2) {
                    negative.invoke();
                } else {
                    if (which != -1) {
                        return;
                    }
                    positive.invoke();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CoursePreference.INSTANCE.setShowCourseInfoFragment(true);
        long longExtra = getIntent().getLongExtra("course_id", 0L);
        this.courseId = longExtra;
        if (longExtra <= 0) {
            FitnessLogUtils.d(TAG, "onCreate: invalid course id " + longExtra);
            finish();
            return;
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ToastExtKt.toast$default(this, czi.course_login_not_now, 0, 0, 0L, 14, null);
            FitnessLogUtils.d(TAG, "onCreate: login out");
            finish();
        } else {
            setTitleBackground(bli.course_white);
            ViewExtKt.clickWithTrigger$default(((lm7) getMBinding()).C, 0L, new Function1() { // from class: zm7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseInfoActivity.onCreate$lambda$1(this.f41451a, (TextView) obj);
                }
            }, 1, null);
            ((EcoCourseInfoVM) getMViewModel()).getEmitter().observe(this, new EcoCourseInfoActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: an7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseInfoActivity.onCreate$lambda$2(this.f1232a, (StateData) obj);
                }
            }));
            ((EcoCourseInfoVM) getMViewModel()).reqInfo(this.courseId);
        }
    }

    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CoursePreference.INSTANCE.setShowCourseInfoFragment(false);
        CoroutineScopeKt.cancel$default(LifecycleOwnerKt.getLifecycleScope(this), null, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        dismissDialogForce();
        String str = this.courseName;
        if (str == null || str.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        FitnessLogUtils.d(TAG, "onStop: course_detail_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_detail_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("asset_id", Long.valueOf(this.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, this.courseName), TuplesKt.to("tip", "56.2.2.1.19566")));
    }
}
