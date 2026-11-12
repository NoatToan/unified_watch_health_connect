package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0014\u0018\u0000 O*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003OPQB\t\b\u0010¢\u0006\u0004\bJ\u0010KB\u0013\b\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bJ\u0010LB\u0011\b\u0012\u0012\u0006\u0010M\u001a\u00020\n¢\u0006\u0004\bJ\u0010NJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u0016\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0000J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00000\u0011J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014JJ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00000\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016J8\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\u0006\u0010\u0017\u001a\u00020\u0016J>\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0011J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016J8\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011J0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\u0006\u0010\u0017\u001a\u00020\u0016J>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0011J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00182\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u001d\u001a\u00020\nJ\u0017\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010$\u001a\u00020\n2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001e\u0010,\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00104\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010.R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010A\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0011\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0013\u0010B\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010D\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0013\u0010E\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0015\u0010\u001e\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001b\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"8F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006R"}, d2 = {"Lcom/facebook/bolts/Task;", "TResult", "", "", "a", "waitForCompletion", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "TOut", "cast", "Ljava/lang/Void;", "makeVoid", "Ljava/util/concurrent/Callable;", "predicate", "Lcom/facebook/bolts/Continuation;", "continuation", "continueWhile", "Lcom/facebook/bolts/CancellationToken;", UserDataStore.CITY, "Ljava/util/concurrent/Executor;", "executor", "TContinuationResult", "continueWith", "continueWithTask", "onSuccess", "onSuccessTask", "trySetCancelled", "result", "trySetResult", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "trySetError", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/locks/Condition;", "condition", "c", "Z", "completeField", GoogleApiAvailabilityLight.a, "cancelledField", "e", "Ljava/lang/Object;", "resultField", "f", "Ljava/lang/Exception;", "errorField", "g", "errorHasBeenObserved", "Lcom/facebook/bolts/UnobservedErrorNotifier;", "h", "Lcom/facebook/bolts/UnobservedErrorNotifier;", "unobservedErrorNotifier", "", "i", "Ljava/util/List;", "continuations", "isCompleted", "()Z", "isCancelled", "isFaulted", "getResult", "()Ljava/lang/Object;", "getError", "()Ljava/lang/Exception;", "<init>", "()V", "(Ljava/lang/Object;)V", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "(Z)V", "Companion", "TaskCompletionSource", "UnobservedExceptionHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Task<TResult> {

    @JvmField
    @NotNull
    public static final ExecutorService BACKGROUND_EXECUTOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Executor UI_THREAD_EXECUTOR;
    private static final Executor j;
    private static volatile UnobservedExceptionHandler k;
    private static final Task<?> l;
    private static final Task<Boolean> m;
    private static final Task<Boolean> n;
    private static final Task<?> o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Condition condition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean completeField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean cancelledField;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TResult resultField;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Exception errorField;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean errorHasBeenObserved;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List<Continuation<TResult, Void>> continuations;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>JV\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\\\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0007J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0007J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u0003H\u0007J\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\fH\u0007J1\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\"\u0010#J$\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$H\u0007J.\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J,\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$2\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$H\u0007J.\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010$2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\b\"\u0004\b\u0001\u0010\u00032\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0(H\u0007J$\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\b2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0(H\u0007J0\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010,0\b\"\u0004\b\u0001\u0010\u00032\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0(H\u0007J \u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0(H\u0007R\u0016\u00100\u001a\u00020/8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\u0006\u0012\u0002\b\u00030\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002060\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u00108\u001a\u0006\u0012\u0002\b\u00030\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002060\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0016\u0010:\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00103R\u0018\u0010;\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/facebook/bolts/Task$Companion;", "", "TContinuationResult", "TResult", "Lcom/facebook/bolts/TaskCompletionSource;", "tcs", "Lcom/facebook/bolts/Continuation;", "continuation", "Lcom/facebook/bolts/Task;", "task", "Ljava/util/concurrent/Executor;", "executor", "Lcom/facebook/bolts/CancellationToken;", UserDataStore.CITY, "", "b", "a", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "getUnobservedExceptionHandler", "eh", "setUnobservedExceptionHandler", "value", "forResult", "(Ljava/lang/Object;)Lcom/facebook/bolts/Task;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "forError", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "", "delay", "Ljava/lang/Void;", "cancellationToken", "Ljava/util/concurrent/ScheduledExecutorService;", "delay$facebook_core_release", "(JLjava/util/concurrent/ScheduledExecutorService;Lcom/facebook/bolts/CancellationToken;)Lcom/facebook/bolts/Task;", "Ljava/util/concurrent/Callable;", "callable", "callInBackground", NotificationCompat.CATEGORY_CALL, "", "tasks", "whenAnyResult", "whenAny", "", "whenAllResult", "whenAll", "Ljava/util/concurrent/ExecutorService;", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "TASK_CANCELLED", "Lcom/facebook/bolts/Task;", "", "TASK_FALSE", "TASK_NULL", "TASK_TRUE", "UI_THREAD_EXECUTOR", "unobservedExceptionHandler", "Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"TResult", "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a implements Runnable {
            public final /* synthetic */ CancellationToken a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;
            public final /* synthetic */ Callable c;

            public a(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Callable callable) {
                this.a = cancellationToken;
                this.b = taskCompletionSource;
                this.c = callable;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    CancellationToken cancellationToken = this.a;
                    if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                        this.b.setCancelled();
                        return;
                    }
                    try {
                        try {
                            this.b.setResult(this.c.call());
                        } catch (CancellationException unused) {
                            this.b.setCancelled();
                        }
                    } catch (Exception e) {
                        this.b.setError(e);
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"TContinuationResult", "TResult", "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b implements Runnable {
            public final /* synthetic */ CancellationToken a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;
            public final /* synthetic */ Continuation c;
            public final /* synthetic */ Task d;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"TContinuationResult", "TResult", "Lcom/facebook/bolts/Task;", "task", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
            public static final class a<TTaskResult, TContinuationResult> implements Continuation {
                public a() {
                }

                @Override // com.facebook.bolts.Continuation
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void then(@NotNull Task<TContinuationResult> task) {
                    CancellationToken cancellationToken = b.this.a;
                    if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                        b.this.b.setCancelled();
                        return null;
                    }
                    if (task.isCancelled()) {
                        b.this.b.setCancelled();
                    } else if (task.isFaulted()) {
                        b.this.b.setError(task.getError());
                    } else {
                        b.this.b.setResult(task.getResult());
                    }
                    return null;
                }
            }

            public b(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
                this.a = cancellationToken;
                this.b = taskCompletionSource;
                this.c = continuation;
                this.d = task;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    CancellationToken cancellationToken = this.a;
                    if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                        this.b.setCancelled();
                        return;
                    }
                    try {
                        Task task = (Task) this.c.then(this.d);
                        if (task == null || task.continueWith(new a()) == null) {
                            this.b.setResult(null);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (CancellationException unused) {
                        this.b.setCancelled();
                    } catch (Exception e) {
                        this.b.setError(e);
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"TContinuationResult", "TResult", "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c implements Runnable {
            public final /* synthetic */ CancellationToken a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;
            public final /* synthetic */ Continuation c;
            public final /* synthetic */ Task d;

            public c(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
                this.a = cancellationToken;
                this.b = taskCompletionSource;
                this.c = continuation;
                this.d = task;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    CancellationToken cancellationToken = this.a;
                    if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                        this.b.setCancelled();
                        return;
                    }
                    try {
                        try {
                            this.b.setResult(this.c.then(this.d));
                        } catch (CancellationException unused) {
                            this.b.setCancelled();
                        }
                    } catch (Exception e) {
                        this.b.setError(e);
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"TResult", "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d implements Runnable {
            public final /* synthetic */ ScheduledFuture a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;

            public d(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
                this.a = scheduledFuture;
                this.b = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    this.a.cancel(true);
                    this.b.trySetCancelled();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"TResult", "", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e implements Runnable {
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource a;

            public e(com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
                this.a = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    this.a.trySetResult(null);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"TResult", "Lcom/facebook/bolts/Task;", "", "it", "", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
        public static final class f<TTaskResult, TContinuationResult> implements Continuation {
            public final /* synthetic */ ReentrantLock a;
            public final /* synthetic */ ArrayList b;
            public final /* synthetic */ AtomicBoolean c;
            public final /* synthetic */ AtomicInteger d;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource e;

            public f(ReentrantLock reentrantLock, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
                this.a = reentrantLock;
                this.b = arrayList;
                this.c = atomicBoolean;
                this.d = atomicInteger;
                this.e = taskCompletionSource;
            }

            @Override // com.facebook.bolts.Continuation
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void then(@NotNull Task<Object> task) {
                if (task.isFaulted()) {
                    ReentrantLock reentrantLock = this.a;
                    reentrantLock.lock();
                    try {
                        this.b.add(task.getError());
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (task.isCancelled()) {
                    this.c.set(true);
                }
                if (this.d.decrementAndGet() == 0) {
                    if (this.b.size() != 0) {
                        if (this.b.size() == 1) {
                            this.e.setError((Exception) this.b.get(0));
                        } else {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            this.e.setError(new AggregateException(String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.b.size())}, 1)), this.b));
                        }
                    } else if (this.c.get()) {
                        this.e.setCancelled();
                    } else {
                        this.e.setResult(null);
                    }
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"TResult", "Lcom/facebook/bolts/Task;", "", "it", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
        public static final class g<TTaskResult, TContinuationResult> implements Continuation {
            public final /* synthetic */ AtomicBoolean a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;

            public g(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
                this.a = atomicBoolean;
                this.b = taskCompletionSource;
            }

            @Override // com.facebook.bolts.Continuation
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void then(@NotNull Task<Object> task) {
                if (this.a.compareAndSet(false, true)) {
                    this.b.setResult(task);
                    return null;
                }
                task.getError();
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"TResult", "Lcom/facebook/bolts/Task;", "it", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
        public static final class h<TTaskResult, TContinuationResult> implements Continuation {
            public final /* synthetic */ AtomicBoolean a;
            public final /* synthetic */ com.facebook.bolts.TaskCompletionSource b;

            public h(AtomicBoolean atomicBoolean, com.facebook.bolts.TaskCompletionSource taskCompletionSource) {
                this.a = atomicBoolean;
                this.b = taskCompletionSource;
            }

            @Override // com.facebook.bolts.Continuation
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void then(@NotNull Task<TResult> task) {
                if (this.a.compareAndSet(false, true)) {
                    this.b.setResult(task);
                    return null;
                }
                task.getError();
                return null;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void a(com.facebook.bolts.TaskCompletionSource<TContinuationResult> tcs, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken ct) {
            try {
                executor.execute(new b(ct, tcs, continuation, task));
            } catch (Exception e2) {
                tcs.setError(new ExecutorException(e2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void b(com.facebook.bolts.TaskCompletionSource<TContinuationResult> tcs, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken ct) {
            try {
                executor.execute(new c(ct, tcs, continuation, task));
            } catch (Exception e2) {
                tcs.setError(new ExecutorException(e2));
            }
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            return call(callable, executor, null);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.o;
            Objects.requireNonNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
            return task;
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay(long delay) {
            return delay$facebook_core_release(delay, BoltsExecutors.INSTANCE.scheduled$facebook_core_release(), null);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay$facebook_core_release(long delay, @NotNull ScheduledExecutorService executor, @Nullable CancellationToken cancellationToken) {
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (delay <= 0) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            ScheduledFuture<?> scheduledFutureSchedule = executor.schedule(new e(taskCompletionSource), delay, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new d(scheduledFutureSchedule, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> forError(@Nullable Exception error) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(error);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> forResult(@Nullable TResult value) {
            if (value == 0) {
                Task<TResult> task = Task.l;
                Objects.requireNonNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
                return task;
            }
            if (value instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) value).booleanValue() ? Task.m : Task.n;
                Objects.requireNonNull(task2, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
                return task2;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(value);
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        @Nullable
        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.k;
        }

        @JvmStatic
        public final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler eh) {
            Task.k = eh;
        }

        @JvmStatic
        @NotNull
        public final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> tasks) {
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                Objects.requireNonNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.continueWith(new f(reentrantLock, arrayList, atomicBoolean, atomicInteger, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<List<TResult>> whenAllResult(@NotNull final Collection<Task<TResult>> tasks) {
            return (Task<List<TResult>>) whenAll(tasks).onSuccess(new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                @NotNull
                public List<TResult> then(@NotNull Task<Void> task) {
                    if (tasks.isEmpty()) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = tasks.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Task) it2.next()).getResult());
                    }
                    return arrayList;
                }
            });
        }

        @JvmStatic
        @NotNull
        public final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> tasks) {
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                Objects.requireNonNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.continueWith(new g(atomicBoolean, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> tasks) {
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<Task<TResult>> it2 = tasks.iterator();
            while (it2.hasNext()) {
                it2.next().continueWith(new h(atomicBoolean, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable CancellationToken ct) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new a(ct, taskCompletionSource, callable));
            } catch (Exception e2) {
                taskCompletionSource.setError(new ExecutorException(e2));
            }
            return taskCompletionSource.getTask();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken ct) {
            return call(callable, Task.BACKGROUND_EXECUTOR, ct);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay(long delay, @Nullable CancellationToken cancellationToken) {
            return delay$facebook_core_release(delay, BoltsExecutors.INSTANCE.scheduled$facebook_core_release(), cancellationToken);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
            return call(callable, Task.j, null);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken ct) {
            return call(callable, Task.j, ct);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/bolts/Task$TaskCompletionSource;", "Lcom/facebook/bolts/TaskCompletionSource;", "<init>", "(Lcom/facebook/bolts/Task;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @Deprecated(message = "Please use [com.facebook.bolts.TaskCompletionSource] instead. ")
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        public TaskCompletionSource() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/bolts/Task$UnobservedExceptionHandler;", "", "Lcom/facebook/bolts/Task;", "t", "Lcom/facebook/bolts/UnobservedTaskException;", "e", "", "unobservedException", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface UnobservedExceptionHandler {
        void unobservedException(@NotNull Task<?> t, @NotNull UnobservedTaskException e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TContinuationResult", "TResult", "Lcom/facebook/bolts/Task;", "task", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;", "com/facebook/bolts/Task$continueWith$1$1"}, k = 3, mv = {1, 5, 1})
    public static final class a<TTaskResult, TContinuationResult> implements Continuation {
        public final /* synthetic */ Ref.BooleanRef b;
        public final /* synthetic */ com.facebook.bolts.TaskCompletionSource c;
        public final /* synthetic */ Continuation d;
        public final /* synthetic */ Executor e;
        public final /* synthetic */ CancellationToken f;

        public a(Ref.BooleanRef booleanRef, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
            this.b = booleanRef;
            this.c = taskCompletionSource;
            this.d = continuation;
            this.e = executor;
            this.f = cancellationToken;
        }

        @Override // com.facebook.bolts.Continuation
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void then(@NotNull Task<TResult> task) {
            Task.INSTANCE.b(this.c, this.d, task, this.e, this.f);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TContinuationResult", "TResult", "Lcom/facebook/bolts/Task;", "task", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;", "com/facebook/bolts/Task$continueWithTask$1$1"}, k = 3, mv = {1, 5, 1})
    public static final class b<TTaskResult, TContinuationResult> implements Continuation {
        public final /* synthetic */ Ref.BooleanRef b;
        public final /* synthetic */ com.facebook.bolts.TaskCompletionSource c;
        public final /* synthetic */ Continuation d;
        public final /* synthetic */ Executor e;
        public final /* synthetic */ CancellationToken f;

        public b(Ref.BooleanRef booleanRef, com.facebook.bolts.TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
            this.b = booleanRef;
            this.c = taskCompletionSource;
            this.d = continuation;
            this.e = executor;
            this.f = cancellationToken;
        }

        @Override // com.facebook.bolts.Continuation
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void then(@NotNull Task<TResult> task) {
            Task.INSTANCE.a(this.c, this.d, task, this.e, this.f);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"TResult", "Lcom/facebook/bolts/Task;", "task", "Ljava/lang/Void;", "a", "(Lcom/facebook/bolts/Task;)Lcom/facebook/bolts/Task;"}, k = 3, mv = {1, 5, 1})
    public static final class c<TTaskResult, TContinuationResult> implements Continuation {
        public static final c a = new c();

        @Override // com.facebook.bolts.Continuation
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Task<Void> then(@NotNull Task<TResult> task) {
            if (task.isCancelled()) {
                return Task.INSTANCE.cancelled();
            }
            return task.isFaulted() ? Task.INSTANCE.forError(task.getError()) : Task.INSTANCE.forResult(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"TContinuationResult", "TResult", "Lcom/facebook/bolts/Task;", "task", "a", "(Lcom/facebook/bolts/Task;)Lcom/facebook/bolts/Task;"}, k = 3, mv = {1, 5, 1})
    public static final class d<TTaskResult, TContinuationResult> implements Continuation {
        public final /* synthetic */ CancellationToken a;
        public final /* synthetic */ Continuation b;

        public d(CancellationToken cancellationToken, Continuation continuation) {
            this.a = cancellationToken;
            this.b = continuation;
        }

        @Override // com.facebook.bolts.Continuation
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Task<TContinuationResult> then(@NotNull Task<TResult> task) {
            CancellationToken cancellationToken = this.a;
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return Task.INSTANCE.cancelled();
            }
            if (task.isFaulted()) {
                return Task.INSTANCE.forError(task.getError());
            }
            return task.isCancelled() ? Task.INSTANCE.cancelled() : task.continueWith(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"TContinuationResult", "TResult", "Lcom/facebook/bolts/Task;", "task", "a", "(Lcom/facebook/bolts/Task;)Lcom/facebook/bolts/Task;"}, k = 3, mv = {1, 5, 1})
    public static final class e<TTaskResult, TContinuationResult> implements Continuation {
        public final /* synthetic */ CancellationToken a;
        public final /* synthetic */ Continuation b;

        public e(CancellationToken cancellationToken, Continuation continuation) {
            this.a = cancellationToken;
            this.b = continuation;
        }

        @Override // com.facebook.bolts.Continuation
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Task<TContinuationResult> then(@NotNull Task<TResult> task) {
            CancellationToken cancellationToken = this.a;
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return Task.INSTANCE.cancelled();
            }
            if (task.isFaulted()) {
                return Task.INSTANCE.forError(task.getError());
            }
            return task.isCancelled() ? Task.INSTANCE.cancelled() : task.continueWithTask(this.b);
        }
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.INSTANCE;
        BACKGROUND_EXECUTOR = companion.background();
        j = companion.immediate$facebook_core_release();
        UI_THREAD_EXECUTOR = AndroidExecutors.INSTANCE.uiThread();
        l = new Task<>((Object) null);
        m = new Task<>(Boolean.TRUE);
        n = new Task<>(Boolean.FALSE);
        o = new Task<>(true);
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    private final void a() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        ((Continuation) it2.next()).then(this);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
        return INSTANCE.call(callable);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return INSTANCE.call(callable, cancellationToken);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
        return INSTANCE.call(callable, executor);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        return INSTANCE.call(callable, executor, cancellationToken);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
        return INSTANCE.callInBackground(callable);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return INSTANCE.callInBackground(callable, cancellationToken);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> cancelled() {
        return INSTANCE.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i, Object obj) {
        if ((i & 4) != 0) {
            executor = j;
        }
        if ((i & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    @JvmStatic
    @NotNull
    public static final Task<Void> delay(long j2) {
        return INSTANCE.delay(j2);
    }

    @JvmStatic
    @NotNull
    public static final Task<Void> delay(long j2, @Nullable CancellationToken cancellationToken) {
        return INSTANCE.delay(j2, cancellationToken);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> forError(@Nullable Exception exc) {
        return INSTANCE.forError(exc);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<TResult> forResult(@Nullable TResult tresult) {
        return INSTANCE.forResult(tresult);
    }

    @JvmStatic
    @Nullable
    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return INSTANCE.getUnobservedExceptionHandler();
    }

    @JvmStatic
    public static final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler unobservedExceptionHandler) {
        INSTANCE.setUnobservedExceptionHandler(unobservedExceptionHandler);
    }

    @JvmStatic
    @NotNull
    public static final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> collection) {
        return INSTANCE.whenAll(collection);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<List<TResult>> whenAllResult(@NotNull Collection<Task<TResult>> collection) {
        return INSTANCE.whenAllResult(collection);
    }

    @JvmStatic
    @NotNull
    public static final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> collection) {
        return INSTANCE.whenAny(collection);
    }

    @JvmStatic
    @NotNull
    public static final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> collection) {
        return INSTANCE.whenAnyResult(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <TOut> Task<TOut> cast() {
        return this;
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> predicate, @NotNull Continuation<Void, Task<Void>> continuation) {
        return continueWhile(predicate, continuation, j, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        return continueWith(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        return continueWithTask(continuation, executor, null);
    }

    @Nullable
    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Nullable
    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final Task<Void> makeVoid() {
        return continueWithTask(c.a);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        return onSuccess(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        return onSuccessTask(continuation, executor, null);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            a();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(@Nullable Exception error) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = error;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            a();
            if (!this.errorHasBeenObserved && k != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(@Nullable TResult result) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.resultField = result;
            this.condition.signalAll();
            a();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> predicate, @NotNull Continuation<Void, Task<Void>> continuation, @Nullable CancellationToken ct) {
        return continueWhile(predicate, continuation, j, ct);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable CancellationToken ct) {
        List<Continuation<TResult, Void>> list;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsCompleted = isCompleted();
            booleanRef.element = zIsCompleted;
            if (!zIsCompleted && (list = this.continuations) != null) {
                list.add(new a(booleanRef, taskCompletionSource, continuation, executor, ct));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (booleanRef.element) {
                INSTANCE.b(taskCompletionSource, continuation, this, executor, ct);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable CancellationToken ct) {
        List<Continuation<TResult, Void>> list;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsCompleted = isCompleted();
            booleanRef.element = zIsCompleted;
            if (!zIsCompleted && (list = this.continuations) != null) {
                list.add(new b(booleanRef, taskCompletionSource, continuation, executor, ct));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (booleanRef.element) {
                INSTANCE.a(taskCompletionSource, continuation, this, executor, ct);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable CancellationToken ct) {
        return continueWithTask(new d(ct, continuation), executor);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable CancellationToken ct) {
        return continueWithTask(new e(ct, continuation), executor);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull final Callable<Boolean> predicate, @NotNull final Continuation<Void, Task<Void>> continuation, @NotNull final Executor executor, @Nullable final CancellationToken ct) {
        return makeVoid().continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            @NotNull
            public Task<Void> then(@NotNull Task<Void> task) throws Exception {
                CancellationToken cancellationToken = ct;
                if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                    return ((Boolean) predicate.call()).booleanValue() ? Task.INSTANCE.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor) : Task.INSTANCE.forResult(null);
                }
                return Task.INSTANCE.cancelled();
            }
        }, executor);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        return onSuccess(continuation, j, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return onSuccessTask(continuation, j);
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken ct) {
        return onSuccess(continuation, j, ct);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken ct) {
        return onSuccessTask(continuation, j, ct);
    }

    public final boolean waitForCompletion(long duration, @NotNull TimeUnit timeUnit) throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(duration, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    private Task(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(continuation, j, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(continuation, j, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken ct) {
        return continueWith(continuation, j, ct);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken ct) {
        return continueWithTask(continuation, j, ct);
    }
}
