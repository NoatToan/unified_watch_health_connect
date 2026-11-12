package com.huami.moving.sport.ui.viewmodel;

import android.graphics.Bitmap;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.config.DataGroup;
import com.huami.moving.datacenter.SportDataItem;
import com.huami.moving.datacenter.SportDataRender;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.sport.ui.common.SportDataDisplayItem;
import com.huami.moving.sport.ui.common.SportDataDisplayItemConverter;
import com.huami.moving.sport.ui.usecase.GetChildSportRecordDataUseCase;
import com.huami.moving.sport.ui.usecase.GetDeviceIconUserCase;
import com.huami.moving.sport.ui.usecase.GetDeviceNameUserCase;
import com.huami.moving.sport.ui.usecase.GetHrZoneShowRuleUseCase;
import com.huami.moving.sport.ui.usecase.GetSportDetailParsedDataUseCase;
import com.huami.moving.sport.ui.usecase.GetSportRecordDataUseCase;
import com.huami.moving.sport.ui.usecase.SportDeviceSourceConverter;
import com.huami.moving.sport.ui.view.card.DeviceSourceAdapter;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.utils.ext.TrackrecordKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 k2\u00020\u00012\u00020\u0002:\u0001kB?\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u00109\u001a\u000207\u0012\u0006\u0010<\u001a\u00020:¢\u0006\u0004\bi\u0010jJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082\bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u0005H\u0002J(\u0010\u001d\u001a\u00020\u00072 \u0010\u001c\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00070\u001a\u0012\u0004\u0012\u00020\u00070\u001aJ\u0016\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0013J\u001e\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013J\u001e\u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0005R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010>R\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050@8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030@8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR1\u0010K\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u00100@8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020L0@8\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR+\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00100@8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010DR\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020S0@8\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010B\u001a\u0004\bU\u0010DR%\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00120@8\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010B\u001a\u0004\bX\u0010DR1\u0010^\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020[\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00120Z0@8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010DR%\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00120@8\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010B\u001a\u0004\ba\u0010DR-\u0010e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00100@8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010B\u001a\u0004\bd\u0010DR\u001f\u0010h\u001a\b\u0012\u0004\u0012\u00020=0@8\u0006@\u0006¢\u0006\f\n\u0004\bf\u0010B\u001a\u0004\bg\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006l"}, d2 = {"Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "parsedSportDetailData", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "", "a", "(Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;Lcom/xiaomi/hm/health/databases/model/Trackrecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "alti", "", "h", "await", "await1", "Lkotlin/Pair;", "g", "", "", "deviceIds", "c", "subRecords", "f", "e", "b", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "loader", "loadMapBackground", "", "trackId", "source", "loadSportRecordLiveData", "sportType", "loadSportParsedDetailLiveData", "loadSportParsedDetailAndSportRecordLiveData", "parent", "loadChildSportRecordLiveData", "Lcom/huami/moving/sport/ui/usecase/GetSportRecordDataUseCase;", "Lcom/huami/moving/sport/ui/usecase/GetSportRecordDataUseCase;", "getSportRecordDataUseCase", "Lcom/huami/moving/sport/ui/usecase/GetSportDetailParsedDataUseCase;", "Lcom/huami/moving/sport/ui/usecase/GetSportDetailParsedDataUseCase;", "getSportDetailParsedDataUseCase", "Lcom/huami/moving/sport/ui/usecase/GetChildSportRecordDataUseCase;", "Lcom/huami/moving/sport/ui/usecase/GetChildSportRecordDataUseCase;", "getChildSportRecordDataUseCase", "Lcom/huami/moving/sport/ui/usecase/GetDeviceIconUserCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/moving/sport/ui/usecase/GetDeviceIconUserCase;", "deviceIconUserCase", "Lcom/huami/moving/sport/ui/usecase/GetDeviceNameUserCase;", "Lcom/huami/moving/sport/ui/usecase/GetDeviceNameUserCase;", "deviceNameUserCase", "Lcom/huami/moving/sport/ui/usecase/SportDeviceSourceConverter;", "Lcom/huami/moving/sport/ui/usecase/SportDeviceSourceConverter;", "sourceConverter", "Lcom/huami/moving/sport/ui/usecase/GetHrZoneShowRuleUseCase;", "Lcom/huami/moving/sport/ui/usecase/GetHrZoneShowRuleUseCase;", "hrZoneShowRuleUseCase", "", "Ljava/lang/String;", "tag", "Landroidx/lifecycle/MutableLiveData;", "i", "Landroidx/lifecycle/MutableLiveData;", "getSportRecordLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sportRecordLiveData", z.j, "getSportParsedDetailLiveData", "sportParsedDetailLiveData", hl.k, "getChildSportRecordLiveData", "childSportRecordLiveData", "Lcom/huami/moving/sport/ui/common/HrZoneShowRuleConfig;", "l", "getHrZoneRuleConfigLiveData", "hrZoneRuleConfigLiveData", "m", "getSportParsedAndSportRecordDetailLiveData", "sportParsedAndSportRecordDetailLiveData", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", GoogleApiAvailabilityLight.b, "getSportMainData", "sportMainData", "o", "getSportCardData", "sportCardData", "", "Lcom/huami/moving/config/DataGroup;", com.google.android.exoplayer2.text.ttml.b.r, "getSportDetailData", "sportDetailData", "Lcom/huami/moving/sport/ui/view/card/DeviceSourceAdapter$DeviceItem;", DTransferConstants.SEARCH_KEY, "getDeviceSourceLiveData", "deviceSourceLiveData", "r", "getMapBackgroundLiveData", "mapBackgroundLiveData", SOAP.XMLNS, "getDataInvalidLiveData", "dataInvalidLiveData", "<init>", "(Lcom/huami/moving/sport/ui/usecase/GetSportRecordDataUseCase;Lcom/huami/moving/sport/ui/usecase/GetSportDetailParsedDataUseCase;Lcom/huami/moving/sport/ui/usecase/GetChildSportRecordDataUseCase;Lcom/huami/moving/sport/ui/usecase/GetDeviceIconUserCase;Lcom/huami/moving/sport/ui/usecase/GetDeviceNameUserCase;Lcom/huami/moving/sport/ui/usecase/SportDeviceSourceConverter;Lcom/huami/moving/sport/ui/usecase/GetHrZoneShowRuleUseCase;)V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailPageViewModel extends ViewModel implements KoinComponent {
    private static final int t = -20000;
    private static final float u = 100.0f;
    private static final int v = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetSportRecordDataUseCase getSportRecordDataUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetSportDetailParsedDataUseCase getSportDetailParsedDataUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GetChildSportRecordDataUseCase getChildSportRecordDataUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final GetDeviceIconUserCase deviceIconUserCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final GetDeviceNameUserCase deviceNameUserCase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SportDeviceSourceConverter sourceConverter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final GetHrZoneShowRuleUseCase hrZoneShowRuleUseCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String tag = "SportDetailPageViewModel";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Trackrecord> sportRecordLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ParsedSportDetailData> sportParsedDetailLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Trackrecord, List<Trackrecord>>> childSportRecordLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HrZoneShowRuleConfig> hrZoneRuleConfigLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<ParsedSportDetailData, Trackrecord>> sportParsedAndSportRecordDetailLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SportDataDisplayItem> sportMainData = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<SportDataDisplayItem>> sportCardData = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Map<DataGroup, List<SportDataDisplayItem>>> sportDetailData = new MutableLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<DeviceSourceAdapter.DeviceItem>> deviceSourceLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Bitmap>> mapBackgroundLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dataInvalidLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Update unit to: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadChildSportRecordLiveData$1", f = "SportDetailPageViewModel.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Trackrecord c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Trackrecord trackrecord, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = trackrecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetChildSportRecordDataUseCase getChildSportRecordDataUseCase = SportDetailPageViewModel.this.getChildSportRecordDataUseCase;
                Trackrecord trackrecord = this.c;
                this.a = 1;
                obj = getChildSportRecordDataUseCase.load(trackrecord, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            SportDetailPageViewModel.this.getChildSportRecordLiveData().postValue(new Pair<>(this.c, list));
            SportDetailPageViewModel.this.f(this.c, list);
            HMLog.i(SportDetailPageViewModel.this.tag, "loadChildSportRecordLiveData", new Object[0]);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadDeviceData$1", f = "SportDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<Integer> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Integer> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map<Integer, String> mapExecute = SportDetailPageViewModel.this.deviceIconUserCase.execute(this.c);
            List<Integer> list = this.c;
            SportDetailPageViewModel sportDetailPageViewModel = SportDetailPageViewModel.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                String bySource = sportDetailPageViewModel.deviceNameUserCase.getBySource(iIntValue);
                DeviceSourceAdapter.DeviceItem deviceItem = null;
                if (bySource != null) {
                    deviceItem = mapExecute.containsKey(Boxing.boxInt(iIntValue)) ? new DeviceSourceAdapter.DeviceItem(bySource, mapExecute.get(Boxing.boxInt(iIntValue))) : new DeviceSourceAdapter.DeviceItem(bySource, null);
                }
                if (deviceItem != null) {
                    arrayList.add(deviceItem);
                }
            }
            if (!arrayList.isEmpty()) {
                SportDetailPageViewModel.this.getDeviceSourceLiveData().postValue(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadHrZoneRuleConfigData$1", f = "SportDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HrZoneShowRuleConfig hrZoneShowRuleConfig = SportDetailPageViewModel.this.hrZoneShowRuleUseCase.getHrZoneShowRuleConfig();
            if (hrZoneShowRuleConfig == null) {
                hrZoneShowRuleConfig = new HrZoneShowRuleConfig(5, 5, false);
            }
            SportDetailPageViewModel.this.getHrZoneRuleConfigLiveData().postValue(hrZoneShowRuleConfig);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadItemData$1", f = "SportDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Trackrecord c;
        public final /* synthetic */ List<Trackrecord> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ParametersHolder> {
            public final /* synthetic */ Trackrecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Trackrecord trackrecord) {
                super(0);
                this.a = trackrecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ParametersHolder invoke() {
                return ParametersHolderKt.parametersOf(this.a.getType(), this.a.getUnit());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<ParametersHolder> {
            public final /* synthetic */ Trackrecord a;
            public final /* synthetic */ List<Trackrecord> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Trackrecord trackrecord, List<? extends Trackrecord> list) {
                super(0);
                this.a = trackrecord;
                this.b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ParametersHolder invoke() {
                return ParametersHolderKt.parametersOf(this.a, this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Trackrecord trackrecord, List<? extends Trackrecord> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = trackrecord;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportDetailPageViewModel.this.new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SportDataRender sportDataRender = (SportDataRender) SportDetailPageViewModel.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportDataRender.class), null, new b(this.c, this.d));
            SportDataDisplayItemConverter sportDataDisplayItemConverter = (SportDataDisplayItemConverter) SportDetailPageViewModel.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SportDataDisplayItemConverter.class), null, new a(this.c));
            List<SportDataDisplayItem> listConvert = sportDataDisplayItemConverter.convert(sportDataRender.getCardDataList());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listConvert) {
                if (!Boxing.boxBoolean(Intrinsics.areEqual(((SportDataDisplayItem) obj2).getValue(), "--")).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                SportDetailPageViewModel.this.getSportMainData().postValue(arrayList.get(0));
                SportDetailPageViewModel.this.getSportCardData().postValue(arrayList.subList(1, arrayList.size() <= 7 ? arrayList.size() : 7));
            }
            Map<DataGroup, List<SportDataItem>> dataList = sportDataRender.getDataList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(dataList.size()));
            Iterator<T> it2 = dataList.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                List<SportDataDisplayItem> listConvert2 = sportDataDisplayItemConverter.convert((List) entry.getValue());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listConvert2) {
                    if (!Boxing.boxBoolean(Intrinsics.areEqual(((SportDataDisplayItem) obj3).getValue(), "--")).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                }
                linkedHashMap.put(key, arrayList2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Boxing.boxBoolean(((List) entry2.getValue()).isEmpty()).booleanValue()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            SportDetailPageViewModel.this.getSportDetailData().postValue(linkedHashMap2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadMapBackground$1", f = "SportDetailPageViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Function1<? super Bitmap, Unit>, Unit> b;
        public final /* synthetic */ SportDetailPageViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/graphics/Bitmap;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Bitmap, Unit> {
            public final /* synthetic */ SportDetailPageViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportDetailPageViewModel sportDetailPageViewModel) {
                super(1);
                this.a = sportDetailPageViewModel;
            }

            public final void a(@Nullable Bitmap bitmap) {
                this.a.getMapBackgroundLiveData().postValue(new Pair<>(Boolean.valueOf(bitmap != null), bitmap));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                a(bitmap);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super Function1<? super Bitmap, Unit>, Unit> function1, SportDetailPageViewModel sportDetailPageViewModel, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = sportDetailPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.invoke(new a(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailAndSportRecordLiveData$1", f = "SportDetailPageViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ SportDetailPageViewModel c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailAndSportRecordLiveData$1$1", f = "SportDetailPageViewModel.kt", i = {0, 1}, l = {129, 130, 136, 138}, m = "invokeSuspend", n = {"sportRecordDataDeferred", "sportDetailParsedData"}, s = {"L$0", "L$0"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            private /* synthetic */ Object c;
            public final /* synthetic */ long d;
            public final /* synthetic */ SportDetailPageViewModel e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;

            /* JADX INFO: renamed from: com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$g$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailAndSportRecordLiveData$1$1$sportDetailParsedDataDeferred$1", f = "SportDetailPageViewModel.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0497a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ParsedSportDetailData>, Object> {
                public int a;
                public final /* synthetic */ SportDetailPageViewModel b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0497a(SportDetailPageViewModel sportDetailPageViewModel, long j, int i, int i2, Continuation<? super C0497a> continuation) {
                    super(2, continuation);
                    this.b = sportDetailPageViewModel;
                    this.c = j;
                    this.d = i;
                    this.e = i2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0497a(this.b, this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ParsedSportDetailData> continuation) {
                    return ((C0497a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        GetSportDetailParsedDataUseCase getSportDetailParsedDataUseCase = this.b.getSportDetailParsedDataUseCase;
                        long j = this.c;
                        int i2 = this.d;
                        int i3 = this.e;
                        this.a = 1;
                        obj = getSportDetailParsedDataUseCase.load(j, i2, i3, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailAndSportRecordLiveData$1$1$sportRecordDataDeferred$1", f = "SportDetailPageViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Trackrecord>, Object> {
                public int a;
                public final /* synthetic */ SportDetailPageViewModel b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SportDetailPageViewModel sportDetailPageViewModel, long j, int i, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = sportDetailPageViewModel;
                    this.c = j;
                    this.d = i;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Trackrecord> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        GetSportRecordDataUseCase getSportRecordDataUseCase = this.b.getSportRecordDataUseCase;
                        long j = this.c;
                        int i2 = this.d;
                        this.a = 1;
                        obj = getSportRecordDataUseCase.load(j, i2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, SportDetailPageViewModel sportDetailPageViewModel, int i, int i2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.d = j;
                this.e = sportDetailPageViewModel;
                this.f = i;
                this.g = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.d, this.e, this.f, this.g, continuation);
                aVar.c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:24:0x00b1 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:33:0x00de  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:39:0x010d  */
            /* JADX WARN: Instruction removed from duplicated block: B:39:0x010d, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Deferred deferredB;
                Object objAwait;
                ParsedSportDetailData parsedSportDetailData;
                Object objAwait2;
                Trackrecord trackrecord;
                SportDetailPageViewModel sportDetailPageViewModel;
                ParsedSportDetailData parsedSportDetailData2;
                GetSportRecordDataUseCase getSportRecordDataUseCase;
                Trackrecord trackrecord2;
                ParsedSportDetailData parsedSportDetailData3;
                List listB;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        deferredB = (Deferred) this.c;
                        ResultKt.throwOnFailure(obj);
                        objAwait = obj;
                    } else if (i == 2) {
                        ParsedSportDetailData parsedSportDetailData4 = (ParsedSportDetailData) this.c;
                        ResultKt.throwOnFailure(obj);
                        parsedSportDetailData = parsedSportDetailData4;
                        objAwait2 = obj;
                        trackrecord = (Trackrecord) objAwait2;
                        if (trackrecord != null) {
                            throw new IllegalArgumentException("no sport record data with trackId: " + this.d);
                        }
                        sportDetailPageViewModel = this.e;
                        this.c = parsedSportDetailData;
                        this.a = trackrecord;
                        this.b = 3;
                        if (sportDetailPageViewModel.a(parsedSportDetailData, trackrecord, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        parsedSportDetailData2 = parsedSportDetailData;
                        getSportRecordDataUseCase = this.e.getSportRecordDataUseCase;
                        this.c = parsedSportDetailData2;
                        this.a = trackrecord;
                        this.b = 4;
                        if (getSportRecordDataUseCase.updateRecord(trackrecord, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        trackrecord2 = trackrecord;
                        parsedSportDetailData3 = parsedSportDetailData2;
                    } else if (i == 3) {
                        trackrecord = (Trackrecord) this.a;
                        parsedSportDetailData2 = (ParsedSportDetailData) this.c;
                        ResultKt.throwOnFailure(obj);
                        getSportRecordDataUseCase = this.e.getSportRecordDataUseCase;
                        this.c = parsedSportDetailData2;
                        this.a = trackrecord;
                        this.b = 4;
                        if (getSportRecordDataUseCase.updateRecord(trackrecord, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        trackrecord2 = trackrecord;
                        parsedSportDetailData3 = parsedSportDetailData2;
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        trackrecord2 = (Trackrecord) this.a;
                        parsedSportDetailData3 = (ParsedSportDetailData) this.c;
                        ResultKt.throwOnFailure(obj);
                    }
                    listB = this.e.b(trackrecord2);
                    if (!Boxing.boxBoolean(!listB.isEmpty()).booleanValue()) {
                        listB = null;
                    }
                    if (listB != null) {
                        SportDetailPageViewModel sportDetailPageViewModel2 = this.e;
                        sportDetailPageViewModel2.c(CollectionsKt___CollectionsKt.toList(listB));
                        sportDetailPageViewModel2.e();
                    }
                    this.e.getSportParsedAndSportRecordDetailLiveData().postValue(new Pair<>(parsedSportDetailData3, trackrecord2));
                    HMLog.i(this.e.tag, "loadSportParsedDetailAndSportRecordLiveData", new Object[0]);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                Deferred deferredB2 = kotlinx.coroutines.e.b(coroutineScope, null, null, new C0497a(this.e, this.d, this.f, this.g, null), 3, null);
                deferredB = kotlinx.coroutines.e.b(coroutineScope, null, null, new b(this.e, this.d, this.f, null), 3, null);
                this.c = deferredB;
                this.b = 1;
                objAwait = deferredB2.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                parsedSportDetailData = (ParsedSportDetailData) objAwait;
                this.c = parsedSportDetailData;
                this.b = 2;
                objAwait2 = deferredB.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                trackrecord = (Trackrecord) objAwait2;
                if (trackrecord != null) {
                    throw new IllegalArgumentException("no sport record data with trackId: " + this.d);
                }
                sportDetailPageViewModel = this.e;
                this.c = parsedSportDetailData;
                this.a = trackrecord;
                this.b = 3;
                if (sportDetailPageViewModel.a(parsedSportDetailData, trackrecord, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                parsedSportDetailData2 = parsedSportDetailData;
                getSportRecordDataUseCase = this.e.getSportRecordDataUseCase;
                this.c = parsedSportDetailData2;
                this.a = trackrecord;
                this.b = 4;
                if (getSportRecordDataUseCase.updateRecord(trackrecord, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                trackrecord2 = trackrecord;
                parsedSportDetailData3 = parsedSportDetailData2;
                listB = this.e.b(trackrecord2);
                if (!Boxing.boxBoolean(!listB.isEmpty()).booleanValue()) {
                    listB = null;
                }
                if (listB != null) {
                    SportDetailPageViewModel sportDetailPageViewModel3 = this.e;
                    sportDetailPageViewModel3.c(CollectionsKt___CollectionsKt.toList(listB));
                    sportDetailPageViewModel3.e();
                }
                this.e.getSportParsedAndSportRecordDetailLiveData().postValue(new Pair<>(parsedSportDetailData3, trackrecord2));
                HMLog.i(this.e.tag, "loadSportParsedDetailAndSportRecordLiveData", new Object[0]);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, SportDetailPageViewModel sportDetailPageViewModel, int i, int i2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = j;
            this.c = sportDetailPageViewModel;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.b, this.c, this.d, this.e, null);
                this.a = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailLiveData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailLiveData$1", f = "SportDetailPageViewModel.kt", i = {0}, l = {106, 315}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = i;
            this.f = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SportDetailPageViewModel.this.new AnonymousClass1(this.d, this.e, this.f, continuation);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            final CoroutineScope coroutineScope;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
            GetSportDetailParsedDataUseCase getSportDetailParsedDataUseCase = SportDetailPageViewModel.this.getSportDetailParsedDataUseCase;
            long j = this.d;
            int i2 = this.e;
            int i3 = this.f;
            this.b = coroutineScope;
            this.a = 1;
            obj = getSportDetailParsedDataUseCase.execute(j, i2, i3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            final SportDetailPageViewModel sportDetailPageViewModel = SportDetailPageViewModel.this;
            FlowCollector<ParsedSportDetailData> flowCollector = new FlowCollector<ParsedSportDetailData>() { // from class: com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportParsedDetailLiveData$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(ParsedSportDetailData parsedSportDetailData, @NotNull Continuation<? super Unit> continuation) {
                    sportDetailPageViewModel.getSportParsedDetailLiveData().postValue(parsedSportDetailData);
                    return Unit.INSTANCE;
                }
            };
            this.b = null;
            this.a = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportRecordLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportRecordLiveData$1", f = "SportDetailPageViewModel.kt", i = {0}, l = {91, 315}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class C15321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15321(long j, int i, Continuation<? super C15321> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C15321 c15321 = SportDetailPageViewModel.this.new C15321(this.d, this.e, continuation);
            c15321.b = obj;
            return c15321;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            final CoroutineScope coroutineScope;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
            GetSportRecordDataUseCase getSportRecordDataUseCase = SportDetailPageViewModel.this.getSportRecordDataUseCase;
            long j = this.d;
            int i2 = this.e;
            this.b = coroutineScope;
            this.a = 1;
            obj = getSportRecordDataUseCase.execute(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            final SportDetailPageViewModel sportDetailPageViewModel = SportDetailPageViewModel.this;
            FlowCollector<Trackrecord> flowCollector = new FlowCollector<Trackrecord>() { // from class: com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel$loadSportRecordLiveData$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Trackrecord trackrecord, @NotNull Continuation<? super Unit> continuation) {
                    sportDetailPageViewModel.getSportRecordLiveData().postValue(trackrecord);
                    return Unit.INSTANCE;
                }
            };
            this.b = null;
            this.a = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public SportDetailPageViewModel(@NotNull GetSportRecordDataUseCase getSportRecordDataUseCase, @NotNull GetSportDetailParsedDataUseCase getSportDetailParsedDataUseCase, @NotNull GetChildSportRecordDataUseCase getChildSportRecordDataUseCase, @NotNull GetDeviceIconUserCase getDeviceIconUserCase, @NotNull GetDeviceNameUserCase getDeviceNameUserCase, @NotNull SportDeviceSourceConverter sportDeviceSourceConverter, @NotNull GetHrZoneShowRuleUseCase getHrZoneShowRuleUseCase) {
        this.getSportRecordDataUseCase = getSportRecordDataUseCase;
        this.getSportDetailParsedDataUseCase = getSportDetailParsedDataUseCase;
        this.getChildSportRecordDataUseCase = getChildSportRecordDataUseCase;
        this.deviceIconUserCase = getDeviceIconUserCase;
        this.deviceNameUserCase = getDeviceNameUserCase;
        this.sourceConverter = sportDeviceSourceConverter;
        this.hrZoneShowRuleUseCase = getHrZoneShowRuleUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    public final Object a(ParsedSportDetailData parsedSportDetailData, Trackrecord trackrecord, Continuation<? super Unit> continuation) {
        boolean z;
        boolean z2;
        int iRoundToInt;
        boolean z3;
        int i;
        int revisedUnit = TrackrecordKt.getRevisedUnit(trackrecord);
        Integer unit = trackrecord.getUnit();
        if (unit == null || revisedUnit != unit.intValue()) {
            trackrecord.setUnit(Boxing.boxInt(revisedUnit));
            HMLog.info(this.tag, new a(revisedUnit));
        }
        Integer maxHR = trackrecord.getMaxHR();
        if (maxHR == null || maxHR.intValue() <= 0) {
            float maxValue = parsedSportDetailData.getHeartPeak().getMaxValue();
            trackrecord.setMaxHR(maxValue > 0.0f ? Boxing.boxInt((int) maxValue) : Boxing.boxInt(-1));
        }
        boolean z4 = false;
        if (trackrecord.getMaxSFreq() <= 0) {
            float maxValue2 = parsedSportDetailData.getStepFreqPeak().getMaxValue();
            float maxValue3 = parsedSportDetailData.getStrokePeak().getMaxValue();
            if (maxValue2 > 0.0f) {
                i = (int) maxValue2;
            } else {
                i = maxValue3 > 0.0f ? (int) maxValue3 : 0;
            }
            trackrecord.setMaxSFreq(i);
        }
        int minAltitude = trackrecord.getMinAltitude();
        int maxAltitude = trackrecord.getMaxAltitude();
        Float avgAltitude = trackrecord.getAvgAltitude();
        if (maxAltitude == minAltitude) {
            float f2 = maxAltitude;
            if (f2 == 0.0f) {
                z2 = false;
            } else {
                if (f2 == -1.0f) {
                    z2 = false;
                } else {
                    if (f2 == -20000.0f) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                float maxValue4 = parsedSportDetailData.getAltiPeak().getMaxValue();
                float minValue = parsedSportDetailData.getAltiPeak().getMinValue();
                if (parsedSportDetailData.getAlignedTimeDeltaAltitudeList().size() > 0) {
                    maxValue4 = parsedSportDetailData.getTimeDeltaAltiPeak().getMaxValue();
                    minValue = parsedSportDetailData.getTimeDeltaAltiPeak().getMinValue();
                }
                if (maxValue4 == minValue) {
                    if (maxValue4 == 0.0f) {
                        z3 = false;
                    } else {
                        if (maxValue4 == -1.0f) {
                            z3 = false;
                        } else {
                            if (maxValue4 == -20000.0f) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        if (maxValue4 > Constants.PEAK_MINEST_VALUE) {
                            iRoundToInt = kotlin.math.c.roundToInt(maxValue4 / 100.0f);
                        } else {
                            iRoundToInt = -20000;
                        }
                        trackrecord.setMaxAltitude(iRoundToInt);
                        trackrecord.setMinAltitude(minValue <= maxValue4 ? kotlin.math.c.roundToInt(minValue / 100.0f) : -20000);
                    } else {
                        trackrecord.setMaxAltitude(-20000);
                        trackrecord.setMinAltitude(-20000);
                    }
                } else {
                    if (maxValue4 > Constants.PEAK_MINEST_VALUE) {
                        iRoundToInt = kotlin.math.c.roundToInt(maxValue4 / 100.0f);
                    } else {
                        iRoundToInt = -20000;
                    }
                    trackrecord.setMaxAltitude(iRoundToInt);
                    trackrecord.setMinAltitude(minValue <= maxValue4 ? kotlin.math.c.roundToInt(minValue / 100.0f) : -20000);
                }
            }
        }
        float fFloatValue = avgAltitude.floatValue();
        if (fFloatValue == 0.0f) {
            z = false;
        } else {
            if (fFloatValue == -1.0f) {
                z = false;
            } else {
                if (fFloatValue == -20000.0f) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        if (!z) {
            float averageAltitude = parsedSportDetailData.getAverageAltitude() / 100.0f;
            if (!(averageAltitude == 0.0f)) {
                if (!(averageAltitude == -1.0f)) {
                    if (!(averageAltitude == -20000.0f)) {
                        z4 = true;
                    }
                }
            }
            trackrecord.setAvgAltitude(z4 ? Boxing.boxFloat(averageAltitude) : Boxing.boxFloat(-20000.0f));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> b(Trackrecord trackrecord) {
        List<Integer> listListOf;
        Integer source = trackrecord.getSource();
        if (source != null && source.intValue() == 0) {
            int[] iArrAnalysisSportDeviceStr = SportDeviceUtils.analysisSportDeviceStr(trackrecord.getDevice());
            listListOf = iArrAnalysisSportDeviceStr == null ? null : ArraysKt___ArraysKt.toList(iArrAnalysisSportDeviceStr);
        } else {
            listListOf = kotlin.collections.e.listOf(this.sourceConverter.toDeviceSource(trackrecord.getSource().intValue()));
        }
        return listListOf == null ? CollectionsKt__CollectionsKt.emptyList() : listListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List<Integer> deviceIds) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(deviceIds, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Trackrecord record, List<? extends Trackrecord> subRecords) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(record, subRecords, null), 2, null);
    }

    private final Pair<ParsedSportDetailData, Trackrecord> g(ParsedSportDetailData await, Trackrecord await1) {
        return new Pair<>(await, await1);
    }

    private final boolean h(float alti) {
        if (!(alti == 0.0f)) {
            if (!(alti == -1.0f)) {
                if (!(alti == -20000.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final MutableLiveData<Pair<Trackrecord, List<Trackrecord>>> getChildSportRecordLiveData() {
        return this.childSportRecordLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getDataInvalidLiveData() {
        return this.dataInvalidLiveData;
    }

    @NotNull
    public final MutableLiveData<List<DeviceSourceAdapter.DeviceItem>> getDeviceSourceLiveData() {
        return this.deviceSourceLiveData;
    }

    @NotNull
    public final MutableLiveData<HrZoneShowRuleConfig> getHrZoneRuleConfigLiveData() {
        return this.hrZoneRuleConfigLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Bitmap>> getMapBackgroundLiveData() {
        return this.mapBackgroundLiveData;
    }

    @NotNull
    public final MutableLiveData<List<SportDataDisplayItem>> getSportCardData() {
        return this.sportCardData;
    }

    @NotNull
    public final MutableLiveData<Map<DataGroup, List<SportDataDisplayItem>>> getSportDetailData() {
        return this.sportDetailData;
    }

    @NotNull
    public final MutableLiveData<SportDataDisplayItem> getSportMainData() {
        return this.sportMainData;
    }

    @NotNull
    public final MutableLiveData<Pair<ParsedSportDetailData, Trackrecord>> getSportParsedAndSportRecordDetailLiveData() {
        return this.sportParsedAndSportRecordDetailLiveData;
    }

    @NotNull
    public final MutableLiveData<ParsedSportDetailData> getSportParsedDetailLiveData() {
        return this.sportParsedDetailLiveData;
    }

    @NotNull
    public final MutableLiveData<Trackrecord> getSportRecordLiveData() {
        return this.sportRecordLiveData;
    }

    public final void loadChildSportRecordLiveData(@NotNull Trackrecord parent) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(parent, null), 2, null);
    }

    public final void loadMapBackground(@NotNull Function1<? super Function1<? super Bitmap, Unit>, Unit> loader) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(loader, this, null), 2, null);
    }

    public final void loadSportParsedDetailAndSportRecordLiveData(long trackId, int source, int sportType) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), new SportDetailPageViewModel$loadSportParsedDetailAndSportRecordLiveData$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this).plus(Dispatchers.getIO()), null, new g(trackId, this, source, sportType, null), 2, null);
    }

    public final void loadSportParsedDetailLiveData(long trackId, int source, int sportType) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(trackId, source, sportType, null), 2, null);
    }

    public final void loadSportRecordLiveData(long trackId, int source) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C15321(trackId, source, null), 2, null);
    }
}
