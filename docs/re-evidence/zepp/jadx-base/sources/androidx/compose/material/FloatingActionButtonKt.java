package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ar\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"\u0019\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0019\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0019\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "text", "icon", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "Landroidx/compose/ui/unit/Dp;", "FabSize", "F", "ExtendedFabSize", "ExtendedFabIconPadding", "ExtendedFabTextPadding", "material_release"}, k = 2, mv = {1, 5, 1})
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m2965constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m2965constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m2965constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m2965constructorimpl(20);

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:123:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0170  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:157:0x026b  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    @Composable
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    public static final void m714ExtendedFloatingActionButtonwqdebIU(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        int i7;
        int i8;
        int i9;
        Shape shape2;
        long j3;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeCopy;
        long jM640getSecondary0d7_KjU;
        long jM656contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevationM713elevationixp7dh8;
        long j4;
        final int i10;
        Shape shape3;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        Object objRememberedValue;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(223642380);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        function4 = function3;
                        if (composerStartRestartGroup.changed(function4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i & 458752) == 0) {
                            if ((i2 & 32) == 0) {
                                shape2 = shape;
                                int i13 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                                i3 |= i13;
                            } else {
                                shape2 = shape;
                            }
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 3670016) == 0) {
                            j3 = j;
                            if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j3)) {
                                i12 = 524288;
                            } else {
                                i12 = 1048576;
                            }
                            i3 |= i12;
                        } else {
                            j3 = j;
                        }
                        if ((i & 29360128) != 0) {
                            if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) {
                                i11 = 4194304;
                            } else {
                                i11 = 8388608;
                            }
                            i3 |= i11;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0) {
                                floatingActionButtonElevation2 = floatingActionButtonElevation;
                                int i14 = composerStartRestartGroup.changed(floatingActionButtonElevation2) ? 67108864 : 33554432;
                                i3 |= i14;
                            } else {
                                floatingActionButtonElevation2 = floatingActionButtonElevation;
                            }
                            i3 |= i14;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        if (((191739611 & i3) ^ 38347922) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.startDefaults();
                                if (i4 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                } else {
                                    function5 = function4;
                                }
                                if (i8 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & 32) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i3 &= -458753;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    jM640getSecondary0d7_KjU = j3;
                                }
                                if ((i2 & 128) != 0) {
                                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    jM656contentColorForek8zF_U = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                    i3 &= -234881025;
                                } else {
                                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                                }
                                composerStartRestartGroup.endDefaults();
                                j4 = jM656contentColorForek8zF_U;
                                long j7 = jM640getSecondary0d7_KjU;
                                i10 = i3;
                                shape3 = shapeCopy;
                                function4 = function5;
                                modifier2 = modifier3;
                                floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                                j3 = j7;
                            } else {
                                composerStartRestartGroup.skipCurrentGroup();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                i10 = i3;
                                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                                shape3 = shape2;
                                j4 = j2;
                            }
                            float f = ExtendedFabSize;
                            Modifier modifierM325sizeInqDBjuR0$default = SizeKt.m325sizeInqDBjuR0$default(modifier2, f, f, 0.0f, 0.0f, 12, null);
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i15) {
                                    if (((i15 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment center = companion2.getCenter();
                                    Function2<Composer, Integer, Unit> function7 = function4;
                                    Function2<Composer, Integer, Unit> function8 = function2;
                                    int i16 = i10;
                                    composer2.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-1435223726);
                                    if (function7 == null) {
                                        composer2.startReplaceableGroup(-1435223708);
                                        function8.invoke(composer2, Integer.valueOf(i16 & 14));
                                        composer2.endReplaceableGroup();
                                    } else {
                                        composer2.startReplaceableGroup(-1435223664);
                                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                        composer2.startReplaceableGroup(-1989997546);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                        composer2.startReplaceableGroup(1376089335);
                                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor2);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composer2.disableReusing();
                                        Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                        composer2.enableReusing();
                                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-326682743);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        composer2.startReplaceableGroup(586134669);
                                        function7.invoke(composer2, Integer.valueOf((i16 >> 9) & 14));
                                        SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                        function8.invoke(composer2, Integer.valueOf(i16 & 14));
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                            });
                            int i15 = 12582912 | ((i10 >> 3) & 14);
                            int i16 = i10 >> 6;
                            m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda, composerStartRestartGroup, i15 | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
                            shape2 = shape3;
                            long j8 = j4;
                            floatingActionButtonElevation2 = floatingActionButtonElevation3;
                            function6 = function4;
                            j5 = j3;
                            j6 = j8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource2 = mutableInteractionSource;
                            function6 = function4;
                            j5 = j3;
                            j6 = j2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier2;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        final Shape shape4 = shape2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i17) {
                                FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier4, function6, mutableInteractionSource3, shape4, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (composerStartRestartGroup.changed(shape2)) {
                            }
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) == 0) {
                        j3 = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                            }
                            i3 |= i14;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (((191739611 & i3) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j9 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j9;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j10 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j10;
                        }
                        float f2 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default2 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f2, f2, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i17) {
                                if (((i17 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i18 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i18 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i18 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i18 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i17 = 12582912 | ((i10 >> 3) & 14);
                        int i18 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default2, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda2, composerStartRestartGroup, i17 | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i18) | (458752 & i18) | (i18 & 3670016), 0);
                        shape2 = shape3;
                        long j11 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j11;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j12 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j12;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j13 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j13;
                        }
                        float f3 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default3 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f3, f3, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i19) {
                                if (((i19 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i110 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i110 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i110 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i110 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i19 = 12582912 | ((i10 >> 3) & 14);
                        int i110 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default3, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda3, composerStartRestartGroup, i19 | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i110) | (458752 & i110) | (i110 & 3670016), 0);
                        shape2 = shape3;
                        long j14 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j14;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier2;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final Shape shape5 = shape2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier5, function6, mutableInteractionSource4, shape5, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                function4 = function3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (composerStartRestartGroup.changed(shape2)) {
                            }
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) == 0) {
                        j3 = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                            }
                            i3 |= i14;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (((191739611 & i3) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j15 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j15;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j16 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j16;
                        }
                        float f4 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default4 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f4, f4, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i111) {
                                if (((i111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i112 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i112 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i112 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i112 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i111 = 12582912 | ((i10 >> 3) & 14);
                        int i112 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default4, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda4, composerStartRestartGroup, i111 | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                        shape2 = shape3;
                        long j17 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j17;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j18 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j18;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j19 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j19;
                        }
                        float f5 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default5 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f5, f5, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i113) {
                                if (((i113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i114 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i114 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i114 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i114 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i113 = 12582912 | ((i10 >> 3) & 14);
                        int i114 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default5, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda5, composerStartRestartGroup, i113 | (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i114) | (458752 & i114) | (i114 & 3670016), 0);
                        shape2 = shape3;
                        long j110 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier2;
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                    final Shape shape6 = shape2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i115) {
                            FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier6, function6, mutableInteractionSource5, shape6, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j111 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j112 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j112;
                    }
                    float f6 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default6 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f6, f6, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i115) {
                            if (((i115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i116 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i116 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i116 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i116 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i115 = 12582912 | ((i10 >> 3) & 14);
                    int i116 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default6, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda6, composerStartRestartGroup, i115 | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i116) | (458752 & i116) | (i116 & 3670016), 0);
                    shape2 = shape3;
                    long j113 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j113;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j114 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j114;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j115 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j115;
                    }
                    float f7 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default7 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f7, f7, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i117) {
                            if (((i117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i118 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i118 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i118 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i118 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i117 = 12582912 | ((i10 >> 3) & 14);
                    int i118 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default7, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda7, composerStartRestartGroup, i117 | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i118) | (458752 & i118) | (i118 & 3670016), 0);
                    shape2 = shape3;
                    long j116 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier2;
                final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                final Shape shape7 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i119) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier7, function6, mutableInteractionSource6, shape7, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            modifier2 = modifier;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (composerStartRestartGroup.changed(shape2)) {
                            }
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) == 0) {
                        j3 = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                            }
                            i3 |= i14;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (((191739611 & i3) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j117 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j117;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j118 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j118;
                        }
                        float f8 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default8 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f8, f8, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i119) {
                                if (((i119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i1110 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i1110 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i1110 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i1110 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i119 = 12582912 | ((i10 >> 3) & 14);
                        int i1110 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default8, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda8, composerStartRestartGroup, i119 | (i1110 & 896) | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1110) | (458752 & i1110) | (i1110 & 3670016), 0);
                        shape2 = shape3;
                        long j119 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j119;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j1110 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j1110;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j1111 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j1111;
                        }
                        float f9 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default9 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f9, f9, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i1111) {
                                if (((i1111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i1112 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i1112 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i1112 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i1112 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i1111 = 12582912 | ((i10 >> 3) & 14);
                        int i1112 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default9, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda9, composerStartRestartGroup, i1111 | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1112) | (458752 & i1112) | (i1112 & 3670016), 0);
                        shape2 = shape3;
                        long j1112 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j1112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier2;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                    final Shape shape8 = shape2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier8, function6, mutableInteractionSource7, shape8, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1113 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1114 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1114;
                    }
                    float f10 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default10 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f10, f10, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            if (((i1113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i1114 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i1114 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i1114 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i1114 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1113 = 12582912 | ((i10 >> 3) & 14);
                    int i1114 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default10, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda10, composerStartRestartGroup, i1113 | (i1114 & 896) | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1114) | (458752 & i1114) | (i1114 & 3670016), 0);
                    shape2 = shape3;
                    long j1115 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j1115;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1116 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1116;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1117 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1117;
                    }
                    float f11 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default11 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f11, f11, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1115) {
                            if (((i1115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i1116 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i1116 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i1116 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i1116 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1115 = 12582912 | ((i10 >> 3) & 14);
                    int i1116 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default11, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda11, composerStartRestartGroup, i1115 | (i1116 & 896) | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1116) | (458752 & i1116) | (i1116 & 3670016), 0);
                    shape2 = shape3;
                    long j1118 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j1118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier2;
                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                final Shape shape9 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier9, function6, mutableInteractionSource8, shape9, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function4 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1119 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11110 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11110;
                    }
                    float f12 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default12 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f12, f12, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1117) {
                            if (((i1117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i1118 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i1118 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i1118 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i1118 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1117 = 12582912 | ((i10 >> 3) & 14);
                    int i1118 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default12, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda12, composerStartRestartGroup, i1117 | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1118) | (458752 & i1118) | (i1118 & 3670016), 0);
                    shape2 = shape3;
                    long j11111 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j11111;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11112 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11113 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11113;
                    }
                    float f13 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default13 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f13, f13, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1119) {
                            if (((i1119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i11110 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i11110 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i11110 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i11110 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1119 = 12582912 | ((i10 >> 3) & 14);
                    int i11110 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default13, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda13, composerStartRestartGroup, i1119 | (i11110 & 896) | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016), 0);
                    shape2 = shape3;
                    long j11114 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j11114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier2;
                final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                final Shape shape10 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11111) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier10, function6, mutableInteractionSource9, shape10, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i14;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if (((191739611 & i3) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11115 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11116 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11116;
                }
                float f14 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default14 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f14, f14, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11111) {
                        if (((i11111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i11112 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i11112 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i11112 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i11112 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11111 = 12582912 | ((i10 >> 3) & 14);
                int i11112 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default14, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda14, composerStartRestartGroup, i11111 | (i11112 & 896) | (i11112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11112) | (458752 & i11112) | (i11112 & 3670016), 0);
                shape2 = shape3;
                long j11117 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j11117;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11118 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11119 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11119;
                }
                float f15 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default15 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f15, f15, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11113) {
                        if (((i11113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i11114 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i11114 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i11114 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i11114 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11113 = 12582912 | ((i10 >> 3) & 14);
                int i11114 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default15, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda15, composerStartRestartGroup, i11113 | (i11114 & 896) | (i11114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016), 0);
                shape2 = shape3;
                long j111110 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j111110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier2;
            final MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
            final Shape shape11 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11115) {
                    FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier11, function6, mutableInteractionSource10, shape11, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changed(function4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (composerStartRestartGroup.changed(shape2)) {
                            }
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) == 0) {
                        j3 = j;
                        if ((i2 & 64) == 0) {
                            i12 = 524288;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i11 = 4194304;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                            }
                            i3 |= i14;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (((191739611 & i3) ^ 38347922) == 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j111111 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j111111;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j111112 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j111112;
                        }
                        float f16 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default16 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f16, f16, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i11115) {
                                if (((i11115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i11116 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i11116 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i11116 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i11116 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i11115 = 12582912 | ((i10 >> 3) & 14);
                        int i11116 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default16, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda16, composerStartRestartGroup, i11115 | (i11116 & 896) | (i11116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11116) | (458752 & i11116) | (i11116 & 3670016), 0);
                        shape2 = shape3;
                        long j111113 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j111113;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j111114 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j111114;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i4 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shapeCopy = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM640getSecondary0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                                i3 &= -234881025;
                            } else {
                                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                            }
                            composerStartRestartGroup.endDefaults();
                            j4 = jM656contentColorForek8zF_U;
                            long j111115 = jM640getSecondary0d7_KjU;
                            i10 = i3;
                            shape3 = shapeCopy;
                            function4 = function5;
                            modifier2 = modifier3;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                            j3 = j111115;
                        }
                        float f17 = ExtendedFabSize;
                        Modifier modifierM325sizeInqDBjuR0$default17 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f17, f17, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i11117) {
                                if (((i11117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                Function2<Composer, Integer, Unit> function7 = function4;
                                Function2<Composer, Integer, Unit> function8 = function2;
                                int i11118 = i10;
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-1435223726);
                                if (function7 == null) {
                                    composer2.startReplaceableGroup(-1435223708);
                                    function8.invoke(composer2, Integer.valueOf(i11118 & 14));
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-1435223664);
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer2.startReplaceableGroup(-1989997546);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(586134669);
                                    function7.invoke(composer2, Integer.valueOf((i11118 >> 9) & 14));
                                    SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                    function8.invoke(composer2, Integer.valueOf(i11118 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        });
                        int i11117 = 12582912 | ((i10 >> 3) & 14);
                        int i11118 = i10 >> 6;
                        m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default17, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda17, composerStartRestartGroup, i11117 | (i11118 & 896) | (i11118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11118) | (458752 & i11118) | (i11118 & 3670016), 0);
                        shape2 = shape3;
                        long j111116 = j4;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        function6 = function4;
                        j5 = j3;
                        j6 = j111116;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier2;
                    final MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                    final Shape shape12 = shape2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11119) {
                            FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier12, function6, mutableInteractionSource11, shape12, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j111117 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j111117;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j111118 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j111118;
                    }
                    float f18 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default18 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f18, f18, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11119) {
                            if (((i11119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i111110 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i111110 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i111110 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i111110 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i11119 = 12582912 | ((i10 >> 3) & 14);
                    int i111110 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default18, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda18, composerStartRestartGroup, i11119 | (i111110 & 896) | (i111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111110) | (458752 & i111110) | (i111110 & 3670016), 0);
                    shape2 = shape3;
                    long j111119 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j111119;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111110 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111110;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111111 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111111;
                    }
                    float f19 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default19 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f19, f19, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111111) {
                            if (((i111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i111112 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i111112 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i111112 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i111112 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111111 = 12582912 | ((i10 >> 3) & 14);
                    int i111112 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default19, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda19, composerStartRestartGroup, i111111 | (i111112 & 896) | (i111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111112) | (458752 & i111112) | (i111112 & 3670016), 0);
                    shape2 = shape3;
                    long j1111112 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j1111112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier2;
                final MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                final Shape shape13 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i111113) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier13, function6, mutableInteractionSource12, shape13, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            function4 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111113 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111114 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111114;
                    }
                    float f110 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default110 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f110, f110, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111113) {
                            if (((i111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i111114 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i111114 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i111114 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i111114 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111113 = 12582912 | ((i10 >> 3) & 14);
                    int i111114 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default110, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda110, composerStartRestartGroup, i111113 | (i111114 & 896) | (i111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111114) | (458752 & i111114) | (i111114 & 3670016), 0);
                    shape2 = shape3;
                    long j1111115 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j1111115;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111116 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111116;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j1111117 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j1111117;
                    }
                    float f111 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default111 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f111, f111, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111115) {
                            if (((i111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i111116 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i111116 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i111116 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i111116 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i111115 = 12582912 | ((i10 >> 3) & 14);
                    int i111116 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default111, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda111, composerStartRestartGroup, i111115 | (i111116 & 896) | (i111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111116) | (458752 & i111116) | (i111116 & 3670016), 0);
                    shape2 = shape3;
                    long j1111118 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j1111118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier2;
                final MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                final Shape shape14 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i111117) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier14, function6, mutableInteractionSource13, shape14, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i14;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if (((191739611 & i3) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j1111119 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j1111119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11111110 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11111110;
                }
                float f112 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default112 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f112, f112, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i111117) {
                        if (((i111117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i111118 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i111118 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i111118 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i111118 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i111117 = 12582912 | ((i10 >> 3) & 14);
                int i111118 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default112, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda112, composerStartRestartGroup, i111117 | (i111118 & 896) | (i111118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i111118) | (458752 & i111118) | (i111118 & 3670016), 0);
                shape2 = shape3;
                long j11111111 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j11111111;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11111112 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11111112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j11111113 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j11111113;
                }
                float f113 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default113 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f113, f113, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i111119) {
                        if (((i111119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i1111110 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i1111110 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i1111110 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i1111110 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i111119 = 12582912 | ((i10 >> 3) & 14);
                int i1111110 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default113, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda113, composerStartRestartGroup, i111119 | (i1111110 & 896) | (i1111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111110) | (458752 & i1111110) | (i1111110 & 3670016), 0);
                shape2 = shape3;
                long j11111114 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j11111114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier2;
            final MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
            final Shape shape15 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111111) {
                    FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier15, function6, mutableInteractionSource14, shape15, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changed(function4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    if ((i2 & 64) == 0) {
                        i12 = 524288;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i11 = 4194304;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                        }
                        i3 |= i14;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if (((191739611 & i3) ^ 38347922) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11111115 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11111115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11111116 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11111116;
                    }
                    float f114 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default114 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f114, f114, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1111111) {
                            if (((i1111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i1111112 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i1111112 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i1111112 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i1111112 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1111111 = 12582912 | ((i10 >> 3) & 14);
                    int i1111112 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default114, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda114, composerStartRestartGroup, i1111111 | (i1111112 & 896) | (i1111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111112) | (458752 & i1111112) | (i1111112 & 3670016), 0);
                    shape2 = shape3;
                    long j11111117 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j11111117;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11111118 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11111118;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i2 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -458753;
                        } else {
                            shapeCopy = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM640getSecondary0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                        }
                        composerStartRestartGroup.endDefaults();
                        j4 = jM656contentColorForek8zF_U;
                        long j11111119 = jM640getSecondary0d7_KjU;
                        i10 = i3;
                        shape3 = shapeCopy;
                        function4 = function5;
                        modifier2 = modifier3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        j3 = j11111119;
                    }
                    float f115 = ExtendedFabSize;
                    Modifier modifierM325sizeInqDBjuR0$default115 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f115, f115, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1111113) {
                            if (((i1111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            Function2<Composer, Integer, Unit> function7 = function4;
                            Function2<Composer, Integer, Unit> function8 = function2;
                            int i1111114 = i10;
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-1435223726);
                            if (function7 == null) {
                                composer2.startReplaceableGroup(-1435223708);
                                function8.invoke(composer2, Integer.valueOf(i1111114 & 14));
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-1435223664);
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(586134669);
                                function7.invoke(composer2, Integer.valueOf((i1111114 >> 9) & 14));
                                SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                                function8.invoke(composer2, Integer.valueOf(i1111114 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    });
                    int i1111113 = 12582912 | ((i10 >> 3) & 14);
                    int i1111114 = i10 >> 6;
                    m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default115, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda115, composerStartRestartGroup, i1111113 | (i1111114 & 896) | (i1111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111114) | (458752 & i1111114) | (i1111114 & 3670016), 0);
                    shape2 = shape3;
                    long j111111110 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    function6 = function4;
                    j5 = j3;
                    j6 = j111111110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier2;
                final MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                final Shape shape16 = shape2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1111115) {
                        FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier16, function6, mutableInteractionSource15, shape16, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i14;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if (((191739611 & i3) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111111 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111112 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111112;
                }
                float f116 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default116 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f116, f116, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1111115) {
                        if (((i1111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i1111116 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i1111116 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i1111116 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i1111116 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111115 = 12582912 | ((i10 >> 3) & 14);
                int i1111116 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default116, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda116, composerStartRestartGroup, i1111115 | (i1111116 & 896) | (i1111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111116) | (458752 & i1111116) | (i1111116 & 3670016), 0);
                shape2 = shape3;
                long j111111113 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j111111113;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111114 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111115 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111115;
                }
                float f117 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default117 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f117, f117, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1111117) {
                        if (((i1111117 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i1111118 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i1111118 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i1111118 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i1111118 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111117 = 12582912 | ((i10 >> 3) & 14);
                int i1111118 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default117, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda117, composerStartRestartGroup, i1111117 | (i1111118 & 896) | (i1111118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i1111118) | (458752 & i1111118) | (i1111118 & 3670016), 0);
                shape2 = shape3;
                long j111111116 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j111111116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier2;
            final MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
            final Shape shape17 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111119) {
                    FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier17, function6, mutableInteractionSource16, shape17, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function4 = function3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i & 3670016) == 0) {
                j3 = j;
                if ((i2 & 64) == 0) {
                    i12 = 524288;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i11 = 4194304;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i3 |= i14;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i3 |= i14;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if (((191739611 & i3) ^ 38347922) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111117 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j111111118 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j111111118;
                }
                float f118 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default118 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f118, f118, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1111119) {
                        if (((i1111119 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i11111110 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i11111110 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i11111110 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i11111110 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i1111119 = 12582912 | ((i10 >> 3) & 14);
                int i11111110 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default118, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda118, composerStartRestartGroup, i1111119 | (i11111110 & 896) | (i11111110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111110) | (458752 & i11111110) | (i11111110 & 3670016), 0);
                shape2 = shape3;
                long j111111119 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j111111119;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j1111111110 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j1111111110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i2 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i3 &= -458753;
                    } else {
                        shapeCopy = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM640getSecondary0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        i3 &= -234881025;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j4 = jM656contentColorForek8zF_U;
                    long j1111111111 = jM640getSecondary0d7_KjU;
                    i10 = i3;
                    shape3 = shapeCopy;
                    function4 = function5;
                    modifier2 = modifier3;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                    j3 = j1111111111;
                }
                float f119 = ExtendedFabSize;
                Modifier modifierM325sizeInqDBjuR0$default119 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f119, f119, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11111111) {
                        if (((i11111111 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        Function2<Composer, Integer, Unit> function7 = function4;
                        Function2<Composer, Integer, Unit> function8 = function2;
                        int i11111112 = i10;
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1435223726);
                        if (function7 == null) {
                            composer2.startReplaceableGroup(-1435223708);
                            function8.invoke(composer2, Integer.valueOf(i11111112 & 14));
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1435223664);
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(586134669);
                            function7.invoke(composer2, Integer.valueOf((i11111112 >> 9) & 14));
                            SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                            function8.invoke(composer2, Integer.valueOf(i11111112 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                });
                int i11111111 = 12582912 | ((i10 >> 3) & 14);
                int i11111112 = i10 >> 6;
                m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default119, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda119, composerStartRestartGroup, i11111111 | (i11111112 & 896) | (i11111112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111112) | (458752 & i11111112) | (i11111112 & 3670016), 0);
                shape2 = shape3;
                long j1111111112 = j4;
                floatingActionButtonElevation2 = floatingActionButtonElevation3;
                function6 = function4;
                j5 = j3;
                j6 = j1111111112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier2;
            final MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
            final Shape shape18 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11111113) {
                    FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier18, function6, mutableInteractionSource17, shape18, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            i3 |= i13;
        } else {
            shape2 = shape;
        }
        if ((i & 3670016) == 0) {
            j3 = j;
            if ((i2 & 64) == 0) {
                i12 = 524288;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        } else {
            j3 = j;
        }
        if ((i & 29360128) != 0) {
            if ((i2 & 128) == 0) {
                i11 = 4194304;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i & 234881024) == 0) {
            if ((i2 & 256) == 0) {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                }
                i3 |= i14;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i3 |= i14;
        } else {
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        if (((191739611 & i3) ^ 38347922) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i3 &= -458753;
                } else {
                    shapeCopy = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM640getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    i3 &= -234881025;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                }
                composerStartRestartGroup.endDefaults();
                j4 = jM656contentColorForek8zF_U;
                long j1111111113 = jM640getSecondary0d7_KjU;
                i10 = i3;
                shape3 = shapeCopy;
                function4 = function5;
                modifier2 = modifier3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                j3 = j1111111113;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i3 &= -458753;
                } else {
                    shapeCopy = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM640getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    i3 &= -234881025;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                }
                composerStartRestartGroup.endDefaults();
                j4 = jM656contentColorForek8zF_U;
                long j1111111114 = jM640getSecondary0d7_KjU;
                i10 = i3;
                shape3 = shapeCopy;
                function4 = function5;
                modifier2 = modifier3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                j3 = j1111111114;
            }
            float f1110 = ExtendedFabSize;
            Modifier modifierM325sizeInqDBjuR0$default1110 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f1110, f1110, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i11111113) {
                    if (((i11111113 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment center = companion2.getCenter();
                    Function2<Composer, Integer, Unit> function7 = function4;
                    Function2<Composer, Integer, Unit> function8 = function2;
                    int i11111114 = i10;
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1435223726);
                    if (function7 == null) {
                        composer2.startReplaceableGroup(-1435223708);
                        function8.invoke(composer2, Integer.valueOf(i11111114 & 14));
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1435223664);
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(586134669);
                        function7.invoke(composer2, Integer.valueOf((i11111114 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        function8.invoke(composer2, Integer.valueOf(i11111114 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i11111113 = 12582912 | ((i10 >> 3) & 14);
            int i11111114 = i10 >> 6;
            m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default1110, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda1110, composerStartRestartGroup, i11111113 | (i11111114 & 896) | (i11111114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111114) | (458752 & i11111114) | (i11111114 & 3670016), 0);
            shape2 = shape3;
            long j1111111115 = j4;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
            function6 = function4;
            j5 = j3;
            j6 = j1111111115;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i3 &= -458753;
                } else {
                    shapeCopy = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM640getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    i3 &= -234881025;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                }
                composerStartRestartGroup.endDefaults();
                j4 = jM656contentColorForek8zF_U;
                long j1111111116 = jM640getSecondary0d7_KjU;
                i10 = i3;
                shape3 = shapeCopy;
                function4 = function5;
                modifier2 = modifier3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                j3 = j1111111116;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i2 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i3 &= -458753;
                } else {
                    shapeCopy = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM640getSecondary0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    i3 &= -234881025;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation2;
                }
                composerStartRestartGroup.endDefaults();
                j4 = jM656contentColorForek8zF_U;
                long j1111111117 = jM640getSecondary0d7_KjU;
                i10 = i3;
                shape3 = shapeCopy;
                function4 = function5;
                modifier2 = modifier3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                j3 = j1111111117;
            }
            float f1111 = ExtendedFabSize;
            Modifier modifierM325sizeInqDBjuR0$default1111 = SizeKt.m325sizeInqDBjuR0$default(modifier2, f1111, f1111, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890049, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i11111115) {
                    if (((i11111115 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM285paddingqDBjuR0$default = PaddingKt.m285paddingqDBjuR0$default(companion, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 10, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment center = companion2.getCenter();
                    Function2<Composer, Integer, Unit> function7 = function4;
                    Function2<Composer, Integer, Unit> function8 = function2;
                    int i11111116 = i10;
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM285paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer2);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1435223726);
                    if (function7 == null) {
                        composer2.startReplaceableGroup(-1435223708);
                        function8.invoke(composer2, Integer.valueOf(i11111116 & 14));
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1435223664);
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer2);
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(586134669);
                        function7.invoke(composer2, Integer.valueOf((i11111116 >> 9) & 14));
                        SpacerKt.Spacer(SizeKt.m326width3ABfNKs(companion, FloatingActionButtonKt.ExtendedFabIconPadding), composer2, 6);
                        function8.invoke(composer2, Integer.valueOf(i11111116 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            });
            int i11111115 = 12582912 | ((i10 >> 3) & 14);
            int i11111116 = i10 >> 6;
            m715FloatingActionButtonbogVsAg(function0, modifierM325sizeInqDBjuR0$default1111, mutableInteractionSource2, shape3, j3, j4, floatingActionButtonElevation3, composableLambda1111, composerStartRestartGroup, i11111115 | (i11111116 & 896) | (i11111116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i11111116) | (458752 & i11111116) | (i11111116 & 3670016), 0);
            shape2 = shape3;
            long j1111111118 = j4;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
            function6 = function4;
            j5 = j3;
            j6 = j1111111118;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier2;
        final MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
        final Shape shape19 = shape2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11111117) {
                FloatingActionButtonKt.m714ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier19, function6, mutableInteractionSource18, shape19, j5, j6, floatingActionButtonElevation2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:116:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:137:0x024d  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    @Composable
    /* JADX INFO: renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    public static final void m715FloatingActionButtonbogVsAg(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        Shape shapeCopy;
        long jM640getSecondary0d7_KjU;
        final long jM656contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevationM713elevationixp7dh8;
        int i6;
        Object objRememberedValue;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final MutableInteractionSource mutableInteractionSource3;
        final long j3;
        final Modifier modifier3;
        final Shape shape2;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2057936914);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        shapeCopy = shape;
                        int i9 = composerStartRestartGroup.changed(shapeCopy) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        shapeCopy = shape;
                    }
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                if ((i & 57344) == 0) {
                    jM640getSecondary0d7_KjU = j;
                    if ((i2 & 16) == 0 || !composerStartRestartGroup.changed(jM640getSecondary0d7_KjU)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                } else {
                    jM640getSecondary0d7_KjU = j;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        int i10 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i3 |= i10;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                        int i11 = composerStartRestartGroup.changed(floatingActionButtonElevationM713elevationixp7dh8) ? 1048576 : 524288;
                        i3 |= i11;
                    } else {
                        floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                    }
                    if (((23967451 & i3) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-3687241);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                            }
                            if ((i2 & 16) != 0) {
                                jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        final int i12 = i3;
                        long j5 = jM640getSecondary0d7_KjU;
                        FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM713elevationixp7dh8;
                        int i13 = i12 >> 3;
                        SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j5, jM656contentColorForek8zF_U, null, floatingActionButtonElevation3.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i14) {
                                if (((i14 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                                final Function2<Composer, Integer, Unit> function3 = function2;
                                final int i15 = i12;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i16) {
                                        if (((i16 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                        final Function2<Composer, Integer, Unit> function4 = function3;
                                        final int i17 = i15;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i18) {
                                                if (((i18 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                Function2<Composer, Integer, Unit> function5 = function4;
                                                int i19 = i17;
                                                composer4.startReplaceableGroup(-1990474327);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                                composer4.startReplaceableGroup(1376089335);
                                                Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                composer4.enableReusing();
                                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-1253629305);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(638020661);
                                                function5.invoke(composer4, Integer.valueOf((i19 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                            }
                                        }), composer3, 48);
                                    }
                                }), composer2, 56);
                            }
                        }), composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i13 & 57344) | ((i12 << 15) & 29360128), 384, 1568);
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        j3 = j5;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j4 = jM656contentColorForek8zF_U;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j4 = jM656contentColorForek8zF_U;
                        j3 = jM640getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM713elevationixp7dh8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i14) {
                            FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i6 = 12582912;
                i3 |= i6;
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i14 = i3;
                    long j6 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i15 = i14 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j6, jM656contentColorForek8zF_U, null, floatingActionButtonElevation4.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i14 >> 6) & 14) | ((i14 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i16) {
                            if (((i16 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i17 = i14;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i18) {
                                    if (((i18 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i19 = i17;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i110) {
                                            if (((i110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i111 = i19;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i111 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i14 & 14) | (i14 & 112) | (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i15 & 57344) | ((i14 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j6;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i16 = i3;
                    long j7 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i17 = i16 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j7, jM656contentColorForek8zF_U, null, floatingActionButtonElevation5.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i18) {
                            if (((i18 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i19 = i16;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i110) {
                                    if (((i110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i111 = i19;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i112) {
                                            if (((i112 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i113 = i111;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i113 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i16 & 14) | (i16 & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i17 & 57344) | ((i16 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation5;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j7;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i18) {
                        FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                    }
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            if ((i & 57344) == 0) {
                jM640getSecondary0d7_KjU = j;
                if ((i2 & 16) == 0) {
                    i7 = 8192;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            } else {
                jM640getSecondary0d7_KjU = j;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i10;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM713elevationixp7dh8)) {
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i18 = i3;
                    long j8 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i19 = i18 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j8, jM656contentColorForek8zF_U, null, floatingActionButtonElevation6.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i18 >> 6) & 14) | ((i18 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i110) {
                            if (((i110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i111 = i18;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i112) {
                                    if (((i112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i113 = i111;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i114) {
                                            if (((i114 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i115 = i113;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i115 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i18 & 14) | (i18 & 112) | (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344) | ((i18 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation6;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j8;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i110 = i3;
                    long j9 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i111 = i110 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j9, jM656contentColorForek8zF_U, null, floatingActionButtonElevation7.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i110 >> 6) & 14) | ((i110 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i112) {
                            if (((i112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i113 = i110;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i114) {
                                    if (((i114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i115 = i113;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i116) {
                                            if (((i116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i117 = i115;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i117 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i110 & 14) | (i110 & 112) | (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i111 & 57344) | ((i110 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation7;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j9;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i112) {
                        FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i112 = i3;
                long j10 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationM713elevationixp7dh8;
                int i113 = i112 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j10, jM656contentColorForek8zF_U, null, floatingActionButtonElevation8.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i112 >> 6) & 14) | ((i112 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i114) {
                        if (((i114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i115 = i112;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i116) {
                                if (((i116 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i117 = i115;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i118) {
                                        if (((i118 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i119 = i117;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i119 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i112 & 14) | (i112 & 112) | (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i113 & 57344) | ((i112 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation8;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j10;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i114 = i3;
                long j11 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationM713elevationixp7dh8;
                int i115 = i114 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j11, jM656contentColorForek8zF_U, null, floatingActionButtonElevation9.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i114 >> 6) & 14) | ((i114 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i116) {
                        if (((i116 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i117 = i114;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i118) {
                                if (((i118 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i119 = i117;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1110) {
                                        if (((i1110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i1111 = i119;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i1111 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i114 & 14) | (i114 & 112) | (i115 & 896) | (i115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i115 & 57344) | ((i114 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation9;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j11;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i116) {
                    FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                    }
                    i3 |= i9;
                } else {
                    shapeCopy = shape;
                }
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            if ((i & 57344) == 0) {
                jM640getSecondary0d7_KjU = j;
                if ((i2 & 16) == 0) {
                    i7 = 8192;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            } else {
                jM640getSecondary0d7_KjU = j;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i10;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM713elevationixp7dh8)) {
                    }
                    i3 |= i11;
                } else {
                    floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i116 = i3;
                    long j12 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i117 = i116 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j12, jM656contentColorForek8zF_U, null, floatingActionButtonElevation10.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i116 >> 6) & 14) | ((i116 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i118) {
                            if (((i118 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i119 = i116;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i1110) {
                                    if (((i1110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i1111 = i119;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i1112) {
                                            if (((i1112 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i1113 = i1111;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i1113 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i116 & 14) | (i116 & 112) | (i117 & 896) | (i117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i117 & 57344) | ((i116 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation10;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j12;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i2 & 16) != 0) {
                            jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    final int i118 = i3;
                    long j13 = jM640getSecondary0d7_KjU;
                    FloatingActionButtonElevation floatingActionButtonElevation11 = floatingActionButtonElevationM713elevationixp7dh8;
                    int i119 = i118 >> 3;
                    SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j13, jM656contentColorForek8zF_U, null, floatingActionButtonElevation11.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i118 >> 6) & 14) | ((i118 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1110) {
                            if (((i1110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                            final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                            final int i1111 = i118;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i1112) {
                                    if (((i1112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                    final int i1113 = i1111;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i1114) {
                                            if (((i1114 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function5 = function4;
                                            int i1115 = i1113;
                                            composer4.startReplaceableGroup(-1990474327);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                            composer4.startReplaceableGroup(1376089335);
                                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            composer4.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1253629305);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(638020661);
                                            function5.invoke(composer4, Integer.valueOf((i1115 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, 48);
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, (i118 & 14) | (i118 & 112) | (i119 & 896) | (i119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i119 & 57344) | ((i118 << 15) & 29360128), 384, 1568);
                    floatingActionButtonElevation2 = floatingActionButtonElevation11;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j3 = j13;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j4 = jM656contentColorForek8zF_U;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1110) {
                        FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1110 = i3;
                long j14 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation12 = floatingActionButtonElevationM713elevationixp7dh8;
                int i1111 = i1110 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j14, jM656contentColorForek8zF_U, null, floatingActionButtonElevation12.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i1110 >> 6) & 14) | ((i1110 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1112) {
                        if (((i1112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i1113 = i1110;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1114) {
                                if (((i1114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i1115 = i1113;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1116) {
                                        if (((i1116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i1117 = i1115;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i1117 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i1110 & 14) | (i1110 & 112) | (i1111 & 896) | (i1111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1111 & 57344) | ((i1110 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation12;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j14;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1112 = i3;
                long j15 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation13 = floatingActionButtonElevationM713elevationixp7dh8;
                int i1113 = i1112 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j15, jM656contentColorForek8zF_U, null, floatingActionButtonElevation13.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i1112 >> 6) & 14) | ((i1112 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1114) {
                        if (((i1114 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i1115 = i1112;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1116) {
                                if (((i1116 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i1117 = i1115;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i1118) {
                                        if (((i1118 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i1119 = i1117;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i1119 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i1112 & 14) | (i1112 & 112) | (i1113 & 896) | (i1113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1113 & 57344) | ((i1112 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation13;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j15;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1114) {
                    FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                shapeCopy = shape;
                if (composerStartRestartGroup.changed(shapeCopy)) {
                }
                i3 |= i9;
            } else {
                shapeCopy = shape;
            }
            i3 |= i9;
        } else {
            shapeCopy = shape;
        }
        if ((i & 57344) == 0) {
            jM640getSecondary0d7_KjU = j;
            if ((i2 & 16) == 0) {
                i7 = 8192;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            jM640getSecondary0d7_KjU = j;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                jM656contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                }
                i3 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i10;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevationM713elevationixp7dh8)) {
                }
                i3 |= i11;
            } else {
                floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
            }
            i3 |= i11;
        } else {
            floatingActionButtonElevationM713elevationixp7dh8 = floatingActionButtonElevation;
        }
        if ((i2 & 128) != 0) {
            if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
            }
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1114 = i3;
                long j16 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation14 = floatingActionButtonElevationM713elevationixp7dh8;
                int i1115 = i1114 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j16, jM656contentColorForek8zF_U, null, floatingActionButtonElevation14.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i1114 >> 6) & 14) | ((i1114 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1116) {
                        if (((i1116 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i1117 = i1114;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1118) {
                                if (((i1118 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i1119 = i1117;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i11110) {
                                        if (((i11110 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i11111 = i1119;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i11111 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i1114 & 14) | (i1114 & 112) | (i1115 & 896) | (i1115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1115 & 57344) | ((i1114 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation14;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j16;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i2 & 16) != 0) {
                        jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                    }
                    composerStartRestartGroup.endDefaults();
                }
                final int i1116 = i3;
                long j17 = jM640getSecondary0d7_KjU;
                FloatingActionButtonElevation floatingActionButtonElevation15 = floatingActionButtonElevationM713elevationixp7dh8;
                int i1117 = i1116 >> 3;
                SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j17, jM656contentColorForek8zF_U, null, floatingActionButtonElevation15.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i1116 >> 6) & 14) | ((i1116 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1118) {
                        if (((i1118 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                        final int i1119 = i1116;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11110) {
                                if (((i11110 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                                final int i11111 = i1119;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i11112) {
                                        if (((i11112 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function5 = function4;
                                        int i11113 = i11111;
                                        composer4.startReplaceableGroup(-1990474327);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                        composer4.startReplaceableGroup(1376089335);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        composer4.enableReusing();
                                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1253629305);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(638020661);
                                        function5.invoke(composer4, Integer.valueOf((i11113 >> 21) & 14));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                }), composer3, 48);
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, (i1116 & 14) | (i1116 & 112) | (i1117 & 896) | (i1117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1117 & 57344) | ((i1116 << 15) & 29360128), 384, 1568);
                floatingActionButtonElevation2 = floatingActionButtonElevation15;
                mutableInteractionSource3 = mutableInteractionSource2;
                j3 = j17;
                modifier3 = modifier2;
                shape2 = shapeCopy;
                j4 = jM656contentColorForek8zF_U;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1118) {
                    FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
                }
            });
        }
        i6 = 12582912;
        i3 |= i6;
        if (((23967451 & i3) ^ 4793490) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i1118 = i3;
            long j18 = jM640getSecondary0d7_KjU;
            FloatingActionButtonElevation floatingActionButtonElevation16 = floatingActionButtonElevationM713elevationixp7dh8;
            int i1119 = i1118 >> 3;
            SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j18, jM656contentColorForek8zF_U, null, floatingActionButtonElevation16.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i1118 >> 6) & 14) | ((i1118 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i11110) {
                    if (((i11110 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                    final int i11111 = i1118;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11112) {
                            if (((i11112 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                            final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                            final int i11113 = i11111;
                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i11114) {
                                    if (((i11114 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function5 = function4;
                                    int i11115 = i11113;
                                    composer4.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                    composer4.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    composer4.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(638020661);
                                    function5.invoke(composer4, Integer.valueOf((i11115 >> 21) & 14));
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                            }), composer3, 48);
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, (i1118 & 14) | (i1118 & 112) | (i1119 & 896) | (i1119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1119 & 57344) | ((i1118 << 15) & 29360128), 384, 1568);
            floatingActionButtonElevation2 = floatingActionButtonElevation16;
            mutableInteractionSource3 = mutableInteractionSource2;
            j3 = j18;
            modifier3 = modifier2;
            shape2 = shapeCopy;
            j4 = jM656contentColorForek8zF_U;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i2 & 16) != 0) {
                    jM640getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m640getSecondary0d7_KjU();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM640getSecondary0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    floatingActionButtonElevationM713elevationixp7dh8 = FloatingActionButtonDefaults.INSTANCE.m713elevationixp7dh8(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
                }
                composerStartRestartGroup.endDefaults();
            }
            final int i11110 = i3;
            long j19 = jM640getSecondary0d7_KjU;
            FloatingActionButtonElevation floatingActionButtonElevation17 = floatingActionButtonElevationM713elevationixp7dh8;
            int i11111 = i11110 >> 3;
            SurfaceKt.m813Surface9VG74zQ(function0, modifier2, shapeCopy, j19, jM656contentColorForek8zF_U, null, floatingActionButtonElevation17.elevation(mutableInteractionSource2, composerStartRestartGroup, ((i11110 >> 6) & 14) | ((i11110 >> 15) & 112)).getValue().m2979unboximpl(), mutableInteractionSource2, RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7), false, null, Role.m2624boximpl(Role.INSTANCE.m2631getButtono7Vup1c()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i11112) {
                    if (((i11112 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1214getAlphaimpl(jM656contentColorForek8zF_U)))};
                    final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
                    final int i11113 = i11110;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819891034, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11114) {
                            if (((i11114 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 0).getButton();
                            final Function2<? super Composer, ? super Integer, Unit> function4 = function3;
                            final int i11115 = i11113;
                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -819890970, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i11116) {
                                    if (((i11116 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierM307defaultMinSizeVpY3zN4 = SizeKt.m307defaultMinSizeVpY3zN4(Modifier.INSTANCE, FloatingActionButtonKt.FabSize, FloatingActionButtonKt.FabSize);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function2<Composer, Integer, Unit> function5 = function4;
                                    int i11117 = i11115;
                                    composer4.startReplaceableGroup(-1990474327);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 0);
                                    composer4.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM307defaultMinSizeVpY3zN4);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composer4);
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    composer4.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(638020661);
                                    function5.invoke(composer4, Integer.valueOf((i11117 >> 21) & 14));
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                            }), composer3, 48);
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, (i11110 & 14) | (i11110 & 112) | (i11111 & 896) | (i11111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11111 & 57344) | ((i11110 << 15) & 29360128), 384, 1568);
            floatingActionButtonElevation2 = floatingActionButtonElevation17;
            mutableInteractionSource3 = mutableInteractionSource2;
            j3 = j19;
            modifier3 = modifier2;
            shape2 = shapeCopy;
            j4 = jM656contentColorForek8zF_U;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11112) {
                FloatingActionButtonKt.m715FloatingActionButtonbogVsAg(function0, modifier3, mutableInteractionSource3, shape2, j3, j4, floatingActionButtonElevation2, function2, composer2, i | 1, i2);
            }
        });
    }
}
