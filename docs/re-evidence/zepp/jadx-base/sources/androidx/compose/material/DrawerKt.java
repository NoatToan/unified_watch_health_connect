package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0096\u0001\u0010!\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0096\u0001\u0010$\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a \u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0002\u001a3\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u0006\u0010,\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001aA\u00105\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%0\u001d2\u0006\u0010*\u001a\u00020\u0019H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0019\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107\"\u0019\u00108\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u00107\"\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020%098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "Landroidx/compose/material/BottomDrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", "a", "b", "pos", "calculateFraction", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerScrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "EndDrawerPadding", "F", "DrawerVelocityThreshold", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomDrawerOpenFraction", "material_release"}, k = 2, mv = {1, 5, 1})
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float EndDrawerPadding = Dp.m2965constructorimpl(56);
    private static final float DrawerVelocityThreshold = Dp.m2965constructorimpl(400);

    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0125  */
    /* JADX WARN: Code duplicated, block: B:109:0x0128  */
    /* JADX WARN: Code duplicated, block: B:114:0x013b  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0205  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0235  */
    /* JADX WARN: Code duplicated, block: B:181:0x0299  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m677BottomDrawerGs3lGvM(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable BottomDrawerState bottomDrawerState, boolean z, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BottomDrawerState bottomDrawerState2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        float f2;
        long j4;
        int i6;
        long j5;
        int i7;
        Modifier modifier3;
        BottomDrawerState bottomDrawerStateRememberBottomDrawerState;
        Shape large;
        float fM676getElevationD9Ej5fM;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        long scrimColor;
        long j6;
        int i8;
        long j7;
        Object objRememberedValue;
        final Modifier modifier4;
        final boolean z3;
        final Shape shape3;
        final long j8;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1561653803);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState;
                    int i11 = composerStartRestartGroup.changed(bottomDrawerState2) ? 256 : 128;
                    i3 |= i11;
                } else {
                    bottomDrawerState2 = bottomDrawerState;
                }
                i3 |= i11;
            } else {
                bottomDrawerState2 = bottomDrawerState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i12 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        f2 = f;
                        int i13 = composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        i3 |= i13;
                    } else {
                        f2 = f;
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j4 = j;
                        int i14 = composerStartRestartGroup.changed(j4) ? 1048576 : 524288;
                        i3 |= i14;
                    } else {
                        j4 = j;
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                if ((29360128 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        i9 = i3;
                        int i15 = composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
                        i6 = i9 | i15;
                    } else {
                        i9 = i3;
                    }
                    i6 = i9 | i15;
                } else {
                    i6 = i3;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        j5 = j3;
                        int i16 = composerStartRestartGroup.changed(j5) ? 67108864 : 33554432;
                        i6 |= i16;
                    } else {
                        j5 = j3;
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i6 |= i7;
                    }
                    if (((i6 & 1533916891) ^ 306783378) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 4) != 0) {
                                bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i6 &= -897;
                            } else {
                                bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                                i6 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if ((i2 & 32) != 0) {
                                fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                                i6 &= -458753;
                            } else {
                                fM676getElevationD9Ej5fM = f2;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i6 &= -3670017;
                            } else {
                                jM642getSurface0d7_KjU = j4;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                                i6 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                                i6 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            composerStartRestartGroup.endDefaults();
                            bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                            j6 = jM656contentColorForek8zF_U;
                            i8 = i6;
                            j7 = scrimColor;
                            j4 = jM642getSurface0d7_KjU;
                            shape2 = large;
                            f2 = fM676getElevationD9Ej5fM;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i6 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                j6 = j2;
                                j7 = j3;
                                i8 = i6 & (-234881025);
                            } else {
                                j6 = j2;
                                j7 = j3;
                                i8 = i6;
                            }
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        j2 = j6;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope, function3)), composerStartRestartGroup, 3072, 6);
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j7 = j5;
                    }
                    modifier4 = modifier2;
                    z3 = z2;
                    shape3 = shape2;
                    j8 = j4;
                    j9 = j2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final BottomDrawerState bottomDrawerState3 = bottomDrawerState2;
                    final float f3 = f2;
                    final long j10 = j7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                            DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState3, z3, shape3, f3, j8, j9, j10, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i6 |= C.ENCODING_PCM_32BIT;
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope2, function3)), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope3, function3)), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final BottomDrawerState bottomDrawerState4 = bottomDrawerState2;
                final float f4 = f2;
                final long j11 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                        DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState4, z3, shape3, f4, j8, j9, j11, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            if ((29360128 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i9 = i3;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i6 = i9 | i15;
                } else {
                    i9 = i3;
                }
                i6 = i9 | i15;
            } else {
                i6 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i6 |= i7;
                }
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope4, function3)), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope5, function3)), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final BottomDrawerState bottomDrawerState5 = bottomDrawerState2;
                final float f5 = f2;
                final long j12 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                        DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState5, z3, shape3, f5, j8, j9, j12, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 |= C.ENCODING_PCM_32BIT;
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope6, function3)), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller7;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope7, function3)), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final BottomDrawerState bottomDrawerState6 = bottomDrawerState2;
            final float f6 = f2;
            final long j13 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                    DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState6, z3, shape3, f6, j8, j9, j13, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                bottomDrawerState2 = bottomDrawerState;
                if (composerStartRestartGroup.changed(bottomDrawerState2)) {
                }
                i3 |= i11;
            } else {
                bottomDrawerState2 = bottomDrawerState;
            }
            i3 |= i11;
        } else {
            bottomDrawerState2 = bottomDrawerState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            if ((29360128 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i9 = i3;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i6 = i9 | i15;
                } else {
                    i9 = i3;
                }
                i6 = i9 | i15;
            } else {
                i6 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i6 |= i7;
                }
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller8 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller8);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller8;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope8, function3)), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        i8 = i6;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller9);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller9;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope9, function3)), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final BottomDrawerState bottomDrawerState7 = bottomDrawerState2;
                final float f7 = f2;
                final long j14 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                        DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState7, z3, shape3, f7, j8, j9, j14, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 |= C.ENCODING_PCM_32BIT;
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller10 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller10);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller10;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope10, function3)), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller11;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope11, function3)), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final BottomDrawerState bottomDrawerState8 = bottomDrawerState2;
            final float f8 = f2;
            final long j15 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                    DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState8, z3, shape3, f8, j8, j9, j15, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            i3 |= i12;
        } else {
            shape2 = shape;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            i3 |= i13;
        } else {
            f2 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            i3 |= i14;
        } else {
            j4 = j;
        }
        if ((29360128 & i) == 0) {
            if ((i2 & 128) == 0) {
                i9 = i3;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i6 = i9 | i15;
            } else {
                i9 = i3;
            }
            i6 = i9 | i15;
        } else {
            i6 = i3;
        }
        if ((i & 234881024) == 0) {
            if ((i2 & 256) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            i6 |= i16;
        } else {
            j5 = j3;
        }
        if ((i2 & 512) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i6 |= i7;
            }
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller12 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller12);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller12;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope12, function3)), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    i8 = i6;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller13 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller13);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller13;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope13, function3)), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final BottomDrawerState bottomDrawerState9 = bottomDrawerState2;
            final float f9 = f2;
            final long j16 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                    DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState9, z3, shape3, f9, j8, j9, j16, function2, composer2, i | 1, i2);
                }
            });
        }
        i6 |= C.ENCODING_PCM_32BIT;
        if (((i6 & 1533916891) ^ 306783378) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                j6 = jM656contentColorForek8zF_U;
                i8 = i6;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                j6 = jM656contentColorForek8zF_U;
                i8 = i6;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller14 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller14);
                objRememberedValue = compositionScopedCoroutineScopeCanceller14;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            j2 = j6;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope14, function3)), composerStartRestartGroup, 3072, 6);
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                j6 = jM656contentColorForek8zF_U;
                i8 = i6;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    bottomDrawerStateRememberBottomDrawerState = bottomDrawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                j6 = jM656contentColorForek8zF_U;
                i8 = i6;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller15 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller15);
                objRememberedValue = compositionScopedCoroutineScopeCanceller15;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            j2 = j6;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819909498, true, new DrawerKt$BottomDrawer$1(z2, bottomDrawerState2, function2, i8, j7, shape2, j4, j6, f2, coroutineScope15, function3)), composerStartRestartGroup, 3072, 6);
        }
        modifier4 = modifier2;
        z3 = z2;
        shape3 = shape2;
        j8 = j4;
        j9 = j2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final BottomDrawerState bottomDrawerState10 = bottomDrawerState2;
        final float f10 = f2;
        final long j17 = j7;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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
                DrawerKt.m677BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState10, z3, shape3, f10, j8, j9, j17, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m678BottomDrawerScrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298949741);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (j != Color.INSTANCE.m1248getUnspecified0d7_KjU()) {
                composerStartRestartGroup.startReplaceableGroup(-1298949621);
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, composerStartRestartGroup, 0, 12);
                final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m808getCloseDrawerUdPEhr4(), composerStartRestartGroup, 0);
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-1298949376);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    boolean zChanged2 = composerStartRestartGroup.changed(strM812getString4foXLRw) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM812getString4foXLRw);
                                final Function0<Unit> function1 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        function1.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1298949048);
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                Color colorM1202boximpl = Color.m1202boximpl(j);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged3 = composerStartRestartGroup.changed(colorM1202boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope drawScope) {
                            DrawScope.DefaultImpls.m1628drawRectnJ9OG0$default(drawScope, j, 0L, 0L, DrawerKt.m679BottomDrawerScrim_3J_VO9M$lambda0(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1298948829);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                DrawerKt.m678BottomDrawerScrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BottomDrawerScrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m679BottomDrawerScrim_3J_VO9M$lambda0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0125  */
    /* JADX WARN: Code duplicated, block: B:109:0x0128  */
    /* JADX WARN: Code duplicated, block: B:114:0x013b  */
    /* JADX WARN: Code duplicated, block: B:119:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0205  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0235  */
    /* JADX WARN: Code duplicated, block: B:181:0x0299  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    @Composable
    /* JADX INFO: renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m680ModalDrawerGs3lGvM(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        float f2;
        long j4;
        int i6;
        long j5;
        int i7;
        Modifier modifier3;
        DrawerState drawerStateRememberDrawerState;
        Shape large;
        float fM676getElevationD9Ej5fM;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        long scrimColor;
        long j6;
        long j7;
        final int i8;
        Object objRememberedValue;
        final Modifier modifier4;
        final boolean z3;
        final Shape shape3;
        final long j8;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-73332094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    int i11 = composerStartRestartGroup.changed(drawerState2) ? 256 : 128;
                    i3 |= i11;
                } else {
                    drawerState2 = drawerState;
                }
                i3 |= i11;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i12 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        f2 = f;
                        int i13 = composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        i3 |= i13;
                    } else {
                        f2 = f;
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j4 = j;
                        int i14 = composerStartRestartGroup.changed(j4) ? 1048576 : 524288;
                        i3 |= i14;
                    } else {
                        j4 = j;
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                if ((29360128 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        i9 = i3;
                        int i15 = composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
                        i6 = i9 | i15;
                    } else {
                        i9 = i3;
                    }
                    i6 = i9 | i15;
                } else {
                    i6 = i3;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        j5 = j3;
                        int i16 = composerStartRestartGroup.changed(j5) ? 67108864 : 33554432;
                        i6 |= i16;
                    } else {
                        j5 = j3;
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i6 |= i7;
                    }
                    if (((i6 & 1533916891) ^ 306783378) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 4) != 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i6 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                                i6 &= -57345;
                            } else {
                                large = shape2;
                            }
                            if ((i2 & 32) != 0) {
                                fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                                i6 &= -458753;
                            } else {
                                fM676getElevationD9Ej5fM = f2;
                            }
                            if ((i2 & 64) != 0) {
                                jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                                i6 &= -3670017;
                            } else {
                                jM642getSurface0d7_KjU = j4;
                            }
                            if ((i2 & 128) != 0) {
                                jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                                i6 &= -29360129;
                            } else {
                                jM656contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) != 0) {
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                                i6 &= -234881025;
                            } else {
                                scrimColor = j3;
                            }
                            composerStartRestartGroup.endDefaults();
                            drawerState2 = drawerStateRememberDrawerState;
                            j6 = jM656contentColorForek8zF_U;
                            j7 = scrimColor;
                            j4 = jM642getSurface0d7_KjU;
                            i8 = i6;
                            shape2 = large;
                            f2 = fM676getElevationD9Ej5fM;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i6 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                j6 = j2;
                                j7 = j3;
                                i8 = i6 & (-234881025);
                            } else {
                                j6 = j2;
                                j7 = j3;
                                i8 = i6;
                            }
                        }
                        composerStartRestartGroup.startReplaceableGroup(-723524056);
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final DrawerState drawerState3 = drawerState2;
                        final boolean z4 = z2;
                        final long j10 = j7;
                        final Shape shape4 = shape2;
                        final long j11 = j4;
                        final long j12 = j6;
                        final float f3 = f2;
                        j2 = j6;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                                int i18;
                                if ((i17 & 14) == 0) {
                                    i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                                } else {
                                    i18 = i17;
                                }
                                if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                long constraints = boxWithConstraintsScope.getConstraints();
                                if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                    throw new IllegalStateException("Drawer shouldn't have infinite width");
                                }
                                final float f4 = -Constraints.m2935getMaxWidthimpl(constraints);
                                Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f4), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                                boolean z5 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState3.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z4, (32 & 16) != 0 ? false : z5, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                    }
                                } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                        return new FractionalThreshold(0.5f);
                                    }
                                }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                                final DrawerState drawerState4 = drawerState3;
                                final int i19 = i8;
                                long j13 = j10;
                                Shape shape5 = shape4;
                                long j14 = j11;
                                long j15 = j12;
                                float f5 = f3;
                                Function2<Composer, Integer, Unit> function4 = function2;
                                final boolean z6 = z4;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final Function3<ColumnScope, Composer, Integer, Unit> function5 = function3;
                                composer2.startReplaceableGroup(-1990474327);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                                composer2.startReplaceableGroup(413823892);
                                composer2.startReplaceableGroup(-1990474327);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1253629305);
                                composer2.startReplaceableGroup(392275659);
                                function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                boolean zIsOpen = drawerState4.isOpen();
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ DrawerState $drawerState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z6 && drawerState4.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                            e.f(coroutineScope2, null, null, new AnonymousClass1(drawerState4, null), 3, null);
                                        }
                                    }
                                };
                                Object objValueOf = Float.valueOf(f4);
                                Object objValueOf2 = Float.valueOf(0.0f);
                                composer2.startReplaceableGroup(-3686095);
                                boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState4);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    final float f6 = 0.0f;
                                    objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(DrawerKt.calculateFraction(f4, f6, drawerState4.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j13, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                                final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                                composer2.startReplaceableGroup(-3686930);
                                boolean zChanged2 = composer2.changed(drawerState4);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                            return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m690invokeBjo55l4(@NotNull Density density4) {
                                            return IntOffsetKt.IntOffset(c.roundToInt(drawerState4.getOffset().getValue().floatValue()), 0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                int i20 = i19 >> 12;
                                SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                        if (drawerState4.isOpen()) {
                                            final DrawerState drawerState5 = drawerState4;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                                public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ DrawerState $drawerState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                        super(2, continuation);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C00471(this.$drawerState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    if (drawerState5.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                        e.f(coroutineScope3, null, null, new C00471(drawerState5, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null), shape5, j14, j15, (BorderStroke) null, f5, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                    public final void invoke(@Nullable Composer composer3, int i21) {
                                        if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                        int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                        composer3.startReplaceableGroup(-1113031299);
                                        int i23 = i22 >> 3;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                        composer3.startReplaceableGroup(1376089335);
                                        Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                        int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                        Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                        Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                        composer3.enableReusing();
                                        function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(276693241);
                                        if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                        }
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    }
                                }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, 3072, 6);
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j7 = j5;
                    }
                    modifier4 = modifier2;
                    z3 = z2;
                    shape3 = shape2;
                    j8 = j4;
                    j9 = j2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final DrawerState drawerState4 = drawerState2;
                    final float f4 = f2;
                    final long j13 = j7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                            DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState4, z3, shape3, f4, j8, j9, j13, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i6 |= C.ENCODING_PCM_32BIT;
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState5 = drawerState2;
                    final boolean z5 = z2;
                    final long j14 = j7;
                    final Shape shape5 = shape2;
                    final long j15 = j4;
                    final long j16 = j6;
                    final float f5 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f6 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z6 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState5.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z5, (32 & 16) != 0 ? false : z6, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState6 = drawerState5;
                            final int i19 = i8;
                            long j17 = j14;
                            Shape shape6 = shape5;
                            long j18 = j15;
                            long j19 = j16;
                            float f7 = f5;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z7 = z5;
                            final CoroutineScope coroutineScope3 = coroutineScope2;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState6.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z7 && drawerState6.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope3, null, null, new AnonymousClass1(drawerState6, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f6);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState6);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f8 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f6, f8, drawerState6.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j17, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState6);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState6.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState6.isOpen()) {
                                        final DrawerState drawerState7 = drawerState6;
                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState7.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope4, null, null, new C00471(drawerState7, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape6, j18, j19, (BorderStroke) null, f7, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState6 = drawerState2;
                    final boolean z6 = z2;
                    final long j17 = j7;
                    final Shape shape6 = shape2;
                    final long j18 = j4;
                    final long j19 = j6;
                    final float f6 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f7 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f7), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z7 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState6.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z6, (32 & 16) != 0 ? false : z7, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState7 = drawerState6;
                            final int i19 = i8;
                            long j110 = j17;
                            Shape shape7 = shape6;
                            long j111 = j18;
                            long j112 = j19;
                            float f8 = f6;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z8 = z6;
                            final CoroutineScope coroutineScope4 = coroutineScope3;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState7.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z8 && drawerState7.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope4, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f7);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState7);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f9 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f7, f9, drawerState7.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j110, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState7);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState7.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState7.isOpen()) {
                                        final DrawerState drawerState8 = drawerState7;
                                        final CoroutineScope coroutineScope5 = coroutineScope4;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState8.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope5, null, null, new C00471(drawerState8, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape7, j111, j112, (BorderStroke) null, f8, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final DrawerState drawerState7 = drawerState2;
                final float f7 = f2;
                final long j110 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                        DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState7, z3, shape3, f7, j8, j9, j110, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            if ((29360128 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i9 = i3;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i6 = i9 | i15;
                } else {
                    i9 = i3;
                }
                i6 = i9 | i15;
            } else {
                i6 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i6 |= i7;
                }
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState8 = drawerState2;
                    final boolean z7 = z2;
                    final long j111 = j7;
                    final Shape shape7 = shape2;
                    final long j112 = j4;
                    final long j113 = j6;
                    final float f8 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f9 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f9), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z8 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState8.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z7, (32 & 16) != 0 ? false : z8, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState9 = drawerState8;
                            final int i19 = i8;
                            long j114 = j111;
                            Shape shape8 = shape7;
                            long j115 = j112;
                            long j116 = j113;
                            float f10 = f8;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z9 = z7;
                            final CoroutineScope coroutineScope5 = coroutineScope4;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState9.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z9 && drawerState9.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope5, null, null, new AnonymousClass1(drawerState9, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f9);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState9);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f11 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f9, f11, drawerState9.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j114, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState9);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState9.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState9.isOpen()) {
                                        final DrawerState drawerState10 = drawerState9;
                                        final CoroutineScope coroutineScope6 = coroutineScope5;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState10.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope6, null, null, new C00471(drawerState10, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape8, j115, j116, (BorderStroke) null, f10, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState9 = drawerState2;
                    final boolean z8 = z2;
                    final long j114 = j7;
                    final Shape shape8 = shape2;
                    final long j115 = j4;
                    final long j116 = j6;
                    final float f9 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f10 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f10), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z9 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState9.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z8, (32 & 16) != 0 ? false : z9, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState10 = drawerState9;
                            final int i19 = i8;
                            long j117 = j114;
                            Shape shape9 = shape8;
                            long j118 = j115;
                            long j119 = j116;
                            float f11 = f9;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z10 = z8;
                            final CoroutineScope coroutineScope6 = coroutineScope5;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState10.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10 && drawerState10.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope6, null, null, new AnonymousClass1(drawerState10, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f10);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState10);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f12 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f10, f12, drawerState10.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j117, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState10);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState10.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState10.isOpen()) {
                                        final DrawerState drawerState11 = drawerState10;
                                        final CoroutineScope coroutineScope7 = coroutineScope6;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState11.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope7, null, null, new C00471(drawerState11, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape9, j118, j119, (BorderStroke) null, f11, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final DrawerState drawerState10 = drawerState2;
                final float f10 = f2;
                final long j117 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                        DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState10, z3, shape3, f10, j8, j9, j117, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 |= C.ENCODING_PCM_32BIT;
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState11 = drawerState2;
                final boolean z9 = z2;
                final long j118 = j7;
                final Shape shape9 = shape2;
                final long j119 = j4;
                final long j1110 = j6;
                final float f11 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f12 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f12), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState11.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z9, (32 & 16) != 0 ? false : z10, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState12 = drawerState11;
                        final int i19 = i8;
                        long j1111 = j118;
                        Shape shape10 = shape9;
                        long j1112 = j119;
                        long j1113 = j1110;
                        float f13 = f11;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z11 = z9;
                        final CoroutineScope coroutineScope7 = coroutineScope6;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState12.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z11 && drawerState12.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope7, null, null, new AnonymousClass1(drawerState12, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f12);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState12);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f14 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f12, f14, drawerState12.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j1111, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState12);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState12.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState12.isOpen()) {
                                    final DrawerState drawerState13 = drawerState12;
                                    final CoroutineScope coroutineScope8 = coroutineScope7;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState13.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope8, null, null, new C00471(drawerState13, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape10, j1112, j1113, (BorderStroke) null, f13, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller7;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState12 = drawerState2;
                final boolean z10 = z2;
                final long j1111 = j7;
                final Shape shape10 = shape2;
                final long j1112 = j4;
                final long j1113 = j6;
                final float f12 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f13 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f13), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z11 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState12.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z10, (32 & 16) != 0 ? false : z11, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState13 = drawerState12;
                        final int i19 = i8;
                        long j1114 = j1111;
                        Shape shape11 = shape10;
                        long j1115 = j1112;
                        long j1116 = j1113;
                        float f14 = f12;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z12 = z10;
                        final CoroutineScope coroutineScope8 = coroutineScope7;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState13.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z12 && drawerState13.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope8, null, null, new AnonymousClass1(drawerState13, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f13);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState13);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f15 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f13, f15, drawerState13.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j1114, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState13);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState13.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState13.isOpen()) {
                                    final DrawerState drawerState14 = drawerState13;
                                    final CoroutineScope coroutineScope9 = coroutineScope8;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState14.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope9, null, null, new C00471(drawerState14, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape11, j1115, j1116, (BorderStroke) null, f14, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final DrawerState drawerState13 = drawerState2;
            final float f13 = f2;
            final long j1114 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                    DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState13, z3, shape3, f13, j8, j9, j1114, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                drawerState2 = drawerState;
                if (composerStartRestartGroup.changed(drawerState2)) {
                }
                i3 |= i11;
            } else {
                drawerState2 = drawerState;
            }
            i3 |= i11;
        } else {
            drawerState2 = drawerState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i3 |= i13;
                } else {
                    f2 = f;
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i14;
                } else {
                    j4 = j;
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            if ((29360128 & i) == 0) {
                if ((i2 & 128) == 0) {
                    i9 = i3;
                    if (composerStartRestartGroup.changed(j2)) {
                    }
                    i6 = i9 | i15;
                } else {
                    i9 = i3;
                }
                i6 = i9 | i15;
            } else {
                i6 = i3;
            }
            if ((i & 234881024) == 0) {
                if ((i2 & 256) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                    }
                    i6 |= i16;
                } else {
                    j5 = j3;
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i6 |= i7;
                }
                if (((i6 & 1533916891) ^ 306783378) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller8 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller8);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller8;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState14 = drawerState2;
                    final boolean z11 = z2;
                    final long j1115 = j7;
                    final Shape shape11 = shape2;
                    final long j1116 = j4;
                    final long j1117 = j6;
                    final float f14 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f15 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f15), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z12 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState14.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState15 = drawerState14;
                            final int i19 = i8;
                            long j1118 = j1115;
                            Shape shape12 = shape11;
                            long j1119 = j1116;
                            long j11110 = j1117;
                            float f16 = f14;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z13 = z11;
                            final CoroutineScope coroutineScope9 = coroutineScope8;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState15.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z13 && drawerState15.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope9, null, null, new AnonymousClass1(drawerState15, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f15);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState15);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f17 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f15, f17, drawerState15.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j1118, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState15);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState15.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState15.isOpen()) {
                                        final DrawerState drawerState16 = drawerState15;
                                        final CoroutineScope coroutineScope10 = coroutineScope9;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState16.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope10, null, null, new C00471(drawerState16, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape12, j1119, j11110, (BorderStroke) null, f16, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            i6 &= -897;
                        } else {
                            drawerStateRememberDrawerState = drawerState2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                            i6 &= -57345;
                        } else {
                            large = shape2;
                        }
                        if ((i2 & 32) != 0) {
                            fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                            i6 &= -458753;
                        } else {
                            fM676getElevationD9Ej5fM = f2;
                        }
                        if ((i2 & 64) != 0) {
                            jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                            i6 &= -3670017;
                        } else {
                            jM642getSurface0d7_KjU = j4;
                        }
                        if ((i2 & 128) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                            i6 &= -29360129;
                        } else {
                            jM656contentColorForek8zF_U = j2;
                        }
                        if ((i2 & 256) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                            i6 &= -234881025;
                        } else {
                            scrimColor = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        drawerState2 = drawerStateRememberDrawerState;
                        j6 = jM656contentColorForek8zF_U;
                        j7 = scrimColor;
                        j4 = jM642getSurface0d7_KjU;
                        i8 = i6;
                        shape2 = large;
                        f2 = fM676getElevationD9Ej5fM;
                        modifier2 = modifier3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-723524056);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller9);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller9;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    final DrawerState drawerState15 = drawerState2;
                    final boolean z12 = z2;
                    final long j1118 = j7;
                    final Shape shape12 = shape2;
                    final long j1119 = j4;
                    final long j11110 = j6;
                    final float f15 = f2;
                    j2 = j6;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                            int i18;
                            if ((i17 & 14) == 0) {
                                i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                            if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            long constraints = boxWithConstraintsScope.getConstraints();
                            if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f16 = -Constraints.m2935getMaxWidthimpl(constraints);
                            Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f16), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z13 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState15.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z12, (32 & 16) != 0 ? false : z13, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(T t, T t2) {
                                    return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                                }
                            } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                            final DrawerState drawerState16 = drawerState15;
                            final int i19 = i8;
                            long j11111 = j1118;
                            Shape shape13 = shape12;
                            long j11112 = j1119;
                            long j11113 = j11110;
                            float f17 = f15;
                            Function2<Composer, Integer, Unit> function4 = function2;
                            final boolean z14 = z12;
                            final CoroutineScope coroutineScope10 = coroutineScope9;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                            composer2.startReplaceableGroup(-1990474327);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                            composer2.startReplaceableGroup(413823892);
                            composer2.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1253629305);
                            composer2.startReplaceableGroup(392275659);
                            function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            boolean zIsOpen = drawerState16.isOpen();
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                                /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z14 && drawerState16.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        e.f(coroutineScope10, null, null, new AnonymousClass1(drawerState16, null), 3, null);
                                    }
                                }
                            };
                            Object objValueOf = Float.valueOf(f16);
                            Object objValueOf2 = Float.valueOf(0.0f);
                            composer2.startReplaceableGroup(-3686095);
                            boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState16);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f18 = 0.0f;
                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(DrawerKt.calculateFraction(f16, f18, drawerState16.getOffset().getValue().floatValue()));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j11111, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                            composer2.startReplaceableGroup(-3686930);
                            boolean zChanged2 = composer2.changed(drawerState16);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                        return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m690invokeBjo55l4(@NotNull Density density4) {
                                        return IntOffsetKt.IntOffset(c.roundToInt(drawerState16.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            int i20 = i19 >> 12;
                            SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                    if (drawerState16.isOpen()) {
                                        final DrawerState drawerState17 = drawerState16;
                                        final CoroutineScope coroutineScope11 = coroutineScope10;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                            public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C00471(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState17.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    e.f(coroutineScope11, null, null, new C00471(drawerState17, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            }, 1, null), shape13, j11112, j11113, (BorderStroke) null, f17, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                    int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1113031299);
                                    int i23 = i22 >> 3;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                    int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(276693241);
                                    if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, 3072, 6);
                }
                modifier4 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j4;
                j9 = j2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final DrawerState drawerState16 = drawerState2;
                final float f16 = f2;
                final long j11111 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                        DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState16, z3, shape3, f16, j8, j9, j11111, function2, composer2, i | 1, i2);
                    }
                });
            }
            i6 |= C.ENCODING_PCM_32BIT;
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller10 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller10);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller10;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState17 = drawerState2;
                final boolean z13 = z2;
                final long j11112 = j7;
                final Shape shape13 = shape2;
                final long j11113 = j4;
                final long j11114 = j6;
                final float f17 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f18 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f18), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z14 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState17.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z13, (32 & 16) != 0 ? false : z14, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState18 = drawerState17;
                        final int i19 = i8;
                        long j11115 = j11112;
                        Shape shape14 = shape13;
                        long j11116 = j11113;
                        long j11117 = j11114;
                        float f19 = f17;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z15 = z13;
                        final CoroutineScope coroutineScope11 = coroutineScope10;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState18.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z15 && drawerState18.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope11, null, null, new AnonymousClass1(drawerState18, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f18);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState18);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f110 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f18, f110, drawerState18.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j11115, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState18);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState18.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState18.isOpen()) {
                                    final DrawerState drawerState19 = drawerState18;
                                    final CoroutineScope coroutineScope12 = coroutineScope11;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState19.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope12, null, null, new C00471(drawerState19, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape14, j11116, j11117, (BorderStroke) null, f19, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller11;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState18 = drawerState2;
                final boolean z14 = z2;
                final long j11115 = j7;
                final Shape shape14 = shape2;
                final long j11116 = j4;
                final long j11117 = j6;
                final float f18 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f19 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f19), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z15 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState18.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z14, (32 & 16) != 0 ? false : z15, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState19 = drawerState18;
                        final int i19 = i8;
                        long j11118 = j11115;
                        Shape shape15 = shape14;
                        long j11119 = j11116;
                        long j111110 = j11117;
                        float f110 = f18;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z16 = z14;
                        final CoroutineScope coroutineScope12 = coroutineScope11;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState19.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z16 && drawerState19.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope12, null, null, new AnonymousClass1(drawerState19, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f19);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState19);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f111 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f19, f111, drawerState19.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j11118, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState19);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState19.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState19.isOpen()) {
                                    final DrawerState drawerState110 = drawerState19;
                                    final CoroutineScope coroutineScope13 = coroutineScope12;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState110.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope13, null, null, new C00471(drawerState110, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape15, j11119, j111110, (BorderStroke) null, f110, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final DrawerState drawerState19 = drawerState2;
            final float f19 = f2;
            final long j11118 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                    DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState19, z3, shape3, f19, j8, j9, j11118, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            i3 |= i12;
        } else {
            shape2 = shape;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i3 |= i13;
            } else {
                f2 = f;
            }
            i3 |= i13;
        } else {
            f2 = f;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i14;
            } else {
                j4 = j;
            }
            i3 |= i14;
        } else {
            j4 = j;
        }
        if ((29360128 & i) == 0) {
            if ((i2 & 128) == 0) {
                i9 = i3;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i6 = i9 | i15;
            } else {
                i9 = i3;
            }
            i6 = i9 | i15;
        } else {
            i6 = i3;
        }
        if ((i & 234881024) == 0) {
            if ((i2 & 256) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                }
                i6 |= i16;
            } else {
                j5 = j3;
            }
            i6 |= i16;
        } else {
            j5 = j3;
        }
        if ((i2 & 512) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i6 |= i7;
            }
            if (((i6 & 1533916891) ^ 306783378) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller12 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller12);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller12;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState110 = drawerState2;
                final boolean z15 = z2;
                final long j11119 = j7;
                final Shape shape15 = shape2;
                final long j111110 = j4;
                final long j111111 = j6;
                final float f110 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f111 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f111), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z16 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState110.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z15, (32 & 16) != 0 ? false : z16, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState111 = drawerState110;
                        final int i19 = i8;
                        long j111112 = j11119;
                        Shape shape16 = shape15;
                        long j111113 = j111110;
                        long j111114 = j111111;
                        float f112 = f110;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z17 = z15;
                        final CoroutineScope coroutineScope13 = coroutineScope12;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState111.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z17 && drawerState111.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope13, null, null, new AnonymousClass1(drawerState111, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f111);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState111);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f113 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f111, f113, drawerState111.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j111112, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState111);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState111.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState111.isOpen()) {
                                    final DrawerState drawerState112 = drawerState111;
                                    final CoroutineScope coroutineScope14 = coroutineScope13;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState112.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope14, null, null, new C00471(drawerState112, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape16, j111113, j111114, (BorderStroke) null, f112, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        i6 &= -897;
                    } else {
                        drawerStateRememberDrawerState = drawerState2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                        i6 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                        i6 &= -458753;
                    } else {
                        fM676getElevationD9Ej5fM = f2;
                    }
                    if ((i2 & 64) != 0) {
                        jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                        i6 &= -3670017;
                    } else {
                        jM642getSurface0d7_KjU = j4;
                    }
                    if ((i2 & 128) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                        i6 &= -29360129;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    if ((i2 & 256) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                        i6 &= -234881025;
                    } else {
                        scrimColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    drawerState2 = drawerStateRememberDrawerState;
                    j6 = jM656contentColorForek8zF_U;
                    j7 = scrimColor;
                    j4 = jM642getSurface0d7_KjU;
                    i8 = i6;
                    shape2 = large;
                    f2 = fM676getElevationD9Ej5fM;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.startReplaceableGroup(-723524056);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller13 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller13);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller13;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                final DrawerState drawerState111 = drawerState2;
                final boolean z16 = z2;
                final long j111112 = j7;
                final Shape shape16 = shape2;
                final long j111113 = j4;
                final long j111114 = j6;
                final float f111 = f2;
                j2 = j6;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        long constraints = boxWithConstraintsScope.getConstraints();
                        if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f112 = -Constraints.m2935getMaxWidthimpl(constraints);
                        Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f112), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z17 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState111.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z16, (32 & 16) != 0 ? false : z17, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                            }
                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                        final DrawerState drawerState112 = drawerState111;
                        final int i19 = i8;
                        long j111115 = j111112;
                        Shape shape17 = shape16;
                        long j111116 = j111113;
                        long j111117 = j111114;
                        float f113 = f111;
                        Function2<Composer, Integer, Unit> function4 = function2;
                        final boolean z18 = z16;
                        final CoroutineScope coroutineScope14 = coroutineScope13;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                        composer2.startReplaceableGroup(-1990474327);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                        composer2.startReplaceableGroup(413823892);
                        composer2.startReplaceableGroup(-1990474327);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1253629305);
                        composer2.startReplaceableGroup(392275659);
                        function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        boolean zIsOpen = drawerState112.isOpen();
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                            /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ DrawerState $drawerState;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z18 && drawerState112.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    e.f(coroutineScope14, null, null, new AnonymousClass1(drawerState112, null), 3, null);
                                }
                            }
                        };
                        Object objValueOf = Float.valueOf(f112);
                        Object objValueOf2 = Float.valueOf(0.0f);
                        composer2.startReplaceableGroup(-3686095);
                        boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState112);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f114 = 0.0f;
                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(DrawerKt.calculateFraction(f112, f114, drawerState112.getOffset().getValue().floatValue()));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j111115, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                        Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                        composer2.startReplaceableGroup(-3686930);
                        boolean zChanged2 = composer2.changed(drawerState112);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                    return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m690invokeBjo55l4(@NotNull Density density4) {
                                    return IntOffsetKt.IntOffset(c.roundToInt(drawerState112.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        int i20 = i19 >> 12;
                        SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                                if (drawerState112.isOpen()) {
                                    final DrawerState drawerState113 = drawerState112;
                                    final CoroutineScope coroutineScope15 = coroutineScope14;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C00471(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState113.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                e.f(coroutineScope15, null, null, new C00471(drawerState113, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        }, 1, null), shape17, j111116, j111117, (BorderStroke) null, f113, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer3, int i21) {
                                if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                                int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1113031299);
                                int i23 = i22 >> 3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                                int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(276693241);
                                if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, 3072, 6);
            }
            modifier4 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j4;
            j9 = j2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final DrawerState drawerState112 = drawerState2;
            final float f112 = f2;
            final long j111115 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                    DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState112, z3, shape3, f112, j8, j9, j111115, function2, composer2, i | 1, i2);
                }
            });
        }
        i6 |= C.ENCODING_PCM_32BIT;
        if (((i6 & 1533916891) ^ 306783378) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                drawerState2 = drawerStateRememberDrawerState;
                j6 = jM656contentColorForek8zF_U;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                i8 = i6;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                drawerState2 = drawerStateRememberDrawerState;
                j6 = jM656contentColorForek8zF_U;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                i8 = i6;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller14 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller14);
                objRememberedValue = compositionScopedCoroutineScopeCanceller14;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final DrawerState drawerState113 = drawerState2;
            final boolean z17 = z2;
            final long j111116 = j7;
            final Shape shape17 = shape2;
            final long j111117 = j4;
            final long j111118 = j6;
            final float f113 = f2;
            j2 = j6;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                    int i18;
                    if ((i17 & 14) == 0) {
                        i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    } else {
                        i18 = i17;
                    }
                    if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    long constraints = boxWithConstraintsScope.getConstraints();
                    if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                    }
                    final float f114 = -Constraints.m2935getMaxWidthimpl(constraints);
                    Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f114), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    boolean z18 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState113.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z17, (32 & 16) != 0 ? false : z18, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                    final DrawerState drawerState114 = drawerState113;
                    final int i19 = i8;
                    long j111119 = j111116;
                    Shape shape18 = shape17;
                    long j1111110 = j111117;
                    long j1111111 = j111118;
                    float f115 = f113;
                    Function2<Composer, Integer, Unit> function4 = function2;
                    final boolean z19 = z17;
                    final CoroutineScope coroutineScope15 = coroutineScope14;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                    composer2.startReplaceableGroup(-1990474327);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                    composer2.startReplaceableGroup(413823892);
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    composer2.startReplaceableGroup(392275659);
                    function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    boolean zIsOpen = drawerState114.isOpen();
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ DrawerState $drawerState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    DrawerState drawerState = this.$drawerState;
                                    this.label = 1;
                                    if (drawerState.close(this) == coroutine_suspended) {
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
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (z19 && drawerState114.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                e.f(coroutineScope15, null, null, new AnonymousClass1(drawerState114, null), 3, null);
                            }
                        }
                    };
                    Object objValueOf = Float.valueOf(f114);
                    Object objValueOf2 = Float.valueOf(0.0f);
                    composer2.startReplaceableGroup(-3686095);
                    boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState114);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final float f116 = 0.0f;
                        objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(DrawerKt.calculateFraction(f114, f116, drawerState114.getOffset().getValue().floatValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j111119, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                    Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer2.changed(drawerState114);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m690invokeBjo55l4(@NotNull Density density4) {
                                return IntOffsetKt.IntOffset(c.roundToInt(drawerState114.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    int i20 = i19 >> 12;
                    SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                            if (drawerState114.isOpen()) {
                                final DrawerState drawerState115 = drawerState114;
                                final CoroutineScope coroutineScope16 = coroutineScope15;
                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                    public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ DrawerState $drawerState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C00471(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        if (drawerState115.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                            e.f(coroutineScope16, null, null, new C00471(drawerState115, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        }
                    }, 1, null), shape18, j1111110, j1111111, (BorderStroke) null, f115, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                        public final void invoke(@Nullable Composer composer3, int i21) {
                            if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                            composer3.startReplaceableGroup(-1113031299);
                            int i23 = i22 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                            composer3.startReplaceableGroup(1376089335);
                            Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                            int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                            composer3.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(276693241);
                            if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, 3072, 6);
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                drawerState2 = drawerStateRememberDrawerState;
                j6 = jM656contentColorForek8zF_U;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                i8 = i6;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i6 &= -897;
                } else {
                    drawerStateRememberDrawerState = drawerState2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -57345;
                } else {
                    large = shape2;
                }
                if ((i2 & 32) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= -458753;
                } else {
                    fM676getElevationD9Ej5fM = f2;
                }
                if ((i2 & 64) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i6 &= -3670017;
                } else {
                    jM642getSurface0d7_KjU = j4;
                }
                if ((i2 & 128) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                    i6 &= -29360129;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i2 & 256) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i6 &= -234881025;
                } else {
                    scrimColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                drawerState2 = drawerStateRememberDrawerState;
                j6 = jM656contentColorForek8zF_U;
                j7 = scrimColor;
                j4 = jM642getSurface0d7_KjU;
                i8 = i6;
                shape2 = large;
                f2 = fM676getElevationD9Ej5fM;
                modifier2 = modifier3;
            }
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller15 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller15);
                objRememberedValue = compositionScopedCoroutineScopeCanceller15;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final DrawerState drawerState114 = drawerState2;
            final boolean z18 = z2;
            final long j111119 = j7;
            final Shape shape18 = shape2;
            final long j1111110 = j4;
            final long j1111111 = j6;
            final float f114 = f2;
            j2 = j6;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819899687, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i17) {
                    int i18;
                    if ((i17 & 14) == 0) {
                        i18 = i17 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                    } else {
                        i18 = i17;
                    }
                    if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    long constraints = boxWithConstraintsScope.getConstraints();
                    if (!Constraints.m2931getHasBoundedWidthimpl(constraints)) {
                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                    }
                    final float f115 = -Constraints.m2935getMaxWidthimpl(constraints);
                    Map mapMapOf = r.mapOf(TuplesKt.to(Float.valueOf(f115), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    boolean z19 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM819swipeablepPrIpRY = SwipeableKt.m819swipeablepPrIpRY(companion, drawerState114.getSwipeableState$material_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z18, (32 & 16) != 0 ? false : z19, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(T t, T t2) {
                            return new FixedThreshold(Dp.m2965constructorimpl(56), null);
                        }
                    } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m818getVelocityThresholdD9Ej5fM() : DrawerKt.DrawerVelocityThreshold);
                    final DrawerState drawerState115 = drawerState114;
                    final int i19 = i8;
                    long j1111112 = j111119;
                    Shape shape19 = shape18;
                    long j1111113 = j1111110;
                    long j1111114 = j1111111;
                    float f116 = f114;
                    Function2<Composer, Integer, Unit> function4 = function2;
                    final boolean z110 = z18;
                    final CoroutineScope coroutineScope16 = coroutineScope15;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5 = function3;
                    composer2.startReplaceableGroup(-1990474327);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM819swipeablepPrIpRY);
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
                    composer2.startReplaceableGroup(413823892);
                    composer2.startReplaceableGroup(-1990474327);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
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
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1253629305);
                    composer2.startReplaceableGroup(392275659);
                    function4.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    boolean zIsOpen = drawerState115.isOpen();
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2

                        /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ DrawerState $drawerState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new AnonymousClass1(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    DrawerState drawerState = this.$drawerState;
                                    this.label = 1;
                                    if (drawerState.close(this) == coroutine_suspended) {
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
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (z110 && drawerState115.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                e.f(coroutineScope16, null, null, new AnonymousClass1(drawerState115, null), 3, null);
                            }
                        }
                    };
                    Object objValueOf = Float.valueOf(f115);
                    Object objValueOf2 = Float.valueOf(0.0f);
                    composer2.startReplaceableGroup(-3686095);
                    boolean zChanged = composer2.changed(objValueOf) | composer2.changed(objValueOf2) | composer2.changed(drawerState115);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final float f117 = 0.0f;
                        objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(DrawerKt.calculateFraction(f115, f117, drawerState115.getOffset().getValue().floatValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    DrawerKt.m681ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue2, j1111112, composer2, (i19 >> 15) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m811getNavigationMenuUdPEhr4(), composer2, 0);
                    Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier modifierM324sizeInqDBjuR0 = SizeKt.m324sizeInqDBjuR0(companion, density3.mo191toDpu2uoSUM(Constraints.m2937getMinWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2936getMinHeightimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(constraints)), density3.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(constraints)));
                    composer2.startReplaceableGroup(-3686930);
                    boolean zChanged2 = composer2.changed(drawerState115);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                return IntOffset.m3034boximpl(m690invokeBjo55l4(density4));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m690invokeBjo55l4(@NotNull Density density4) {
                                return IntOffsetKt.IntOffset(c.roundToInt(drawerState115.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    int i20 = i19 >> 12;
                    SurfaceKt.m815SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m285paddingqDBjuR0$default(OffsetKt.offset(modifierM324sizeInqDBjuR0, (Function1) objRememberedValue3), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM812getString4foXLRw);
                            if (drawerState115.isOpen()) {
                                final DrawerState drawerState116 = drawerState115;
                                final CoroutineScope coroutineScope17 = coroutineScope16;
                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1

                                    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {FTPCodes.FILE_ACTION_NOT_TAKEN}, m = "invokeSuspend", n = {}, s = {})
                                    public static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ DrawerState $drawerState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C00471(DrawerState drawerState, Continuation<? super C00471> continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C00471(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        if (drawerState116.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                            e.f(coroutineScope17, null, null, new C00471(drawerState116, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        }
                    }, 1, null), shape19, j1111113, j1111114, (BorderStroke) null, f116, ComposableLambdaKt.composableLambda(composer2, -819910972, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                        public final void invoke(@Nullable Composer composer3, int i21) {
                            if (((i21 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function3<ColumnScope, Composer, Integer, Unit> function6 = function5;
                            int i22 = ((i19 << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                            composer3.startReplaceableGroup(-1113031299);
                            int i23 = i22 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, (i23 & 112) | (i23 & 14));
                            composer3.startReplaceableGroup(1376089335);
                            Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                            int i24 = (((i22 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composer3);
                            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl3, density4, companion4.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                            composer3.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i24 >> 3) & 112));
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(276693241);
                            if (((((i24 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                function6.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i22 >> 6) & 112) | 6));
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 1572864 | ((i19 >> 9) & 112) | (i20 & 896) | (i20 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i19), 16);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, 3072, 6);
        }
        modifier4 = modifier2;
        z3 = z2;
        shape3 = shape2;
        j8 = j4;
        j9 = j2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final DrawerState drawerState115 = drawerState2;
        final float f115 = f2;
        final long j1111112 = j7;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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
                DrawerKt.m680ModalDrawerGs3lGvM(function3, modifier4, drawerState115, z3, shape3, f115, j8, j9, j1111112, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m681ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function1, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1010553887);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function1) ? 256 : 128;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if (((i2 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            final String strM812getString4foXLRw = Strings_androidKt.m812getString4foXLRw(Strings.INSTANCE.m808getCloseDrawerUdPEhr4(), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1010554077);
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                boolean zChanged = composerStartRestartGroup.changed(function0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged2 = composerStartRestartGroup.changed(strM812getString4foXLRw) | composerStartRestartGroup.changed(function0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM812getString4foXLRw);
                            final Function0<Unit> function2 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    function2.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1010554335);
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = Modifier.INSTANCE;
            }
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            Color colorM1202boximpl = Color.m1202boximpl(j);
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            boolean zChanged3 = composerStartRestartGroup.changed(colorM1202boximpl) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope drawScope) {
                        DrawScope.DefaultImpls.m1628drawRectnJ9OG0$default(drawScope, j, 0L, 0L, function1.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                DrawerKt.m681ScrimBx497Mc(z, function0, function1, j, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return kotlin.ranges.e.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull final BottomDrawerValue bottomDrawerValue, @Nullable final Function1<? super BottomDrawerValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1588068481);
        if ((i2 & 2) != 0) {
            function1 = new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt.rememberBottomDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomDrawerValue bottomDrawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m912rememberSaveable(new Object[0], (Saver) BottomDrawerState.Companion.Saver(function1), (String) null, (Function0) new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt.rememberBottomDrawerState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BottomDrawerState invoke() {
                return new BottomDrawerState(bottomDrawerValue, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue drawerValue, @Nullable final Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1540949526);
        if ((i2 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt.rememberDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m912rememberSaveable(new Object[0], (Saver) DrawerState.INSTANCE.Saver(function1), (String) null, (Function0) new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt.rememberDrawerState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DrawerState invoke() {
                return new DrawerState(drawerValue, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return drawerState;
    }
}
