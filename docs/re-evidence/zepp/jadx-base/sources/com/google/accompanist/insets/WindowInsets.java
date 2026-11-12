package com.google.accompanist.insets;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012J:\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013"}, d2 = {"Lcom/google/accompanist/insets/WindowInsets;", "", "Lcom/google/accompanist/insets/WindowInsets$Type;", "navigationBars", "statusBars", "systemGestures", "ime", "displayCutout", "copy", "getNavigationBars", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "getStatusBars", "getIme", "getSystemGestures", "getSystemBars", "systemBars", "getDisplayCutout", "Companion", "Type", "insets_release"}, k = 1, mv = {1, 5, 1})
public interface WindowInsets {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/google/accompanist/insets/WindowInsets$Companion;", "", "Lcom/google/accompanist/insets/WindowInsets;", "b", "Lcom/google/accompanist/insets/WindowInsets;", "getEmpty", "()Lcom/google/accompanist/insets/WindowInsets;", "Empty", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final WindowInsets Empty = new ImmutableWindowInsets(null, null, null, null, null, 31, null);

        private Companion() {
        }

        @NotNull
        public final WindowInsets getEmpty() {
            return Empty;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aR\u0016\u0010\u0004\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00168g@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001b"}, d2 = {"Lcom/google/accompanist/insets/WindowInsets$Type;", "Lcom/google/accompanist/insets/Insets;", "getLayoutInsets", "()Lcom/google/accompanist/insets/Insets;", "layoutInsets", "getAnimatedInsets", "animatedInsets", "", "isVisible", "()Z", "getAnimationInProgress", "animationInProgress", "", "getLeft", "()I", "left", "getTop", "top", "getRight", "right", "getBottom", "bottom", "", "getAnimationFraction", "()F", "animationFraction", "Companion", "insets_release"}, k = 1, mv = {1, 5, 1})
    @Stable
    public interface Type extends Insets {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/google/accompanist/insets/WindowInsets$Type$Companion;", "", "Lcom/google/accompanist/insets/WindowInsets$Type;", "b", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getEmpty", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "Empty", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private static final Type Empty = new ImmutableWindowInsetsType(null, null, false, false, 0.0f, 31, null);

            private Companion() {
            }

            @NotNull
            public final Type getEmpty() {
                return Empty;
            }
        }

        @NotNull
        Insets getAnimatedInsets();

        @FloatRange(from = 0.0d, to = 1.0d)
        float getAnimationFraction();

        boolean getAnimationInProgress();

        @Override // com.google.accompanist.insets.Insets
        int getBottom();

        @NotNull
        Insets getLayoutInsets();

        @Override // com.google.accompanist.insets.Insets
        int getLeft();

        @Override // com.google.accompanist.insets.Insets
        int getRight();

        @Override // com.google.accompanist.insets.Insets
        int getTop();

        /* JADX INFO: renamed from: isVisible */
        boolean getIsVisible();
    }

    @NotNull
    WindowInsets copy(@NotNull Type navigationBars, @NotNull Type statusBars, @NotNull Type systemGestures, @NotNull Type ime, @NotNull Type displayCutout);

    @NotNull
    Type getDisplayCutout();

    @NotNull
    Type getIme();

    @NotNull
    Type getNavigationBars();

    @NotNull
    Type getStatusBars();

    @NotNull
    Type getSystemBars();

    @NotNull
    Type getSystemGestures();
}
