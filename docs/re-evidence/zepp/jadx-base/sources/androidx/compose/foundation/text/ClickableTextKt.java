package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001ay\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class ClickableTextKt {
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x021c  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    @Composable
    /* JADX INFO: renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    public static final void m408ClickableText4YKlhWE(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, @Nullable TextStyle textStyle, boolean z, int i, int i2, @Nullable Function1<? super TextLayoutResult, Unit> function1, @NotNull final Function1<? super Integer, Unit> function2, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        TextStyle textStyle2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function1<? super TextLayoutResult, Unit> function3;
        int i12;
        int iM2920getClipgIe3tQ8;
        int i13;
        int i14;
        final Function1<? super TextLayoutResult, Unit> function4;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final boolean z3;
        final Modifier modifier3;
        final int i15;
        final int i16;
        final Function1<? super TextLayoutResult, Unit> function5;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Composer composerStartRestartGroup = composer.startRestartGroup(48323887);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i18 = i4 & 2;
        if (i18 == 0) {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 896) == 0) {
                if ((i4 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i19 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i5 |= i19;
                } else {
                    textStyle2 = textStyle;
                }
                i5 |= i19;
            } else {
                textStyle2 = textStyle;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 8192;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i5 |= 196608;
                    i10 = i2;
                } else {
                    i10 = i2;
                    if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                if ((i3 & 3670016) == 0) {
                    function3 = function1;
                    if ((i4 & 64) == 0 || !composerStartRestartGroup.changed(function3)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i5 |= i17;
                } else {
                    function3 = function1;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                    }
                    if (((~i4) & 16) != 0 && ((23967451 & i5) ^ 4793490) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        i16 = i;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        function5 = function3;
                        modifier3 = modifier2;
                        i15 = i10;
                    } else {
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            }
                            if (i6 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                                i5 &= -57345;
                            } else {
                                iM2920getClipgIe3tQ8 = i;
                            }
                            if (i9 != 0) {
                                i13 = Integer.MAX_VALUE;
                            } else {
                                i13 = i10;
                            }
                            if ((i4 & 64) != 0) {
                                function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i5 &= -3670017;
                            }
                            composerStartRestartGroup.endDefaults();
                            i14 = i5;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if (i8 != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            iM2920getClipgIe3tQ8 = i;
                            i14 = i5;
                            i13 = i10;
                        }
                        function4 = function3;
                        boolean z4 = z2;
                        composerStartRestartGroup.startReplaceableGroup(-3687241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(-3686552);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    mutableState.setValue(textLayoutResult);
                                    function4.invoke(textLayoutResult);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z4, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                        int i20 = iM2920getClipgIe3tQ8;
                        z3 = z4;
                        modifier3 = modifier2;
                        i15 = i13;
                        i16 = i20;
                        TextStyle textStyle4 = textStyle2;
                        function5 = function4;
                        textStyle3 = textStyle4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                        public final void invoke(@Nullable Composer composer2, int i21) {
                            ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                        }
                    });
                }
                i12 = 12582912;
                i5 |= i12;
                if (((~i4) & 16) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z5 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion3, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen2, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z5, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i21 = iM2920getClipgIe3tQ8;
                    z3 = z5;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i21;
                    TextStyle textStyle5 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle5;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z6 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen3 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion4, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen3, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z6, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i22 = iM2920getClipgIe3tQ8;
                    z3 = z6;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i22;
                    TextStyle textStyle6 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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
                        ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                    }
                });
            }
            i5 |= 3072;
            z2 = z;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 8192;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                i10 = i2;
            } else {
                i10 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            if ((i3 & 3670016) == 0) {
                function3 = function1;
                if ((i4 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            } else {
                function3 = function1;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if (((~i4) & 16) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z7 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen4 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion5, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen4, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z7, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i23 = iM2920getClipgIe3tQ8;
                    z3 = z7;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i23;
                    TextStyle textStyle7 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle7;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z8 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen5 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion6, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen5, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z8, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i24 = iM2920getClipgIe3tQ8;
                    z3 = z8;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i24;
                    TextStyle textStyle8 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                    public final void invoke(@Nullable Composer composer2, int i25) {
                        ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                    }
                });
            }
            i12 = 12582912;
            i5 |= i12;
            if (((~i4) & 16) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z9 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion7 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen6 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion7, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen6, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z9, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i25 = iM2920getClipgIe3tQ8;
                z3 = z9;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i25;
                TextStyle textStyle9 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle9;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z10 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion8 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen7 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion8, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen7, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z10, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i26 = iM2920getClipgIe3tQ8;
                z3 = z10;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i26;
                TextStyle textStyle10 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                public final void invoke(@Nullable Composer composer2, int i27) {
                    ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                }
            });
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i3 & 896) == 0) {
            if ((i4 & 4) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                }
                i5 |= i19;
            } else {
                textStyle2 = textStyle;
            }
            i5 |= i19;
        } else {
            textStyle2 = textStyle;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 8192;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                i10 = i2;
            } else {
                i10 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            if ((i3 & 3670016) == 0) {
                function3 = function1;
                if ((i4 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            } else {
                function3 = function1;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                }
                if (((~i4) & 16) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z11 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen8 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion9, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen8, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z11, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i27 = iM2920getClipgIe3tQ8;
                    z3 = z11;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i27;
                    TextStyle textStyle11 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle11;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if ((i4 & 64) != 0) {
                            function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -3670017;
                        }
                        composerStartRestartGroup.endDefaults();
                        i14 = i5;
                    }
                    function4 = function3;
                    boolean z12 = z2;
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen9 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion10, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                mutableState.setValue(textLayoutResult);
                                function4.invoke(textLayoutResult);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen9, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z12, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                    int i28 = iM2920getClipgIe3tQ8;
                    z3 = z12;
                    modifier3 = modifier2;
                    i15 = i13;
                    i16 = i28;
                    TextStyle textStyle12 = textStyle2;
                    function5 = function4;
                    textStyle3 = textStyle12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                    public final void invoke(@Nullable Composer composer2, int i29) {
                        ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                    }
                });
            }
            i12 = 12582912;
            i5 |= i12;
            if (((~i4) & 16) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z13 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion11 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen10 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion11, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen10, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z13, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i29 = iM2920getClipgIe3tQ8;
                z3 = z13;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i29;
                TextStyle textStyle13 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle13;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z14 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion12 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen11 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion12, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen11, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z14, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i210 = iM2920getClipgIe3tQ8;
                z3 = z14;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i210;
                TextStyle textStyle14 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                public final void invoke(@Nullable Composer composer2, int i211) {
                    ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                }
            });
        }
        i5 |= 3072;
        z2 = z;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 8192;
        }
        i9 = i4 & 32;
        if (i9 != 0) {
            i5 |= 196608;
            i10 = i2;
        } else {
            i10 = i2;
            if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i5 |= i11;
            }
        }
        if ((i3 & 3670016) == 0) {
            function3 = function1;
            if ((i4 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i5 |= i17;
        } else {
            function3 = function1;
        }
        if ((i4 & 128) != 0) {
            if ((29360128 & i3) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
            }
            if (((~i4) & 16) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z15 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion13 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen12 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion13, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen12, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z15, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i211 = iM2920getClipgIe3tQ8;
                z3 = z15;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i211;
                TextStyle textStyle15 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle15;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if ((i4 & 64) != 0) {
                        function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -3670017;
                    }
                    composerStartRestartGroup.endDefaults();
                    i14 = i5;
                }
                function4 = function3;
                boolean z16 = z2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion14 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen13 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion14, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            mutableState.setValue(textLayoutResult);
                            function4.invoke(textLayoutResult);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen13, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z16, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
                int i212 = iM2920getClipgIe3tQ8;
                z3 = z16;
                modifier3 = modifier2;
                i15 = i13;
                i16 = i212;
                TextStyle textStyle16 = textStyle2;
                function5 = function4;
                textStyle3 = textStyle16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                public final void invoke(@Nullable Composer composer2, int i213) {
                    ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
                }
            });
        }
        i12 = 12582912;
        i5 |= i12;
        if (((~i4) & 16) != 0) {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if ((i4 & 64) != 0) {
                    function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
                i14 = i5;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if ((i4 & 64) != 0) {
                    function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
                i14 = i5;
            }
            function4 = function3;
            boolean z17 = z2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion15 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen14 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion15, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        function4.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        function4.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen14, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z17, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
            int i213 = iM2920getClipgIe3tQ8;
            z3 = z17;
            modifier3 = modifier2;
            i15 = i13;
            i16 = i213;
            TextStyle textStyle17 = textStyle2;
            function5 = function4;
            textStyle3 = textStyle17;
        } else {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if ((i4 & 64) != 0) {
                    function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
                i14 = i5;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if (i6 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if ((i4 & 64) != 0) {
                    function3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -3670017;
                }
                composerStartRestartGroup.endDefaults();
                i14 = i5;
            }
            function4 = function3;
            boolean z18 = z2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion16 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen15 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion16, function2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function4);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        function4.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        function4.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifierThen15, textStyle2, (Function1) objRememberedValue3, iM2920getClipgIe3tQ8, z18, i13, null, composerStartRestartGroup, 32768 | (i14 & 14) | (i14 & 896) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 128);
            int i214 = iM2920getClipgIe3tQ8;
            z3 = z18;
            modifier3 = modifier2;
            i15 = i13;
            i16 = i214;
            TextStyle textStyle18 = textStyle2;
            function5 = function4;
            textStyle3 = textStyle18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

            public final void invoke(@Nullable Composer composer2, int i215) {
                ClickableTextKt.m408ClickableText4YKlhWE(annotatedString, modifier3, textStyle3, z3, i16, i15, function5, function2, composer2, i3 | 1, i4);
            }
        });
    }
}
