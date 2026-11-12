package com.huami.third.wechat.ui;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.third.wechat.UtilKt;
import com.huami.third.wechat.api.DataSourceApi;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR!\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/huami/third/wechat/ui/WeChatBindViewModel;", "Landroidx/lifecycle/ViewModel;", "", "size", "", "loadQR", "Lcom/huami/third/wechat/api/DataSourceApi;", "a", "Lcom/huami/third/wechat/api/DataSourceApi;", "dataSourceApi", "Landroidx/lifecycle/MutableLiveData;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getQrContentLiveData", "()Landroidx/lifecycle/MutableLiveData;", "qrContentLiveData", "Landroid/graphics/Bitmap;", "c", "getQrBitmapLiveData", "qrBitmapLiveData", "<init>", "(Lcom/huami/third/wechat/api/DataSourceApi;)V", "Companion", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBindViewModel extends ViewModel {

    @NotNull
    private static final String d = "WeChatBindViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DataSourceApi dataSourceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> qrContentLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Bitmap> qrBitmapLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadQR-获取绑定二维码";
        }
    }

    /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2", f = "WeChatBindViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$1", f = "WeChatBindViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ WeChatBindViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WeChatBindViewModel weChatBindViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = weChatBindViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super String> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.b;
                    String qRContent = this.c.dataSourceApi.getQRContent();
                    this.a = 1;
                    if (flowCollector.emit(qRContent, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$2", f = "WeChatBindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ WeChatBindViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WeChatBindViewModel weChatBindViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = weChatBindViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable String str, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.c, continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.getQrContentLiveData().setValue((String) this.b);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Landroid/graphics/Bitmap;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$4", f = "WeChatBindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function3<FlowCollector<? super Bitmap>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ WeChatBindViewModel c;

            /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$c$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.getMessage();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WeChatBindViewModel weChatBindViewModel, Continuation<? super c> continuation) {
                super(3, continuation);
                this.c = weChatBindViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super Bitmap> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                c cVar = new c(this.c, continuation);
                cVar.b = th;
                return cVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.b;
                HMLog.error$default(WeChatBindViewModel.d, null, th, new a(th), 2, null);
                this.c.getQrBitmapLiveData().setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeChatBindViewModel.this.new AnonymousClass2(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFlowOn = FlowKt.flowOn(FlowKt.onEach(FlowKt.flowOn(FlowKt.flow(new a(WeChatBindViewModel.this, null)), Dispatchers.getIO()), new b(WeChatBindViewModel.this, null)), Dispatchers.getMain());
                final int i2 = this.c;
                Flow flowM4456catch = FlowKt.m4456catch(FlowKt.flowOn(new Flow<Bitmap>() { // from class: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass2 implements FlowCollector<String> {
                        public final /* synthetic */ FlowCollector a;
                        public final /* synthetic */ WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1 b;

                        /* JADX INFO: renamed from: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1$2", f = "WeChatBindViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                        public AnonymousClass2(FlowCollector flowCollector, WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1 weChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1) {
                            this.a = flowCollector;
                            this.b = weChatBindViewModel$loadQR$2$invokeSuspend$$inlined$map$1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(String str, @NotNull Continuation continuation) {
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
                                String str2 = str;
                                if (str2 == null || str2.length() == 0) {
                                    throw new RuntimeException("微信二维码内容为空");
                                }
                                Bitmap bitmapCreateQR = UtilKt.createQR(str2, i2);
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(bitmapCreateQR, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(@NotNull FlowCollector<? super Bitmap> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowFlowOn.collect(new AnonymousClass2(flowCollector, this), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, Dispatchers.getIO()), new c(WeChatBindViewModel.this, null));
                final WeChatBindViewModel weChatBindViewModel = WeChatBindViewModel.this;
                FlowCollector<Bitmap> flowCollector = new FlowCollector<Bitmap>() { // from class: com.huami.third.wechat.ui.WeChatBindViewModel$loadQR$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Bitmap bitmap, @NotNull Continuation continuation) {
                        weChatBindViewModel.getQrBitmapLiveData().setValue(bitmap);
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
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

    public WeChatBindViewModel(@NotNull DataSourceApi dataSourceApi) {
        this.dataSourceApi = dataSourceApi;
    }

    @NotNull
    public final MutableLiveData<Bitmap> getQrBitmapLiveData() {
        return this.qrBitmapLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getQrContentLiveData() {
        return this.qrContentLiveData;
    }

    @ExperimentalCoroutinesApi
    public final void loadQR(int size) {
        HMLog.info(d, a.a);
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(size, null), 3, null);
    }
}
