package com.huami.bigdata.statistics.core.usecase;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bigdata.statistics.core.api.BigDataType;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import com.huami.bigdata.statistics.core.resource.Failure;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bigdata.statistics.core.resource.Success;
import com.huami.bigdata.statistics.core.utils.ExtensionsKt;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u000201B\u000f\u0012\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J?\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00172\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001025\u0010\u0016\u001a1\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001b\u001a\u00020\u001aH$J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH$J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H$¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¤@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J-\u0010\u0016\u001a\u0004\u0018\u00018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00018\u00012\b\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00020\fH$¢\u0006\u0004\b\u0016\u0010$J#\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00172\u0006\u0010%\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00172\u0006\u0010%\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010'J#\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00172\u0006\u0010%\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010'J#\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00172\u0006\u0010%\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010'R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "", "remote", "", "dateFrom", "to", "", "dateFormat", "Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;", SleepAnalysisFragment.TIME_MODE, "b", "(Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;JJLjava/lang/String;Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "getRemote", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "merge", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "a", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bigdata/statistics/core/api/BigDataType;", "getType", "Ljava/lang/Class;", "getClassT", "getFrom", "(Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;)Ljava/lang/Long;", "from", "getLocal", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local", "(Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;)Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "date", "getDay", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeek", "getMonth", "getYear", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "Companion", "TimeMode", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractBigDataUseCase<DT extends AbstractDateData, T extends AbstractStatistics<DT>> {

    @NotNull
    private static final String b = "AbstractBigDataUseCase";

    @NotNull
    private static final String c = "_WEEK";

    @NotNull
    private static final String d = "_MONTH";

    @NotNull
    private static final String e = "_YEAR";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBigDataExportedApi iBigDataExportedApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bigdata/statistics/core/usecase/AbstractBigDataUseCase$TimeMode;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "core_release"}, k = 1, mv = {1, 5, 1})
    public enum TimeMode {
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase", f = "AbstractBigDataUseCase.kt", i = {}, l = {177}, m = "catchRemoteError", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, Continuation<? super a> continuation) {
            super(continuation);
            this.c = abstractBigDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.a(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AbstractBigDataUseCase catchRemoteError getRemote error " + ((Object) this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AbstractBigDataUseCase catchRemoteError merge error " + ((Object) this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase$getDay$2", f = "AbstractBigDataUseCase.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
        public int a;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str, Continuation<? super d> continuation) {
            super(1, continuation);
            this.b = abstractBigDataUseCase;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super T> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractBigDataUseCase<DT, T> abstractBigDataUseCase = this.b;
                long jYMDToTimestamp = ExtensionsKt.yMDToTimestamp(this.c);
                long lastTimestamp = ExtensionsKt.toLastTimestamp(ExtensionsKt.yMDToTimestamp(this.c));
                TimeMode timeMode = TimeMode.DAY;
                this.a = 1;
                obj = abstractBigDataUseCase.b(null, jYMDToTimestamp, lastTimestamp, "yyyy-MM-dd'T'HH:mm:ss", timeMode, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<T> {
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str) {
            super(0);
            this.a = abstractBigDataUseCase;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((AbstractBigDataUseCase) this.a).iBigDataExportedApi.getData(this.a.getType().name() + AbstractBigDataUseCase.d, this.b, this.a.getClassT());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u008a@"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase$getMonth$3", f = "AbstractBigDataUseCase.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = abstractBigDataUseCase;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t, @Nullable Continuation<? super T> continuation) {
            return ((f) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.c, this.d, continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractStatistics abstractStatistics = (AbstractStatistics) this.b;
                AbstractBigDataUseCase<DT, T> abstractBigDataUseCase = this.c;
                long jYMDToTimestamp = ExtensionsKt.yMDToTimestamp(this.d);
                long monthEnd = ExtensionsKt.toMonthEnd(this.d);
                TimeMode timeMode = TimeMode.MONTH;
                this.a = 1;
                obj = abstractBigDataUseCase.b(abstractStatistics, jYMDToTimestamp, monthEnd, "yyyy-MM-dd", timeMode, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<T> {
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str) {
            super(0);
            this.a = abstractBigDataUseCase;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((AbstractBigDataUseCase) this.a).iBigDataExportedApi.getData(this.a.getType().name() + AbstractBigDataUseCase.c, this.b, this.a.getClassT());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u008a@"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase$getWeek$3", f = "AbstractBigDataUseCase.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = abstractBigDataUseCase;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t, @Nullable Continuation<? super T> continuation) {
            return ((h) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = new h(this.c, this.d, continuation);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractStatistics abstractStatistics = (AbstractStatistics) this.b;
                AbstractBigDataUseCase<DT, T> abstractBigDataUseCase = this.c;
                long jYMDToTimestamp = ExtensionsKt.yMDToTimestamp(this.d);
                long weekEnd = ExtensionsKt.toWeekEnd(this.d);
                TimeMode timeMode = TimeMode.WEEK;
                this.a = 1;
                obj = abstractBigDataUseCase.b(abstractStatistics, jYMDToTimestamp, weekEnd, "yyyy-MM-dd", timeMode, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<T> {
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str) {
            super(0);
            this.a = abstractBigDataUseCase;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((AbstractBigDataUseCase) this.a).iBigDataExportedApi.getData(this.a.getType().name() + AbstractBigDataUseCase.e, this.b, this.a.getClassT());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u008a@"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "DT", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", ExifInterface.GPS_DIRECTION_TRUE, "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase$getYear$3", f = "AbstractBigDataUseCase.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, String str, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = abstractBigDataUseCase;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t, @Nullable Continuation<? super T> continuation) {
            return ((j) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            j jVar = new j(this.c, this.d, continuation);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractStatistics abstractStatistics = (AbstractStatistics) this.b;
                AbstractBigDataUseCase<DT, T> abstractBigDataUseCase = this.c;
                long jYMToTimestamp = ExtensionsKt.yMToTimestamp(this.d);
                long yearEnd = ExtensionsKt.toYearEnd(this.d);
                TimeMode timeMode = TimeMode.YEAR;
                this.a = 1;
                obj = abstractBigDataUseCase.b(abstractStatistics, jYMToTimestamp, yearEnd, "yyyy-MM", timeMode, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase", f = "AbstractBigDataUseCase.kt", i = {0}, l = {85}, m = "merge", n = {SleepAnalysisFragment.TIME_MODE}, s = {"L$0"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public final /* synthetic */ AbstractBigDataUseCase<DT, T> e;
        public int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractBigDataUseCase<DT, T> abstractBigDataUseCase, Continuation<? super k> continuation) {
            super(continuation);
            this.e = abstractBigDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.b(null, 0L, 0L, null, null, this);
        }
    }

    public AbstractBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        this.iBigDataExportedApi = iBigDataExportedApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    public final Object a(Function0<? extends T> function0, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super Resource<T>> continuation) {
        a aVar;
        T tInvoke;
        Object objM3845constructorimpl;
        Ref.ObjectRef objectRef;
        Object objM3845constructorimpl2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                Result.Companion companion = Result.Companion;
                tInvoke = function0.invoke();
                try {
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                th = th2;
                tInvoke = (T) null;
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                objectRef2.element = thM3848exceptionOrNullimpl.getMessage();
                HMLog.info$default(null, new b(objectRef2), 1, null);
            }
            Result.m3851isSuccessimpl(objM3845constructorimpl);
            try {
                Result.Companion companion3 = Result.Companion;
                aVar.a = objectRef2;
                aVar.d = 1;
                Object objInvoke = function2.invoke(tInvoke, aVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objInvoke;
                objectRef = objectRef2;
            } catch (Throwable th3) {
                th = th3;
                objectRef = objectRef2;
                Result.Companion companion4 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) aVar.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th4) {
                th = th4;
                Result.Companion companion5 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM3845constructorimpl2 = Result.m3845constructorimpl((AbstractStatistics) obj);
        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
        if (thM3848exceptionOrNullimpl2 != null) {
            objectRef.element = thM3848exceptionOrNullimpl2.getMessage();
            HMLog.info$default(null, new c(objectRef), 1, null);
        }
        AbstractStatistics abstractStatistics = (AbstractStatistics) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
        T t = objectRef.element;
        return t == 0 ? new Success(abstractStatistics) : new Failure((String) t, abstractStatistics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase, com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase<DT extends com.huami.bigdata.statistics.core.entity.AbstractDateData, T extends com.huami.bigdata.statistics.core.entity.AbstractStatistics<DT>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Object b(T t, long j2, long j3, String str, TimeMode timeMode, Continuation<? super T> continuation) {
        k kVar;
        TimeMode timeMode2;
        AbstractStatistics abstractStatistics;
        ?? r2;
        AbstractStatistics abstractStatistics2;
        ?? r3;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, continuation);
            }
        } else {
            kVar = new k(this, continuation);
        }
        k kVar2 = kVar;
        Object local = kVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar2.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(local);
            Long from = getFrom(t);
            long jLongValue = from == null ? j2 : from.longValue();
            if (jLongValue >= j3) {
                abstractStatistics2 = null;
                abstractStatistics = t;
                timeMode2 = timeMode;
                r3 = this;
            } else {
                if (from != null) {
                    jLongValue += (long) 1000;
                }
                timeMode2 = timeMode;
                kVar2.a = timeMode2;
                kVar2.b = this;
                abstractStatistics = t;
                kVar2.c = abstractStatistics;
                kVar2.f = 1;
                local = getLocal(jLongValue, j3, str, kVar2);
                if (local == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = this;
            }
            return r3.merge(abstractStatistics, abstractStatistics2, timeMode2);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractStatistics abstractStatistics3 = (AbstractStatistics) kVar2.c;
        AbstractBigDataUseCase abstractBigDataUseCase = (AbstractBigDataUseCase) kVar2.b;
        TimeMode timeMode3 = (TimeMode) kVar2.a;
        ResultKt.throwOnFailure(local);
        abstractStatistics = abstractStatistics3;
        timeMode2 = timeMode3;
        r2 = abstractBigDataUseCase;
        abstractStatistics2 = (AbstractStatistics) local;
        r3 = r2;
        return r3.merge(abstractStatistics, abstractStatistics2, timeMode2);
    }

    @NotNull
    public abstract Class<T> getClassT();

    @Nullable
    public final Object getDay(@NotNull String str, @NotNull Continuation<? super Resource<T>> continuation) {
        return ResourceKt.mapToResource(new d(this, str, null), continuation);
    }

    @Nullable
    public abstract Long getFrom(@Nullable T remote);

    @Nullable
    public abstract Object getLocal(long j2, long j3, @NotNull String str, @NotNull Continuation<? super T> continuation);

    @Nullable
    public final Object getMonth(@NotNull String str, @NotNull Continuation<? super Resource<T>> continuation) {
        return a(new e(this, str), new f(this, str, null), continuation);
    }

    @NotNull
    public abstract BigDataType getType();

    @Nullable
    public final Object getWeek(@NotNull String str, @NotNull Continuation<? super Resource<T>> continuation) {
        return a(new g(this, str), new h(this, str, null), continuation);
    }

    @Nullable
    public final Object getYear(@NotNull String str, @NotNull Continuation<? super Resource<T>> continuation) {
        return a(new i(this, str), new j(this, str, null), continuation);
    }

    @Nullable
    public abstract T merge(@Nullable T remote, @Nullable T local, @NotNull TimeMode timeMode);
}
