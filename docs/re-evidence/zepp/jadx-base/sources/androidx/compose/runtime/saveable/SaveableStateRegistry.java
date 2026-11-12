package androidx.compose.runtime.saveable;

import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H&J\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\fH&¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "", "key", "consumeRestored", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "value", "", "canBeSaved", "", "", "performSave", "Entry", "runtime-saveable_release"}, k = 1, mv = {1, 5, 1})
public interface SaveableStateRegistry {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "", "", MiPushClient.COMMAND_UNREGISTER, "runtime-saveable_release"}, k = 1, mv = {1, 5, 1})
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(@NotNull Object value);

    @Nullable
    Object consumeRestored(@NotNull String key);

    @NotNull
    Map<String, List<Object>> performSave();

    @NotNull
    Entry registerProvider(@NotNull String key, @NotNull Function0<? extends Object> valueProvider);
}
