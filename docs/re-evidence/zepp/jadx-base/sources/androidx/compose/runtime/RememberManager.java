package androidx.compose.runtime;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", DefaultSettingsSpiCall.n, "", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "runtime_release"}, k = 1, mv = {1, 5, 1})
public interface RememberManager {
    void forgetting(@NotNull RememberObserver instance);

    void remembering(@NotNull RememberObserver instance);

    void sideEffect(@NotNull Function0<Unit> effect);
}
