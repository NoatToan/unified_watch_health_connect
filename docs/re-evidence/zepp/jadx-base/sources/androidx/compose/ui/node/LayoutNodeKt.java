package androidx.compose.ui.node;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a*\u0010\n\u001a\u00028\u0000\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\u0006*\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001c\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "child", "", TransportUri.ACTION_ADD, "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/LayoutNodeWrapper;", "originalWrapper", "assignChained", "(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "", "DebugChanges", "Z", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    @NotNull
    private static final LayoutNodeDrawScope sharedDrawScope = new LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);

    public static final void add(@NotNull LayoutNode layoutNode, @NotNull LayoutNode layoutNode2) {
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }

    private static final <T extends DelegatingLayoutNodeWrapper<?>> T assignChained(T t, LayoutNodeWrapper layoutNodeWrapper) {
        if (layoutNodeWrapper != t.getWrapped()) {
            ((DelegatingLayoutNodeWrapper) t.getWrapped()).setChained(true);
        }
        return t;
    }

    @NotNull
    public static final LayoutNodeDrawScope getSharedDrawScope() {
        return sharedDrawScope;
    }

    @NotNull
    public static final Owner requireOwner(@NotNull LayoutNode layoutNode) {
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
