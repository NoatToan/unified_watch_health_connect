package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "", "onDestroyActionMode", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/ActionCallback;", "onCopyRequested", "Lkotlin/jvm/functions/Function0;", "getOnCopyRequested", "()Lkotlin/jvm/functions/Function0;", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "onPasteRequested", "getOnPasteRequested", "setOnPasteRequested", "onCutRequested", "getOnCutRequested", "setOnCutRequested", "onSelectAllRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "<init>", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TextActionModeCallback {

    @Nullable
    private Function0<Unit> onCopyRequested;

    @Nullable
    private Function0<Unit> onCutRequested;

    @Nullable
    private Function0<Unit> onPasteRequested;

    @Nullable
    private Function0<Unit> onSelectAllRequested;

    @NotNull
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, 31, null);
    }

    public TextActionModeCallback(@NotNull Rect rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3) {
        this.rect = rect;
        this.onCopyRequested = function0;
        this.onPasteRequested = function1;
        this.onCutRequested = function2;
        this.onSelectAllRequested = function3;
    }

    @Nullable
    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == 0) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == 1) {
            Function0<Unit> function1 = this.onPasteRequested;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == 2) {
            Function0<Unit> function2 = this.onCutRequested;
            if (function2 != null) {
                function2.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            Function0<Unit> function3 = this.onSelectAllRequested;
            if (function3 != null) {
                function3.invoke();
            }
        }
        if (mode != null) {
            mode.finish();
        }
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (mode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.onCopyRequested != null) {
            menu.add(0, 0, 0, R.string.copy).setShowAsAction(1);
        }
        if (this.onPasteRequested != null) {
            menu.add(0, 1, 1, R.string.paste).setShowAsAction(1);
        }
        if (this.onCutRequested != null) {
            menu.add(0, 2, 2, R.string.cut).setShowAsAction(1);
        }
        if (this.onSelectAllRequested != null) {
            menu.add(0, 3, 3, R.string.selectAll).setShowAsAction(1);
        }
        return true;
    }

    public final void onDestroyActionMode() {
    }

    public final boolean onPrepareActionMode() {
        return false;
    }

    public final void setOnCopyRequested(@Nullable Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(@Nullable Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(@Nullable Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(@Nullable Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(@NotNull Rect rect) {
        this.rect = rect;
    }

    public /* synthetic */ TextActionModeCallback(Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Rect.INSTANCE.getZero() : rect, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2, (i & 16) == 0 ? function3 : null);
    }
}
