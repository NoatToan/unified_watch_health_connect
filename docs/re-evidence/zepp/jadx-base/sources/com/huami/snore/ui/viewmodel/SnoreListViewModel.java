package com.huami.snore.ui.viewmodel;

import android.content.Context;
import androidx.annotation.StringRes;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import androidx.paging.PagedList;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.snore.core.R;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.repo.IVoiceRecorderRepo;
import com.huami.snore.core.util.DateParseUtilKt;
import com.huami.snore.core.util.NetUtil;
import com.huami.snore.core.util.PlayWavVoice;
import com.huami.snore.core.vo.VoiceListingModel;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.snore.ui.adapter.WrapVoiceInfo;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.snore.ui.viewmodel.SnoreListViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b\\\u0010]J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J;\u0010\u0012\u001a\u00020\u00042'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010!\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0006\u0010\"\u001a\u00020\u0004R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010/0.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R3\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001b 4*\n\u0012\u0004\u0012\u00020\u001b\u0018\u000103030.8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00107R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0006@\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00107R\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060<8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010@R#\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020*8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bF\u0010GR/\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b0\n0<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010@R#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010@R%\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160N0.8\u0006@\u0006¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bP\u00107R#\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bR\u0010@R)\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160N0<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bT\u0010@R#\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001b0<8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010@R%\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160N0.8\u0006@\u0006¢\u0006\f\n\u0004\bY\u00101\u001a\u0004\bZ\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "info", "", DTransferConstants.SEARCH_KEY, "", "i", "Ljava/util/Date;", "dayTime", "Lkotlin/Pair;", hl.k, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, GoogleApiAvailabilityLight.b, "(Lkotlin/jvm/functions/Function2;)V", "", "id", "", "m", "date", "setDate", "type", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "clickUpDel", "playAction", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "removeVoice", "syncSnoreData", "deleteAllData", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", "a", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Ljava/lang/String;", "mTag", "Landroidx/lifecycle/MediatorLiveData;", "c", "Landroidx/lifecycle/MediatorLiveData;", "mDate", "Landroidx/lifecycle/LiveData;", "Lcom/huami/snore/core/vo/VoiceListingModel;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "result", "Landroidx/paging/PagedList;", "kotlin.jvm.PlatformType", "e", "getPageList", "()Landroidx/lifecycle/LiveData;", "pageList", "f", "getMCount", "mCount", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getEditStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "editStateLiveData", "h", "Lkotlin/Lazy;", "getRefreshPosition", "refreshPosition", "getClickPlayItem", "()Landroidx/lifecycle/MediatorLiveData;", "clickPlayItem", z.j, "getMDialogShowInfo", "mDialogShowInfo", "getDownLoadFileInfo", "downLoadFileInfo", "Lcom/huami/android/vo/Resource;", "l", "getDownFileResult", "downFileResult", "getMToast", "mToast", "getMLoading", "mLoading", "o", "getUploadSnoreInfo", "uploadSnoreInfo", com.google.android.exoplayer2.text.ttml.b.r, "getUploadResult", "uploadResult", "<init>", "(Lcom/huami/snore/core/repo/IVoiceRecorderRepo;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreListViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IVoiceRecorderRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SnoreListViewModel";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Date> mDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<VoiceListingModel<VoiceShowInfo>> result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<VoiceShowInfo>> pageList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> mCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> editStateLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy refreshPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy clickPlayItem;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogShowInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy downLoadFileInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<String>> downFileResult;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy mToast;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoading;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy uploadSnoreInfo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<String>> uploadResult;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MediatorLiveData<WrapVoiceInfo>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<WrapVoiceInfo> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<WrapVoiceInfo>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WrapVoiceInfo> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<Pair<? extends String, ? extends VoiceShowInfo>>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Pair<String, VoiceShowInfo>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/android/vo/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<Resource<? extends String>>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<String>> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* JADX INFO: renamed from: com.huami.snore.ui.viewmodel.SnoreListViewModel$deleteAllData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreListViewModel$deleteAllData$1", f = "SnoreListViewModel.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        /* JADX INFO: renamed from: com.huami.snore.ui.viewmodel.SnoreListViewModel$deleteAllData$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                iArr[Status.LOADING.ordinal()] = 1;
                iArr[Status.SUCCESS.ordinal()] = 2;
                iArr[Status.ERROR.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SnoreListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date date = (Date) SnoreListViewModel.this.mDate.getValue();
                if (date != null) {
                    final SnoreListViewModel snoreListViewModel = SnoreListViewModel.this;
                    Pair pairK = snoreListViewModel.k(date);
                    Flow<Resource<Boolean>> flowDeleteWithinTimeData = snoreListViewModel.repo.deleteWithinTimeData(KoinExtKt.getAppContext(), (Date) pairK.getFirst(), (Date) pairK.getSecond());
                    FlowCollector<Resource<? extends Boolean>> flowCollector = new FlowCollector<Resource<? extends Boolean>>() { // from class: com.huami.snore.ui.viewmodel.SnoreListViewModel$deleteAllData$1$invokeSuspend$lambda-1$$inlined$collect$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(Resource<? extends Boolean> resource, @NotNull Continuation continuation) {
                            Resource<String> resourceLoading;
                            int i2 = SnoreListViewModel.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
                            if (i2 == 1) {
                                resourceLoading = Resource.INSTANCE.loading(snoreListViewModel.m(R.string.snore_loading_del_all));
                            } else if (i2 == 2) {
                                resourceLoading = Resource.INSTANCE.success(snoreListViewModel.m(R.string.snore_loading_del_all_success));
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                resourceLoading = Resource.Companion.error$default(Resource.INSTANCE, null, snoreListViewModel.m(R.string.snore_del_failed), 1, null);
                            }
                            snoreListViewModel.getMLoading().postValue(resourceLoading);
                            return Unit.INSTANCE;
                        }
                    };
                    this.a = date;
                    this.b = 1;
                    if (flowDeleteWithinTimeData.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<String>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceShowInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(VoiceShowInfo voiceShowInfo) {
            super(0);
            this.a = voiceShowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "removeVoice " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreListViewModel$removeVoice$2", f = "SnoreListViewModel.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceShowInfo c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreListViewModel$removeVoice$2$1", f = "SnoreListViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BOULDERING}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SnoreListViewModel b;
            public final /* synthetic */ VoiceShowInfo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SnoreListViewModel snoreListViewModel, VoiceShowInfo voiceShowInfo, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = snoreListViewModel;
                this.c = voiceShowInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                    IVoiceRecorderRepo iVoiceRecorderRepo = this.b.repo;
                    VoiceShowInfo voiceShowInfo = this.c;
                    this.a = 1;
                    if (iVoiceRecorderRepo.deleteSnoreInfo(voiceShowInfo, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(VoiceShowInfo voiceShowInfo, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = voiceShowInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SnoreListViewModel.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SnoreListViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreListViewModel$syncSnoreData$1$1", f = "SnoreListViewModel.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Pair<Date, Date> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.ui.viewmodel.SnoreListViewModel$syncSnoreData$1$1$1", f = "SnoreListViewModel.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SnoreListViewModel b;
            public final /* synthetic */ Pair<Date, Date> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(SnoreListViewModel snoreListViewModel, Pair<? extends Date, ? extends Date> pair, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = snoreListViewModel;
                this.c = pair;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                    IVoiceRecorderRepo iVoiceRecorderRepo = this.b.repo;
                    long j = 1000;
                    long time = this.c.getFirst().getTime() / j;
                    long time2 = this.c.getSecond().getTime() / j;
                    this.a = 1;
                    if (iVoiceRecorderRepo.syncSnoreData(time, time2, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Pair<? extends Date, ? extends Date> pair, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = pair;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SnoreListViewModel.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SnoreListViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<MutableLiveData<VoiceShowInfo>> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<VoiceShowInfo> invoke() {
            return new MutableLiveData<>();
        }
    }

    public SnoreListViewModel(@NotNull IVoiceRecorderRepo iVoiceRecorderRepo) {
        this.repo = iVoiceRecorderRepo;
        MediatorLiveData<Date> mediatorLiveData = new MediatorLiveData<>();
        this.mDate = mediatorLiveData;
        LiveData<VoiceListingModel<VoiceShowInfo>> map = Transformations.map(mediatorLiveData, new Function() { // from class: k57
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SnoreListViewModel.r(this.a, (Date) obj);
            }
        });
        this.result = map;
        this.pageList = Transformations.switchMap(map, new Function() { // from class: m57
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SnoreListViewModel.p((VoiceListingModel) obj);
            }
        });
        this.mCount = Transformations.switchMap(mediatorLiveData, new Function() { // from class: l57
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SnoreListViewModel.o(this.a, (Date) obj);
            }
        });
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        this.editStateLiveData = mutableLiveData;
        this.refreshPosition = LazyKt__LazyJVMKt.lazy(f.a);
        this.clickPlayItem = LazyKt__LazyJVMKt.lazy(a.a);
        this.mDialogShowInfo = LazyKt__LazyJVMKt.lazy(c.a);
        getClickPlayItem().addSource(mutableLiveData, new Observer() { // from class: n57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreListViewModel.h(this.a, (Boolean) obj);
            }
        });
        this.downLoadFileInfo = LazyKt__LazyJVMKt.lazy(b.a);
        this.downFileResult = Transformations.switchMap(getDownLoadFileInfo(), new Function() { // from class: j57
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SnoreListViewModel.j(this.a, (WrapVoiceInfo) obj);
            }
        });
        this.mToast = LazyKt__LazyJVMKt.lazy(e.a);
        this.mLoading = LazyKt__LazyJVMKt.lazy(d.a);
        this.uploadSnoreInfo = LazyKt__LazyJVMKt.lazy(j.a);
        this.uploadResult = Transformations.switchMap(getUploadSnoreInfo(), new Function() { // from class: i57
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SnoreListViewModel.s(this.a, (VoiceShowInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SnoreListViewModel snoreListViewModel, Boolean bool) {
        if (bool.booleanValue()) {
            snoreListViewModel.getClickPlayItem().setValue(null);
        }
    }

    private final boolean i(WrapVoiceInfo info) {
        VoiceShowInfo voiceInfo = info.getVoiceInfo();
        return (voiceInfo == null || !voiceInfo.getUploaded() || new File(voiceInfo.getFilePath()).exists()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData j(SnoreListViewModel snoreListViewModel, WrapVoiceInfo wrapVoiceInfo) {
        return snoreListViewModel.repo.downLoadFile(wrapVoiceInfo.getVoiceInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Date, Date> k(Date dayTime) {
        if (dayTime == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayTime);
        if (DateParseUtilKt.isToday(dayTime)) {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
        } else {
            calendar.set(11, 18);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        Date time = calendar.getTime();
        calendar.add(5, -1);
        calendar.set(11, 18);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new Pair<>(calendar.getTime(), time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m(@StringRes int id) {
        return KoinExtKt.getAppContext().getString(id);
    }

    private final void n(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, block, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData o(SnoreListViewModel snoreListViewModel, Date date) {
        Pair<Date, Date> pairK = snoreListViewModel.k(date);
        return snoreListViewModel.repo.getRecorderCount(pairK == null ? null : pairK.getFirst(), pairK != null ? pairK.getSecond() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData p(VoiceListingModel voiceListingModel) {
        if (voiceListingModel == null) {
            return null;
        }
        return voiceListingModel.getPagedList();
    }

    private final void q(WrapVoiceInfo info) {
        PlayWavVoice.INSTANCE.playVoice(KoinExtKt.getAppContext(), info, new PlayWavVoice.VoicePlayListener() { // from class: com.huami.snore.ui.viewmodel.SnoreListViewModel$playVoice$1
            @Override // com.huami.snore.core.util.PlayWavVoice.VoicePlayListener
            public void onCompletion(@Nullable WrapVoiceInfo info2) {
                VoiceShowInfo voiceInfo = info2 == null ? null : info2.getVoiceInfo();
                if (voiceInfo != null) {
                    voiceInfo.setPlaying(false);
                }
                this.a.getRefreshPosition().setValue(info2 != null ? Integer.valueOf(info2.getPosition()) : null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceListingModel r(SnoreListViewModel snoreListViewModel, Date date) {
        Pair<Date, Date> pairK = snoreListViewModel.k(date);
        return snoreListViewModel.repo.loadRecorderData(pairK == null ? null : pairK.getFirst(), pairK != null ? pairK.getSecond() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData s(SnoreListViewModel snoreListViewModel, VoiceShowInfo voiceShowInfo) {
        return snoreListViewModel.repo.uploadSnoreInfo(KoinExtKt.getAppContext(), voiceShowInfo);
    }

    public final void clickUpDel(@NotNull String type, @NotNull VoiceShowInfo info) {
        if (!Intrinsics.areEqual(type, SnoreListFragment.TYPE_UPLOAD)) {
            if (Intrinsics.areEqual(type, "delete")) {
                getMDialogShowInfo().setValue(new Pair<>(type, info));
                return;
            }
            return;
        }
        GlobalScope globalScope = GlobalScope.INSTANCE;
        if (info.getUploaded()) {
            return;
        }
        String filePath = info.getFilePath();
        if (filePath != null && StringsKt__StringsKt.contains$default((CharSequence) filePath, (CharSequence) ".wav", false, 2, (Object) null)) {
            getMDialogShowInfo().setValue(new Pair<>(type, info));
        } else {
            getMToast().setValue(KoinExtKt.getAppContext().getResources().getString(R.string.snore_forbid_upload));
        }
    }

    public final void deleteAllData() {
        n(new AnonymousClass1(null));
    }

    @NotNull
    public final MediatorLiveData<WrapVoiceInfo> getClickPlayItem() {
        return (MediatorLiveData) this.clickPlayItem.getValue();
    }

    @NotNull
    public final LiveData<Resource<String>> getDownFileResult() {
        return this.downFileResult;
    }

    @NotNull
    public final MutableLiveData<WrapVoiceInfo> getDownLoadFileInfo() {
        return (MutableLiveData) this.downLoadFileInfo.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditStateLiveData() {
        return this.editStateLiveData;
    }

    @NotNull
    public final LiveData<Integer> getMCount() {
        return this.mCount;
    }

    @NotNull
    public final MutableLiveData<Pair<String, VoiceShowInfo>> getMDialogShowInfo() {
        return (MutableLiveData) this.mDialogShowInfo.getValue();
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getMLoading() {
        return (MutableLiveData) this.mLoading.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getMToast() {
        return (MutableLiveData) this.mToast.getValue();
    }

    @NotNull
    public final LiveData<PagedList<VoiceShowInfo>> getPageList() {
        return this.pageList;
    }

    @NotNull
    public final MutableLiveData<Integer> getRefreshPosition() {
        return (MutableLiveData) this.refreshPosition.getValue();
    }

    @NotNull
    public final LiveData<Resource<String>> getUploadResult() {
        return this.uploadResult;
    }

    @NotNull
    public final MutableLiveData<VoiceShowInfo> getUploadSnoreInfo() {
        return (MutableLiveData) this.uploadSnoreInfo.getValue();
    }

    public final void playAction(@NotNull WrapVoiceInfo info) {
        PlayWavVoice.INSTANCE.stopPlay();
        VoiceShowInfo voiceInfo = info.getVoiceInfo();
        boolean z = false;
        if (voiceInfo != null && voiceInfo.isPlaying()) {
            getClickPlayItem().setValue(null);
            return;
        }
        if (i(info)) {
            getDownLoadFileInfo().setValue(info);
            getClickPlayItem().setValue(null);
            return;
        }
        VoiceShowInfo voiceInfo2 = info.getVoiceInfo();
        if (voiceInfo2 != null && voiceInfo2.isPlaying()) {
            z = true;
        }
        if (!z) {
            q(info);
        }
        getClickPlayItem().setValue(info);
    }

    public final void removeVoice(@NotNull Context context, @Nullable VoiceShowInfo info) {
        HMLog.debug(this.mTag, new g(info));
        boolean z = false;
        if (info != null && info.getUploaded()) {
            z = true;
        }
        if (!z || NetUtil.INSTANCE.isNetworkConnect(context)) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new h(info, null), 3, null);
        } else {
            getMLoading().setValue(Resource.Companion.error$default(Resource.INSTANCE, null, context.getResources().getString(R.string.snore_net_fail), 1, null));
        }
    }

    public final void setDate(@Nullable Date date) {
        this.mDate.setValue(date);
    }

    public final void syncSnoreData(@Nullable Date date) {
        Pair<Date, Date> pairK = k(date);
        if (pairK == null) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new i(pairK, null), 3, null);
    }
}
