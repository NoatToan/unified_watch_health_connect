package com.xiaomi.hm.health.atrialfibrillation;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.data.local.RRDataKeeper;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.RRDataAnalyseService;
import com.huami.health.afppg.service.RRPackageDataAnalysis;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.loc.z;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.AtrialFibrillationDataItem;
import com.xiaomi.hm.health.databases.model.AtrialFibrillationDataItemDao;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0013\u0010\u0004\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002\u001a\u0013\u0010\t\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005\u001a\b\u0010\f\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002\u001a\u0016\u0010\u0017\u001a\u00020\r*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0002\"\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u001b\"\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b\"\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b\"\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f\"\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001b\"7\u0010)\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020$0\u0013¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/AtrialFibrillationDataItem;", "item", "", "saveWatchAtrial", "transAtrialData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", z.j, "Lcom/huami/health/afppg/data/local/bean/AFibData;", "f", "i", hl.k, "Ljava/io/File;", "a", "", "fileName", "Lkotlin/Pair;", "", "", "c", "", "b", "Ljava/util/TimeZone;", "timeZone", "g", "timestamp", "timezone", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "YYYY_MM_DD_HH_MM_SS", "RR_PEAK_FILE_DIR", "RR_PEAK_FILE_SEP", LogUtil.I, "NEED_SYNC", "e", "TAG", "Lkotlin/Function1;", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "Lkotlin/ParameterName;", "name", "pkgs", "Lkotlin/jvm/functions/Function1;", "logRRIndex", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class TransAtrialDataUtilKt {

    @NotNull
    private static final String a = "yyyy-MM-dd'T'HH:mm:ss";

    @NotNull
    private static final String b = "rrpeak";

    @NotNull
    private static final String c = "_";
    private static final int d = 0;

    @NotNull
    private static final String e = "TransAtrialDataUtil";

    @NotNull
    private static final Function1<List<RRPackageDataAnalysis.RRSingleData>, Unit> f = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "pkgs", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<List<? extends RRPackageDataAnalysis.RRSingleData>, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.atrialfibrillation.TransAtrialDataUtilKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0777a extends Lambda implements Function0<String> {
            public final /* synthetic */ RRPackageDataAnalysis.RRSingleData a;
            public final /* synthetic */ Ref.IntRef b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0777a(RRPackageDataAnalysis.RRSingleData rRSingleData, Ref.IntRef intRef) {
                super(0);
                this.a = rRSingleData;
                this.b = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "rr index not consecutive: " + this.a.getIndex() + ", " + this.b.element;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ List<RRPackageDataAnalysis.RRSingleData> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<RRPackageDataAnalysis.RRSingleData> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "rr index first: time: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.first((List) this.a)).getTimestamp() + " index:" + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.first((List) this.a)).getIndex() + " ,last: time: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.last((List) this.a)).getTimestamp() + " index: " + ((RRPackageDataAnalysis.RRSingleData) CollectionsKt.last((List) this.a)).getIndex();
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RRPackageDataAnalysis.RRSingleData> list) {
            invoke2((List<RRPackageDataAnalysis.RRSingleData>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<RRPackageDataAnalysis.RRSingleData> list) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = RRDataKeeper.INSTANCE.getRRIndex();
            for (RRPackageDataAnalysis.RRSingleData rRSingleData : list) {
                int index = rRSingleData.getIndex();
                int i = intRef.element;
                if (index - i != 1 && i != -1) {
                    HMLog.info(TransAtrialDataUtilKt.e, new C0777a(rRSingleData, intRef));
                }
                intRef.element = rRSingleData.getIndex();
            }
            HMLog.info(TransAtrialDataUtilKt.e, new b(list));
            RRDataKeeper.INSTANCE.saveRRIndex(intRef.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.atrialfibrillation.TransAtrialDataUtilKt$saveWatchAtrial$1", f = "TransAtrialDataUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PPGRepository b;
        public final /* synthetic */ AtrialFibrillationDataItem c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PPGRepository pPGRepository, AtrialFibrillationDataItem atrialFibrillationDataItem, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = pPGRepository;
            this.c = atrialFibrillationDataItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.insertNewAFibData(e.listOf(TransAtrialDataUtilKt.f(this.c)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.atrialfibrillation.TransAtrialDataUtilKt", f = "TransAtrialDataUtil.kt", i = {}, l = {43, 44, 45}, m = "transAtrialData", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return TransAtrialDataUtilKt.transAtrialData(this);
        }
    }

    private static final File a() {
        File file = new File(BraceletApp.getContext().getFilesDir(), "rrpeak");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static final List<File> b() {
        File[] fileArrListFiles = new File(FileUtils.getAtrialRawDataDir(BraceletApp.getContext())).listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                return ArraysKt___ArraysKt.toList(fileArrListFiles);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private static final Pair<Integer, Long> c(String str) {
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
            return new Pair<>(Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Long.valueOf(Long.parseLong((String) listSplit$default.get(1))));
        } catch (Exception unused) {
            return null;
        }
    }

    private static final String d(long j, TimeZone timeZone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(j)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String e(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return d(j, timeZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AFibData f(AtrialFibrillationDataItem atrialFibrillationDataItem) {
        long jLongValue = atrialFibrillationDataItem.timestamp.longValue() / ((long) 1000);
        return new AFibData(Constants.VIA_REPORT_TYPE_START_GROUP, jLongValue, atrialFibrillationDataItem.deviceSource, atrialFibrillationDataItem.active.intValue(), jLongValue, atrialFibrillationDataItem.sync.intValue(), atrialFibrillationDataItem.userId, atrialFibrillationDataItem.deviceSn, atrialFibrillationDataItem.deviceId, HMAppConfig.getPackageName(), atrialFibrillationDataItem.deviceVersion, TimeZone.getDefault().getID(), h(jLongValue, null, 1, null));
    }

    private static final String g(long j, TimeZone timeZone) {
        return d(j * ((long) 1000), timeZone);
    }

    public static /* synthetic */ String h(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return g(j, timeZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Continuation<? super Unit> continuation) {
        AtrialFibrillationDataItem atrialFibrillationDataItem;
        AtrialFibrillationDataItemDao atrialFibrillationDataItemDao = HMDaoManager.getInstance().getDaoSession().getAtrialFibrillationDataItemDao();
        List<File> listB = b();
        PPGRepository pPGRepository = (PPGRepository) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null);
        for (File file : listB) {
            Pair<Integer, Long> pairC = c(file.getName());
            if (pairC != null) {
                long j = 1000;
                List<AtrialFibrillationDataItem> list = atrialFibrillationDataItemDao.queryBuilder().where(AtrialFibrillationDataItemDao.Properties.Timestamp.eq(Boxing.boxLong((pairC.getSecond().longValue() / j) * j)), new WhereCondition[0]).list();
                if (list != null && (atrialFibrillationDataItem = (AtrialFibrillationDataItem) CollectionsKt.firstOrNull((List) list)) != null) {
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    DeviceConfig deviceConfig = new DeviceConfig(atrialFibrillationDataItem.deviceVersion, atrialFibrillationDataItem.deviceSn, atrialFibrillationDataItem.deviceId, atrialFibrillationDataItem.userId, HMAppConfig.getPackageName(), atrialFibrillationDataItem.deviceSource);
                    map.put(Boxing.boxLong(pairC.getSecond().longValue() / j), atrialFibrillationDataItem.active);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(pairC.getSecond().longValue());
                    arrayList.add(new AFPPGDataFragment(calendar, ArraysKt___ArraysKt.toList(kotlin.io.c.readBytes(file)), pairC.getFirst().intValue()));
                    List<RRPeak> listCreate = RRDataAnalyseService.INSTANCE.create(CompanionApplication.get(), deviceConfig, arrayList, map, f);
                    if (listCreate != null) {
                        Boxing.boxBoolean(pPGRepository.insertNewRRData(listCreate));
                    }
                }
            }
            file.delete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(Continuation<? super Unit> continuation) {
        AtrialFibrillationDataItemDao atrialFibrillationDataItemDao = HMDaoManager.getInstance().getDaoSession().getAtrialFibrillationDataItemDao();
        List<AtrialFibrillationDataItem> list = atrialFibrillationDataItemDao.queryBuilder().where(AtrialFibrillationDataItemDao.Properties.Sync.eq(Boxing.boxInt(0)), new WhereCondition[0]).orderAsc(AtrialFibrillationDataItemDao.Properties.Timestamp).list();
        Unit unit = null;
        PPGRepository pPGRepository = (PPGRepository) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null);
        if (list != null) {
            if (!Boxing.boxBoolean(!list.isEmpty()).booleanValue()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (AtrialFibrillationDataItem atrialFibrillationDataItem : list) {
                    atrialFibrillationDataItem.sync = Boxing.boxInt(1);
                    arrayList.add(atrialFibrillationDataItem);
                }
                atrialFibrillationDataItemDao.updateInTx(arrayList);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(f((AtrialFibrillationDataItem) it2.next()));
                }
                pPGRepository.insertNewAFibData(arrayList2);
                unit = Unit.INSTANCE;
            }
        }
        return unit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Continuation<? super Unit> continuation) {
        int i;
        File[] fileArr;
        String str;
        Unit unit = null;
        PPGRepository pPGRepository = (PPGRepository) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null);
        File[] fileArrListFiles = a().listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            int length = fileArrListFiles.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                File file = fileArrListFiles[i3];
                i3++;
                if (Boxing.boxBoolean(file.isDirectory() && l.toIntOrNull(file.getName()) != null).booleanValue()) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                int i4 = Integer.parseInt(file2.getName());
                File[] fileArrListFiles2 = file2.listFiles();
                if (fileArrListFiles2 != null) {
                    ArrayList<File> arrayList2 = new ArrayList();
                    int length2 = fileArrListFiles2.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        File file3 = fileArrListFiles2[i5];
                        i5++;
                        if (Boxing.boxBoolean(file3.isDirectory()).booleanValue()) {
                            arrayList2.add(file3);
                        }
                    }
                    for (File file4 : arrayList2) {
                        String name = file4.getName();
                        File[] fileArrListFiles3 = file4.listFiles();
                        if (fileArrListFiles3 != null) {
                            ArrayList<File> arrayList3 = new ArrayList();
                            int length3 = fileArrListFiles3.length;
                            int i6 = 0;
                            while (i6 < length3) {
                                File file5 = fileArrListFiles3[i6];
                                i6++;
                                if (Boxing.boxBoolean(file5.isDirectory()).booleanValue()) {
                                    arrayList3.add(file5);
                                }
                            }
                            for (File file6 : arrayList3) {
                                String name2 = file6.getName();
                                File[] fileArrListFiles4 = file6.listFiles();
                                if (fileArrListFiles4 != null) {
                                    ArrayList<File> arrayList4 = new ArrayList();
                                    int length4 = fileArrListFiles4.length;
                                    int i7 = 0;
                                    while (i7 < length4) {
                                        File file7 = fileArrListFiles4[i7];
                                        i7++;
                                        if (Boxing.boxBoolean(file7.isDirectory()).booleanValue()) {
                                            arrayList4.add(file7);
                                        }
                                    }
                                    for (File file8 : arrayList4) {
                                        String name3 = file8.getName();
                                        String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
                                        File[] fileArrListFiles5 = file8.listFiles();
                                        if (fileArrListFiles5 != null) {
                                            int length5 = fileArrListFiles5.length;
                                            int i8 = 0;
                                            while (i8 < length5) {
                                                File file9 = fileArrListFiles5[i8];
                                                int i9 = i8 + 1;
                                                if (Intrinsics.areEqual(userid, (String) StringsKt__StringsKt.split$default((CharSequence) file9.getName(), new String[]{"_"}, false, 0, 6, (Object) null).get(i2))) {
                                                    long j = Long.parseLong((String) StringsKt__StringsKt.split$default((CharSequence) file9.getName(), new String[]{"_"}, false, 0, 6, (Object) null).get(1));
                                                    ArrayList arrayList5 = new ArrayList();
                                                    HashMap map = new HashMap();
                                                    i = length5;
                                                    fileArr = fileArrListFiles5;
                                                    str = userid;
                                                    DeviceConfig deviceConfig = new DeviceConfig(name3, name2, name, userid, HMAppConfig.getPackageName(), i4);
                                                    map.put(Boxing.boxLong(j / ((long) 1000)), Boxing.boxInt(1));
                                                    Calendar calendar = Calendar.getInstance();
                                                    calendar.setTimeInMillis(j);
                                                    arrayList5.add(new AFPPGDataFragment(calendar, ArraysKt___ArraysKt.toList(kotlin.io.c.readBytes(file9)), 8));
                                                    List<RRPeak> listCreate = RRDataAnalyseService.INSTANCE.create(CompanionApplication.get(), deviceConfig, arrayList5, map, f);
                                                    if (listCreate != null) {
                                                        Boxing.boxBoolean(pPGRepository.insertNewRRData(listCreate));
                                                    }
                                                } else {
                                                    i = length5;
                                                    fileArr = fileArrListFiles5;
                                                    str = userid;
                                                }
                                                file9.delete();
                                                i8 = i9;
                                                length5 = i;
                                                fileArrListFiles5 = fileArr;
                                                userid = str;
                                                i2 = 0;
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        i2 = 0;
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                i2 = 0;
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        i2 = 0;
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                i2 = 0;
            }
            unit = Unit.INSTANCE;
        }
        return unit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }

    public static final void saveWatchAtrial(@NotNull AtrialFibrillationDataItem atrialFibrillationDataItem) {
        kotlinx.coroutines.e.f((CoroutineScope) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null), null, null, new b((PPGRepository) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), atrialFibrillationDataItem, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object transAtrialData(@NotNull Continuation<? super Unit> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.b = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                cVar.b = 3;
                if (k(cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        cVar.b = 1;
        if (j(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cVar.b = 2;
        if (i(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cVar.b = 3;
        if (k(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
