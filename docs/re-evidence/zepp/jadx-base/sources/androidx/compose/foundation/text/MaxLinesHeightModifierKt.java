package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "maxLines", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "maxLinesHeight", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class MaxLinesHeightModifierKt {
    @NotNull
    public static final Modifier maxLinesHeight(@NotNull Modifier modifier, final int i, @NotNull final TextStyle textStyle) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("maxLinesHeight");
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.MaxLinesHeightModifierKt.maxLinesHeight.2
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
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i2) {
                composer.startReplaceableGroup(-1924217056);
                int i3 = i;
                int i4 = 0;
                if (!(i3 > 0)) {
                    throw new IllegalArgumentException("maxLines must be greater than 0".toString());
                }
                if (i3 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.endReplaceableGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Font.ResourceLoader resourceLoader = (Font.ResourceLoader) composer.consume(CompositionLocalsKt.getLocalFontLoader());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = textStyle;
                Object[] objArr = {density, resourceLoader, textStyle2, layoutDirection};
                composer.startReplaceableGroup(-3685570);
                int i5 = 0;
                boolean zChanged = false;
                while (i5 < 4) {
                    Object obj = objArr[i5];
                    i5++;
                    zChanged |= composer.changed(obj);
                }
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = Integer.valueOf(IntSize.m3084getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(TextStyleKt.resolveDefaults(textStyle2, layoutDirection), density, resourceLoader, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue).intValue();
                TextStyle textStyle3 = textStyle;
                Object[] objArr2 = {density, resourceLoader, textStyle3, layoutDirection};
                composer.startReplaceableGroup(-3685570);
                boolean zChanged2 = false;
                while (i4 < 4) {
                    Object obj2 = objArr2[i4];
                    i4++;
                    zChanged2 |= composer.changed(obj2);
                }
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = Integer.valueOf(IntSize.m3084getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(TextStyleKt.resolveDefaults(textStyle3, layoutDirection), density, resourceLoader, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierM311heightInVpY3zN4$default = SizeKt.m311heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, density.mo191toDpu2uoSUM(iIntValue + ((((Number) objRememberedValue2).intValue() - iIntValue) * (i - 1))), 1, null);
                composer.endReplaceableGroup();
                return modifierM311heightInVpY3zN4$default;
            }
        });
    }
}
