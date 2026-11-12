package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.ModifiedFocusRequesterNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "", "requestFocus", "", "captureFocus", "freeFocus", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/ModifiedFocusRequesterNode;", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class FocusRequester {

    @NotNull
    private final MutableVector<ModifiedFocusRequesterNode> focusRequesterNodes = new MutableVector<>(new ModifiedFocusRequesterNode[16], 0);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = MutableVector.$stable;

    @NotNull
    private static final FocusRequester Default = new FocusRequester();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "createRefs", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "getDefault", "()Landroidx/compose/ui/focus/FocusRequester;", "<init>", "()V", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0004\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\t\u0010\b\u001a\u00020\u0002H\u0086\u0002J\t\u0010\t\u001a\u00020\u0002H\u0086\u0002J\t\u0010\n\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0086\u0002J\t\u0010\f\u001a\u00020\u0002H\u0086\u0002J\t\u0010\r\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "Landroidx/compose/ui/focus/FocusRequester;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;

            @NotNull
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }
    }

    public final boolean captureFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<ModifiedFocusRequesterNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        int i = 0;
        if (size <= 0) {
            return false;
        }
        ModifiedFocusRequesterNode[] content = mutableVector.getContent();
        boolean z = false;
        do {
            ModifiedFocusNode modifiedFocusNodeFindFocusNode$ui_release = content[i].findFocusNode$ui_release();
            if (modifiedFocusNodeFindFocusNode$ui_release != null && FocusTransactionsKt.captureFocus(modifiedFocusNodeFindFocusNode$ui_release)) {
                z = true;
            }
            i++;
        } while (i < size);
        return z;
    }

    public final boolean freeFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<ModifiedFocusRequesterNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        int i = 0;
        if (size <= 0) {
            return false;
        }
        ModifiedFocusRequesterNode[] content = mutableVector.getContent();
        boolean z = false;
        do {
            ModifiedFocusNode modifiedFocusNodeFindFocusNode$ui_release = content[i].findFocusNode$ui_release();
            if (modifiedFocusNodeFindFocusNode$ui_release != null && FocusTransactionsKt.freeFocus(modifiedFocusNodeFindFocusNode$ui_release)) {
                z = true;
            }
            i++;
        } while (i < size);
        return z;
    }

    @NotNull
    public final MutableVector<ModifiedFocusRequesterNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<ModifiedFocusRequesterNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            ModifiedFocusRequesterNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                ModifiedFocusNode modifiedFocusNodeFindFocusNode$ui_release = content[i].findFocusNode$ui_release();
                if (modifiedFocusNodeFindFocusNode$ui_release != null) {
                    FocusTransactionsKt.requestFocus(modifiedFocusNodeFindFocusNode$ui_release, false);
                }
                i++;
            } while (i < size);
        }
    }
}
