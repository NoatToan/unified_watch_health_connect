package com.mi.health.course.activity;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseInfoActivity;
import com.mi.health.course.adapter.CourseContentAdapter;
import com.mi.health.course.eco.activity.EcoCourseLinkTipActivityKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseExchangeBenefits;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseNewEquipmentBenefits;
import com.mi.health.course.export.data.CourseVipInfo;
import com.mi.health.course.export.data.TrainingCourseInfo;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.CoursePreference;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.vm.CourseInfoVM;
import com.mi.health.course.widget.CourseInfoHeaderPreView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.SportEcoExt;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack;
import com.xiaomi.fitness.sport_manager_export.listener.IGym;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.yrn.export.constants.YRNSportConfig;
import defpackage.aje;
import defpackage.av6;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.fu4;
import defpackage.gak;
import defpackage.gr4;
import defpackage.gs9;
import defpackage.i7r;
import defpackage.kyi;
import defpackage.s4m;
import defpackage.sti;
import defpackage.xmi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bo\u0010\u0010J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ+\u0010\u0019\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010!J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0010J#\u0010,\u001a\u00020\u00072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u0014J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\u000eJ\u0019\u00109\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000107H\u0014¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0014¢\u0006\u0004\b?\u0010\u0010J\u000f\u0010@\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010\u0010J\u000f\u0010A\u001a\u00020\u0007H\u0014¢\u0006\u0004\bA\u0010\u0010R\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010MR\u0016\u0010N\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010CR\u0016\u0010O\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010CR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010CR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010ER\u001b\u0010X\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010WR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010ER\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0018\u0010a\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010MR\u0016\u0010b\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ER\u0016\u0010c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010CR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u0002000\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010RR\u0016\u0010j\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010CR\u0014\u0010l\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010WR\u0014\u0010n\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010W¨\u0006p"}, d2 = {"Lcom/mi/health/course/activity/CourseInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseInfoVM;", "Lgr4;", "", MediaStoreUtil.MediaInfo.SIZE, "Lkotlin/Function0;", "", "block", "checkMobileTraffic", "(JLkotlin/jvm/functions/Function0;)V", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", PluginDeviceInfo.FICONOFF, "onDataOk", "(Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;)V", "showCourseGetVipPopupWindow", "()V", "", "isBottomBtn", "showOpenVipDialog", "(Z)V", "setLayoutManager", "intentToCourseAudioAndVideo", OvulationTestRecord.Result.POSITIVE, OvulationTestRecord.Result.NEGATIVE, "showUserInfoDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "products", "showConnectDialog", "(Ljava/util/List;)V", "product", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)V", "", "model", "", "getDialogTitleIdByModel", "(Ljava/lang/String;)I", "getDialogDescriptionIdByModel", "intentToCourseHr", "showHrConditionDialog", "Lkotlin/Function1;", "callback", "checkIfUpdating", "(Lkotlin/jvm/functions/Function1;)V", "more", "setAudioView", "Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;", MiuiCursorConstants.CONTENT, "setAudioItem", "(Lcom/mi/health/course/export/data/CourseConfigModel$Exercise;)V", "isTrainingPlan", "()Z", "triggerPlay", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "audioMore", "Z", "audioLessHeight", "I", "audioMoreHeight", "Ls4m;", "shareComponent$delegate", "Lkotlin/Lazy;", "getShareComponent", "()Ls4m;", "shareComponent", "Ljava/lang/String;", "linkModelIsKms", "linkModelIsBike", "linkModelIsJump", "courseId", "J", "planId", "trainingCourseStatus", "mNeedFreshTabType$delegate", "getMNeedFreshTabType", "()I", "mNeedFreshTabType", "mFrom$delegate", "getMFrom", "mFrom", "Lcom/mi/health/course/export/data/CourseAllInfo;", "courseAllInfo", "Lcom/mi/health/course/export/data/CourseAllInfo;", "courseType", "needTrack", "courseName", "times", "vipActive", "Landroid/widget/PopupWindow;", "getVipPopupWindow", "Landroid/widget/PopupWindow;", "audioExercise", "Ljava/util/List;", "startMills", "needAutoPlayVideo", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseInfoActivity.kt\ncom/mi/health/course/activity/CourseInfoActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1863#2,2:1058\n254#3:1060\n1#4:1061\n*S KotlinDebug\n*F\n+ 1 CourseInfoActivity.kt\ncom/mi/health/course/activity/CourseInfoActivity\n*L\n213#1:1058,2\n423#1:1060\n*E\n"})
public final class CourseInfoActivity extends Hilt_CourseInfoActivity<CourseInfoVM, gr4> {
    private List<? extends CourseConfigModel.Exercise> audioExercise;
    private int audioLessHeight;
    private boolean audioMore;
    private int audioMoreHeight;

    @Nullable
    private CourseAllInfo courseAllInfo;
    private long courseId;

    @Nullable
    private String courseName;
    private int courseType;

    @Nullable
    private PopupWindow getVipPopupWindow;
    private boolean linkModelIsBike;
    private boolean linkModelIsJump;
    private boolean linkModelIsKms;
    private boolean needAutoPlayVideo;
    private long planId;
    private int times;
    private boolean vipActive;

    /* JADX INFO: renamed from: shareComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareComponent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hs4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseInfoActivity.shareComponent_delegate$lambda$0(this.f20393a);
        }
    });

    @NotNull
    private String model = "";
    private int trainingCourseStatus = -1;

    /* JADX INFO: renamed from: mNeedFreshTabType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNeedFreshTabType = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: is4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseInfoActivity.mNeedFreshTabType_delegate$lambda$1(this.f22037a));
        }
    });

    /* JADX INFO: renamed from: mFrom$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFrom = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: js4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseInfoActivity.mFrom_delegate$lambda$2(this.f23083a));
        }
    });
    private boolean needTrack = true;
    private long startMills = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.mi.health.course.activity.CourseInfoActivity$onDataOk$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.CourseInfoActivity$onDataOk$5", f = "CourseInfoActivity.kt", i = {}, l = {375, 375, 381}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CourseModel.CourseDetailResult $d;
        final /* synthetic */ CourseAllInfo $info;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.mi.health.course.activity.CourseInfoActivity$onDataOk$5$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.course.activity.CourseInfoActivity$onDataOk$5$1", f = "CourseInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CourseModel.CourseDetailResult $d;
            final /* synthetic */ CourseAllInfo $info;
            int label;
            final /* synthetic */ CourseInfoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseInfoActivity courseInfoActivity, CourseAllInfo courseAllInfo, CourseModel.CourseDetailResult courseDetailResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = courseInfoActivity;
                this.$info = courseAllInfo;
                this.$d = courseDetailResult;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CourseInfoActivity courseInfoActivity) {
                courseInfoActivity.showOpenVipDialog(false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(final CourseInfoActivity courseInfoActivity, CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
                if (courseNewEquipmentBenefits != null && CourseVipExtKt.checkBenefitsEnable(courseNewEquipmentBenefits)) {
                    CourseInfoActivity.access$getMBinding(courseInfoActivity).P.setText(courseInfoActivity.getString(czi.course_get_vip_start_train));
                    CourseInfoActivity.access$getMBinding(courseInfoActivity).P.post(new Runnable() { // from class: com.mi.health.course.activity.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            CourseInfoActivity.access$showCourseGetVipPopupWindow(courseInfoActivity);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$info, this.$d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CourseModel.CourseData basicInfo;
                CourseModel.CourseData basicInfo2;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CourseInfoActivity.access$getMBinding(this.this$0).H.bindData(this.$info, this.this$0.vipActive);
                CourseInfoHeaderPreView courseInfoHeaderPreView = CourseInfoActivity.access$getMBinding(this.this$0).H;
                final CourseInfoActivity courseInfoActivity = this.this$0;
                courseInfoHeaderPreView.setShowOpenVipAction(new Function0() { // from class: com.mi.health.course.activity.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CourseInfoActivity.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0(courseInfoActivity);
                    }
                });
                if (!this.this$0.isTrainingPlan() && ((((basicInfo = this.$d.allInfo.getBasicInfo()) != null && basicInfo.pricingStatus == 1) || ((basicInfo2 = this.$d.allInfo.getBasicInfo()) != null && basicInfo2.pricingStatus == 2)) && !this.this$0.vipActive)) {
                    CourseApi courseApi = CourseApiKt.getCourseApi();
                    final CourseInfoActivity courseInfoActivity2 = this.this$0;
                    courseApi.getNewEquipmentBenefits(new Function1() { // from class: com.mi.health.course.activity.c
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj2) {
                            return CourseInfoActivity.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$2(courseInfoActivity2, (CourseNewEquipmentBenefits) obj2);
                        }
                    }, new Function0() { // from class: com.mi.health.course.activity.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                }
                if (this.this$0.needAutoPlayVideo) {
                    this.this$0.triggerPlay(this.$d);
                    this.this$0.needAutoPlayVideo = false;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CourseAllInfo courseAllInfo, CourseModel.CourseDetailResult courseDetailResult, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$info = courseAllInfo;
            this.$d = courseDetailResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseInfoActivity.this.new AnonymousClass5(this.$info, this.$d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x006f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0092 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MainCoroutineDispatcher main;
            AnonymousClass1 anonymousClass1;
            CourseInfoActivity courseInfoActivity;
            VipInfo vipInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i != 0) {
                    if (i == 1) {
                        courseInfoActivity = (CourseInfoActivity) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        courseInfoActivity = (CourseInfoActivity) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        vipInfo = (VipInfo) obj;
                        if (vipInfo != null || !vipInfo.getDeprecatedMember()) {
                            z = false;
                        }
                        courseInfoActivity.vipActive = z;
                        main = Dispatchers.getMain();
                        anonymousClass1 = new AnonymousClass1(CourseInfoActivity.this, this.$info, this.$d, null);
                        this.L$0 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CourseInfoActivity courseInfoActivity2 = CourseInfoActivity.this;
                MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                this.L$0 = courseInfoActivity2;
                this.label = 1;
                Object vipInfo$default = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt, false, this, 1, null);
                if (vipInfo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                courseInfoActivity = courseInfoActivity2;
                obj = vipInfo$default;
                VipInfo vipInfo2 = (VipInfo) obj;
                if (vipInfo2 == null || !vipInfo2.getActive()) {
                    MembershipHelper membershipHelperExtKt2 = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                    this.L$0 = courseInfoActivity;
                    this.label = 2;
                    obj = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt2, false, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vipInfo = (VipInfo) obj;
                    if (vipInfo != null) {
                        z = false;
                    } else {
                        z = false;
                    }
                }
                courseInfoActivity.vipActive = z;
            } catch (Exception unused) {
                CourseInfoActivity.this.vipActive = false;
            }
            main = Dispatchers.getMain();
            anonymousClass1 = new AnonymousClass1(CourseInfoActivity.this, this.$info, this.$d, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ gr4 access$getMBinding(CourseInfoActivity courseInfoActivity) {
        return (gr4) courseInfoActivity.getMBinding();
    }

    public static final /* synthetic */ void access$showCourseGetVipPopupWindow(CourseInfoActivity courseInfoActivity) {
        courseInfoActivity.showCourseGetVipPopupWindow();
    }

    private final void checkIfUpdating(final Function1<? super Boolean, Unit> callback) {
        SportManagerExtKt.getInstance(IGym.INSTANCE).isGymUpdating(new DeviceTaskCallBack<gs9[]>() { // from class: com.mi.health.course.activity.CourseInfoActivity.checkIfUpdating.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack
            public void onError(int errorCode) {
                LogUtil.INSTANCE.i("CoursePlayerInfo", "checkIfUpdating " + errorCode);
                callback.invoke2(Boolean.valueOf(errorCode == 5));
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack
            public void onResult(gs9[] result) {
                LogUtil.INSTANCE.i("CoursePlayerInfo", "not in ota");
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
                new CommonDialog.c("MobileTraffic").setDialogTitle(czi.course_traffic_title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(czi.course_traffic_desc, Long.valueOf(size)))).setPositiveText(czi.course_start).setNegativeText(czi.common_cancel).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.CourseInfoActivity.checkMobileTraffic.1
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2.equals("yunmai.jmprope.sr803") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r2.equals("runmi.exbike.jscrm1") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2.equals("yesoul.exbike.jsc01y") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return defpackage.czi.course_connect_before_start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return defpackage.czi.course_link_bike_desc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getDialogDescriptionIdByModel(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L33
            int r0 = r2.hashCode()
            switch(r0) {
                case -1798122615: goto L28;
                case -1454035281: goto L1f;
                case 405899618: goto L13;
                case 405899620: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "yunmai.jmprope.sr805"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L13:
            java.lang.String r0 = "yunmai.jmprope.sr803"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            int r2 = defpackage.czi.course_connect_before_start
            goto L35
        L1f:
            java.lang.String r0 = "runmi.exbike.jscrm1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L30
            goto L33
        L28:
            java.lang.String r0 = "yesoul.exbike.jsc01y"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L33
        L30:
            int r2 = defpackage.czi.course_link_bike_desc
            goto L35
        L33:
            int r2 = defpackage.czi.course_link_desc
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.course.activity.CourseInfoActivity.getDialogDescriptionIdByModel(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2.equals("yunmai.jmprope.sr803") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r2.equals("runmi.exbike.jscrm1") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r2.equals("yesoul.exbike.jsc01y") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return defpackage.czi.course_connect;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return defpackage.czi.course_link_bike_title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals(com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED) == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getDialogTitleIdByModel(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L33
            int r0 = r2.hashCode()
            switch(r0) {
                case -1798122615: goto L28;
                case -1454035281: goto L1f;
                case 405899618: goto L13;
                case 405899620: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "yunmai.jmprope.sr805"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L13:
            java.lang.String r0 = "yunmai.jmprope.sr803"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            int r2 = defpackage.czi.course_connect
            goto L35
        L1f:
            java.lang.String r0 = "runmi.exbike.jscrm1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L30
            goto L33
        L28:
            java.lang.String r0 = "yesoul.exbike.jsc01y"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L33
        L30:
            int r2 = defpackage.czi.course_link_bike_title
            goto L35
        L33:
            int r2 = defpackage.czi.course_link_title
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.course.activity.CourseInfoActivity.getDialogTitleIdByModel(java.lang.String):int");
    }

    private final int getMFrom() {
        return ((Number) this.mFrom.getValue()).intValue();
    }

    private final int getMNeedFreshTabType() {
        return ((Number) this.mNeedFreshTabType.getValue()).intValue();
    }

    private final s4m getShareComponent() {
        return (s4m) this.shareComponent.getValue();
    }

    private final void intentToCourseAudioAndVideo(final CourseModel.CourseDetailResult d) {
        CourseAllInfo courseAllInfo = d.allInfo;
        Intrinsics.checkNotNull(courseAllInfo);
        final long jMediaSize = CourseExtKt.mediaSize(courseAllInfo) / ((long) 1024);
        boolean zSupportLink = CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage());
        if (CourseExtKt.getTEST()) {
            CourseLinkTipActivityKt.startPlayer(this, d, this.model, this.planId, getMFrom(), getMNeedFreshTabType());
            return;
        }
        Logger.i("CoursePlayerInfo", "intentToCourseAudioAndVideo: supportLink = " + zSupportLink + ", type = " + courseAllInfo.getType());
        if (!zSupportLink) {
            if (courseAllInfo.getType() == 1) {
                checkMobileTraffic(jMediaSize, new Function0() { // from class: wr4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CourseInfoActivity.intentToCourseAudioAndVideo$lambda$15(this.f38275a, d);
                    }
                });
                return;
            }
            return;
        }
        if ((!StringsKt__StringsKt.isBlank(this.model)) && ((!this.linkModelIsKms || this.linkModelIsBike) && !CourseExtKt.deviceMatch(courseAllInfo, this.model))) {
            Logger.i("CoursePlayerInfo", "intentToCourseAudioAndVideo: device not match,mode is " + this.model);
            ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
            return;
        }
        String str = "treadmill";
        if (!SportDeviceModel.INSTANCE.isEcoDevice(this.model)) {
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
            LogUtil.INSTANCE.i("CoursePlayerInfo", "onDataOk intentToCourseAudioAndVideo: deviceReady = " + localDeviceModel);
            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
                checkIfUpdating(new Function1() { // from class: yr4
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return CourseInfoActivity.intentToCourseAudioAndVideo$lambda$18(this.f40446a, jMediaSize, d, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            if (this.linkModelIsKms) {
                List<Product> prefixProducts = CourseExtKt.getPrefixProducts("treadmill");
                if (prefixProducts == null) {
                    ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
                    return;
                } else {
                    showConnectDialog(prefixProducts);
                    return;
                }
            }
            Product properProduct = CourseExtKt.getProperProduct(this.model);
            ArrayList arrayList = new ArrayList();
            ListExtKt.add(arrayList, properProduct);
            if (properProduct == null) {
                ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
                return;
            } else {
                showConnectDialog(arrayList);
                return;
            }
        }
        EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
        LogUtil.INSTANCE.i("CoursePlayerInfo", "Eco onDataOk intentToCourseAudioAndVideo: deviceReady = " + localDeviceModel2);
        if (localDeviceModel2 != null && localDeviceModel2.getIsDeviceConnected()) {
            checkMobileTraffic(jMediaSize, new Function0() { // from class: xr4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CourseInfoActivity.intentToCourseAudioAndVideo$lambda$16(this.f39378a, d);
                }
            });
            return;
        }
        boolean z = this.linkModelIsKms;
        if (!z && !this.linkModelIsBike && !this.linkModelIsJump) {
            EcoProduct ecoProperProduct = CourseExtKt.getEcoProperProduct(this.model);
            if (ecoProperProduct == null) {
                ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
                return;
            } else {
                showConnectDialog(EcoProductExtKt.toDeviceProduct(ecoProperProduct));
                return;
            }
        }
        if (!z) {
            if (this.linkModelIsBike) {
                str = SportConstants.GYM_MODEL_BIKE_PREFIX;
            } else if (this.linkModelIsJump) {
                str = SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX_MIDDLE;
            }
        }
        List<Product> ecoPrefixProductsList = CourseExtKt.getEcoPrefixProductsList(str);
        if (ecoPrefixProductsList == null) {
            ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
        } else {
            showConnectDialog(ecoPrefixProductsList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$15(CourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        CourseLinkTipActivityKt.startPlayer(this$0, d, this$0.model, this$0.planId, this$0.getMFrom(), this$0.getMNeedFreshTabType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$16(CourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        EcoCourseLinkTipActivityKt.startPlayer(this$0, d, this$0.model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$18(final CourseInfoActivity this$0, long j, final CourseModel.CourseDetailResult d, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        if (z) {
            ToastUtil.showShortToast(czi.course_firmware_updating);
        } else {
            this$0.checkMobileTraffic(j, new Function0() { // from class: vr4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CourseInfoActivity.intentToCourseAudioAndVideo$lambda$18$lambda$17(this.f37149a, d);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseAudioAndVideo$lambda$18$lambda$17(CourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        CourseLinkTipActivityKt.startPlayer(this$0, d, this$0.model, this$0.planId, this$0.getMFrom(), this$0.getMNeedFreshTabType());
        return Unit.INSTANCE;
    }

    private final void intentToCourseHr(final CourseModel.CourseDetailResult d) {
        CourseAllInfo courseAllInfo = d.allInfo;
        boolean zSupportLink = CourseExtKt.supportLink(courseAllInfo.getDeviceLinkage());
        LogUtil logUtil = LogUtil.INSTANCE;
        logUtil.i("CoursePlayerInfo", "onDataOk intentToCourseHr: supportLink = " + zSupportLink);
        if (!zSupportLink || CourseExtKt.getTEST()) {
            CourseLinkTipActivityKt.startPlayer(this, d, this.model, this.planId, getMFrom(), getMNeedFreshTabType());
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.model);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        logUtil.i("CoursePlayerInfo", "onDataOk intentToCourseHr: deviceReady = " + localDeviceModel + "**wearDevice isConnect=" + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null));
        if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected() || (wearableDeviceModel != null && !wearableDeviceModel.getIsDeviceConnected())) {
            showHrConditionDialog();
            return;
        }
        ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
        CourseModel.CourseData basicInfo = courseAllInfo.getBasicInfo();
        sportManagerExtKt.isSupportLaunchSport(basicInfo != null ? basicInfo.sportType : 0, new i7r() { // from class: os4
            @Override // defpackage.i7r
            public final void a(Boolean bool) {
                CourseInfoActivity.intentToCourseHr$lambda$20(this.f29643a, d, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intentToCourseHr$lambda$20(final CourseInfoActivity this$0, final CourseModel.CourseDetailResult d, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        LogUtil.INSTANCE.i("CoursePlayerInfo", "onDataOk intentToCourseHr: isSupportLaunchSport = " + bool);
        if (bool.booleanValue()) {
            this$0.checkIfUpdating(new Function1() { // from class: ks4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseInfoActivity.intentToCourseHr$lambda$20$lambda$19(this.f24250a, d, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            this$0.showHrConditionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToCourseHr$lambda$20$lambda$19(CourseInfoActivity this$0, CourseModel.CourseDetailResult d, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        if (z) {
            ToastUtil.showShortToast(czi.course_firmware_updating);
        } else {
            CourseLinkTipActivityKt.startPlayer(this$0, d, this$0.model, this$0.planId, this$0.getMFrom(), this$0.getMNeedFreshTabType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTrainingPlan() {
        return this.planId != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mFrom_delegate$lambda$2(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("from", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mNeedFreshTabType_delegate$lambda$1(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra(YRNSportConfig.KEY_NEED_FRESH_TAB_TYPE, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$6(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.recreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CourseInfoActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setAudioView(!this$0.audioMore);
        this$0.audioMore = !this$0.audioMore;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(CourseInfoActivity this$0, StateData stateData) {
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
        this.courseAllInfo = courseAllInfo;
        showContent();
        this.courseType = d.allInfo.getType();
        LogUtil.INSTANCE.d("CoursePlayerInfo", "onDataOk: status = " + d.allInfo.getStatus());
        if (d.allInfo.getStatus() == 1) {
            showEmpty(czi.course_offline, xmi.course_offline);
            return;
        }
        ViewExtKt.clickWithTrigger$default(((gr4) getMBinding()).P, 0L, new Function1() { // from class: ls4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoActivity.onDataOk$lambda$7(this.f25390a, d, (TextView) obj);
            }
        }, 1, null);
        CourseModel.PracticedSummary practicedSummary = d.practicedSummary;
        this.times = (practicedSummary != null ? practicedSummary.trainTimes : 0) + 1;
        if (isTrainingPlan()) {
            TextView startView = ((gr4) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(startView, "startView");
            ViewExtKt.gone(startView);
            TrainingStartBtn trainingStart = ((gr4) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(trainingStart, "trainingStart");
            ViewExtKt.visible(trainingStart);
            ((gr4) getMBinding()).S.showStatus(this.trainingCourseStatus, new View.OnClickListener() { // from class: ms4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CourseInfoActivity.onDataOk$lambda$8(this.f27151a, d, view);
                }
            }, this.planId, this.courseId);
        } else {
            TextView startView2 = ((gr4) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(startView2, "startView");
            ViewExtKt.visible(startView2);
            TrainingStartBtn trainingStart2 = ((gr4) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(trainingStart2, "trainingStart");
            ViewExtKt.gone(trainingStart2);
            TextView textView = ((gr4) getMBinding()).P;
            Resources resources = getResources();
            int i = kyi.course_start_times;
            int i2 = this.times;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        }
        final CourseModel.CourseData basicInfo = courseAllInfo.getBasicInfo();
        if (basicInfo != null) {
            IActionBar.DefaultImpls.setEndView$default(this, 0, UIUtils.isNightMode(AppUtil.getApp()) ? xmi.j : xmi.f39270k, getString(czi.j), new View.OnClickListener() { // from class: ns4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CourseInfoActivity.onDataOk$lambda$10$lambda$9(this.f28311a, basicInfo, courseAllInfo, view);
                }
            }, 1, null);
            String str = basicInfo.title;
            this.courseName = str;
            setTitle(str);
        }
        CourseInfoHeaderPreView.showCoutrolUI$default(((gr4) getMBinding()).H, 0, false, 2, null);
        CourseConfigModel.ConfigDetail detailInfo = courseAllInfo.getDetailInfo();
        if (detailInfo != null) {
            if (isTrainingPlan()) {
                LinearLayout freqAndDevice = ((gr4) getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(freqAndDevice, "freqAndDevice");
                ViewExtKt.gone(freqAndDevice);
            }
            ((gr4) getMBinding()).N.setText(detailInfo.train_frequency);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getString(czi.course_frequency));
            stringBuffer.append(",");
            stringBuffer.append(detailInfo.train_frequency);
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ((gr4) getMBinding()).L.setContentDescription(string);
            ((gr4) getMBinding()).J.setText(detailInfo.equipments);
            LinearLayout linearLayout = ((gr4) getMBinding()).I;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(getString(czi.course_device));
            stringBuffer2.append(",");
            stringBuffer2.append(detailInfo.equipments);
            linearLayout.setContentDescription(stringBuffer2.toString());
            ((gr4) getMBinding()).R.setText(detailInfo.attentions);
            List<CourseConfigModel.Exercise> list = detailInfo.exercises;
            if (list == null || list.isEmpty()) {
                Group contentLabelGroup = ((gr4) getMBinding()).F;
                Intrinsics.checkNotNullExpressionValue(contentLabelGroup, "contentLabelGroup");
                ViewExtKt.gone(contentLabelGroup);
            } else {
                ((gr4) getMBinding()).G.setText(getResources().getQuantityString(kyi.course_content_segment, detailInfo.exercises.size(), Integer.valueOf(detailInfo.exercises.size())));
                if (courseAllInfo.getType() == 1) {
                    RecyclerView recyclerView = ((gr4) getMBinding()).O;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                    ViewExtKt.visible(recyclerView);
                    setLayoutManager();
                    RecyclerView recyclerView2 = ((gr4) getMBinding()).O;
                    List<CourseConfigModel.Exercise> exercises = detailInfo.exercises;
                    Intrinsics.checkNotNullExpressionValue(exercises, "exercises");
                    recyclerView2.setAdapter(new CourseContentAdapter(exercises, CourseExtKt.coachSelectable(courseAllInfo)));
                } else {
                    TextView audioMoreView = ((gr4) getMBinding()).C;
                    Intrinsics.checkNotNullExpressionValue(audioMoreView, "audioMoreView");
                    ViewExtKt.visible(audioMoreView);
                    LinearLayout audioContainer = ((gr4) getMBinding()).A;
                    Intrinsics.checkNotNullExpressionValue(audioContainer, "audioContainer");
                    ViewExtKt.visible(audioContainer);
                    DividerView audioDivider = ((gr4) getMBinding()).B;
                    Intrinsics.checkNotNullExpressionValue(audioDivider, "audioDivider");
                    ViewExtKt.visible(audioDivider);
                    this.audioExercise = detailInfo.exercises;
                    setAudioView(false);
                }
            }
        }
        if (this.needTrack) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("name", "Class_Entrance");
            pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40470");
            pairArr[2] = TuplesKt.to("source", Integer.valueOf(getMFrom()));
            CourseModel.CourseData basicInfo2 = courseAllInfo.getBasicInfo();
            pairArr[3] = TuplesKt.to("type_sku", Integer.valueOf((basicInfo2 != null ? basicInfo2.pricingStatus : 0) + 1));
            pairArr[4] = TuplesKt.to("asset_id", String.valueOf(this.courseId));
            pairArr[5] = TuplesKt.to(OneTrack.Param.ASSET_NAME, this.courseName);
            oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
            this.needTrack = false;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass5(courseAllInfo, d, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataOk$lambda$10$lambda$9(CourseInfoActivity this$0, CourseModel.CourseData this_apply, CourseAllInfo courseAllInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.getShareComponent().x(this_apply.title, this_apply.subTitle, CourseExtKt.SHARE_URL + courseAllInfo.getCourseId(), null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataOk$lambda$7(CourseInfoActivity this$0, CourseModel.CourseDetailResult d, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.triggerPlay(d);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataOk$lambda$8(CourseInfoActivity this$0, CourseModel.CourseDetailResult d, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.triggerPlay(d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAudioItem(CourseConfigModel.Exercise content) {
        fu4 fu4VarA0 = fu4.A0(ExtUtilsKt.getInflater(this), ((gr4) getMBinding()).A, true);
        Intrinsics.checkNotNullExpressionValue(fu4VarA0, "inflate(...)");
        fu4VarA0.A.setText(content.title);
        fu4VarA0.C.setText(content.subTitle);
        fu4VarA0.B.setImageResource(CourseExtKt.getAudioContentImg(content.type, this.courseType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAudioView(boolean more) {
        LogUtil.INSTANCE.d("CoursePlayerInfo", "setAudioView: " + more + "; moreH = " + this.audioMoreHeight + "; lessH = " + this.audioLessHeight);
        if (more) {
            ((gr4) getMBinding()).C.setText(getString(czi.course_close_show_more));
            ((gr4) getMBinding()).C.setCompoundDrawablesWithIntrinsicBounds(xmi.course_arrow_up, 0, 0, 0);
            if (this.audioMoreHeight != 0) {
                LinearLayout linearLayout = ((gr4) getMBinding()).A;
                ViewGroup.LayoutParams layoutParams = ((gr4) getMBinding()).A.getLayoutParams();
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
            ((gr4) getMBinding()).A.post(new Runnable() { // from class: rs4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseInfoActivity.setAudioView$lambda$23(this.f32848a);
                }
            });
            return;
        }
        ((gr4) getMBinding()).C.setText(getString(czi.course_info_all));
        ((gr4) getMBinding()).C.setCompoundDrawablesWithIntrinsicBounds(xmi.course_arrow_down, 0, 0, 0);
        if (this.audioLessHeight != 0) {
            LinearLayout linearLayout2 = ((gr4) getMBinding()).A;
            ViewGroup.LayoutParams layoutParams2 = ((gr4) getMBinding()).A.getLayoutParams();
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
            TextView audioMoreView = ((gr4) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioMoreView, "audioMoreView");
            ViewExtKt.gone(audioMoreView);
        }
        ((gr4) getMBinding()).A.post(new Runnable() { // from class: ps4
            @Override // java.lang.Runnable
            public final void run() {
                CourseInfoActivity.setAudioView$lambda$21(this.f30698a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setAudioView$lambda$21(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.audioLessHeight = ((gr4) this$0.getMBinding()).A.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setAudioView$lambda$23(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.audioMoreHeight = ((gr4) this$0.getMBinding()).A.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void setLayoutManager() {
        RecyclerView.o linearLayoutManager;
        RecyclerView recyclerView = ((gr4) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ItemDecorationExtKt.clearAllItemDecorations(recyclerView);
        if (UIUtils.INSTANCE.getScreenState() == 0) {
            ((gr4) getMBinding()).O.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(12), false, 4, null));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.mi.health.course.activity.CourseInfoActivity$setLayoutManager$layoutManager$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return 1;
                }
            });
            linearLayoutManager = gridLayoutManager;
        } else {
            ((gr4) getMBinding()).O.addItemDecoration(new gak(ExtUtilsKt.getDp(12)));
            linearLayoutManager = new LinearLayoutManager(this, 0, false);
        }
        ((gr4) getMBinding()).O.setLayoutManager(linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4m shareComponent_delegate$lambda$0(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new s4m(this$0);
    }

    private final void showConnectDialog(final List<? extends Product> products) {
        int i = czi.course_link_title;
        int dialogDescriptionIdByModel = czi.course_link_desc;
        if (!products.isEmpty()) {
            int dialogTitleIdByModel = getDialogTitleIdByModel(products.get(0).getModel());
            dialogDescriptionIdByModel = getDialogDescriptionIdByModel(products.get(0).getModel());
            i = dialogTitleIdByModel;
        }
        new CommonDialog.c("connect").setDialogTitle(i).setDialogDescription(dialogDescriptionIdByModel).setPositiveText(czi.course_link_go).setNegativeText(czi.common_cancel).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.CourseInfoActivity.showConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    SportEcoExt.INSTANCE.setFromUri(SportRouterKt.GYM_COURSE_INFO);
                    DeviceManagerExtKt.launchToScanDeviceWithIds$default(CourseInfoActivity.this, products, true, null, 4, null);
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showCourseGetVipPopupWindow() {
        View view;
        String model;
        if (this.getVipPopupWindow == null) {
            this.getVipPopupWindow = new PopupWindow(-2, -2);
        }
        PopupWindow popupWindow = this.getVipPopupWindow;
        if (popupWindow == null || !popupWindow.isShowing()) {
            TextView startView = ((gr4) getMBinding()).P;
            String str = "startView";
            Intrinsics.checkNotNullExpressionValue(startView, "startView");
            if (startView.getVisibility() == 0) {
                view = ((gr4) getMBinding()).P;
            } else {
                view = ((gr4) getMBinding()).S;
                str = "trainingStart";
            }
            Intrinsics.checkNotNullExpressionValue(view, str);
            View viewInflate = LayoutInflater.from(this).inflate(sti.course_get_vip_popupwindow_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            PopupWindow popupWindow2 = this.getVipPopupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setContentView(viewInflate);
            }
            PopupWindow popupWindow3 = this.getVipPopupWindow;
            if (popupWindow3 != null) {
                popupWindow3.setFocusable(false);
            }
            PopupWindow popupWindow4 = this.getVipPopupWindow;
            if (popupWindow4 != null) {
                popupWindow4.setBackgroundDrawable(new ColorDrawable(0));
            }
            PopupWindow popupWindow5 = this.getVipPopupWindow;
            if (popupWindow5 != null) {
                popupWindow5.setOutsideTouchable(false);
            }
            PopupWindow popupWindow6 = this.getVipPopupWindow;
            if (popupWindow6 != null) {
                popupWindow6.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: as4
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        CourseInfoActivity.showCourseGetVipPopupWindow$lambda$12();
                    }
                });
            }
            ViewExtKt.clickWithTrigger$default(viewInflate, 0L, new Function1() { // from class: bs4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseInfoActivity.showCourseGetVipPopupWindow$lambda$13((View) obj);
                }
            }, 1, null);
            viewInflate.measure(0, 0);
            view.getLocationOnScreen(new int[2]);
            int measuredWidth = viewInflate.getMeasuredWidth();
            int measuredHeight = viewInflate.getMeasuredHeight();
            int width = (view.getWidth() - measuredWidth) / 2;
            int dp = (-(measuredHeight + view.getHeight())) - ExtUtilsKt.getDp(Float.valueOf(9.0f));
            PopupWindow popupWindow7 = this.getVipPopupWindow;
            if (popupWindow7 != null) {
                popupWindow7.showAsDropDown(view, width, dp);
            }
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("name", "Member_claim_exposure");
            pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40823");
            pairArr[2] = TuplesKt.to(FaceDetailFragment.PAGE_NAME, 2);
            pairArr[3] = TuplesKt.to("asset_id", String.valueOf(this.courseId));
            pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, this.courseName);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            pairArr[5] = TuplesKt.to("device_model", model);
            oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCourseGetVipPopupWindow$lambda$12() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCourseGetVipPopupWindow$lambda$13(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void showHrConditionDialog() {
        new CommonDialog.c("HrCondition").setDialogDescription(czi.course_hr_enter_condition).setPositiveText(czi.course_got_it).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.CourseInfoActivity.showHrConditionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showOpenVipDialog(boolean isBottomBtn) {
        MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE).showVipPurchaseDialog("course_" + this.courseId);
        ((gr4) getMBinding()).H.onStop();
    }

    private final void showUserInfoDialog(final Function0<Unit> positive, final Function0<Unit> negative) {
        new CommonDialog.c("userinfo").setDialogDescription(czi.course_user_info_desc).setNegativeText(czi.common_cancel).setPositiveText(czi.c).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.CourseInfoActivity.showUserInfoDialog.1
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerPlay(final CourseModel.CourseDetailResult d) {
        String str;
        CourseModel.CourseData basicInfo;
        String model;
        PopupWindow popupWindow = this.getVipPopupWindow;
        if (popupWindow != null && popupWindow.isShowing()) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("name", "Member_claim_btn");
            pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40523");
            pairArr[2] = TuplesKt.to(FaceDetailFragment.PAGE_NAME, 2);
            pairArr[3] = TuplesKt.to("asset_id", String.valueOf(this.courseId));
            pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, this.courseName);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            pairArr[5] = TuplesKt.to("device_model", model);
            oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
            CourseApi.DefaultImpls.getNewEquipmentBenefits$default(CourseApiKt.getCourseApi(), new Function1() { // from class: qs4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseInfoActivity.triggerPlay$lambda$32(this.f31793a, (CourseNewEquipmentBenefits) obj);
                }
            }, null, 2, null);
            return;
        }
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showCloudSyncDialog(this, null);
            return;
        }
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "cn") && (basicInfo = d.allInfo.getBasicInfo()) != null && basicInfo.pricingStatus == 2 && !this.vipActive) {
                showOpenVipDialog(true);
                return;
            }
        }
        CourseConfigModel.DeviceLinkage deviceLinkage = d.allInfo.getDeviceLinkage();
        Set<String> set = deviceLinkage != null ? deviceLinkage.models : null;
        String str2 = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
        String key_gym_local_sport_type = "ksmb.treadmill.m1v1";
        if (str2 == null || str2.length() == 0) {
            str = "ksmb.treadmill.m1v1";
        } else {
            str = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
            Intrinsics.checkNotNull(str);
        }
        this.model = str;
        LogUtil.INSTANCE.d("CoursePlayerInfo", "解析课程获得首要支持的设备model = " + str);
        String str3 = (String) StringsKt__StringsKt.split$default((CharSequence) this.model, new char[]{'.'}, false, 0, 6, (Object) null).get(1);
        this.linkModelIsKms = Intrinsics.areEqual(str3, "treadmill");
        this.linkModelIsBike = Intrinsics.areEqual(str3, SportConstants.GYM_MODEL_BIKE_PREFIX);
        this.linkModelIsJump = Intrinsics.areEqual(str3, SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX_MIDDLE);
        if (this.linkModelIsKms) {
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m1v1");
            if (localDeviceModel == null || !localDeviceModel.getIsDeviceConnected()) {
                key_gym_local_sport_type = "ksmb.treadmill.m2";
                WearableDeviceModel localDeviceModel2 = DeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m2");
                if (localDeviceModel2 == null || !localDeviceModel2.getIsDeviceConnected()) {
                    key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
                    if (key_gym_local_sport_type.length() == 0 || !Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) key_gym_local_sport_type, new char[]{'.'}, false, 0, 6, (Object) null).get(1), "treadmill")) {
                        key_gym_local_sport_type = this.model;
                    }
                }
            }
            this.model = key_gym_local_sport_type;
            Logger.i("CoursePlayerInfo", "linkModelIs the model is = " + key_gym_local_sport_type);
        }
        if (this.linkModelIsBike) {
            EcoDeviceManager.Companion companion2 = EcoDeviceManager.INSTANCE;
            String key_gym_local_sport_type2 = "runmi.exbike.jscrm1";
            EcoDeviceModel localDeviceModel3 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel("runmi.exbike.jscrm1");
            if (localDeviceModel3 == null || !localDeviceModel3.getIsDeviceConnected()) {
                key_gym_local_sport_type2 = "yesoul.exbike.jsc01y";
                EcoDeviceModel localDeviceModel4 = EcoDeviceManagerExtKt.getInstance(companion2).getLocalDeviceModel("yesoul.exbike.jsc01y");
                if (localDeviceModel4 == null || !localDeviceModel4.getIsDeviceConnected()) {
                    key_gym_local_sport_type2 = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
                    if (key_gym_local_sport_type2.length() == 0 || !Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) key_gym_local_sport_type2, new char[]{'.'}, false, 0, 6, (Object) null).get(1), SportConstants.GYM_MODEL_BIKE_PREFIX)) {
                        key_gym_local_sport_type2 = this.model;
                    }
                }
            }
            this.model = key_gym_local_sport_type2;
            Logger.i("CoursePlayerInfo", "linkModelIs the model is = " + key_gym_local_sport_type2);
        }
        if (this.linkModelIsJump) {
            EcoDeviceManager.Companion companion3 = EcoDeviceManager.INSTANCE;
            String key_gym_local_sport_type3 = "yunmai.jmprope.sr803";
            EcoDeviceModel localDeviceModel5 = EcoDeviceManagerExtKt.getInstance(companion3).getLocalDeviceModel("yunmai.jmprope.sr803");
            if (localDeviceModel5 == null || !localDeviceModel5.getIsDeviceConnected()) {
                EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion3);
                key_gym_local_sport_type3 = SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED;
                EcoDeviceModel localDeviceModel6 = ecoDeviceManagerExtKt.getLocalDeviceModel(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED);
                if (localDeviceModel6 == null || !localDeviceModel6.getIsDeviceConnected()) {
                    key_gym_local_sport_type3 = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
                    if (key_gym_local_sport_type3.length() == 0 || !Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) key_gym_local_sport_type3, new char[]{'.'}, false, 0, 6, (Object) null).get(1), SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX_MIDDLE)) {
                        key_gym_local_sport_type3 = this.model;
                    }
                }
            }
            this.model = key_gym_local_sport_type3;
            Logger.i("CoursePlayerInfo", "linkModelIs the model is = " + key_gym_local_sport_type3);
        }
        int i = this.courseType;
        if (i == 1 || i == 2) {
            if (!UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).isCompleted()) {
                CoursePreference coursePreference = CoursePreference.INSTANCE;
                if (!coursePreference.isShowUserInfoDialog()) {
                    coursePreference.setShowUserInfoDialog(true);
                    showUserInfoDialog(new Function0() { // from class: us4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CourseInfoActivity.triggerPlay$lambda$35(this.f36076a);
                        }
                    }, new Function0() { // from class: vs4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CourseInfoActivity.triggerPlay$lambda$36(this.f37178a, d);
                        }
                    });
                    return;
                }
            }
            intentToCourseAudioAndVideo(d);
            return;
        }
        if (i != 3) {
            return;
        }
        String birth = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getBirth();
        if (birth == null || birth.length() == 0) {
            showUserInfoDialog(new Function0() { // from class: ss4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CourseInfoActivity.triggerPlay$lambda$33(this.f33938a);
                }
            }, new Function0() { // from class: ts4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else {
            intentToCourseHr(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$32(final CourseInfoActivity this$0, final CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
        String code;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CourseApi courseApi = CourseApiKt.getCourseApi();
        if (courseNewEquipmentBenefits == null || (code = courseNewEquipmentBenefits.getCode()) == null) {
            code = "";
        }
        courseApi.exchangeCourseBenefits(code, new Function1() { // from class: xs4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoActivity.triggerPlay$lambda$32$lambda$30(courseNewEquipmentBenefits, this$0, (CourseExchangeBenefits) obj);
            }
        }, new Function1() { // from class: ys4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoActivity.triggerPlay$lambda$32$lambda$31(this.f40482a, (ApiException) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit triggerPlay$lambda$32$lambda$30(CourseNewEquipmentBenefits courseNewEquipmentBenefits, final CourseInfoActivity this$0, CourseExchangeBenefits exchangeResult) {
        String model;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exchangeResult, "exchangeResult");
        if (courseNewEquipmentBenefits != null) {
            courseNewEquipmentBenefits.setStatus(exchangeResult.getStatus());
        }
        Integer status = exchangeResult.getStatus();
        if (status != null && status.intValue() == 1) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[7];
            pairArr[0] = TuplesKt.to("name", "Member_received");
            pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40524");
            pairArr[2] = TuplesKt.to(FaceDetailFragment.PAGE_NAME, 2);
            pairArr[3] = TuplesKt.to("asset_id", String.valueOf(this$0.courseId));
            pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, this$0.courseName);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            pairArr[5] = TuplesKt.to("device_model", model);
            pairArr[6] = TuplesKt.to("type_sku", Integer.valueOf(exchangeResult.getMembership().getDays()));
            oneTrackExtKt.reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(pairArr));
            ToastExtKt.toastLong(this$0, ResourceExtKt.getQuantityString(this$0, kyi.course_benefit_days, exchangeResult.getMembership().getDays(), Integer.valueOf(exchangeResult.getMembership().getDays())));
            CourseApiKt.getCourseApi().refreshCourseVipData(new Function1() { // from class: cs4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseInfoActivity.triggerPlay$lambda$32$lambda$30$lambda$26(this.f14665a, (CourseVipInfo) obj);
                }
            }, new Function0() { // from class: ds4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CourseInfoActivity.triggerPlay$lambda$32$lambda$30$lambda$27(this.f15872a);
                }
            });
        } else if (status != null && status.intValue() == 2) {
            ToastExtKt.toastShort(this$0, czi.course_benefit_has_expired);
            PopupWindow popupWindow = this$0.getVipPopupWindow;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            ((gr4) this$0.getMBinding()).P.post(new Runnable() { // from class: es4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseInfoActivity.triggerPlay$lambda$32$lambda$30$lambda$28(this.f17012a);
                }
            });
        } else if (status != null && status.intValue() == 3) {
            ToastExtKt.toastShort(this$0, czi.course_benefit_has_empty);
            PopupWindow popupWindow2 = this$0.getVipPopupWindow;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            ((gr4) this$0.getMBinding()).P.post(new Runnable() { // from class: gs4
                @Override // java.lang.Runnable
                public final void run() {
                    CourseInfoActivity.triggerPlay$lambda$32$lambda$30$lambda$29(this.f19290a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit triggerPlay$lambda$32$lambda$30$lambda$26(final CourseInfoActivity this$0, CourseVipInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        PopupWindow popupWindow = this$0.getVipPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this$0.needAutoPlayVideo = true;
        ((gr4) this$0.getMBinding()).P.postDelayed(new Runnable() { // from class: ws4
            @Override // java.lang.Runnable
            public final void run() {
                CourseInfoActivity.triggerPlay$lambda$32$lambda$30$lambda$26$lambda$25(this.f38303a);
            }
        }, 1000L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void triggerPlay$lambda$32$lambda$30$lambda$26$lambda$25(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CourseInfoVM) this$0.getMViewModel()).reqInfo(this$0.courseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$32$lambda$30$lambda$27(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, czi.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void triggerPlay$lambda$32$lambda$30$lambda$28(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = ((gr4) this$0.getMBinding()).P;
        Resources resources = this$0.getResources();
        int i = kyi.course_start_times;
        int i2 = this$0.times;
        textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void triggerPlay$lambda$32$lambda$30$lambda$29(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = ((gr4) this$0.getMBinding()).P;
        Resources resources = this$0.getResources();
        int i = kyi.course_start_times;
        int i2 = this$0.times;
        textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$32$lambda$31(CourseInfoActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ToastExtKt.toastShort(this$0, czi.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$33(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(this$0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$35(CourseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(this$0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerPlay$lambda$36(CourseInfoActivity this$0, CourseModel.CourseDetailResult d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.intentToCourseAudioAndVideo(d);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_fragment_info;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
        List<Fragment> listY0 = getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        for (Fragment fragment : listY0) {
            if (fragment instanceof DialogFragment) {
                ((DialogFragment) fragment).dismiss();
            }
        }
        ((gr4) getMBinding()).getRoot().post(new Runnable() { // from class: zr4
            @Override // java.lang.Runnable
            public final void run() {
                CourseInfoActivity.onConfigurationChanged$lambda$6(this.f41591a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CoursePreference.INSTANCE.setShowCourseInfoFragment(true);
        this.courseId = getIntent().getLongExtra("course_id", 0L);
        Serializable serializableExtra = getIntent().getSerializableExtra(BaseCourseActivityKt.KEY_TRAINING_PLAN_INFO);
        TrainingCourseInfo trainingCourseInfo = serializableExtra instanceof TrainingCourseInfo ? (TrainingCourseInfo) serializableExtra : null;
        long planId = trainingCourseInfo != null ? trainingCourseInfo.getPlanId() : 0L;
        this.planId = planId;
        Logger.d("CoursePlayerInfo", "planId:" + planId);
        this.trainingCourseStatus = trainingCourseInfo != null ? trainingCourseInfo.getStatus() : -1;
        long j = this.courseId;
        if (j <= 0) {
            Logger.i("CoursePlayerInfo", "onCreate: invalid course id " + j);
            finish();
            return;
        }
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ToastExtKt.toast$default(this, czi.course_login_not_now, 0, 0, 0L, 14, null);
            Logger.i("CoursePlayerInfo", "onCreate: login out");
            finish();
            return;
        }
        setTitleBackground(bli.course_white);
        ViewExtKt.clickWithTrigger$default(((gr4) getMBinding()).C, 0L, new Function1() { // from class: ur4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoActivity.onCreate$lambda$3(this.f36045a, (TextView) obj);
            }
        }, 1, null);
        ((CourseInfoVM) getMViewModel()).getEmitter().observe(this, new CourseInfoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fs4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoActivity.onCreate$lambda$4(this.f18144a, (StateData) obj);
            }
        }));
        ((CourseInfoVM) getMViewModel()).reqInfo(this.courseId);
        if (isTrainingPlan()) {
            aje.b(this).c(new BroadcastReceiver() { // from class: com.mi.health.course.activity.CourseInfoActivity.onCreate.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    CourseInfoActivity.this.finish();
                }
            }, new IntentFilter(TrainingPlanConstantsKt.FINISH_COURSE_INFO_ACTIVITY));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CoursePreference.INSTANCE.setShowCourseInfoFragment(false);
        ((gr4) getMBinding()).H.disposeImageRequestIfNeed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
        ((CourseInfoVM) getMViewModel()).reqInfo(this.courseId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        String str = this.courseName;
        if (str == null || str.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d("CoursePlayerInfo", "onStop: course_detail_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "course_detail_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("asset_id", String.valueOf(this.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, this.courseName), TuplesKt.to("tip", "56.2.2.1.19566")));
        ((gr4) getMBinding()).H.onStop();
    }

    private final void showConnectDialog(final Product product) {
        new CommonDialog.c("connect").setDialogTitle(getDialogTitleIdByModel(product.getModel())).setDialogDescription(getDialogDescriptionIdByModel(product.getModel())).setPositiveText(czi.course_link_go).setNegativeText(czi.common_cancel).create().addDialogCallback(new av6() { // from class: com.mi.health.course.activity.CourseInfoActivity.showConnectDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    SportEcoExt.INSTANCE.setFromUri(SportRouterKt.GYM_COURSE_INFO);
                    DeviceManagerExtKt.launchToScanDevice(CourseInfoActivity.this, product, true);
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }
}
