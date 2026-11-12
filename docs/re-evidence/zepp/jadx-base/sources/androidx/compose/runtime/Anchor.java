package androidx.compose.runtime;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "Landroidx/compose/runtime/SlotTable;", "slots", "", "toIndexFor", "Landroidx/compose/runtime/SlotWriter;", "writer", "location", LogUtil.I, "getLocation$runtime_release", "()I", "setLocation$runtime_release", "(I)V", "", "getValid", "()Z", "valid", "loc", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class Anchor {
    private int location;

    public Anchor(int i) {
        this.location = i;
    }

    /* JADX INFO: renamed from: getLocation$runtime_release, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime_release(int i) {
        this.location = i;
    }

    public final int toIndexFor(@NotNull SlotTable slots) {
        return slots.anchorIndex(this);
    }

    public final int toIndexFor(@NotNull SlotWriter writer) {
        return writer.anchorIndex(this);
    }
}
