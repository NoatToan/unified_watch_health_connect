package com.huami.bloodpressure_core.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteEntityKt;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2Entity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2EntityKt;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestEntity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestV2Entity;
import com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate;
import com.huami.bloodpressure_core.dc.remote.night.BloodPressureApiNightDelegate;
import com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightVo;
import com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightVoKt;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_core.sharedpreference.ISharedPref;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u0012\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020(0 \u0012\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020(0 \u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b8\u00109J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020(0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R(\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020(0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/huami/bloodpressure_core/repo/BloodPressureRepo;", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "", "userId", "", ParamKey.dataSource, "limit", "", "a", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserData", "cleanData", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "saveAndPostData", "saveAndPostNightData", "dateString", "days", "getRemoteNightData", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "b", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "localDataRepo", "Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;", "c", "Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;", "iSharedPref", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteEntity;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestEntity;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "eventApiV1", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "e", "eventApiV2", "f", "deviceApi", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureApiNightDelegate;", "g", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureApiNightDelegate;", "nightApi", "h", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/CopyOnWriteArrayList;", "i", "Ljava/util/concurrent/CopyOnWriteArrayList;", "loaderNightDateList", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;Lcom/huami/bloodpressure_core/sharedpreference/ISharedPref;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureApiNightDelegate;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRepo implements IBloodPressureRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ILocalDelegate localDataRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ISharedPref iSharedPref;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity> eventApiV1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> eventApiV2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> deviceApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureApiNightDelegate nightApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "BloodPressureRepo";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<String> loaderNightDateList = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$cleanData$1", f = "IBloodPressureRepo.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRepo.this.new a(continuation);
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
                ILocalDelegate iLocalDelegate = BloodPressureRepo.this.localDataRepo;
                this.a = 1;
                if (iLocalDelegate.clean(this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo", f = "IBloodPressureRepo.kt", i = {0, 0}, l = {251, 254}, m = "getRemoteNightData", n = {"this", "dateString"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BloodPressureRepo.this.getRemoteNightData(null, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get duplicated remote " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$getUserData$1", f = "IBloodPressureRepo.kt", i = {}, l = {87, 99}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRepo.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
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
            IBloodPressureDelegate iBloodPressureDelegate = BloodPressureRepo.this.eventApiV1;
            Long lBoxLong = Boxing.boxLong(this.c);
            this.a = 1;
            obj = iBloodPressureDelegate.getUserAllData(lBoxLong, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BloodPressureDbVo dbVo = BloodPressureRemoteEntityKt.toDbVo((BloodPressureRemoteEntity) it2.next());
                if (dbVo != null) {
                    arrayList.add(dbVo);
                }
            }
            if (!(list.isEmpty())) {
                BloodPressureRepo.this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V1, System.currentTimeMillis());
            }
            ILocalDelegate iLocalDelegate = BloodPressureRepo.this.localDataRepo;
            this.a = 2;
            if (iLocalDelegate.insert(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$getUserData$2", f = "IBloodPressureRepo.kt", i = {}, l = {106, 118}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRepo.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
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
            long j = BloodPressureRepo.this.iSharedPref.getLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V2, UserEx.getUserCreateTime());
            IBloodPressureDelegate iBloodPressureDelegate = BloodPressureRepo.this.eventApiV2;
            Long lBoxLong = Boxing.boxLong(j);
            this.a = 1;
            obj = iBloodPressureDelegate.getUserAllData(lBoxLong, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BloodPressureDbVo dbVo$default = BloodPressureRemoteV2EntityKt.toDbVo$default((BloodPressureRemoteV2Entity) it2.next(), 0, 1, null);
                if (dbVo$default != null) {
                    arrayList.add(dbVo$default);
                }
            }
            if (!(list.isEmpty())) {
                BloodPressureRepo.this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V2, System.currentTimeMillis());
            }
            ILocalDelegate iLocalDelegate = BloodPressureRepo.this.localDataRepo;
            this.a = 2;
            if (iLocalDelegate.insert(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$getUserData$3", f = "IBloodPressureRepo.kt", i = {}, l = {126, 138}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRepo.this.new f(continuation);
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
            if (i != 0) {
                if (i == 1) {
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
            long j = BloodPressureRepo.this.iSharedPref.getLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_DEVICE, UserEx.getUserCreateTime());
            IBloodPressureDelegate iBloodPressureDelegate = BloodPressureRepo.this.deviceApi;
            Long lBoxLong = Boxing.boxLong(j);
            this.a = 1;
            obj = iBloodPressureDelegate.getUserAllData(lBoxLong, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BloodPressureDbVo dbVo = BloodPressureRemoteV2EntityKt.toDbVo((BloodPressureRemoteV2Entity) it2.next(), 1);
                if (dbVo != null) {
                    arrayList.add(dbVo);
                }
            }
            if (!(list.isEmpty())) {
                BloodPressureRepo.this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_DEVICE, System.currentTimeMillis());
            }
            ILocalDelegate iLocalDelegate = BloodPressureRepo.this.localDataRepo;
            this.a = 2;
            if (iLocalDelegate.insert(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$getUserData$4", f = "IBloodPressureRepo.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRepo.this.new g(continuation);
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
                long jCurrentTimeMillis = System.currentTimeMillis();
                BloodPressureApiNightDelegate bloodPressureApiNightDelegate = BloodPressureRepo.this.nightApi;
                String[] strArr = {TimeFormatEx.INSTANCE.formatTimeYMDInter(jCurrentTimeMillis), "1"};
                this.a = 1;
                if (bloodPressureApiNightDelegate.getData(strArr, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$saveAndPostData$1", f = "IBloodPressureRepo.kt", i = {0}, l = {171, 175, DataTypeSource.SPORT_TYPE_SHOOT, 189, 190}, m = "invokeSuspend", n = {"userId"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ List<BloodPressureDbVo> c;
        public final /* synthetic */ BloodPressureRepo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<BloodPressureDbVo> list, BloodPressureRepo bloodPressureRepo, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = bloodPressureRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00cd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00db  */
        /* JADX WARN: Code duplicated, block: B:52:0x00de  */
        /* JADX WARN: Code duplicated, block: B:55:0x00f9 A[LOOP:0: B:53:0x00f3->B:55:0x00f9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:58:0x0111 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x011a  */
        /* JADX WARN: Code duplicated, block: B:63:0x012a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String userId;
            Object allDataByUserIdAndSource;
            Object unuploadDataByDataSource;
            List<BloodPressureDbVo> list;
            ArrayList arrayList;
            Iterator it2;
            Object objPostDataList;
            ILocalDelegate iLocalDelegate;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    userId = (String) this.a;
                    ResultKt.throwOnFailure(obj);
                    allDataByUserIdAndSource = obj;
                } else if (i == 2) {
                    userId = (String) this.a;
                    ResultKt.throwOnFailure(obj);
                    ILocalDelegate iLocalDelegate2 = this.d.localDataRepo;
                    this.a = null;
                    this.b = 3;
                    unuploadDataByDataSource = iLocalDelegate2.getUnuploadDataByDataSource(userId, 100, 1, this);
                    if (unuploadDataByDataSource == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) unuploadDataByDataSource;
                    if (list != null || list.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    IBloodPressureDelegate iBloodPressureDelegate = this.d.deviceApi;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(BloodPressureRemoteV2EntityKt.toV2Entity((BloodPressureDbVo) it2.next()));
                    }
                    this.a = list;
                    this.b = 4;
                    objPostDataList = iBloodPressureDelegate.postDataList(arrayList, this);
                    if (objPostDataList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objPostDataList).booleanValue()) {
                        iLocalDelegate = this.d.localDataRepo;
                        this.a = null;
                        this.b = 5;
                        if (iLocalDelegate.setListUploaded(list, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    unuploadDataByDataSource = obj;
                    list = (List) unuploadDataByDataSource;
                    if (list != null || list.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    IBloodPressureDelegate iBloodPressureDelegate2 = this.d.deviceApi;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(BloodPressureRemoteV2EntityKt.toV2Entity((BloodPressureDbVo) it2.next()));
                    }
                    this.a = list;
                    this.b = 4;
                    objPostDataList = iBloodPressureDelegate2.postDataList(arrayList, this);
                    if (objPostDataList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objPostDataList).booleanValue()) {
                        iLocalDelegate = this.d.localDataRepo;
                        this.a = null;
                        this.b = 5;
                        if (iLocalDelegate.setListUploaded(list, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 4) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    objPostDataList = obj;
                    if (((Boolean) objPostDataList).booleanValue()) {
                        iLocalDelegate = this.d.localDataRepo;
                        this.a = null;
                        this.b = 5;
                        if (iLocalDelegate.setListUploaded(list, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            List<BloodPressureDbVo> list2 = this.c;
            if (list2 == null || list2.isEmpty()) {
                return Unit.INSTANCE;
            }
            userId = UserEx.getUserId();
            ILocalDelegate iLocalDelegate3 = this.d.localDataRepo;
            this.a = userId;
            this.b = 1;
            allDataByUserIdAndSource = iLocalDelegate3.getAllDataByUserIdAndSource(userId, 1, this);
            if (allDataByUserIdAndSource == coroutine_suspended) {
                return coroutine_suspended;
            }
            List listEmptyList = (List) allDataByUserIdAndSource;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            ILocalDelegate iLocalDelegate4 = this.d.localDataRepo;
            List<BloodPressureDbVo> list3 = this.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (!Boxing.boxBoolean(listEmptyList.contains((BloodPressureDbVo) obj2)).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            this.a = userId;
            this.b = 2;
            if (iLocalDelegate4.insert(arrayList2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ILocalDelegate iLocalDelegate5 = this.d.localDataRepo;
            this.a = null;
            this.b = 3;
            unuploadDataByDataSource = iLocalDelegate5.getUnuploadDataByDataSource(userId, 100, 1, this);
            if (unuploadDataByDataSource == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) unuploadDataByDataSource;
            if (list != null || list.isEmpty()) {
                return Unit.INSTANCE;
            }
            IBloodPressureDelegate iBloodPressureDelegate3 = this.d.deviceApi;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(BloodPressureRemoteV2EntityKt.toV2Entity((BloodPressureDbVo) it2.next()));
            }
            this.a = list;
            this.b = 4;
            objPostDataList = iBloodPressureDelegate3.postDataList(arrayList, this);
            if (objPostDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objPostDataList).booleanValue()) {
                iLocalDelegate = this.d.localDataRepo;
                this.a = null;
                this.b = 5;
                if (iLocalDelegate.setListUploaded(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo$saveAndPostNightData$1", f = "IBloodPressureRepo.kt", i = {0}, l = {204, 207, 217, 238}, m = "invokeSuspend", n = {"userId"}, s = {"L$0"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;
        public final /* synthetic */ List<BloodPressureDbVo> f;
        public final /* synthetic */ BloodPressureRepo g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;
            public final /* synthetic */ double b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, double d) {
                super(0);
                this.a = j;
                this.b = d;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "count = " + this.a + " repeatTime = " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<BloodPressureDbVo> list, BloodPressureRepo bloodPressureRepo, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f = list;
            this.g = bloodPressureRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:9:0x0021, B:14:0x0038, B:50:0x00d6, B:52:0x00e2, B:54:0x00e5, B:47:0x00c3), top: B:73:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00e5 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:9:0x0021, B:14:0x0038, B:50:0x00d6, B:52:0x00e2, B:54:0x00e5, B:47:0x00c3), top: B:73:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0101 A[Catch: all -> 0x012a, TRY_ENTER, TryCatch #0 {all -> 0x012a, blocks: (B:61:0x011e, B:57:0x0101, B:62:0x0123), top: B:71:0x011e }] */
        /* JADX WARN: Code duplicated, block: B:59:0x011a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x011b  */
        /* JADX WARN: Code duplicated, block: B:62:0x0123 A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {all -> 0x012a, blocks: (B:61:0x011e, B:57:0x0101, B:62:0x0123), top: B:71:0x011e }] */
        /* JADX WARN: Code duplicated, block: B:68:0x013d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10, types: [int] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [com.huami.bloodpressure_core.repo.BloodPressureRepo$i] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8, types: [com.huami.bloodpressure_core.repo.BloodPressureRepo$i, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011b -> B:71:0x011e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bloodpressure_core.repo.BloodPressureRepo.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.repo.BloodPressureRepo", f = "IBloodPressureRepo.kt", i = {0}, l = {WeightingState.state_low_power, 273, 274}, m = "uploadLocalData", n = {"this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BloodPressureRepo.this.a(null, 0, 0, this);
        }
    }

    public BloodPressureRepo(@NotNull CoroutineScope coroutineScope, @NotNull ILocalDelegate iLocalDelegate, @NotNull ISharedPref iSharedPref, @NotNull IBloodPressureDelegate<BloodPressureRemoteEntity, BloodPressureRequestEntity> iBloodPressureDelegate, @NotNull IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> iBloodPressureDelegate2, @NotNull IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> iBloodPressureDelegate3, @NotNull BloodPressureApiNightDelegate bloodPressureApiNightDelegate) {
        this.scope = coroutineScope;
        this.localDataRepo = iLocalDelegate;
        this.iSharedPref = iSharedPref;
        this.eventApiV1 = iBloodPressureDelegate;
        this.eventApiV2 = iBloodPressureDelegate2;
        this.deviceApi = iBloodPressureDelegate3;
        this.nightApi = bloodPressureApiNightDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, int i2, int i3, Continuation<? super Unit> continuation) {
        j jVar;
        BloodPressureRepo bloodPressureRepo;
        List<BloodPressureDbVo> list;
        ILocalDelegate iLocalDelegate;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i4 = jVar.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar.e = i4 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object unuploadDataByDataSource = jVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = jVar.e;
        boolean z = true;
        if (i5 != 0) {
            if (i5 == 1) {
                BloodPressureRepo bloodPressureRepo2 = (BloodPressureRepo) jVar.a;
                ResultKt.throwOnFailure(unuploadDataByDataSource);
                bloodPressureRepo = bloodPressureRepo2;
            } else if (i5 == 2) {
                list = (List) jVar.b;
                bloodPressureRepo = (BloodPressureRepo) jVar.a;
                ResultKt.throwOnFailure(unuploadDataByDataSource);
                if (((Boolean) unuploadDataByDataSource).booleanValue()) {
                    return Unit.INSTANCE;
                }
                iLocalDelegate = bloodPressureRepo.localDataRepo;
                jVar.a = null;
                jVar.b = null;
                jVar.e = 3;
                if (iLocalDelegate.setListUploaded(list, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(unuploadDataByDataSource);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(unuploadDataByDataSource);
        ILocalDelegate iLocalDelegate2 = this.localDataRepo;
        jVar.a = this;
        jVar.e = 1;
        unuploadDataByDataSource = iLocalDelegate2.getUnuploadDataByDataSource(str, i3, i2, jVar);
        if (unuploadDataByDataSource == coroutine_suspended) {
            return coroutine_suspended;
        }
        bloodPressureRepo = this;
        list = (List) unuploadDataByDataSource;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            return Unit.INSTANCE;
        }
        jVar.a = bloodPressureRepo;
        jVar.b = list;
        jVar.e = 2;
        unuploadDataByDataSource = bloodPressureRepo.nightApi.postData(list, new String[0], (Continuation<? super Boolean>) jVar);
        if (unuploadDataByDataSource == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) unuploadDataByDataSource).booleanValue()) {
            return Unit.INSTANCE;
        }
        iLocalDelegate = bloodPressureRepo.localDataRepo;
        jVar.a = null;
        jVar.b = null;
        jVar.e = 3;
        if (iLocalDelegate.setListUploaded(list, jVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void cleanData() {
        this.loaderNightDateList.clear();
        this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V1, UserEx.getUserCreateTime());
        this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V2, UserEx.getUserCreateTime());
        this.iSharedPref.saveLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_DEVICE, UserEx.getUserCreateTime());
        kotlinx.coroutines.e.f(this.scope, null, null, new a(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:0: B:26:0x0082->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    @Nullable
    public Object getRemoteNightData(@NotNull String str, int i2, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        BloodPressureRepo bloodPressureRepo;
        List list;
        ILocalDelegate iLocalDelegate;
        ArrayList arrayList;
        Iterator it2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.e = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object data = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = bVar.e;
        if (i4 == 0) {
            ResultKt.throwOnFailure(data);
            if (this.loaderNightDateList.contains(str)) {
                HMLog.info(this.TAG, new c(str));
            } else {
                BloodPressureApiNightDelegate bloodPressureApiNightDelegate = this.nightApi;
                String[] strArr = {str, String.valueOf(i2)};
                bVar.a = this;
                bVar.b = str;
                bVar.e = 1;
                data = bloodPressureApiNightDelegate.getData(strArr, bVar);
                if (data == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodPressureRepo = this;
                list = (List) data;
                if (list != null) {
                    bloodPressureRepo.loaderNightDateList.add(str);
                    iLocalDelegate = bloodPressureRepo.localDataRepo;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(BloodPressureNightVoKt.toDbVo((BloodPressureNightVo) it2.next()));
                    }
                    bVar.a = null;
                    bVar.b = null;
                    bVar.e = 2;
                    if (iLocalDelegate.insert(arrayList, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i4 == 1) {
            str = (String) bVar.b;
            bloodPressureRepo = (BloodPressureRepo) bVar.a;
            ResultKt.throwOnFailure(data);
            list = (List) data;
            if (list != null) {
                bloodPressureRepo.loaderNightDateList.add(str);
                iLocalDelegate = bloodPressureRepo.localDataRepo;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(BloodPressureNightVoKt.toDbVo((BloodPressureNightVo) it2.next()));
                }
                bVar.a = null;
                bVar.b = null;
                bVar.e = 2;
                if (iLocalDelegate.insert(arrayList, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void getUserData() {
        kotlinx.coroutines.e.f(this.scope, null, null, new d(this.iSharedPref.getLong(BloodPressureConst.SharedKey.SHARED_TIMESTAMP_V1, UserEx.getUserCreateTime()), null), 3, null);
        kotlinx.coroutines.e.f(this.scope, null, null, new e(null), 3, null);
        kotlinx.coroutines.e.f(this.scope, null, null, new f(null), 3, null);
        kotlinx.coroutines.e.f(this.scope, null, null, new g(null), 3, null);
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void saveAndPostData(@NotNull List<BloodPressureDbVo> list) {
        kotlinx.coroutines.e.f(this.scope, null, null, new h(list, this, null), 3, null);
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void saveAndPostNightData(@NotNull List<BloodPressureDbVo> list) {
        kotlinx.coroutines.e.f(this.scope, null, null, new i(list, this, null), 3, null);
    }
}
