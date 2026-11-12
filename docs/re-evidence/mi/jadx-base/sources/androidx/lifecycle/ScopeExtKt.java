package androidx.lifecycle;

import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.dvq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\u000b\u0010\f\u001aD\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldvq;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/xiaomi/fitness/net/scope/AndroidScope;", "scopeLife", "(Ldvq;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", "Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "scopeNetLife", "(Ldvq;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "net_release"}, k = 2, mv = {2, 0, 0})
public final class ScopeExtKt {
    @NotNull
    public static final AndroidScope scopeLife(@NotNull dvq dvqVar, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(dvqVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        AndroidScope androidScopeLaunch = new AndroidScope(null, null, dispatcher, 3, null).launch(block);
        Object tagIfAbsent = dvqVar.setTagIfAbsent(androidScopeLaunch.toString(), androidScopeLaunch);
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(...)");
        return (AndroidScope) tagIfAbsent;
    }

    public static /* synthetic */ AndroidScope scopeLife$default(dvq dvqVar, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeLife(dvqVar, coroutineDispatcher, function2);
    }

    @NotNull
    public static final NetCoroutineScope scopeNetLife(@NotNull dvq dvqVar, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(dvqVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        NetCoroutineScope netCoroutineScopeLaunch = new NetCoroutineScope(null, null, dispatcher, 3, null).launch(block);
        Object tagIfAbsent = dvqVar.setTagIfAbsent(netCoroutineScopeLaunch.toString(), netCoroutineScopeLaunch);
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(...)");
        return (NetCoroutineScope) tagIfAbsent;
    }

    public static /* synthetic */ NetCoroutineScope scopeNetLife$default(dvq dvqVar, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeNetLife(dvqVar, coroutineDispatcher, function2);
    }
}
