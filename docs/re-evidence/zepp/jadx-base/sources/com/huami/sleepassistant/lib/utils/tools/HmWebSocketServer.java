package com.huami.sleepassistant.lib.utils.tools;

import com.huami.tools.analytics.EventConst;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import java.net.InetSocketAddress;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/tools/HmWebSocketServer;", "Lorg/java_websocket/server/WebSocketServer;", "Lorg/java_websocket/WebSocket;", "conn", "", "message", "", "w", "(Lorg/java_websocket/WebSocket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/java_websocket/handshake/ClientHandshake;", "handshake", "onOpen", "", "code", "reason", "", "remote", "onClose", "onMessage", "onStart", "Ljava/lang/Exception;", EventConst.c, "onError", "Ljava/net/InetSocketAddress;", "ip", "<init>", "(Ljava/net/InetSocketAddress;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HmWebSocketServer extends WebSocketServer {

    @NotNull
    public static final String tag = "SocketServer";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WebSocket a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebSocket webSocket) {
            super(0);
            this.a = webSocket;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return StringUtil.SPACE + ((Object) this.a.getRemoteSocketAddress().getHostString()) + " --> closed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.utils.tools.HmWebSocketServer$onMessage$1", f = "ToolWebSocketServer.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WebSocket c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WebSocket webSocket, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = webSocket;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HmWebSocketServer.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HmWebSocketServer hmWebSocketServer = HmWebSocketServer.this;
                WebSocket webSocket = this.c;
                String str = this.d;
                this.a = 1;
                if (hmWebSocketServer.w(webSocket, str, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ClientHandshake a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ClientHandshake clientHandshake) {
            super(0);
            this.a = clientHandshake;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            ClientHandshake clientHandshake = this.a;
            return Intrinsics.stringPlus("open a client: ", clientHandshake == null ? null : clientHandshake.getContent());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.utils.tools.HmWebSocketServer$onReceiveMessage$2", f = "ToolWebSocketServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WebSocket b;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ WebSocket a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WebSocket webSocket, String str) {
                super(0);
                this.a = webSocket;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "msg: " + ((Object) this.a.getRemoteSocketAddress().getHostString()) + " --> message: [" + ((Object) this.b) + JsonLexerKt.END_LIST;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebSocket webSocket, String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = webSocket;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.debug(HmWebSocketServer.tag, new a(this.b, this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "server is tart ------> ";
        }
    }

    public HmWebSocketServer(@NotNull InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(WebSocket webSocket, String str, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new e(webSocket, str, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // org.java_websocket.server.WebSocketServer
    public void onClose(@NotNull WebSocket conn, int code, @Nullable String reason, boolean remote) {
        ToolWebSocketServer.INSTANCE.closeClient(conn, code);
        HMLog.debug(tag, new a(conn));
    }

    @Override // org.java_websocket.server.WebSocketServer
    public void onError(@Nullable WebSocket conn, @Nullable Exception ex) {
        HMLog.error$default(tag, null, ex, b.a, 2, null);
    }

    @Override // org.java_websocket.server.WebSocketServer
    public void onMessage(@NotNull WebSocket conn, @Nullable String message) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new c(conn, message, null), 3, null);
    }

    @Override // org.java_websocket.server.WebSocketServer
    public void onOpen(@Nullable WebSocket conn, @Nullable ClientHandshake handshake) {
        if (conn != null) {
            conn.isOpen();
            ToolWebSocketServer.INSTANCE.addClient(conn);
        }
        HMLog.debug(tag, new d(handshake));
    }

    @Override // org.java_websocket.server.WebSocketServer
    public void onStart() {
        HMLog.debug(tag, f.a);
    }
}
