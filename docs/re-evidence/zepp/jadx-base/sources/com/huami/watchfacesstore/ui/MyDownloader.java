package com.huami.watchfacesstore.ui;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.listener.DownLoadListener;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.huami.watchfacesstore.api.HomeApi;
import com.huami.watchfacesstore.ext.KoinExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/watchfacesstore/ui/MyDownloader;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "startDownLoad", "", "a", "Ljava/lang/String;", XimalayaConst.DOWNLOAD_URL, "b", "savePath", "c", "tag", "Lcom/huami/watchfacesstore/api/HomeApi;", GoogleApiAvailabilityLight.a, "Lcom/huami/watchfacesstore/api/HomeApi;", "api", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyDownloader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String downloadUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String savePath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "WatchFaceDownloader";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HomeApi api = KoinExtKt.getHomeApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.MyDownloader$startDownLoad$1", f = "MyDownloader.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<ProducerScope<? super DownLoadState>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/http/listener/DownLoadListener;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0684a extends Lambda implements Function1<DownLoadListener, Unit> {
            public final /* synthetic */ ProducerScope<DownLoadState> a;
            public final /* synthetic */ MyDownloader b;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0685a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ ProducerScope<DownLoadState> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0685a(ProducerScope<? super DownLoadState> producerScope) {
                    super(0);
                    this.a = producerScope;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ChannelsKt.sendBlocking(this.a, DownLoadState.START.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<Integer, Unit> {
                public final /* synthetic */ ProducerScope<DownLoadState> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(ProducerScope<? super DownLoadState> producerScope) {
                    super(1);
                    this.a = producerScope;
                }

                public final void a(int i) {
                    ChannelsKt.sendBlocking(this.a, new DownLoadState.PROGRESS(i));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    a(num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function1<String, Unit> {
                public final /* synthetic */ ProducerScope<DownLoadState> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(ProducerScope<? super DownLoadState> producerScope) {
                    super(1);
                    this.a = producerScope;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable String str) {
                    if (str == null) {
                        return;
                    }
                    ChannelsKt.sendBlocking(this.a, DownLoadState.SUCCESS.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function1<Throwable, Unit> {
                public final /* synthetic */ ProducerScope<DownLoadState> a;
                public final /* synthetic */ MyDownloader b;

                /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$a$d$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0686a extends Lambda implements Function0<String> {
                    public final /* synthetic */ MyDownloader a;
                    public final /* synthetic */ Throwable b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0686a(MyDownloader myDownloader, Throwable th) {
                        super(0);
                        this.a = myDownloader;
                        this.b = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "download url =" + this.a.downloadUrl + " and errorMsg: " + Log.getStackTraceString(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public d(ProducerScope<? super DownLoadState> producerScope, MyDownloader myDownloader) {
                    super(1);
                    this.a = producerScope;
                    this.b = myDownloader;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    HMLog.info(WFConstant.WF_TAG, new C0686a(this.b, th));
                    ChannelsKt.sendBlocking(this.a, DownLoadState.FAIL.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0684a(ProducerScope<? super DownLoadState> producerScope, MyDownloader myDownloader) {
                super(1);
                this.a = producerScope;
                this.b = myDownloader;
            }

            public final void a(@NotNull DownLoadListener downLoadListener) {
                downLoadListener.onStarted(new C0685a(this.a));
                downLoadListener.onProgress(new b(this.a));
                downLoadListener.onCompleted(new c(this.a));
                downLoadListener.onFailed(new d(this.a, this.b));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DownLoadListener downLoadListener) {
                a(downLoadListener);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ MyDownloader a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.MyDownloader$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0687a extends Lambda implements Function0<String> {
                public static final C0687a a = new C0687a();

                public C0687a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "awaitClose";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MyDownloader myDownloader) {
                super(0);
                this.a = myDownloader;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HMLog.debug(this.a.tag, C0687a.a);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = MyDownloader.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super DownLoadState> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.b;
                HttpKitKtxKt.downloadFile(MyDownloader.this.api, MyDownloader.this.downloadUrl, MyDownloader.this.savePath, new C0684a(producerScope, MyDownloader.this));
                b bVar = new b(MyDownloader.this);
                this.a = 1;
                if (ProduceKt.awaitClose(producerScope, bVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.MyDownloader$startDownLoad$2", f = "MyDownloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<FlowCollector<? super DownLoadState>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

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
                return "download went wrong: " + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super DownLoadState> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            b bVar = MyDownloader.this.new b(continuation);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.error$default(MyDownloader.this.tag, null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    public MyDownloader(@NotNull String str, @NotNull String str2) {
        this.downloadUrl = str;
        this.savePath = str2;
    }

    @NotNull
    public final Flow<DownLoadState> startDownLoad() {
        return FlowKt.m4456catch(FlowKt.callbackFlow(new a(null)), new b(null));
    }
}
