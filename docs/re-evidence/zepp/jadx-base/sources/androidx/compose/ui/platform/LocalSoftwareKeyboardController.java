package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\u0004R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028G@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "delegatingController", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/runtime/ProvidedValue;", "provides", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSoftwareKeyboardController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrent", "getCurrent$annotations", "()V", "current", "<init>", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;

    @NotNull
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();

    @NotNull
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.compositionLocalOf$default(null, new Function0<SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final SoftwareKeyboardController invoke() {
            return null;
        }
    }, 1, null);

    private LocalSoftwareKeyboardController() {
    }

    @Composable
    private final SoftwareKeyboardController delegatingController(Composer composer, int i) {
        composer.startReplaceableGroup(1255403937);
        TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
        if (textInputService == null) {
            composer.endReplaceableGroup();
            return null;
        }
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(textInputService);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DelegatingSoftwareKeyboardController(textInputService);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) objRememberedValue;
        composer.endReplaceableGroup();
        return delegatingSoftwareKeyboardController;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final SoftwareKeyboardController getCurrent(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1850767929);
        SoftwareKeyboardController softwareKeyboardControllerDelegatingController = (SoftwareKeyboardController) composer.consume(LocalSoftwareKeyboardController);
        if (softwareKeyboardControllerDelegatingController == null) {
            composer.startReplaceableGroup(1850767999);
            softwareKeyboardControllerDelegatingController = delegatingController(composer, i & 14);
        } else {
            composer.startReplaceableGroup(1850767956);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return softwareKeyboardControllerDelegatingController;
    }

    @NotNull
    public final ProvidedValue<SoftwareKeyboardController> provides(@NotNull SoftwareKeyboardController softwareKeyboardController) {
        return LocalSoftwareKeyboardController.provides(softwareKeyboardController);
    }
}
