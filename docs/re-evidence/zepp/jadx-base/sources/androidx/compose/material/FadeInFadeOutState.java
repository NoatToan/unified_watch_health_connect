package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/FadeInFadeOutState;", ExifInterface.GPS_DIRECTION_TRUE, "", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "(Ljava/lang/Object;)V", "", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "getScope", "()Landroidx/compose/runtime/RecomposeScope;", "setScope", "(Landroidx/compose/runtime/RecomposeScope;)V", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
final class FadeInFadeOutState<T> {

    @Nullable
    private Object current = new Object();

    @NotNull
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();

    @Nullable
    private RecomposeScope scope;

    @Nullable
    public final Object getCurrent() {
        return this.current;
    }

    @NotNull
    public final List<FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    @Nullable
    public final RecomposeScope getScope() {
        return this.scope;
    }

    public final void setCurrent(@Nullable Object obj) {
        this.current = obj;
    }

    public final void setItems(@NotNull List<FadeInFadeOutAnimationItem<T>> list) {
        this.items = list;
    }

    public final void setScope(@Nullable RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
