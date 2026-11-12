package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.exoplayer2.C;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import com.tekartik.sqflite.Constant;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aä\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001923\b\u0002\u0010 \u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b!\u0010\"\u001aä\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001923\b\u0002\u0010 \u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b!\u0010$¨\u0006%"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", Constants.ENABLED, Constant.c, "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class BasicTextFieldKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:133:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:141:0x0194  */
    /* JADX WARN: Code duplicated, block: B:143:0x0198  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:171:0x0203  */
    /* JADX WARN: Code duplicated, block: B:196:0x025a  */
    /* JADX WARN: Code duplicated, block: B:198:0x025f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0262  */
    /* JADX WARN: Code duplicated, block: B:201:0x0265  */
    /* JADX WARN: Code duplicated, block: B:202:0x0267  */
    /* JADX WARN: Code duplicated, block: B:204:0x026b  */
    /* JADX WARN: Code duplicated, block: B:205:0x026d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0273  */
    /* JADX WARN: Code duplicated, block: B:209:0x027f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0285  */
    /* JADX WARN: Code duplicated, block: B:213:0x0291  */
    /* JADX WARN: Code duplicated, block: B:216:0x0297  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:226:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:231:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:240:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0312  */
    /* JADX WARN: Code duplicated, block: B:244:0x031e  */
    /* JADX WARN: Code duplicated, block: B:245:0x032a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0357  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:263:0x043b  */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    @Composable
    public static final void BasicTextField(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z3, int i, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        KeyboardActions keyboardActions2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        boolean z4;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions3;
        boolean z6;
        int i18;
        VisualTransformation none;
        Function1<? super TextLayoutResult, Unit> function4;
        MutableInteractionSource mutableInteractionSource2;
        Brush solidColor;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M410getLambda1$foundation_release;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function5;
        int i19;
        Brush brush2;
        boolean z8;
        KeyboardOptions keyboardOptions3;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function6;
        int i20;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        final MutableState mutableState;
        int i21;
        boolean zChanged;
        Object objRememberedValue3;
        final boolean z9;
        final boolean z10;
        final Modifier modifier4;
        final TextStyle textStyle3;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function7;
        final boolean z11;
        final VisualTransformation visualTransformation3;
        final Function1<? super TextLayoutResult, Unit> function8;
        final KeyboardActions keyboardActions4;
        final KeyboardOptions keyboardOptions4;
        final int i22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        int i24;
        Composer composerStartRestartGroup = composer.startRestartGroup(1483891057);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i25 = i4 & 4;
        if (i25 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                if ((i2 & 458752) != 0) {
                    if ((i4 & 32) == 0 || !composerStartRestartGroup.changed(textStyle)) {
                        i24 = 65536;
                    } else {
                        i24 = 131072;
                    }
                    i5 |= i24;
                }
                if ((i2 & 3670016) != 0) {
                    if ((i4 & 64) == 0 || !composerStartRestartGroup.changed(keyboardOptions)) {
                        i23 = 524288;
                    } else {
                        i23 = 1048576;
                    }
                    i5 |= i23;
                }
                if ((i2 & 29360128) == 0) {
                    if ((i4 & 128) == 0) {
                        keyboardActions2 = keyboardActions;
                        int i26 = composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        i5 |= i26;
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    i5 |= i26;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
                if ((i3 & 14) == 0) {
                    i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
                } else {
                    i14 = i3;
                }
                if ((i3 & 112) != 0) {
                    i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
                }
                i15 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    if ((i3 & 896) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i17 = 256;
                        } else {
                            i17 = 128;
                        }
                        i15 |= i17;
                    }
                    if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                        i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                    }
                    if ((i3 & 57344) != 0) {
                        i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                    }
                    if (((i5 & 1533916891) ^ 306783378) != 0 && ((i15 & 46811) ^ 9362) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z10 = z;
                        z9 = z2;
                        textStyle3 = textStyle;
                        keyboardOptions4 = keyboardOptions;
                        z11 = z3;
                        function8 = function2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        brush3 = brush;
                        function7 = function3;
                        keyboardActions4 = keyboardActions2;
                        modifier4 = modifier2;
                        i22 = i;
                        visualTransformation3 = visualTransformation;
                    } else {
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                                i5 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                            if ((i4 & 64) != 0) {
                                keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                i5 &= -3670017;
                            } else {
                                keyboardOptions2 = keyboardOptions;
                            }
                            if ((i4 & 128) != 0) {
                                keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                                i5 &= -29360129;
                            } else {
                                keyboardActions3 = keyboardActions;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i;
                            }
                            int i27 = i5;
                            if ((i4 & 1024) != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                                i15 &= -15;
                            } else {
                                none = visualTransformation;
                            }
                            VisualTransformation visualTransformation4 = none;
                            if ((i4 & 2048) != 0) {
                                function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                function4 = function2;
                            }
                            if (i16 != 0) {
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
                            if ((i4 & 8192) != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                                i15 &= -7169;
                            } else {
                                solidColor = brush;
                            }
                            if ((i4 & 16384) != 0) {
                                function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                                i15 = (-57345) & i15;
                            } else {
                                function3M410getLambda1$foundation_release = function3;
                            }
                            composerStartRestartGroup.endDefaults();
                            i = i18;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z7 = z6;
                            function5 = function3M410getLambda1$foundation_release;
                            i19 = i15;
                            brush2 = solidColor;
                            z8 = z5;
                            keyboardOptions3 = keyboardOptions2;
                            visualTransformation2 = visualTransformation4;
                            function6 = function4;
                            modifier2 = modifier3;
                            i20 = i27;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i4 & 1024) != 0) {
                                i15 &= -15;
                            }
                            if ((i4 & 2048) != 0) {
                                i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if ((i4 & 8192) != 0) {
                                i15 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i15 &= -57345;
                            }
                            z4 = z;
                            textStyle2 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            z7 = z3;
                            function6 = function2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function5 = function3;
                            i20 = i5;
                            i19 = i15;
                            z8 = z2;
                            visualTransformation2 = visualTransformation;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        TextFieldValue textFieldValueM2831copy3r_uNRQ$default = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                        ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z7);
                        boolean z12 = !z7;
                        if (z7) {
                            i21 = 1;
                        } else {
                            i21 = i;
                        }
                        composerStartRestartGroup.startReplaceableGroup(-3686095);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                        boolean z13 = z7;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                    mutableState.setValue(textFieldValue);
                                    if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                        return;
                                    }
                                    function1.invoke(textFieldValue.getText());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function9 = (Function1) objRememberedValue3;
                        int i28 = i19 << 12;
                        int i29 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | (i28 & 29360128);
                        int i30 = i20 >> 3;
                        CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default, function9, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z12, i21, imeOptions$foundation_release, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i29, ((i20 >> 18) & 112) | (i30 & 896) | (i30 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                        z9 = z8;
                        z10 = z4;
                        modifier4 = modifier2;
                        textStyle3 = textStyle2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        brush3 = brush2;
                        function7 = function5;
                        z11 = z13;
                        visualTransformation3 = visualTransformation2;
                        function8 = function6;
                        keyboardActions4 = keyboardActions3;
                        keyboardOptions4 = keyboardOptions3;
                        i22 = i;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function10 = function7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                        public final void invoke(@Nullable Composer composer2, int i31) {
                            BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function10, composer2, i2 | 1, i3, i4);
                        }
                    });
                }
                i15 |= 384;
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i210 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation5 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation5;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i210;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i211 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation6 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation6;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i211;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default2 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z14 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z15 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11 = (Function1) objRememberedValue3;
                    int i212 = i19 << 12;
                    int i213 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i212 & 57344) | (i212 & 458752) | (i212 & 3670016) | (i212 & 29360128);
                    int i31 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default2, function11, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z14, i21, imeOptions$foundation_release2, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i213, ((i20 >> 18) & 112) | (i31 & 896) | (i31 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z15;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i214 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation7 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation7;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i214;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i215 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation8 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation8;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i215;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default3 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release3 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z16 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z17 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function12 = (Function1) objRememberedValue3;
                    int i216 = i19 << 12;
                    int i217 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i216 & 57344) | (i216 & 458752) | (i216 & 3670016) | (i216 & 29360128);
                    int i32 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default3, function12, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z16, i21, imeOptions$foundation_release3, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i217, ((i20 >> 18) & 112) | (i32 & 896) | (i32 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z17;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function13 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                    public final void invoke(@Nullable Composer composer2, int i33) {
                        BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function13, composer2, i2 | 1, i3, i4);
                    }
                });
            }
            i5 |= 3072;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            if ((i2 & 458752) != 0) {
                if ((i4 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i5 |= i24;
            }
            if ((i2 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i5 |= i23;
            }
            if ((i2 & 29360128) == 0) {
                if ((i4 & 128) == 0) {
                    keyboardActions2 = keyboardActions;
                    if (composerStartRestartGroup.changed(keyboardActions2)) {
                    }
                    i5 |= i26;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i5 |= i26;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i10 = i4 & 256;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & 512;
            if (i12 != 0) {
                i5 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i5 |= i13;
            }
            if ((i3 & 14) == 0) {
                i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
            } else {
                i14 = i3;
            }
            if ((i3 & 112) != 0) {
                i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
            }
            i15 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i218 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation9 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation9;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i218;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i219 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation10 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation10;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i219;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default4 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release4 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z18 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z19 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function14 = (Function1) objRememberedValue3;
                    int i2110 = i19 << 12;
                    int i2111 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2110 & 57344) | (i2110 & 458752) | (i2110 & 3670016) | (i2110 & 29360128);
                    int i33 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default4, function14, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z18, i21, imeOptions$foundation_release4, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i2111, ((i20 >> 18) & 112) | (i33 & 896) | (i33 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z19;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i2112 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation11 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation11;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i2112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i2113 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation12 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation12;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i2113;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default5 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release5 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z110 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z111 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function15 = (Function1) objRememberedValue3;
                    int i2114 = i19 << 12;
                    int i2115 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2114 & 57344) | (i2114 & 458752) | (i2114 & 3670016) | (i2114 & 29360128);
                    int i34 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default5, function15, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z110, i21, imeOptions$foundation_release5, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i2115, ((i20 >> 18) & 112) | (i34 & 896) | (i34 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z111;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function16 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                    public final void invoke(@Nullable Composer composer2, int i35) {
                        BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function16, composer2, i2 | 1, i3, i4);
                    }
                });
            }
            i15 |= 384;
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2116 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation13 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation13;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2116;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2117 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation14 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation14;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2117;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default6 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release6 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z112 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z113 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function17 = (Function1) objRememberedValue3;
                int i2118 = i19 << 12;
                int i2119 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2118 & 57344) | (i2118 & 458752) | (i2118 & 3670016) | (i2118 & 29360128);
                int i35 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default6, function17, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z112, i21, imeOptions$foundation_release6, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i2119, ((i20 >> 18) & 112) | (i35 & 896) | (i35 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z113;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i21110 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation15 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation15;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i21110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i21111 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation16 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation16;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i21111;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default7 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release7 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z114 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z115 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function18 = (Function1) objRememberedValue3;
                int i21112 = i19 << 12;
                int i21113 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21112 & 57344) | (i21112 & 458752) | (i21112 & 3670016) | (i21112 & 29360128);
                int i36 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default7, function18, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z114, i21, imeOptions$foundation_release7, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i21113, ((i20 >> 18) & 112) | (i36 & 896) | (i36 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z115;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function19 = function7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                public final void invoke(@Nullable Composer composer2, int i37) {
                    BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function19, composer2, i2 | 1, i3, i4);
                }
            });
        }
        i5 |= 384;
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            if ((i2 & 458752) != 0) {
                if ((i4 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i5 |= i24;
            }
            if ((i2 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i5 |= i23;
            }
            if ((i2 & 29360128) == 0) {
                if ((i4 & 128) == 0) {
                    keyboardActions2 = keyboardActions;
                    if (composerStartRestartGroup.changed(keyboardActions2)) {
                    }
                    i5 |= i26;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i5 |= i26;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i10 = i4 & 256;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & 512;
            if (i12 != 0) {
                i5 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i5 |= i13;
            }
            if ((i3 & 14) == 0) {
                i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
            } else {
                i14 = i3;
            }
            if ((i3 & 112) != 0) {
                i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
            }
            i15 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i21114 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation17 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation17;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i21114;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i21115 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation18 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation18;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i21115;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default8 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release8 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z116 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z117 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function110 = (Function1) objRememberedValue3;
                    int i21116 = i19 << 12;
                    int i21117 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21116 & 57344) | (i21116 & 458752) | (i21116 & 3670016) | (i21116 & 29360128);
                    int i37 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default8, function110, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z116, i21, imeOptions$foundation_release8, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i21117, ((i20 >> 18) & 112) | (i37 & 896) | (i37 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z117;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                } else {
                    if ((i2 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i21118 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation19 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation19;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i21118;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        int i21119 = i5;
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        VisualTransformation visualTransformation110 = none;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M410getLambda1$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        i = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function5 = function3M410getLambda1$foundation_release;
                        i19 = i15;
                        brush2 = solidColor;
                        z8 = z5;
                        keyboardOptions3 = keyboardOptions2;
                        visualTransformation2 = visualTransformation110;
                        function6 = function4;
                        modifier2 = modifier3;
                        i20 = i21119;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    TextFieldValue textFieldValueM2831copy3r_uNRQ$default9 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                    ImeOptions imeOptions$foundation_release9 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z118 = !z7;
                    if (z7) {
                        i21 = 1;
                    } else {
                        i21 = i;
                    }
                    composerStartRestartGroup.startReplaceableGroup(-3686095);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                    boolean z119 = z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                                mutableState.setValue(textFieldValue);
                                if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                    return;
                                }
                                function1.invoke(textFieldValue.getText());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function111 = (Function1) objRememberedValue3;
                    int i211110 = i19 << 12;
                    int i211111 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211110 & 57344) | (i211110 & 458752) | (i211110 & 3670016) | (i211110 & 29360128);
                    int i38 = i20 >> 3;
                    CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default9, function111, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z118, i21, imeOptions$foundation_release9, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i211111, ((i20 >> 18) & 112) | (i38 & 896) | (i38 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                    z9 = z8;
                    z10 = z4;
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function7 = function5;
                    z11 = z119;
                    visualTransformation3 = visualTransformation2;
                    function8 = function6;
                    keyboardActions4 = keyboardActions3;
                    keyboardOptions4 = keyboardOptions3;
                    i22 = i;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function112 = function7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                    public final void invoke(@Nullable Composer composer2, int i39) {
                        BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function112, composer2, i2 | 1, i3, i4);
                    }
                });
            }
            i15 |= 384;
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i211112 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation111 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation111;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i211112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i211113 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation112 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation112;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i211113;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default10 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release10 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z1110 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z1111 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function113 = (Function1) objRememberedValue3;
                int i211114 = i19 << 12;
                int i211115 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211114 & 57344) | (i211114 & 458752) | (i211114 & 3670016) | (i211114 & 29360128);
                int i39 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default10, function113, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z1110, i21, imeOptions$foundation_release10, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i211115, ((i20 >> 18) & 112) | (i39 & 896) | (i39 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z1111;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i211116 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation113 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation113;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i211116;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i211117 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation114 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation114;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i211117;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default11 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release11 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z1112 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z1113 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function114 = (Function1) objRememberedValue3;
                int i211118 = i19 << 12;
                int i211119 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211118 & 57344) | (i211118 & 458752) | (i211118 & 3670016) | (i211118 & 29360128);
                int i310 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default11, function114, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z1112, i21, imeOptions$foundation_release11, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i211119, ((i20 >> 18) & 112) | (i310 & 896) | (i310 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z1113;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function115 = function7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                public final void invoke(@Nullable Composer composer2, int i311) {
                    BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function115, composer2, i2 | 1, i3, i4);
                }
            });
        }
        i5 |= 3072;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        if ((i2 & 458752) != 0) {
            if ((i4 & 32) == 0) {
                i24 = 65536;
            } else {
                i24 = 65536;
            }
            i5 |= i24;
        }
        if ((i2 & 3670016) != 0) {
            if ((i4 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i5 |= i23;
        }
        if ((i2 & 29360128) == 0) {
            if ((i4 & 128) == 0) {
                keyboardActions2 = keyboardActions;
                if (composerStartRestartGroup.changed(keyboardActions2)) {
                }
                i5 |= i26;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i5 |= i26;
        } else {
            keyboardActions2 = keyboardActions;
        }
        i10 = i4 & 256;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        i12 = i4 & 512;
        if (i12 != 0) {
            i5 |= C.ENCODING_PCM_32BIT;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i5 |= i13;
        }
        if ((i3 & 14) == 0) {
            i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
        } else {
            i14 = i3;
        }
        if ((i3 & 112) != 0) {
            i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
        }
        i15 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
            if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2111110 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation115 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation115;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2111110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2111111 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation116 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation116;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2111111;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default12 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release12 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z1114 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z1115 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function116 = (Function1) objRememberedValue3;
                int i2111112 = i19 << 12;
                int i2111113 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2111112 & 57344) | (i2111112 & 458752) | (i2111112 & 3670016) | (i2111112 & 29360128);
                int i311 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default12, function116, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z1114, i21, imeOptions$foundation_release12, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i2111113, ((i20 >> 18) & 112) | (i311 & 896) | (i311 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z1115;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            } else {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2111114 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation117 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation117;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2111114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    int i2111115 = i5;
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    VisualTransformation visualTransformation118 = none;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M410getLambda1$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    i = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function5 = function3M410getLambda1$foundation_release;
                    i19 = i15;
                    brush2 = solidColor;
                    z8 = z5;
                    keyboardOptions3 = keyboardOptions2;
                    visualTransformation2 = visualTransformation118;
                    function6 = function4;
                    modifier2 = modifier3;
                    i20 = i2111115;
                }
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                TextFieldValue textFieldValueM2831copy3r_uNRQ$default13 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                ImeOptions imeOptions$foundation_release13 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z1116 = !z7;
                if (z7) {
                    i21 = 1;
                } else {
                    i21 = i;
                }
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
                boolean z1117 = z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                            mutableState.setValue(textFieldValue);
                            if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function117 = (Function1) objRememberedValue3;
                int i2111116 = i19 << 12;
                int i2111117 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2111116 & 57344) | (i2111116 & 458752) | (i2111116 & 3670016) | (i2111116 & 29360128);
                int i312 = i20 >> 3;
                CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default13, function117, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z1116, i21, imeOptions$foundation_release13, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i2111117, ((i20 >> 18) & 112) | (i312 & 896) | (i312 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
                z9 = z8;
                z10 = z4;
                modifier4 = modifier2;
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function7 = function5;
                z11 = z1117;
                visualTransformation3 = visualTransformation2;
                function8 = function6;
                keyboardActions4 = keyboardActions3;
                keyboardOptions4 = keyboardOptions3;
                i22 = i;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function118 = function7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

                public final void invoke(@Nullable Composer composer2, int i313) {
                    BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function118, composer2, i2 | 1, i3, i4);
                }
            });
        }
        i15 |= 384;
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
        }
        if ((i3 & 57344) != 0) {
            i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
        }
        if (((i5 & 1533916891) ^ 306783378) != 0) {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                int i2111118 = i5;
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                VisualTransformation visualTransformation119 = none;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M410getLambda1$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                i = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                z7 = z6;
                function5 = function3M410getLambda1$foundation_release;
                i19 = i15;
                brush2 = solidColor;
                z8 = z5;
                keyboardOptions3 = keyboardOptions2;
                visualTransformation2 = visualTransformation119;
                function6 = function4;
                modifier2 = modifier3;
                i20 = i2111118;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                int i2111119 = i5;
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                VisualTransformation visualTransformation1110 = none;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M410getLambda1$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                i = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                z7 = z6;
                function5 = function3M410getLambda1$foundation_release;
                i19 = i15;
                brush2 = solidColor;
                z8 = z5;
                keyboardOptions3 = keyboardOptions2;
                visualTransformation2 = visualTransformation1110;
                function6 = function4;
                modifier2 = modifier3;
                i20 = i2111119;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            TextFieldValue textFieldValueM2831copy3r_uNRQ$default14 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
            ImeOptions imeOptions$foundation_release14 = keyboardOptions3.toImeOptions$foundation_release(z7);
            boolean z1118 = !z7;
            if (z7) {
                i21 = 1;
            } else {
                i21 = i;
            }
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
            boolean z1119 = z7;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                        mutableState.setValue(textFieldValue);
                        if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                        mutableState.setValue(textFieldValue);
                        if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function119 = (Function1) objRememberedValue3;
            int i21111110 = i19 << 12;
            int i21111111 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21111110 & 57344) | (i21111110 & 458752) | (i21111110 & 3670016) | (i21111110 & 29360128);
            int i313 = i20 >> 3;
            CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default14, function119, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z1118, i21, imeOptions$foundation_release14, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i21111111, ((i20 >> 18) & 112) | (i313 & 896) | (i313 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
            z9 = z8;
            z10 = z4;
            modifier4 = modifier2;
            textStyle3 = textStyle2;
            mutableInteractionSource4 = mutableInteractionSource3;
            brush3 = brush2;
            function7 = function5;
            z11 = z1119;
            visualTransformation3 = visualTransformation2;
            function8 = function6;
            keyboardActions4 = keyboardActions3;
            keyboardOptions4 = keyboardOptions3;
            i22 = i;
        } else {
            if ((i2 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                int i21111112 = i5;
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                VisualTransformation visualTransformation1111 = none;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M410getLambda1$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                i = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                z7 = z6;
                function5 = function3M410getLambda1$foundation_release;
                i19 = i15;
                brush2 = solidColor;
                z8 = z5;
                keyboardOptions3 = keyboardOptions2;
                visualTransformation2 = visualTransformation1111;
                function6 = function4;
                modifier2 = modifier3;
                i20 = i21111112;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                int i21111113 = i5;
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                VisualTransformation visualTransformation1112 = none;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M410getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m410getLambda1$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M410getLambda1$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                i = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                z7 = z6;
                function5 = function3M410getLambda1$foundation_release;
                i19 = i15;
                brush2 = solidColor;
                z8 = z5;
                keyboardOptions3 = keyboardOptions2;
                visualTransformation2 = visualTransformation1112;
                function6 = function4;
                modifier2 = modifier3;
                i20 = i21111113;
            }
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            TextFieldValue textFieldValueM2831copy3r_uNRQ$default15 = TextFieldValue.m2831copy3r_uNRQ$default(m403BasicTextField$lambda2(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
            ImeOptions imeOptions$foundation_release15 = keyboardOptions3.toImeOptions$foundation_release(z7);
            boolean z11110 = !z7;
            if (z7) {
                i21 = 1;
            } else {
                i21 = i;
            }
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function1);
            boolean z11111 = z7;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                        mutableState.setValue(textFieldValue);
                        if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                        mutableState.setValue(textFieldValue);
                        if (Intrinsics.areEqual(str, textFieldValue.getText())) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function1110 = (Function1) objRememberedValue3;
            int i21111114 = i19 << 12;
            int i21111115 = (i20 & 896) | ((i20 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21111114 & 57344) | (i21111114 & 458752) | (i21111114 & 3670016) | (i21111114 & 29360128);
            int i314 = i20 >> 3;
            CoreTextFieldKt.CoreTextField(textFieldValueM2831copy3r_uNRQ$default15, function1110, modifier2, textStyle2, visualTransformation2, function6, mutableInteractionSource3, brush2, z11110, i21, imeOptions$foundation_release15, keyboardActions3, z4, z8, function5, composerStartRestartGroup, i21111115, ((i20 >> 18) & 112) | (i314 & 896) | (i314 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i19 & 57344), 0);
            z9 = z8;
            z10 = z4;
            modifier4 = modifier2;
            textStyle3 = textStyle2;
            mutableInteractionSource4 = mutableInteractionSource3;
            brush3 = brush2;
            function7 = function5;
            z11 = z11111;
            visualTransformation3 = visualTransformation2;
            function8 = function6;
            keyboardActions4 = keyboardActions3;
            keyboardOptions4 = keyboardOptions3;
            i22 = i;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function1111 = function7;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.4
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

            public final void invoke(@Nullable Composer composer2, int i315) {
                BasicTextFieldKt.BasicTextField(str, function1, modifier4, z10, z9, textStyle3, keyboardOptions4, keyboardActions4, z11, i22, visualTransformation3, function8, mutableInteractionSource4, brush3, function1111, composer2, i2 | 1, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: BasicTextField$lambda-2, reason: not valid java name */
    private static final TextFieldValue m403BasicTextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:133:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:141:0x0194  */
    /* JADX WARN: Code duplicated, block: B:143:0x0198  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:169:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0205  */
    /* JADX WARN: Code duplicated, block: B:196:0x025d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:199:0x0265  */
    /* JADX WARN: Code duplicated, block: B:201:0x0268  */
    /* JADX WARN: Code duplicated, block: B:202:0x026a  */
    /* JADX WARN: Code duplicated, block: B:204:0x026e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0270  */
    /* JADX WARN: Code duplicated, block: B:208:0x0276  */
    /* JADX WARN: Code duplicated, block: B:209:0x0282  */
    /* JADX WARN: Code duplicated, block: B:212:0x0288  */
    /* JADX WARN: Code duplicated, block: B:213:0x0294  */
    /* JADX WARN: Code duplicated, block: B:216:0x029c  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:219:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:222:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:230:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:240:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:241:0x0313  */
    /* JADX WARN: Code duplicated, block: B:244:0x031f  */
    /* JADX WARN: Code duplicated, block: B:245:0x032b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0353  */
    /* JADX WARN: Code duplicated, block: B:250:0x0356  */
    /* JADX WARN: Code duplicated, block: B:253:0x036f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0377  */
    /* JADX WARN: Code duplicated, block: B:260:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    @Composable
    public static final void BasicTextField(@NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z3, int i, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        KeyboardActions keyboardActions2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        boolean z4;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions3;
        boolean z6;
        int i18;
        VisualTransformation none;
        Function1<? super TextLayoutResult, Unit> function4;
        MutableInteractionSource mutableInteractionSource2;
        Brush solidColor;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M411getLambda2$foundation_release;
        Modifier modifier4;
        Function1<? super TextLayoutResult, Unit> function5;
        int i19;
        MutableInteractionSource mutableInteractionSource3;
        KeyboardActions keyboardActions4;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function6;
        Brush brush2;
        boolean z7;
        VisualTransformation visualTransformation2;
        boolean z8;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        boolean z9;
        Object objRememberedValue;
        int i20;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final boolean z10;
        final Modifier modifier5;
        final boolean z11;
        final boolean z12;
        final KeyboardOptions keyboardOptions4;
        final TextStyle textStyle4;
        final KeyboardActions keyboardActions5;
        final int i21;
        final VisualTransformation visualTransformation3;
        final Function1<? super TextLayoutResult, Unit> function7;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush3;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i22;
        int i23;
        Composer composerStartRestartGroup = composer.startRestartGroup(1483898066);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i24 = i4 & 4;
        if (i24 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                if ((i2 & 458752) != 0) {
                    if ((i4 & 32) == 0 || !composerStartRestartGroup.changed(textStyle)) {
                        i23 = 65536;
                    } else {
                        i23 = 131072;
                    }
                    i5 |= i23;
                }
                if ((i2 & 3670016) != 0) {
                    if ((i4 & 64) == 0 || !composerStartRestartGroup.changed(keyboardOptions)) {
                        i22 = 524288;
                    } else {
                        i22 = 1048576;
                    }
                    i5 |= i22;
                }
                if ((i2 & 29360128) == 0) {
                    if ((i4 & 128) == 0) {
                        keyboardActions2 = keyboardActions;
                        int i25 = composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        i5 |= i25;
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    i5 |= i25;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i5 |= i13;
                }
                if ((i3 & 14) == 0) {
                    i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
                } else {
                    i14 = i3;
                }
                if ((i3 & 112) != 0) {
                    i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
                }
                i15 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    if ((i3 & 896) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i17 = 256;
                        } else {
                            i17 = 128;
                        }
                        i15 |= i17;
                    }
                    if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                        i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                    }
                    if ((i3 & 57344) != 0) {
                        i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                    }
                    if (((i5 & 1533916891) ^ 306783378) != 0 && ((i15 & 46811) ^ 9362) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z11 = z;
                        z12 = z2;
                        keyboardOptions4 = keyboardOptions;
                        z10 = z3;
                        visualTransformation3 = visualTransformation;
                        function7 = function2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        brush3 = brush;
                        function8 = function3;
                        modifier5 = modifier2;
                        composer2 = composerStartRestartGroup;
                        i21 = i;
                        keyboardActions5 = keyboardActions2;
                        textStyle4 = textStyle;
                    } else {
                        if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i4 & 1024) != 0) {
                                i15 &= -15;
                            }
                            if ((i4 & 2048) != 0) {
                                i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if ((i4 & 8192) != 0) {
                                i15 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i15 &= -57345;
                            }
                            z7 = z;
                            z8 = z2;
                            textStyle3 = textStyle;
                            keyboardOptions3 = keyboardOptions;
                            i19 = i;
                            visualTransformation2 = visualTransformation;
                            function5 = function2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush2 = brush;
                            function6 = function3;
                            keyboardActions4 = keyboardActions2;
                            modifier4 = modifier2;
                            z9 = z3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i24 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i4 & 32) != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                                i5 &= -458753;
                            } else {
                                textStyle2 = textStyle;
                            }
                            if ((i4 & 64) != 0) {
                                keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                i5 &= -3670017;
                            } else {
                                keyboardOptions2 = keyboardOptions;
                            }
                            Modifier modifier6 = modifier3;
                            if ((i4 & 128) != 0) {
                                keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                                i5 &= -29360129;
                            } else {
                                keyboardActions3 = keyboardActions2;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i;
                            }
                            if ((i4 & 1024) != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                                i15 &= -15;
                            } else {
                                none = visualTransformation;
                            }
                            int i26 = i5;
                            if ((i4 & 2048) != 0) {
                                function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                function4 = function2;
                            }
                            if (i16 != 0) {
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
                            if ((i4 & 8192) != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                                i15 &= -7169;
                            } else {
                                solidColor = brush;
                            }
                            if ((i4 & 16384) != 0) {
                                function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                                i15 = (-57345) & i15;
                            } else {
                                function3M411getLambda2$foundation_release = function3;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier4 = modifier6;
                            function5 = function4;
                            i19 = i18;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            keyboardActions4 = keyboardActions3;
                            function6 = function3M411getLambda2$foundation_release;
                            brush2 = solidColor;
                            z7 = z4;
                            visualTransformation2 = none;
                            z8 = z5;
                            textStyle3 = textStyle2;
                            keyboardOptions3 = keyboardOptions2;
                            i5 = i26;
                            z9 = z6;
                        }
                        ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z9);
                        boolean z13 = !z9;
                        if (z9) {
                            i20 = 1;
                        } else {
                            i20 = i19;
                        }
                        int i27 = i5 & 14;
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                    invoke2(textFieldValue2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                    if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                        return;
                                    }
                                    function1.invoke(textFieldValue2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function9 = (Function1) objRememberedValue2;
                        int i28 = i15 << 12;
                        int i29 = i27 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | (i28 & 29360128);
                        int i30 = (i5 >> 18) & 112;
                        int i31 = i5 >> 3;
                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                        composer2 = composerStartRestartGroup;
                        CoreTextFieldKt.CoreTextField(textFieldValue, function9, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z13, i20, imeOptions$foundation_release, keyboardActions4, z7, z8, function6, composer2, i29, (i31 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i30 | (i31 & 896) | (i15 & 57344), 0);
                        z10 = z9;
                        modifier5 = modifier4;
                        z11 = z7;
                        z12 = z8;
                        keyboardOptions4 = keyboardOptions5;
                        textStyle4 = textStyle3;
                        keyboardActions5 = keyboardActions4;
                        i21 = i19;
                        visualTransformation3 = visualTransformation2;
                        function7 = function5;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        brush3 = brush2;
                        function8 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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

                        public final void invoke(@Nullable Composer composer3, int i32) {
                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                        }
                    });
                }
                i15 |= 384;
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier7 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i210 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier7;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i210;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier8 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i211 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier8;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i211;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z14 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i212 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function10 = (Function1) objRememberedValue2;
                    int i213 = i15 << 12;
                    int i214 = i212 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i213 & 57344) | (i213 & 458752) | (i213 & 3670016) | (i213 & 29360128);
                    int i32 = (i5 >> 18) & 112;
                    int i33 = i5 >> 3;
                    KeyboardOptions keyboardOptions6 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function10, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z14, i20, imeOptions$foundation_release2, keyboardActions4, z7, z8, function6, composer2, i214, (i33 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i32 | (i33 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions6;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                } else {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier9 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i215 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier9;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i215;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier10 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i216 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier10;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i216;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release3 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z15 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i217 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11 = (Function1) objRememberedValue2;
                    int i218 = i15 << 12;
                    int i219 = i217 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i218 & 57344) | (i218 & 458752) | (i218 & 3670016) | (i218 & 29360128);
                    int i34 = (i5 >> 18) & 112;
                    int i35 = i5 >> 3;
                    KeyboardOptions keyboardOptions7 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function11, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z15, i20, imeOptions$foundation_release3, keyboardActions4, z7, z8, function6, composer2, i219, (i35 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i34 | (i35 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions7;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                    }
                });
            }
            i5 |= 3072;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            if ((i2 & 458752) != 0) {
                if ((i4 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i5 |= i23;
            }
            if ((i2 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i5 |= i22;
            }
            if ((i2 & 29360128) == 0) {
                if ((i4 & 128) == 0) {
                    keyboardActions2 = keyboardActions;
                    if (composerStartRestartGroup.changed(keyboardActions2)) {
                    }
                    i5 |= i25;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i5 |= i25;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i10 = i4 & 256;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & 512;
            if (i12 != 0) {
                i5 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i5 |= i13;
            }
            if ((i3 & 14) == 0) {
                i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
            } else {
                i14 = i3;
            }
            if ((i3 & 112) != 0) {
                i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
            }
            i15 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier11 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i2110 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier11;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i2110;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier12 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i2111 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier12;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i2111;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release4 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z16 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i2112 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function12 = (Function1) objRememberedValue2;
                    int i2113 = i15 << 12;
                    int i2114 = i2112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2113 & 57344) | (i2113 & 458752) | (i2113 & 3670016) | (i2113 & 29360128);
                    int i36 = (i5 >> 18) & 112;
                    int i37 = i5 >> 3;
                    KeyboardOptions keyboardOptions8 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function12, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z16, i20, imeOptions$foundation_release4, keyboardActions4, z7, z8, function6, composer2, i2114, (i37 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i36 | (i37 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions8;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                } else {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier13 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i2115 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier13;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i2115;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier14 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i2116 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier14;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i2116;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release5 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z17 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i2117 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function13 = (Function1) objRememberedValue2;
                    int i2118 = i15 << 12;
                    int i2119 = i2117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2118 & 57344) | (i2118 & 458752) | (i2118 & 3670016) | (i2118 & 29360128);
                    int i38 = (i5 >> 18) & 112;
                    int i39 = i5 >> 3;
                    KeyboardOptions keyboardOptions9 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function13, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z17, i20, imeOptions$foundation_release5, keyboardActions4, z7, z8, function6, composer2, i2119, (i39 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i38 | (i39 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions9;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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

                    public final void invoke(@Nullable Composer composer3, int i310) {
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                    }
                });
            }
            i15 |= 384;
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier15 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21110 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier15;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21110;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier16 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21111 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier16;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21111;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release6 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z18 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i21112 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function14 = (Function1) objRememberedValue2;
                int i21113 = i15 << 12;
                int i21114 = i21112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21113 & 57344) | (i21113 & 458752) | (i21113 & 3670016) | (i21113 & 29360128);
                int i310 = (i5 >> 18) & 112;
                int i311 = i5 >> 3;
                KeyboardOptions keyboardOptions10 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function14, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z18, i20, imeOptions$foundation_release6, keyboardActions4, z7, z8, function6, composer2, i21114, (i311 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i310 | (i311 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions10;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            } else {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier17 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21115 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier17;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21115;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier18 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21116 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier18;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21116;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release7 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z19 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i21117 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function15 = (Function1) objRememberedValue2;
                int i21118 = i15 << 12;
                int i21119 = i21117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21118 & 57344) | (i21118 & 458752) | (i21118 & 3670016) | (i21118 & 29360128);
                int i312 = (i5 >> 18) & 112;
                int i313 = i5 >> 3;
                KeyboardOptions keyboardOptions11 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function15, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z19, i20, imeOptions$foundation_release7, keyboardActions4, z7, z8, function6, composer2, i21119, (i313 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i312 | (i313 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions11;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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

                public final void invoke(@Nullable Composer composer3, int i314) {
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                }
            });
        }
        i5 |= 384;
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            if ((i2 & 458752) != 0) {
                if ((i4 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i5 |= i23;
            }
            if ((i2 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i5 |= i22;
            }
            if ((i2 & 29360128) == 0) {
                if ((i4 & 128) == 0) {
                    keyboardActions2 = keyboardActions;
                    if (composerStartRestartGroup.changed(keyboardActions2)) {
                    }
                    i5 |= i25;
                } else {
                    keyboardActions2 = keyboardActions;
                }
                i5 |= i25;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i10 = i4 & 256;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & 512;
            if (i12 != 0) {
                i5 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i5 |= i13;
            }
            if ((i3 & 14) == 0) {
                i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
            } else {
                i14 = i3;
            }
            if ((i3 & 112) != 0) {
                i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
            }
            i15 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                    i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
                }
                if (((i5 & 1533916891) ^ 306783378) != 0) {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier19 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i211110 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier19;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i211110;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier110 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i211111 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier110;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i211111;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release8 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z110 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i211112 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function16 = (Function1) objRememberedValue2;
                    int i211113 = i15 << 12;
                    int i211114 = i211112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211113 & 57344) | (i211113 & 458752) | (i211113 & 3670016) | (i211113 & 29360128);
                    int i314 = (i5 >> 18) & 112;
                    int i315 = i5 >> 3;
                    KeyboardOptions keyboardOptions12 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function16, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z110, i20, imeOptions$foundation_release8, keyboardActions4, z7, z8, function6, composer2, i211114, (i315 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i314 | (i315 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions12;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                } else {
                    if ((i2 & 1) == 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier111 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i211115 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier111;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i211115;
                        z9 = z6;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i24 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i4 & 32) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -458753;
                        } else {
                            textStyle2 = textStyle;
                        }
                        if ((i4 & 64) != 0) {
                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                            i5 &= -3670017;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                        }
                        Modifier modifier112 = modifier3;
                        if ((i4 & 128) != 0) {
                            keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                            i5 &= -29360129;
                        } else {
                            keyboardActions3 = keyboardActions2;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i;
                        }
                        if ((i4 & 1024) != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                            i15 &= -15;
                        } else {
                            none = visualTransformation;
                        }
                        int i211116 = i5;
                        if ((i4 & 2048) != 0) {
                            function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
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
                        if ((i4 & 8192) != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                            i15 &= -7169;
                        } else {
                            solidColor = brush;
                        }
                        if ((i4 & 16384) != 0) {
                            function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                            i15 = (-57345) & i15;
                        } else {
                            function3M411getLambda2$foundation_release = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier112;
                        function5 = function4;
                        i19 = i18;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardActions4 = keyboardActions3;
                        function6 = function3M411getLambda2$foundation_release;
                        brush2 = solidColor;
                        z7 = z4;
                        visualTransformation2 = none;
                        z8 = z5;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        i5 = i211116;
                        z9 = z6;
                    }
                    ImeOptions imeOptions$foundation_release9 = keyboardOptions3.toImeOptions$foundation_release(z9);
                    boolean z111 = !z9;
                    if (z9) {
                        i20 = 1;
                    } else {
                        i20 = i19;
                    }
                    int i211117 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function17 = (Function1) objRememberedValue2;
                    int i211118 = i15 << 12;
                    int i211119 = i211117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211118 & 57344) | (i211118 & 458752) | (i211118 & 3670016) | (i211118 & 29360128);
                    int i316 = (i5 >> 18) & 112;
                    int i317 = i5 >> 3;
                    KeyboardOptions keyboardOptions13 = keyboardOptions3;
                    composer2 = composerStartRestartGroup;
                    CoreTextFieldKt.CoreTextField(textFieldValue, function17, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z111, i20, imeOptions$foundation_release9, keyboardActions4, z7, z8, function6, composer2, i211119, (i317 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i316 | (i317 & 896) | (i15 & 57344), 0);
                    z10 = z9;
                    modifier5 = modifier4;
                    z11 = z7;
                    z12 = z8;
                    keyboardOptions4 = keyboardOptions13;
                    textStyle4 = textStyle3;
                    keyboardActions5 = keyboardActions4;
                    i21 = i19;
                    visualTransformation3 = visualTransformation2;
                    function7 = function5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    brush3 = brush2;
                    function8 = function6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                    }
                });
            }
            i15 |= 384;
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier113 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i2111110 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier113;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i2111110;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier114 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i2111111 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier114;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i2111111;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release10 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z112 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i2111112 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function18 = (Function1) objRememberedValue2;
                int i2111113 = i15 << 12;
                int i2111114 = i2111112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2111113 & 57344) | (i2111113 & 458752) | (i2111113 & 3670016) | (i2111113 & 29360128);
                int i318 = (i5 >> 18) & 112;
                int i319 = i5 >> 3;
                KeyboardOptions keyboardOptions14 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function18, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z112, i20, imeOptions$foundation_release10, keyboardActions4, z7, z8, function6, composer2, i2111114, (i319 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i318 | (i319 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions14;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            } else {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier115 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i2111115 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier115;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i2111115;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier116 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i2111116 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier116;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i2111116;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release11 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z113 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i2111117 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function19 = (Function1) objRememberedValue2;
                int i2111118 = i15 << 12;
                int i2111119 = i2111117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i2111118 & 57344) | (i2111118 & 458752) | (i2111118 & 3670016) | (i2111118 & 29360128);
                int i3110 = (i5 >> 18) & 112;
                int i3111 = i5 >> 3;
                KeyboardOptions keyboardOptions15 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function19, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z113, i20, imeOptions$foundation_release11, keyboardActions4, z7, z8, function6, composer2, i2111119, (i3111 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i3110 | (i3111 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions15;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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

                public final void invoke(@Nullable Composer composer3, int i3112) {
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                }
            });
        }
        i5 |= 3072;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        if ((i2 & 458752) != 0) {
            if ((i4 & 32) == 0) {
                i23 = 65536;
            } else {
                i23 = 65536;
            }
            i5 |= i23;
        }
        if ((i2 & 3670016) != 0) {
            if ((i4 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i5 |= i22;
        }
        if ((i2 & 29360128) == 0) {
            if ((i4 & 128) == 0) {
                keyboardActions2 = keyboardActions;
                if (composerStartRestartGroup.changed(keyboardActions2)) {
                }
                i5 |= i25;
            } else {
                keyboardActions2 = keyboardActions;
            }
            i5 |= i25;
        } else {
            keyboardActions2 = keyboardActions;
        }
        i10 = i4 & 256;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        i12 = i4 & 512;
        if (i12 != 0) {
            i5 |= C.ENCODING_PCM_32BIT;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i5 |= i13;
        }
        if ((i3 & 14) == 0) {
            i14 = i3 | (((i4 & 1024) == 0 || !composerStartRestartGroup.changed(visualTransformation)) ? 2 : 4);
        } else {
            i14 = i3;
        }
        if ((i3 & 112) != 0) {
            i14 |= ((i4 & 2048) == 0 || !composerStartRestartGroup.changed(function2)) ? 16 : 32;
        }
        i15 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
            if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
                i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
            }
            if (((i5 & 1533916891) ^ 306783378) != 0) {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier117 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21111110 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier117;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21111110;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier118 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21111111 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier118;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21111111;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release12 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z114 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i21111112 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function110 = (Function1) objRememberedValue2;
                int i21111113 = i15 << 12;
                int i21111114 = i21111112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21111113 & 57344) | (i21111113 & 458752) | (i21111113 & 3670016) | (i21111113 & 29360128);
                int i3112 = (i5 >> 18) & 112;
                int i3113 = i5 >> 3;
                KeyboardOptions keyboardOptions16 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function110, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z114, i20, imeOptions$foundation_release12, keyboardActions4, z7, z8, function6, composer2, i21111114, (i3113 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i3112 | (i3113 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions16;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            } else {
                if ((i2 & 1) == 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier119 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21111115 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier119;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21111115;
                    z9 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i24 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i4 & 32) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -458753;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 64) != 0) {
                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                        i5 &= -3670017;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                    }
                    Modifier modifier1110 = modifier3;
                    if ((i4 & 128) != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                        i5 &= -29360129;
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i;
                    }
                    if ((i4 & 1024) != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                        i15 &= -15;
                    } else {
                        none = visualTransformation;
                    }
                    int i21111116 = i5;
                    if ((i4 & 2048) != 0) {
                        function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
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
                    if ((i4 & 8192) != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                        i15 &= -7169;
                    } else {
                        solidColor = brush;
                    }
                    if ((i4 & 16384) != 0) {
                        function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                        i15 = (-57345) & i15;
                    } else {
                        function3M411getLambda2$foundation_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier1110;
                    function5 = function4;
                    i19 = i18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardActions4 = keyboardActions3;
                    function6 = function3M411getLambda2$foundation_release;
                    brush2 = solidColor;
                    z7 = z4;
                    visualTransformation2 = none;
                    z8 = z5;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    i5 = i21111116;
                    z9 = z6;
                }
                ImeOptions imeOptions$foundation_release13 = keyboardOptions3.toImeOptions$foundation_release(z9);
                boolean z115 = !z9;
                if (z9) {
                    i20 = 1;
                } else {
                    i20 = i19;
                }
                int i21111117 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function111 = (Function1) objRememberedValue2;
                int i21111118 = i15 << 12;
                int i21111119 = i21111117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i21111118 & 57344) | (i21111118 & 458752) | (i21111118 & 3670016) | (i21111118 & 29360128);
                int i3114 = (i5 >> 18) & 112;
                int i3115 = i5 >> 3;
                KeyboardOptions keyboardOptions17 = keyboardOptions3;
                composer2 = composerStartRestartGroup;
                CoreTextFieldKt.CoreTextField(textFieldValue, function111, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z115, i20, imeOptions$foundation_release13, keyboardActions4, z7, z8, function6, composer2, i21111119, (i3115 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i3114 | (i3115 & 896) | (i15 & 57344), 0);
                z10 = z9;
                modifier5 = modifier4;
                z11 = z7;
                z12 = z8;
                keyboardOptions4 = keyboardOptions17;
                textStyle4 = textStyle3;
                keyboardActions5 = keyboardActions4;
                i21 = i19;
                visualTransformation3 = visualTransformation2;
                function7 = function5;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush3 = brush2;
                function8 = function6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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

                public final void invoke(@Nullable Composer composer3, int i3116) {
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
                }
            });
        }
        i15 |= 384;
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) != 0) {
            i15 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(brush)) ? 1024 : 2048;
        }
        if ((i3 & 57344) != 0) {
            i15 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(function3)) ? 8192 : 16384;
        }
        if (((i5 & 1533916891) ^ 306783378) != 0) {
            if ((i2 & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i24 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                Modifier modifier1111 = modifier3;
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                int i211111110 = i5;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M411getLambda2$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier1111;
                function5 = function4;
                i19 = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardActions4 = keyboardActions3;
                function6 = function3M411getLambda2$foundation_release;
                brush2 = solidColor;
                z7 = z4;
                visualTransformation2 = none;
                z8 = z5;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                i5 = i211111110;
                z9 = z6;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i24 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                Modifier modifier1112 = modifier3;
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                int i211111111 = i5;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M411getLambda2$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier1112;
                function5 = function4;
                i19 = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardActions4 = keyboardActions3;
                function6 = function3M411getLambda2$foundation_release;
                brush2 = solidColor;
                z7 = z4;
                visualTransformation2 = none;
                z8 = z5;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                i5 = i211111111;
                z9 = z6;
            }
            ImeOptions imeOptions$foundation_release14 = keyboardOptions3.toImeOptions$foundation_release(z9);
            boolean z116 = !z9;
            if (z9) {
                i20 = 1;
            } else {
                i20 = i19;
            }
            int i211111112 = i5 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function112 = (Function1) objRememberedValue2;
            int i211111113 = i15 << 12;
            int i211111114 = i211111112 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211111113 & 57344) | (i211111113 & 458752) | (i211111113 & 3670016) | (i211111113 & 29360128);
            int i3116 = (i5 >> 18) & 112;
            int i3117 = i5 >> 3;
            KeyboardOptions keyboardOptions18 = keyboardOptions3;
            composer2 = composerStartRestartGroup;
            CoreTextFieldKt.CoreTextField(textFieldValue, function112, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z116, i20, imeOptions$foundation_release14, keyboardActions4, z7, z8, function6, composer2, i211111114, (i3117 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i3116 | (i3117 & 896) | (i15 & 57344), 0);
            z10 = z9;
            modifier5 = modifier4;
            z11 = z7;
            z12 = z8;
            keyboardOptions4 = keyboardOptions18;
            textStyle4 = textStyle3;
            keyboardActions5 = keyboardActions4;
            i21 = i19;
            visualTransformation3 = visualTransformation2;
            function7 = function5;
            mutableInteractionSource4 = mutableInteractionSource3;
            brush3 = brush2;
            function8 = function6;
        } else {
            if ((i2 & 1) == 0) {
                composerStartRestartGroup.startDefaults();
                if (i24 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                Modifier modifier1113 = modifier3;
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                int i211111115 = i5;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M411getLambda2$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier1113;
                function5 = function4;
                i19 = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardActions4 = keyboardActions3;
                function6 = function3M411getLambda2$foundation_release;
                brush2 = solidColor;
                z7 = z4;
                visualTransformation2 = none;
                z8 = z5;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                i5 = i211111115;
                z9 = z6;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i24 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i4 & 32) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -458753;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i4 & 64) != 0) {
                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                    i5 &= -3670017;
                } else {
                    keyboardOptions2 = keyboardOptions;
                }
                Modifier modifier1114 = modifier3;
                if ((i4 & 128) != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    i5 &= -29360129;
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (i10 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i;
                }
                if ((i4 & 1024) != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                    i15 &= -15;
                } else {
                    none = visualTransformation;
                }
                int i211111116 = i5;
                if ((i4 & 2048) != 0) {
                    function4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i15 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
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
                if ((i4 & 8192) != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
                    i15 &= -7169;
                } else {
                    solidColor = brush;
                }
                if ((i4 & 16384) != 0) {
                    function3M411getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m411getLambda2$foundation_release();
                    i15 = (-57345) & i15;
                } else {
                    function3M411getLambda2$foundation_release = function3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier1114;
                function5 = function4;
                i19 = i18;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardActions4 = keyboardActions3;
                function6 = function3M411getLambda2$foundation_release;
                brush2 = solidColor;
                z7 = z4;
                visualTransformation2 = none;
                z8 = z5;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                i5 = i211111116;
                z9 = z6;
            }
            ImeOptions imeOptions$foundation_release15 = keyboardOptions3.toImeOptions$foundation_release(z9);
            boolean z117 = !z9;
            if (z9) {
                i20 = 1;
            } else {
                i20 = i19;
            }
            int i211111117 = i5 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function113 = (Function1) objRememberedValue2;
            int i211111118 = i15 << 12;
            int i211111119 = i211111117 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i211111118 & 57344) | (i211111118 & 458752) | (i211111118 & 3670016) | (i211111118 & 29360128);
            int i3118 = (i5 >> 18) & 112;
            int i3119 = i5 >> 3;
            KeyboardOptions keyboardOptions19 = keyboardOptions3;
            composer2 = composerStartRestartGroup;
            CoreTextFieldKt.CoreTextField(textFieldValue, function113, modifier4, textStyle3, visualTransformation2, function5, mutableInteractionSource3, brush2, z117, i20, imeOptions$foundation_release15, keyboardActions4, z7, z8, function6, composer2, i211111119, (i3119 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | i3118 | (i3119 & 896) | (i15 & 57344), 0);
            z10 = z9;
            modifier5 = modifier4;
            z11 = z7;
            z12 = z8;
            keyboardOptions4 = keyboardOptions19;
            textStyle4 = textStyle3;
            keyboardActions5 = keyboardActions4;
            i21 = i19;
            visualTransformation3 = visualTransformation2;
            function7 = function5;
            mutableInteractionSource4 = mutableInteractionSource3;
            brush3 = brush2;
            function8 = function6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.8
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
                BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i21, visualTransformation3, function7, mutableInteractionSource4, brush3, function8, composer3, i2 | 1, i3, i4);
            }
        });
    }
}
