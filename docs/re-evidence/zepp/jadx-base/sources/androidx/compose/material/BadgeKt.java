package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.text.ttml.b;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001as\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u001f\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017\"\u0019\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001f\u0010\u001d\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u001f\u0010\u001f\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u001f\u0010!\u001a\u00020\u00138\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badgeContent", "Landroidx/compose/foundation/layout/BoxScope;", "content", "BadgeBox-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgeBox", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "BadgeRadius", "F", "getBadgeRadius", "()F", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Landroidx/compose/ui/unit/TextUnit;", "BadgeContentFontSize", "J", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeHorizontalOffset", "getBadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 5, 1})
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = Dp.m2965constructorimpl(8);
    private static final long BadgeContentFontSize = TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = Dp.m2965constructorimpl(-Dp.m2965constructorimpl(6));

    static {
        float f = 4;
        BadgeRadius = Dp.m2965constructorimpl(f);
        BadgeWithContentHorizontalPadding = Dp.m2965constructorimpl(f);
        BadgeHorizontalOffset = Dp.m2965constructorimpl(-Dp.m2965constructorimpl(f));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0159  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m579BadgeeopBjH0(@Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        long jM632getError0d7_KjU;
        long jM656contentColorForek8zF_U;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4;
        Modifier modifier3;
        float f;
        Function0<ComposeUiNode> constructor;
        final RowScopeInstance rowScopeInstance;
        final Modifier modifier4;
        final long j3;
        final long j4;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(521573326);
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
                jM632getError0d7_KjU = j;
                int i5 = composerStartRestartGroup.changed(jM632getError0d7_KjU) ? 32 : 16;
                i3 |= i5;
            } else {
                jM632getError0d7_KjU = j;
            }
            i3 |= i5;
        } else {
            jM632getError0d7_KjU = j;
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
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function4 = function3;
                i3 |= composerStartRestartGroup.changed(function4) ? 2048 : 1024;
            }
            if (((i3 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        function4 = null;
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
                }
                if (function4 != null) {
                    f = BadgeWithContentRadius;
                } else {
                    f = BadgeRadius;
                }
                RoundedCornerShape roundedCornerShapeM400RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(f);
                float f2 = f * 2;
                Modifier modifierM283paddingVpY3zN4$default = PaddingKt.m283paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m110backgroundbw27NRU(SizeKt.m307defaultMinSizeVpY3zN4(modifier2, Dp.m2965constructorimpl(f2), Dp.m2965constructorimpl(f2)), jM632getError0d7_KjU, roundedCornerShapeM400RoundedCornerShape0680j_4), roundedCornerShapeM400RoundedCornerShape0680j_4), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(-1989997546);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM283paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-326682743);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(104299707);
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(104299728);
                    final int i8 = 6;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1202boximpl(jM656contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891724, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                        public final void invoke(@Nullable Composer composer2, int i9) {
                            if (((i9 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 0).getButton();
                            TextStyle textStyleM2733copyHL5avdY = button.m2733copyHL5avdY((262111 & 1) != 0 ? button.getColor() : 0L, (262111 & 2) != 0 ? button.getFontSize() : BadgeKt.BadgeContentFontSize, (262111 & 4) != 0 ? button.fontWeight : null, (262111 & 8) != 0 ? button.getFontStyle() : null, (262111 & 16) != 0 ? button.getFontSynthesis() : null, (262111 & 32) != 0 ? button.fontFamily : null, (262111 & 64) != 0 ? button.fontFeatureSettings : null, (262111 & 128) != 0 ? button.getLetterSpacing() : 0L, (262111 & 256) != 0 ? button.getBaselineShift() : null, (262111 & 512) != 0 ? button.textGeometricTransform : null, (262111 & 1024) != 0 ? button.localeList : null, (262111 & 2048) != 0 ? button.getBackground() : 0L, (262111 & 4096) != 0 ? button.textDecoration : null, (262111 & 8192) != 0 ? button.shadow : null, (262111 & 16384) != 0 ? button.getTextAlign() : null, (262111 & 32768) != 0 ? button.getTextDirection() : null, (262111 & 65536) != 0 ? button.getLineHeight() : 0L, (262111 & 131072) != 0 ? button.textIndent : null);
                            final Function3<RowScope, Composer, Integer, Unit> function6 = function4;
                            final RowScope rowScope = rowScopeInstance;
                            final int i10 = i8;
                            final int i11 = i3;
                            TextKt.ProvideTextStyle(textStyleM2733copyHL5avdY, ComposableLambdaKt.composableLambda(composer2, -819888433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    if (((i12 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        function6.invoke(rowScope, composer3, Integer.valueOf((i10 & 14) | ((i11 >> 6) & 112)));
                                    }
                                }
                            }), composer2, 48);
                        }
                    }), composerStartRestartGroup, 56);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(104300092);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            modifier4 = modifier2;
            j3 = jM632getError0d7_KjU;
            j4 = jM656contentColorForek8zF_U;
            function5 = function4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    BadgeKt.m579BadgeeopBjH0(modifier4, j3, j4, function5, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function4 = function3;
        if (((i3 & 5851) ^ 1170) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            if (function4 != null) {
                f = BadgeWithContentRadius;
            } else {
                f = BadgeRadius;
            }
            RoundedCornerShape roundedCornerShapeM400RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(f);
            float f3 = f * 2;
            Modifier modifierM283paddingVpY3zN4$default2 = PaddingKt.m283paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m110backgroundbw27NRU(SizeKt.m307defaultMinSizeVpY3zN4(modifier2, Dp.m2965constructorimpl(f3), Dp.m2965constructorimpl(f3)), jM632getError0d7_KjU, roundedCornerShapeM400RoundedCornerShape0680j_5), roundedCornerShapeM400RoundedCornerShape0680j_5), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM283paddingVpY3zN4$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(104299707);
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(104299728);
                final int i9 = 6;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1202boximpl(jM656contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891724, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                    public final void invoke(@Nullable Composer composer2, int i10) {
                        if (((i10 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 0).getButton();
                        TextStyle textStyleM2733copyHL5avdY = button.m2733copyHL5avdY((262111 & 1) != 0 ? button.getColor() : 0L, (262111 & 2) != 0 ? button.getFontSize() : BadgeKt.BadgeContentFontSize, (262111 & 4) != 0 ? button.fontWeight : null, (262111 & 8) != 0 ? button.getFontStyle() : null, (262111 & 16) != 0 ? button.getFontSynthesis() : null, (262111 & 32) != 0 ? button.fontFamily : null, (262111 & 64) != 0 ? button.fontFeatureSettings : null, (262111 & 128) != 0 ? button.getLetterSpacing() : 0L, (262111 & 256) != 0 ? button.getBaselineShift() : null, (262111 & 512) != 0 ? button.textGeometricTransform : null, (262111 & 1024) != 0 ? button.localeList : null, (262111 & 2048) != 0 ? button.getBackground() : 0L, (262111 & 4096) != 0 ? button.textDecoration : null, (262111 & 8192) != 0 ? button.shadow : null, (262111 & 16384) != 0 ? button.getTextAlign() : null, (262111 & 32768) != 0 ? button.getTextDirection() : null, (262111 & 65536) != 0 ? button.getLineHeight() : 0L, (262111 & 131072) != 0 ? button.textIndent : null);
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = function4;
                        final RowScope rowScope = rowScopeInstance;
                        final int i11 = i9;
                        final int i12 = i3;
                        TextKt.ProvideTextStyle(textStyleM2733copyHL5avdY, ComposableLambdaKt.composableLambda(composer2, -819888433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i13) {
                                if (((i13 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(rowScope, composer3, Integer.valueOf((i11 & 14) | ((i12 >> 6) & 112)));
                                }
                            }
                        }), composer2, 48);
                    }
                }), composerStartRestartGroup, 56);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(104300092);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            if (function4 != null) {
                f = BadgeWithContentRadius;
            } else {
                f = BadgeRadius;
            }
            RoundedCornerShape roundedCornerShapeM400RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(f);
            float f4 = f * 2;
            Modifier modifierM283paddingVpY3zN4$default3 = PaddingKt.m283paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m110backgroundbw27NRU(SizeKt.m307defaultMinSizeVpY3zN4(modifier2, Dp.m2965constructorimpl(f4), Dp.m2965constructorimpl(f4)), jM632getError0d7_KjU, roundedCornerShapeM400RoundedCornerShape0680j_6), roundedCornerShapeM400RoundedCornerShape0680j_6), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM283paddingVpY3zN4$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(104299707);
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(104299728);
                final int i10 = 6;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1202boximpl(jM656contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819891724, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 0).getButton();
                        TextStyle textStyleM2733copyHL5avdY = button.m2733copyHL5avdY((262111 & 1) != 0 ? button.getColor() : 0L, (262111 & 2) != 0 ? button.getFontSize() : BadgeKt.BadgeContentFontSize, (262111 & 4) != 0 ? button.fontWeight : null, (262111 & 8) != 0 ? button.getFontStyle() : null, (262111 & 16) != 0 ? button.getFontSynthesis() : null, (262111 & 32) != 0 ? button.fontFamily : null, (262111 & 64) != 0 ? button.fontFeatureSettings : null, (262111 & 128) != 0 ? button.getLetterSpacing() : 0L, (262111 & 256) != 0 ? button.getBaselineShift() : null, (262111 & 512) != 0 ? button.textGeometricTransform : null, (262111 & 1024) != 0 ? button.localeList : null, (262111 & 2048) != 0 ? button.getBackground() : 0L, (262111 & 4096) != 0 ? button.textDecoration : null, (262111 & 8192) != 0 ? button.shadow : null, (262111 & 16384) != 0 ? button.getTextAlign() : null, (262111 & 32768) != 0 ? button.getTextDirection() : null, (262111 & 65536) != 0 ? button.getLineHeight() : 0L, (262111 & 131072) != 0 ? button.textIndent : null);
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = function4;
                        final RowScope rowScope = rowScopeInstance;
                        final int i12 = i10;
                        final int i13 = i3;
                        TextKt.ProvideTextStyle(textStyleM2733copyHL5avdY, ComposableLambdaKt.composableLambda(composer2, -819888433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if (((i14 & 11) ^ 2) == 0 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    function6.invoke(rowScope, composer3, Integer.valueOf((i12 & 14) | ((i13 >> 6) & 112)));
                                }
                            }
                        }), composer2, 48);
                    }
                }), composerStartRestartGroup, 56);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(104300092);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        modifier4 = modifier2;
        j3 = jM632getError0d7_KjU;
        j4 = jM656contentColorForek8zF_U;
        function5 = function4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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
                BadgeKt.m579BadgeeopBjH0(modifier4, j3, j4, function5, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x0201  */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:112:0x025c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0267  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x013e  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0199  */
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: BadgeBox-DTcfvLk, reason: not valid java name */
    public static final void m580BadgeBoxDTcfvLk(@Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @NotNull final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM632getError0d7_KjU;
        long jM656contentColorForek8zF_U;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        int i4;
        Modifier modifier3;
        long j3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6;
        final float f;
        ComposeUiNode.Companion companion;
        Function0<ComposeUiNode> constructor;
        int i5;
        int i6;
        Function0<ComposeUiNode> constructor2;
        int i7;
        final long j4;
        final long j5;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function7;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148640603);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
                jM632getError0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM632getError0d7_KjU) ? 32 : 16;
                i3 |= i9;
            } else {
                jM632getError0d7_KjU = j;
            }
            i3 |= i9;
        } else {
            jM632getError0d7_KjU = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM656contentColorForek8zF_U = j2;
                int i10 = composerStartRestartGroup.changed(jM656contentColorForek8zF_U) ? 256 : 128;
                i3 |= i10;
            } else {
                jM656contentColorForek8zF_U = j2;
            }
            i3 |= i10;
        } else {
            jM656contentColorForek8zF_U = j2;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                function5 = function3;
                i3 |= composerStartRestartGroup.changed(function5) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(function4)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if (((46811 & i3) ^ 9362) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                    if ((i2 & 4) != 0) {
                        jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i11 != 0) {
                        function5 = null;
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
                }
                j3 = jM656contentColorForek8zF_U;
                function6 = function5;
                if (function6 != null) {
                    f = BadgeWithContentHorizontalOffset;
                } else {
                    f = BadgeHorizontalOffset;
                }
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i12);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i12);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j6) {
                        for (Measurable measurable : list) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                                final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, 0, 0, 0, 0, 11, null));
                                for (Measurable measurable2 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), XmPlayerService.TYPE_RANK_ANCHOR)) {
                                        final Placeable placeableMo2468measureBRTryo1 = measurable2.mo2468measureBRTryo0(j6);
                                        int i12 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                                        int i13 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getLastBaseline());
                                        int width = placeableMo2468measureBRTryo1.getWidth();
                                        int height = placeableMo2468measureBRTryo1.getHeight();
                                        Map<AlignmentLine, Integer> mapMapOf = r.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i12)), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i13)));
                                        final float f2 = f;
                                        return measureScope.layout(width, height, mapMapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2$measure$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo1, 0, 0, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, placeableMo2468measureBRTryo1.getWidth() + measureScope.mo188roundToPx0680j_4(f2), (-placeableMo2468measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i12);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i12) {
                        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i12);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
                i5 = (((i3 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1900631173);
                if (((((i5 >> 9) & 14) & 11) ^ 2) == 0 || !composerStartRestartGroup.getSkipping()) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, XmPlayerService.TYPE_RANK_ANCHOR);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    i6 = ((i3 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                    composerStartRestartGroup.startReplaceableGroup(-1990474327);
                    int i12 = i6 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    constructor2 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
                    i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl2, density2, companion.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1253629305);
                    if (((((i7 >> 9) & 14) & 11) ^ 2) == 0 || !composerStartRestartGroup.getSkipping()) {
                        function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    m579BadgeeopBjH0(LayoutIdKt.layoutId(companion2, "badge"), jM632getError0d7_KjU, j3, function6, composerStartRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                j4 = jM632getError0d7_KjU;
                j5 = j3;
                function7 = function6;
                modifier4 = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j4 = jM632getError0d7_KjU;
                j5 = jM656contentColorForek8zF_U;
                function7 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgeBox$3
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
                    BadgeKt.m580BadgeBoxDTcfvLk(modifier4, j4, j5, function7, function4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        function5 = function3;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(function4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (((46811 & i3) ^ 9362) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i11 != 0) {
                    function5 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i11 != 0) {
                    function5 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            j3 = jM656contentColorForek8zF_U;
            function6 = function5;
            if (function6 != null) {
                f = BadgeWithContentHorizontalOffset;
            } else {
                f = BadgeHorizontalOffset;
            }
            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j6) {
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                            final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, 0, 0, 0, 0, 11, null));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), XmPlayerService.TYPE_RANK_ANCHOR)) {
                                    final Placeable placeableMo2468measureBRTryo1 = measurable2.mo2468measureBRTryo0(j6);
                                    int i13 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                                    int i14 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getLastBaseline());
                                    int width = placeableMo2468measureBRTryo1.getWidth();
                                    int height = placeableMo2468measureBRTryo1.getHeight();
                                    Map<AlignmentLine, Integer> mapMapOf = r.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i13)), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i14)));
                                    final float f2 = f;
                                    return measureScope.layout(width, height, mapMapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo1, 0, 0, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, placeableMo2468measureBRTryo1.getWidth() + measureScope.mo188roundToPx0680j_4(f2), (-placeableMo2468measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i13) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i13);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            companion = ComposeUiNode.INSTANCE;
            constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier2);
            i5 = (((i3 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl3, measurePolicy2, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl3, density3, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1900631173);
            if (((((i5 >> 9) & 14) & 11) ^ 2) == 0) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion3, XmPlayerService.TYPE_RANK_ANCHOR);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                i6 = ((i3 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i13 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, (i13 & 112) | (i13 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierLayoutId2);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl4, density4, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                } else {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                m579BadgeeopBjH0(LayoutIdKt.layoutId(companion3, "badge"), jM632getError0d7_KjU, j3, function6, composerStartRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
            } else {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion4, XmPlayerService.TYPE_RANK_ANCHOR);
                Alignment center3 = Alignment.INSTANCE.getCenter();
                i6 = ((i3 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i14 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, (i14 & 112) | (i14 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId3);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl5, density5, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                } else {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                m579BadgeeopBjH0(LayoutIdKt.layoutId(companion4, "badge"), jM632getError0d7_KjU, j3, function6, composerStartRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            j4 = jM632getError0d7_KjU;
            j5 = j3;
            function7 = function6;
            modifier4 = modifier2;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i11 != 0) {
                    function5 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM632getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m632getError0d7_KjU();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    jM656contentColorForek8zF_U = ColorsKt.m656contentColorForek8zF_U(jM632getError0d7_KjU, composerStartRestartGroup, (i3 >> 3) & 14);
                    i3 &= -897;
                }
                if (i11 != 0) {
                    function5 = null;
                }
                composerStartRestartGroup.endDefaults();
                modifier2 = modifier3;
            }
            j3 = jM656contentColorForek8zF_U;
            function6 = function5;
            if (function6 != null) {
                f = BadgeWithContentHorizontalOffset;
            } else {
                f = BadgeHorizontalOffset;
            }
            MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j6) {
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                            final Placeable placeableMo2468measureBRTryo0 = measurable.mo2468measureBRTryo0(Constraints.m2926copyZbe2FdA$default(j6, 0, 0, 0, 0, 11, null));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), XmPlayerService.TYPE_RANK_ANCHOR)) {
                                    final Placeable placeableMo2468measureBRTryo1 = measurable2.mo2468measureBRTryo0(j6);
                                    int i15 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                                    int i16 = placeableMo2468measureBRTryo1.get(AlignmentLineKt.getLastBaseline());
                                    int width = placeableMo2468measureBRTryo1.getWidth();
                                    int height = placeableMo2468measureBRTryo1.getHeight();
                                    Map<AlignmentLine, Integer> mapMapOf = r.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(i15)), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(i16)));
                                    final float f2 = f;
                                    return measureScope.layout(width, height, mapMapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgeBox$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo1, 0, 0, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2468measureBRTryo0, placeableMo2468measureBRTryo1.getWidth() + measureScope.mo188roundToPx0680j_4(f2), (-placeableMo2468measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                                        }
                                    });
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i15) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i15);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            companion = ComposeUiNode.INSTANCE;
            constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifier2);
            i5 = (((i3 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl6, measurePolicy3, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl6, density6, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1900631173);
            if (((((i5 >> 9) & 14) & 11) ^ 2) == 0) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierLayoutId4 = LayoutIdKt.layoutId(companion5, XmPlayerService.TYPE_RANK_ANCHOR);
                Alignment center4 = Alignment.INSTANCE.getCenter();
                i6 = ((i3 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i15 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, (i15 & 112) | (i15 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierLayoutId4);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl7, density7, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                } else {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                m579BadgeeopBjH0(LayoutIdKt.layoutId(companion5, "badge"), jM632getError0d7_KjU, j3, function6, composerStartRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
            } else {
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierLayoutId5 = LayoutIdKt.layoutId(companion6, XmPlayerService.TYPE_RANK_ANCHOR);
                Alignment center5 = Alignment.INSTANCE.getCenter();
                i6 = ((i3 >> 3) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 6;
                composerStartRestartGroup.startReplaceableGroup(-1990474327);
                int i16 = i6 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierLayoutId5);
                i7 = (((i6 << 3) & 112) << 9) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl8 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl8, measurePolicyRememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl8, density8, companion.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl8, layoutDirection8, companion.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf8.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-1253629305);
                if (((((i7 >> 9) & 14) & 11) ^ 2) == 0) {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                } else {
                    function4.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                m579BadgeeopBjH0(LayoutIdKt.layoutId(companion6, "badge"), jM632getError0d7_KjU, j3, function6, composerStartRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            j4 = jM632getError0d7_KjU;
            j5 = j3;
            function7 = function6;
            modifier4 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgeBox$3
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
                BadgeKt.m580BadgeBoxDTcfvLk(modifier4, j4, j5, function7, function4, composer2, i | 1, i2);
            }
        });
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentRadius() {
        return BadgeWithContentRadius;
    }
}
