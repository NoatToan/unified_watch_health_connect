package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.MedalDetailInfo;
import com.xiaomi.fitness.medal.bean.PopMedalList;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.medal.request.model.MedalNewNetworkResult;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.ecf;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\r\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\r\u0010\nJ7\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u000f\u0010\nJ9\u0010\u0010\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0010\u0010\nJ?\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/medal/request/MedalV2Service;", "Lkotlin/Function1;", "Lecf;", "", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "getUserMedalWithoutNew", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAllMedals", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "getMedalList", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "getMedalEntrance", "getMedalEntranceV4", "Lcom/xiaomi/fitness/medal/bean/MedalDetailInfo;", "medalDetailInfo", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "getUserDetailMedalV2", "(Lcom/xiaomi/fitness/medal/bean/MedalDetailInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalV2Request.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalV2Request.kt\ncom/xiaomi/fitness/medal/request/MedalV2Request\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,131:1\n89#2,5:132\n89#2,5:137\n89#2,5:142\n89#2,5:147\n89#2,5:152\n89#2,5:157\n*S KotlinDebug\n*F\n+ 1 MedalV2Request.kt\ncom/xiaomi/fitness/medal/request/MedalV2Request\n*L\n30#1:132,5\n47#1:137,5\n64#1:142,5\n83#1:147,5\n100#1:152,5\n120#1:157,5\n*E\n"})
public final class MedalV2Request extends BaseRequest<MedalV2Service> {

    @NotNull
    public static final String TAG = "MedalV2Request";

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getAllMedals$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalV2Service;", "it", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lecf;", "<anonymous>", "(Lcom/xiaomi/fitness/medal/request/MedalV2Service;)Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getAllMedals$2", f = "MedalV2Request.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<ecf>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<ecf>> continuation) {
            return ((AnonymousClass2) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                this.label = 1;
                obj = medalV2Service.getAllMedals(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getMedalEntrance$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "it", "Lcom/xiaomi/fitness/medal/request/MedalV2Service;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getMedalEntrance$2", f = "MedalV2Request.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26022 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<MedalEntrance>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26022(Continuation<? super C26022> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26022 c26022 = new C26022(continuation);
            c26022.L$0 = obj;
            return c26022;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<MedalEntrance>> continuation) {
            return ((C26022) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                this.label = 1;
                obj = medalV2Service.getMedalEntrance(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getMedalEntranceV4$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "it", "Lcom/xiaomi/fitness/medal/request/MedalV2Service;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getMedalEntranceV4$2", f = "MedalV2Request.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26032 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<MedalEntrance>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26032(Continuation<? super C26032> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26032 c26032 = new C26032(continuation);
            c26032.L$0 = obj;
            return c26032;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<MedalEntrance>> continuation) {
            return ((C26032) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                this.label = 1;
                obj = medalV2Service.getMedalEntranceV4(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getMedalList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "it", "Lcom/xiaomi/fitness/medal/request/MedalV2Service;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getMedalList$2", f = "MedalV2Request.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26042 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<PopMedalList>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26042(Continuation<? super C26042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26042 c26042 = new C26042(continuation);
            c26042.L$0 = obj;
            return c26042;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<PopMedalList>> continuation) {
            return ((C26042) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                this.label = 1;
                obj = medalV2Service.getMedalList(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getUserDetailMedalV2$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "it", "Lcom/xiaomi/fitness/medal/request/MedalV2Service;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getUserDetailMedalV2$2", f = "MedalV2Request.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26052 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<MedalDetail>>, Object> {
        final /* synthetic */ MedalDetailInfo $medalDetailInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26052(MedalDetailInfo medalDetailInfo, Continuation<? super C26052> continuation) {
            super(2, continuation);
            this.$medalDetailInfo = medalDetailInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26052 c26052 = MedalV2Request.this.new C26052(this.$medalDetailInfo, continuation);
            c26052.L$0 = obj;
            return c26052;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<MedalDetail>> continuation) {
            return ((C26052) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                String json = MedalV2Request.this.getMGson().toJson(this.$medalDetailInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = medalV2Service.getMedalDetailV2(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalV2Request$getUserMedalWithoutNew$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalV2Service;", "it", "Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;", "Lecf;", "<anonymous>", "(Lcom/xiaomi/fitness/medal/request/MedalV2Service;)Lcom/xiaomi/fitness/medal/request/model/MedalNewNetworkResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalV2Request$getUserMedalWithoutNew$2", f = "MedalV2Request.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26062 extends SuspendLambda implements Function2<MedalV2Service, Continuation<? super MedalNewNetworkResult<ecf>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C26062(Continuation<? super C26062> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26062 c26062 = new C26062(continuation);
            c26062.L$0 = obj;
            return c26062;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalV2Service medalV2Service, Continuation<? super MedalNewNetworkResult<ecf>> continuation) {
            return ((C26062) create(medalV2Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalV2Service medalV2Service = (MedalV2Service) this.L$0;
                this.label = 1;
                obj = medalV2Service.getAllMedalsWithOutNew(this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAllMedals$default(MedalV2Request medalV2Request, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: aif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getAllMedals$lambda$2((ApiException) obj2);
                }
            };
        }
        medalV2Request.getAllMedals(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllMedals$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllMedals$lambda$3(Function1 success, Function1 error, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        ecf ecfVar = (ecf) it.getData();
        if (ecfVar != null) {
            success.invoke2(ecfVar);
            Logger.d(TAG, "getAllMedals success. data=" + ecfVar);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMedalEntrance$default(MedalV2Request medalV2Request, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: iif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getMedalEntrance$lambda$6((ApiException) obj2);
                }
            };
        }
        medalV2Request.getMedalEntrance(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$7(Function1 success, Function1 error, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        MedalEntrance medalEntrance = (MedalEntrance) it.getData();
        if (medalEntrance != null) {
            success.invoke2(medalEntrance);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMedalEntranceV4$default(MedalV2Request medalV2Request, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: kif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getMedalEntranceV4$lambda$8((ApiException) obj2);
                }
            };
        }
        medalV2Request.getMedalEntranceV4(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceV4$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceV4$lambda$9(Function1 success, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        MedalEntrance medalEntrance = (MedalEntrance) it.getData();
        if (medalEntrance != null) {
            success.invoke2(medalEntrance);
        } else {
            success.invoke2(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMedalList$default(MedalV2Request medalV2Request, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: bif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getMedalList$lambda$4((ApiException) obj2);
                }
            };
        }
        medalV2Request.getMedalList(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalList$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalList$lambda$5(Function1 success, Function1 error, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        PopMedalList popMedalList = (PopMedalList) it.getData();
        if (popMedalList != null) {
            success.invoke2(popMedalList);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUserDetailMedalV2$default(MedalV2Request medalV2Request, MedalDetailInfo medalDetailInfo, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: eif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getUserDetailMedalV2$lambda$10((ApiException) obj2);
                }
            };
        }
        medalV2Request.getUserDetailMedalV2(medalDetailInfo, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserDetailMedalV2$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserDetailMedalV2$lambda$11(Function1 success, Function1 error, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        MedalDetail medalDetail = (MedalDetail) it.getData();
        if (medalDetail != null) {
            success.invoke2(medalDetail);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUserMedalWithoutNew$default(MedalV2Request medalV2Request, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: hif
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalV2Request.getUserMedalWithoutNew$lambda$0((ApiException) obj2);
                }
            };
        }
        medalV2Request.getUserMedalWithoutNew(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserMedalWithoutNew$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserMedalWithoutNew$lambda$1(Function1 success, Function1 error, MedalNewNetworkResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        ecf ecfVar = (ecf) it.getData();
        if (ecfVar != null) {
            success.invoke2(ecfVar);
            Logger.d(TAG, "getUserMedal success. data=" + ecfVar);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    public final void getAllMedals(@NotNull final Function1<? super ecf, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(error).success(new Function1() { // from class: fif
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getAllMedals$lambda$3(success, error, (MedalNewNetworkResult) obj);
            }
        });
    }

    public final void getMedalEntrance(@NotNull final Function1<? super MedalEntrance, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26022(null)).error(error).success(new Function1() { // from class: zhf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getMedalEntrance$lambda$7(success, error, (MedalNewNetworkResult) obj);
            }
        });
    }

    public final void getMedalEntranceV4(@NotNull final Function1<? super MedalEntrance, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26032(null)).error(error).success(new Function1() { // from class: gif
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getMedalEntranceV4$lambda$9(success, (MedalNewNetworkResult) obj);
            }
        });
    }

    public final void getMedalList(@NotNull final Function1<? super PopMedalList, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26042(null)).error(error).success(new Function1() { // from class: jif
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getMedalList$lambda$5(success, error, (MedalNewNetworkResult) obj);
            }
        });
    }

    public final void getUserDetailMedalV2(@NotNull MedalDetailInfo medalDetailInfo, @NotNull final Function1<? super MedalDetail, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(medalDetailInfo, "medalDetailInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26052(medalDetailInfo, null)).error(error).success(new Function1() { // from class: dif
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getUserDetailMedalV2$lambda$11(success, error, (MedalNewNetworkResult) obj);
            }
        });
    }

    public final void getUserMedalWithoutNew(@NotNull final Function1<? super ecf, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26062(null)).error(error).success(new Function1() { // from class: cif
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalV2Request.getUserMedalWithoutNew$lambda$1(success, error, (MedalNewNetworkResult) obj);
            }
        });
    }
}
