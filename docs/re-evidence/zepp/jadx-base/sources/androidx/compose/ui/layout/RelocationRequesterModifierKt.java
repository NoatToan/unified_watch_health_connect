package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/RelocationRequester;", "relocationRequester", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "child", "", "bringIntoView", "", "leadingEdge", "trailingEdge", "parentSize", "calculateOffset", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class RelocationRequesterModifierKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void bringIntoView(NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper, LayoutCoordinates layoutCoordinates) {
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper;
        Rect rectLocalBoundingBoxOf = nestedScrollDelegatingWrapper.localBoundingBoxOf(layoutCoordinates, false);
        nestedScrollDelegatingWrapper.getModifier().getConnection().mo198onPostScrollDzOQY0M(Offset.INSTANCE.m999getZeroF1C5BW0(), OffsetKt.Offset(calculateOffset(rectLocalBoundingBoxOf.getLeft(), rectLocalBoundingBoxOf.getRight(), IntSize.m3085getWidthimpl(nestedScrollDelegatingWrapper.mo2480getSizeYbymL2g())), calculateOffset(rectLocalBoundingBoxOf.getTop(), rectLocalBoundingBoxOf.getBottom(), IntSize.m3084getHeightimpl(nestedScrollDelegatingWrapper.mo2480getSizeYbymL2g()))), NestedScrollSource.INSTANCE.m2355getRelocateWNlRxjI());
        LayoutNodeWrapper wrappedBy = nestedScrollDelegatingWrapper.getWrappedBy();
        if (wrappedBy == null || (nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper = wrappedBy.findPreviousNestedScrollWrapper()) == null) {
            return;
        }
        bringIntoView(nestedScrollDelegatingWrapperFindPreviousNestedScrollWrapper, layoutCoordinates);
    }

    private static final float calculateOffset(float f, float f2, float f3) {
        if (f >= 0.0f && f2 <= f3) {
            return 0.0f;
        }
        if (f >= 0.0f || f2 <= f3) {
            return Math.abs(f) < Math.abs(f2 - f3) ? -f : f3 - f2;
        }
        return 0.0f;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier relocationRequester(@NotNull Modifier modifier, @NotNull final RelocationRequester relocationRequester) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.layout.RelocationRequesterModifierKt$relocationRequester$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("relocationRequester");
                inspectorInfo.getProperties().set("relocationRequester", relocationRequester);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.layout.RelocationRequesterModifierKt.relocationRequester.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(1518712278);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new RelocationRequesterModifier();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final RelocationRequesterModifier relocationRequesterModifier = (RelocationRequesterModifier) objRememberedValue;
                final RelocationRequester relocationRequester2 = relocationRequester;
                EffectsKt.DisposableEffect(relocationRequester2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.layout.RelocationRequesterModifierKt.relocationRequester.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        relocationRequester2.getModifiers$ui_release().add(relocationRequesterModifier);
                        final RelocationRequester relocationRequester3 = relocationRequester2;
                        final RelocationRequesterModifier relocationRequesterModifier2 = relocationRequesterModifier;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.layout.RelocationRequesterModifierKt$relocationRequester$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                relocationRequester3.getModifiers$ui_release().remove(relocationRequesterModifier2);
                            }
                        };
                    }
                }, composer, MutableVector.$stable);
                composer.endReplaceableGroup();
                return relocationRequesterModifier;
            }
        });
    }
}
