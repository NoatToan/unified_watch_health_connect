package com.huami.sleep.sleephome.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chenenyu.router.annotation.Route;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.selectmainsource.ui.SleepSelectMainSourceActivity;
import com.huami.sleep.sleepedit.ui.SleepEditedActivity;
import com.huami.sleep.sleephome.dialog.SleepDetailDialogAdapter;
import com.huami.sleep.sleephome.dialog.SleepMoreActionDialogFragment;
import com.huami.sleep.sleephome.promotion.SleepPromotionManager;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.ui.SleepMonthStatisticsFragment;
import com.huami.sleep.statistic.ui.SleepWeekStatisticsFragment;
import com.huami.sleep.statistic.ui.SleepYearStatisticsFragment;
import com.huami.sleep.util.RoundedCornersTransformation;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Route({RouterHelper.SLEEP_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b[\u0010\\J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\u000b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0007H\u0014J\u0012\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014J\b\u0010$\u001a\u00020\u0007H\u0014J\u0012\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\tH\u0014J\"\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010!H\u0014J\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0016\u0010>\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010H\u001a\n E*\u0004\u0018\u00010D0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001d\u0010M\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0016\u0010P\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010OR\u0016\u0010R\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u001d\u0010U\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bA\u0010TR\u001d\u0010V\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bN\u0010LR\u001d\u0010Z\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bF\u0010Y¨\u0006^"}, d2 = {"Lcom/huami/sleep/sleephome/ui/SleepHomeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/widget/ImageView;", "", "url", "", "placeholder", "", "N", "Landroid/view/View;", Constant.PAI_KEY_DAILY_PAI, "B", SOAP.XMLNS, "J", "M", "initViews", "H", "index", "P", "Landroidx/fragment/app/FragmentTransaction;", SleepAnalysisFragment.TIME_MODE, "G", LogUtil.I, "y", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "finish", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "onDestroy", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "requestCode", "resultCode", "data", "onActivityResult", "onSelectDataFrom", "onEdit", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "shareSleepVo", "onShare", "Lcom/huami/sleep/daysleep/daydetail/ui/SleepDetailFragment;", "x", "Lcom/huami/sleep/daysleep/daydetail/ui/SleepDetailFragment;", "mSleepDayFragment", "Lcom/huami/sleep/statistic/ui/SleepWeekStatisticsFragment;", "Lcom/huami/sleep/statistic/ui/SleepWeekStatisticsFragment;", "mSleepWeekFragment", "Lcom/huami/sleep/statistic/ui/SleepMonthStatisticsFragment;", "z", "Lcom/huami/sleep/statistic/ui/SleepMonthStatisticsFragment;", "mSleepMonthFragment", "Lcom/huami/sleep/statistic/ui/SleepYearStatisticsFragment;", "Lcom/huami/sleep/statistic/ui/SleepYearStatisticsFragment;", "mSleepYearFragment", "type", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "C", "Landroid/util/SparseArray;", "fragments", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "kotlin.jvm.PlatformType", LogUtil.D, "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "today", "Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "E", "Lkotlin/Lazy;", "()Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "sleepHomeViewModel", "F", "Ljava/lang/String;", "mTag", "mKey", "mUserId", "Lcom/huami/sleep/sleephome/dialog/SleepMoreActionDialogFragment;", "()Lcom/huami/sleep/sleephome/dialog/SleepMoreActionDialogFragment;", "mRightClickDialog", "sleepViewModel", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionManager;", "K", "()Lcom/huami/sleep/sleephome/promotion/SleepPromotionManager;", "promotionManager", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepHomeActivity extends BaseTitleActivity {

    @NotNull
    public static final String ARG_KEY = "key";

    @NotNull
    public static final String ARG_TYPE = "type";

    @NotNull
    public static final String ARG_USER_ID = "user_id";

    @NotNull
    public static final String FROM = "from";

    @NotNull
    public static final String FROM_NOTIFICATION = "notification";
    public static final int REQUEST_CODE_EDIT_SLEEP = 0;

    @NotNull
    public static final String SLEEP_KEY_1 = "sleep_key_1";

    @NotNull
    public static final String SOURCE_FROM = "source_from";
    public static final int SOURCE_FROM_DEVICE = 1;
    public static final int SOURCE_FROM_HOME = 0;
    public static final int SOURCE_FROM_OTHER_NOTICE = 3;
    public static final int SOURCE_FROM_PROMOTION = 4;
    public static final int SOURCE_FROM_SYNC_NOTICE = 2;
    public static final int TYPE_DAY = 0;
    public static final int TYPE_MONTH = 2;
    public static final int TYPE_WEEK = 1;
    public static final int TYPE_YEAR = 3;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private SleepYearStatisticsFragment mSleepYearFragment;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private String mKey;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy promotionManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private SleepDetailFragment mSleepDayFragment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private SleepWeekStatisticsFragment mSleepWeekFragment;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private SleepMonthStatisticsFragment mSleepMonthFragment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String L = SleepHomeActivity.class.getSimpleName();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<Fragment> fragments = new SparseArray<>();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private SportDay today = SportDay.getToday();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepHomeViewModel = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepHomeActivity";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private String mUserId = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRightClickDialog = LazyKt__LazyJVMKt.lazy(new Function0<SleepMoreActionDialogFragment>() { // from class: com.huami.sleep.sleephome.ui.SleepHomeActivity$mRightClickDialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepMoreActionDialogFragment invoke() {
            SleepMoreActionDialogFragment sleepMoreActionDialogFragmentNewInstance = SleepMoreActionDialogFragment.INSTANCE.newInstance();
            final SleepHomeActivity sleepHomeActivity = this.a;
            sleepMoreActionDialogFragmentNewInstance.setOnItemClickListener(new SleepDetailDialogAdapter.OnItemClickListener() { // from class: com.huami.sleep.sleephome.ui.SleepHomeActivity$mRightClickDialog$2$1$1
                @Override // com.huami.sleep.sleephome.dialog.SleepDetailDialogAdapter.OnItemClickListener
                public void onItemClick(@NotNull ShowActionItemInfo info) {
                    String id = info.getId();
                    if (id != null) {
                        int iHashCode = id.hashCode();
                        if (iHashCode == -1333894576) {
                            if (id.equals(ShowActionItemInfo.DATA_SOURCE)) {
                                sleepHomeActivity.onSelectDataFrom();
                                sleepHomeActivity.C().dismiss();
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 3108362) {
                            if (id.equals(ShowActionItemInfo.EDIT)) {
                                sleepHomeActivity.onEdit();
                                sleepHomeActivity.C().dismiss();
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 109400031 && id.equals("share")) {
                            SleepHomeActivity sleepHomeActivity2 = sleepHomeActivity;
                            sleepHomeActivity2.onShare(sleepHomeActivity2.F().getShareSleepVo());
                            sleepHomeActivity.C().dismiss();
                        }
                    }
                }
            });
            return sleepMoreActionDialogFragmentNewInstance;
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0016\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011¨\u0006!"}, d2 = {"Lcom/huami/sleep/sleephome/ui/SleepHomeActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "key", "", WebConstant.QueryParam.LAUNCH, "ARG_KEY", "Ljava/lang/String;", "ARG_TYPE", "ARG_USER_ID", "FROM", "FROM_NOTIFICATION", "", "REQUEST_CODE_EDIT_SLEEP", LogUtil.I, "SLEEP_KEY_1", "SOURCE_FROM", "SOURCE_FROM_DEVICE", "SOURCE_FROM_HOME", "SOURCE_FROM_OTHER_NOTICE", "SOURCE_FROM_PROMOTION", "SOURCE_FROM_SYNC_NOTICE", "kotlin.jvm.PlatformType", "TAG", "TYPE_DAY", "TYPE_MONTH", "TYPE_WEEK", "TYPE_YEAR", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.sleephome.ui.SleepHomeActivity$Companion$launch$1", f = "SleepHomeActivity.kt", i = {}, l = {645}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Intent b;
            public final /* synthetic */ Ref.ObjectRef<String> c;
            public final /* synthetic */ Context d;
            public final /* synthetic */ ISleepDataManager e;
            public final /* synthetic */ String f;

            /* JADX INFO: renamed from: com.huami.sleep.sleephome.ui.SleepHomeActivity$Companion$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.sleep.sleephome.ui.SleepHomeActivity$Companion$launch$1$1", f = "SleepHomeActivity.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0585a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public Object a;
                public int b;
                public final /* synthetic */ Ref.ObjectRef<String> c;
                public final /* synthetic */ ISleepDataManager d;
                public final /* synthetic */ String e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0585a(Ref.ObjectRef<String> objectRef, ISleepDataManager iSleepDataManager, String str, Continuation<? super C0585a> continuation) {
                    super(2, continuation);
                    this.c = objectRef;
                    this.d = iSleepDataManager;
                    this.e = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0585a(this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0585a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:17:0x004b  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Ref.ObjectRef<String> objectRef;
                    T t;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (TextUtils.isEmpty(this.c.element)) {
                            Ref.ObjectRef<String> objectRef2 = this.c;
                            ISleepDataManager iSleepDataManager = this.d;
                            String str = this.e;
                            this.a = objectRef2;
                            this.b = 1;
                            Object lastDataDate = iSleepDataManager.getLastDataDate(str, this);
                            if (lastDataDate == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef = objectRef2;
                            t = lastDataDate;
                        }
                        if (TextUtils.isEmpty(this.c.element)) {
                            this.c.element = SportDay.getToday().getKey();
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.a;
                    ResultKt.throwOnFailure(obj);
                    t = obj;
                    objectRef.element = t;
                    if (TextUtils.isEmpty(this.c.element)) {
                        this.c.element = SportDay.getToday().getKey();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Intent intent, Ref.ObjectRef<String> objectRef, Context context, ISleepDataManager iSleepDataManager, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = intent;
                this.c = objectRef;
                this.d = context;
                this.e = iSleepDataManager;
                this.f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0585a c0585a = new C0585a(this.c, this.e, this.f, null);
                    this.a = 1;
                    if (BuildersKt.withContext(io2, c0585a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.putExtra("key", this.c.element);
                this.d.startActivity(this.b);
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void launch(@NotNull Context context, @NotNull String userId, @Nullable String key) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = key;
            Intent intent = new Intent(context, (Class<?>) SleepHomeActivity.class);
            intent.putExtra("user_id", userId);
            intent.setFlags(268435456);
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(intent, objectRef, context, KoinExtKt.getSleepDataManager(), userId, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ TimeMode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TimeMode timeMode) {
            super(0);
            this.a = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "跳转：：type   " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ TimeMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, TimeMode timeMode) {
            super(0);
            this.a = i;
            this.b = timeMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "jumpFromSourceMark sourceFrom = " + this.a + " - modeType = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, Intent intent) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onActivityResult: requestCode " + this.a + ", resultCode:" + this.b + "," + (this.c == null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onActivityResult:  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "SleepHomeActivity onNewIntent";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleephome/promotion/SleepPromotionManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<SleepPromotionManager> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/widget/ImageView;", "imageView", "", "url", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<ImageView, String, Unit> {
            public final /* synthetic */ SleepHomeActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepHomeActivity sleepHomeActivity) {
                super(2);
                this.a = sleepHomeActivity;
            }

            public final void a(@NotNull ImageView imageView, @NotNull String str) {
                this.a.N(imageView, str, R.drawable.sleep_promotion_image_placeholder);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView, String str) {
                a(imageView, str);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/view/View;", "v", "", "<anonymous parameter 1>", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function3<View, Integer, SleepPromotionVo, Unit> {
            public final /* synthetic */ SleepHomeActivity a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ SleepPromotionVo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SleepPromotionVo sleepPromotionVo) {
                    super(0);
                    this.a = sleepPromotionVo;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "banner id = " + this.a.getId();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SleepHomeActivity sleepHomeActivity) {
                super(3);
                this.a = sleepHomeActivity;
            }

            public final void a(@NotNull View view, int i, @NotNull SleepPromotionVo sleepPromotionVo) {
                Map<String, String> mapMapOf = r.mapOf(TuplesKt.to("tp", "selected"), TuplesKt.to("id", sleepPromotionVo.getId()));
                HMLog.info(this.a.mTag, new a(sleepPromotionVo));
                SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLEEP_BANNER, q.mapOf(TuplesKt.to("from", sleepPromotionVo.getId())));
                KoinExtKt.getPageNavigate().adDoJumpAction(view.getContext(), Integer.valueOf(sleepPromotionVo.getNavigateInfo().getMode()), sleepPromotionVo.getNavigateInfo().getUrl(), null, mapMapOf);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, SleepPromotionVo sleepPromotionVo) {
                a(view, num.intValue(), sleepPromotionVo);
                return Unit.INSTANCE;
            }
        }

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepPromotionManager invoke() {
            SleepHomeActivity sleepHomeActivity = SleepHomeActivity.this;
            return new SleepPromotionManager(sleepHomeActivity, new a(sleepHomeActivity), SleepHomeActivity.this.E().getSleepPromotionData(), new b(SleepHomeActivity.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "selectIndex：：type  " + SleepHomeActivity.this.type + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<SleepHomeViewModel> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepHomeViewModel invoke() {
            return (SleepHomeViewModel) new ViewModelProvider(SleepHomeActivity.this).get(SleepHomeViewModel.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepHomeActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleephome.ui.SleepHomeActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sleepViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepHomeViewModel>() { // from class: com.huami.sleep.sleephome.ui.SleepHomeActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepHomeViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepHomeViewModel.class), function0, objArr);
            }
        });
        this.promotionManager = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final boolean A() {
        if (!this.today.isToday()) {
            this.today = SportDay.getToday();
            H();
        }
        return !this.today.isToday();
    }

    private final int B(View view, int i) {
        return (int) TypedValue.applyDimension(1, i, view.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepMoreActionDialogFragment C() {
        return (SleepMoreActionDialogFragment) this.mRightClickDialog.getValue();
    }

    private final SleepPromotionManager D() {
        return (SleepPromotionManager) this.promotionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepHomeViewModel E() {
        return (SleepHomeViewModel) this.sleepHomeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepHomeViewModel F() {
        return (SleepHomeViewModel) this.sleepViewModel.getValue();
    }

    private final FragmentTransaction G(FragmentTransaction fragmentTransaction, int i) {
        SparseArray<Fragment> sparseArray = this.fragments;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            Fragment fragmentValueAt = sparseArray.valueAt(i2);
            if (iKeyAt != i) {
                fragmentTransaction.hide(fragmentValueAt);
            }
        }
        return fragmentTransaction;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    private final void H() {
        String key;
        int i = R.id.container;
        ((FrameLayout) findViewById(i)).removeAllViews();
        if (this.fragments.size() != 0) {
            this.fragments.clear();
        }
        SleepDetailFragment.Companion companion = SleepDetailFragment.INSTANCE;
        String str = this.mUserId;
        String str2 = this.mKey;
        if (str2 == null) {
            key = SportDay.getToday().getKey();
        } else {
            if (str2.length() == 0) {
                key = SportDay.getToday().getKey();
            } else {
                key = this.mKey;
            }
        }
        this.mSleepDayFragment = companion.newInstance(str, key);
        this.mSleepWeekFragment = new SleepWeekStatisticsFragment(this.mUserId);
        this.mSleepMonthFragment = new SleepMonthStatisticsFragment(this.mUserId);
        this.mSleepYearFragment = new SleepYearStatisticsFragment(this.mUserId);
        SparseArray<Fragment> sparseArray = this.fragments;
        SleepDetailFragment sleepDetailFragment = this.mSleepDayFragment;
        Objects.requireNonNull(sleepDetailFragment);
        sparseArray.put(0, sleepDetailFragment);
        SleepWeekStatisticsFragment sleepWeekStatisticsFragment = this.mSleepWeekFragment;
        Objects.requireNonNull(sleepWeekStatisticsFragment);
        sparseArray.put(1, sleepWeekStatisticsFragment);
        SleepMonthStatisticsFragment sleepMonthStatisticsFragment = this.mSleepMonthFragment;
        Objects.requireNonNull(sleepMonthStatisticsFragment);
        sparseArray.put(2, sleepMonthStatisticsFragment);
        SleepYearStatisticsFragment sleepYearStatisticsFragment = this.mSleepYearFragment;
        Objects.requireNonNull(sleepYearStatisticsFragment);
        sparseArray.put(3, sleepYearStatisticsFragment);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SleepDetailFragment sleepDetailFragment2 = this.mSleepDayFragment;
        Objects.requireNonNull(sleepDetailFragment2);
        FragmentTransaction fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(i, sleepDetailFragment2);
        SleepWeekStatisticsFragment sleepWeekStatisticsFragment2 = this.mSleepWeekFragment;
        Objects.requireNonNull(sleepWeekStatisticsFragment2);
        FragmentTransaction fragmentTransactionAdd2 = fragmentTransactionAdd.add(i, sleepWeekStatisticsFragment2);
        SleepMonthStatisticsFragment sleepMonthStatisticsFragment2 = this.mSleepMonthFragment;
        Objects.requireNonNull(sleepMonthStatisticsFragment2);
        FragmentTransaction fragmentTransactionAdd3 = fragmentTransactionAdd2.add(i, sleepMonthStatisticsFragment2);
        SleepYearStatisticsFragment sleepYearStatisticsFragment2 = this.mSleepYearFragment;
        Objects.requireNonNull(sleepYearStatisticsFragment2);
        G(fragmentTransactionAdd3.add(i, sleepYearStatisticsFragment2).show(this.fragments.get(this.type)), this.type).commitNowAllowingStateLoss();
    }

    private final void I() {
        Serializable serializableExtra;
        Intent intent = getIntent();
        TimeMode timeMode = null;
        if (intent != null && (serializableExtra = intent.getSerializableExtra(SLEEP_KEY_1)) != null) {
            timeMode = (TimeMode) serializableExtra;
        }
        if (timeMode == null) {
            timeMode = TimeMode.DAY;
        }
        HMLog.info(this.mTag, new a(timeMode));
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            P(0);
            ((RadioButton) findViewById(R.id.tabDay)).setChecked(true);
            return;
        }
        if (i == 2) {
            P(1);
            ((RadioButton) findViewById(R.id.tabWeek)).setChecked(true);
        } else if (i == 3) {
            P(2);
            ((RadioButton) findViewById(R.id.tabMonth)).setChecked(true);
        } else {
            if (i != 4) {
                return;
            }
            P(3);
            ((RadioButton) findViewById(R.id.tabYear)).setChecked(true);
        }
    }

    private final void J() {
        y();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(SleepHomeActivity sleepHomeActivity, RadioGroup radioGroup, int i) {
        if (i == R.id.tabDay) {
            sleepHomeActivity.P(0);
            return;
        }
        if (i == R.id.tabWeek) {
            sleepHomeActivity.P(1);
        } else if (i == R.id.tabMonth) {
            sleepHomeActivity.P(2);
        } else if (i == R.id.tabYear) {
            sleepHomeActivity.P(3);
        }
    }

    private final void L() {
        Serializable serializableExtra;
        Intent intent = getIntent();
        TimeMode timeMode = null;
        if (intent != null && (serializableExtra = intent.getSerializableExtra(SLEEP_KEY_1)) != null) {
            timeMode = (TimeMode) serializableExtra;
        }
        if (timeMode == null) {
            timeMode = TimeMode.DAY;
        }
        Intent intent2 = getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra(SOURCE_FROM, 0) : 0;
        Map mapMapOf = q.mapOf(TuplesKt.to(SOURCE_FROM, String.valueOf(intExtra)));
        HMLog.info(this.mTag, new b(intExtra, timeMode));
        int i = WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.DETAIL_SLEEP_DAY_SOURCE_V, mapMapOf);
            return;
        }
        if (i == 2) {
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.DETAIL_SLEEP_WEEK_SOURCE_V, mapMapOf);
        } else if (i == 3) {
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.DETAIL_SLEEP_MONTH_SOURCE_V, mapMapOf);
        } else {
            if (i != 4) {
                return;
            }
            SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.DETAIL_SLEEP_YEAR_SOURCE_V, mapMapOf);
        }
    }

    private final void M() {
        initViews();
        L();
        I();
        Analytics.event(this, "Sleep_NotificationClickNum");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(ImageView imageView, String str, int i) {
        Glide.with(imageView).load(str).apply(new RequestOptions().placeholder(i).transforms(new CenterCrop(), new RoundedCornersTransformation(B(imageView, 6), 0, RoundedCornersTransformation.CornerType.TOP))).into(imageView);
    }

    private final void O() {
        if (A()) {
            return;
        }
        SleepMonthStatisticsFragment sleepMonthStatisticsFragment = this.mSleepMonthFragment;
        Objects.requireNonNull(sleepMonthStatisticsFragment);
        if (sleepMonthStatisticsFragment.getView() != null) {
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment = this.mSleepWeekFragment;
            Objects.requireNonNull(sleepWeekStatisticsFragment);
            if (sleepWeekStatisticsFragment.getView() == null) {
                return;
            }
            SleepMonthStatisticsFragment sleepMonthStatisticsFragment2 = this.mSleepMonthFragment;
            Objects.requireNonNull(sleepMonthStatisticsFragment2);
            int pageCurrentItem = sleepMonthStatisticsFragment2.getPageCurrentItem();
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment2 = this.mSleepWeekFragment;
            Objects.requireNonNull(sleepWeekStatisticsFragment2);
            int pageCurrentItem2 = sleepWeekStatisticsFragment2.getPageCurrentItem();
            SleepYearStatisticsFragment sleepYearStatisticsFragment = this.mSleepYearFragment;
            Objects.requireNonNull(sleepYearStatisticsFragment);
            int pageCurrentItem3 = sleepYearStatisticsFragment.getPageCurrentItem();
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            SleepMonthStatisticsFragment sleepMonthStatisticsFragment3 = this.mSleepMonthFragment;
            Objects.requireNonNull(sleepMonthStatisticsFragment3);
            fragmentTransactionBeginTransaction.remove(sleepMonthStatisticsFragment3);
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment3 = this.mSleepWeekFragment;
            Objects.requireNonNull(sleepWeekStatisticsFragment3);
            fragmentTransactionBeginTransaction.remove(sleepWeekStatisticsFragment3);
            SleepYearStatisticsFragment sleepYearStatisticsFragment2 = this.mSleepYearFragment;
            Objects.requireNonNull(sleepYearStatisticsFragment2);
            fragmentTransactionBeginTransaction.remove(sleepYearStatisticsFragment2);
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment4 = new SleepWeekStatisticsFragment(this.mUserId);
            sleepWeekStatisticsFragment4.setPageCurrentItem(pageCurrentItem2);
            Unit unit = Unit.INSTANCE;
            this.mSleepWeekFragment = sleepWeekStatisticsFragment4;
            SleepMonthStatisticsFragment sleepMonthStatisticsFragment4 = new SleepMonthStatisticsFragment(this.mUserId);
            sleepMonthStatisticsFragment4.setPageCurrentItem(pageCurrentItem);
            this.mSleepMonthFragment = sleepMonthStatisticsFragment4;
            SleepYearStatisticsFragment sleepYearStatisticsFragment3 = new SleepYearStatisticsFragment(this.mUserId);
            sleepYearStatisticsFragment3.setPageCurrentItem(pageCurrentItem3);
            this.mSleepYearFragment = sleepYearStatisticsFragment3;
            SparseArray<Fragment> sparseArray = this.fragments;
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment5 = this.mSleepWeekFragment;
            Objects.requireNonNull(sleepWeekStatisticsFragment5);
            sparseArray.put(1, sleepWeekStatisticsFragment5);
            SleepMonthStatisticsFragment sleepMonthStatisticsFragment5 = this.mSleepMonthFragment;
            Objects.requireNonNull(sleepMonthStatisticsFragment5);
            sparseArray.put(2, sleepMonthStatisticsFragment5);
            SleepYearStatisticsFragment sleepYearStatisticsFragment4 = this.mSleepYearFragment;
            Objects.requireNonNull(sleepYearStatisticsFragment4);
            sparseArray.put(3, sleepYearStatisticsFragment4);
            int i = R.id.container;
            SleepMonthStatisticsFragment sleepMonthStatisticsFragment6 = this.mSleepMonthFragment;
            Objects.requireNonNull(sleepMonthStatisticsFragment6);
            FragmentTransaction fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(i, sleepMonthStatisticsFragment6);
            SleepWeekStatisticsFragment sleepWeekStatisticsFragment6 = this.mSleepWeekFragment;
            Objects.requireNonNull(sleepWeekStatisticsFragment6);
            FragmentTransaction fragmentTransactionAdd2 = fragmentTransactionAdd.add(i, sleepWeekStatisticsFragment6);
            SleepYearStatisticsFragment sleepYearStatisticsFragment5 = this.mSleepYearFragment;
            Objects.requireNonNull(sleepYearStatisticsFragment5);
            G(fragmentTransactionAdd2.add(i, sleepYearStatisticsFragment5).show(this.fragments.get(this.type)), this.type).commitNowAllowingStateLoss();
        }
    }

    private final void P(int index) {
        E().setCurrentTab(index);
        if (index == 0) {
            this.type = 0;
            Analytics.recordEvent(new CountEventBuilder("DETAIL_SLEEP_V_DAY").setIdentified(true).setAnonymous(true));
        } else if (index == 1) {
            this.type = 1;
            Analytics.recordEvent(new CountEventBuilder("DETAIL_SLEEP_V_WEEK").setIdentified(true).setAnonymous(true));
        } else if (index == 2) {
            this.type = 2;
            Analytics.recordEvent(new CountEventBuilder("DETAIL_SLEEP_V_MONTH").setIdentified(true).setAnonymous(true));
        } else if (index == 3) {
            this.type = 3;
            Analytics.recordEvent(new CountEventBuilder("DETAIL_SLEEP_V_YEAR").setIdentified(true).setAnonymous(true));
        }
        HMLog.info(this.mTag, new g());
        G(getSupportFragmentManager().beginTransaction(), index).show(this.fragments.get(index)).commit();
    }

    private final void initViews() {
        H();
        ((RadioGroup) findViewById(R.id.sleepTabGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: zz6
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                SleepHomeActivity.K(this.a, radioGroup, i);
            }
        });
    }

    private final void s() {
        SleepHomeViewModel sleepHomeViewModelF = F();
        sleepHomeViewModelF.getTitleName().observe(this, new Observer() { // from class: c07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeActivity.t(this.a, (String) obj);
            }
        });
        sleepHomeViewModelF.isShowMoreIcon().observe(this, new Observer() { // from class: a07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeActivity.u(this.a, (Boolean) obj);
            }
        });
        sleepHomeViewModelF.getMoreActionShowDetail().observe(this, new Observer() { // from class: d07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeActivity.v(this.a, (ArrayList) obj);
            }
        });
        E().isSummaryAnalysisFinish().observe(this, new Observer() { // from class: b07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeActivity.w(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SleepHomeActivity sleepHomeActivity, String str) {
        sleepHomeActivity.setSubTitleText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SleepHomeActivity sleepHomeActivity, Boolean bool) {
        ViewExKt.setVisible(sleepHomeActivity.getRightImage(), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SleepHomeActivity sleepHomeActivity, ArrayList arrayList) {
        sleepHomeActivity.C().setData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final SleepHomeActivity sleepHomeActivity, Boolean bool) {
        if (bool.booleanValue()) {
            sleepHomeActivity.runOnUiThread(new Runnable() { // from class: f07
                @Override // java.lang.Runnable
                public final void run() {
                    SleepHomeActivity.x(this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SleepHomeActivity sleepHomeActivity) {
        sleepHomeActivity.O();
    }

    private final void y() {
        ((FrameLayout) findViewById(R.id.sleepAdContainer)).addView(D().getRecyclerView());
        D().getDataSource().observe(this, new Observer() { // from class: e07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeActivity.z(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SleepHomeActivity sleepHomeActivity, List list) {
        ViewExKt.setVisible((FrameLayout) sleepHomeActivity.findViewById(R.id.sleepAdContainer), !list.isEmpty());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        KoinExtKt.sleepPostEvent().postEventDetailBack(1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String str = L;
        HMLog.debug(str, new c(requestCode, resultCode, data));
        if (resultCode == -1) {
            String dateString = TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(F().getDaySleepCurrentIndex(), TimeMode.DAY));
            HMLog.debug(str, new d(dateString));
            KoinExtKt.getSleepDataManager().startAnalysis(this.mUserId, dateString);
            F().updateSummaryByDay(this.mUserId, SportDay.fromString(dateString));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_home);
        ViewExKt.setUnifyTitleStyle(this, getString(R.string.sort_sleep), "", Integer.valueOf(R.drawable.ic_more_20));
        F().initDetailPage();
        Intent intent = getIntent();
        if (intent != null) {
            this.mKey = intent.getStringExtra("key");
            String stringExtra = intent.getStringExtra("user_id");
            if (stringExtra == null) {
                stringExtra = KoinExtKt.getAccountInfo().getUserId();
            }
            this.mUserId = stringExtra;
            J();
            M();
            if (TextUtils.equals(intent.getStringExtra("from"), FROM_NOTIFICATION)) {
                Analytics.event(this, "Sleep_NotificationClickNum");
            }
        }
        this.useSaveInstanceState = false;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        F().deinitDetailPage();
    }

    public final void onEdit() {
        SleepEditedActivity.INSTANCE.lunch(this, F().getDaySleepCurrentIndex(), F().getMCurrentShowSleepInfo(), this.mUserId, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        HMLog.info(L, e.a);
        if (intent == null) {
            return;
        }
        this.mKey = intent.getStringExtra("key");
        String stringExtra = intent.getStringExtra("user_id");
        if (stringExtra == null) {
            stringExtra = KoinExtKt.getAccountInfo().getUserId();
        }
        this.mUserId = stringExtra;
        getIntent().putExtra(SLEEP_KEY_1, intent.getSerializableExtra(SLEEP_KEY_1));
        M();
        if (TextUtils.equals(intent.getStringExtra("from"), FROM_NOTIFICATION)) {
            Analytics.event(this, "Sleep_NotificationClickNum");
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SleepHomeViewModel sleepHomeViewModelF = F();
        sleepHomeViewModelF.getInitSyncStatus();
        sleepHomeViewModelF.getEditStatus();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@Nullable View view) {
        super.onRightOnClicked(view);
        C().show(getSupportFragmentManager());
    }

    public final void onSelectDataFrom() {
        SleepSelectMainSourceActivity.INSTANCE.lunch(this, this.mUserId, TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(F().getDaySleepCurrentIndex(), TimeMode.DAY)));
    }

    public final void onShare(@Nullable ShareSleepVo shareSleepVo) {
        if (this.type != 0) {
            KoinExtKt.getPageNavigate().navigateToShare(this, this.type, shareSleepVo);
            return;
        }
        KoinExtKt.getPageNavigate().navigateToShare(this, E().getMCurrentShowSleepInfo());
        Analytics.event(this, "Sleep_ViewNum", "Detail");
    }
}
