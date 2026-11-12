package com.xiaomi.fitness.sport_manager.source.towear;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider;
import defpackage.er9;
import defpackage.s7r;
import defpackage.ur9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "sportSummary", "", DailyRecordKey.sportType, "Ler9;", "buildBestSportData", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary;I)Ler9;", "", "setBestSportData", "()V", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportConfigProvider {

    @NotNull
    private static final String KEY = "BEAT_DATA_KEY";

    @NotNull
    private static final String TAG = "SportConfigProvider";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SportConfigProvider> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ncn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportConfigProvider.mInstance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider$Companion;", "", "<init>", "()V", "TAG", "", "KEY", "mInstance", "Lcom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider;", "getMInstance", "()Lcom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SportConfigProvider getMInstance() {
            return (SportConfigProvider) SportConfigProvider.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final SportConfigProvider get() {
            return getMInstance();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider$setBestSportData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider$setBestSportData$1", f = "SportConfigProvider.kt", i = {}, l = {40, 46, 52, 58}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportConfigProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportConfigProvider.kt\ncom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider$setBestSportData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,123:1\n1567#2:124\n1598#2,4:125\n37#3:129\n36#3,3:130\n*S KotlinDebug\n*F\n+ 1 SportConfigProvider.kt\ncom/xiaomi/fitness/sport_manager/source/towear/SportConfigProvider$setBestSportData$1\n*L\n66#1:124\n66#1:125,4\n72#1:129\n72#1:130,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<er9> $list;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SportConfigProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<er9> list, SportConfigProvider sportConfigProvider, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = sportConfigProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$list, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00c9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:33:0x0102  */
        /* JADX WARN: Code duplicated, block: B:37:0x016f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0175  */
        /* JADX WARN: Code duplicated, block: B:44:0x0105 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<er9> list;
            SportConfigProvider sportConfigProvider;
            SportConfigProvider sportConfigProvider2;
            List<er9> list2;
            List<er9> list3;
            SportConfigProvider sportConfigProvider3;
            List<er9> list4;
            SportConfigProvider sportConfigProvider4;
            Object totalSummary;
            SportConfigProvider sportConfigProvider5;
            ArrayList arrayList;
            int i;
            WearableDeviceModel wearableDeviceModel;
            String did;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    sportConfigProvider = (SportConfigProvider) this.L$1;
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    sportConfigProvider2 = (SportConfigProvider) this.L$1;
                    list2 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list2.add(sportConfigProvider2.buildBestSportData((SportSummary) obj, 1));
                    list3 = this.$list;
                    sportConfigProvider3 = this.this$0;
                    SportSummaryApi sportSummaryApi = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list3;
                    this.L$1 = sportConfigProvider3;
                    this.label = 3;
                    obj = sportSummaryApi.getTotalSummary("outdoor_riding", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3.add(sportConfigProvider3.buildBestSportData((SportSummary) obj, 6));
                    list4 = this.$list;
                    sportConfigProvider4 = this.this$0;
                    SportSummaryApi sportSummaryApi2 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list4;
                    this.L$1 = sportConfigProvider4;
                    this.label = 4;
                    totalSummary = sportSummaryApi2.getTotalSummary("walking", this);
                    if (totalSummary == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportConfigProvider5 = sportConfigProvider4;
                    obj = totalSummary;
                } else if (i2 == 3) {
                    sportConfigProvider3 = (SportConfigProvider) this.L$1;
                    list3 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list3.add(sportConfigProvider3.buildBestSportData((SportSummary) obj, 6));
                    list4 = this.$list;
                    sportConfigProvider4 = this.this$0;
                    SportSummaryApi sportSummaryApi3 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list4;
                    this.L$1 = sportConfigProvider4;
                    this.label = 4;
                    totalSummary = sportSummaryApi3.getTotalSummary("walking", this);
                    if (totalSummary == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportConfigProvider5 = sportConfigProvider4;
                    obj = totalSummary;
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportConfigProvider5 = (SportConfigProvider) this.L$1;
                    list4 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list4.add(sportConfigProvider5.buildBestSportData((SportSummary) obj, 2));
                ur9 ur9Var = new ur9();
                er9.a aVar = new er9.a();
                List<er9> list5 = this.$list;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                i = 0;
                for (Object obj2 : list5) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    er9 er9Var = (er9) obj2;
                    FitnessLogUtils.i(SportConfigProvider.TAG, "distance : " + er9Var.e + " , duration:" + er9Var.d + " , sportType: " + er9Var.c);
                    arrayList.add(Unit.INSTANCE);
                    i = i3;
                }
                aVar.c = (er9[]) this.$list.toArray(new er9[0]);
                ur9Var.K0(aVar);
                s7r s7rVar = new s7r();
                s7rVar.e = 8;
                s7rVar.f = 52;
                s7rVar.S(ur9Var);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel != null) {
                    did = wearableDeviceModel.getDid();
                } else {
                    did = null;
                }
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider.setBestSportData.1.2
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        FitnessLogUtils.i(SportConfigProvider.TAG, "onError , did : " + did2 + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        FitnessLogUtils.i(SportConfigProvider.TAG, "onSuccess , did : " + did2 + " , type : " + type);
                    }
                }, 0, 16, (Object) null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            list = this.$list;
            sportConfigProvider = this.this$0;
            SportSummaryApi sportSummaryApi4 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list;
            this.L$1 = sportConfigProvider;
            this.label = 1;
            obj = sportSummaryApi4.getTotalSummary("running", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list.add(sportConfigProvider.buildBestSportData((SportSummary) obj, 3));
            List<er9> list6 = this.$list;
            sportConfigProvider2 = this.this$0;
            SportSummaryApi sportSummaryApi5 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list6;
            this.L$1 = sportConfigProvider2;
            this.label = 2;
            Object totalSummary2 = sportSummaryApi5.getTotalSummary("running", this);
            if (totalSummary2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list6;
            obj = totalSummary2;
            list2.add(sportConfigProvider2.buildBestSportData((SportSummary) obj, 1));
            list3 = this.$list;
            sportConfigProvider3 = this.this$0;
            SportSummaryApi sportSummaryApi6 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list3;
            this.L$1 = sportConfigProvider3;
            this.label = 3;
            obj = sportSummaryApi6.getTotalSummary("outdoor_riding", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list3.add(sportConfigProvider3.buildBestSportData((SportSummary) obj, 6));
            list4 = this.$list;
            sportConfigProvider4 = this.this$0;
            SportSummaryApi sportSummaryApi7 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list4;
            this.L$1 = sportConfigProvider4;
            this.label = 4;
            totalSummary = sportSummaryApi7.getTotalSummary("walking", this);
            if (totalSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportConfigProvider5 = sportConfigProvider4;
            obj = totalSummary;
            list4.add(sportConfigProvider5.buildBestSportData((SportSummary) obj, 2));
            ur9 ur9Var2 = new ur9();
            er9.a aVar2 = new er9.a();
            List<er9> list7 = this.$list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
            i = 0;
            while (r1.hasNext()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                er9 er9Var2 = (er9) obj2;
                FitnessLogUtils.i(SportConfigProvider.TAG, "distance : " + er9Var2.e + " , duration:" + er9Var2.d + " , sportType: " + er9Var2.c);
                arrayList.add(Unit.INSTANCE);
                i = i4;
            }
            aVar2.c = (er9[]) this.$list.toArray(new er9[0]);
            ur9Var2.K0(aVar2);
            s7r s7rVar2 = new s7r();
            s7rVar2.e = 8;
            s7rVar2.f = 52;
            s7rVar2.S(ur9Var2);
            DeviceContact deviceSyncExtKt2 = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                did = wearableDeviceModel.getDid();
            } else {
                did = null;
            }
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt2, did, s7rVar2, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport_manager.source.towear.SportConfigProvider.setBestSportData.1.2
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did2, int type, int code) {
                    FitnessLogUtils.i(SportConfigProvider.TAG, "onError , did : " + did2 + " , type : " + type + " , code : " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did2, int type, SyncResult result) {
                    FitnessLogUtils.i(SportConfigProvider.TAG, "onSuccess , did : " + did2 + " , type : " + type);
                }
            }, 0, 16, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final er9 buildBestSportData(SportSummary sportSummary, int sportType) {
        SportSummary.SummaryData summaryData;
        SportSummary.MaxData maxData;
        SportSummary.MaxValue maxValue;
        SportSummary.SummaryData summaryData2;
        SportSummary.MaxData maxData2;
        SportSummary.MaxValue maxValue2;
        er9 er9Var = new er9();
        int i = 0;
        er9Var.e = (sportSummary == null || (summaryData2 = sportSummary.info) == null || (maxData2 = summaryData2.max_distance) == null || (maxValue2 = maxData2.value) == null) ? 0 : (int) maxValue2.intValue;
        if (sportSummary != null && (summaryData = sportSummary.info) != null && (maxData = summaryData.max_duration) != null && (maxValue = maxData.value) != null) {
            i = (int) maxValue.intValue;
        }
        er9Var.d = i;
        er9Var.c = sportType;
        return er9Var;
    }

    @JvmStatic
    @NotNull
    public static final SportConfigProvider get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportConfigProvider mInstance_delegate$lambda$0() {
        return new SportConfigProvider();
    }

    public final void setBestSportData() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.BEST_SPORT_DATA)) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(new ArrayList(), this, null), 3, null);
        }
    }
}
