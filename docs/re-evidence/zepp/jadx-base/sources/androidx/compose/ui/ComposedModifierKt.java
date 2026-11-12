package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materialize", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ComposedModifierKt {
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull Function1<? super InspectorInfo, Unit> function1, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        return modifier.then(new ComposedModifier(function1, function3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, Function1 function1, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, function3);
    }

    @NotNull
    public static final Modifier materialize(@NotNull final Composer composer, @NotNull Modifier modifier) {
        if (modifier.all(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt.materialize.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new Function2<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier3, @NotNull Modifier.Element element) {
                boolean z = element instanceof ComposedModifier;
                Modifier modifierMaterialize = element;
                if (z) {
                    modifierMaterialize = ComposedModifierKt.materialize(composer, ((ComposedModifier) element).getFactory().invoke(Modifier.INSTANCE, composer, 0));
                }
                return modifier3.then(modifierMaterialize);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }
}
