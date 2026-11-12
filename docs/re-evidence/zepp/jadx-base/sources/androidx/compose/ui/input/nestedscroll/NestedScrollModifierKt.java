package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.huami.watch.companion.esim.AbsEsimOperation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", AbsEsimOperation.HEADER_CONNECTION, "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "nestedScroll", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class NestedScrollModifierKt {
    @NotNull
    public static final Modifier nestedScroll(@NotNull Modifier modifier, @NotNull final NestedScrollConnection nestedScrollConnection, @Nullable final NestedScrollDispatcher nestedScrollDispatcher) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("nestedScroll");
                inspectorInfo.getProperties().set(AbsEsimOperation.HEADER_CONNECTION, nestedScrollConnection);
                inspectorInfo.getProperties().set("dispatcher", nestedScrollDispatcher);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                composer.startReplaceableGroup(100476458);
                composer.startReplaceableGroup(-723524056);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                final NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
                if (nestedScrollDispatcher2 == null) {
                    composer.startReplaceableGroup(100476585);
                    composer.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new NestedScrollDispatcher();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    nestedScrollDispatcher2 = (NestedScrollDispatcher) objRememberedValue2;
                } else {
                    composer.startReplaceableGroup(100476571);
                }
                composer.endReplaceableGroup();
                final NestedScrollConnection nestedScrollConnection2 = nestedScrollConnection;
                composer.startReplaceableGroup(-3686095);
                boolean zChanged = composer.changed(nestedScrollConnection2) | composer.changed(nestedScrollDispatcher2) | composer.changed(coroutineScope);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new NestedScrollModifier(nestedScrollConnection2, coroutineScope) { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2$1$1
                        public final /* synthetic */ NestedScrollConnection $connection;
                        public final /* synthetic */ CoroutineScope $scope;

                        @NotNull
                        private final NestedScrollConnection connection;

                        @NotNull
                        private final NestedScrollDispatcher dispatcher;

                        {
                            this.$connection = nestedScrollConnection2;
                            this.$scope = coroutineScope;
                            this.$resolvedDispatcher.setOriginNestedScrollScope$ui_release(coroutineScope);
                            Unit unit = Unit.INSTANCE;
                            this.dispatcher = this.$resolvedDispatcher;
                            this.connection = nestedScrollConnection2;
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return NestedScrollModifier.DefaultImpls.all(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                            return NestedScrollModifier.DefaultImpls.any(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                            return (R) NestedScrollModifier.DefaultImpls.foldIn(this, r, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                            return (R) NestedScrollModifier.DefaultImpls.foldOut(this, r, function2);
                        }

                        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                        @NotNull
                        public NestedScrollConnection getConnection() {
                            return this.connection;
                        }

                        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                        @NotNull
                        public NestedScrollDispatcher getDispatcher() {
                            return this.dispatcher;
                        }

                        @Override // androidx.compose.ui.Modifier
                        @NotNull
                        public Modifier then(@NotNull Modifier modifier3) {
                            return NestedScrollModifier.DefaultImpls.then(this, modifier3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                NestedScrollModifierKt$nestedScroll$2$1$1 nestedScrollModifierKt$nestedScroll$2$1$1 = (NestedScrollModifierKt$nestedScroll$2$1$1) objRememberedValue3;
                composer.endReplaceableGroup();
                return nestedScrollModifierKt$nestedScroll$2$1$1;
            }
        });
    }

    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
