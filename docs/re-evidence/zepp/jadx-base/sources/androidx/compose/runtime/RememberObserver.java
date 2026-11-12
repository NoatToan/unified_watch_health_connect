package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/RememberObserver;", "", "", "onRemembered", "onForgotten", "onAbandoned", "runtime_release"}, k = 1, mv = {1, 5, 1})
public interface RememberObserver {
    void onAbandoned();

    void onForgotten();

    void onRemembered();
}
