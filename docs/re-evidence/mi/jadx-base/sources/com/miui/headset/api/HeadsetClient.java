package com.miui.headset.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.miui.headset.api.HeadsetClient;
import com.xiaomi.fitness.common.utils.FusionLocationRequest;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u000b*\u0005EHNQT\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001]B)\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010Z\u001a\u00020\u0011¢\u0006\u0004\b[\u0010\\J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006^"}, d2 = {"Lcom/miui/headset/api/HeadsetClient;", "Lcom/miui/headset/api/BinderReference;", "Lcom/miui/headset/api/c;", "Lcom/miui/headset/api/IHeadset;", "", "performOnBinderConnected", "()V", "Lkotlin/Function0;", "after", "performBeforeBinderDisconnect", "(Lkotlin/jvm/functions/Function0;)V", "onBinderConnected", "onBinderDied", "initialize", "release", "startDiscovery", "stopDiscovery", "", "fromHostId", "toHostId", "", "circulateStart", "(Ljava/lang/String;Ljava/lang/String;)I", "circulateEnd", "Lcom/miui/headset/api/Profile;", "getProfile", "()Lcom/miui/headset/api/Profile;", "Lcom/miui/headset/api/Query;", "getQuery", "()Lcom/miui/headset/api/Query;", "initService", "unInitService", "Landroid/content/Intent;", "makeIntent", "()Landroid/content/Intent;", "Landroid/os/IBinder;", "service", "createProxy", "(Landroid/os/IBinder;)Lcom/miui/headset/api/c;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/miui/headset/api/HeadsetServiceListener;", "headsetServiceListener", "Lcom/miui/headset/api/HeadsetServiceListener;", "Lcom/miui/headset/api/HeadsetHostListener;", "headsetHostListener", "Lcom/miui/headset/api/HeadsetHostListener;", "", "initialized", "Z", "runtimeVersionCode", "I", "caller", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "initializeInvokeCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "discoveryInvokeCount", "Ljava/util/concurrent/atomic/AtomicLong;", "requestIds", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroid/os/HandlerThread;", "clientSynchronizedThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "synchronizedExecutor", "Landroid/os/Handler;", "mainHandler", "com/miui/headset/api/HeadsetClient$headsetServiceListenerWrapper$1", "headsetServiceListenerWrapper", "Lcom/miui/headset/api/HeadsetClient$headsetServiceListenerWrapper$1;", "com/miui/headset/api/HeadsetClient$headHostListenerAdapter$1", "headHostListenerAdapter", "Lcom/miui/headset/api/HeadsetClient$headHostListenerAdapter$1;", "Lcom/miui/headset/api/BinderRequestTracker;", "requestTracker", "Lcom/miui/headset/api/BinderRequestTracker;", "com/miui/headset/api/HeadsetClient$headsetClientController$1", "headsetClientController", "Lcom/miui/headset/api/HeadsetClient$headsetClientController$1;", "com/miui/headset/api/HeadsetClient$profileProxyAdapter$1", "profileProxyAdapter", "Lcom/miui/headset/api/HeadsetClient$profileProxyAdapter$1;", "com/miui/headset/api/HeadsetClient$queryProxyAdapter$1", "queryProxyAdapter", "Lcom/miui/headset/api/HeadsetClient$queryProxyAdapter$1;", "getTag", "()Ljava/lang/String;", "tag", "callerAlias", "<init>", "(Landroid/content/Context;Lcom/miui/headset/api/HeadsetServiceListener;Lcom/miui/headset/api/HeadsetHostListener;Ljava/lang/String;)V", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeadsetClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/HeadsetClient\n+ 2 Kit.kt\ncom/miui/headset/api/KitKt\n*L\n1#1,578:1\n24#2:579\n49#2:580\n33#2:581\n27#2:582\n50#2:583\n49#2:584\n33#2:585\n27#2:586\n50#2:587\n49#2:588\n33#2:589\n27#2:590\n50#2:591\n57#2:592\n33#2:593\n27#2:594\n58#2:595\n49#2:596\n33#2:597\n27#2:598\n50#2:599\n57#2:600\n33#2:601\n27#2:602\n58#2:603\n57#2:604\n33#2:605\n27#2:606\n58#2:607\n57#2:608\n33#2:609\n27#2:610\n58#2:611\n49#2:612\n33#2:613\n27#2:614\n50#2:615\n57#2:616\n33#2:617\n27#2:618\n58#2:619\n57#2:620\n33#2:621\n27#2:622\n58#2:623\n64#2:624\n62#2,2:625\n49#2:627\n33#2:628\n27#2:629\n50#2:630\n65#2:631\n57#2:632\n33#2:633\n27#2:634\n58#2,11:635\n57#2:646\n33#2:647\n27#2:648\n58#2:649\n57#2:650\n33#2:651\n27#2:652\n58#2:653\n64#2:654\n62#2,2:655\n49#2:657\n33#2:658\n27#2:659\n50#2:660\n65#2:661\n57#2:662\n33#2:663\n27#2:664\n58#2,11:665\n57#2:676\n33#2:677\n27#2:678\n58#2:679\n57#2:680\n33#2:681\n27#2:682\n58#2:683\n64#2:684\n62#2,4:685\n57#2:689\n33#2:690\n27#2:691\n58#2,11:692\n64#2:703\n62#2,4:704\n57#2:708\n33#2:709\n27#2:710\n58#2,11:711\n*S KotlinDebug\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/HeadsetClient\n*L\n80#1:579\n428#1:580\n428#1:581\n428#1:582\n428#1:583\n429#1:584\n429#1:585\n429#1:586\n429#1:587\n438#1:588\n438#1:589\n438#1:590\n438#1:591\n453#1:592\n453#1:593\n453#1:594\n453#1:595\n456#1:596\n456#1:597\n456#1:598\n456#1:599\n472#1:600\n472#1:601\n472#1:602\n472#1:603\n476#1:604\n476#1:605\n476#1:606\n476#1:607\n482#1:608\n482#1:609\n482#1:610\n482#1:611\n487#1:612\n487#1:613\n487#1:614\n487#1:615\n502#1:616\n502#1:617\n502#1:618\n502#1:619\n506#1:620\n506#1:621\n506#1:622\n506#1:623\n510#1:624\n510#1:625,2\n512#1:627\n512#1:628\n512#1:629\n512#1:630\n510#1:631\n510#1:632\n510#1:633\n510#1:634\n510#1:635,11\n525#1:646\n525#1:647\n525#1:648\n525#1:649\n529#1:650\n529#1:651\n529#1:652\n529#1:653\n533#1:654\n533#1:655,2\n535#1:657\n535#1:658\n535#1:659\n535#1:660\n533#1:661\n533#1:662\n533#1:663\n533#1:664\n533#1:665,11\n404#1:676\n404#1:677\n404#1:678\n404#1:679\n418#1:680\n418#1:681\n418#1:682\n418#1:683\n461#1:684\n461#1:685,4\n461#1:689\n461#1:690\n461#1:691\n461#1:692,11\n492#1:703\n492#1:704,4\n492#1:708\n492#1:709\n492#1:710\n492#1:711,11\n*E\n"})
public final class HeadsetClient extends BinderReference<c> implements IHeadset {
    private static final long COMMON_REQUEST_TIME_OUT = 8000;
    private static final long CONNECT_REQUEST_TIME_OUT = 30000;

    @NotNull
    private final String caller;

    @NotNull
    private final HandlerThread clientSynchronizedThread;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicInteger discoveryInvokeCount;

    @NotNull
    private final HeadsetClient$headHostListenerAdapter$1 headHostListenerAdapter;

    @NotNull
    private final HeadsetClient$headsetClientController$1 headsetClientController;

    @NotNull
    private final HeadsetHostListener headsetHostListener;

    @NotNull
    private final HeadsetServiceListener headsetServiceListener;

    @NotNull
    private final HeadsetClient$headsetServiceListenerWrapper$1 headsetServiceListenerWrapper;

    @NotNull
    private final AtomicInteger initializeInvokeCount;
    private volatile boolean initialized;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final HeadsetClient$profileProxyAdapter$1 profileProxyAdapter;

    @NotNull
    private final HeadsetClient$queryProxyAdapter$1 queryProxyAdapter;

    @NotNull
    private final AtomicLong requestIds;

    @NotNull
    private final BinderRequestTracker requestTracker;
    private volatile int runtimeVersionCode;

    @NotNull
    private final Handler synchronizedExecutor;

    public /* synthetic */ HeadsetClient(Context context, HeadsetServiceListener headsetServiceListener, HeadsetHostListener headsetHostListener, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, headsetServiceListener, headsetHostListener, (i & 8) != 0 ? "" : str);
    }

    private final void performBeforeBinderDisconnect(final Function0<Unit> after) {
        if (this.initialized) {
            this.synchronizedExecutor.postDelayed(new Runnable() { // from class: mmb
                @Override // java.lang.Runnable
                public final void run() {
                    HeadsetClient.performBeforeBinderDisconnect$lambda$7(this.f26998a, after);
                }
            }, 5L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performBeforeBinderDisconnect$lambda$7(HeadsetClient this$0, Function0 after) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(after, "$after");
        try {
            try {
                c proxy = this$0.getProxy();
                if (proxy != null) {
                    proxy.E2(this$0.caller);
                }
            } catch (Exception e) {
                String tag = this$0.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb.append(tag);
                sb.append(' ');
                sb.append((Object) ("performBeforeBinderDisconnect " + e));
                e.printStackTrace();
            }
        } finally {
            after.invoke();
        }
    }

    private final void performOnBinderConnected() {
        this.synchronizedExecutor.post(new Runnable() { // from class: kmb
            @Override // java.lang.Runnable
            public final void run() {
                HeadsetClient.performOnBinderConnected$lambda$4(this.f23982a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performOnBinderConnected$lambda$4(final HeadsetClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            c proxy = this$0.getProxy();
            if (proxy != null) {
                this$0.runtimeVersionCode = proxy.g3(this$0.caller, this$0.headsetClientController, this$0.headHostListenerAdapter);
                this$0.initialized = true;
                this$0.mainHandler.post(new Runnable() { // from class: jmb
                    @Override // java.lang.Runnable
                    public final void run() {
                        HeadsetClient.performOnBinderConnected$lambda$4$lambda$2$lambda$1(this.f22922a);
                    }
                });
            }
        } catch (Exception e) {
            String tag = this$0.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) ("performOnBinderConnected " + e));
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performOnBinderConnected$lambda$4$lambda$2$lambda$1(HeadsetClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.headsetServiceListenerWrapper.onHeadsetServiceInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDiscovery$lambda$15(HeadsetClient this$0) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.Companion;
            c proxy = this$0.getProxy();
            if (proxy != null) {
                proxy.v(this$0.caller);
            }
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append("startDiscovery");
            sb.append(' ');
            sb.append((Object) thM889exceptionOrNullimpl.toString());
            thM889exceptionOrNullimpl.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopDiscovery$lambda$22(HeadsetClient this$0) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.Companion;
            c proxy = this$0.getProxy();
            if (proxy != null) {
                proxy.c5(this$0.caller);
            }
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append("stopDiscovery");
            sb.append(' ');
            sb.append((Object) thM889exceptionOrNullimpl.toString());
            thM889exceptionOrNullimpl.printStackTrace();
        }
    }

    @Override // com.miui.headset.api.IHeadset
    public int circulateEnd(@NotNull String fromHostId, @NotNull String toHostId) {
        Intrinsics.checkNotNullParameter(fromHostId, "fromHostId");
        Intrinsics.checkNotNullParameter(toHostId, "toHostId");
        if (!this.initialized) {
            String tag = getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) "circulateEnd return");
            return 213;
        }
        if (this.runtimeVersionCode < 200000) {
            String tag2 = getTag();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb2.append(tag2);
            sb2.append(' ');
            sb2.append((Object) "circulateEnd proceed runtimeVersionCode less 200000");
            return 100;
        }
        c proxy = getProxy();
        if (proxy != null) {
            try {
                Result.Companion companion = Result.Companion;
                long jIncrementAndGet = this.requestIds.incrementAndGet();
                String tag3 = getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag3);
                sb3.append(' ');
                sb3.append((Object) ("circulateEnd requestId= " + jIncrementAndGet + ", fromHostId= " + fromHostId + ", toHostId= " + toHostId));
                proxy.B4(jIncrementAndGet, this.caller, fromHostId, toHostId);
                return RequestSync.DefaultImpls.blockInvoke$default(this.requestTracker.obtainRequest(jIncrementAndGet), String.valueOf(jIncrementAndGet), 8000L, 0, 4, null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                if (thM889exceptionOrNullimpl != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb4.append("circulateEnd");
                    sb4.append(' ');
                    sb4.append((Object) thM889exceptionOrNullimpl.toString());
                    thM889exceptionOrNullimpl.printStackTrace();
                }
            }
        }
        return 213;
    }

    @Override // com.miui.headset.api.IHeadset
    public int circulateStart(@NotNull String fromHostId, @NotNull String toHostId) {
        Intrinsics.checkNotNullParameter(fromHostId, "fromHostId");
        Intrinsics.checkNotNullParameter(toHostId, "toHostId");
        if (!this.initialized) {
            String tag = getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) "circulateStart return");
            return 213;
        }
        if (this.runtimeVersionCode < 200000) {
            String tag2 = getTag();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb2.append(tag2);
            sb2.append(' ');
            sb2.append((Object) "circulateStart proceed runtimeVersionCode less 200000");
            return 100;
        }
        c proxy = getProxy();
        if (proxy != null) {
            try {
                Result.Companion companion = Result.Companion;
                long jIncrementAndGet = this.requestIds.incrementAndGet();
                String tag3 = getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag3);
                sb3.append(' ');
                sb3.append((Object) ("circulateStart requestId= " + jIncrementAndGet + ", fromHostId= " + fromHostId + ", toHostId= " + toHostId));
                proxy.k0(jIncrementAndGet, this.caller, fromHostId, toHostId);
                return this.requestTracker.obtainRequest(jIncrementAndGet).blockInvoke(String.valueOf(jIncrementAndGet), 8000L, 20223);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                if (thM889exceptionOrNullimpl != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb4.append("circulateStart");
                    sb4.append(' ');
                    sb4.append((Object) thM889exceptionOrNullimpl.toString());
                    thM889exceptionOrNullimpl.printStackTrace();
                }
            }
        }
        return 213;
    }

    @Override // com.miui.headset.api.IHeadset
    @NotNull
    public Profile getProfile() {
        return this.profileProxyAdapter;
    }

    @Override // com.miui.headset.api.IHeadset
    @NotNull
    public Query getQuery() {
        return this.queryProxyAdapter;
    }

    @Override // com.miui.headset.api.BinderReference
    @NotNull
    public String getTag() {
        StringBuilder sb = new StringBuilder();
        String simpleName = HeadsetClient.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('-');
        sb.append(StringsKt__StringsKt.substringAfterLast$default(this.caller, ".", (String) null, 2, (Object) null));
        sb.append('-');
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // com.miui.headset.api.IHeadset
    public void initService() throws RemoteException {
        c proxy = getProxy();
        if (proxy != null) {
            proxy.y1();
        }
    }

    @Override // com.miui.headset.api.IHeadset
    public synchronized void initialize() {
        String tag = getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) "client initialize================2.0.28-SNAPSHOT-If14b2ce================");
        String tag2 = getTag();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb2.append(tag2);
        sb2.append(' ');
        sb2.append((Object) ("initialize caller= " + this.caller + ", i_count= " + this.initializeInvokeCount.incrementAndGet()));
        connectService(this.context);
    }

    @Override // com.miui.headset.api.BinderReference
    @NotNull
    public Intent makeIntent() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.milink.service", "com.miui.headset.runtime.HeadsetLocalService"));
        intent.putExtra("caller", this.caller);
        return intent;
    }

    @Override // com.miui.headset.api.BinderReference
    public void onBinderConnected() {
        super.onBinderConnected();
        performOnBinderConnected();
    }

    @Override // com.miui.headset.api.BinderReference
    public void onBinderDied() {
        super.onBinderDied();
        disconnectService(this.context);
        this.runtimeVersionCode = 100;
        this.initialized = false;
        this.headsetServiceListenerWrapper.onHeadsetServiceDied();
    }

    @Override // com.miui.headset.api.IHeadset
    public synchronized void release() {
        String tag = getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) ("release caller= " + this.caller + ", initialized= " + this.initialized + ", i_count= " + this.initializeInvokeCount.getAndDecrement()));
        performBeforeBinderDisconnect(new Function0<Unit>() { // from class: com.miui.headset.api.HeadsetClient.release.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HeadsetClient headsetClient = HeadsetClient.this;
                headsetClient.disconnectService(headsetClient.context);
                HeadsetClient.this.runtimeVersionCode = 100;
                HeadsetClient.this.initialized = false;
                HeadsetClient.this.clientSynchronizedThread.quitSafely();
            }
        });
    }

    @Override // com.miui.headset.api.IHeadset
    public synchronized void startDiscovery() {
        if (!this.initialized) {
            String tag = getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) "startDiscovery return");
            return;
        }
        String tag2 = getTag();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb2.append(tag2);
        sb2.append(' ');
        sb2.append((Object) ("startDiscovery caller= " + this.caller + ", d_count= " + this.discoveryInvokeCount.incrementAndGet()));
        this.synchronizedExecutor.post(new Runnable() { // from class: lmb
            @Override // java.lang.Runnable
            public final void run() {
                HeadsetClient.startDiscovery$lambda$15(this.f25217a);
            }
        });
    }

    @Override // com.miui.headset.api.IHeadset
    public synchronized void stopDiscovery() {
        if (!this.initialized) {
            String tag = getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) "stopDiscovery return");
            return;
        }
        if (this.discoveryInvokeCount.get() == 0) {
            String tag2 = getTag();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb2.append(tag2);
            sb2.append(' ');
            sb2.append((Object) ("stopDiscovery ignore, caller= " + this.caller + " never startDiscovery"));
            return;
        }
        AtomicInteger atomicInteger = this.discoveryInvokeCount;
        if (!atomicInteger.compareAndSet(atomicInteger.get(), 0)) {
            String tag3 = getTag();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb3.append(tag3);
            sb3.append(' ');
            sb3.append((Object) "stopDiscovery failed, compareAndSet failed");
            return;
        }
        String tag4 = getTag();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb4.append(tag4);
        sb4.append(' ');
        sb4.append((Object) ("stopDiscovery caller= " + this.caller + ", d_count= " + this.discoveryInvokeCount.get()));
        this.synchronizedExecutor.post(new Runnable() { // from class: nmb
            @Override // java.lang.Runnable
            public final void run() {
                HeadsetClient.stopDiscovery$lambda$22(this.f28068a);
            }
        });
    }

    @Override // com.miui.headset.api.IHeadset
    public void unInitService() {
    }

    @Override // com.miui.headset.api.BinderReference
    @NotNull
    public c createProxy(@NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(service, "service");
        c cVarS2 = c.a.s2(service);
        Intrinsics.checkNotNullExpressionValue(cVarS2, "asInterface(service)");
        return cVarS2;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.miui.headset.api.HeadsetClient$headHostListenerAdapter$1] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.miui.headset.api.HeadsetClient$headsetClientController$1] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.miui.headset.api.HeadsetClient$profileProxyAdapter$1] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.miui.headset.api.HeadsetClient$queryProxyAdapter$1] */
    public HeadsetClient(@NotNull Context context, @NotNull HeadsetServiceListener headsetServiceListener, @NotNull HeadsetHostListener headsetHostListener, @NotNull String callerAlias) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headsetServiceListener, "headsetServiceListener");
        Intrinsics.checkNotNullParameter(headsetHostListener, "headsetHostListener");
        Intrinsics.checkNotNullParameter(callerAlias, "callerAlias");
        this.context = context;
        this.headsetServiceListener = headsetServiceListener;
        this.headsetHostListener = headsetHostListener;
        this.runtimeVersionCode = 100;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        if (!StringsKt__StringsKt.isBlank(callerAlias)) {
            str = '-' + callerAlias;
        } else {
            str = "";
        }
        sb.append(str);
        this.caller = sb.toString();
        this.initializeInvokeCount = new AtomicInteger();
        this.discoveryInvokeCount = new AtomicInteger();
        this.requestIds = new AtomicLong();
        HandlerThread handlerThread = new HandlerThread("client-synchronized-executor");
        this.clientSynchronizedThread = handlerThread;
        handlerThread.start();
        this.synchronizedExecutor = new Handler(handlerThread.getLooper());
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.headsetServiceListenerWrapper = new HeadsetClient$headsetServiceListenerWrapper$1(this);
        this.headHostListenerAdapter = new b.a() { // from class: com.miui.headset.api.HeadsetClient$headHostListenerAdapter$1
            @Override // com.miui.headset.api.b
            public void onHeadsetHostLost(@Nullable String hostId) {
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                sb2.append((Object) ("onHeadsetHostLost hostId= " + hostId));
                if (hostId != null) {
                    this.this$0.headsetHostListener.onHeadsetHostLost(hostId);
                }
            }

            @Override // com.miui.headset.api.b
            public void onHeadsetHostUpdate(int headsetUpdateType, @Nullable HeadsetHost headsetHost) {
                String str2;
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onHeadsetHostUpdate type= ");
                switch (headsetUpdateType) {
                    case 1:
                        str2 = "HostFound";
                        break;
                    case 2:
                        str2 = "ActiveHeadsetChange";
                        break;
                    case 3:
                        str2 = "ActiveHeadsetLost";
                        break;
                    case 4:
                        str2 = "HeadsetPropertyChanged";
                        break;
                    case 5:
                        str2 = "HeadsetNameChanged";
                        break;
                    case 6:
                        str2 = "HeadsetVolumeChanged";
                        break;
                    case 7:
                        str2 = "HeadsetBatteryChanged";
                        break;
                    case 8:
                        str2 = "HeadsetModeChanged";
                        break;
                    default:
                        str2 = "?(" + headsetUpdateType + ')';
                        break;
                }
                sb3.append(str2);
                sb3.append(", headHost= ");
                sb3.append(headsetHost);
                sb2.append((Object) sb3.toString());
                if (headsetHost != null) {
                    this.this$0.headsetHostListener.onHeadsetHostUpdate(headsetUpdateType, headsetHost);
                }
            }
        };
        this.requestTracker = new BinderRequestTracker();
        this.headsetClientController = new a.AbstractBinderC0322a() { // from class: com.miui.headset.api.HeadsetClient$headsetClientController$1
            @Override // com.miui.headset.api.a
            public void onReply(long requestId, @NotNull String caller, int result) {
                String str2;
                Intrinsics.checkNotNullParameter(caller, "caller");
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                sb2.append((Object) ("onReply requestId= " + requestId));
                RequestSync<Long> requestSyncObtainRequest = this.this$0.requestTracker.obtainRequest(requestId);
                HeadsetClient headsetClient = this.this$0;
                String tag2 = headsetClient.getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag2);
                sb3.append(' ');
                StringBuilder sb4 = new StringBuilder();
                sb4.append("signal requestId= ");
                sb4.append(requestId);
                sb4.append(", result= ");
                if (result == -4) {
                    str2 = "Break";
                } else if (result == -3) {
                    str2 = OrderStatus.CANCEL;
                } else if (result == -2) {
                    str2 = "Blocking";
                } else if (result == -1) {
                    str2 = "Default";
                } else if (result == 100) {
                    str2 = "Success";
                } else if (result == 230) {
                    str2 = "HeadsetNotSingleWorn";
                } else if (result == 310) {
                    str2 = "TvSoundBoxStyleOn";
                } else if (result == 501) {
                    str2 = "HeadsetBondStateChange";
                } else if (result == 20222) {
                    str2 = "RemoteCirculateStartTimeout";
                } else if (result != 20223) {
                    switch (result) {
                        case 201:
                            str2 = "Failed";
                            break;
                        case 202:
                            str2 = "Timeout";
                            break;
                        case 203:
                            str2 = "BluetoothUnEnable";
                            break;
                        case 204:
                            str2 = "NeedUpgrade";
                            break;
                        case 205:
                            str2 = "OpNotSupport";
                            break;
                        case 206:
                            str2 = "TargetNotMatch";
                            break;
                        case 207:
                            str2 = "HeadsetNotSupportAncMode";
                            break;
                        case 208:
                            str2 = "ValidAncMode";
                            break;
                        case 209:
                            str2 = "HeadsetNotWorn";
                            break;
                        case 210:
                            str2 = "HeadsetLeftWorn";
                            break;
                        case 211:
                            str2 = "HeadsetRightWorn";
                            break;
                        case 212:
                            str2 = "HeadsetWornError";
                            break;
                        case 213:
                            str2 = "IpcRemoteException";
                            break;
                        case 214:
                            str2 = "RpcRemoteException";
                            break;
                        case 215:
                            str2 = "HostNotBound";
                            break;
                        case 216:
                            str2 = "AcquiredByOtherHost";
                            break;
                        case 217:
                            str2 = "RemoteHostBluetoothUnEnable";
                            break;
                        case 218:
                            str2 = "LocalXiaomiAccountBlank";
                            break;
                        case 219:
                            str2 = "RemoteXiaomiAccountBlank";
                            break;
                        case 220:
                            str2 = "XiaomiAccountNotMatch";
                            break;
                        case 221:
                            str2 = "RemoteNeedUpgrade";
                            break;
                        default:
                            switch (result) {
                                case 301:
                                    str2 = "TargetHostIsActiveBySameAddress";
                                    break;
                                case 302:
                                    str2 = "TargetHeadsetNotBonded";
                                    break;
                                case 303:
                                    str2 = "TargetHostNotActive";
                                    break;
                                case 304:
                                    str2 = "RomNeedUpgrade";
                                    break;
                                case 305:
                                    str2 = "BondFailed";
                                    break;
                                case 306:
                                    str2 = "BondBonded";
                                    break;
                                case 307:
                                    str2 = "BondNone";
                                    break;
                                case 308:
                                    str2 = "TargetHeadsetManualBond";
                                    break;
                                default:
                                    switch (result) {
                                        case 401:
                                            str2 = "ActiveHeadsetChange";
                                            break;
                                        case 402:
                                            str2 = "ActiveHeadsetLost";
                                            break;
                                        case 403:
                                            str2 = "HeadsetPropertyUpdate";
                                            break;
                                        case 404:
                                            str2 = "HeadsetNameChanged";
                                            break;
                                        case 405:
                                            str2 = "HeadsetVolumeChanged";
                                            break;
                                        case 406:
                                            str2 = "HeadsetBatteryChanged";
                                            break;
                                        case 407:
                                            str2 = "HeadsetModeChanged";
                                            break;
                                        default:
                                            switch (result) {
                                                case 2010:
                                                    str2 = "SetActiveFailed";
                                                    break;
                                                case 2011:
                                                    str2 = "ActiveChangedFailed";
                                                    break;
                                                case 2012:
                                                    str2 = "UnInitFailed";
                                                    break;
                                                case 2013:
                                                    str2 = "ConnectFailed";
                                                    break;
                                                case 2014:
                                                    str2 = "DisconnectFailed";
                                                    break;
                                                default:
                                                    switch (result) {
                                                        case 20201:
                                                            str2 = "ProfileConnectTimeout";
                                                            break;
                                                        case 20202:
                                                            str2 = "RemoteConnectTimeout";
                                                            break;
                                                        case 20203:
                                                            str2 = "RequestConnectTimeout";
                                                            break;
                                                        default:
                                                            switch (result) {
                                                                case 20211:
                                                                    str2 = "ProfileDisconnectTimeout";
                                                                    break;
                                                                case 20212:
                                                                    str2 = "RemoteDisconnectTimeout";
                                                                    break;
                                                                case 20213:
                                                                    str2 = "RequestDisconnectTimeout";
                                                                    break;
                                                                default:
                                                                    str2 = "?(" + result + ')';
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    str2 = "RequestCirculateStartTimeout";
                }
                sb4.append(str2);
                sb3.append((Object) sb4.toString());
                requestSyncObtainRequest.signal(String.valueOf(requestId), result);
                headsetClient.requestTracker.remove(requestId);
            }

            @Override // com.miui.headset.api.a
            public void onReplyIsMmaHeadset(long requestId, @NotNull String caller, @Nullable Bundle ex) {
                Intrinsics.checkNotNullParameter(caller, "caller");
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                sb2.append((Object) ("onReplyIsMmaHeadset requestId= " + requestId));
                boolean z = ex != null ? ex.getBoolean("is_mma_headset") : false;
                RequestSync<Long> requestSyncObtainRequest = this.this$0.requestTracker.obtainRequest(requestId);
                HeadsetClient headsetClient = this.this$0;
                String tag2 = headsetClient.getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag2);
                sb3.append(' ');
                sb3.append((Object) ("signalObj requestId= " + requestId + ", isMmaHeadset= " + z));
                requestSyncObtainRequest.signalObj(String.valueOf(requestId), 100, Boolean.valueOf(z));
                headsetClient.requestTracker.remove(requestId);
            }

            @Override // com.miui.headset.api.a
            public void onReplyMultipointInfo(long requestId, @NotNull String caller, @Nullable Bundle ex) {
                Intrinsics.checkNotNullParameter(caller, "caller");
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                sb2.append((Object) ("onReplyMultipointInfo requestId= " + requestId));
                Object obj = ex != null ? ex.get("multipointInfo") : null;
                MultipointInfo multipointInfo = obj instanceof MultipointInfo ? (MultipointInfo) obj : null;
                RequestSync<Long> requestSyncObtainRequest = this.this$0.requestTracker.obtainRequest(requestId);
                HeadsetClient headsetClient = this.this$0;
                String tag2 = headsetClient.getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag2);
                sb3.append(' ');
                sb3.append((Object) ("signalObj requestId= " + requestId + ", multipointInfo= " + multipointInfo));
                requestSyncObtainRequest.signalObj(String.valueOf(requestId), 100, multipointInfo);
                headsetClient.requestTracker.remove(requestId);
            }

            @Override // com.miui.headset.api.a
            public void onReplySupportAncMode(long requestId, @NotNull String caller, @Nullable Bundle ex) {
                Intrinsics.checkNotNullParameter(caller, "caller");
                String tag = this.this$0.getTag();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append(tag);
                sb2.append(' ');
                sb2.append((Object) ("onReplySupportAncMode requestId= " + requestId));
                int i = ex != null ? ex.getInt("support_anc_mode") : 7;
                RequestSync<Long> requestSyncObtainRequest = this.this$0.requestTracker.obtainRequest(requestId);
                HeadsetClient headsetClient = this.this$0;
                String tag2 = headsetClient.getTag();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb3.append(tag2);
                sb3.append(' ');
                StringBuilder sb4 = new StringBuilder();
                sb4.append("signalObj requestId= ");
                sb4.append(requestId);
                sb4.append(", supportAncMode= ");
                String string = Integer.toString(i, CharsKt__CharJVMKt.checkRadix(2));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb4.append(string);
                sb3.append((Object) sb4.toString());
                requestSyncObtainRequest.signalObj(String.valueOf(requestId), 100, Integer.valueOf(i));
                headsetClient.requestTracker.remove(requestId);
            }
        };
        this.profileProxyAdapter = new Profile() { // from class: com.miui.headset.api.HeadsetClient$profileProxyAdapter$1
            @Override // com.miui.headset.api.Profile
            public int connect(@NotNull String hostId, @NotNull String address, @NotNull String deviceId) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "connect return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("connect requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", hostId= ");
                        sb4.append(hostId);
                        sb4.append(", address= ");
                        String hexString = Integer.toHexString(address.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(' ');
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getProfile().r1(jIncrementAndGet, headsetClient.caller, hostId, address, deviceId);
                        return requestSyncObtainRequest.blockInvoke(String.valueOf(jIncrementAndGet), 30000L, 20203);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("connect");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Profile
            public int disconnect(@NotNull String hostId, @NotNull String address, @NotNull String deviceId) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "disconnect return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("disconnect requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", hostId= ");
                        sb4.append(hostId);
                        sb4.append(", address= ");
                        String hexString = Integer.toHexString(address.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(' ');
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getProfile().j1(jIncrementAndGet, headsetClient.caller, hostId, address, deviceId);
                        return requestSyncObtainRequest.blockInvoke(String.valueOf(jIncrementAndGet), 30000L, 20213);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("disconnect");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Profile
            public int getHeadsetProperty(@NotNull String hostId, @NotNull String address, @NotNull String deviceId) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "getHeadsetProperty return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getHeadsetProperty requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", hostId= ");
                        sb4.append(hostId);
                        sb4.append(", address= ");
                        String hexString = Integer.toHexString(address.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(' ');
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getProfile().D2(jIncrementAndGet, headsetClient.caller, hostId, address, deviceId);
                        return RequestSync.DefaultImpls.blockInvoke$default(requestSyncObtainRequest, String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout, 0, 4, null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("getHeadsetProperty");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Profile
            public int updateHeadsetMode(@NotNull String hostId, @NotNull String address, @NotNull String deviceId, int opAncMode) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "updateHeadsetMode return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("updateHeadsetMode requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", hostId= ");
                        sb4.append(hostId);
                        sb4.append(", address= ");
                        String hexString = Integer.toHexString(address.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(' ');
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getProfile().u0(jIncrementAndGet, headsetClient.caller, hostId, address, deviceId, opAncMode);
                        return RequestSync.DefaultImpls.blockInvoke$default(requestSyncObtainRequest, String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout, 0, 4, null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("updateHeadsetMode");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Profile
            public int updateHeadsetVolume(@NotNull String hostId, @NotNull String address, @NotNull String deviceId, int volume) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "updateHeadsetVolume return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("updateHeadsetVolume requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", caller= ");
                        sb4.append(headsetClient.caller);
                        sb4.append(", hostId= ");
                        sb4.append(hostId);
                        sb4.append(", address= ");
                        String hexString = Integer.toHexString(address.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(' ');
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getProfile().N2(jIncrementAndGet, headsetClient.caller, hostId, address, deviceId, volume);
                        return RequestSync.DefaultImpls.blockInvoke$default(requestSyncObtainRequest, String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout, 0, 4, null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("updateHeadsetVolume");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }
        };
        this.queryProxyAdapter = new Query() { // from class: com.miui.headset.api.HeadsetClient$queryProxyAdapter$1
            @Override // com.miui.headset.api.Query
            public int getBondStateWithTargetHost(@NotNull String targetAddress, @NotNull String targetHostId) {
                Intrinsics.checkNotNullParameter(targetAddress, "targetAddress");
                Intrinsics.checkNotNullParameter(targetHostId, "targetHostId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "getBondStateWithTargetHost return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getBondStateWithTargetHost requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", targetAddress= ");
                        String hexString = Integer.toHexString(targetAddress.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(", targetHostId= ");
                        sb4.append(targetHostId);
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getQuery().J1(jIncrementAndGet, headsetClient.caller, targetAddress, targetHostId);
                        return RequestSync.DefaultImpls.blockInvoke$default(requestSyncObtainRequest, String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout, 0, 4, null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("getBondStateWithTargetHost");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Query
            @Nullable
            public MultipointInfo getMultipointInfo(@NotNull String hostId) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "getMultipointInfo return");
                    return null;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        sb3.append((Object) ("getMultipointInfo requestId= " + jIncrementAndGet + ", caller= " + headsetClient.caller + ", hostId= " + hostId));
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getQuery().v0(jIncrementAndGet, headsetClient.caller, hostId);
                        Object objBlockObjInvoke = requestSyncObtainRequest.blockObjInvoke(String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout);
                        if (objBlockObjInvoke instanceof MultipointInfo) {
                            return (MultipointInfo) objBlockObjInvoke;
                        }
                        return null;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb4.append("getMultipointInfo");
                            sb4.append(' ');
                            sb4.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return null;
            }

            @Override // com.miui.headset.api.Query
            public int getSupportAncMode(@NotNull String targetAddress, @NotNull String deviceId) {
                Intrinsics.checkNotNullParameter(targetAddress, "targetAddress");
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "getSupportAncMode return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getSupportAncMode requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", targetAddress= ");
                        String hexString = Integer.toHexString(targetAddress.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(", deviceId= ");
                        sb4.append(deviceId);
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getQuery().o2(jIncrementAndGet, headsetClient.caller, targetAddress, deviceId);
                        Object objBlockObjInvoke = requestSyncObtainRequest.blockObjInvoke(String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout);
                        Integer num = objBlockObjInvoke instanceof Integer ? (Integer) objBlockObjInvoke : null;
                        if (num != null) {
                            return num.intValue();
                        }
                        return 7;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("getSupportAncMode");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }

            @Override // com.miui.headset.api.Query
            public boolean isMmaHeadset(@NotNull String targetAddress, @NotNull String targetHostId) {
                Intrinsics.checkNotNullParameter(targetAddress, "targetAddress");
                Intrinsics.checkNotNullParameter(targetHostId, "targetHostId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "isMmaHeadset return");
                    return false;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("isMmaHeadset requestId= ");
                        sb4.append(jIncrementAndGet);
                        sb4.append(", targetAddress= ");
                        String hexString = Integer.toHexString(targetAddress.hashCode());
                        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
                        sb4.append(hexString);
                        sb4.append(", targetHostId= ");
                        sb4.append(targetHostId);
                        sb3.append((Object) sb4.toString());
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getQuery().K4(jIncrementAndGet, headsetClient.caller, targetAddress, targetHostId);
                        Object objBlockObjInvoke = requestSyncObtainRequest.blockObjInvoke(String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout);
                        Boolean bool = objBlockObjInvoke instanceof Boolean ? (Boolean) objBlockObjInvoke : null;
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb5.append("isMmaHeadset");
                            sb5.append(' ');
                            sb5.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return false;
            }

            @Override // com.miui.headset.api.Query
            public int switchToHeadsetActivity(@NotNull String hostId) {
                Intrinsics.checkNotNullParameter(hostId, "hostId");
                if (!this.this$0.initialized) {
                    String tag = this.this$0.getTag();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb2.append(tag);
                    sb2.append(' ');
                    sb2.append((Object) "switchToHeadsetActivity return");
                    return 213;
                }
                c proxy = this.this$0.getProxy();
                if (proxy != null) {
                    HeadsetClient headsetClient = this.this$0;
                    try {
                        Result.Companion companion = Result.Companion;
                        long jIncrementAndGet = headsetClient.requestIds.incrementAndGet();
                        String tag2 = headsetClient.getTag();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                        sb3.append(tag2);
                        sb3.append(' ');
                        sb3.append((Object) ("switchToHeadsetActivity requestId= " + jIncrementAndGet + ", caller= " + headsetClient.caller + ", hostId= " + hostId));
                        RequestSync<Long> requestSyncObtainRequest = headsetClient.requestTracker.obtainRequest(jIncrementAndGet);
                        proxy.getQuery().w0(jIncrementAndGet, headsetClient.caller, hostId);
                        return RequestSync.DefaultImpls.blockInvoke$default(requestSyncObtainRequest, String.valueOf(jIncrementAndGet), FusionLocationRequest.timeout, 0, 4, null);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(Result.m886constructorimpl(ResultKt.createFailure(th)));
                        if (thM889exceptionOrNullimpl != null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                            sb4.append("switchToHeadsetActivity");
                            sb4.append(' ');
                            sb4.append((Object) thM889exceptionOrNullimpl.toString());
                            thM889exceptionOrNullimpl.printStackTrace();
                        }
                    }
                }
                return 213;
            }
        };
    }
}
