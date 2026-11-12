package com.huami.pai.ui.history;

import androidx.exifinterface.media.ExifInterface;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.HttpUserInfoKt;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.repository.PaiRepo;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai.vo.PaiEventVo;
import com.huami.pai.vo.PaiRemoteVo;
import com.huami.pai.vo.PaiRemoteVoKt;
import com.xiaomi.hm.health.Constant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/pai/ui/history/PaiRemoteRepo;", "Lcom/huami/pai/ui/history/PAIBaseRepo;", "Lorg/koin/core/component/KoinComponent;", "", "from", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/pai/vo/PAIDataVo;", "getAllDatas", "", "paiListJson", "", "uploadPaiList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRemoteDatas", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "a", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "getHttpInfoManager", "()Lcom/huami/pai/dto/IHttpUserInfoManager;", "httpInfoManager", "<init>", "(Lcom/huami/pai/dto/IHttpUserInfoManager;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiRemoteRepo implements PAIBaseRepo, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHttpUserInfoManager httpInfoManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/pai/vo/PaiEventVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$1", f = "PaiRemoteRepo.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super PaiEventVo>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ PaiRepo c;
        public final /* synthetic */ Ref.ObjectRef<String> d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaiRepo paiRepo, Ref.ObjectRef<String> objectRef, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = paiRepo;
            this.d = objectRef;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super PaiEventVo> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.b;
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
            flowCollector = (FlowCollector) this.b;
            PaiRepo paiRepo = this.c;
            String str = this.d.element;
            String str2 = this.e;
            this.b = flowCollector;
            this.a = 1;
            obj = paiRepo.getData(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PaiRemoteRepo", f = "PaiRemoteRepo.kt", i = {0, 0, 0}, l = {77}, m = "getAllRemoteDatas", n = {"age", "gender", Constant.PAI_KEY_MAX_HR}, s = {"I$0", "I$1", "I$2"})
    public static final class b extends ContinuationImpl {
        public int a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return PaiRemoteRepo.this.getAllRemoteDatas(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PaiRemoteVo;", "item", "Lcom/huami/pai/vo/PAIDataVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PaiRemoteVo, PAIDataVo> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, int i3) {
            super(1);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PAIDataVo invoke(@NotNull PaiRemoteVo paiRemoteVo) {
            return PaiRemoteVoKt.toCharVo(paiRemoteVo, this.a, this.b, this.c);
        }
    }

    public PaiRemoteRepo(@NotNull IHttpUserInfoManager iHttpUserInfoManager) {
        this.httpInfoManager = iHttpUserInfoManager;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    @Override // com.huami.pai.ui.history.PAIBaseRepo
    @NotNull
    public Flow<List<PAIDataVo>> getAllDatas(long from) {
        PaiRepo paiRepo = (PaiRepo) ScopesAndQualifersKt.paiScope(getKoin()).get(Reflection.getOrCreateKotlinClass(PaiRepo.class), null, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HttpUserInfo userInfo = this.httpInfoManager.getUserInfo();
        objectRef.element = String.valueOf(userInfo == null ? HttpUserInfoKt.DEFAULT_CREATED_TIME : userInfo.getCreatedTime());
        if (from != 0) {
            objectRef.element = String.valueOf(from);
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        HttpUserInfo userInfo2 = this.httpInfoManager.getUserInfo();
        final int age = userInfo2 == null ? 18 : userInfo2.getAge();
        final int gender = userInfo2 == null ? 0 : userInfo2.getGender();
        final int i = (int) (((double) 211) - (((double) age) * 0.64d));
        final Flow flow = FlowKt.flow(new a(paiRepo, objectRef, strValueOf, null));
        final Flow<ArrayList<PaiRemoteVo>> flow2 = new Flow<ArrayList<PaiRemoteVo>>() { // from class: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<PaiEventVo> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1 b;

                /* JADX INFO: renamed from: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1$2", f = "PaiRemoteRepo.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$1 paiRemoteRepo$getAllDatas$$inlined$mapNotNull$1) {
                    this.a = flowCollector;
                    this.b = paiRemoteRepo$getAllDatas$$inlined$mapNotNull$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(PaiEventVo paiEventVo, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        PaiEventVo paiEventVo2 = paiEventVo;
                        ArrayList<PaiRemoteVo> items = paiEventVo2 == null ? null : paiEventVo2.getItems();
                        if (items == null) {
                            return Unit.INSTANCE;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(items, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super ArrayList<PaiRemoteVo>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<List<PAIDataVo>>() { // from class: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2

            /* JADX INFO: renamed from: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<ArrayList<PaiRemoteVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2 b;

                /* JADX INFO: renamed from: com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.ui.history.PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2$2", f = "PaiRemoteRepo.kt", i = {}, l = {142}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2 paiRemoteRepo$getAllDatas$$inlined$mapNotNull$2) {
                    this.a = flowCollector;
                    this.b = paiRemoteRepo$getAllDatas$$inlined$mapNotNull$2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(ArrayList<PaiRemoteVo> arrayList, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        ArrayList<PaiRemoteVo> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        for (PaiRemoteVo paiRemoteVo : arrayList2) {
                            PaiRemoteRepo$getAllDatas$$inlined$mapNotNull$2 paiRemoteRepo$getAllDatas$$inlined$mapNotNull$2 = this.b;
                            arrayList3.add(PaiRemoteVoKt.toCharVo(paiRemoteVo, age, gender, i));
                        }
                        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                        if (mutableList == null) {
                            return Unit.INSTANCE;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(mutableList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<PAIDataVo>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.pai.ui.history.PAIBaseRepo
    @Nullable
    public Object getAllRemoteDatas(long j, @NotNull Continuation<? super List<PAIDataVo>> continuation) throws Exception {
        b bVar;
        Integer numBoxInt;
        int iIntValue;
        int i;
        int i2;
        Integer numBoxInt2;
        Long lBoxLong;
        Sequence sequenceAsSequence;
        Sequence map;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object data = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = bVar.f;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(data);
                PaiRepo paiRepo = (PaiRepo) ScopesAndQualifersKt.paiScope(getKoin()).get(Reflection.getOrCreateKotlinClass(PaiRepo.class), null, null);
                HttpUserInfo userInfo = getHttpInfoManager().getUserInfo();
                long jLongValue = HttpUserInfoKt.DEFAULT_CREATED_TIME;
                if (userInfo != null && (lBoxLong = Boxing.boxLong(userInfo.getCreatedTime())) != null) {
                    jLongValue = lBoxLong.longValue();
                }
                String strValueOf = String.valueOf(jLongValue);
                if (j != 0) {
                    strValueOf = String.valueOf(j);
                }
                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                HttpUserInfo userInfo2 = getHttpInfoManager().getUserInfo();
                int iIntValue2 = 18;
                if (userInfo2 != null && (numBoxInt2 = Boxing.boxInt(userInfo2.getAge())) != null) {
                    iIntValue2 = numBoxInt2.intValue();
                }
                iIntValue = (userInfo2 == null || (numBoxInt = Boxing.boxInt(userInfo2.getGender())) == null) ? 0 : numBoxInt.intValue();
                int i5 = (int) (((double) 211) - (((double) iIntValue2) * 0.64d));
                bVar.a = iIntValue2;
                bVar.b = iIntValue;
                bVar.c = i5;
                bVar.f = 1;
                data = paiRepo.getData(strValueOf, strValueOf2, bVar);
                if (data == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iIntValue2;
                i2 = i5;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = bVar.c;
                iIntValue = bVar.b;
                i = bVar.a;
                ResultKt.throwOnFailure(data);
            }
            PaiEventVo paiEventVo = (PaiEventVo) data;
            ArrayList<PaiRemoteVo> items = paiEventVo == null ? null : paiEventVo.getItems();
            if (items != null && (sequenceAsSequence = CollectionsKt___CollectionsKt.asSequence(items)) != null && (map = SequencesKt___SequencesKt.map(sequenceAsSequence, new c(i, iIntValue, i2))) != null) {
                return SequencesKt___SequencesKt.toMutableList(map);
            }
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    @NotNull
    public final IHttpUserInfoManager getHttpInfoManager() {
        return this.httpInfoManager;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.pai.ui.history.PAIBaseRepo
    @Nullable
    public Object uploadPaiList(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return ((PaiRepo) ScopesAndQualifersKt.paiScope(getKoin()).get(Reflection.getOrCreateKotlinClass(PaiRepo.class), null, null)).postData(str, continuation);
    }
}
