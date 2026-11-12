package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "BoxWithConstraints", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 5, 1})
public final class BoxWithConstraintsKt {
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void BoxWithConstraints(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z, @NotNull final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        Alignment alignment2;
        int i4;
        Modifier modifier2;
        Alignment topStart;
        final MeasurePolicy measurePolicyRememberBoxMeasurePolicy;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        final Alignment alignment3;
        final boolean z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(482290720);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                alignment2 = alignment;
                int i6 = composerStartRestartGroup.changed(alignment) ? 32 : 16;
                i3 |= i6;
            } else {
                alignment2 = alignment;
            }
            i3 |= i6;
        } else {
            alignment2 = alignment;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function3)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if (((i3 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        topStart = alignment2;
                    }
                    if (i7 != 0) {
                        z = false;
                    }
                    composerStartRestartGroup.endDefaults();
                    alignment2 = topStart;
                    modifier = modifier2;
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    if ((i2 & 2) != 0) {
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    }
                }
                int i8 = i3 >> 3;
                measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment2, z, composerStartRestartGroup, (i8 & 112) | (i8 & 14));
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                zChanged = composerStartRestartGroup.changed(function3) | composerStartRestartGroup.changed(measurePolicyRememberBoxMeasurePolicy);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m256invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m256invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                            final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                            Unit unit = Unit.INSTANCE;
                            final Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function4 = function3;
                            final int i9 = i3;
                            return measurePolicyRememberBoxMeasurePolicy.mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-985531317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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
                                    } else {
                                        function4.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i9 >> 6) & 112));
                                    }
                                }
                            })), j);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i3 & 14, 0);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            modifier3 = modifier;
            alignment3 = alignment2;
            z2 = z;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints.2
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
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, alignment3, z2, function3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if (composerStartRestartGroup.changed(function3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if (((i3 & 5851) ^ 1170) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    topStart = alignment2;
                }
                if (i7 != 0) {
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                alignment2 = topStart;
                modifier = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    topStart = alignment2;
                }
                if (i7 != 0) {
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                alignment2 = topStart;
                modifier = modifier2;
            }
            int i9 = i3 >> 3;
            measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment2, z, composerStartRestartGroup, (i9 & 112) | (i9 & 14));
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(function3) | composerStartRestartGroup.changed(measurePolicyRememberBoxMeasurePolicy);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m256invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m256invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        Unit unit = Unit.INSTANCE;
                        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i10 = i3;
                        return measurePolicyRememberBoxMeasurePolicy.mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-985531317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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
                                } else {
                                    function4.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i10 >> 6) & 112));
                                }
                            }
                        })), j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m256invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m256invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        Unit unit = Unit.INSTANCE;
                        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i10 = i3;
                        return measurePolicyRememberBoxMeasurePolicy.mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-985531317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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
                                } else {
                                    function4.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i10 >> 6) & 112));
                                }
                            }
                        })), j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i3 & 14, 0);
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    topStart = alignment2;
                }
                if (i7 != 0) {
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                alignment2 = topStart;
                modifier = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    topStart = alignment2;
                }
                if (i7 != 0) {
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                alignment2 = topStart;
                modifier = modifier2;
            }
            int i10 = i3 >> 3;
            measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment2, z, composerStartRestartGroup, (i10 & 112) | (i10 & 14));
            composerStartRestartGroup.startReplaceableGroup(-3686552);
            zChanged = composerStartRestartGroup.changed(function3) | composerStartRestartGroup.changed(measurePolicyRememberBoxMeasurePolicy);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m256invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m256invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        Unit unit = Unit.INSTANCE;
                        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i11 = i3;
                        return measurePolicyRememberBoxMeasurePolicy.mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-985531317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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
                                } else {
                                    function4.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i11 >> 6) & 112));
                                }
                            }
                        })), j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m256invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m256invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        Unit unit = Unit.INSTANCE;
                        final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function4 = function3;
                        final int i11 = i3;
                        return measurePolicyRememberBoxMeasurePolicy.mo6measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(unit, ComposableLambdaKt.composableLambdaInstance(-985531317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
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
                                } else {
                                    function4.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i11 >> 6) & 112));
                                }
                            }
                        })), j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i3 & 14, 0);
        }
        modifier3 = modifier;
        alignment3 = alignment2;
        z2 = z;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints.2
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
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, alignment3, z2, function3, composer2, i | 1, i2);
            }
        });
    }
}
