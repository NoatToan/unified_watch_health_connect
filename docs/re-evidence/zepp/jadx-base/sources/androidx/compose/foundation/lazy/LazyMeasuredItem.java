package androidx.compose.foundation.lazy;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b0\u00101J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\nR\u001c\u0010\"\u001a\u00020!8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u0019\u0010(\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\fR\u0019\u0010*\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b+\u0010\fR\"\u0010,\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "", "layoutWidth", "layoutHeight", "", "place", "index", LogUtil.I, "getIndex", "()I", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "[Landroidx/compose/ui/layout/Placeable;", "", "isVertical", "Z", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "startContentPadding", "endContentPadding", "spacing", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "offset", "getOffset", "setOffset", "(I)V", "<init>", "(I[Landroidx/compose/ui/layout/Placeable;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIILjava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class LazyMeasuredItem implements LazyListItemInfo {
    private final int crossAxisSize;
    private final int endContentPadding;

    @Nullable
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;

    @NotNull
    private final LayoutDirection layoutDirection;
    private int offset;

    @NotNull
    private final Placeable[] placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int startContentPadding;

    @Nullable
    private final Alignment.Vertical verticalAlignment;

    public LazyMeasuredItem(int i, @NotNull Placeable[] placeableArr, boolean z, @Nullable Alignment.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @NotNull LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, @NotNull Object obj) {
        this.index = i;
        this.placeables = placeableArr;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.startContentPadding = i2;
        this.endContentPadding = i3;
        this.spacing = i4;
        this.key = obj;
        int height = 0;
        int iMax = 0;
        for (Placeable placeable : placeableArr) {
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.sizeWithSpacings = getSize() + this.spacing;
        this.crossAxisSize = iMax;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final void place(@NotNull Placeable.PlacementScope scope, int layoutWidth, int layoutHeight) {
        int width;
        int offset = this.reverseLayout ? ((this.isVertical ? layoutHeight : layoutWidth) - getOffset()) - getSize() : getOffset();
        int lastIndex = this.reverseLayout ? ArraysKt___ArraysKt.getLastIndex(this.placeables) : 0;
        while (true) {
            boolean z = this.reverseLayout;
            boolean z2 = true;
            if (!z ? lastIndex >= this.placeables.length : lastIndex < 0) {
                z2 = false;
            }
            if (!z2) {
                return;
            }
            Placeable placeable = this.placeables[lastIndex];
            lastIndex = z ? lastIndex - 1 : lastIndex + 1;
            if (this.isVertical) {
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iAlign = horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection);
                if (placeable.getHeight() + offset > (-this.startContentPadding) && offset < this.endContentPadding + layoutHeight) {
                    Placeable.PlacementScope.placeWithLayer$default(scope, placeable, iAlign, offset, 0.0f, null, 12, null);
                }
                width = placeable.getHeight();
            } else {
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iAlign2 = vertical.align(placeable.getHeight(), layoutHeight);
                if (placeable.getWidth() + offset > (-this.startContentPadding) && offset < this.endContentPadding + layoutWidth) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(scope, placeable, offset, iAlign2, 0.0f, null, 12, null);
                }
                width = placeable.getWidth();
            }
            offset += width;
        }
    }

    public void setOffset(int i) {
        this.offset = i;
    }
}
