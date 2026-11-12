package androidx.compose.runtime;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ComposeCompilerApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H&¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ScopeUpdateScope;", "", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", TransportUri.ACTION_BLOCK, "updateScope", "runtime_release"}, k = 1, mv = {1, 5, 1})
public interface ScopeUpdateScope {
    void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block);
}
