package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "shapes", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "MaterialTheme", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 5, 1})
public final class MaterialThemeKt {
    @Composable
    public static final void MaterialTheme(@Nullable Colors colors, @Nullable Typography typography, @Nullable Shapes shapes, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        final Colors colors2;
        int i3;
        Typography typography2;
        Shapes shapes2;
        final Shapes shapes3;
        final Typography typography3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1505114095);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                colors2 = colors;
                int i4 = composerStartRestartGroup.changed(colors2) ? 4 : 2;
                i3 = i4 | i;
            } else {
                colors2 = colors;
            }
            i3 = i4 | i;
        } else {
            colors2 = colors;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                typography2 = typography;
                int i5 = composerStartRestartGroup.changed(typography2) ? 32 : 16;
                i3 |= i5;
            } else {
                typography2 = typography;
            }
            i3 |= i5;
        } else {
            typography2 = typography;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                int i6 = composerStartRestartGroup.changed(shapes2) ? 256 : 128;
                i3 |= i6;
            } else {
                shapes2 = shapes;
            }
            i3 |= i6;
        } else {
            shapes2 = shapes;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if (((i3 & 5851) ^ 1170) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            typography3 = typography2;
            shapes3 = shapes2;
        } else {
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    colors2 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 0);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 0);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            final int i7 = i3;
            final Typography typography4 = typography2;
            Shapes shapes4 = shapes2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Colors colors3 = colors2;
                objRememberedValue = colors3.m630copypvPzIIM((8191 & 1) != 0 ? colors3.m638getPrimary0d7_KjU() : 0L, (8191 & 2) != 0 ? colors3.m639getPrimaryVariant0d7_KjU() : 0L, (8191 & 4) != 0 ? colors3.m640getSecondary0d7_KjU() : 0L, (8191 & 8) != 0 ? colors3.m641getSecondaryVariant0d7_KjU() : 0L, (8191 & 16) != 0 ? colors3.m631getBackground0d7_KjU() : 0L, (8191 & 32) != 0 ? colors3.m642getSurface0d7_KjU() : 0L, (8191 & 64) != 0 ? colors3.m632getError0d7_KjU() : 0L, (8191 & 128) != 0 ? colors3.m635getOnPrimary0d7_KjU() : 0L, (8191 & 256) != 0 ? colors3.m636getOnSecondary0d7_KjU() : 0L, (8191 & 512) != 0 ? colors3.m633getOnBackground0d7_KjU() : 0L, (8191 & 1024) != 0 ? colors3.m637getOnSurface0d7_KjU() : 0L, (8191 & 2048) != 0 ? colors3.m634getOnError0d7_KjU() : 0L, (8191 & 4096) != 0 ? colors3.isLight() : false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Colors colors4 = (Colors) objRememberedValue;
            ColorsKt.updateColorsFrom(colors4, colors2);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors4), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, 0))), IndicationKt.getLocalIndication().provides(RippleKt.m880rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes4), TextSelectionColorsKt.getLocalTextSelectionColors().provides(MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors4, composerStartRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography4)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894159, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt.MaterialTheme.1
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
                public final void invoke(@Nullable Composer composer2, int i8) {
                    if (((i8 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TextKt.ProvideTextStyle(typography4.getBody1(), function2, composer2, (i7 >> 6) & 112);
                    }
                }
            }), composerStartRestartGroup, 56);
            shapes3 = shapes4;
            typography3 = typography4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt.MaterialTheme.2
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

            public final void invoke(@Nullable Composer composer2, int i8) {
                MaterialThemeKt.MaterialTheme(colors2, typography3, shapes3, function2, composer2, i | 1, i2);
            }
        });
    }
}
