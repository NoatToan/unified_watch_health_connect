package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.notification.data.NotificationData;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ae\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aq\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082\b\u001a\u0019\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0080\b\u001a,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0%2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0000\u001ae\u0010*\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\"\u0019\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010,\"\u0019\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010,\"\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/\"\u0019\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u0010,\"\u0019\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", NotificationData.WearableExtrasData.KEY_ACTIONS, "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "", "x", "square", "cutoutRadius", "verticalOffset", "calculateCutoutCircleYIntercept", "controlPointX", "radius", "Lkotlin/Pair;", "calculateRoundedEdgeIntercept", "shape", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AppBar", "AppBarHeight", "F", "AppBarHorizontalPadding", "TitleInsetWithoutIcon", "Landroidx/compose/ui/Modifier;", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "material_release"}, k = 2, mv = {1, 5, 1})
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m2965constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;

    @NotNull
    private static final Modifier TitleIconModifier;

    @NotNull
    private static final Modifier TitleInsetWithoutIcon;

    static {
        float f = 4;
        float fM2965constructorimpl = Dp.m2965constructorimpl(f);
        AppBarHorizontalPadding = fM2965constructorimpl;
        Modifier.Companion companion = Modifier.INSTANCE;
        TitleInsetWithoutIcon = SizeKt.m326width3ABfNKs(companion, Dp.m2965constructorimpl(Dp.m2965constructorimpl(16) - fM2965constructorimpl));
        TitleIconModifier = SizeKt.m326width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m2965constructorimpl(Dp.m2965constructorimpl(72) - fM2965constructorimpl));
        BottomAppBarCutoutOffset = Dp.m2965constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m2965constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @Composable
    /* JADX INFO: renamed from: AppBar-celAv9A, reason: not valid java name */
    public static final void m560AppBarcelAv9A(final long j, final long j2, final float f, final PaddingValues paddingValues, final Shape shape, Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1459317484);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(shape)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((i & 458752) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            if (composerStartRestartGroup.changed(function3)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if (((2995931 & i3) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            int i10 = i3 << 6;
                            SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    if (((i11 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                    int i12 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                    composer2.startReplaceableGroup(-1989997546);
                                    int i13 = i12 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i13 & 112) | (i13 & 14));
                                    composer2.startReplaceableGroup(1376089335);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                    int i14 = (((i12 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    composer2.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i14 >> 3) & 112));
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-326682743);
                                    if (((((i14 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                                    }
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                            }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i10 & 896) | (i10 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier4, function3, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) == 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i11 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if (((i12 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i13 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i14 = i13 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i14 & 112) | (i14 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i15 = (((i13 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i15 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i15 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i11 & 896) | (i11 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i12 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            public final void invoke(@Nullable Composer composer2, int i13) {
                                if (((i13 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i14 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i15 = i14 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i15 & 112) | (i15 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i16 = (((i14 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i16 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i16 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                        public final void invoke(@Nullable Composer composer2, int i13) {
                            AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier5, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) == 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i13 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i15 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i16 = i15 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i16 & 112) | (i16 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i17 = (((i15 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i17 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i17 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i15 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i14 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i16 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i17 = i16 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i17 & 112) | (i17 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i18 = (((i16 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i18 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i18 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier6, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i15 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i17 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i19 = (((i17 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i19 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i19 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i15 & 896) | (i15 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i16 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i18 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i19 = i18 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i19 & 112) | (i19 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i110 = (((i18 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i110 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i110 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier7, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) == 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i17 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i19 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i110 = i19 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i110 & 112) | (i110 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i111 = (((i19 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i111 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i111 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i19 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i17 & 896) | (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i18 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i110 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i111 = i110 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i111 & 112) | (i111 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i112 = (((i110 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i112 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i112 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i110 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                        public final void invoke(@Nullable Composer composer2, int i19) {
                            AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier8, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i19 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i111 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i112 = i111 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i112 & 112) | (i112 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i113 = (((i111 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i113 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i113 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i111 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i110 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i112 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i113 = i112 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i113 & 112) | (i113 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i114 = (((i112 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i114 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i114 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i112 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier9, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i111 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i113 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i114 = i113 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i114 & 112) | (i114 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i115 = (((i113 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i115 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i115 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i113 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i111 & 896) | (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i112 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i114 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i115 = i114 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i115 & 112) | (i115 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i116 = (((i114 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i116 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i116 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i114 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier10, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i113 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i115 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i116 = i115 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i116 & 112) | (i116 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i117 = (((i115 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i117 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i117 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i115 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i113 & 896) | (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i114 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i116 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i117 = i116 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i117 & 112) | (i117 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i118 = (((i116 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i118 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i118 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i116 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                    AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier11, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((i & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        if (composerStartRestartGroup.changed(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if (((2995931 & i3) ^ 599186) == 0) {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i115 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i117 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i118 = i117 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i118 & 112) | (i118 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i119 = (((i117 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i119 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i119 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i117 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i115 & 896) | (i115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    } else {
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        int i116 = i3 << 6;
                        SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                                int i118 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                                composer2.startReplaceableGroup(-1989997546);
                                int i119 = i118 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i119 & 112) | (i119 & 14));
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                                int i1110 = (((i118 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1110 >> 3) & 112));
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                if (((((i1110 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i118 >> 6) & 112) | 6));
                                }
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                        }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                        public final void invoke(@Nullable Composer composer2, int i117) {
                            AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier12, function3, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i117 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i119 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1110 = i119 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1110 & 112) | (i1110 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1111 = (((i119 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1111 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1111 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i119 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i117 & 896) | (i117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i118 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i1110 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1111 = i1110 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1111 & 112) | (i1111 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1112 = (((i1110 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1112 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1112 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1110 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier13, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i119 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i1111 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1112 = i1111 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1112 & 112) | (i1112 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1113 = (((i1111 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1113 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1113 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1111 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i119 & 896) | (i119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i1110 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i1112 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1113 = i1112 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1113 & 112) | (i1113 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1114 = (((i1112 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1114 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1114 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1112 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1110 & 896) | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier14, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1111 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i1113 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i1114 = i1113 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1114 & 112) | (i1114 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i1115 = (((i1113 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1115 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i1115 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1113 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1111 & 896) | (i1111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1112 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i1114 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i1115 = i1114 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1115 & 112) | (i1115 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i1116 = (((i1114 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1116 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i1116 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1114 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                    AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier15, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 16) != 0) {
            if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((i & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if (((2995931 & i3) ^ 599186) == 0) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i1113 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i1115 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1116 = i1115 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1116 & 112) | (i1116 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1117 = (((i1115 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1117 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1117 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1115 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1113 & 896) | (i1113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                } else {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    int i1114 = i3 << 6;
                    SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                            Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                            int i1116 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                            composer2.startReplaceableGroup(-1989997546);
                            int i1117 = i1116 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1117 & 112) | (i1117 & 14));
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                            int i1118 = (((i1116 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1118 >> 3) & 112));
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            if (((((i1118 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1116 >> 6) & 112) | 6));
                            }
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                    }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1114 & 896) | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier16, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1115 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i1117 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i1118 = i1117 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1118 & 112) | (i1118 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i1119 = (((i1117 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i1119 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i1119 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1117 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1115 & 896) | (i1115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1116 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i1118 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i1119 = i1118 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i1119 & 112) | (i1119 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i11110 = (((i1118 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i11110 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i11110 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1118 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1116 & 896) | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                    AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier17, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            if ((i & 458752) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1117 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i1119 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i11110 = i1119 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i11110 & 112) | (i11110 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i11111 = (((i1119 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i11111 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i11111 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i1119 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1117 & 896) | (i1117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                int i1118 = i3 << 6;
                SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                        int i11110 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                        composer2.startReplaceableGroup(-1989997546);
                        int i11111 = i11110 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i11111 & 112) | (i11111 & 14));
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                        int i11112 = (((i11110 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i11112 >> 3) & 112));
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        if (((((i11112 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11110 >> 6) & 112) | 6));
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier18, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if (((2995931 & i3) ^ 599186) == 0) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            int i1119 = i3 << 6;
            SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                    Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                    int i11111 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    int i11112 = i11111 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i11112 & 112) | (i11112 & 14));
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                    int i11113 = (((i11111 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i11113 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i11113 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11111 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i1119 & 896) | (i1119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            int i11110 = i3 << 6;
            SurfaceKt.m815SurfaceFjzlyU(modifier3, shape, j, j2, (BorderStroke) null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819907654, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                    Modifier modifierM309height3ABfNKs = SizeKt.m309height3ABfNKs(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), AppBarKt.AppBarHeight);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function4 = function3;
                    int i11112 = (i3 >> 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    composer2.startReplaceableGroup(-1989997546);
                    int i11113 = i11112 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, (i11113 & 112) | (i11113 & 14));
                    composer2.startReplaceableGroup(1376089335);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM309height3ABfNKs);
                    int i11114 = (((i11112 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, Integer.valueOf((i11114 >> 3) & 112));
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    if (((((i11114 >> 9) & 14) & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        function4.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i11112 >> 6) & 112) | 6));
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composerStartRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i11110 & 896) | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i3 << 9) & 458752), 16);
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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
                AppBarKt.m560AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier19, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:124:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    @Composable
    /* JADX INFO: renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    public static final void m561BottomAppBarY1yfwus(@Nullable Modifier modifier, long j, long j2, @Nullable Shape shape, float f, @Nullable PaddingValues paddingValues, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long primarySurface;
        long jM656contentColorForek8zF_U;
        Shape shape2;
        float fM558getBottomAppBarElevationD9Ej5fM;
        PaddingValues contentPadding;
        int i4;
        boolean z;
        Modifier modifier3;
        FabPlacement fabPlacement;
        Shape rectangleShape;
        final PaddingValues paddingValues2;
        final float f2;
        final Modifier modifier4;
        final long j3;
        final long j4;
        final Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(25805014);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                primarySurface = j;
                int i6 = composerStartRestartGroup.changed(primarySurface) ? 32 : 16;
                i3 |= i6;
            } else {
                primarySurface = j;
            }
            i3 |= i6;
        } else {
            primarySurface = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM656contentColorForek8zF_U = j2;
                int i7 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 256 : 128;
                i3 |= i7;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i7;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                shape2 = shape;
                i3 |= composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    fM558getBottomAppBarElevationD9Ej5fM = f;
                    int i9 = composerStartRestartGroup.changed(fM558getBottomAppBarElevationD9Ej5fM) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    fM558getBottomAppBarElevationD9Ej5fM = f;
                }
                i3 |= i9;
            } else {
                fM558getBottomAppBarElevationD9Ej5fM = f;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    contentPadding = paddingValues;
                    int i10 = composerStartRestartGroup.changed(contentPadding) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    contentPadding = paddingValues;
                }
                i3 |= i10;
            } else {
                contentPadding = paddingValues;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(function3)) {
                        i4 = 1048576;
                    } else {
                        i4 = 524288;
                    }
                    i3 |= i4;
                }
                if (((i3 & 2995931) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                    z = false;
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i5 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        }
                        if ((i2 & 4) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            shape2 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i2 & 2) != 0) {
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    int i11 = i3;
                    float f3 = fM558getBottomAppBarElevationD9Ej5fM;
                    PaddingValues paddingValues3 = contentPadding;
                    fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape2 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        if (fabPlacement != null) {
                            if (fabPlacement.getIsDocked()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                    }
                    int i12 = i11 >> 3;
                    int i13 = i11 >> 6;
                    m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f3, paddingValues3, rectangleShape, modifier2, function3, composerStartRestartGroup, (i12 & 112) | (i12 & 14) | (i13 & 896) | (i13 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i11 << 15)) | (i11 & 3670016), 0);
                    paddingValues2 = paddingValues3;
                    f2 = f3;
                    modifier4 = modifier2;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    j3 = primarySurface;
                    j4 = jM656contentColorForek8zF_U;
                    shape3 = shape2;
                    f2 = fM558getBottomAppBarElevationD9Ej5fM;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                        AppBarKt.m561BottomAppBarY1yfwus(modifier4, j3, j4, shape3, f2, paddingValues2, function3, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 1572864;
            if (((i3 & 2995931) ^ 599186) == 0) {
                z = false;
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i14 = i3;
                float f4 = fM558getBottomAppBarElevationD9Ej5fM;
                PaddingValues paddingValues4 = contentPadding;
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape2 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    if (fabPlacement != null) {
                        if (fabPlacement.getIsDocked()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                }
                int i15 = i14 >> 3;
                int i16 = i14 >> 6;
                m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f4, paddingValues4, rectangleShape, modifier2, function3, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i14 << 15)) | (i14 & 3670016), 0);
                paddingValues2 = paddingValues4;
                f2 = f4;
                modifier4 = modifier2;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
            } else {
                z = false;
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i17 = i3;
                float f5 = fM558getBottomAppBarElevationD9Ej5fM;
                PaddingValues paddingValues5 = contentPadding;
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape2 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    if (fabPlacement != null) {
                        if (fabPlacement.getIsDocked()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                }
                int i18 = i17 >> 3;
                int i19 = i17 >> 6;
                m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f5, paddingValues5, rectangleShape, modifier2, function3, composerStartRestartGroup, (i18 & 112) | (i18 & 14) | (i19 & 896) | (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i17 << 15)) | (i17 & 3670016), 0);
                paddingValues2 = paddingValues5;
                f2 = f5;
                modifier4 = modifier2;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

                public final void invoke(@Nullable Composer composer2, int i110) {
                    AppBarKt.m561BottomAppBarY1yfwus(modifier4, j3, j4, shape3, f2, paddingValues2, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        shape2 = shape;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                fM558getBottomAppBarElevationD9Ej5fM = f;
                if (composerStartRestartGroup.changed(fM558getBottomAppBarElevationD9Ej5fM)) {
                }
                i3 |= i9;
            } else {
                fM558getBottomAppBarElevationD9Ej5fM = f;
            }
            i3 |= i9;
        } else {
            fM558getBottomAppBarElevationD9Ej5fM = f;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                contentPadding = paddingValues;
                if (composerStartRestartGroup.changed(contentPadding)) {
                }
                i3 |= i10;
            } else {
                contentPadding = paddingValues;
            }
            i3 |= i10;
        } else {
            contentPadding = paddingValues;
        }
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
                z = false;
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i110 = i3;
                float f6 = fM558getBottomAppBarElevationD9Ej5fM;
                PaddingValues paddingValues6 = contentPadding;
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape2 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    if (fabPlacement != null) {
                        if (fabPlacement.getIsDocked()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                }
                int i111 = i110 >> 3;
                int i112 = i110 >> 6;
                m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f6, paddingValues6, rectangleShape, modifier2, function3, composerStartRestartGroup, (i111 & 112) | (i111 & 14) | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i110 << 15)) | (i110 & 3670016), 0);
                paddingValues2 = paddingValues6;
                f2 = f6;
                modifier4 = modifier2;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
            } else {
                z = false;
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        shape2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier2 = modifier3;
                }
                int i113 = i3;
                float f7 = fM558getBottomAppBarElevationD9Ej5fM;
                PaddingValues paddingValues7 = contentPadding;
                fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape2 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    if (fabPlacement != null) {
                        if (fabPlacement.getIsDocked()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                }
                int i114 = i113 >> 3;
                int i115 = i113 >> 6;
                m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f7, paddingValues7, rectangleShape, modifier2, function3, composerStartRestartGroup, (i114 & 112) | (i114 & 14) | (i115 & 896) | (i115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i113 << 15)) | (i113 & 3670016), 0);
                paddingValues2 = paddingValues7;
                f2 = f7;
                modifier4 = modifier2;
                j3 = primarySurface;
                j4 = jM656contentColorForek8zF_U;
                shape3 = shape2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                    AppBarKt.m561BottomAppBarY1yfwus(modifier4, j3, j4, shape3, f2, paddingValues2, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 1572864;
        if (((i3 & 2995931) ^ 599186) == 0) {
            z = false;
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    shape2 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    shape2 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            int i116 = i3;
            float f8 = fM558getBottomAppBarElevationD9Ej5fM;
            PaddingValues paddingValues8 = contentPadding;
            fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape2 == null) {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            } else {
                if (fabPlacement != null) {
                    if (fabPlacement.getIsDocked()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
            }
            int i117 = i116 >> 3;
            int i118 = i116 >> 6;
            m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f8, paddingValues8, rectangleShape, modifier2, function3, composerStartRestartGroup, (i117 & 112) | (i117 & 14) | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i116 << 15)) | (i116 & 3670016), 0);
            paddingValues2 = paddingValues8;
            f2 = f8;
            modifier4 = modifier2;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            shape3 = shape2;
        } else {
            z = false;
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    shape2 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    shape2 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    fM558getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m558getBottomAppBarElevationD9Ej5fM();
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            int i119 = i3;
            float f9 = fM558getBottomAppBarElevationD9Ej5fM;
            PaddingValues paddingValues9 = contentPadding;
            fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape2 == null) {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            } else {
                if (fabPlacement != null) {
                    if (fabPlacement.getIsDocked()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    rectangleShape = new BottomAppBarCutoutShape(shape2, fabPlacement);
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
            }
            int i1110 = i119 >> 3;
            int i1111 = i119 >> 6;
            m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, f9, paddingValues9, rectangleShape, modifier2, function3, composerStartRestartGroup, (i1110 & 112) | (i1110 & 14) | (i1111 & 896) | (i1111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & (i119 << 15)) | (i119 & 3670016), 0);
            paddingValues2 = paddingValues9;
            f2 = f9;
            modifier4 = modifier2;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            shape3 = shape2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

            public final void invoke(@Nullable Composer composer2, int i1112) {
                AppBarKt.m561BottomAppBarY1yfwus(modifier4, j3, j4, shape3, f2, paddingValues2, function3, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    /* JADX INFO: renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    public static final void m562TopAppBarHsRjFd4(@Nullable Modifier modifier, long j, long j2, float f, @Nullable PaddingValues paddingValues, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long primarySurface;
        long jM656contentColorForek8zF_U;
        float fM559getTopAppBarElevationD9Ej5fM;
        PaddingValues contentPadding;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final long j3;
        final long j4;
        final float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(404502210);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                primarySurface = j;
                int i5 = composerStartRestartGroup.changed(primarySurface) ? 32 : 16;
                i3 |= i5;
            } else {
                primarySurface = j;
            }
            i3 |= i5;
        } else {
            primarySurface = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM656contentColorForek8zF_U = j2;
                int i6 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 256 : 128;
                i3 |= i6;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i6;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                fM559getTopAppBarElevationD9Ej5fM = f;
                int i7 = composerStartRestartGroup.changed(fM559getTopAppBarElevationD9Ej5fM) ? 2048 : 1024;
                i3 |= i7;
            } else {
                fM559getTopAppBarElevationD9Ej5fM = f;
            }
            i3 |= i7;
        } else {
            fM559getTopAppBarElevationD9Ej5fM = f;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                contentPadding = paddingValues;
                int i8 = composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                i3 |= i8;
            } else {
                contentPadding = paddingValues;
            }
            i3 |= i8;
        } else {
            contentPadding = paddingValues;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(function3) ? 131072 : 65536;
        }
        if (((374491 & i3) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            f2 = fM559getTopAppBarElevationD9Ej5fM;
            paddingValues2 = contentPadding;
        } else {
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                if ((i2 & 2) != 0) {
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            }
            PaddingValues paddingValues3 = contentPadding;
            int i9 = i3 >> 3;
            m560AppBarcelAv9A(primarySurface, jM656contentColorForek8zF_U, fM559getTopAppBarElevationD9Ej5fM, paddingValues3, RectangleShapeKt.getRectangleShape(), modifier2, function3, composerStartRestartGroup, (i9 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | ((i3 << 15) & 458752) | ((i3 << 3) & 3670016), 0);
            paddingValues2 = paddingValues3;
            modifier3 = modifier2;
            j3 = primarySurface;
            j4 = jM656contentColorForek8zF_U;
            f2 = fM559getTopAppBarElevationD9Ej5fM;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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

            public final void invoke(@Nullable Composer composer2, int i10) {
                AppBarKt.m562TopAppBarHsRjFd4(modifier3, j3, j4, f2, paddingValues2, function3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:113:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x015c  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    @Composable
    /* JADX INFO: renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    public static final void m563TopAppBarxWeB9s(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, long j, long j2, float f, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        int i5;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M661getLambda1$material_release;
        long primarySurface;
        long jM656contentColorForek8zF_U;
        float fM559getTopAppBarElevationD9Ej5fM;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function6;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function7;
        final float f2;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(404499380);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changed(function5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if ((i2 & 8) == 0) {
                        function3M661getLambda1$material_release = function4;
                        int i7 = composerStartRestartGroup.changed(function3M661getLambda1$material_release) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        function3M661getLambda1$material_release = function4;
                    }
                    i3 |= i7;
                } else {
                    function3M661getLambda1$material_release = function4;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        primarySurface = j;
                        int i8 = composerStartRestartGroup.changed(primarySurface) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        primarySurface = j;
                    }
                    i3 |= i8;
                } else {
                    primarySurface = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        jM656contentColorForek8zF_U = j2;
                        int i9 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 131072 : 65536;
                        i3 |= i9;
                    } else {
                        jM656contentColorForek8zF_U = j2;
                    }
                    i3 |= i9;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        fM559getTopAppBarElevationD9Ej5fM = f;
                        int i10 = composerStartRestartGroup.changed(fM559getTopAppBarElevationD9Ej5fM) ? 1048576 : 524288;
                        i3 |= i10;
                    } else {
                        fM559getTopAppBarElevationD9Ej5fM = f;
                    }
                    i3 |= i10;
                } else {
                    fM559getTopAppBarElevationD9Ej5fM = f;
                }
                if (((2995931 & i3) ^ 599186) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                        }
                        if ((i2 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
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
                    float f3 = fM559getTopAppBarElevationD9Ej5fM;
                    long j5 = jM656contentColorForek8zF_U;
                    final int i11 = i3;
                    int i12 = i11 >> 12;
                    m560AppBarcelAv9A(primarySurface, j5, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i13) {
                            int i14;
                            if ((i13 & 14) == 0) {
                                i14 = i13 | (composer2.changed(rowScope) ? 4 : 2);
                            } else {
                                i14 = i13;
                            }
                            if (((i14 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (function5 == null) {
                                composer2.startReplaceableGroup(-512812651);
                                SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(-512812592);
                                Modifier modifier4 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function8 = function5;
                                int i15 = i11;
                                composer2.startReplaceableGroup(-1989997546);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                                composer2.startReplaceableGroup(1376089335);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-326682743);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-2027905960);
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i15 >> 3) & 112) | 8);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<Composer, Integer, Unit> function9 = function2;
                            final int i16 = i11;
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-2027905635);
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    if (((i17 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i16 << 3) & 112) | 8);
                                    }
                                }
                            }), composer2, 48);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                            final Function3<RowScope, Composer, Integer, Unit> function10 = function3M661getLambda1$material_release;
                            final int i17 = i11;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                                    int i19 = (i17 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                    composer3.startReplaceableGroup(-1989997546);
                                    int i20 = i19 >> 3;
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                                    composer3.startReplaceableGroup(1376089335);
                                    Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                    int i21 = (((i19 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                    Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                    Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                                    Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                    composer3.enableReusing();
                                    function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-326682743);
                                    if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i19 >> 6) & 112) | 6));
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            }), composer2, 56);
                        }
                    }), composerStartRestartGroup, 1597440 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (458752 & (i11 << 12)), 0);
                    modifier3 = modifier2;
                    function6 = function5;
                    function7 = function3M661getLambda1$material_release;
                    f2 = f3;
                    j3 = j5;
                    j4 = primarySurface;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function6 = function5;
                    function7 = function3M661getLambda1$material_release;
                    j4 = primarySurface;
                    j3 = jM656contentColorForek8zF_U;
                    f2 = fM559getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        AppBarKt.m563TopAppBarxWeB9s(function2, modifier3, function6, function7, j4, j3, f2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            function5 = function3;
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    function3M661getLambda1$material_release = function4;
                    if (composerStartRestartGroup.changed(function3M661getLambda1$material_release)) {
                    }
                    i3 |= i7;
                } else {
                    function3M661getLambda1$material_release = function4;
                }
                i3 |= i7;
            } else {
                function3M661getLambda1$material_release = function4;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    primarySurface = j;
                    if (composerStartRestartGroup.changed(primarySurface)) {
                    }
                    i3 |= i8;
                } else {
                    primarySurface = j;
                }
                i3 |= i8;
            } else {
                primarySurface = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i9;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i9;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    fM559getTopAppBarElevationD9Ej5fM = f;
                    if (composerStartRestartGroup.changed(fM559getTopAppBarElevationD9Ej5fM)) {
                    }
                    i3 |= i10;
                } else {
                    fM559getTopAppBarElevationD9Ej5fM = f;
                }
                i3 |= i10;
            } else {
                fM559getTopAppBarElevationD9Ej5fM = f;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                float f4 = fM559getTopAppBarElevationD9Ej5fM;
                long j6 = jM656contentColorForek8zF_U;
                final int i13 = i3;
                int i14 = i13 >> 12;
                m560AppBarcelAv9A(primarySurface, j6, f4, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i15) {
                        int i16;
                        if ((i15 & 14) == 0) {
                            i16 = i15 | (composer2.changed(rowScope) ? 4 : 2);
                        } else {
                            i16 = i15;
                        }
                        if (((i16 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (function5 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier4 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function8 = function5;
                            int i17 = i13;
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-2027905960);
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i17 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                        final int i18 = i13;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905635);
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i19) {
                                if (((i19 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i18 << 3) & 112) | 8);
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                        final int i19 = i13;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                                int i111 = (i19 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1989997546);
                                int i20 = i111 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i21 = (((i111 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-326682743);
                                if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i111 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, 1597440 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (458752 & (i13 << 12)), 0);
                modifier3 = modifier2;
                function6 = function5;
                function7 = function3M661getLambda1$material_release;
                f2 = f4;
                j3 = j6;
                j4 = primarySurface;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                float f5 = fM559getTopAppBarElevationD9Ej5fM;
                long j7 = jM656contentColorForek8zF_U;
                final int i15 = i3;
                int i16 = i15 >> 12;
                m560AppBarcelAv9A(primarySurface, j7, f5, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (composer2.changed(rowScope) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if (((i18 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (function5 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier4 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function8 = function5;
                            int i19 = i15;
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-2027905960);
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i19 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                        final int i110 = i15;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905635);
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i111) {
                                if (((i111 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i110 << 3) & 112) | 8);
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                        final int i111 = i15;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                                int i113 = (i111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1989997546);
                                int i20 = i113 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i21 = (((i113 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-326682743);
                                if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i113 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, 1597440 | (i16 & 14) | (i16 & 112) | (i16 & 896) | (458752 & (i15 << 12)), 0);
                modifier3 = modifier2;
                function6 = function5;
                function7 = function3M661getLambda1$material_release;
                f2 = f5;
                j3 = j7;
                j4 = primarySurface;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                    AppBarKt.m563TopAppBarxWeB9s(function2, modifier3, function6, function7, j4, j3, f2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changed(function5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    function3M661getLambda1$material_release = function4;
                    if (composerStartRestartGroup.changed(function3M661getLambda1$material_release)) {
                    }
                    i3 |= i7;
                } else {
                    function3M661getLambda1$material_release = function4;
                }
                i3 |= i7;
            } else {
                function3M661getLambda1$material_release = function4;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    primarySurface = j;
                    if (composerStartRestartGroup.changed(primarySurface)) {
                    }
                    i3 |= i8;
                } else {
                    primarySurface = j;
                }
                i3 |= i8;
            } else {
                primarySurface = j;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    jM656contentColorForek8zF_U = j2;
                    if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                    }
                    i3 |= i9;
                } else {
                    jM656contentColorForek8zF_U = j2;
                }
                i3 |= i9;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    fM559getTopAppBarElevationD9Ej5fM = f;
                    if (composerStartRestartGroup.changed(fM559getTopAppBarElevationD9Ej5fM)) {
                    }
                    i3 |= i10;
                } else {
                    fM559getTopAppBarElevationD9Ej5fM = f;
                }
                i3 |= i10;
            } else {
                fM559getTopAppBarElevationD9Ej5fM = f;
            }
            if (((2995931 & i3) ^ 599186) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                float f6 = fM559getTopAppBarElevationD9Ej5fM;
                long j8 = jM656contentColorForek8zF_U;
                final int i17 = i3;
                int i18 = i17 >> 12;
                m560AppBarcelAv9A(primarySurface, j8, f6, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i19) {
                        int i110;
                        if ((i19 & 14) == 0) {
                            i110 = i19 | (composer2.changed(rowScope) ? 4 : 2);
                        } else {
                            i110 = i19;
                        }
                        if (((i110 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (function5 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier4 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function8 = function5;
                            int i111 = i17;
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-2027905960);
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i111 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                        final int i112 = i17;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905635);
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i113) {
                                if (((i113 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i112 << 3) & 112) | 8);
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                        final int i113 = i17;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                                int i115 = (i113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1989997546);
                                int i20 = i115 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i21 = (((i115 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-326682743);
                                if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i115 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, 1597440 | (i18 & 14) | (i18 & 112) | (i18 & 896) | (458752 & (i17 << 12)), 0);
                modifier3 = modifier2;
                function6 = function5;
                function7 = function3M661getLambda1$material_release;
                f2 = f6;
                j3 = j8;
                j4 = primarySurface;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                    }
                    if ((i2 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                    }
                    composerStartRestartGroup.endDefaults();
                }
                float f7 = fM559getTopAppBarElevationD9Ej5fM;
                long j9 = jM656contentColorForek8zF_U;
                final int i19 = i3;
                int i110 = i19 >> 12;
                m560AppBarcelAv9A(primarySurface, j9, f7, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i111) {
                        int i112;
                        if ((i111 & 14) == 0) {
                            i112 = i111 | (composer2.changed(rowScope) ? 4 : 2);
                        } else {
                            i112 = i111;
                        }
                        if (((i112 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (function5 == null) {
                            composer2.startReplaceableGroup(-512812651);
                            SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            Modifier modifier4 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function8 = function5;
                            int i113 = i19;
                            composer2.startReplaceableGroup(-1989997546);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                            composer2.startReplaceableGroup(1376089335);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                            Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            composer2.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-326682743);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-2027905960);
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i113 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                        final int i114 = i19;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                        Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905635);
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i115) {
                                if (((i115 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i114 << 3) & 112) | 8);
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                        final int i115 = i19;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                                int i117 = (i115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                                composer3.startReplaceableGroup(-1989997546);
                                int i20 = i117 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                                composer3.startReplaceableGroup(1376089335);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                                int i21 = (((i117 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                composer3.enableReusing();
                                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-326682743);
                                if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i117 >> 6) & 112) | 6));
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), composer2, 56);
                    }
                }), composerStartRestartGroup, 1597440 | (i110 & 14) | (i110 & 112) | (i110 & 896) | (458752 & (i19 << 12)), 0);
                modifier3 = modifier2;
                function6 = function5;
                function7 = function3M661getLambda1$material_release;
                f2 = f7;
                j3 = j9;
                j4 = primarySurface;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                    AppBarKt.m563TopAppBarxWeB9s(function2, modifier3, function6, function7, j4, j3, f2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        function5 = function3;
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                function3M661getLambda1$material_release = function4;
                if (composerStartRestartGroup.changed(function3M661getLambda1$material_release)) {
                }
                i3 |= i7;
            } else {
                function3M661getLambda1$material_release = function4;
            }
            i3 |= i7;
        } else {
            function3M661getLambda1$material_release = function4;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                primarySurface = j;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i3 |= i8;
            } else {
                primarySurface = j;
            }
            i3 |= i8;
        } else {
            primarySurface = j;
        }
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                jM656contentColorForek8zF_U = j2;
                if (composerStartRestartGroup.changed(jM656contentColorForek8zF_U)) {
                }
                i3 |= i9;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i9;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                fM559getTopAppBarElevationD9Ej5fM = f;
                if (composerStartRestartGroup.changed(fM559getTopAppBarElevationD9Ej5fM)) {
                }
                i3 |= i10;
            } else {
                fM559getTopAppBarElevationD9Ej5fM = f;
            }
            i3 |= i10;
        } else {
            fM559getTopAppBarElevationD9Ej5fM = f;
        }
        if (((2995931 & i3) ^ 599186) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                }
                composerStartRestartGroup.endDefaults();
            }
            float f8 = fM559getTopAppBarElevationD9Ej5fM;
            long j10 = jM656contentColorForek8zF_U;
            final int i111 = i3;
            int i112 = i111 >> 12;
            m560AppBarcelAv9A(primarySurface, j10, f8, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i113) {
                    int i114;
                    if ((i113 & 14) == 0) {
                        i114 = i113 | (composer2.changed(rowScope) ? 4 : 2);
                    } else {
                        i114 = i113;
                    }
                    if (((i114 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (function5 == null) {
                        composer2.startReplaceableGroup(-512812651);
                        SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        Modifier modifier4 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function8 = function5;
                        int i115 = i111;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905960);
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i115 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                    final int i116 = i111;
                    composer2.startReplaceableGroup(-1989997546);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-2027905635);
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i117) {
                            if (((i117 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i116 << 3) & 112) | 8);
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                    final int i117 = i111;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                            int i119 = (i117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                            composer3.startReplaceableGroup(-1989997546);
                            int i20 = i119 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                            composer3.startReplaceableGroup(1376089335);
                            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                            int i21 = (((i119 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                            composer3.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-326682743);
                            if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i119 >> 6) & 112) | 6));
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, 1597440 | (i112 & 14) | (i112 & 112) | (i112 & 896) | (458752 & (i111 << 12)), 0);
            modifier3 = modifier2;
            function6 = function5;
            function7 = function3M661getLambda1$material_release;
            f2 = f8;
            j3 = j10;
            j4 = primarySurface;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function5 = null;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    function3M661getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m661getLambda1$material_release();
                }
                if ((i2 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    fM559getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m559getTopAppBarElevationD9Ej5fM();
                }
                composerStartRestartGroup.endDefaults();
            }
            float f9 = fM559getTopAppBarElevationD9Ej5fM;
            long j11 = jM656contentColorForek8zF_U;
            final int i113 = i3;
            int i114 = i113 >> 12;
            m560AppBarcelAv9A(primarySurface, j11, f9, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819890463, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i115) {
                    int i116;
                    if ((i115 & 14) == 0) {
                        i116 = i115 | (composer2.changed(rowScope) ? 4 : 2);
                    } else {
                        i116 = i115;
                    }
                    if (((i116 & 91) ^ 18) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (function5 == null) {
                        composer2.startReplaceableGroup(-512812651);
                        SpacerKt.Spacer(AppBarKt.TitleInsetWithoutIcon, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        Modifier modifier4 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function8 = function5;
                        int i117 = i113;
                        composer2.startReplaceableGroup(-1989997546);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 0);
                        composer2.startReplaceableGroup(1376089335);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier4);
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
                        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-326682743);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-2027905960);
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 0)))}, function8, composer2, ((i117 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    Modifier modifierWeight$default = RowScope.DefaultImpls.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2<? super Composer, ? super Integer, Unit> function9 = function2;
                    final int i118 = i113;
                    composer2.startReplaceableGroup(-1989997546);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 0);
                    composer2.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
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
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-326682743);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-2027905635);
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 0).getH6(), ComposableLambdaKt.composableLambda(composer2, -819891140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i119) {
                            if (((i119 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 0)))}, function9, composer3, ((i118 << 3) & 112) | 8);
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 0)))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function3M661getLambda1$material_release;
                    final int i119 = i113;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -819890866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function11 = function10;
                            int i1111 = (i119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                            composer3.startReplaceableGroup(-1989997546);
                            int i20 = i1111 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, (i20 & 112) | (i20 & 14));
                            composer3.startReplaceableGroup(1376089335);
                            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                            int i21 = (((i1111 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
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
                            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
                            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                            composer3.enableReusing();
                            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer3)), composer3, Integer.valueOf((i21 >> 3) & 112));
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-326682743);
                            if (((((i21 >> 9) & 14) & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                function11.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i1111 >> 6) & 112) | 6));
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    }), composer2, 56);
                }
            }), composerStartRestartGroup, 1597440 | (i114 & 14) | (i114 & 112) | (i114 & 896) | (458752 & (i113 << 12)), 0);
            modifier3 = modifier2;
            function6 = function5;
            function7 = function3M661getLambda1$material_release;
            f2 = f9;
            j3 = j11;
            j4 = primarySurface;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                AppBarKt.m563TopAppBarxWeB9s(function2, modifier3, function6, function7, j4, j3, f2, composer2, i | 1, i2);
            }
        });
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) Math.sqrt((f * f) - (f2 * f2)));
    }

    @NotNull
    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float fSqrt = (f8 - ((float) Math.sqrt(d))) / f6;
        float fSqrt2 = (f8 + ((float) Math.sqrt(d))) / f6;
        float fSqrt3 = (float) Math.sqrt(f5 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f5 - (fSqrt2 * fSqrt2));
        if (f2 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }

    private static final float square(float f) {
        return f * f;
    }
}
