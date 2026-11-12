package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: zkm, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class zipImpl {

    /* JADX INFO: renamed from: zkm$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, ExerciseSessionRecord.EXERCISE_TYPE_WALKING}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<T[]> f54233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super yzc>, Object> f54234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow<T>[] f54235c;
        final /* synthetic */ FlowCollector<R> d;
        int e;
        int f;
        int g;
        Object h;
        private /* synthetic */ Object i;
        Object j;

        /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[LOOP:0: B:28:0x00d3->B:50:?, LOOP_START, PHI: r6 r9
          0x00d3: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:25:0x00ce, B:50:?] A[DONT_GENERATE, DONT_INLINE]
          0x00d3: PHI (r9v5 zab) = (r9v4 zab), (r9v18 zab) binds: [B:25:0x00ce, B:50:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:38:0x0105  */
        /* JADX WARN: Code duplicated, block: B:41:0x011c  */
        /* JADX WARN: Code duplicated, block: B:44:0x0145  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f8 A[EDGE_INSN: B:48:0x00f8->B:35:0x00f8 BREAK  A[LOOP:0: B:28:0x00d3->B:50:?], SYNTHETIC] */
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
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zipImpl.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: zkm$e$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f54236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Flow<T>[] f54237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f54238c;
            final /* synthetic */ AtomicInteger d;
            final /* synthetic */ Channel<zab<Object>> e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA = zbg.a();
                int i = this.f54236a;
                try {
                    if (i == 0) {
                        createFailure.c(obj);
                        Flow[] flowArr = this.f54237b;
                        int i2 = this.f54238c;
                        this.f54236a = 1;
                        if (flowArr[i2].collect(new AnonymousClass5(this.e, i2), this) == objA) {
                            return objA;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        createFailure.c(obj);
                    }
                    if (this.d.decrementAndGet() == 0) {
                        SendChannel.a.c(this.e, null, 1, null);
                    }
                    return yzc.e;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 0) {
                        SendChannel.a.c(this.e, null, 1, null);
                    }
                    throw th;
                }
            }

            /* JADX INFO: renamed from: zkm$e$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass5<T> implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Channel<zab<Object>> f54239b;
                final /* synthetic */ int d;

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
                
                    if (defpackage.yield.d(r0) == r1) goto L21;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, Continuation<? super yzc> continuation) {
                    b bVar;
                    if (continuation instanceof b) {
                        bVar = (b) continuation;
                        if ((bVar.f54240a & Integer.MIN_VALUE) != 0) {
                            bVar.f54240a -= Integer.MIN_VALUE;
                        } else {
                            bVar = new b(this, continuation);
                        }
                    } else {
                        bVar = new b(this, continuation);
                    }
                    Object obj = bVar.f54241b;
                    Object objA = zbg.a();
                    int i = bVar.f54240a;
                    if (i == 0) {
                        createFailure.c(obj);
                        Channel<zab<Object>> channel = this.f54239b;
                        zab<Object> zabVar = new zab<>(this.d, t);
                        bVar.f54240a = 1;
                        if (channel.send(zabVar, bVar) != objA) {
                        }
                        return objA;
                    }
                    if (i == 1) {
                        createFailure.c(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        createFailure.c(obj);
                    }
                    return yzc.e;
                    bVar.f54240a = 2;
                }

                /* JADX INFO: renamed from: zkm$e$1$5$b */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
                static final class b extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f54240a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f54241b;
                    final /* synthetic */ AnonymousClass5<T> e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f54241b = obj;
                        this.f54240a |= Integer.MIN_VALUE;
                        return this.e.emit(null, this);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    b(AnonymousClass5<? super T> anonymousClass5, Continuation<? super b> continuation) {
                        super(continuation);
                        this.e = anonymousClass5;
                    }
                }

                AnonymousClass5(Channel<zab<Object>> channel, int i) {
                    this.f54239b = channel;
                    this.d = i;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.f54237b, this.f54238c, this.d, this.e, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends T>[] flowArr, int i, AtomicInteger atomicInteger, Channel<zab<Object>> channel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f54237b = flowArr;
                this.f54238c = i;
                this.d = atomicInteger;
                this.e = channel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f54235c, this.f54233a, this.f54234b, this.d, continuation);
            eVar.i = obj;
            return eVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super yzc>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f54235c = flowArr;
            this.f54233a = function0;
            this.f54234b = function3;
            this.d = flowCollector;
        }
    }

    public static final <R, T> Object e(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super yzc>, ? extends Object> function3, Continuation<? super yzc> continuation) {
        Object objB = flowScope.b(new e(flowArr, function0, function3, flowCollector, null), continuation);
        return objB == zbg.a() ? objB : yzc.e;
    }
}
