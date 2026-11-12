package com.xiaomi.fitness.common.extensions;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001a@\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u000f\u001a@\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u000f\u001a@\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019\u001a\n\u0010\u001a\u001a\u00020\u001b*\u00020\u001b¨\u0006\u001c"}, d2 = {"globalLaunch", "Lkotlinx/coroutines/Job;", "context", "Lkotlin/coroutines/CoroutineContext;", StatConstants.PARAM_START, "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "io", "(Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", FaceSchema.FACE_PAGE_MAIN, "default", "retryWhenFail", "retryTimes", "", "retryIntervalMs", "", "Lkotlin/Function0;", "", "(ILjava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "generateTag", "", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnyExtKt {
    @DelicateCoroutinesApi
    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final Job m239default(@NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return globalLaunch(Dispatchers.getDefault(), start, block);
    }

    public static /* synthetic */ Job default$default(CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m239default(coroutineStart, function2);
    }

    @NotNull
    public static final String generateTag(@NotNull String str) {
        StackTraceElement stackTraceElement;
        Intrinsics.checkNotNullParameter(str, "<this>");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 5) {
            stackTraceElement = stackTrace[4];
            Intrinsics.checkNotNull(stackTraceElement);
        } else {
            stackTraceElement = new Exception().getStackTrace()[4];
            Intrinsics.checkNotNull(stackTraceElement);
        }
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNull(className);
        Intrinsics.checkNotNull(className);
        String strSubstring = className.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) className, ".", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String str2 = strSubstring + "." + stackTraceElement.getMethodName() + "(Line:" + stackTraceElement.getLineNumber() + ")";
        if (str.length() == 0) {
            return str2;
        }
        return str + ":" + str2;
    }

    @DelicateCoroutinesApi
    @NotNull
    public static final Job globalLaunch(@NotNull CoroutineContext context, @NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt.launch(GlobalScope.INSTANCE, context, start, block);
    }

    public static /* synthetic */ Job globalLaunch$default(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return globalLaunch(coroutineContext, coroutineStart, function2);
    }

    @DelicateCoroutinesApi
    @NotNull
    public static final Job io(@NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return globalLaunch(Dispatchers.getIO(), start, block);
    }

    public static /* synthetic */ Job io$default(CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return io(coroutineStart, function2);
    }

    @DelicateCoroutinesApi
    @NotNull
    public static final Job main(@NotNull CoroutineStart start, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return globalLaunch(Dispatchers.getMain(), start, block);
    }

    public static /* synthetic */ Job main$default(CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return main(coroutineStart, function2);
    }

    public static final void retryWhenFail(int i, @Nullable Long l, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
    }

    public static /* synthetic */ void retryWhenFail$default(int i, Long l, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        retryWhenFail(i, l, function0);
    }
}
