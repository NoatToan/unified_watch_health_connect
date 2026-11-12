package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.text.ttml.b;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÉ\u0001\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aß\u0001\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020%0$2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a*\u0010-\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001e2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u001c0*¢\u0006\u0002\b+H\u0007¢\u0006\u0004\b-\u0010.\"\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/TextUnit;", b.J, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontFamily;", b.K, "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", b.P, "Landroidx/compose/ui/text/style/TextAlign;", b.Q, "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "ProvideTextStyle", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 5, 1})
public final class TextKt {

    @NotNull
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    @Composable
    public static final void ProvideTextStyle(@NotNull final TextStyle textStyle, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1919620117);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) composerStartRestartGroup.consume(providableCompositionLocal)).merge(textStyle))}, function2, composerStartRestartGroup, (i2 & 112) | 8);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt.ProvideTextStyle.1
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                TextKt.ProvideTextStyle(textStyle, function2, composer2, i | 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x0172  */
    /* JADX WARN: Code duplicated, block: B:131:0x017b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0181  */
    /* JADX WARN: Code duplicated, block: B:136:0x0188  */
    /* JADX WARN: Code duplicated, block: B:138:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x0199  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:187:0x0257  */
    /* JADX WARN: Code duplicated, block: B:189:0x025c  */
    /* JADX WARN: Code duplicated, block: B:190:0x025f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0265  */
    /* JADX WARN: Code duplicated, block: B:194:0x026e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0273  */
    /* JADX WARN: Code duplicated, block: B:198:0x027c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0280  */
    /* JADX WARN: Code duplicated, block: B:201:0x0283  */
    /* JADX WARN: Code duplicated, block: B:203:0x0287  */
    /* JADX WARN: Code duplicated, block: B:204:0x028a  */
    /* JADX WARN: Code duplicated, block: B:206:0x028e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0291  */
    /* JADX WARN: Code duplicated, block: B:210:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:216:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:230:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:232:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:240:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:241:0x0309  */
    /* JADX WARN: Code duplicated, block: B:245:0x0337  */
    /* JADX WARN: Code duplicated, block: B:246:0x033a  */
    /* JADX WARN: Code duplicated, block: B:248:0x033e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0341  */
    /* JADX WARN: Code duplicated, block: B:252:0x034e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0353  */
    /* JADX WARN: Code duplicated, block: B:261:0x0422  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Instruction removed from duplicated block: B:159:0x01ef, please report this as an issue */
    @Composable
    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    public static final void m868Text4IGK_g(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, @Nullable Map<String, InlineTextContent> map, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        long j5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        long jM1248getUnspecified0d7_KjU;
        long jM3117getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long jM3117getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long jM3117getUnspecifiedXSAIIZE3;
        int iM2920getClipgIe3tQ8;
        boolean z2;
        int i23;
        Map<String, InlineTextContent> mapEmptyMap;
        Function1<? super TextLayoutResult, Unit> function2;
        TextStyle textStyle2;
        TextStyle textStyle3;
        int i24;
        int i25;
        boolean z3;
        int i26;
        Map<String, InlineTextContent> map2;
        TextDecoration textDecoration3;
        Function1<? super TextLayoutResult, Unit> function3;
        long j6;
        TextAlign textAlign3;
        int i27;
        long j7;
        long j8;
        Color.Companion companion;
        boolean z4;
        long color;
        long j9;
        final Modifier modifier3;
        final TextAlign textAlign4;
        final FontStyle fontStyle3;
        final Function1<? super TextLayoutResult, Unit> function4;
        final TextDecoration textDecoration4;
        final long j10;
        int i28;
        TextStyle textStyle4;
        long j11;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final Map<String, InlineTextContent> map3;
        final long j12;
        final long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i29;
        int i30;
        int i31;
        int i32;
        Composer composerStartRestartGroup = composer.startRestartGroup(1557616910);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 == 0) {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i3 & 896) == 0) {
                j5 = j;
                if ((i5 & 4) == 0 || !composerStartRestartGroup.changed(j5)) {
                    i32 = 128;
                } else {
                    i32 = 256;
                }
                i6 |= i32;
            } else {
                j5 = j;
            }
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                if ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i31 = 1024;
                } else {
                    i31 = 2048;
                }
                i6 |= i31;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                i6 |= 8192;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(fontWeight)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(fontFamily)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i6 |= i11;
            }
            if ((i3 & 29360128) != 0) {
                if ((i5 & 128) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i30 = 4194304;
                } else {
                    i30 = 8388608;
                }
                i6 |= i30;
            }
            i12 = i5 & 256;
            if (i12 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(textDecoration)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i6 |= i13;
            }
            i14 = i5 & 512;
            if (i14 != 0) {
                i6 |= 268435456;
            }
            if ((i4 & 14) == 0) {
                i15 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changed(j4)) ? 2 : 4);
            } else {
                i15 = i4;
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
                i15 |= 16;
            }
            i17 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                    if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i21 = 2048;
                        } else {
                            i21 = 1024;
                        }
                        i17 |= i21;
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                        i17 |= 8192;
                    }
                    if ((i4 & 458752) != 0) {
                        i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
                    }
                    if ((i4 & 3670016) != 0) {
                        if ((i5 & 65536) == 0 || !composerStartRestartGroup.changed(textStyle)) {
                            i29 = 524288;
                        } else {
                            i29 = 1048576;
                        }
                        i17 |= i29;
                    }
                    if (((~i5) & 18960) != 0 && ((1533916891 & i6) ^ 306783378) == 0 && ((2995931 & i17) ^ 599186) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j10 = j2;
                        fontStyle3 = fontStyle;
                        fontWeight3 = fontWeight;
                        fontFamily3 = fontFamily;
                        textDecoration4 = textDecoration;
                        textAlign4 = textAlign;
                        j11 = j4;
                        i28 = i;
                        z3 = z;
                        i26 = i2;
                        map3 = map;
                        function4 = function1;
                        textStyle4 = textStyle;
                        j12 = j5;
                        j13 = j3;
                    } else {
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i33 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 4) != 0) {
                                jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                                i6 &= -897;
                            } else {
                                jM1248getUnspecified0d7_KjU = j5;
                            }
                            if ((i5 & 8) != 0) {
                                jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i6 &= -7169;
                            } else {
                                jM3117getUnspecifiedXSAIIZE = j2;
                            }
                            if (i7 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i8 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i10 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if ((i5 & 128) != 0) {
                                jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i6 &= -29360129;
                            } else {
                                jM3117getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i12 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i14 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if ((i5 & 1024) != 0) {
                                jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i17 &= -15;
                            } else {
                                jM3117getUnspecifiedXSAIIZE3 = j4;
                            }
                            if (i16 != 0) {
                                iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                                i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                iM2920getClipgIe3tQ8 = i;
                            }
                            if (i18 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i20 != 0) {
                                i23 = Integer.MAX_VALUE;
                            } else {
                                i23 = i2;
                            }
                            if (i22 != 0) {
                                mapEmptyMap = r.emptyMap();
                                i17 &= -57345;
                            } else {
                                mapEmptyMap = map;
                            }
                            if ((i5 & 32768) != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i17 &= -458753;
                            } else {
                                function2 = function1;
                            }
                            TextAlign textAlign5 = textAlign2;
                            if ((i5 & 65536) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                i17 &= -3670017;
                            } else {
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            textStyle3 = textStyle2;
                            i24 = i17;
                            i25 = i6;
                            z3 = z2;
                            i26 = i23;
                            map2 = mapEmptyMap;
                            textDecoration3 = textDecoration2;
                            function3 = function2;
                            j6 = jM3117getUnspecifiedXSAIIZE2;
                            textAlign3 = textAlign5;
                            i27 = iM2920getClipgIe3tQ8;
                            j5 = jM1248getUnspecified0d7_KjU;
                            j7 = jM3117getUnspecifiedXSAIIZE;
                            j8 = jM3117getUnspecifiedXSAIIZE3;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i5 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i5 & 8) != 0) {
                                i6 &= -7169;
                            }
                            if ((i5 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i5 & 1024) != 0) {
                                i17 &= -15;
                            }
                            if (i16 != 0) {
                                i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if (i22 != 0) {
                                i17 &= -57345;
                            }
                            if ((i5 & 32768) != 0) {
                                i17 &= -458753;
                            }
                            if ((i5 & 65536) != 0) {
                                i17 &= -3670017;
                            }
                            modifier2 = modifier;
                            j7 = j2;
                            fontStyle2 = fontStyle;
                            fontWeight2 = fontWeight;
                            fontFamily2 = fontFamily;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j8 = j4;
                            i27 = i;
                            z3 = z;
                            i26 = i2;
                            map2 = map;
                            function3 = function1;
                            textStyle3 = textStyle;
                            i24 = i17;
                            i25 = i6;
                            j6 = j3;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1557617653);
                        companion = Color.INSTANCE;
                        if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            j9 = j5;
                        } else {
                            color = textStyle3.getColor();
                            if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                                color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            j9 = color;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextStyle textStyle5 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                        long j14 = j7;
                        TextStyle textStyle6 = textStyle3;
                        int i34 = i24 << 9;
                        BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle6.merge(textStyle5), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i34 & 458752) | (i34 & 3670016), 0);
                        modifier3 = modifier2;
                        textAlign4 = textAlign3;
                        fontStyle3 = fontStyle2;
                        function4 = function3;
                        int i35 = i27;
                        textDecoration4 = textDecoration3;
                        j10 = j14;
                        FontWeight fontWeight4 = fontWeight2;
                        i28 = i35;
                        Map<String, InlineTextContent> map4 = map2;
                        textStyle4 = textStyle6;
                        j11 = j8;
                        fontWeight3 = fontWeight4;
                        fontFamily3 = fontFamily2;
                        map3 = map4;
                        long j15 = j6;
                        j12 = j5;
                        j13 = j15;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final long j16 = j11;
                    final int i36 = i28;
                    final boolean z5 = z3;
                    final int i37 = i26;
                    final TextStyle textStyle7 = textStyle4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                        public final void invoke(@Nullable Composer composer2, int i38) {
                            TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j16, i36, z5, i37, map3, function4, textStyle7, composer2, i3 | 1, i4, i5);
                        }
                    });
                }
                i17 |= 3072;
                i22 = i5 & 16384;
                if (i22 != 0) {
                    i17 |= 8192;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
                }
                if ((i4 & 3670016) != 0) {
                    if ((i5 & 65536) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
                if (((~i5) & 18960) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign6 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign6;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign7 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign7;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle8 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j17 = j7;
                    TextStyle textStyle9 = textStyle3;
                    int i38 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle9.merge(textStyle8), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i38 & 458752) | (i38 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i39 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j17;
                    FontWeight fontWeight5 = fontWeight2;
                    i28 = i39;
                    Map<String, InlineTextContent> map5 = map2;
                    textStyle4 = textStyle9;
                    j11 = j8;
                    fontWeight3 = fontWeight5;
                    fontFamily3 = fontFamily2;
                    map3 = map5;
                    long j18 = j6;
                    j12 = j5;
                    j13 = j18;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign8 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign8;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign9 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign9;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle10 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j19 = j7;
                    TextStyle textStyle11 = textStyle3;
                    int i310 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle11.merge(textStyle10), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i310 & 458752) | (i310 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i311 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j19;
                    FontWeight fontWeight6 = fontWeight2;
                    i28 = i311;
                    Map<String, InlineTextContent> map6 = map2;
                    textStyle4 = textStyle11;
                    j11 = j8;
                    fontWeight3 = fontWeight6;
                    fontFamily3 = fontFamily2;
                    map3 = map6;
                    long j110 = j6;
                    j12 = j5;
                    j13 = j110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j111 = j11;
                final int i312 = i28;
                final boolean z6 = z3;
                final int i313 = i26;
                final TextStyle textStyle12 = textStyle4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                    public final void invoke(@Nullable Composer composer2, int i314) {
                        TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j111, i312, z6, i313, map3, function4, textStyle12, composer2, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 384;
            i20 = i5 & 8192;
            if (i20 != 0) {
                if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i17 |= i21;
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                    i17 |= 8192;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
                }
                if ((i4 & 3670016) != 0) {
                    if ((i5 & 65536) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
                if (((~i5) & 18960) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign10 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign10;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign11 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign11;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle13 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j112 = j7;
                    TextStyle textStyle14 = textStyle3;
                    int i314 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle14.merge(textStyle13), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i314 & 458752) | (i314 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i315 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j112;
                    FontWeight fontWeight7 = fontWeight2;
                    i28 = i315;
                    Map<String, InlineTextContent> map7 = map2;
                    textStyle4 = textStyle14;
                    j11 = j8;
                    fontWeight3 = fontWeight7;
                    fontFamily3 = fontFamily2;
                    map3 = map7;
                    long j113 = j6;
                    j12 = j5;
                    j13 = j113;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign12 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign12;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign13 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign13;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle15 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j114 = j7;
                    TextStyle textStyle16 = textStyle3;
                    int i316 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle16.merge(textStyle15), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i316 & 458752) | (i316 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i317 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j114;
                    FontWeight fontWeight8 = fontWeight2;
                    i28 = i317;
                    Map<String, InlineTextContent> map8 = map2;
                    textStyle4 = textStyle16;
                    j11 = j8;
                    fontWeight3 = fontWeight8;
                    fontFamily3 = fontFamily2;
                    map3 = map8;
                    long j115 = j6;
                    j12 = j5;
                    j13 = j115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j116 = j11;
                final int i318 = i28;
                final boolean z7 = z3;
                final int i319 = i26;
                final TextStyle textStyle17 = textStyle4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                    public final void invoke(@Nullable Composer composer2, int i3110) {
                        TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j116, i318, z7, i319, map3, function4, textStyle17, composer2, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 3072;
            i22 = i5 & 16384;
            if (i22 != 0) {
                i17 |= 8192;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
            }
            if ((i4 & 3670016) != 0) {
                if ((i5 & 65536) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i17 |= i29;
            }
            if (((~i5) & 18960) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign14 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign14;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign15 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign15;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle18 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j117 = j7;
                TextStyle textStyle19 = textStyle3;
                int i3110 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle19.merge(textStyle18), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i3110 & 458752) | (i3110 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i3111 = i27;
                textDecoration4 = textDecoration3;
                j10 = j117;
                FontWeight fontWeight9 = fontWeight2;
                i28 = i3111;
                Map<String, InlineTextContent> map9 = map2;
                textStyle4 = textStyle19;
                j11 = j8;
                fontWeight3 = fontWeight9;
                fontFamily3 = fontFamily2;
                map3 = map9;
                long j118 = j6;
                j12 = j5;
                j13 = j118;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign16 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign16;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign17 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign17;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle110 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j119 = j7;
                TextStyle textStyle111 = textStyle3;
                int i3112 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle111.merge(textStyle110), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i3112 & 458752) | (i3112 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i3113 = i27;
                textDecoration4 = textDecoration3;
                j10 = j119;
                FontWeight fontWeight10 = fontWeight2;
                i28 = i3113;
                Map<String, InlineTextContent> map10 = map2;
                textStyle4 = textStyle111;
                j11 = j8;
                fontWeight3 = fontWeight10;
                fontFamily3 = fontFamily2;
                map3 = map10;
                long j1110 = j6;
                j12 = j5;
                j13 = j1110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j1111 = j11;
            final int i3114 = i28;
            final boolean z8 = z3;
            final int i3115 = i26;
            final TextStyle textStyle112 = textStyle4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                public final void invoke(@Nullable Composer composer2, int i3116) {
                    TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j1111, i3114, z8, i3115, map3, function4, textStyle112, composer2, i3 | 1, i4, i5);
                }
            });
        }
        i6 |= 48;
        if ((i3 & 896) == 0) {
            j5 = j;
            if ((i5 & 4) == 0) {
                i32 = 128;
            } else {
                i32 = 128;
            }
            i6 |= i32;
        } else {
            j5 = j;
        }
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            if ((i5 & 8) == 0) {
                i31 = 1024;
            } else {
                i31 = 1024;
            }
            i6 |= i31;
        }
        i7 = i5 & 16;
        if (i7 != 0) {
            i6 |= 8192;
        }
        i8 = i5 & 32;
        if (i8 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(fontWeight)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        i10 = i5 & 64;
        if (i10 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(fontFamily)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((i3 & 29360128) != 0) {
            if ((i5 & 128) == 0) {
                i30 = 4194304;
            } else {
                i30 = 4194304;
            }
            i6 |= i30;
        }
        i12 = i5 & 256;
        if (i12 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(textDecoration)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i6 |= i13;
        }
        i14 = i5 & 512;
        if (i14 != 0) {
            i6 |= 268435456;
        }
        if ((i4 & 14) == 0) {
            i15 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changed(j4)) ? 2 : 4);
        } else {
            i15 = i4;
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
            i15 |= 16;
        }
        i17 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
            if ((i4 & 896) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
                if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i17 |= i21;
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                    i17 |= 8192;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
                }
                if ((i4 & 3670016) != 0) {
                    if ((i5 & 65536) == 0) {
                        i29 = 524288;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
                if (((~i5) & 18960) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign18 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign18;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign19 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign19;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle113 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j1112 = j7;
                    TextStyle textStyle114 = textStyle3;
                    int i3116 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle114.merge(textStyle113), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i3116 & 458752) | (i3116 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i3117 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j1112;
                    FontWeight fontWeight11 = fontWeight2;
                    i28 = i3117;
                    Map<String, InlineTextContent> map11 = map2;
                    textStyle4 = textStyle114;
                    j11 = j8;
                    fontWeight3 = fontWeight11;
                    fontFamily3 = fontFamily2;
                    map3 = map11;
                    long j1113 = j6;
                    j12 = j5;
                    j13 = j1113;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign110 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign110;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        } else {
                            jM1248getUnspecified0d7_KjU = j5;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i23 = Integer.MAX_VALUE;
                        } else {
                            i23 = i2;
                        }
                        if (i22 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i17 &= -57345;
                        } else {
                            mapEmptyMap = map;
                        }
                        if ((i5 & 32768) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -458753;
                        } else {
                            function2 = function1;
                        }
                        TextAlign textAlign111 = textAlign2;
                        if ((i5 & 65536) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -3670017;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        textStyle3 = textStyle2;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i23;
                        map2 = mapEmptyMap;
                        textDecoration3 = textDecoration2;
                        function3 = function2;
                        j6 = jM3117getUnspecifiedXSAIIZE2;
                        textAlign3 = textAlign111;
                        i27 = iM2920getClipgIe3tQ8;
                        j5 = jM1248getUnspecified0d7_KjU;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                        j8 = jM3117getUnspecifiedXSAIIZE3;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1557617653);
                    companion = Color.INSTANCE;
                    if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        j9 = j5;
                    } else {
                        color = textStyle3.getColor();
                        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                            color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        j9 = color;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextStyle textStyle115 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                    long j1114 = j7;
                    TextStyle textStyle116 = textStyle3;
                    int i3118 = i24 << 9;
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle116.merge(textStyle115), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i3118 & 458752) | (i3118 & 3670016), 0);
                    modifier3 = modifier2;
                    textAlign4 = textAlign3;
                    fontStyle3 = fontStyle2;
                    function4 = function3;
                    int i3119 = i27;
                    textDecoration4 = textDecoration3;
                    j10 = j1114;
                    FontWeight fontWeight12 = fontWeight2;
                    i28 = i3119;
                    Map<String, InlineTextContent> map12 = map2;
                    textStyle4 = textStyle116;
                    j11 = j8;
                    fontWeight3 = fontWeight12;
                    fontFamily3 = fontFamily2;
                    map3 = map12;
                    long j1115 = j6;
                    j12 = j5;
                    j13 = j1115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j1116 = j11;
                final int i31110 = i28;
                final boolean z9 = z3;
                final int i31111 = i26;
                final TextStyle textStyle117 = textStyle4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                    public final void invoke(@Nullable Composer composer2, int i31112) {
                        TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j1116, i31110, z9, i31111, map3, function4, textStyle117, composer2, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 3072;
            i22 = i5 & 16384;
            if (i22 != 0) {
                i17 |= 8192;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
            }
            if ((i4 & 3670016) != 0) {
                if ((i5 & 65536) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i17 |= i29;
            }
            if (((~i5) & 18960) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign112 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign112;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign113 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign113;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle118 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j1117 = j7;
                TextStyle textStyle119 = textStyle3;
                int i31112 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle119.merge(textStyle118), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i31112 & 458752) | (i31112 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i31113 = i27;
                textDecoration4 = textDecoration3;
                j10 = j1117;
                FontWeight fontWeight13 = fontWeight2;
                i28 = i31113;
                Map<String, InlineTextContent> map13 = map2;
                textStyle4 = textStyle119;
                j11 = j8;
                fontWeight3 = fontWeight13;
                fontFamily3 = fontFamily2;
                map3 = map13;
                long j1118 = j6;
                j12 = j5;
                j13 = j1118;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign114 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign114;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign115 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign115;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle1110 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j1119 = j7;
                TextStyle textStyle1111 = textStyle3;
                int i31114 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle1111.merge(textStyle1110), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i31114 & 458752) | (i31114 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i31115 = i27;
                textDecoration4 = textDecoration3;
                j10 = j1119;
                FontWeight fontWeight14 = fontWeight2;
                i28 = i31115;
                Map<String, InlineTextContent> map14 = map2;
                textStyle4 = textStyle1111;
                j11 = j8;
                fontWeight3 = fontWeight14;
                fontFamily3 = fontFamily2;
                map3 = map14;
                long j11110 = j6;
                j12 = j5;
                j13 = j11110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j11111 = j11;
            final int i31116 = i28;
            final boolean z10 = z3;
            final int i31117 = i26;
            final TextStyle textStyle1112 = textStyle4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                public final void invoke(@Nullable Composer composer2, int i31118) {
                    TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j11111, i31116, z10, i31117, map3, function4, textStyle1112, composer2, i3 | 1, i4, i5);
                }
            });
        }
        i17 |= 384;
        i20 = i5 & 8192;
        if (i20 != 0) {
            if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i17 |= i21;
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
                i17 |= 8192;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
            }
            if ((i4 & 3670016) != 0) {
                if ((i5 & 65536) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i17 |= i29;
            }
            if (((~i5) & 18960) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign116 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign116;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign117 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign117;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle1113 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j11112 = j7;
                TextStyle textStyle1114 = textStyle3;
                int i31118 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle1114.merge(textStyle1113), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i31118 & 458752) | (i31118 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i31119 = i27;
                textDecoration4 = textDecoration3;
                j10 = j11112;
                FontWeight fontWeight15 = fontWeight2;
                i28 = i31119;
                Map<String, InlineTextContent> map15 = map2;
                textStyle4 = textStyle1114;
                j11 = j8;
                fontWeight3 = fontWeight15;
                fontFamily3 = fontFamily2;
                map3 = map15;
                long j11113 = j6;
                j12 = j5;
                j13 = j11113;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign118 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign118;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    } else {
                        jM1248getUnspecified0d7_KjU = j5;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i23 = i2;
                    }
                    if (i22 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i17 &= -57345;
                    } else {
                        mapEmptyMap = map;
                    }
                    if ((i5 & 32768) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -458753;
                    } else {
                        function2 = function1;
                    }
                    TextAlign textAlign119 = textAlign2;
                    if ((i5 & 65536) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -3670017;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    textStyle3 = textStyle2;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i23;
                    map2 = mapEmptyMap;
                    textDecoration3 = textDecoration2;
                    function3 = function2;
                    j6 = jM3117getUnspecifiedXSAIIZE2;
                    textAlign3 = textAlign119;
                    i27 = iM2920getClipgIe3tQ8;
                    j5 = jM1248getUnspecified0d7_KjU;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                    j8 = jM3117getUnspecifiedXSAIIZE3;
                }
                composerStartRestartGroup.startReplaceableGroup(1557617653);
                companion = Color.INSTANCE;
                if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    j9 = j5;
                } else {
                    color = textStyle3.getColor();
                    if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                        color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    j9 = color;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyle1115 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
                long j11114 = j7;
                TextStyle textStyle1116 = textStyle3;
                int i311110 = i24 << 9;
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle1116.merge(textStyle1115), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i311110 & 458752) | (i311110 & 3670016), 0);
                modifier3 = modifier2;
                textAlign4 = textAlign3;
                fontStyle3 = fontStyle2;
                function4 = function3;
                int i311111 = i27;
                textDecoration4 = textDecoration3;
                j10 = j11114;
                FontWeight fontWeight16 = fontWeight2;
                i28 = i311111;
                Map<String, InlineTextContent> map16 = map2;
                textStyle4 = textStyle1116;
                j11 = j8;
                fontWeight3 = fontWeight16;
                fontFamily3 = fontFamily2;
                map3 = map16;
                long j11115 = j6;
                j12 = j5;
                j13 = j11115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j11116 = j11;
            final int i311112 = i28;
            final boolean z11 = z3;
            final int i311113 = i26;
            final TextStyle textStyle1117 = textStyle4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

                public final void invoke(@Nullable Composer composer2, int i311114) {
                    TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j11116, i311112, z11, i311113, map3, function4, textStyle1117, composer2, i3 | 1, i4, i5);
                }
            });
        }
        i17 |= 3072;
        i22 = i5 & 16384;
        if (i22 != 0) {
            i17 |= 8192;
        }
        if ((i4 & 458752) != 0) {
            i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(function1)) ? 65536 : 131072;
        }
        if ((i4 & 3670016) != 0) {
            if ((i5 & 65536) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i17 |= i29;
        }
        if (((~i5) & 18960) != 0) {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                } else {
                    jM1248getUnspecified0d7_KjU = j5;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i23 = Integer.MAX_VALUE;
                } else {
                    i23 = i2;
                }
                if (i22 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i17 &= -57345;
                } else {
                    mapEmptyMap = map;
                }
                if ((i5 & 32768) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -458753;
                } else {
                    function2 = function1;
                }
                TextAlign textAlign1110 = textAlign2;
                if ((i5 & 65536) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -3670017;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                textStyle3 = textStyle2;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i23;
                map2 = mapEmptyMap;
                textDecoration3 = textDecoration2;
                function3 = function2;
                j6 = jM3117getUnspecifiedXSAIIZE2;
                textAlign3 = textAlign1110;
                i27 = iM2920getClipgIe3tQ8;
                j5 = jM1248getUnspecified0d7_KjU;
                j7 = jM3117getUnspecifiedXSAIIZE;
                j8 = jM3117getUnspecifiedXSAIIZE3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                } else {
                    jM1248getUnspecified0d7_KjU = j5;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i23 = Integer.MAX_VALUE;
                } else {
                    i23 = i2;
                }
                if (i22 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i17 &= -57345;
                } else {
                    mapEmptyMap = map;
                }
                if ((i5 & 32768) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -458753;
                } else {
                    function2 = function1;
                }
                TextAlign textAlign1111 = textAlign2;
                if ((i5 & 65536) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -3670017;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                textStyle3 = textStyle2;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i23;
                map2 = mapEmptyMap;
                textDecoration3 = textDecoration2;
                function3 = function2;
                j6 = jM3117getUnspecifiedXSAIIZE2;
                textAlign3 = textAlign1111;
                i27 = iM2920getClipgIe3tQ8;
                j5 = jM1248getUnspecified0d7_KjU;
                j7 = jM3117getUnspecifiedXSAIIZE;
                j8 = jM3117getUnspecifiedXSAIIZE3;
            }
            composerStartRestartGroup.startReplaceableGroup(1557617653);
            companion = Color.INSTANCE;
            if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                j9 = j5;
            } else {
                color = textStyle3.getColor();
                if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                    color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                }
                j9 = color;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextStyle textStyle1118 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
            long j11117 = j7;
            TextStyle textStyle1119 = textStyle3;
            int i311114 = i24 << 9;
            BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle1119.merge(textStyle1118), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i311114 & 458752) | (i311114 & 3670016), 0);
            modifier3 = modifier2;
            textAlign4 = textAlign3;
            fontStyle3 = fontStyle2;
            function4 = function3;
            int i311115 = i27;
            textDecoration4 = textDecoration3;
            j10 = j11117;
            FontWeight fontWeight17 = fontWeight2;
            i28 = i311115;
            Map<String, InlineTextContent> map17 = map2;
            textStyle4 = textStyle1119;
            j11 = j8;
            fontWeight3 = fontWeight17;
            fontFamily3 = fontFamily2;
            map3 = map17;
            long j11118 = j6;
            j12 = j5;
            j13 = j11118;
        } else {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                } else {
                    jM1248getUnspecified0d7_KjU = j5;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i23 = Integer.MAX_VALUE;
                } else {
                    i23 = i2;
                }
                if (i22 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i17 &= -57345;
                } else {
                    mapEmptyMap = map;
                }
                if ((i5 & 32768) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -458753;
                } else {
                    function2 = function1;
                }
                TextAlign textAlign1112 = textAlign2;
                if ((i5 & 65536) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -3670017;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                textStyle3 = textStyle2;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i23;
                map2 = mapEmptyMap;
                textDecoration3 = textDecoration2;
                function3 = function2;
                j6 = jM3117getUnspecifiedXSAIIZE2;
                textAlign3 = textAlign1112;
                i27 = iM2920getClipgIe3tQ8;
                j5 = jM1248getUnspecified0d7_KjU;
                j7 = jM3117getUnspecifiedXSAIIZE;
                j8 = jM3117getUnspecifiedXSAIIZE3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                } else {
                    jM1248getUnspecified0d7_KjU = j5;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i23 = Integer.MAX_VALUE;
                } else {
                    i23 = i2;
                }
                if (i22 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i17 &= -57345;
                } else {
                    mapEmptyMap = map;
                }
                if ((i5 & 32768) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -458753;
                } else {
                    function2 = function1;
                }
                TextAlign textAlign1113 = textAlign2;
                if ((i5 & 65536) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -3670017;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                textStyle3 = textStyle2;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i23;
                map2 = mapEmptyMap;
                textDecoration3 = textDecoration2;
                function3 = function2;
                j6 = jM3117getUnspecifiedXSAIIZE2;
                textAlign3 = textAlign1113;
                i27 = iM2920getClipgIe3tQ8;
                j5 = jM1248getUnspecified0d7_KjU;
                j7 = jM3117getUnspecifiedXSAIIZE;
                j8 = jM3117getUnspecifiedXSAIIZE3;
            }
            composerStartRestartGroup.startReplaceableGroup(1557617653);
            companion = Color.INSTANCE;
            if (j5 != companion.m1248getUnspecified0d7_KjU()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                j9 = j5;
            } else {
                color = textStyle3.getColor();
                if (!(color != companion.m1248getUnspecified0d7_KjU())) {
                    color = Color.m1211copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                }
                j9 = color;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextStyle textStyle11110 = new TextStyle(j9, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j6, null, null, null, 0L, textDecoration3, null, textAlign3, null, j8, null, 175952, null);
            long j11119 = j7;
            TextStyle textStyle11111 = textStyle3;
            int i311116 = i24 << 9;
            BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle11111.merge(textStyle11110), function3, i27, z3, i26, map2, composerStartRestartGroup, ((i24 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 14) | 16809984 | (i25 & 112) | (i311116 & 458752) | (i311116 & 3670016), 0);
            modifier3 = modifier2;
            textAlign4 = textAlign3;
            fontStyle3 = fontStyle2;
            function4 = function3;
            int i311117 = i27;
            textDecoration4 = textDecoration3;
            j10 = j11119;
            FontWeight fontWeight18 = fontWeight2;
            i28 = i311117;
            Map<String, InlineTextContent> map18 = map2;
            textStyle4 = textStyle11111;
            j11 = j8;
            fontWeight3 = fontWeight18;
            fontFamily3 = fontFamily2;
            map3 = map18;
            long j111110 = j6;
            j12 = j5;
            j13 = j111110;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j111111 = j11;
        final int i311118 = i28;
        final boolean z12 = z3;
        final int i311119 = i26;
        final TextStyle textStyle11112 = textStyle4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
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

            public final void invoke(@Nullable Composer composer2, int i3111110) {
                TextKt.m868Text4IGK_g(annotatedString, modifier3, j12, j10, fontStyle3, fontWeight3, fontFamily3, j13, textDecoration4, textAlign4, j111111, i311118, z12, i311119, map3, function4, textStyle11112, composer2, i3 | 1, i4, i5);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0194  */
    /* JADX WARN: Code duplicated, block: B:141:0x019a  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:183:0x0247  */
    /* JADX WARN: Code duplicated, block: B:185:0x024c  */
    /* JADX WARN: Code duplicated, block: B:186:0x024f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0255  */
    /* JADX WARN: Code duplicated, block: B:192:0x0261  */
    /* JADX WARN: Code duplicated, block: B:193:0x026a  */
    /* JADX WARN: Code duplicated, block: B:195:0x026e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0271  */
    /* JADX WARN: Code duplicated, block: B:198:0x0275  */
    /* JADX WARN: Code duplicated, block: B:199:0x0278  */
    /* JADX WARN: Code duplicated, block: B:201:0x027c  */
    /* JADX WARN: Code duplicated, block: B:202:0x027f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0285  */
    /* JADX WARN: Code duplicated, block: B:206:0x0290  */
    /* JADX WARN: Code duplicated, block: B:208:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x0299  */
    /* JADX WARN: Code duplicated, block: B:214:0x029f  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:223:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:232:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:238:0x039c  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    @Composable
    /* JADX INFO: renamed from: Text-fLXpl1I, reason: not valid java name */
    public static final void m869TextfLXpl1I(@NotNull final String str, @Nullable Modifier modifier, long j, long j2, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j3, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j4, int i, boolean z, int i2, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        long jM1248getUnspecified0d7_KjU;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TextDecoration textDecoration2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        long jM3117getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long jM3117getUnspecifiedXSAIIZE2;
        TextAlign textAlign2;
        long jM3117getUnspecifiedXSAIIZE3;
        int iM2920getClipgIe3tQ8;
        boolean z2;
        int i22;
        Function1<? super TextLayoutResult, Unit> function2;
        TextStyle textStyle2;
        int i23;
        int i24;
        int i25;
        boolean z3;
        int i26;
        Function1<? super TextLayoutResult, Unit> function3;
        TextStyle textStyle3;
        FontStyle fontStyle3;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j5;
        long j6;
        TextAlign textAlign3;
        long j7;
        Composer composer2;
        final TextAlign textAlign4;
        final long j8;
        final int i27;
        final boolean z4;
        final int i28;
        final Function1<? super TextLayoutResult, Unit> function4;
        final TextStyle textStyle4;
        final TextDecoration textDecoration3;
        final FontFamily fontFamily4;
        final FontStyle fontStyle4;
        final FontWeight fontWeight4;
        final long j9;
        final long j10;
        final Modifier modifier3;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i29;
        int i30;
        int i31;
        Composer composerStartRestartGroup = composer.startRestartGroup(1557612414);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 == 0) {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i3 & 896) == 0) {
                jM1248getUnspecified0d7_KjU = j;
                if ((i5 & 4) == 0 || !composerStartRestartGroup.changed(jM1248getUnspecified0d7_KjU)) {
                    i31 = 128;
                } else {
                    i31 = 256;
                }
                i6 |= i31;
            } else {
                jM1248getUnspecified0d7_KjU = j;
            }
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                if ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i30 = 1024;
                } else {
                    i30 = 2048;
                }
                i6 |= i30;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                i6 |= 8192;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(fontWeight)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(fontFamily)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i6 |= i11;
            }
            if ((i3 & 29360128) != 0) {
                if ((i5 & 128) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i29 = 4194304;
                } else {
                    i29 = 8388608;
                }
                i6 |= i29;
            }
            i12 = i5 & 256;
            if (i12 != 0) {
                i6 |= 100663296;
                textDecoration2 = textDecoration;
            } else {
                textDecoration2 = textDecoration;
                if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(textDecoration2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i6 |= i13;
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
                i6 |= 268435456;
            }
            if ((i4 & 14) == 0) {
                i15 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changed(j4)) ? 2 : 4);
            } else {
                i15 = i4;
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
                i15 |= 16;
            }
            i17 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                    if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i21 = 2048;
                        } else {
                            i21 = 1024;
                        }
                        i17 |= i21;
                    }
                    if ((i4 & 57344) != 0) {
                        i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
                    }
                    if ((i4 & 458752) != 0) {
                        i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
                    }
                    if (((~i5) & 2576) != 0 && ((1533916891 & i6) ^ 306783378) == 0 && ((374491 & i17) ^ 74898) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j11 = j2;
                        fontStyle4 = fontStyle;
                        fontWeight4 = fontWeight;
                        textAlign4 = textAlign;
                        j8 = j4;
                        i27 = i;
                        z4 = z;
                        i28 = i2;
                        function4 = function1;
                        textStyle4 = textStyle;
                        composer2 = composerStartRestartGroup;
                        textDecoration3 = textDecoration2;
                        j9 = jM1248getUnspecified0d7_KjU;
                        fontFamily4 = fontFamily;
                        j10 = j3;
                    } else {
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i32 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 4) != 0) {
                                jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                                i6 &= -897;
                            }
                            if ((i5 & 8) != 0) {
                                jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i6 &= -7169;
                            } else {
                                jM3117getUnspecifiedXSAIIZE = j2;
                            }
                            if (i7 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i8 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i10 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if ((i5 & 128) != 0) {
                                jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i6 &= -29360129;
                            } else {
                                jM3117getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i12 != 0) {
                                textDecoration2 = null;
                            }
                            if (i14 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if ((i5 & 1024) != 0) {
                                jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                                i17 &= -15;
                            } else {
                                jM3117getUnspecifiedXSAIIZE3 = j4;
                            }
                            if (i16 != 0) {
                                iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                                i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                iM2920getClipgIe3tQ8 = i;
                            }
                            if (i18 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i20 != 0) {
                                i22 = Integer.MAX_VALUE;
                            } else {
                                i22 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i17 &= -57345;
                            } else {
                                function2 = function1;
                            }
                            if ((i5 & 32768) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                i17 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            i23 = iM2920getClipgIe3tQ8;
                            i24 = i17;
                            i25 = i6;
                            z3 = z2;
                            i26 = i22;
                            function3 = function2;
                            textStyle3 = textStyle2;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3117getUnspecifiedXSAIIZE2;
                            j6 = jM3117getUnspecifiedXSAIIZE3;
                            textAlign3 = textAlign2;
                            j7 = jM3117getUnspecifiedXSAIIZE;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i5 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i5 & 8) != 0) {
                                i6 &= -7169;
                            }
                            if ((i5 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i5 & 1024) != 0) {
                                i17 &= -15;
                            }
                            if (i16 != 0) {
                                i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if ((i5 & 16384) != 0) {
                                i17 &= -57345;
                            }
                            if ((i5 & 32768) != 0) {
                                i17 &= -458753;
                            }
                            modifier2 = modifier;
                            j7 = j2;
                            fontFamily3 = fontFamily;
                            j5 = j3;
                            textAlign3 = textAlign;
                            j6 = j4;
                            i23 = i;
                            z3 = z;
                            i26 = i2;
                            function3 = function1;
                            textStyle3 = textStyle;
                            i24 = i17;
                            i25 = i6;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                        }
                        AnnotatedString annotatedString = new AnnotatedString(str, null, null, 6, null);
                        Map mapEmptyMap = r.emptyMap();
                        composer2 = composerStartRestartGroup;
                        int i33 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                        int i34 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                        int i35 = i24 << 3;
                        m868Text4IGK_g(annotatedString, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap, function3, textStyle3, composer2, i33, i34 | (i35 & 458752) | (i35 & 3670016), 0);
                        textAlign4 = textAlign3;
                        j8 = j6;
                        i27 = i23;
                        z4 = z3;
                        i28 = i26;
                        function4 = function3;
                        textStyle4 = textStyle3;
                        textDecoration3 = textDecoration2;
                        fontFamily4 = fontFamily3;
                        long j12 = j5;
                        fontStyle4 = fontStyle3;
                        fontWeight4 = fontWeight3;
                        j9 = jM1248getUnspecified0d7_KjU;
                        j10 = j12;
                        modifier3 = modifier2;
                        j11 = j7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                        public final void invoke(@Nullable Composer composer3, int i36) {
                            TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                        }
                    });
                }
                i17 |= 3072;
                if ((i4 & 57344) != 0) {
                    i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
                }
                if (((~i5) & 2576) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString2 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap2 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i36 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i37 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i38 = i24 << 3;
                    m868Text4IGK_g(annotatedString2, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap2, function3, textStyle3, composer2, i36, i37 | (i38 & 458752) | (i38 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j13 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j13;
                    modifier3 = modifier2;
                    j11 = j7;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString3 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap3 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i39 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i310 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i311 = i24 << 3;
                    m868Text4IGK_g(annotatedString3, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap3, function3, textStyle3, composer2, i39, i310 | (i311 & 458752) | (i311 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j14 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j14;
                    modifier3 = modifier2;
                    j11 = j7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                    public final void invoke(@Nullable Composer composer3, int i312) {
                        TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 384;
            i20 = i5 & 8192;
            if (i20 != 0) {
                if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i17 |= i21;
                }
                if ((i4 & 57344) != 0) {
                    i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
                }
                if (((~i5) & 2576) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString4 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap4 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i312 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i313 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i314 = i24 << 3;
                    m868Text4IGK_g(annotatedString4, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap4, function3, textStyle3, composer2, i312, i313 | (i314 & 458752) | (i314 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j15 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j15;
                    modifier3 = modifier2;
                    j11 = j7;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString5 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap5 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i315 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i316 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i317 = i24 << 3;
                    m868Text4IGK_g(annotatedString5, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap5, function3, textStyle3, composer2, i315, i316 | (i317 & 458752) | (i317 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j16 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j16;
                    modifier3 = modifier2;
                    j11 = j7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                    public final void invoke(@Nullable Composer composer3, int i318) {
                        TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 3072;
            if ((i4 & 57344) != 0) {
                i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
            }
            if (((~i5) & 2576) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString6 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap6 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i318 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i319 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i3110 = i24 << 3;
                m868Text4IGK_g(annotatedString6, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap6, function3, textStyle3, composer2, i318, i319 | (i3110 & 458752) | (i3110 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j17 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j17;
                modifier3 = modifier2;
                j11 = j7;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString7 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap7 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i3111 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i3112 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i3113 = i24 << 3;
                m868Text4IGK_g(annotatedString7, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap7, function3, textStyle3, composer2, i3111, i3112 | (i3113 & 458752) | (i3113 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j18 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j18;
                modifier3 = modifier2;
                j11 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                public final void invoke(@Nullable Composer composer3, int i3114) {
                    TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                }
            });
        }
        i6 |= 48;
        if ((i3 & 896) == 0) {
            jM1248getUnspecified0d7_KjU = j;
            if ((i5 & 4) == 0) {
                i31 = 128;
            } else {
                i31 = 128;
            }
            i6 |= i31;
        } else {
            jM1248getUnspecified0d7_KjU = j;
        }
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            if ((i5 & 8) == 0) {
                i30 = 1024;
            } else {
                i30 = 1024;
            }
            i6 |= i30;
        }
        i7 = i5 & 16;
        if (i7 != 0) {
            i6 |= 8192;
        }
        i8 = i5 & 32;
        if (i8 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(fontWeight)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        i10 = i5 & 64;
        if (i10 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(fontFamily)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((i3 & 29360128) != 0) {
            if ((i5 & 128) == 0) {
                i29 = 4194304;
            } else {
                i29 = 4194304;
            }
            i6 |= i29;
        }
        i12 = i5 & 256;
        if (i12 != 0) {
            i6 |= 100663296;
            textDecoration2 = textDecoration;
        } else {
            textDecoration2 = textDecoration;
            if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(textDecoration2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i6 |= i13;
            }
        }
        i14 = i5 & 512;
        if (i14 != 0) {
            i6 |= 268435456;
        }
        if ((i4 & 14) == 0) {
            i15 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changed(j4)) ? 2 : 4);
        } else {
            i15 = i4;
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
            i15 |= 16;
        }
        i17 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
            if ((i4 & 896) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
                if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i17 |= i21;
                }
                if ((i4 & 57344) != 0) {
                    i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
                }
                if ((i4 & 458752) != 0) {
                    i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
                }
                if (((~i5) & 2576) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString8 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap8 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i3114 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i3115 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i3116 = i24 << 3;
                    m868Text4IGK_g(annotatedString8, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap8, function3, textStyle3, composer2, i3114, i3115 | (i3116 & 458752) | (i3116 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j19 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j19;
                    modifier3 = modifier2;
                    j11 = j7;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i32 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 4) != 0) {
                            jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                            i6 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -7169;
                        } else {
                            jM3117getUnspecifiedXSAIIZE = j2;
                        }
                        if (i7 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i8 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i10 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if ((i5 & 128) != 0) {
                            jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i6 &= -29360129;
                        } else {
                            jM3117getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i12 != 0) {
                            textDecoration2 = null;
                        }
                        if (i14 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if ((i5 & 1024) != 0) {
                            jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                            i17 &= -15;
                        } else {
                            jM3117getUnspecifiedXSAIIZE3 = j4;
                        }
                        if (i16 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i18 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i20 != 0) {
                            i22 = Integer.MAX_VALUE;
                        } else {
                            i22 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i17 &= -57345;
                        } else {
                            function2 = function1;
                        }
                        if ((i5 & 32768) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                            i17 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        composerStartRestartGroup.endDefaults();
                        i23 = iM2920getClipgIe3tQ8;
                        i24 = i17;
                        i25 = i6;
                        z3 = z2;
                        i26 = i22;
                        function3 = function2;
                        textStyle3 = textStyle2;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3117getUnspecifiedXSAIIZE2;
                        j6 = jM3117getUnspecifiedXSAIIZE3;
                        textAlign3 = textAlign2;
                        j7 = jM3117getUnspecifiedXSAIIZE;
                    }
                    AnnotatedString annotatedString9 = new AnnotatedString(str, null, null, 6, null);
                    Map mapEmptyMap9 = r.emptyMap();
                    composer2 = composerStartRestartGroup;
                    int i3117 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                    int i3118 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                    int i3119 = i24 << 3;
                    m868Text4IGK_g(annotatedString9, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap9, function3, textStyle3, composer2, i3117, i3118 | (i3119 & 458752) | (i3119 & 3670016), 0);
                    textAlign4 = textAlign3;
                    j8 = j6;
                    i27 = i23;
                    z4 = z3;
                    i28 = i26;
                    function4 = function3;
                    textStyle4 = textStyle3;
                    textDecoration3 = textDecoration2;
                    fontFamily4 = fontFamily3;
                    long j110 = j5;
                    fontStyle4 = fontStyle3;
                    fontWeight4 = fontWeight3;
                    j9 = jM1248getUnspecified0d7_KjU;
                    j10 = j110;
                    modifier3 = modifier2;
                    j11 = j7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                    public final void invoke(@Nullable Composer composer3, int i31110) {
                        TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                    }
                });
            }
            i17 |= 3072;
            if ((i4 & 57344) != 0) {
                i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
            }
            if (((~i5) & 2576) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString10 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap10 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i31110 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i31111 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i31112 = i24 << 3;
                m868Text4IGK_g(annotatedString10, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap10, function3, textStyle3, composer2, i31110, i31111 | (i31112 & 458752) | (i31112 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j111 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j111;
                modifier3 = modifier2;
                j11 = j7;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString11 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap11 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i31113 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i31114 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i31115 = i24 << 3;
                m868Text4IGK_g(annotatedString11, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap11, function3, textStyle3, composer2, i31113, i31114 | (i31115 & 458752) | (i31115 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j112 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j112;
                modifier3 = modifier2;
                j11 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                public final void invoke(@Nullable Composer composer3, int i31116) {
                    TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                }
            });
        }
        i17 |= 384;
        i20 = i5 & 8192;
        if (i20 != 0) {
            if ((i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i17 |= i21;
            }
            if ((i4 & 57344) != 0) {
                i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
            }
            if ((i4 & 458752) != 0) {
                i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
            }
            if (((~i5) & 2576) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString12 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap12 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i31116 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i31117 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i31118 = i24 << 3;
                m868Text4IGK_g(annotatedString12, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap12, function3, textStyle3, composer2, i31116, i31117 | (i31118 & 458752) | (i31118 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j113 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j113;
                modifier3 = modifier2;
                j11 = j7;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i32 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 4) != 0) {
                        jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                        i6 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -7169;
                    } else {
                        jM3117getUnspecifiedXSAIIZE = j2;
                    }
                    if (i7 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i8 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i10 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if ((i5 & 128) != 0) {
                        jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i6 &= -29360129;
                    } else {
                        jM3117getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i12 != 0) {
                        textDecoration2 = null;
                    }
                    if (i14 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if ((i5 & 1024) != 0) {
                        jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                        i17 &= -15;
                    } else {
                        jM3117getUnspecifiedXSAIIZE3 = j4;
                    }
                    if (i16 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i18 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i20 != 0) {
                        i22 = Integer.MAX_VALUE;
                    } else {
                        i22 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i17 &= -57345;
                    } else {
                        function2 = function1;
                    }
                    if ((i5 & 32768) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                        i17 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    composerStartRestartGroup.endDefaults();
                    i23 = iM2920getClipgIe3tQ8;
                    i24 = i17;
                    i25 = i6;
                    z3 = z2;
                    i26 = i22;
                    function3 = function2;
                    textStyle3 = textStyle2;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3117getUnspecifiedXSAIIZE2;
                    j6 = jM3117getUnspecifiedXSAIIZE3;
                    textAlign3 = textAlign2;
                    j7 = jM3117getUnspecifiedXSAIIZE;
                }
                AnnotatedString annotatedString13 = new AnnotatedString(str, null, null, 6, null);
                Map mapEmptyMap13 = r.emptyMap();
                composer2 = composerStartRestartGroup;
                int i31119 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
                int i311110 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
                int i311111 = i24 << 3;
                m868Text4IGK_g(annotatedString13, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap13, function3, textStyle3, composer2, i31119, i311110 | (i311111 & 458752) | (i311111 & 3670016), 0);
                textAlign4 = textAlign3;
                j8 = j6;
                i27 = i23;
                z4 = z3;
                i28 = i26;
                function4 = function3;
                textStyle4 = textStyle3;
                textDecoration3 = textDecoration2;
                fontFamily4 = fontFamily3;
                long j114 = j5;
                fontStyle4 = fontStyle3;
                fontWeight4 = fontWeight3;
                j9 = jM1248getUnspecified0d7_KjU;
                j10 = j114;
                modifier3 = modifier2;
                j11 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

                public final void invoke(@Nullable Composer composer3, int i311112) {
                    TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
                }
            });
        }
        i17 |= 3072;
        if ((i4 & 57344) != 0) {
            i17 |= ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(function1)) ? 8192 : 16384;
        }
        if ((i4 & 458752) != 0) {
            i17 |= ((i5 & 32768) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 65536 : 131072;
        }
        if (((~i5) & 2576) != 0) {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i32 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i2;
                }
                if ((i5 & 16384) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -57345;
                } else {
                    function2 = function1;
                }
                if ((i5 & 32768) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                i23 = iM2920getClipgIe3tQ8;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i22;
                function3 = function2;
                textStyle3 = textStyle2;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3117getUnspecifiedXSAIIZE2;
                j6 = jM3117getUnspecifiedXSAIIZE3;
                textAlign3 = textAlign2;
                j7 = jM3117getUnspecifiedXSAIIZE;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i32 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i2;
                }
                if ((i5 & 16384) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -57345;
                } else {
                    function2 = function1;
                }
                if ((i5 & 32768) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                i23 = iM2920getClipgIe3tQ8;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i22;
                function3 = function2;
                textStyle3 = textStyle2;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3117getUnspecifiedXSAIIZE2;
                j6 = jM3117getUnspecifiedXSAIIZE3;
                textAlign3 = textAlign2;
                j7 = jM3117getUnspecifiedXSAIIZE;
            }
            AnnotatedString annotatedString14 = new AnnotatedString(str, null, null, 6, null);
            Map mapEmptyMap14 = r.emptyMap();
            composer2 = composerStartRestartGroup;
            int i311112 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
            int i311113 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
            int i311114 = i24 << 3;
            m868Text4IGK_g(annotatedString14, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap14, function3, textStyle3, composer2, i311112, i311113 | (i311114 & 458752) | (i311114 & 3670016), 0);
            textAlign4 = textAlign3;
            j8 = j6;
            i27 = i23;
            z4 = z3;
            i28 = i26;
            function4 = function3;
            textStyle4 = textStyle3;
            textDecoration3 = textDecoration2;
            fontFamily4 = fontFamily3;
            long j115 = j5;
            fontStyle4 = fontStyle3;
            fontWeight4 = fontWeight3;
            j9 = jM1248getUnspecified0d7_KjU;
            j10 = j115;
            modifier3 = modifier2;
            j11 = j7;
        } else {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i32 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i2;
                }
                if ((i5 & 16384) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -57345;
                } else {
                    function2 = function1;
                }
                if ((i5 & 32768) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                i23 = iM2920getClipgIe3tQ8;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i22;
                function3 = function2;
                textStyle3 = textStyle2;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3117getUnspecifiedXSAIIZE2;
                j6 = jM3117getUnspecifiedXSAIIZE3;
                textAlign3 = textAlign2;
                j7 = jM3117getUnspecifiedXSAIIZE;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i32 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 4) != 0) {
                    jM1248getUnspecified0d7_KjU = Color.INSTANCE.m1248getUnspecified0d7_KjU();
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -7169;
                } else {
                    jM3117getUnspecifiedXSAIIZE = j2;
                }
                if (i7 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i8 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i10 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if ((i5 & 128) != 0) {
                    jM3117getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i6 &= -29360129;
                } else {
                    jM3117getUnspecifiedXSAIIZE2 = j3;
                }
                if (i12 != 0) {
                    textDecoration2 = null;
                }
                if (i14 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if ((i5 & 1024) != 0) {
                    jM3117getUnspecifiedXSAIIZE3 = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
                    i17 &= -15;
                } else {
                    jM3117getUnspecifiedXSAIIZE3 = j4;
                }
                if (i16 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i17 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i18 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i20 != 0) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    i22 = i2;
                }
                if ((i5 & 16384) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i17 &= -57345;
                } else {
                    function2 = function1;
                }
                if ((i5 & 32768) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                    i17 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                composerStartRestartGroup.endDefaults();
                i23 = iM2920getClipgIe3tQ8;
                i24 = i17;
                i25 = i6;
                z3 = z2;
                i26 = i22;
                function3 = function2;
                textStyle3 = textStyle2;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3117getUnspecifiedXSAIIZE2;
                j6 = jM3117getUnspecifiedXSAIIZE3;
                textAlign3 = textAlign2;
                j7 = jM3117getUnspecifiedXSAIIZE;
            }
            AnnotatedString annotatedString15 = new AnnotatedString(str, null, null, 6, null);
            Map mapEmptyMap15 = r.emptyMap();
            composer2 = composerStartRestartGroup;
            int i311115 = (i25 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i25 & 112) | 1073774592 | (i25 & 896) | (i25 & 458752) | (i25 & 3670016) | (29360128 & i25) | (i25 & 234881024);
            int i311116 = 32832 | (i24 & 14) | (i24 & 896) | (i24 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY);
            int i311117 = i24 << 3;
            m868Text4IGK_g(annotatedString15, modifier2, jM1248getUnspecified0d7_KjU, j7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration2, textAlign3, j6, i23, z3, i26, mapEmptyMap15, function3, textStyle3, composer2, i311115, i311116 | (i311117 & 458752) | (i311117 & 3670016), 0);
            textAlign4 = textAlign3;
            j8 = j6;
            i27 = i23;
            z4 = z3;
            i28 = i26;
            function4 = function3;
            textStyle4 = textStyle3;
            textDecoration3 = textDecoration2;
            fontFamily4 = fontFamily3;
            long j116 = j5;
            fontStyle4 = fontStyle3;
            fontWeight4 = fontWeight3;
            j9 = jM1248getUnspecified0d7_KjU;
            j10 = j116;
            modifier3 = modifier2;
            j11 = j7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
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

            public final void invoke(@Nullable Composer composer3, int i311118) {
                TextKt.m869TextfLXpl1I(str, modifier3, j9, j11, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign4, j8, i27, z4, i28, function4, textStyle4, composer3, i3 | 1, i4, i5);
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }
}
