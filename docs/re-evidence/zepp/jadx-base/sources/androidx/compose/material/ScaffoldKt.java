package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.b;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a¢\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\f¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u008a\u0001\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00122\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"$\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0019\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", b.H, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "isFabDocked", "fabPosition", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 5, 1})
public final class ScaffoldKt {

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final FabPlacement getA() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m2965constructorimpl(16);

    @Composable
    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    public static final void m789Scaffold27mzLpw(@Nullable Modifier modifier, @Nullable ScaffoldState scaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, int i, boolean z, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6, boolean z2, @Nullable Shape shape, float f, long j, long j2, long j3, long j4, long j5, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function7, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        ScaffoldState scaffoldState2;
        Function2<? super Composer, ? super Integer, Unit> function2M664getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M665getLambda2$material_release;
        final int iM709getEnd5ygKITE;
        boolean z3;
        int i6;
        long j6;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M666getLambda3$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M667getLambda4$material_release;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function8;
        Shape large;
        float fM676getElevationD9Ej5fM;
        long jM642getSurface0d7_KjU;
        long jM656contentColorForek8zF_U;
        int i7;
        long scrimColor;
        long jM631getBackground0d7_KjU;
        long jM656contentColorForek8zF_U2;
        boolean z4;
        int i8;
        final long j7;
        int i9;
        final long j8;
        final Modifier modifier2;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function9;
        float f2;
        Function2<? super Composer, ? super Integer, Unit> function10;
        final long j9;
        final Function2<? super Composer, ? super Integer, Unit> function11;
        final ScaffoldState scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> function12;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function13;
        final boolean z5;
        final Shape shape2;
        final float f3;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function14;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1013849884);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0) {
                scaffoldState2 = scaffoldState;
                int i11 = composerStartRestartGroup.changed(scaffoldState2) ? 32 : 16;
                i5 |= i11;
            } else {
                scaffoldState2 = scaffoldState;
            }
            i5 |= i11;
        } else {
            scaffoldState2 = scaffoldState;
        }
        if ((i2 & 896) == 0) {
            if ((i4 & 4) == 0) {
                function2M664getLambda1$material_release = function2;
                int i12 = composerStartRestartGroup.changed(function2M664getLambda1$material_release) ? 256 : 128;
                i5 |= i12;
            } else {
                function2M664getLambda1$material_release = function2;
            }
            i5 |= i12;
        } else {
            function2M664getLambda1$material_release = function2;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i4 & 8) == 0) {
                function2M665getLambda2$material_release = function3;
                int i13 = composerStartRestartGroup.changed(function2M665getLambda2$material_release) ? 2048 : 1024;
                i5 |= i13;
            } else {
                function2M665getLambda2$material_release = function3;
            }
            i5 |= i13;
        } else {
            function2M665getLambda2$material_release = function3;
        }
        if ((i2 & 57344) == 0) {
            i5 |= ((i4 & 16) == 0 && composerStartRestartGroup.changed(function4)) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(function5)) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            iM709getEnd5ygKITE = i;
            i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(iM709getEnd5ygKITE)) ? 1048576 : 524288;
        } else {
            iM709getEnd5ygKITE = i;
        }
        int i14 = i4 & 128;
        if (i14 != 0) {
            i5 |= 12582912;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 29360128) == 0) {
                i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
            }
        }
        int i15 = i4 & 256;
        if (i15 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            i5 |= composerStartRestartGroup.changed(function6) ? 67108864 : 33554432;
        }
        int i16 = i4 & 512;
        if (i16 != 0) {
            i5 |= C.ENCODING_PCM_32BIT;
        } else if ((i2 & 1879048192) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i6 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 112) == 0) {
            i6 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(f)) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i6 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i6 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
        }
        if ((i3 & 57344) == 0) {
            i6 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j3)) ? 16384 : 8192;
        }
        if ((i3 & 458752) == 0) {
            i6 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
        }
        if ((i3 & 3670016) == 0) {
            j6 = j5;
            i6 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j6)) ? 1048576 : 524288;
        } else {
            j6 = j5;
        }
        if ((i4 & 131072) != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            i6 |= composerStartRestartGroup.changed(function7) ? 8388608 : 4194304;
        }
        if (((i5 & 1533916891) ^ 306783378) == 0 && ((i6 & 23967451) ^ 4793490) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function14 = function4;
            f3 = f;
            jM642getSurface0d7_KjU = j;
            jM656contentColorForek8zF_U = j2;
            j9 = j3;
            j7 = j4;
            j8 = j6;
            scaffoldState3 = scaffoldState2;
            function12 = function2M664getLambda1$material_release;
            function15 = function2M665getLambda2$material_release;
            z5 = z3;
            function11 = function5;
            function13 = function6;
            z6 = z2;
            shape2 = shape;
        } else {
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                Modifier modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier;
                if ((i4 & 2) != 0) {
                    ScaffoldState scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    function2M664getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m664getLambda1$material_release();
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    function2M665getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m665getLambda2$material_release();
                }
                if ((i4 & 16) != 0) {
                    function3M666getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m666getLambda3$material_release();
                    i5 &= -57345;
                } else {
                    function3M666getLambda3$material_release = function4;
                }
                if ((i4 & 32) != 0) {
                    function2M667getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m667getLambda4$material_release();
                    i5 &= -458753;
                } else {
                    function2M667getLambda4$material_release = function5;
                }
                if ((i4 & 64) != 0) {
                    iM709getEnd5ygKITE = FabPosition.INSTANCE.m709getEnd5ygKITE();
                    i5 &= -3670017;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                function8 = i15 != 0 ? null : function6;
                boolean z7 = i16 != 0 ? true : z2;
                if ((i4 & 1024) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0).getLarge();
                    i6 &= -15;
                } else {
                    large = shape;
                }
                if ((i4 & 2048) != 0) {
                    fM676getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m676getElevationD9Ej5fM();
                    i6 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    fM676getElevationD9Ej5fM = f;
                }
                Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function16 = function3M666getLambda3$material_release;
                int i17 = i6;
                boolean z8 = z7;
                if ((i4 & 4096) != 0) {
                    jM642getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m642getSurface0d7_KjU();
                    i17 &= -897;
                } else {
                    jM642getSurface0d7_KjU = j;
                }
                Function2<? super Composer, ? super Integer, Unit> function17 = function2M667getLambda4$material_release;
                if ((i4 & 8192) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM642getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 6) & 14);
                    i17 &= -7169;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((i4 & 16384) != 0) {
                    i7 = 0;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 0);
                    i17 &= -57345;
                } else {
                    i7 = 0;
                    scrimColor = j3;
                }
                long j10 = scrimColor;
                if ((i4 & 32768) != 0) {
                    jM631getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i7).m631getBackground0d7_KjU();
                    i17 &= -458753;
                } else {
                    jM631getBackground0d7_KjU = j4;
                }
                if ((i4 & 65536) != 0) {
                    jM656contentColorForek8zF_U2 = ColorsKt.m656contentColorForek8zF_U(jM631getBackground0d7_KjU, composerStartRestartGroup, (i17 >> 15) & 14);
                    i17 &= -3670017;
                } else {
                    jM656contentColorForek8zF_U2 = j5;
                }
                composerStartRestartGroup.endDefaults();
                z4 = z8;
                i8 = i17;
                j7 = jM631getBackground0d7_KjU;
                i9 = i5;
                j8 = jM656contentColorForek8zF_U2;
                modifier2 = modifier3;
                function9 = function16;
                f2 = fM676getElevationD9Ej5fM;
                function10 = function17;
                j9 = j10;
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                if ((i4 & 2) != 0) {
                    i5 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                }
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                }
                if ((i4 & 1024) != 0) {
                    i6 &= -15;
                }
                if ((i4 & 2048) != 0) {
                    i6 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                int i18 = i6;
                if ((i4 & 4096) != 0) {
                    i18 &= -897;
                }
                if ((i4 & 8192) != 0) {
                    i18 &= -7169;
                }
                if ((i4 & 16384) != 0) {
                    i18 &= -57345;
                }
                if ((32768 & i4) != 0) {
                    i18 &= -458753;
                }
                if ((i4 & 65536) != 0) {
                    i18 &= -3670017;
                }
                function9 = function4;
                function10 = function5;
                function8 = function6;
                z4 = z2;
                large = shape;
                jM642getSurface0d7_KjU = j;
                jM656contentColorForek8zF_U = j2;
                j9 = j3;
                j7 = j4;
                j8 = j5;
                i8 = i18;
                i9 = i5;
                modifier2 = modifier;
                f2 = f;
            }
            final long j11 = j7;
            final long j12 = j8;
            final int i19 = i8;
            final boolean z9 = z3;
            final int i20 = iM709getEnd5ygKITE;
            final Function2<? super Composer, ? super Integer, Unit> function18 = function2M664getLambda1$material_release;
            final Function2<? super Composer, ? super Integer, Unit> function19 = function10;
            final Function2<? super Composer, ? super Integer, Unit> function20 = function2M665getLambda2$material_release;
            final int i21 = i9;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function21 = function9;
            final ScaffoldState scaffoldState4 = scaffoldState2;
            Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function22 = function9;
            Function2<? super Composer, ? super Integer, Unit> function23 = function10;
            final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889681, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer2, Integer num) {
                    invoke(modifier4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull Modifier modifier4, @Nullable Composer composer2, int i22) {
                    int i23;
                    if ((i22 & 14) == 0) {
                        i23 = i22 | (composer2.changed(modifier4) ? 4 : 2);
                    } else {
                        i23 = i22;
                    }
                    if (((i23 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    long j13 = j11;
                    long j14 = j12;
                    final boolean z10 = z9;
                    final int i24 = i20;
                    final Function2<Composer, Integer, Unit> function24 = function18;
                    final Function3<PaddingValues, Composer, Integer, Unit> function25 = function7;
                    final Function2<Composer, Integer, Unit> function26 = function19;
                    final Function2<Composer, Integer, Unit> function27 = function20;
                    final int i25 = i21;
                    final int i26 = i19;
                    final Function3<SnackbarHostState, Composer, Integer, Unit> function28 = function21;
                    final ScaffoldState scaffoldState5 = scaffoldState4;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -819889840, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i27) {
                            if (((i27 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            boolean z11 = z10;
                            int i28 = i24;
                            Function2<Composer, Integer, Unit> function29 = function24;
                            Function3<PaddingValues, Composer, Integer, Unit> function30 = function25;
                            final Function3<SnackbarHostState, Composer, Integer, Unit> function31 = function28;
                            final ScaffoldState scaffoldState6 = scaffoldState5;
                            final int i29 = i25;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -819902883, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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
                                public final void invoke(@Nullable Composer composer4, int i30) {
                                    if (((i30 & 11) ^ 2) == 0 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        function31.invoke(scaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i29 >> 9) & 112));
                                    }
                                }
                            });
                            Function2<Composer, Integer, Unit> function32 = function26;
                            Function2<Composer, Integer, Unit> function33 = function27;
                            int i30 = i25;
                            ScaffoldKt.m790ScaffoldLayoutMDYNRJg(z11, i28, function29, function30, composableLambda3, function32, function33, composer3, ((i30 >> 21) & 14) | 24576 | ((i30 >> 15) & 112) | (i30 & 896) | ((i26 >> 12) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i30) | ((i30 << 9) & 3670016));
                        }
                    });
                    int i27 = 1572864 | (i23 & 14);
                    int i28 = i19;
                    SurfaceKt.m815SurfaceFjzlyU(modifier4, (Shape) null, j13, j14, (BorderStroke) null, 0.0f, composableLambda2, composer2, i27 | ((i28 >> 9) & 896) | ((i28 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 50);
                }
            });
            if (function8 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1013848226);
                int i22 = i8 << 12;
                DrawerKt.m680ModalDrawerGs3lGvM(function8, modifier2, scaffoldState2.getDrawerState(), z4, large, f2, jM642getSurface0d7_KjU, jM656contentColorForek8zF_U, j9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819903232, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i23) {
                        if (((i23 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                        }
                    }
                }), composerStartRestartGroup, 805306368 | ((i9 >> 24) & 14) | ((i9 << 3) & 112) | ((i9 >> 18) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016) | (i22 & 29360128) | (i22 & 234881024), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1013847717);
                composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i9 & 14) | 48));
                composerStartRestartGroup.endReplaceableGroup();
            }
            function11 = function23;
            scaffoldState3 = scaffoldState2;
            function12 = function2M664getLambda1$material_release;
            function13 = function8;
            z5 = z3;
            shape2 = large;
            f3 = f2;
            function14 = function22;
            Function2<? super Composer, ? super Integer, Unit> function24 = function2M665getLambda2$material_release;
            z6 = z4;
            function15 = function24;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j13 = jM642getSurface0d7_KjU;
        final long j14 = jM656contentColorForek8zF_U;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

            public final void invoke(@Nullable Composer composer2, int i23) {
                ScaffoldKt.m789Scaffold27mzLpw(modifier2, scaffoldState3, function12, function15, function14, function11, iM709getEnd5ygKITE, z5, function13, z6, shape2, f3, j13, j14, j9, j7, j8, function7, composer2, i2 | 1, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m790ScaffoldLayoutMDYNRJg(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function4, final Function2<? super Composer, ? super Integer, Unit> function5, final Function2<? super Composer, ? super Integer, Unit> function6, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2103106784);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i3 |= composerStartRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function4) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function5) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function6) ? 1048576 : 524288;
        }
        final int i4 = i3;
        if (((i4 & 2995931) ^ 599186) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Object[] objArr = {function2, function4, function5, FabPosition.m701boximpl(i), Boolean.valueOf(z), function6, function3};
            composerStartRestartGroup.startReplaceableGroup(-3685570);
            int i5 = 0;
            boolean zChanged = false;
            for (int i6 = 7; i5 < i6; i6 = 7) {
                Object obj = objArr[i5];
                i5++;
                zChanged |= composerStartRestartGroup.changed(obj);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function7 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m792invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m792invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final int iM2935getMaxWidthimpl = Constraints.m2935getMaxWidthimpl(j);
                        final int iM2934getMaxHeightimpl = Constraints.m2934getMaxHeightimpl(j);
                        final long jM2926copyZbe2FdA$default = Constraints.m2926copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function8 = function2;
                        final Function2<Composer, Integer, Unit> function9 = function4;
                        final Function2<Composer, Integer, Unit> function10 = function5;
                        final int i7 = i;
                        final boolean z2 = z;
                        final Function2<Composer, Integer, Unit> function11 = function6;
                        final int i8 = i4;
                        final Function3<PaddingValues, Composer, Integer, Unit> function12 = function3;
                        return MeasureScope.DefaultImpls.layout$default(subcomposeMeasureScope, iM2935getMaxWidthimpl, iM2934getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Object obj2;
                                Object obj3;
                                final FabPlacement fabPlacement;
                                Object obj4;
                                int height;
                                int iMo188roundToPx0680j_4;
                                int height2;
                                Integer numValueOf;
                                int iIntValue;
                                ArrayList arrayList;
                                Object obj5;
                                Object obj6;
                                int iMo188roundToPx0680j_5;
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function8);
                                long j2 = jM2926copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size() - 1;
                                if (size >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        int i10 = i9 + 1;
                                        arrayList2.add(listSubcompose.get(i9).mo2468measureBRTryo0(j2));
                                        if (i10 > size) {
                                            break;
                                        } else {
                                            i9 = i10;
                                        }
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList2.get(0);
                                    int height3 = ((Placeable) obj2).getHeight();
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex) {
                                        int i11 = 1;
                                        while (true) {
                                            int i12 = i11 + 1;
                                            Object obj7 = arrayList2.get(i11);
                                            int height4 = ((Placeable) obj7).getHeight();
                                            if (height3 < height4) {
                                                obj2 = obj7;
                                                height3 = height4;
                                            }
                                            if (i11 == lastIndex) {
                                                break;
                                            } else {
                                                i11 = i12;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj2;
                                int height5 = placeable == null ? 0 : placeable.getHeight();
                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function9);
                                long j3 = jM2926copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList(listSubcompose2.size());
                                int size2 = listSubcompose2.size() - 1;
                                if (size2 >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = i13 + 1;
                                        arrayList3.add(listSubcompose2.get(i13).mo2468measureBRTryo0(j3));
                                        if (i14 > size2) {
                                            break;
                                        } else {
                                            i13 = i14;
                                        }
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    obj3 = arrayList3.get(0);
                                    int height6 = ((Placeable) obj3).getHeight();
                                    int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                    if (1 <= lastIndex2) {
                                        int i15 = 1;
                                        while (true) {
                                            int i16 = i15 + 1;
                                            Object obj8 = arrayList3.get(i15);
                                            int height7 = ((Placeable) obj8).getHeight();
                                            if (height6 < height7) {
                                                obj3 = obj8;
                                                height6 = height7;
                                            }
                                            if (i15 == lastIndex2) {
                                                break;
                                            } else {
                                                i15 = i16;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj3;
                                int height8 = placeable2 == null ? 0 : placeable2.getHeight();
                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function10);
                                long j4 = jM2926copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList();
                                Iterator<T> it2 = listSubcompose3.iterator();
                                while (it2.hasNext()) {
                                    Placeable placeableMo2468measureBRTryo0 = ((Measurable) it2.next()).mo2468measureBRTryo0(j4);
                                    if (!((placeableMo2468measureBRTryo0.getHeight() == 0 || placeableMo2468measureBRTryo0.getWidth() == 0) ? false : true)) {
                                        placeableMo2468measureBRTryo0 = null;
                                    }
                                    if (placeableMo2468measureBRTryo0 != null) {
                                        arrayList4.add(placeableMo2468measureBRTryo0);
                                    }
                                }
                                if (!arrayList4.isEmpty()) {
                                    if (arrayList4.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList4.get(0);
                                        int width = ((Placeable) obj5).getWidth();
                                        int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                                        if (1 <= lastIndex3) {
                                            int i17 = 1;
                                            while (true) {
                                                int i18 = i17 + 1;
                                                Object obj9 = arrayList4.get(i17);
                                                int width2 = ((Placeable) obj9).getWidth();
                                                if (width < width2) {
                                                    obj5 = obj9;
                                                    width = width2;
                                                }
                                                if (i17 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i17 = i18;
                                                }
                                            }
                                        }
                                    }
                                    int width3 = ((Placeable) obj5).getWidth();
                                    if (arrayList4.isEmpty()) {
                                        obj6 = null;
                                    } else {
                                        obj6 = arrayList4.get(0);
                                        int height9 = ((Placeable) obj6).getHeight();
                                        int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                                        if (1 <= lastIndex4) {
                                            int i19 = 1;
                                            while (true) {
                                                int i20 = i19 + 1;
                                                Object obj10 = arrayList4.get(i19);
                                                int height10 = ((Placeable) obj10).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj6 = obj10;
                                                }
                                                if (i19 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i19 = i20;
                                                }
                                            }
                                        }
                                    }
                                    int height11 = ((Placeable) obj6).getHeight();
                                    if (FabPosition.m704equalsimpl0(i7, FabPosition.INSTANCE.m709getEnd5ygKITE())) {
                                        iMo188roundToPx0680j_5 = subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr ? (iM2935getMaxWidthimpl - subcomposeMeasureScope.mo188roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width3 : subcomposeMeasureScope.mo188roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else {
                                        iMo188roundToPx0680j_5 = (iM2935getMaxWidthimpl - width3) / 2;
                                    }
                                    fabPlacement = new FabPlacement(z2, iMo188roundToPx0680j_5, width3, height11);
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function13 = function11;
                                final int i21 = i8;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope2.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-985538854, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer2, int i22) {
                                        if (((i22 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                        } else {
                                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, function13, composer2, ((i21 >> 15) & 112) | 8);
                                        }
                                    }
                                }));
                                long j5 = jM2926copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
                                int size3 = listSubcompose4.size() - 1;
                                if (size3 >= 0) {
                                    int i22 = 0;
                                    while (true) {
                                        int i23 = i22 + 1;
                                        arrayList5.add(listSubcompose4.get(i22).mo2468measureBRTryo0(j5));
                                        if (i23 > size3) {
                                            break;
                                        } else {
                                            i22 = i23;
                                        }
                                    }
                                }
                                if (arrayList5.isEmpty()) {
                                    obj4 = null;
                                } else {
                                    obj4 = arrayList5.get(0);
                                    int height12 = ((Placeable) obj4).getHeight();
                                    int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
                                    if (1 <= lastIndex5) {
                                        int i24 = 1;
                                        while (true) {
                                            int i25 = i24 + 1;
                                            Object obj11 = arrayList5.get(i24);
                                            int height13 = ((Placeable) obj11).getHeight();
                                            if (height12 < height13) {
                                                height12 = height13;
                                                obj4 = obj11;
                                            }
                                            if (i24 == lastIndex5) {
                                                break;
                                            } else {
                                                i24 = i25;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj4;
                                final int height14 = placeable3 == null ? 0 : placeable3.getHeight();
                                if (fabPlacement == null) {
                                    numValueOf = null;
                                } else {
                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                    boolean z3 = z2;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                        iMo188roundToPx0680j_4 = subcomposeMeasureScope3.mo188roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else {
                                        if (z3) {
                                            height2 = height14 + (fabPlacement.getHeight() / 2);
                                        } else {
                                            height = fabPlacement.getHeight() + height14;
                                            iMo188roundToPx0680j_4 = subcomposeMeasureScope3.mo188roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        }
                                        numValueOf = Integer.valueOf(height2);
                                    }
                                    height2 = height + iMo188roundToPx0680j_4;
                                    numValueOf = Integer.valueOf(height2);
                                }
                                if (height8 != 0) {
                                    iIntValue = height8 + (numValueOf == null ? height14 : numValueOf.intValue());
                                } else {
                                    iIntValue = 0;
                                }
                                int i26 = iM2934getMaxHeightimpl - height5;
                                final SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final Function3<PaddingValues, Composer, Integer, Unit> function14 = function12;
                                ArrayList arrayList6 = arrayList5;
                                final int i27 = i8;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope4.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-985545322, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer2, int i28) {
                                        if (((i28 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                        } else {
                                            function14.invoke(PaddingKt.m278PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, subcomposeMeasureScope4.mo191toDpu2uoSUM(height14), 7, null), composer2, Integer.valueOf((i27 >> 6) & 112));
                                        }
                                    }
                                }));
                                long j6 = jM2926copyZbe2FdA$default;
                                ArrayList arrayList7 = new ArrayList(listSubcompose5.size());
                                int size4 = listSubcompose5.size() - 1;
                                if (size4 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        int i29 = i28 + 1;
                                        int i30 = i26;
                                        long j7 = j6;
                                        arrayList7.add(listSubcompose5.get(i28).mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, 0, 0, 0, i26, 7, null)));
                                        if (i29 > size4) {
                                            break;
                                        }
                                        i28 = i29;
                                        i26 = i30;
                                        j6 = j7;
                                    }
                                }
                                int size5 = arrayList7.size() - 1;
                                if (size5 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        arrayList = arrayList6;
                                        ArrayList arrayList8 = arrayList7;
                                        Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList7.get(i31), 0, height5, 0.0f, 4, null);
                                        i31++;
                                        if (i31 > size5) {
                                            break;
                                        }
                                        arrayList7 = arrayList8;
                                        arrayList6 = arrayList;
                                    }
                                } else {
                                    arrayList = arrayList6;
                                }
                                int size6 = arrayList2.size() - 1;
                                if (size6 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        int i33 = i32 + 1;
                                        Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i32), 0, 0, 0.0f, 4, null);
                                        if (i33 > size6) {
                                            break;
                                        } else {
                                            i32 = i33;
                                        }
                                    }
                                }
                                int i34 = iM2934getMaxHeightimpl;
                                int size7 = arrayList3.size() - 1;
                                if (size7 >= 0) {
                                    int i35 = 0;
                                    while (true) {
                                        int i36 = i35 + 1;
                                        Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList3.get(i35), 0, i34 - iIntValue, 0.0f, 4, null);
                                        if (i36 > size7) {
                                            break;
                                        } else {
                                            i35 = i36;
                                        }
                                    }
                                }
                                int i37 = iM2934getMaxHeightimpl;
                                int size8 = arrayList.size() - 1;
                                if (size8 >= 0) {
                                    int i38 = 0;
                                    while (true) {
                                        int i39 = i38 + 1;
                                        ArrayList arrayList9 = arrayList;
                                        Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList9.get(i38), 0, i37 - height14, 0.0f, 4, null);
                                        if (i39 > size8) {
                                            break;
                                        }
                                        i38 = i39;
                                        arrayList = arrayList9;
                                    }
                                }
                                if (fabPlacement == null) {
                                    return;
                                }
                                int i40 = iM2934getMaxHeightimpl;
                                int size9 = arrayList4.size() - 1;
                                if (size9 >= 0) {
                                    int i41 = 0;
                                    while (true) {
                                        int i42 = i41 + 1;
                                        Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList4.get(i41), fabPlacement.getLeft(), i40 - numValueOf.intValue(), 0.0f, 4, null);
                                        if (i42 > size9) {
                                            break;
                                        } else {
                                            i41 = i42;
                                        }
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function7);
                objRememberedValue = function7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(0, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i7) {
                ScaffoldKt.m790ScaffoldLayoutMDYNRJg(z, i, function2, function3, function4, function5, function6, composer2, i2 | 1);
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1962071859);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}
