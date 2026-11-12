package com.google.accompanist.insets;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0016J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002R\u0016\u0010\u0003\u001a\u00020\u00028g@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00028g@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00028g@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00028g@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011"}, d2 = {"Lcom/google/accompanist/insets/Insets;", "", "", "left", "top", "right", "bottom", "copy", "other", "minus", "plus", "getLeft", "()I", "getTop", "getRight", "getBottom", "Companion", "insets_release"}, k = 1, mv = {1, 5, 1})
public interface Insets {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/google/accompanist/insets/Insets$Companion;", "", "", "left", "top", "right", "bottom", "Lcom/google/accompanist/insets/Insets;", "Insets", "b", "Lcom/google/accompanist/insets/Insets;", "getEmpty", "()Lcom/google/accompanist/insets/Insets;", "Empty", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final Insets Empty = new ImmutableInsets(0, 0, 0, 0, 15, null);

        private Companion() {
        }

        public static /* synthetic */ Insets Insets$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.Insets(i, i2, i3, i4);
        }

        @NotNull
        public final Insets Insets(int left, int top, int right, int bottom) {
            return new ImmutableInsets(left, top, right, bottom);
        }

        @NotNull
        public final Insets getEmpty() {
            return Empty;
        }
    }

    @NotNull
    Insets copy(int left, int top, int right, int bottom);

    @IntRange(from = 0)
    int getBottom();

    @IntRange(from = 0)
    int getLeft();

    @IntRange(from = 0)
    int getRight();

    @IntRange(from = 0)
    int getTop();

    @NotNull
    Insets minus(@NotNull Insets other);

    @NotNull
    Insets plus(@NotNull Insets other);
}
