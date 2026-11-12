package com.xiaomi.fitness.sport_eco_manager.source.towear;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider;
import defpackage.dr9;
import defpackage.u7r;
import defpackage.vr9;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "sportSummary", "", DailyRecordKey.sportType, "Ldr9;", "buildBestSportData", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary;I)Ldr9;", "", "setBestSportData", "()V", "<init>", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportConfigProvider {

    @NotNull
    private static final String KEY = "BEAT_DATA_KEY";

    @NotNull
    private static final String TAG = "SportConfigProvider";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SportConfigProvider> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ocn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportConfigProvider.mInstance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider$Companion;", "", "<init>", "()V", "TAG", "", "KEY", "mInstance", "Lcom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider;", "getMInstance", "()Lcom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider$setBestSportData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider$setBestSportData$1", f = "SportConfigProvider.kt", i = {}, l = {41, 47, 53, 59, 65}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportConfigProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportConfigProvider.kt\ncom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider$setBestSportData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n1567#2:131\n1598#2,4:132\n37#3:136\n36#3,3:137\n*S KotlinDebug\n*F\n+ 1 SportConfigProvider.kt\ncom/xiaomi/fitness/sport_eco_manager/source/towear/SportConfigProvider$setBestSportData$1\n*L\n73#1:131\n73#1:132,4\n79#1:136\n79#1:137,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<dr9> $list;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SportConfigProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<dr9> list, SportConfigProvider sportConfigProvider, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = sportConfigProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$list, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00d9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00fa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:36:0x012b  */
        /* JADX WARN: Code duplicated, block: B:38:0x0133  */
        /* JADX WARN: Code duplicated, block: B:42:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:44:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:49:0x0136 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<dr9> list;
            SportConfigProvider sportConfigProvider;
            SportConfigProvider sportConfigProvider2;
            List<dr9> list2;
            List<dr9> list3;
            SportConfigProvider sportConfigProvider3;
            List<dr9> list4;
            SportConfigProvider sportConfigProvider4;
            List<dr9> list5;
            SportConfigProvider sportConfigProvider5;
            Object totalSummary;
            SportConfigProvider sportConfigProvider6;
            ArrayList arrayList;
            int i;
            EcoDeviceModel ecoDeviceModel;
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
                    obj = sportSummaryApi2.getTotalSummary("indoor_riding", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list4.add(sportConfigProvider4.buildBestSportData((SportSummary) obj, 7));
                    list5 = this.$list;
                    sportConfigProvider5 = this.this$0;
                    SportSummaryApi sportSummaryApi3 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list5;
                    this.L$1 = sportConfigProvider5;
                    this.label = 5;
                    totalSummary = sportSummaryApi3.getTotalSummary("walking", this);
                    if (totalSummary == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportConfigProvider6 = sportConfigProvider5;
                    obj = totalSummary;
                } else if (i2 == 3) {
                    sportConfigProvider3 = (SportConfigProvider) this.L$1;
                    list3 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list3.add(sportConfigProvider3.buildBestSportData((SportSummary) obj, 6));
                    list4 = this.$list;
                    sportConfigProvider4 = this.this$0;
                    SportSummaryApi sportSummaryApi4 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list4;
                    this.L$1 = sportConfigProvider4;
                    this.label = 4;
                    obj = sportSummaryApi4.getTotalSummary("indoor_riding", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list4.add(sportConfigProvider4.buildBestSportData((SportSummary) obj, 7));
                    list5 = this.$list;
                    sportConfigProvider5 = this.this$0;
                    SportSummaryApi sportSummaryApi5 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list5;
                    this.L$1 = sportConfigProvider5;
                    this.label = 5;
                    totalSummary = sportSummaryApi5.getTotalSummary("walking", this);
                    if (totalSummary == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportConfigProvider6 = sportConfigProvider5;
                    obj = totalSummary;
                } else if (i2 == 4) {
                    sportConfigProvider4 = (SportConfigProvider) this.L$1;
                    list4 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list4.add(sportConfigProvider4.buildBestSportData((SportSummary) obj, 7));
                    list5 = this.$list;
                    sportConfigProvider5 = this.this$0;
                    SportSummaryApi sportSummaryApi6 = FitnessDataExtKt.getSportSummaryApi();
                    this.L$0 = list5;
                    this.L$1 = sportConfigProvider5;
                    this.label = 5;
                    totalSummary = sportSummaryApi6.getTotalSummary("walking", this);
                    if (totalSummary == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportConfigProvider6 = sportConfigProvider5;
                    obj = totalSummary;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportConfigProvider6 = (SportConfigProvider) this.L$1;
                    list5 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                list5.add(sportConfigProvider6.buildBestSportData((SportSummary) obj, 2));
                vr9 vr9Var = new vr9();
                dr9.a aVar = new dr9.a();
                List<dr9> list6 = this.$list;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                i = 0;
                for (Object obj2 : list6) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    dr9 dr9Var = (dr9) obj2;
                    FitnessLogUtils.i(SportConfigProvider.TAG, "distance : " + dr9Var.e + " , duration:" + dr9Var.d + " , sportType: " + dr9Var.c);
                    arrayList.add(Unit.INSTANCE);
                    i = i3;
                }
                aVar.c = (dr9[]) this.$list.toArray(new dr9[0]);
                vr9Var.T(aVar);
                u7r u7rVar = new u7r();
                u7rVar.e = 8;
                u7rVar.f = 52;
                u7rVar.B(vr9Var);
                EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
                ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (ecoDeviceModel != null) {
                    did = ecoDeviceModel.getDid();
                } else {
                    did = null;
                }
                EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt, did, u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider.setBestSportData.1.2
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did2, int type, int code) {
                        FitnessLogUtils.i(SportConfigProvider.TAG, "onError , did : " + did2 + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did2, int type, EcoSyncResult result) {
                        FitnessLogUtils.i(SportConfigProvider.TAG, "onSuccess , did : " + did2 + " , type : " + type);
                    }
                }, 0, 16, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            list = this.$list;
            sportConfigProvider = this.this$0;
            SportSummaryApi sportSummaryApi7 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list;
            this.L$1 = sportConfigProvider;
            this.label = 1;
            obj = sportSummaryApi7.getTotalSummary("running", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list.add(sportConfigProvider.buildBestSportData((SportSummary) obj, 3));
            List<dr9> list7 = this.$list;
            sportConfigProvider2 = this.this$0;
            SportSummaryApi sportSummaryApi8 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list7;
            this.L$1 = sportConfigProvider2;
            this.label = 2;
            Object totalSummary2 = sportSummaryApi8.getTotalSummary("running", this);
            if (totalSummary2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list7;
            obj = totalSummary2;
            list2.add(sportConfigProvider2.buildBestSportData((SportSummary) obj, 1));
            list3 = this.$list;
            sportConfigProvider3 = this.this$0;
            SportSummaryApi sportSummaryApi9 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list3;
            this.L$1 = sportConfigProvider3;
            this.label = 3;
            obj = sportSummaryApi9.getTotalSummary("outdoor_riding", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list3.add(sportConfigProvider3.buildBestSportData((SportSummary) obj, 6));
            list4 = this.$list;
            sportConfigProvider4 = this.this$0;
            SportSummaryApi sportSummaryApi10 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list4;
            this.L$1 = sportConfigProvider4;
            this.label = 4;
            obj = sportSummaryApi10.getTotalSummary("indoor_riding", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list4.add(sportConfigProvider4.buildBestSportData((SportSummary) obj, 7));
            list5 = this.$list;
            sportConfigProvider5 = this.this$0;
            SportSummaryApi sportSummaryApi11 = FitnessDataExtKt.getSportSummaryApi();
            this.L$0 = list5;
            this.L$1 = sportConfigProvider5;
            this.label = 5;
            totalSummary = sportSummaryApi11.getTotalSummary("walking", this);
            if (totalSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportConfigProvider6 = sportConfigProvider5;
            obj = totalSummary;
            list5.add(sportConfigProvider6.buildBestSportData((SportSummary) obj, 2));
            vr9 vr9Var2 = new vr9();
            dr9.a aVar2 = new dr9.a();
            List<dr9> list8 = this.$list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
            i = 0;
            while (r1.hasNext()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                dr9 dr9Var2 = (dr9) obj2;
                FitnessLogUtils.i(SportConfigProvider.TAG, "distance : " + dr9Var2.e + " , duration:" + dr9Var2.d + " , sportType: " + dr9Var2.c);
                arrayList.add(Unit.INSTANCE);
                i = i4;
            }
            aVar2.c = (dr9[]) this.$list.toArray(new dr9[0]);
            vr9Var2.T(aVar2);
            u7r u7rVar2 = new u7r();
            u7rVar2.e = 8;
            u7rVar2.f = 52;
            u7rVar2.B(vr9Var2);
            EcoDeviceContact ecoDeviceSyncExtKt2 = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
            ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (ecoDeviceModel != null) {
                did = ecoDeviceModel.getDid();
            } else {
                did = null;
            }
            EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt2, did, u7rVar2, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.source.towear.SportConfigProvider.setBestSportData.1.2
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did2, int type, int code) {
                    FitnessLogUtils.i(SportConfigProvider.TAG, "onError , did : " + did2 + " , type : " + type + " , code : " + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did2, int type, EcoSyncResult result) {
                    FitnessLogUtils.i(SportConfigProvider.TAG, "onSuccess , did : " + did2 + " , type : " + type);
                }
            }, 0, 16, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dr9 buildBestSportData(SportSummary sportSummary, int sportType) {
        SportSummary.SummaryData summaryData;
        SportSummary.MaxData maxData;
        SportSummary.MaxValue maxValue;
        SportSummary.SummaryData summaryData2;
        SportSummary.MaxData maxData2;
        SportSummary.MaxValue maxValue2;
        dr9 dr9Var = new dr9();
        int i = 0;
        dr9Var.e = (sportSummary == null || (summaryData2 = sportSummary.info) == null || (maxData2 = summaryData2.max_distance) == null || (maxValue2 = maxData2.value) == null) ? 0 : (int) maxValue2.intValue;
        if (sportSummary != null && (summaryData = sportSummary.info) != null && (maxData = summaryData.max_duration) != null && (maxValue = maxData.value) != null) {
            i = (int) maxValue.intValue;
        }
        dr9Var.d = i;
        dr9Var.c = sportType;
        return dr9Var;
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
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel == null || EcoDeviceModelExtKt.isSupportFeature(ecoDeviceModel, Feature.BEST_SPORT_DATA)) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(new ArrayList(), this, null), 3, null);
        }
    }
}
