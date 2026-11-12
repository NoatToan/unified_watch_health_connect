package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.e;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\"\u001f\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", Constants.ENABLED, "cursor", "Landroidx/compose/ui/unit/Dp;", "DefaultCursorThickness", "F", "getDefaultCursorThickness", "()F", "Landroidx/compose/animation/core/AnimationSpec;", "", "getCursorAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "cursorAnimationSpec", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class TextFieldCursorKt {
    private static final float DefaultCursorThickness = Dp.m2965constructorimpl(2);

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull final TextFieldState textFieldState, @NotNull final TextFieldValue textFieldValue, @NotNull final OffsetMapping offsetMapping, @NotNull final Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00281(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C00281> continuation) {
                    super(2, continuation);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C00281(this.$cursorAlpha, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                        Float fBoxFloat = Boxing.boxFloat(0.0f);
                        AnimationSpec cursorAnimationSpec = TextFieldCursorKt.getCursorAnimationSpec();
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, cursorAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                boolean z2;
                Modifier modifierDrawWithContent;
                composer.startReplaceableGroup(-1201392955);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Animatable animatable = (Animatable) objRememberedValue;
                Brush brush2 = brush;
                if (brush2 instanceof SolidColor) {
                    z2 = (((SolidColor) brush2).getValue() > Color.INSTANCE.m1248getUnspecified0d7_KjU() ? 1 : (((SolidColor) brush2).getValue() == Color.INSTANCE.m1248getUnspecified0d7_KjU() ? 0 : -1)) == 0 ? false : true;
                }
                if (textFieldState.getHasFocus() && TextRange.m2718getCollapsedimpl(textFieldValue.getSelection()) && z2) {
                    composer.startReplaceableGroup(-1201392739);
                    EffectsKt.LaunchedEffect(brush, textFieldValue.getText(), TextRange.m2712boximpl(textFieldValue.getSelection()), new C00281(animatable, null), composer, 0);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final TextFieldState textFieldState2 = textFieldState;
                    final Brush brush3 = brush;
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                            TextLayoutResult value;
                            contentDrawScope.drawContent();
                            float fCoerceIn = e.coerceIn(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (fCoerceIn == 0.0f) {
                                return;
                            }
                            int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m2724getStartimpl(textFieldValue2.getSelection()));
                            TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                            Rect rect = null;
                            if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                                rect = value.getCursorRect(iOriginalToTransformed);
                            }
                            if (rect == null) {
                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float fMo193toPx0680j_4 = contentDrawScope.mo193toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                            float f = fMo193toPx0680j_4 / 2;
                            float fCoerceAtMost = e.coerceAtMost(rect.getLeft() + f, Size.m1052getWidthimpl(contentDrawScope.mo1585getSizeNHjbRc()) - f);
                            DrawScope.DefaultImpls.m1619drawLine1RTmtNc$default(contentDrawScope, brush3, OffsetKt.Offset(fCoerceAtMost, rect.getTop()), OffsetKt.Offset(fCoerceAtMost, rect.getBottom()), fMo193toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
                        }
                    });
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1201391656);
                    composer.endReplaceableGroup();
                    modifierDrawWithContent = Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                return modifierDrawWithContent;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> getCursorAnimationSpec() {
        return AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                keyframesSpecConfig.setDurationMillis(1000);
                Float fValueOf = Float.valueOf(1.0f);
                keyframesSpecConfig.at(fValueOf, 0);
                keyframesSpecConfig.at(fValueOf, 499);
                Float fValueOf2 = Float.valueOf(0.0f);
                keyframesSpecConfig.at(fValueOf2, 500);
                keyframesSpecConfig.at(fValueOf2, 999);
            }
        }), null, 2, null);
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
