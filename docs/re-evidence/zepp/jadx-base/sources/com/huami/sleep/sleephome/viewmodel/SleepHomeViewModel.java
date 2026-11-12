package com.huami.sleep.sleephome.viewmodel;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IAppCacheData;
import com.huami.sleep.sleephome.promotion.SleepPromotionVo;
import com.huami.sleep.sleephome.repo.ISleepHomeRepo;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import com.huami.sleep.sleephome.vo.RightSelectShowInfo;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bB\u000f\u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#R\u0019\u0010+\u001a\u00020&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010B\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR#\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060H8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bN\u0010LR#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bI\u0010LR#\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010J\u001a\u0004\bP\u0010QR/\u0010X\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0S8\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020S8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bY\u0010WR\u001f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020S8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bZ\u0010WR%\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[0S8\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010U\u001a\u0004\b^\u0010W¨\u0006c"}, d2 = {"Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "", "enable", "", GoogleApiAvailabilityLight.b, "", "syncStatus", "sourceName", "m", "editEnable", "Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "info", "Ljava/util/ArrayList;", "Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "Lkotlin/collections/ArrayList;", "i", "name", "changeSourceName", "", "index", "setDayCurrentIndex", "getInitSyncStatus", "getEditStatus", "setRightShowDetail", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "shareSleepVo", "setShareSleepVo", "getShareSleepVo", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "data", "updateCurrentSportData", "initDetailPage", "deinitDetailPage", "userId", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "sportDay", "updateSummaryByDay", "Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;", "a", "Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;", "getRepo", "()Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "c", LogUtil.I, "getDaySleepCurrentIndex", "()I", "setDaySleepCurrentIndex", "(I)V", "daySleepCurrentIndex", GoogleApiAvailabilityLight.a, "getCurrentTab", "setCurrentTab", "currentTab", "e", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getMCurrentShowSleepInfo", "()Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "setMCurrentShowSleepInfo", "(Lcom/xiaomi/hm/health/dataprocess/SleepInfo;)V", "mCurrentShowSleepInfo", "f", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MediatorLiveData;", "h", "Lkotlin/Lazy;", hl.k, "()Landroidx/lifecycle/MediatorLiveData;", "showSourceName", "getTitleName", "titleName", z.j, "()Landroidx/lifecycle/MutableLiveData;", "rightSelectShowInfo", "Landroidx/lifecycle/LiveData;", "l", "Landroidx/lifecycle/LiveData;", "getMoreActionShowDetail", "()Landroidx/lifecycle/LiveData;", "moreActionShowDetail", "isShowMoreIcon", "isSummaryAnalysisFinish", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "o", "getSleepPromotionData", "sleepPromotionData", "<init>", "(Lcom/huami/sleep/sleephome/repo/ISleepHomeRepo;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepHomeViewModel extends ViewModel {

    @NotNull
    private static final String p = "sync_finish";

    @NotNull
    private static final String q = "not_sync";

    @NotNull
    private static final String r = "syncing";

    @NotNull
    private static final String s = "sync_failed";

    @NotNull
    private static final String t = "no_sync";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepHomeRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepHomeViewModel";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int daySleepCurrentIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentTab;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SleepInfo mCurrentShowSleepInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ShareSleepVo shareSleepVo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> syncStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy showSourceName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy editEnable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy rightSelectShowInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ArrayList<ShowActionItemInfo>> moreActionShowDetail;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> isShowMoreIcon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> isSummaryAnalysisFinish;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<SleepPromotionVo>> sleepPromotionData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ SleepHomeViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, SleepHomeViewModel sleepHomeViewModel) {
            super(0);
            this.a = str;
            this.b = sleepHomeViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "同步状态： " + this.a + "   " + this.b.k().getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ SleepHomeViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, SleepHomeViewModel sleepHomeViewModel) {
            super(0);
            this.a = str;
            this.b = sleepHomeViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "数据源名称： " + this.a + "    " + this.b.syncStatus.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MediatorLiveData<Boolean>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<Boolean> invoke() {
            return new MediatorLiveData<>();
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
            return "changeSyncStatus： " + this.a;
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
            return "add  选则数据源";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add  编辑数据";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add  分享";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MutableLiveData<RightSelectShowInfo>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<RightSelectShowInfo> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setDayCurrentIndex： " + SleepHomeViewModel.this.getDaySleepCurrentIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setEditEnable  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ RightSelectShowInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(RightSelectShowInfo rightSelectShowInfo) {
            super(0);
            this.a = rightSelectShowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setRightShowDetail  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MediatorLiveData<String>> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<String> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MediatorLiveData<String>> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<String> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ SleepHomeViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i, SleepHomeViewModel sleepHomeViewModel) {
            super(0);
            this.a = i;
            this.b = sleepHomeViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "index: " + this.a + ", currentInd: " + this.b.getMCurrentShowSleepInfo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel$updateSummaryByDay$1", f = "SleepHomeViewModel.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ SportDay c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, SportDay sportDay, Continuation<? super o> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = sportDay;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IAppCacheData appCacheSlpData = KoinExtKt.getAppCacheSlpData();
                String str = this.b;
                SportDay sportDay = this.c;
                this.a = 1;
                if (appCacheSlpData.updateSummaryByDay(str, sportDay, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SleepHomeViewModel(@NotNull ISleepHomeRepo iSleepHomeRepo) {
        this.repo = iSleepHomeRepo;
        MutableLiveData<String> syncStatus = iSleepHomeRepo.getSyncStatus();
        this.syncStatus = syncStatus;
        this.showSourceName = LazyKt__LazyJVMKt.lazy(l.a);
        this.titleName = LazyKt__LazyJVMKt.lazy(m.a);
        this.editEnable = LazyKt__LazyJVMKt.lazy(c.a);
        getTitleName().addSource(syncStatus, new Observer() { // from class: g07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeViewModel.e(this.a, (String) obj);
            }
        });
        getTitleName().addSource(k(), new Observer() { // from class: i07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeViewModel.f(this.a, (String) obj);
            }
        });
        h().addSource(syncStatus, new Observer() { // from class: h07
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepHomeViewModel.g(this.a, (String) obj);
            }
        });
        this.rightSelectShowInfo = LazyKt__LazyJVMKt.lazy(h.a);
        LiveData<ArrayList<ShowActionItemInfo>> map = Transformations.map(j(), new Function<RightSelectShowInfo, ArrayList<ShowActionItemInfo>>() { // from class: com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel$special$$inlined$map$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final ArrayList<ShowActionItemInfo> apply(RightSelectShowInfo rightSelectShowInfo) {
                RightSelectShowInfo rightSelectShowInfo2 = rightSelectShowInfo;
                SleepHomeViewModel sleepHomeViewModel = this.a;
                Boolean bool = (Boolean) sleepHomeViewModel.h().getValue();
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                return sleepHomeViewModel.i(bool.booleanValue(), rightSelectShowInfo2);
            }
        });
        this.moreActionShowDetail = map;
        this.isShowMoreIcon = Transformations.map(map, new Function<ArrayList<ShowActionItemInfo>, Boolean>() { // from class: com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(ArrayList<ShowActionItemInfo> arrayList) {
                return Boolean.valueOf(!arrayList.isEmpty());
            }
        });
        this.isSummaryAnalysisFinish = iSleepHomeRepo.isSummaryAnalysisFinish();
        this.sleepPromotionData = iSleepHomeRepo.getSleepPromotionData(KoinExtKt.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SleepHomeViewModel sleepHomeViewModel, String str) {
        HMLog.info(sleepHomeViewModel.getMTag(), new a(str, sleepHomeViewModel));
        sleepHomeViewModel.getTitleName().postValue(sleepHomeViewModel.m(str, sleepHomeViewModel.k().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SleepHomeViewModel sleepHomeViewModel, String str) {
        HMLog.info(sleepHomeViewModel.getMTag(), new b(str, sleepHomeViewModel));
        MediatorLiveData<String> titleName = sleepHomeViewModel.getTitleName();
        String value = sleepHomeViewModel.syncStatus.getValue();
        if (value == null) {
            value = "";
        }
        titleName.postValue(sleepHomeViewModel.m(value, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SleepHomeViewModel sleepHomeViewModel, String str) {
        if (!sleepHomeViewModel.getRepo().getSleepLoadingStatus(sleepHomeViewModel.getDaySleepCurrentIndex())) {
            sleepHomeViewModel.h().postValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual(str, "sync_finish")) {
            sleepHomeViewModel.h().postValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual(str, "not_sync")) {
            sleepHomeViewModel.h().postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediatorLiveData<Boolean> h() {
        return (MediatorLiveData) this.editEnable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<ShowActionItemInfo> i(boolean editEnable, RightSelectShowInfo info) {
        ArrayList<ShowActionItemInfo> arrayList = new ArrayList<>();
        if (info.getShowDataSource()) {
            arrayList.add(new ShowActionItemInfo(ShowActionItemInfo.DATA_SOURCE));
            HMLog.info(getMTag(), e.a);
        }
        if (info.getShowEdit() && editEnable) {
            arrayList.add(new ShowActionItemInfo(ShowActionItemInfo.EDIT));
            HMLog.info(getMTag(), f.a);
        }
        if (info.getShowShare()) {
            arrayList.add(new ShowActionItemInfo("share"));
            HMLog.info(getMTag(), g.a);
        }
        return arrayList;
    }

    private final MutableLiveData<RightSelectShowInfo> j() {
        return (MutableLiveData) this.rightSelectShowInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediatorLiveData<String> k() {
        return (MediatorLiveData) this.showSourceName.getValue();
    }

    private final String m(String syncStatus, String sourceName) {
        String string;
        switch (syncStatus.hashCode()) {
            case -1879743903:
                return !syncStatus.equals("sync_failed") ? "" : KoinExtKt.getAppContext().getString(R.string.today_sync_failed);
            case -1872209225:
                if (!syncStatus.equals("sync_finish")) {
                    return "";
                }
                if (TextUtils.isEmpty(sourceName)) {
                    string = KoinExtKt.getAppContext().getString(R.string.connected_time, KoinExtKt.getDeviceManager().getLastSyncTime());
                } else {
                    string = sourceName + " (" + KoinExtKt.getAppContext().getString(R.string.connected_time, KoinExtKt.getDeviceManager().getLastSyncTime()) + ")";
                }
                return string;
            case -1742490777:
                return !syncStatus.equals("syncing") ? "" : KoinExtKt.getAppContext().getString(R.string.device_connecting);
            case 1576531079:
                return !syncStatus.equals("not_sync") ? "" : KoinExtKt.getAppContext().getString(R.string.today_not_sync);
            case 2110273113:
                if (!syncStatus.equals("no_sync")) {
                    return "";
                }
                if (sourceName == null) {
                    sourceName = "";
                }
                return sourceName;
            default:
                return "";
        }
    }

    private final void n(boolean enable) {
        HMLog.info(this.mTag, new j(enable));
        h().setValue(Boolean.valueOf(enable));
        MutableLiveData<RightSelectShowInfo> mutableLiveDataJ = j();
        RightSelectShowInfo value = j().getValue();
        RightSelectShowInfo rightSelectShowInfo = value == null ? null : new RightSelectShowInfo(value.getShowDataSource(), enable, value.getShowShare());
        if (rightSelectShowInfo == null) {
            rightSelectShowInfo = new RightSelectShowInfo(false, false, false);
        }
        mutableLiveDataJ.setValue(rightSelectShowInfo);
    }

    public final void changeSourceName(@Nullable String name) {
        k().setValue(name);
    }

    public final void deinitDetailPage() {
        this.repo.deinitDetailPage();
    }

    public final int getCurrentTab() {
        return this.currentTab;
    }

    public final int getDaySleepCurrentIndex() {
        return this.daySleepCurrentIndex;
    }

    public final void getEditStatus() {
        n(this.repo.getInitEditStatus());
    }

    public final void getInitSyncStatus() {
        String initSyncStatus = this.repo.getInitSyncStatus();
        HMLog.info(this.mTag, new d(initSyncStatus));
        this.syncStatus.setValue(initSyncStatus);
    }

    @Nullable
    public final SleepInfo getMCurrentShowSleepInfo() {
        return this.mCurrentShowSleepInfo;
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @NotNull
    public final LiveData<ArrayList<ShowActionItemInfo>> getMoreActionShowDetail() {
        return this.moreActionShowDetail;
    }

    @NotNull
    public final ISleepHomeRepo getRepo() {
        return this.repo;
    }

    @Nullable
    public final ShareSleepVo getShareSleepVo() {
        return this.shareSleepVo;
    }

    @NotNull
    public final LiveData<List<SleepPromotionVo>> getSleepPromotionData() {
        return this.sleepPromotionData;
    }

    @NotNull
    public final MediatorLiveData<String> getTitleName() {
        return (MediatorLiveData) this.titleName.getValue();
    }

    public final void initDetailPage() {
        this.repo.initDetailPage();
    }

    @NotNull
    public final LiveData<Boolean> isShowMoreIcon() {
        return this.isShowMoreIcon;
    }

    @NotNull
    public final LiveData<Boolean> isSummaryAnalysisFinish() {
        return this.isSummaryAnalysisFinish;
    }

    public final void setCurrentTab(int i2) {
        this.currentTab = i2;
    }

    public final void setDayCurrentIndex(int index) {
        HMLog.info(this.mTag, new i());
        this.daySleepCurrentIndex = index;
    }

    public final void setDaySleepCurrentIndex(int i2) {
        this.daySleepCurrentIndex = i2;
    }

    public final void setMCurrentShowSleepInfo(@Nullable SleepInfo sleepInfo) {
        this.mCurrentShowSleepInfo = sleepInfo;
    }

    public final void setRightShowDetail(@Nullable RightSelectShowInfo info) {
        HMLog.info(this.mTag, new k(info));
        if (info == null) {
            return;
        }
        j().setValue(info);
    }

    public final void setShareSleepVo(@Nullable ShareSleepVo shareSleepVo) {
        this.shareSleepVo = shareSleepVo;
        setRightShowDetail(new RightSelectShowInfo(false, false, shareSleepVo != null));
    }

    public final void updateCurrentSportData(int index, @Nullable SleepInfo data) {
        HMLog.debug(this.mTag, new n(index, this));
        if (index == this.daySleepCurrentIndex) {
            this.mCurrentShowSleepInfo = data;
        }
    }

    public final void updateSummaryByDay(@NotNull String userId, @NotNull SportDay sportDay) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o(userId, sportDay, null), 2, null);
    }
}
