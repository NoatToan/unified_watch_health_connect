package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a{\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "BasicText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class BasicTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0154  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    @Composable
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    public static final void m406BasicText4YKlhWE(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, @Nullable Map<String, InlineTextContent> map, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        final Modifier modifier2;
        final TextStyle textStyle2;
        final Function1<? super TextLayoutResult, Unit> function2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        int iM2920getClipgIe3tQ8;
        int i13;
        Map<String, InlineTextContent> mapEmptyMap;
        Modifier modifier4;
        TextStyle textStyle3;
        Function1<? super TextLayoutResult, Unit> function3;
        int i14;
        int i15;
        Map<String, InlineTextContent> map2;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        final int i16;
        final boolean z4;
        final int i17;
        final Map<String, InlineTextContent> map3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(959238322);
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
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i4 & 8) == 0) {
                    function2 = function1;
                    int i20 = composerStartRestartGroup.changed(function2) ? 2048 : 1024;
                    i5 |= i20;
                } else {
                    function2 = function1;
                }
                i5 |= i20;
            } else {
                function2 = function1;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                i5 |= 8192;
            }
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 458752) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    if ((3670016 & i3) == 0) {
                        i10 = i2;
                        if (composerStartRestartGroup.changed(i10)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                        i5 |= 4194304;
                    }
                    if (((~i4) & 144) != 0 && ((23967451 & i5) ^ 4793490) == 0 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        i16 = i;
                        z4 = z2;
                        i17 = i10;
                        map3 = map;
                    } else {
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier;
                            }
                            if ((i4 & 4) != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                                i5 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }
                                };
                                i5 &= -7169;
                            }
                            if (i6 != 0) {
                                iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                                i5 &= -57345;
                            } else {
                                iM2920getClipgIe3tQ8 = i;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                i13 = Integer.MAX_VALUE;
                            } else {
                                i13 = i10;
                            }
                            if (i12 != 0) {
                                mapEmptyMap = r.emptyMap();
                                i5 &= -29360129;
                            } else {
                                mapEmptyMap = map;
                            }
                            composerStartRestartGroup.endDefaults();
                            modifier4 = modifier3;
                            textStyle3 = textStyle2;
                            function3 = function2;
                            i14 = iM2920getClipgIe3tQ8;
                            i15 = i13;
                            map2 = mapEmptyMap;
                            z3 = z2;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if (i6 != 0) {
                                i5 &= -57345;
                            }
                            if (i12 != 0) {
                                i5 &= -29360129;
                            }
                            modifier4 = modifier;
                            i14 = i;
                            map2 = map;
                            textStyle3 = textStyle2;
                            function3 = function2;
                            z3 = z2;
                            i15 = i10;
                        }
                        int i21 = i5 & 14;
                        composerStartRestartGroup.startReplaceableGroup(-3686930);
                        zChanged = composerStartRestartGroup.changed(annotatedString);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                    SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i21 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                        modifier2 = modifier4;
                        textStyle2 = textStyle3;
                        function2 = function3;
                        i16 = i14;
                        z4 = z3;
                        i17 = i15;
                        map3 = map2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                        }
                    });
                }
                i5 |= 1572864;
                i10 = i2;
                i12 = i4 & 128;
                if (i12 != 0) {
                    i5 |= 4194304;
                }
                if (((~i4) & 144) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i22 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i22 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i23 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i23 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                    public final void invoke(@Nullable Composer composer2, int i24) {
                        BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                    }
                });
            }
            i5 |= 196608;
            z2 = z;
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((3670016 & i3) == 0) {
                    i10 = i2;
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    i5 |= 4194304;
                }
                if (((~i4) & 144) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i24 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i24 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i25 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i25 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                    public final void invoke(@Nullable Composer composer2, int i26) {
                        BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                    }
                });
            }
            i5 |= 1572864;
            i10 = i2;
            i12 = i4 & 128;
            if (i12 != 0) {
                i5 |= 4194304;
            }
            if (((~i4) & 144) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i26 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i26 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i27 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i27 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                public final void invoke(@Nullable Composer composer2, int i28) {
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
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
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i4 & 8) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changed(function2)) {
                }
                i5 |= i20;
            } else {
                function2 = function1;
            }
            i5 |= i20;
        } else {
            function2 = function1;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            i5 |= 8192;
        }
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((i3 & 458752) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                if ((3670016 & i3) == 0) {
                    i10 = i2;
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    i5 |= 4194304;
                }
                if (((~i4) & 144) != 0) {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i28 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i28 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                } else {
                    if ((i3 & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier;
                        }
                        if ((i4 & 4) != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = i10;
                        }
                        if (i12 != 0) {
                            mapEmptyMap = r.emptyMap();
                            i5 &= -29360129;
                        } else {
                            mapEmptyMap = map;
                        }
                        composerStartRestartGroup.endDefaults();
                        modifier4 = modifier3;
                        textStyle3 = textStyle2;
                        function3 = function2;
                        i14 = iM2920getClipgIe3tQ8;
                        i15 = i13;
                        map2 = mapEmptyMap;
                        z3 = z2;
                    }
                    int i29 = i5 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-3686930);
                    zChanged = composerStartRestartGroup.changed(annotatedString);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i29 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                    modifier2 = modifier4;
                    textStyle2 = textStyle3;
                    function2 = function3;
                    i16 = i14;
                    z4 = z3;
                    i17 = i15;
                    map3 = map2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                    public final void invoke(@Nullable Composer composer2, int i210) {
                        BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                    }
                });
            }
            i5 |= 1572864;
            i10 = i2;
            i12 = i4 & 128;
            if (i12 != 0) {
                i5 |= 4194304;
            }
            if (((~i4) & 144) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i210 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i210 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i211 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i211 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                public final void invoke(@Nullable Composer composer2, int i212) {
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                }
            });
        }
        i5 |= 196608;
        z2 = z;
        i9 = i4 & 64;
        if (i9 != 0) {
            if ((3670016 & i3) == 0) {
                i10 = i2;
                if (composerStartRestartGroup.changed(i10)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
            i12 = i4 & 128;
            if (i12 != 0) {
                i5 |= 4194304;
            }
            if (((~i4) & 144) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i212 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i212 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if ((i4 & 4) != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = i10;
                    }
                    if (i12 != 0) {
                        mapEmptyMap = r.emptyMap();
                        i5 &= -29360129;
                    } else {
                        mapEmptyMap = map;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    i14 = iM2920getClipgIe3tQ8;
                    i15 = i13;
                    map2 = mapEmptyMap;
                    z3 = z2;
                }
                int i213 = i5 & 14;
                composerStartRestartGroup.startReplaceableGroup(-3686930);
                zChanged = composerStartRestartGroup.changed(annotatedString);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                            SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i213 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
                modifier2 = modifier4;
                textStyle2 = textStyle3;
                function2 = function3;
                i16 = i14;
                z4 = z3;
                i17 = i15;
                map3 = map2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                public final void invoke(@Nullable Composer composer2, int i214) {
                    BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
                }
            });
        }
        i5 |= 1572864;
        i10 = i2;
        i12 = i4 & 128;
        if (i12 != 0) {
            i5 |= 4194304;
        }
        if (((~i4) & 144) != 0) {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i4 & 4) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if (i12 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i5 &= -29360129;
                } else {
                    mapEmptyMap = map;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                textStyle3 = textStyle2;
                function3 = function2;
                i14 = iM2920getClipgIe3tQ8;
                i15 = i13;
                map2 = mapEmptyMap;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i4 & 4) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if (i12 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i5 &= -29360129;
                } else {
                    mapEmptyMap = map;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                textStyle3 = textStyle2;
                function3 = function2;
                i14 = iM2920getClipgIe3tQ8;
                i15 = i13;
                map2 = mapEmptyMap;
                z3 = z2;
            }
            int i214 = i5 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(annotatedString);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i214 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
            modifier2 = modifier4;
            textStyle2 = textStyle3;
            function2 = function3;
            i16 = i14;
            z4 = z3;
            i17 = i15;
            map3 = map2;
        } else {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i4 & 4) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if (i12 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i5 &= -29360129;
                } else {
                    mapEmptyMap = map;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                textStyle3 = textStyle2;
                function3 = function2;
                i14 = iM2920getClipgIe3tQ8;
                i15 = i13;
                map2 = mapEmptyMap;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if ((i4 & 4) != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                    i5 &= -897;
                }
                if ((i4 & 8) != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i13 = Integer.MAX_VALUE;
                } else {
                    i13 = i10;
                }
                if (i12 != 0) {
                    mapEmptyMap = r.emptyMap();
                    i5 &= -29360129;
                } else {
                    mapEmptyMap = map;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                textStyle3 = textStyle2;
                function3 = function2;
                i14 = iM2920getClipgIe3tQ8;
                i15 = i13;
                map2 = mapEmptyMap;
                z3 = z2;
            }
            int i215 = i5 & 14;
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            zChanged = composerStartRestartGroup.changed(annotatedString);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
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
                        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, annotatedString);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoreTextKt.m416CoreText4YKlhWE(annotatedString, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null), textStyle3, z3, i14, i15, map2, function3, composerStartRestartGroup, 2129920 | i215 | (i5 & 896) | ((i5 >> 6) & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | ((i5 >> 3) & 458752) | ((i5 << 12) & 29360128), 0);
            modifier2 = modifier4;
            textStyle2 = textStyle3;
            function2 = function3;
            i16 = i14;
            z4 = z3;
            i17 = i15;
            map3 = map2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

            public final void invoke(@Nullable Composer composer2, int i216) {
                BasicTextKt.m406BasicText4YKlhWE(annotatedString, modifier2, textStyle2, function2, i16, z4, i17, map3, composer2, i3 | 1, i4);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    @Composable
    /* JADX INFO: renamed from: BasicText-BpD7jsM, reason: not valid java name */
    public static final void m407BasicTextBpD7jsM(@NotNull final String str, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1<? super TextLayoutResult, Unit> function2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        int iM2920getClipgIe3tQ8;
        int i12;
        final boolean z3;
        final Modifier modifier4;
        final int i13;
        final Function1<? super TextLayoutResult, Unit> function3;
        final int i14;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(959236272);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 == 0) {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 896) == 0) {
                if ((i4 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i16 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i5 |= i16;
                } else {
                    textStyle2 = textStyle;
                }
                i5 |= i16;
            } else {
                textStyle2 = textStyle;
            }
            if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i4 & 8) == 0) {
                    function2 = function1;
                    int i17 = composerStartRestartGroup.changed(function2) ? 2048 : 1024;
                    i5 |= i17;
                } else {
                    function2 = function1;
                }
                i5 |= i17;
            } else {
                function2 = function1;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                i5 |= 8192;
            }
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 458752) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i2;
                } else {
                    i10 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i5 |= i11;
                    }
                }
                if ((16 & (~i4)) != 0 && ((2995931 & i5) ^ 599186) == 0 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    textStyle3 = textStyle2;
                    function3 = function2;
                    z3 = z2;
                    i14 = i10;
                    i13 = i;
                } else {
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.startDefaults();
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                }
                            };
                        }
                        if (i6 != 0) {
                            iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                            i5 &= -57345;
                        } else {
                            iM2920getClipgIe3tQ8 = i;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                        composerStartRestartGroup.endDefaults();
                        i12 = i5;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipCurrentGroup();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            i5 &= -57345;
                        }
                        iM2920getClipgIe3tQ8 = i;
                        i12 = i5;
                    }
                    boolean z4 = z2;
                    int i18 = i10;
                    m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z4, i18, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
                    TextStyle textStyle4 = textStyle2;
                    z3 = z4;
                    modifier4 = modifier2;
                    i13 = iM2920getClipgIe3tQ8;
                    function3 = function2;
                    i14 = i18;
                    textStyle3 = textStyle4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
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
                        BasicTextKt.m407BasicTextBpD7jsM(str, modifier4, textStyle3, function3, i13, z3, i14, composer2, i3 | 1, i4);
                    }
                });
            }
            i5 |= 196608;
            z2 = z;
            i9 = i4 & 64;
            if (i9 != 0) {
                i5 |= 1572864;
                i10 = i2;
            } else {
                i10 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
            }
            if ((16 & (~i4)) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                }
                boolean z5 = z2;
                int i19 = i10;
                m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z5, i19, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
                TextStyle textStyle5 = textStyle2;
                z3 = z5;
                modifier4 = modifier2;
                i13 = iM2920getClipgIe3tQ8;
                function3 = function2;
                i14 = i19;
                textStyle3 = textStyle5;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                }
                boolean z6 = z2;
                int i110 = i10;
                m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z6, i110, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
                TextStyle textStyle6 = textStyle2;
                z3 = z6;
                modifier4 = modifier2;
                i13 = iM2920getClipgIe3tQ8;
                function3 = function2;
                i14 = i110;
                textStyle3 = textStyle6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
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
                    BasicTextKt.m407BasicTextBpD7jsM(str, modifier4, textStyle3, function3, i13, z3, i14, composer2, i3 | 1, i4);
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
                i5 |= i16;
            } else {
                textStyle2 = textStyle;
            }
            i5 |= i16;
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i4 & 8) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changed(function2)) {
                }
                i5 |= i17;
            } else {
                function2 = function1;
            }
            i5 |= i17;
        } else {
            function2 = function1;
        }
        i6 = i4 & 16;
        if (i6 != 0) {
            i5 |= 8192;
        }
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((i3 & 458752) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                i5 |= 1572864;
                i10 = i2;
            } else {
                i10 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
            }
            if ((16 & (~i4)) != 0) {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                }
                boolean z7 = z2;
                int i111 = i10;
                m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z7, i111, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
                TextStyle textStyle7 = textStyle2;
                z3 = z7;
                modifier4 = modifier2;
                i13 = iM2920getClipgIe3tQ8;
                function3 = function2;
                i14 = i111;
                textStyle3 = textStyle7;
            } else {
                if ((i3 & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                            }
                        };
                    }
                    if (i6 != 0) {
                        iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                        i5 &= -57345;
                    } else {
                        iM2920getClipgIe3tQ8 = i;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    composerStartRestartGroup.endDefaults();
                    i12 = i5;
                    modifier2 = modifier3;
                }
                boolean z8 = z2;
                int i112 = i10;
                m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z8, i112, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
                TextStyle textStyle8 = textStyle2;
                z3 = z8;
                modifier4 = modifier2;
                i13 = iM2920getClipgIe3tQ8;
                function3 = function2;
                i14 = i112;
                textStyle3 = textStyle8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
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
                    BasicTextKt.m407BasicTextBpD7jsM(str, modifier4, textStyle3, function3, i13, z3, i14, composer2, i3 | 1, i4);
                }
            });
        }
        i5 |= 196608;
        z2 = z;
        i9 = i4 & 64;
        if (i9 != 0) {
            i5 |= 1572864;
            i10 = i2;
        } else {
            i10 = i2;
            if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
        }
        if ((16 & (~i4)) != 0) {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i10 = Integer.MAX_VALUE;
                }
                composerStartRestartGroup.endDefaults();
                i12 = i5;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i10 = Integer.MAX_VALUE;
                }
                composerStartRestartGroup.endDefaults();
                i12 = i5;
                modifier2 = modifier3;
            }
            boolean z9 = z2;
            int i113 = i10;
            m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z9, i113, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
            TextStyle textStyle9 = textStyle2;
            z3 = z9;
            modifier4 = modifier2;
            i13 = iM2920getClipgIe3tQ8;
            function3 = function2;
            i14 = i113;
            textStyle3 = textStyle9;
        } else {
            if ((i3 & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i10 = Integer.MAX_VALUE;
                }
                composerStartRestartGroup.endDefaults();
                i12 = i5;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                        }
                    };
                }
                if (i6 != 0) {
                    iM2920getClipgIe3tQ8 = TextOverflow.INSTANCE.m2920getClipgIe3tQ8();
                    i5 &= -57345;
                } else {
                    iM2920getClipgIe3tQ8 = i;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    i10 = Integer.MAX_VALUE;
                }
                composerStartRestartGroup.endDefaults();
                i12 = i5;
                modifier2 = modifier3;
            }
            boolean z10 = z2;
            int i114 = i10;
            m406BasicText4YKlhWE(new AnnotatedString(str, null, null, 6, null), modifier2, textStyle2, function2, iM2920getClipgIe3tQ8, z10, i114, null, composerStartRestartGroup, 32768 | (i12 & 112) | (i12 & 896) | (i12 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (458752 & i12) | (i12 & 3670016), 128);
            TextStyle textStyle10 = textStyle2;
            z3 = z10;
            modifier4 = modifier2;
            i13 = iM2920getClipgIe3tQ8;
            function3 = function2;
            i14 = i114;
            textStyle3 = textStyle10;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
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
                BasicTextKt.m407BasicTextBpD7jsM(str, modifier4, textStyle3, function3, i13, z3, i14, composer2, i3 | 1, i4);
            }
        });
    }
}
