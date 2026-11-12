package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/RelocationRequester;", "", "", "bringIntoView", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/layout/RelocationRequesterModifier;", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "getModifiers$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class RelocationRequester {
    public static final int $stable = MutableVector.$stable;

    @NotNull
    private final MutableVector<RelocationRequesterModifier> modifiers = new MutableVector<>(new RelocationRequesterModifier[16], 0);

    public final void bringIntoView() {
        MutableVector<RelocationRequesterModifier> mutableVector = this.modifiers;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = 0;
            RelocationRequesterModifier[] content = mutableVector.getContent();
            do {
                content[i].bringIntoView();
                i++;
            } while (i < size);
        }
    }

    @NotNull
    public final MutableVector<RelocationRequesterModifier> getModifiers$ui_release() {
        return this.modifiers;
    }
}
