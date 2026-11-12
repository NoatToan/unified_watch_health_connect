package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u001e\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000\"\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "focusableChildren", "", "findFocusableChildren", "Landroidx/compose/runtime/collection/MutableVector;", "queue", "searchChildrenForFocusNode", "", "FOCUS_TAG", "Ljava/lang/String;", "getFOCUS_TAG", "()Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class FocusNodeUtilsKt {

    @NotNull
    private static final String FOCUS_TAG = "Compose Focus";

    public static final void findFocusableChildren(@NotNull LayoutNode layoutNode, @NotNull List<ModifiedFocusNode> list) {
        ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper();
        if ((modifiedFocusNodeFindNextFocusWrapper == null ? null : Boolean.valueOf(list.add(modifiedFocusNodeFindNextFocusWrapper))) != null) {
            return;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int i = 0;
        int size = children$ui_release.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            findFocusableChildren(children$ui_release.get(i), list);
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @NotNull
    public static final String getFOCUS_TAG() {
        return FOCUS_TAG;
    }

    @Nullable
    public static final ModifiedFocusNode searchChildrenForFocusNode(@NotNull LayoutNode layoutNode, @NotNull MutableVector<LayoutNode> mutableVector) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = layoutNode2.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper();
                if (modifiedFocusNodeFindNextFocusWrapper != null) {
                    return modifiedFocusNodeFindNextFocusWrapper;
                }
                mutableVector.add(layoutNode2);
                i++;
            } while (i < size);
        }
        while (mutableVector.isNotEmpty()) {
            ModifiedFocusNode modifiedFocusNodeSearchChildrenForFocusNode = searchChildrenForFocusNode(mutableVector.removeAt(0), mutableVector);
            if (modifiedFocusNodeSearchChildrenForFocusNode != null) {
                return modifiedFocusNodeSearchChildrenForFocusNode;
            }
        }
        return null;
    }

    public static /* synthetic */ ModifiedFocusNode searchChildrenForFocusNode$default(LayoutNode layoutNode, MutableVector mutableVector, int i, Object obj) {
        if ((i & 1) != 0) {
            mutableVector = new MutableVector(new LayoutNode[16], 0);
        }
        return searchChildrenForFocusNode(layoutNode, mutableVector);
    }
}
